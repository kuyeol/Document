# Canvas (Hello Kotlin)

The following example demonstrates usage of HTML5 Canvas from Kotlin.

Here strange creatures are watching the kotlin logo. You can drag'n'drop them as well as the logo. Doubleclick to add more creatures but be careful. They may be watching you!

```kotlin
package creatures

import org.w3c.dom.*
import org.w3c.dom.events.MouseEvent
import kotlinx.browser.document
import kotlinx.browser.window
import kotlin.math.*


fun getImage(path: String): HTMLImageElement {
    val image = window.document.createElement("img") as HTMLImageElement
    image.src = path
    return image
}

val canvas = initializeCanvas()

fun initializeCanvas(): HTMLCanvasElement {
    val canvas = document.createElement("canvas") as HTMLCanvasElement
    val context = canvas.getContext("2d") as CanvasRenderingContext2D
    context.canvas.width  = window.innerWidth.toInt()
    context.canvas.height = window.innerHeight.toInt()
    document.body!!.appendChild(canvas)
    return canvas
}

val context: CanvasRenderingContext2D
    get() {
        return canvas.getContext("2d") as CanvasRenderingContext2D
    }

abstract class Shape() {

    abstract fun draw(state: CanvasState)
    // these two abstract methods defines that our shapes can be dragged
    operator abstract fun contains(mousePos: Vector): Boolean

    abstract var pos: Vector

    var selected: Boolean = false

    // a couple of helper extension methods we'll be using in the derived classes
    fun CanvasRenderingContext2D.shadowed(shadowOffset: Vector, alpha: Double, render: CanvasRenderingContext2D.() -> Unit) {
        save()
        shadowColor = "rgba(100, 100, 100, $alpha)"
        shadowBlur = 5.0
        shadowOffsetX = shadowOffset.x
        shadowOffsetY = shadowOffset.y
        render()
        restore()
    }

    fun CanvasRenderingContext2D.fillPath(constructPath: CanvasRenderingContext2D.() -> Unit) {
        beginPath()
        constructPath()
        closePath()
        fill()
    }
}

val logoImage by lazy { getImage("https://play.kotlinlang.org/assets/kotlin-logo.svg") }

val logoImageSize = v(64.0, 64.0)

val Kotlin = Logo(v(canvas.width / 2.0 - logoImageSize.x / 2.0 - 64, canvas.height / 2.0 - logoImageSize.y / 2.0 - 64))

class Logo(override var pos: Vector) : Shape() {
    val relSize: Double = 0.18
    val shadowOffset = v(-3.0, 3.0)
    var size: Vector = logoImageSize * relSize
    // get-only properties like this saves you lots of typing and are very expressive
    val position: Vector
        get() = if (selected) pos - shadowOffset else pos


    fun drawLogo(state: CanvasState) {
        if (!logoImage.complete) {
            state.changed = true
            return
        }
        
        size = logoImageSize * (state.size.x / logoImageSize.x) * relSize
        state.context.drawImage(getImage("https://play.kotlinlang.org/assets/kotlin-logo.svg"), 0.0, 0.0,
                logoImageSize.x, logoImageSize.y,
                position.x, position.y,
                size.x, size.y)
    }

    override fun draw(state: CanvasState) {
        val context = state.context
        if (selected) {
            // using helper we defined in Shape class
            context.shadowed(shadowOffset, 0.2) {
                drawLogo(state)
            }
        } else {
            drawLogo(state)
        }
    }

    override fun contains(mousePos: Vector): Boolean = mousePos.isInRect(pos, size)

    val centre: Vector
        get() = pos + size * 0.5
}

val gradientGenerator by lazy { RadialGradientGenerator(context) }

class Creature(override var pos: Vector, val state: CanvasState) : Shape() {

    val shadowOffset = v(-5.0, 5.0)
    val colorStops = gradientGenerator.getNext()
    val relSize = 0.05
    // these properties have no backing fields and in java/javascript they could be represented as little helper functions
    val radius: Double
        get() = state.width * relSize
    val position: Vector
        get() = if (selected) pos - shadowOffset else pos
    val directionToLogo: Vector
        get() = (Kotlin.centre - position).normalized

    //notice how the infix call can make some expressions extremely expressive
    override fun contains(mousePos: Vector) = pos distanceTo mousePos < radius

    // defining more nice extension functions
    fun CanvasRenderingContext2D.circlePath(position: Vector, rad: Double) {
        arc(position.x, position.y, rad, 0.0, 2 * PI, false)
    }

    //notice we can use an extension function we just defined inside another extension function
    fun CanvasRenderingContext2D.fillCircle(position: Vector, rad: Double) {
        fillPath {
            circlePath(position, rad)
        }
    }

    override fun draw(state: CanvasState) {
        val context = state.context
        if (!selected) {
            drawCreature(context)
        } else {
            drawCreatureWithShadow(context)
        }
    }

    fun drawCreature(context: CanvasRenderingContext2D) {
        context.fillStyle = getGradient(context)
        context.fillPath {
            tailPath(context)
            circlePath(position, radius)
        }
        drawEye(context)
    }

    fun getGradient(context: CanvasRenderingContext2D): CanvasGradient {
        val gradientCentre = position + directionToLogo * (radius / 4)
        val gradient = context.createRadialGradient(gradientCentre.x, gradientCentre.y, 1.0, gradientCentre.x, gradientCentre.y, 2 * radius)
        for (colorStop in colorStops) {
            gradient.addColorStop(colorStop.first, colorStop.second)
        }
        return gradient
    }

    fun tailPath(context: CanvasRenderingContext2D) {
        val tailDirection = -directionToLogo
        val tailPos = position + tailDirection * radius * 1.0
        val tailSize = radius * 1.6
        val angle = PI / 6.0
        val p1 = tailPos + tailDirection.rotatedBy(angle) * tailSize
        val p2 = tailPos + tailDirection.rotatedBy(-angle) * tailSize
        val middlePoint = position + tailDirection * radius * 1.0
        context.moveTo(tailPos.x, tailPos.y)
        context.lineTo(p1.x, p1.y)
        context.quadraticCurveTo(middlePoint.x, middlePoint.y, p2.x, p2.y)
        context.lineTo(tailPos.x, tailPos.y)
    }

    fun drawEye(context: CanvasRenderingContext2D) {
        val eyePos = directionToLogo * radius * 0.6 + position
        val eyeRadius = radius / 3
        val eyeLidRadius = eyeRadius / 2
        context.fillStyle = "#FFFFFF"
        context.fillCircle(eyePos, eyeRadius)
        context.fillStyle = "#000000"
        context.fillCircle(eyePos, eyeLidRadius)
    }

    fun drawCreatureWithShadow(context: CanvasRenderingContext2D) {
        context.shadowed(shadowOffset, 0.7) {
            context.fillStyle = getGradient(context)
            fillPath {
                tailPath(context)
                context.circlePath(position, radius)
            }
        }
        drawEye(context)
    }
}

class CanvasState(val canvas: HTMLCanvasElement) {
    var width = canvas.width
    var height = canvas.height
    val size: Vector
        get() = v(width.toDouble(), height.toDouble())
    val context = creatures.context
    var changed = true
    var shapes = mutableListOf<Shape>()
    var selection: Shape? = null
    var dragOff = Vector()
    val interval = 1000 / 30

    init {
        canvas.onmousedown = { e: MouseEvent ->
            changed = true
            selection = null
            val mousePos = mousePos(e)
            for (shape in shapes) {
                if (mousePos in shape) {
                    dragOff = mousePos - shape.pos
                    shape.selected = true
                    selection = shape
                    break
                }
            }
        }

        canvas.onmousemove = { e: MouseEvent ->
            if (selection != null) {
                selection!!.pos = mousePos(e) - dragOff
                changed = true
            }
        }

        canvas.onmouseup = { e: MouseEvent ->
            if (selection != null) {
                selection!!.selected = false
            }
            selection = null
            changed = true
            this
        }

        canvas.ondblclick = { e: MouseEvent ->
            val newCreature = Creature(mousePos(e), this@CanvasState)
            addShape(newCreature)
            changed = true
            this
        }

        window.setInterval({
            draw()
        }, interval)
    }

    fun mousePos(e: MouseEvent): Vector {
        var offset = Vector()
        var element: HTMLElement? = canvas
        while (element != null) {
            val el: HTMLElement = element
            offset += Vector(el.offsetLeft.toDouble(), el.offsetTop.toDouble())
            element = el.offsetParent as HTMLElement?
        }
        return Vector(e.pageX, e.pageY) - offset
    }

    fun addShape(shape: Shape) {
        shapes.add(shape)
        changed = true
    }

    fun clear() {
        context.fillStyle = "#D0D0D0"
        context.fillRect(0.0, 0.0, width.toDouble(), height.toDouble())
        context.strokeStyle = "#000000"
        context.lineWidth = 4.0
        context.strokeRect(0.0, 0.0, width.toDouble(), height.toDouble())
    }

    fun draw() {
        if (!changed) return
        
        changed = false
        
        clear()
        for (shape in shapes.asReversed()) {
            shape.draw(this)
        }
        Kotlin.draw(this)
    }
}

class RadialGradientGenerator(val context: CanvasRenderingContext2D) {
    val gradients = mutableListOf<Array<out Pair<Double, String>>>()
    var current = 0

    fun newColorStops(vararg colorStops: Pair<Double, String>) {
        gradients.add(colorStops)
    }

    init {
        newColorStops(Pair(0.0, "#F59898"), Pair(0.5, "#F57373"), Pair(1.0, "#DB6B6B"))
        newColorStops(Pair(0.39, "rgb(140,167,209)"), Pair(0.7, "rgb(104,139,209)"), Pair(0.85, "rgb(67,122,217)"))
        newColorStops(Pair(0.0, "rgb(255,222,255)"), Pair(0.5, "rgb(255,185,222)"), Pair(1.0, "rgb(230,154,185)"))
        newColorStops(Pair(0.0, "rgb(255,209,114)"), Pair(0.5, "rgb(255,174,81)"), Pair(1.0, "rgb(241,145,54)"))
        newColorStops(Pair(0.0, "rgb(132,240,135)"), Pair(0.5, "rgb(91,240,96)"), Pair(1.0, "rgb(27,245,41)"))
        newColorStops(Pair(0.0, "rgb(250,147,250)"), Pair(0.5, "rgb(255,80,255)"), Pair(1.0, "rgb(250,0,217)"))
    }

    fun getNext(): Array<out Pair<Double, String>> {
        val result = gradients.get(current)
        current = (current + 1) % gradients.size
        return result
    }
}

fun v(x: Double, y: Double) = Vector(x, y)

class Vector(val x: Double = 0.0, val y: Double = 0.0) {
    operator fun plus(v: Vector) = v(x + v.x, y + v.y)
    operator fun unaryMinus() = v(-x, -y)
    operator fun minus(v: Vector) = v(x - v.x, y - v.y)
    operator fun times(koef: Double) = v(x * koef, y * koef)
    infix fun distanceTo(v: Vector) = sqrt((this - v).sqr)
    fun rotatedBy(theta: Double): Vector {
        val sin = sin(theta)
        val cos = cos(theta)
        return v(x * cos - y * sin, x * sin + y * cos)
    }

    fun isInRect(topLeft: Vector, size: Vector) = (x >= topLeft.x) && (x <= topLeft.x + size.x) &&
            (y >= topLeft.y) && (y <= topLeft.y + size.y)

    val sqr: Double
        get() = x * x + y * y
    val normalized: Vector
        get() = this * (1.0 / sqrt(sqr))
}

fun main(args: Array<String>) {
//sampleStart
    CanvasState(canvas).apply {
        addShape(Kotlin)
        addShape(Creature(size * 0.25, this))
        addShape(Creature(size * 0.75, this))
    }
//sampleEnd
}
```
