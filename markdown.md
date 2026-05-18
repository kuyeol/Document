14
Part I
Theory

1
The Wave Function
*
15

# 1.1 The Schrödinger Equation

Imagine a particle of mass $m$, constrained to move along the $x$ axis, subject to some specified force $F(x,t)$ (Figure 1.1). The program of classical mechanics is to determine the position of the particle at any given time: $x(t)$. Once we know that, we can figure out the velocity $(v = dx/dt)$, the momentum $(p = mv)$, the kinetic energy $\left(T = (1/2)mv^2\right)$, or any other dynamical variable of interest. And how do we go about determining $x(t)$? We apply Newton's second law: $F = ma$. (For conservative systems—the only kind we shall consider, and, fortunately, the only kind that occur at the microscopic level—the force can be expressed as the derivative of a potential energy function, $F = -\partial V / \partial x$, and Newton's law reads $m d^2 x / dt^2 = -\partial V / \partial x$.) This, together with appropriate initial conditions (typically the position and velocity at $t = 0$), determines $x(t)$.

![img-0.jpeg](img-0.jpeg)
Figure 1.1: A "particle" constrained to move in one dimension under the influence of a specified force.

Quantum mechanics approaches this same problem quite differently. In this case what we're looking for is the particle's wave function, $\Psi (x,t)$, and we get it by solving the Schrödinger equation:

$i \hbar \frac {\partial \Psi}{\partial t} = - \frac {\hbar^ {2}}{2 m} \frac {\partial^ {2} \Psi}{\partial x ^ {2}} + V \Psi . \tag {1.1}$

Here $i$ is the square root of $-1$, and $\hbar$ is Planck's constant—or rather, his original constant $(b)$ divided by $2\pi$:

$\hbar = \frac {h}{2 \pi} = 1.054573 \times 10^{-34} \mathrm{J\,s}. \tag {1.2}$

The Schrödinger equation plays a role logically analogous to Newton's second law: Given suitable initial conditions (typically, $\Psi(x,0)$), the Schrödinger equation determines $\Psi(x,t)$ for all future time, just as, in classical mechanics, Newton's law determines $x(t)$ for all future time.²

16

# 1.2 The Statistical Interpretation

But what exactly is this "wave function," and what does it do for you once you've got it? After all, a particle, by its nature, is localized at a point, whereas the wave function (as its name suggests) is spread out in space (it's a function of  $x$ , for any given  $t$ ). How can such an object represent the state of a particle? The answer is provided by Born's statistical interpretation, which says that  $|\Psi(x,t)|^2$  gives the probability of finding the particle at point  $x$ , at time  $t$  or, more precisely,

(1.3)

![img-1.jpeg](img-1.jpeg)

Probability is the area under the graph of  $|\Psi|^2$ . For the wave function in Figure 1.2, you would be quite likely to find the particle in the vicinity of point  $A$ , where  $|\Psi|^2$  is large, and relatively unlikely to find it near point  $B$ .

![img-2.jpeg](img-2.jpeg)
Figure 1.2: A typical wave function. The shaded area represents the probability of finding the particle between  $a$  and  $b$ . The particle would be relatively likely to be found near  $A$ , and unlikely to be found near  $B$ .

The statistical interpretation introduces a kind of indeterminacy into quantum mechanics, for even if you know everything the theory has to tell you about the particle (to wit: its wave function), still you cannot predict with certainty the outcome of a simple experiment to measure its position—all quantum mechanics has to offer is statistical information about the possible results. This indeterminacy has been profoundly disturbing to physicists and philosophers alike, and it is natural to wonder whether it is a fact of nature, or a defect in the theory.

Suppose I do measure the position of the particle, and I find it to be at point  $C$ . Question: Where was the particle just before I made the measurement? There are three plausible answers to this question, and they serve to characterize the main schools of thought regarding quantum indeterminacy:

1. The realist position: The particle was at  $C$ . This certainly seems reasonable, and it is the response Einstein advocated. Note, however, that if this is true then quantum mechanics is an incomplete theory, since the particle really was at  $C$ , and yet quantum mechanics was unable to tell us so. To the realist, indeterminacy is not a fact of nature, but a reflection of our ignorance. As d'Espagnat put it, "the position of the particle was never indeterminate, but was merely unknown to the experimenter."5 Evidently if it is not the whole story—some additional information (known as a hidden variable) is needed to provide a complete description of the particle.
2. The orthodox position: The particle wasn't really anywhere. It was the act of measurement that forced it to "take a stand" (though how and why it decided on the point  $C$  we dare not ask). Jordan said it most starkly: "Observations not only disturb what is to be measured, they produce it ... We compel [the particle] to assume a definite position." This view (the so-called Copenhagen interpretation), is associated with Bohr and his followers. Among physicists it has always been the most widely accepted position. Note, however, that if it is correct there is something very peculiar about the act of measurement—something that almost a century of debate has done precious little to illuminate.

3. The agnostic position: Refuse to answer. This is not quite as silly as it sounds—after all, what sense can there be in making assertions about the status of a particle before a measurement, when the only way of knowing whether you were right is precisely to make a measurement, in which case what you get is no longer "before the measurement"? It is metaphysics (in the pejorative sense of the word) to worry about something that cannot, by its nature, be tested. Pauli said: "One should no more rack one's brain about the problem of whether something one cannot know anything about exists all the same, than about the ancient question of how many angels are able to sit on the point of a needle." For decades this was the "fall-back" position of most physicists: they'd try to sell you the orthodox answer, but if you were persistent they'd retreat to the agnostic response, and terminate the conversation.

Until fairly recently, all three positions (realist, orthodox, and agnostic) had their partisans. But in 1964 John Bell astonished the physics community by showing that it makes an observable difference whether the particle had a precise (though unknown) position prior to the measurement, or not. Bell's discovery effectively eliminated agnosticism as a viable option, and made it an experimental question whether 1 or 2 is the correct choice. I'll return to this story at the end of the book, when you will be in a better position to appreciate Bell's argument; for now, suffice it to say that the experiments have decisively confirmed the orthodox interpretation: a particle simply does not have a precise position prior to measurement, any more than the ripples on a pond do; it is the measurement process that insists on one particular number, and thereby in a sense creates the specific result, limited only by the statistical weighting imposed by the wave function.

What if I made a second measurement, immediately after the first? Would I get  $C$  again, or does the act of measurement cough up some completely new number each time? On this question everyone is in agreement: A repeated measurement (on the same particle) must return the same value. Indeed, it would be tough to prove that the particle was really found at  $C$  in the first instance, if this could not be confirmed by immediate repetition of the measurement. How does the orthodox interpretation account for the fact that the second measurement is bound to yield the value  $C$ ? It must be that the first measurement radically alters the wave function, so that it is now sharply peaked about  $C$  (Figure 1.3). We say that the wave function collapses, upon measurement, to a spike at the point  $C$  (it soon spreads out again, in accordance with the Schrödinger equation, so the second measurement must be made quickly). There are, then, two entirely distinct kinds of physical processes: "ordinary" ones, in which the wave function evolves in a leisurely fashion under the Schrödinger equation, and "measurements," in which  $\Psi$  suddenly and discontinuously collapses.[9]

![img-3.jpeg](img-3.jpeg)
Figure 1.3: Collapse of the wave function: graph of  $|\Psi|^2$  immediately after a measurement has found the particle at point  $C$ .

# Example 1.1

Electron Interference. I have asserted that particles (electrons, for example) have a wave nature, encoded in  $\Psi$ . How might we check this, in the laboratory?

The classic signature of a wave phenomenon is interference: two waves in phase interfere constructively, and out of phase they interfere destructively. The wave nature of light was confirmed in

1801 by Young's famous double-slit experiment, showing interference "fringes" on a distant screen when a monochromatic beam passes through two slits. If essentially the same experiment is done with electrons, the same pattern develops,[10] confirming the wave nature of electrons.

Now suppose we decrease the intensity of the electron beam, until only one electron is present in the apparatus at any particular time. According to the statistical interpretation each electron will produce a spot on the screen. Quantum mechanics cannot predict the precise location of that spot—all it can tell us is the probability of a given electron landing at a particular place. But if we are patient, and wait for a hundred thousand electrons—one at a time—to make the trip, the accumulating spots reveal the classic two-slit interference pattern (Figure 1.4). 11

![img-4.jpeg](img-4.jpeg)

![img-5.jpeg](img-5.jpeg)

![img-6.jpeg](img-6.jpeg)
Figure 1.4: Build-up of the electron interference pattern. (a) Eight electrons, (b) 270 electrons, (c) 2000 electrons, (d) 160,000 electrons. Reprinted courtesy of the Central Research Laboratory, Hitachi, Ltd., Japan.

![img-7.jpeg](img-7.jpeg)

Of course, if you close off one slit, or somehow contrive to detect which slit each electron passes through, the interference pattern disappears; the wave function of the emerging particle is now entirely different (in the first case because the boundary conditions for the Schrödinger equation have been changed, and in the second because of the collapse of the wave function upon measurement). But with both slits open, and no interruption of the electron in flight, each electron interferes with itself; it didn't pass through one slit or the other, but through both at once, just as a water wave, impinging on a jetty with two openings, interferes with itself. There is nothing mysterious about this, once you have accepted the notion that particles obey a wave equation. The truly astonishing thing is the blip-by-blip assembly of the pattern. In any classical wave theory the pattern would develop smoothly and continuously, simply getting more intense as time goes on. The quantum process is more like the pointillist painting of Seurat: The picture emerges from the cumulative contributions of all the individual dots.[12]

20

21
## 1.3 Probability

# 1.3.1 Discrete Variables

Because of the statistical interpretation, probability plays a central role in quantum mechanics, so I digress now for a brief discussion of probability theory. It is mainly a question of introducing some notation and terminology, and I shall do it in the context of a simple example.

Imagine a room containing fourteen people, whose ages are as follows:

one person aged 14,

one person aged 15,

three people aged 16,

two people aged 22,

two people aged 24,

five people aged 25.

If we let  $N(j)$  represent the number of people of age  $j$ , then

$N(14) = 1$

$N(15) = 1$

$N(16) = 3$

$N(22) = 2$

$N(24) = 2$

$N(25) = 5$

while  $N(17)$ , for instance, is zero. The total number of people in the room is

(1.4)

$N = \sum_{j=0}^{\infty} N(j)$ .

(In the example, of course,  $N = 14$ .) Figure 1.5 is a histogram of the data. The following are some questions one might ask about this distribution.

![img-8.jpeg](img-8.jpeg)
Figure 1.5: Histogram showing the number of people,  $N(j)$ , with age  $j$ , for the example in Section 1.3.1.

Question 1 If you selected one individual at random from this group, what is the probability that this person's age would be 15?

Answer One chance in 14, since there are 14 possible choices, all equally likely, of whom only one has that particular age. If  $P(j)$  is the probability of getting age  $j$ , then  $P(14) = 1/14$ ,  $P(15) = 1/14$ ,  $P(16) = 3/14$ , and so on. In general,

$$
P(j) = \frac{N(j)}{N}. \tag{1.5}
$$

Notice that the probability of getting either 14 or 15 is the sum of the individual probabilities (in this case, 1/7). In particular, the sum of all the probabilities is 1—the person you select must have some age:

$$
\sum_{j=0}^{\infty} P(j) = 1. \tag{1.6}
$$

**Question 2** What is the most probable age?

Answer 25, obviously; five people share this age, whereas at most three have any other age. The most probable $j$ is the $j$ for which $P(j)$ is a maximum.

**Question 3** What is the median age?

Answer 23, for 7 people are younger than 23, and 7 are older. (The median is that value of $j$ such that the probability of getting a larger result is the same as the probability of getting a smaller result.)

**Question 4** What is the average (or mean) age?

Answer

$$
\frac{(14) + (15) + 3(16) + 2(22) + 2(24) + 5(25)}{14} = \frac{294}{14} = 21.
$$

In general, the average value of $j$ (which we shall write thus: $\langle j \rangle$) is

$$
\langle j \rangle = \frac{\sum j N(j)}{N} = \sum_{j=0}^{\infty} j P(j). \tag{1.7}
$$

Notice that there need not be anyone with the average age or the median age—in this example nobody happens to be 21 or 23. In quantum mechanics the average is usually the quantity of interest; in that context it has come to be called the expectation value. It's a misleading term, since it suggests that this is the outcome you would be most likely to get if you made a single measurement (that would be the most probable value, not the average value)—but I'm afraid we're stuck with it.

**Question 5** What is the average of the squares of the ages?

Answer You could get $14^2 = 196$, with probability 1/14, or $15^2 = 225$, with probability 1/14, or $16^2 = 256$, with probability 3/14, and so on. The average, then, is

$$
\langle j^2 \rangle = \sum_{j=0}^{\infty} j^2 P(j). \tag{1.8}
$$

In general, the average value of some function of $j$ is given by

$$
\langle f(j) \rangle = \sum_{j=0}^{\infty} f(j) P(j). \tag{1.9}
$$

(Equations 1.6, 1.7, and 1.8 are, if you like, special cases of this formula.) Beware: The average of the squares, $\langle j^2 \rangle$, is not equal, in general, to the square of the average, $\langle j \rangle^2$. For instance, if the room contains just two babies, aged 1 and 3, then $\langle j^2 \rangle = 5$, but $\langle j \rangle^2 = 4$.

23

Now, there is a conspicuous difference between the two histograms in Figure 1.6, even though they have the same median, the same average, the same most probable value, and the same number of elements: The first is sharply peaked about the average value, whereas the second is broad and flat. (The first might represent the age profile for students in a big-city classroom, the second, perhaps, a rural one-room schoolhouse.) We need a numerical measure of the amount of "spread" in a distribution, with respect to the average. The most obvious way to do this would be to find out how far each individual is from the average,

$$
\Delta j = j - \langle j \rangle , \tag {1.10}
$$

and compute the average of  $\Delta j$ . Trouble is, of course, that you get zero:

$$
\begin{array}{l} \langle \Delta j \rangle = \sum (j - \langle j \rangle) P (j) = \sum j P (j) - \langle j \rangle \sum P (j) \\ = \langle j \rangle - \langle j \rangle = 0. \\ \end{array}
$$

(Note that  $\langle j\rangle$  is constant—it does not change as you go from one member of the sample to another—so it can be taken outside the summation.) To avoid this irritating problem you might decide to average the absolute value of  $\Delta j$ . But absolute values are nasty to work with; instead, we get around the sign problem by squaring before averaging:

$$
\sigma^ {2} \equiv \left\langle (\Delta j) ^ {2} \right\rangle . \tag {1.11}
$$

This quantity is known as the variance of the distribution;  $\sigma$  itself (the square root of the average of the square of the deviation from the average—gulp!) is called the standard deviation. The latter is the customary measure of the spread about  $\langle j\rangle$ .

![img-9.jpeg](img-9.jpeg)
Figure 1.6: Two histograms with the same median, same average, and same most probable value, but different standard deviations.

![img-10.jpeg](img-10.jpeg)

There is a useful little theorem on variances:

$$
\begin{array}{l} \sigma^ {2} = \left\langle (\Delta j) ^ {2} \right\rangle = \sum (\Delta j) ^ {2} P (j) = \sum (j - \langle j \rangle) ^ {2} P (j) \\ = \sum \left(j ^ {2} - 2 j \langle j \rangle + \langle j \rangle^ {2}\right) P (j) \\ = \sum j ^ {2} P (j) - 2 \langle j \rangle \sum j P (j) + \langle j \rangle^ {2} \sum P (j) \\ = \langle j ^ {2} \rangle - 2 \langle j \rangle \langle j \rangle + \langle j \rangle^ {2} = \langle j ^ {2} \rangle - \langle j \rangle^ {2}. \\ \end{array}
$$

Taking the square root, the standard deviation itself can be written as

$$
\sigma = \sqrt {\left(j ^ {2}\right) - \left(j\right) ^ {2}}. \tag {1.12}
$$

In practice, this is a much faster way to get  $\sigma$  than by direct application of Equation 1.11: simply calculate  $\left(j^{2}\right)$  and  $(j)^{2}$ , subtract, and take the square root. Incidentally, I warned you a moment ago that  $\left(j^{2}\right)$  is not, in general, equal to  $(j)^{2}$ . Since  $\sigma^{2}$  is plainly non-negative (from its definition 1.11), Equation 1.12 implies that

$$
(j ^ {2}) \geq (j) ^ {2}, \tag {1.13}
$$

and the two are equal only when  $\sigma = 0$ , which is to say, for distributions with no spread at all (every member having the same value).

25

26

## 1.3.2 Continuous Variables

So far, I have assumed that we are dealing with a discrete variable—that is, one that can take on only certain isolated values (in the example, $j$ had to be an integer, since I gave ages only in years). But it is simple enough to generalize to continuous distributions. If I select a random person off the street, the probability that her age is precisely 16 years, 4 hours, 27 minutes, and 3.333... seconds is zero. The only sensible thing to speak about is the probability that her age lies in some interval—say, between 16 and 17. If the interval is sufficiently short, this probability is proportional to the length of the interval. For example, the chance that her age is between 16 and 16 plus two days is presumably twice the probability that it is between 16 and 16 plus one day. (Unless, I suppose, there was some extraordinary baby boom 16 years ago, on exactly that day—in which case we have simply chosen an interval too long for the rule to apply. If the baby boom lasted six hours, we'll take intervals of a second or less, to be on the safe side. Technically, we're talking about infinitesimal intervals.) Thus

$$
\left\{ \begin{array}{l} \text{probability that an individual (chosen} \\ \text{at random) lies between } x \text{ and } (x + dx) \end{array} \right\} = \rho(x) dx. \tag{1.14}
$$

The proportionality factor, $\rho(x)$, is often loosely called "the probability of getting $x$," but this is sloppy language; a better term is probability density. The probability that $x$ lies between $a$ and $b$ (a finite interval) is given by the integral of $\rho(x)$:

$$
P_{ab} = \int_{a}^{b} \rho(x) dx, \tag{1.15}
$$

and the rules we deduced for discrete distributions translate in the obvious way:

$$
\int_{-\infty}^{+\infty} \rho(x) dx = 1, \tag{1.16}
$$

$$
\langle x \rangle = \int_{-\infty}^{+\infty} x \rho(x) dx, \tag{1.17}
$$

$$
\langle f(x) \rangle = \int_{-\infty}^{+\infty} f(x) \rho(x) dx, \tag{1.18}
$$

$$
\sigma^{2} \equiv \left\langle (\Delta x)^{2} \right\rangle = \left\langle x^{2} \right\rangle - \langle x \rangle^{2}. \tag{1.19}
$$

---

**Example 1.2**

Suppose someone drops a rock off a cliff of height $b$. As it falls, I snap a million photographs, at random intervals. On each picture I measure the distance the rock has fallen. *Question:* What is the average of all these distances? That is to say, what is the time average of the distance traveled?¹³

*Solution:* The rock starts out at rest, and picks up speed as it falls; it spends more time near the top, so the average distance will surely be less than $h/2$. Ignoring air resistance, the distance $x$ at time $t$ is

$$
x(t) = \frac{1}{2} g t^{2}.
$$

The velocity is  $dx / dt = gt$ , and the total flight time is  $T = \sqrt{2h / g}$ . The probability that a particular photograph was taken between  $t$  and  $t + dt$  is  $dt / T$ , so the probability that it shows a distance in the corresponding range  $x$  to  $x + dx$  is

$$
\frac {d t}{T} = \frac {d x}{g t} \sqrt {\frac {g}{2 h}} = \frac {1}{2 \sqrt {h x}} d x.
$$

Thus the probability density (Equation 1.14) is

$$
\rho (x) = \frac {1}{2 \sqrt {h x}}, \quad (0 \leq x \leq h)
$$

(outside this range, of course, the probability density is zero).

We can check this result, using Equation 1.16:

$$
\int_ {0} ^ {h} \frac {1}{2 \sqrt {h x}} d x = \frac {1}{2 \sqrt {h}} \left(2 x ^ {1 / 2}\right) \Bigg | _ {0} ^ {h} = 1.
$$

The average distance (Equation 1.17) is

$$
\langle x \rangle = \int_ {0} ^ {h} x \frac {1}{2 \sqrt {h x}} d x = \frac {1}{2 \sqrt {h}} \left(\frac {2}{3} x ^ {3 / 2}\right) \Bigg | _ {0} ^ {h} = \frac {h}{3},
$$

which is somewhat less than  $h / 2$ , as anticipated.

Figure 1.7 shows the graph of  $\rho(x)$ . Notice that a probability density can be infinite, though probability itself (the integral of  $\rho$ ) must of course be finite (indeed, less than or equal to 1).

![img-11.jpeg](img-11.jpeg)
Figure 1.7: The probability density in Example 1.2:  $\rho(x) = 1 / (2\sqrt{hx})$ .

Problem 1.1 For the distribution of ages in the example in Section 1.3.1:

(a) Compute  $\langle j^2\rangle$  and  $\langle j\rangle^2$
(b) Determine  $\Delta j$  for each  $j$ , and use Equation 1.11 to compute the standard deviation.
(c) Use your results in (a) and (b) to check Equation 1.12.

28

Problem 1.2

(a) Find the standard deviation of the distribution in Example 1.2.
(b) What is the probability that a photograph, selected at random, would show a distance $x$ more than one standard deviation away from the average?

Problem 1.3 Consider the gaussian distribution

$$
\rho(x) = A e^{-\lambda (x - a)^2},
$$

where $A$, $a$, and $\lambda$ are positive real constants. (The necessary integrals are inside the back cover.)

(a) Use Equation 1.16 to determine $A$.
(b) Find $\langle x\rangle, \langle x^2\rangle$, and $\sigma$.
(c) Sketch the graph of $\rho(x)$.

29

# 1.4 Normalization

We return now to the statistical interpretation of the wave function (Equation 1.3), which says that  $|\Psi(x,t)|^2$  is the probability density for finding the particle at point  $x$ , at time  $t$ . It follows (Equation 1.16) that the integral of  $|\Psi|^2$  over all  $x$  must be 1 (the particle's got to be somewhere):

$$
\int_ {- \infty} ^ {+ \infty} | \Psi (x, t) | ^ {2} d x = 1. \tag {1.20}
$$

Without this, the statistical interpretation would be nonsense.

However, this requirement should disturb you: After all, the wave function is supposed to be determined by the Schrödinger equation—we can't go imposing an extraneous condition on  $\Psi$  without checking that the two are consistent. Well, a glance at Equation 1.1 reveals that if  $\Psi(x,t)$  is a solution, so too is  $A\Psi(x,t)$ , where  $A$  is any (complex) constant. What we must do, then, is pick this undetermined multiplicative factor so as to ensure that Equation 1.20 is satisfied. This process is called normalizing the wave function. For some solutions to the Schrödinger equation the integral is infinite; in that case no multiplicative factor is going to make it 1. The same goes for the trivial solution  $\Psi = 0$ . Such non-normalizable solutions cannot represent particles, and must be rejected. Physically realizable states correspond to the square-integrable solutions to Schrödinger's equation.[14]

But wait a minute! Suppose I have normalized the wave function at time  $t = 0$ . How do I know that it will stay normalized, as time goes on, and  $\Psi$  evolves? (You can't keep renormalizing the wave function, for then  $A$  becomes a function of  $t$ , and you no longer have a solution to the Schrödinger equation.) Fortunately, the Schrödinger equation has the remarkable property that it automatically preserves the normalization of the wave function—without this crucial feature the Schrödinger equation would be incompatible with the statistical interpretation, and the whole theory would crumble.

This is important, so we'd better pause for a careful proof. To begin with,

$$
\frac {d}{d t} \int_ {- \infty} ^ {+ \infty} | \Psi (x, t) | ^ {2} d x = \int_ {- \infty} ^ {+ \infty} \frac {\partial}{\partial t} | \Psi (x, t) | ^ {2} d x. \tag {1.21}
$$

(Note that the integral is a function only of  $t$ , so I use a total derivative  $(d / dt)$  on the left, but the integrand is a function of  $x$  as well as  $t$ , so it's a partial derivative  $(\partial / \partial t)$  on the right.) By the product rule,

$$
\frac {\partial}{\partial t} | \Psi | ^ {2} = \frac {\partial}{\partial t} (\Psi^ {*} \Psi) = \Psi^ {*} \frac {\partial \Psi}{\partial t} + \frac {\partial \Psi^ {*}}{\partial t} \Psi . \tag {1.22}
$$

Now the Schrödinger equation says that

$$
\frac {\partial \Psi}{\partial t} = \frac {i \hbar}{2 m} \frac {\partial^ {2} \Psi}{\partial x ^ {2}} - \frac {i}{\hbar} V \Psi , \tag {1.23}
$$

and hence also (taking the complex conjugate of Equation 1.23)

$$
\frac {\partial \Psi^ {*}}{\partial t} = - \frac {i \hbar}{2 m} \frac {\partial^ {2} \Psi^ {*}}{\partial x ^ {2}} + \frac {i}{\hbar} V \Psi^ {*}, \tag {1.24}
$$

so

$$
\frac {\partial}{\partial t} | \Psi | ^ {2} = \frac {i \hbar}{2 m} \left(\Psi^ {*} \frac {\partial^ {2} \Psi}{\partial x ^ {2}} - \frac {\partial^ {2} \Psi^ {*}}{\partial x ^ {2}} \Psi\right) = \frac {\partial}{\partial x} \left[ \frac {i \hbar}{2 m} \left(\Psi^ {*} \frac {\partial \Psi}{\partial x} - \frac {\partial \Psi^ {*}}{\partial x} \Psi\right) \right]. \tag {1.25}
$$

The integral in Equation 1.21 can now be evaluated explicitly:

$$
\frac {d}{d t} \int_ {- \infty} ^ {+ \infty} | \Psi (x, t) | ^ {2} d x = \frac {i \hbar}{2 m} \left(\Psi^ {*} \frac {\partial \Psi}{\partial x} - \frac {\partial \Psi^ {*}}{\partial x} \Psi\right) \Bigg | _ {- \infty} ^ {+ \infty}. \tag {1.26}
$$

But  $\Psi(x, t)$  must go to zero as  $x$  goes to  $(\pm)$  infinity—otherwise the wave function would not be normalizable.[15] It follows that

$$
\frac {d}{d t} \int_ {- \infty} ^ {+ \infty} | \Psi (x, t) | ^ {2} d x = 0, \tag {1.27}
$$

and hence that the integral is constant (independent of time); if  $\Psi$  is normalized at  $t = 0$ , it stays normalized for all future time. QED

Problem 1.4 At time  $t = 0$  a particle is represented by the wave function

$$
\Psi (x, 0) = \left\{ \begin{array}{l l} A (x / a), &amp; 0 \leq x \leq a, \\ A (b - x) / (b - a), &amp; a \leq x \leq b, \\ 0, &amp; \text {otherwise}, \end{array} \right.
$$

where  $A, a,$  and  $b$  are (positive) constants.

(a)Normalize  $\Psi$  (that is, find  $A$ , in terms of  $a$  and  $b$ ).
(b) Sketch  $\Psi (x,0)$  , as a function of  $x$
(c) Where is the particle most likely to be found, at  $t = 0$ ?
(d) What is the probability of finding the particle to the left of  $a$ ? Check your result in the limiting cases  $b = a$  and  $b = 2a$ .
(e) What is the expectation value of  $x$ ?

Problem 1.5 Consider the wave function

$$
\Psi (x, t) = A e ^ {- \lambda | x |} e ^ {- i \omega t},
$$

where  $A, \lambda,$  and  $\omega$  are positive real constants. (We'll see in Chapter 2 for what potential  $(V)$  this wave function satisfies the Schrödinger equation.)

(a)Normalize  $\Psi$
(b) Determine the expectation values of  $x$  and  $x^2$ .
(c) Find the standard deviation of  $x$ . Sketch the graph of  $|\Psi|^2$ , as a function of  $x$ , and mark the points  $(\langle x \rangle + \sigma)$  and  $(\langle x \rangle - \sigma)$ , to illustrate the sense in which  $\sigma$  represents the "spread" in  $x$ . What is the probability that the particle would be found outside this range?

31

32

# 1.5 Momentum

For a particle in state $\Psi$, the expectation value of $x$ is

$$
\langle x \rangle = \int_{-\infty}^{+\infty} x \, |\Psi(x,t)|^2 \, dx. \tag{1.28}
$$

What exactly does this mean? It emphatically does not mean that if you measure the position of one particle over and over again, $\int x \, |\Psi|^2 \, dx$ is the average of the results you'll get. On the contrary: The first measurement (whose outcome is indeterminate) will collapse the wave function to a spike at the value actually obtained, and the subsequent measurements (if they're performed quickly) will simply repeat that same result. Rather, $\langle x \rangle$ is the average of measurements performed on particles all in the state $\Psi$, which means that either you must find some way of returning the particle to its original state after each measurement, or else you have to prepare a whole ensemble of particles, each in the same state $\Psi$, and measure the positions of all of them: $\langle x \rangle$ is the average of these results. I like to picture a row of bottles on a shelf, each containing a particle in the state $\Psi$ (relative to the center of the bottle). A graduate student with a ruler is assigned to each bottle, and at a signal they all measure the positions of their respective particles. We then construct a histogram of the results, which should match $|\Psi|^2$, and compute the average, which should agree with $\langle x \rangle$. (Of course, since we're only using a finite sample, we can't expect perfect agreement, but the more bottles we use, the closer we ought to come.) In short, the expectation value is the average of measurements on an ensemble of identically-prepared systems, not the average of repeated measurements on one and the same system.

Now, as time goes on, $\langle x \rangle$ will change (because of the time dependence of $\Psi$), and we might be interested in knowing how fast it moves. Referring to Equations 1.25 and 1.28, we see that$^{16}$

$$
\frac{d \langle x \rangle}{dt} = \int x \frac{\partial}{\partial t} |\Psi|^2 \, dx = \frac{i\hbar}{2m} \int x \frac{\partial}{\partial x} \left( \Psi^* \frac{\partial \Psi}{\partial x} - \frac{\partial \Psi^*}{\partial x} \Psi \right) dx. \tag{1.29}
$$

This expression can be simplified using integration-by-parts:$^{17}$

$$
\frac{d \langle x \rangle}{dt} = - \frac{i\hbar}{2m} \int \left( \Psi^* \frac{\partial \Psi}{\partial x} - \frac{\partial \Psi^*}{\partial x} \Psi \right) dx. \tag{1.30}
$$

(I used the fact that $\partial x / \partial x = 1$, and threw away the boundary term, on the ground that $\Psi$ goes to zero at $(\pm)$ infinity.) Performing another integration-by-parts, on the second term, we conclude:

$$
\frac{d \langle x \rangle}{dt} = - \frac{i\hbar}{m} \int \Psi^* \frac{\partial \Psi}{\partial x} dx. \tag{1.31}
$$

What are we to make of this result? Note that we're talking about the "velocity" of the expectation value of $x$, which is not the same thing as the velocity of the particle. Nothing we have seen so far would enable us to calculate the velocity of a particle. It's not even clear what velocity means in quantum mechanics: If the particle doesn't have a determinate position (prior to measurement), neither does it have a well-defined velocity. All we could reasonably ask for is the probability of getting a particular value. We'll see in Chapter 3 how to construct the probability density for velocity, given $\Psi$; for the moment it will suffice to postulate that the expectation value of the velocity is equal to the time derivative of the expectation value of position:

$$
\langle v \rangle = \frac {d \langle x \rangle}{d t}. \tag {1.32}
$$

Equation 1.31 tells us, then, how to calculate $\langle v\rangle$ directly from $\Psi$.

Actually, it is customary to work with momentum $(p = mv)$, rather than velocity:

$$
\langle p \rangle = m \frac {d \langle x \rangle}{d t} = - i \hbar \int \left(\Psi^ {*} \frac {\partial \Psi}{\partial x}\right) d x. \tag {1.33}
$$

Let me write the expressions for $\langle x\rangle$ and $\langle p\rangle$ in a more suggestive way:

$$
\langle x \rangle = \int \Psi^ {*} [ x ] \Psi d x, \tag {1.34}
$$

$$
\langle p \rangle = \int \Psi^ {*} \left[ - i \hbar (\partial / \partial x) \right] \Psi d x. \tag {1.35}
$$

We say that the operator $^{18}$ $x$ "represents" position, and the operator $-i\hbar (\partial /\partial x)$ "represents" momentum; to calculate expectation values we "sandwich" the appropriate operator between $\Psi^{*}$ and $\Psi$, and integrate.

That's cute, but what about other quantities? The fact is, all classical dynamical variables can be expressed in terms of position and momentum. Kinetic energy, for example, is

$$
T = \frac {1}{2} m v ^ {2} = \frac {p ^ {2}}{2 m},
$$

and angular momentum is

$$
\mathbf {L} = \mathbf {r} \times m \mathbf {v} = \mathbf {r} \times \mathbf {p}
$$

(the latter, of course, does not occur for motion in one dimension). To calculate the expectation value of any such quantity, $Q(x,p)$, we simply replace every $p$ by $-i\hbar (\partial /\partial x)$, insert the resulting operator between $\Psi^{*}$ and $\Psi$, and integrate:

$$
\langle Q (x, p) \rangle = \int \Psi^ {*} [ Q (x, - i \hbar \partial / \partial x) ] \Psi d x. \tag {1.36}
$$

For example, the expectation value of the kinetic energy is

$$
\langle T \rangle = - \frac {\hbar^ {2}}{2 m} \int \Psi^ {*} \frac {\partial^ {2} \Psi}{\partial x ^ {2}} d x. \tag {1.37}
$$

Equation 1.36 is a recipe for computing the expectation value of any dynamical quantity, for a particle in state $\Psi$; it subsumes Equations 1.34 and 1.35 as special cases. I have tried to make Equation 1.36 seem plausible, given Born's statistical interpretation, but in truth this represents such a radically new way of doing business (as compared with classical mechanics) that it's a good idea to get some practice using it before we come back (in Chapter 3) and put it on a firmer theoretical foundation. In the mean time, if you prefer to think of it as an axiom, that's fine with me.

33

Problem 1.6 Why can't you do integration-by-parts directly on the middle expression in Equation 1.29—pull the time derivative over onto  $x$ , note that  $\partial x / \partial t = 0$ , and conclude that  $d\langle x\rangle /dt = 0$ ?

Problem 1.7 Calculate  $d\langle p\rangle /dt$  .Answer:

$$
\frac {d \langle p \rangle}{d t} = \left\langle - \frac {\partial V}{\partial x} \right\rangle . \tag {1.38}
$$

This is an instance of Ehrenfest's theorem, which asserts that expectation values obey the classical laws.[19]

Problem 1.8 Suppose you add a constant  $V_{0}$  to the potential energy (by "constant" I mean independent of  $x$  as well as  $t$ ). In classical mechanics this doesn't change anything, but what about quantum mechanics? Show that the wave function picks up a time-dependent phase factor:  $\exp \left( -iV_{0}t / \hbar \right)$ . What effect does this have on the expectation value of a dynamical variable?

# 1.6 The Uncertainty Principle

Imagine that you're holding one end of a very long rope, and you generate a wave by shaking it up and down rhythmically (Figure 1.8). If someone asked you "Precisely where is that wave?" you'd probably think he was a little bit nutty: The wave isn't precisely anywhere—it's spread out over 50 feet or so. On the other hand, if he asked you what its wavelength is, you could give him a reasonable answer: it looks like about 6 feet. By contrast, if you gave the rope a sudden jerk (Figure 1.9), you'd get a relatively narrow bump traveling down the line. This time the first question (Where precisely is the wave?) is a sensible one, and the second (What is its wavelength?) seems nutty—it isn't even vaguely periodic, so how can you assign a wavelength to it? Of course, you can draw intermediate cases, in which the wave is fairly well localized and the wavelength is fairly well defined, but there is an inescapable trade-off here: the more precise a wave's position is, the less precise is its wavelength, and vice versa.[20] A theorem in Fourier analysis makes all this rigorous, but for the moment I am only concerned with the qualitative argument.

![img-12.jpeg](img-12.jpeg)
Figure 1.8: A wave with a (fairly) well-defined wavelength, but an ill-defined position.

![img-13.jpeg](img-13.jpeg)
Figure 1.9: A wave with a (fairly) well-defined position, but an ill-defined wavelength.

This applies, of course, to any wave phenomenon, and hence in particular to the quantum mechanical wave function. But the wavelength of  $\Psi$  is related to the momentum of the particle by the de Broglie formula:[21]

$$
p = \frac {h}{\lambda} = \frac {2 \pi \hbar}{\lambda}. \tag {1.39}
$$

Thus a spread in wavelength corresponds to a spread in momentum, and our general observation now says that the more precisely determined a particle's position is, the less precisely is its momentum. Quantitatively,

$$
\sigma_ {x} \sigma_ {p} \geq \frac {\hbar}{2}, \tag {1.40}
$$

where  $\sigma_{x}$  is the standard deviation in  $x$ , and  $\sigma_{p}$  is the standard deviation in  $p$ . This is Heisenberg's famous uncertainty principle. (We'll prove it in Chapter 3, but I wanted to mention it right away, so you can test it out on the examples in Chapter 2.)

Please understand what the uncertainty principle means: Like position measurements, momentum measurements yield precise answers—the "spread" here refers to the fact that measurements made on identically prepared systems do not yield identical results. You can, if you want, construct a state such that

position measurements will be very close together (by making  $\Psi$  a localized "spike"), but you will pay a price: Momentum measurements on this state will be widely scattered. Or you can prepare a state with a definite momentum (by making  $\Psi$  a long sinusoidal wave), but in that case position measurements will be widely scattered. And, of course, if you're in a really bad mood you can create a state for which neither position nor momentum is well defined: Equation 1.40 is an inequality, and there's no limit on how big  $\sigma_{x}$  and  $\sigma_{p}$  can be—just make  $\Psi$  some long wiggly line with lots of bumps and potholes and no periodic structure.

Problem 1.9 A particle of mass  $m$  has the wave function

$$
\Psi (x, t) = A e ^ {- a \left[ \left(m x ^ {2} / \hbar\right) + i t \right]},
$$

where  $A$  and  $a$  are positive real constants.

(a) Find  $A$
(b) For what potential energy function,  $V(x)$ , is this a solution to the Schrödinger equation?
(c) Calculate the expectation values of  $x, x^2, p$ , and  $p^2$ .
(d) Find  $\sigma_{x}$  and  $\sigma_{p}$ . Is their product consistent with the uncertainty principle?

# Further Problems on Chapter 1

Problem 1.10 Consider the first 25 digits in the decimal expansion of $\pi$ (3, 1, 4, 1, 5, 9, ...).

(a) If you selected one number at random, from this set, what are the probabilities of getting each of the 10 digits?

(b) What is the most probable digit? What is the median digit? What is the average value?

(c) Find the standard deviation for this distribution.

Problem 1.11 [This problem generalizes Example 1.2.] Imagine a particle of mass $m$ and energy $E$ in a potential well $V(x)$, sliding frictionlessly back and forth between the classical turning points ($a$ and $b$ in Figure 1.10). Classically, the probability of finding the particle in the range $dx$ (if, for example, you took a snapshot at a random time $t$) is equal to the fraction of the time $T$ it takes to get from $a$ to $b$ that it spends in the interval $dx$:

$$
\rho(x) \, dx = \frac{dt}{T} = \frac{(dt/dx) \, dx}{T} = \frac{1}{v(x) \, T} \, dx, \tag{1.41}
$$

where $v(x)$ is the speed, and

$$
T = \int_{0}^{T} dt = \int_{a}^{b} \frac{1}{v(x)} \, dx. \tag{1.42}
$$

Thus

$$
\rho(x) = \frac{1}{v(x) \, T}. \tag{1.43}
$$

This is perhaps the closest classical analog$^{22}$ to $|\Psi|^2$.

(a) Use conservation of energy to express $v(x)$ in terms of $E$ and $V(x)$.

(b) As an example, find $\rho(x)$ for the simple harmonic oscillator, $V(x) = kx^2/2$. Plot $\rho(x)$, and check that it is correctly normalized.

(c) For the classical harmonic oscillator in part (b), find $\langle x\rangle, \langle x^2\rangle$, and $\sigma_x$.

![img-14.jpeg](img-14.jpeg)

Figure 1.10: Classical particle in a potential well.

Problem 1.12 What if we were interested in the distribution of momenta  $(p = mv)$ , for the classical harmonic oscillator (Problem 1.11(b)).

(a) Find the classical probability distribution  $\rho(p)$  (note that  $p$  ranges from  $-\sqrt{2mE}$  to  $+\sqrt{2mE}$ ).
(b) Calculate  $\langle p\rangle ,\langle p^2\rangle$  , and  $\sigma_{p}$
(c) What's the classical uncertainty product,  $\sigma_{x}\sigma_{p}$ , for this system? Notice that this product can be as small as you like, classically, simply by sending  $E\rightarrow 0$ . But in quantum mechanics, as we shall see in Chapter 2, the energy of a simple harmonic oscillator cannot be less than  $\hbar \omega /2$ , where  $\omega = \sqrt{k / m}$  is the classical frequency. In that case what can you say about the product  $\sigma_{x}\sigma_{p}$ ?

Problem 1.13 Check your results in Problem 1.11(b) with the following "numerical experiment." The position of the oscillator at time  $t$  is

$$
x (t) = A \cos (\omega t). \tag {1.44}
$$

You might as well take  $\omega = 1$  (that sets the scale for time) and  $A = 1$  (that sets the scale for length). Make a plot of  $x$  at 10,000 random times, and compare it with  $\rho(x)$ .

Hint: In Mathematica, first define

$$
\mathbf {x} [ \mathbf {t} _ {-} ] := \operatorname {C o s} [ \mathbf {t} ]
$$

then construct a table of positions:

$$
\text {snapshots} = \text {Table} [ \mathrm {x} [ \pi \text {RandomReal} [ \mathrm {j} ] ], \{\mathrm {j}, 1 0 0 0 0 \} ]
$$

and finally, make a histogram of the data:

$$
\text {Histogram[snapshots, 100, "PDF", PlotRange} \rightarrow \{0,2\} ]
$$

Meanwhile, make a plot of the density function,  $\rho (x)$ , and, using Show, superimpose the two.

Problem 1.14 Let  $P_{ab}(t)$  be the probability of finding the particle in the range  $(a &lt; x &lt; b)$ , at time  $t$ .

(a) Show that

$$
\frac {d P _ {a b}}{d t} = J (a, t) - J (b, t),
$$

where

$$
J (x, t) \equiv \frac {i \hbar}{2 m} \left(\Psi \frac {\partial \Psi^ {*}}{\partial x} - \Psi^ {*} \frac {\partial \Psi}{\partial x}\right).
$$

What are the units of $J(x, t)$? Comment: $J$ is called the **probability current**, because it tells you the rate at which probability is “flowing” past the point $x$. If $P_{ab}(t)$ is increasing, then more probability is flowing into the region at one end than flows out at the other.

(b) Find the probability current for the wave function in Problem 1.9. (This is not a very pithy example, I'm afraid; we'll encounter more substantial ones in due course.)

Problem 1.15 Show that

$$
\frac{d}{dt} \int_{-\infty}^{\infty} \Psi_1^* \Psi_2 \, dx = 0
$$

for any two (normalizable) solutions to the Schrödinger equation (with the same $V(x)$), $\Psi_1$ and $\Psi_2$.

Problem 1.16 A particle is represented (at time $t = 0$) by the wave function

$$
\Psi(x, 0) = \begin{cases}
A \left(a^2 - x^2\right), &amp; -a \leq x \leq +a, \\
0, &amp; \text{otherwise}.
\end{cases}
$$

(a) Determine the normalization constant $A$.
(b) What is the expectation value of $x$?
(c) What is the expectation value of $p$? (Note that you cannot get it from $\langle p \rangle = m d \langle x \rangle / dt$. Why not?)
(d) Find the expectation value of $x^2$.
(e) Find the expectation value of $p^2$.
(f) Find the uncertainty in $x$ ($\sigma_x$).
(g) Find the uncertainty in $p$ ($\sigma_p$).
(h) Check that your results are consistent with the uncertainty principle.

**Problem 1.17** Suppose you wanted to describe an **unstable particle**, that spontaneously disintegrates with a “lifetime” $\tau$. In that case the total probability of finding the particle somewhere should not be constant, but should decrease at (say) an exponential rate:

$$
P(t) \equiv \int_{-\infty}^{+\infty} |\Psi(x, t)|^2 \, dx = e^{-t/\tau}.
$$

A crude way of achieving this result is as follows. In Equation 1.24 we tacitly assumed that $V$ (the potential energy) is real. That is certainly reasonable, but it leads to the “conservation of probability” enshrined in Equation 1.27. What if we assign to $V$ an imaginary part:

$$
V = V_0 - i\Gamma,
$$

where $V_0$ is the true potential energy and $\Gamma$ is a positive real constant?

(a) Show that (in place of Equation 1.27) we now get

$$
\frac {d P}{d t} = - \frac {2 \Gamma}{\hbar} P.
$$

(b) Solve for $P(t)$, and find the lifetime of the particle in terms of $\Gamma$.

Problem 1.18 Very roughly speaking, quantum mechanics is relevant when the de Broglie wavelength of the particle in question $(h / p)$ is greater than the characteristic size of the system $(d)$. In thermal equilibrium at (Kelvin) temperature $T$, the average kinetic energy of a particle is

$$
\frac {p ^ {2}}{2 m} = \frac {3}{2} k _ {B} T
$$

(where $k_{B}$ is Boltzmann's constant), so the typical de Broglie wavelength is

$$
\lambda = \frac {h}{\sqrt {3 m k _ {B} T}}. \tag {1.45}
$$

The purpose of this problem is to determine which systems will have to be treated quantum mechanically, and which can safely be described classically.

(a) Solids. The lattice spacing in a typical solid is around $d = 0.3 \, \mathrm{nm}$. Find the temperature below which the unbound$^{23}$ electrons in a solid are quantum mechanical. Below what temperature are the nuclei in a solid quantum mechanical? (Use silicon as an example.)

Moral: The free electrons in a solid are always quantum mechanical; the nuclei are generally not quantum mechanical. The same goes for liquids (for which the interatomic spacing is roughly the same), with the exception of helium below $4\mathrm{K}$.

(b) Gases. For what temperatures are the atoms in an ideal gas at pressure $P$ quantum mechanical? Hint: Use the ideal gas law $(PV = Nk_{B}T)$ to deduce the interatomic spacing.

Answer: $T &lt; (1 / k_{B})\left(h^{2} / 3m\right)^{3 / 5}P^{2 / 5}$. Obviously (for the gas to show quantum behavior) we want $m$ to be as small as possible, and $P$ as large as possible. Put in the numbers for helium at atmospheric pressure. Is hydrogen in outer space (where the interatomic spacing is about $1\mathrm{cm}$ and the temperature is $3\mathrm{K}$) quantum mechanical? (Assume it's monatomic hydrogen, not H2.)

$^{2}$ Magnetic forces are an exception, but let's not worry about them just yet. By the way, we shall assume throughout this book that the motion is nonrelativistic ($v \ll c$).

$^{3}$ For a delightful first-hand account of the origins of the Schrödinger equation see the article by Felix Bloch in *Physics Today*, December 1976.

$^{4}$ The wave function itself is complex, but $|\Psi|^2 = \Psi^* \Psi$ (where $\Psi^*$ is the complex conjugate of $\Psi$) is real and non-negative—as a probability, of course, must be.

$^{5}$ Of course, no measuring instrument is perfectly precise; what I mean is that the particle was found in the vicinity of $C$, as defined by the precision of the equipment.

$^{6}$ Bernard d'Espagnat, "The Quantum Theory and Reality" (*Scientific American*, November 1979, p. 165).

$^{7}$ Quoted in a lovely article by N. David Mermin, "Is the moon there when nobody looks?" (*Physics Today*, April 1985, p. 38).

40

41

2 Ibid., p. 40.

3 This statement is a little too strong: there exist viable nonlocal hidden variable theories (notably David Bohm’s), and other formulations (such as the many worlds interpretation) that do not fit cleanly into any of my three categories. But I think it is wise, at least from a pedagogical point of view, to adopt a clear and coherent platform at this stage, and worry about the alternatives later.

4 The role of measurement in quantum mechanics is so critical and so bizarre that you may well be wondering what precisely constitutes a measurement. I’ll return to this thorny issue in the Afterword; for the moment let’s take the naive view: a measurement is the kind of thing that a scientist in a white coat does in the laboratory, with rulers, stopwatches, Geiger counters, and so on.

5 Because the wavelength of electrons is typically very small, the slits have to be extremely close together. Historically, this was first achieved by Davisson and Germer, in 1925, using the atomic layers in a crystal as “slits.” For an interesting account, see R. K. Gehrenbeck, *Physics Today*, January 1978, page 34.

6 See Tonomura et al., *American Journal of Physics*, Volume 57, Issue 2, pp. 117–120 (1989), and the amazing associated video at www.hitachi.com/nl/portal/highlight/quantum/doubleslit/. This experiment can now be done with much more massive particles, including “Bucky-balls”; see M. Arndt, et al., *Nature* 40, 680 (1999). Incidentally, the same thing can be done with light: turn the intensity so low that only one “photon” is present at a time and you get an identical point-by-point assembly of the interference pattern. See R. S. Aspden, M. J. Padgett, and G. C. Spalding, *Am. J. Phys.* 84, 671 (2016).

7 I think it is important to distinguish things like interference and diffraction that would hold for any wave theory from the uniquely quantum mechanical features of the measurement process, which derive from the statistical interpretation.

8 A statistician will complain that I am confusing the average of a finite sample (a million, in this case) with the “true” average (over the whole continuum). This can be an awkward problem for the experimentalist, especially when the sample size is small, but here I am only concerned with the true average, to which the sample average is presumably a good approximation.

9 Evidently $\Psi (x,t)$ must go to zero faster than $1 / \sqrt{|x|}$, as $|x|\to \infty$. Incidentally, normalization only fixes the modulus of $A$; the phase remains undetermined. However, as we shall see, the latter carries no physical significance anyway.

10 A competent mathematician can supply you with pathological counterexamples, but they do not arise in physics; for us the wave function and all its derivatives go to zero at infinity.

11 To keep things from getting too cluttered, I’ll suppress the limits of integration $(\pm \infty)$.

12 The product rule says that

$$
\frac {d}{d x} (f g) = f \frac {d g}{d x} + \frac {d f}{d x} g,
$$

from which it follows that

$$
\int_ {a} ^ {b} f \frac {d g}{d x} d x = - \int_ {a} ^ {b} \frac {d f}{d x} g d x + f g | _ {a} ^ {b}.
$$

Under the integral sign, then, you can peel a derivative off one factor in a product, and slap it onto the other one—it’ll cost you a minus sign, and you’ll pick up a boundary term.

13 An “operator” is an instruction to do something to the function that follows; it takes in one function, and spits out some other function. The position operator tells you to multiply by $x$; the momentum operator tells you to differentiate with respect to $x$ (and multiply the result by $-i\hbar$).

14 Some authors limit the term to the pair of equations $\langle p\rangle = m d\langle x\rangle /dt$ and $\langle -\partial V / \partial x\rangle = d\langle p\rangle /dt$.

15 That’s why a piccolo player must be right on pitch, whereas a double-bass player can afford to wear garden gloves. For the piccolo, a sixty-fourth note contains many full cycles, and the frequency (we’re working in the time domain now, instead of space) is well defined, whereas for the bass, at a much lower register, the sixty-fourth note contains only a few cycles, and all you hear is a general sort of “oomph,” with no very clear pitch.

16 I’ll explain this in due course. Many authors take the de Broglie formula as an axiom, from which they then deduce the association of momentum with the operator $-i\hbar$ $(\partial/\partial x)$. Although this is a conceptually cleaner approach, it involves diverting mathematical complications that I would rather save for later.

17 If you like, instead of photos of one system at random times, picture an ensemble of such systems, all with the same energy but with random starting positions, and photograph them all at the same time. The analysis is identical, but this interpretation is closer to the quantum notion of indeterminacy.

18 In a solid the inner electrons are attached to a particular nucleus, and for them the relevant size would be the radius of the atom. But the outer-most electrons are not attached, and for them the relevant distance is the lattice spacing. This problem pertains to the outer electrons.

2
Time-Independent Schrödinger Equation
*
42

43

# 2.1 Stationary States

In Chapter 1 we talked a lot about the wave function, and how you use it to calculate various quantities of interest. The time has come to stop procrastinating, and confront what is, logically, the prior question: How do you get $\Psi(x, t)$ in the first place? We need to solve the Schrödinger equation,

$$
i \hbar \frac {\partial \Psi}{\partial t} = - \frac {\hbar^ {2}}{2 m} \frac {\partial^ {2} \Psi}{\partial x ^ {2}} + V \Psi , \tag {2.1}
$$

for a specified potential $V(x, t)$. In this chapter (and most of this book) I shall assume that $V$ is independent of $t$. In that case the Schrödinger equation can be solved by the method of separation of variables (the physicist's first line of attack on any partial differential equation): We look for solutions that are products,

$$
\Psi (x, t) = \psi (x) \varphi (t), \tag {2.2}
$$

where $\psi$ (lower-case) is a function of $x$ alone, and $\varphi$ is a function of $t$ alone. On its face, this is an absurd restriction, and we cannot hope to obtain more than a tiny subset of all solutions in this way. But hang on, because the solutions we do get turn out to be of great interest. Moreover (as is typically the case with separation of variables) we will be able at the end to patch together the separable solutions in such a way as to construct the most general solution.

For separable solutions we have

$$
\frac {\partial \Psi}{\partial t} = \psi \frac {d \varphi}{d t}, \quad \frac {\partial^ {2} \Psi}{\partial x ^ {2}} = \frac {d ^ {2} \psi}{d x ^ {2}} \varphi
$$

(ordinary derivatives, now), and the Schrödinger equation reads

$$
i \hbar \psi \frac {d \varphi}{d t} = - \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} \varphi + V \psi \varphi .
$$

Or, dividing through by $\psi \varphi$:

$$
i \hbar \frac {1}{\varphi} \frac {d \varphi}{d t} = - \frac {\hbar^ {2}}{2 m} \frac {1}{\psi} \frac {d ^ {2} \psi}{d x ^ {2}} + V. \tag {2.3}
$$

Now, the left side is a function of $t$ alone, and the right side is a function of $x$ alone. The only way this can possibly be true is if both sides are in fact constant—otherwise, by varying $t$, I could change the left side without touching the right side, and the two would no longer be equal. (That's a subtle but crucial argument, so if it's new to you, be sure to pause and think it through.) For reasons that will appear in a moment, we shall call the separation constant $E$. Then

$$
i \hbar \frac {1}{\varphi} \frac {d \varphi}{d t} = E,
$$

or

$$
\frac {d \varphi}{d t} = - \frac {i E}{\hbar} \varphi , \tag {2.4}
$$

and

$$
- \frac {\hbar^ {2}}{2 m} \frac {1}{\psi} \frac {d ^ {2} \psi}{d x ^ {2}} + V = E,
$$

or

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} + V \psi = E \psi . \tag {2.5}
$$

Separation of variables has turned a partial differential equation into two ordinary differential equations (Equations 2.4 and 2.5). The first of these is easy to solve (just multiply through by  $dt$  and integrate); the general solution is  $C\exp \left(-iEt / \hbar\right)$ , but we might as well absorb the constant  $C$  into  $\psi$  (since the quantity of interest is the product  $\psi \varphi$ ). Then

$$
\varphi (t) = e ^ {- i E t / \hbar}. \tag {2.6}
$$

The second (Equation 2.5) is called the time-independent Schrödinger equation; we can go no further with it until the potential  $V(x)$  is specified.

The rest of this chapter will be devoted to solving the time-independent Schrödinger equation, for a variety of simple potentials. But before I get to that you have every right to ask: What's so great about separable solutions? After all, most solutions to the (time dependent) Schrödinger equation do not take the form  $\psi(x)\varphi(t)$ . I offer three answers—two of them physical, and one mathematical:

1. They are stationary states. Although the wave function itself,

$$
\Psi (x, t) = \psi (x) e ^ {- i E t / \hbar}, \tag {2.7}
$$

does(obviously) depend on  $t$ , the probability density,

$$
\left| \Psi (x, t) \right| ^ {2} = \Psi^ {*} \Psi = \psi^ {*} e ^ {+ i E t / \hbar} \psi e ^ {- i E t / \hbar} = \left| \psi (x) \right| ^ {2}, \tag {2.8}
$$

does not—the time-dependence cancels out. $^4$  The same thing happens in calculating the expectation value of any dynamical variable; Equation 1.36 reduces to

$$
\langle Q (x, p) \rangle = \int \psi^ {*} \left[ Q \left(x, - i \hbar \frac {d}{d x}\right) \right] \psi d x. \tag {2.9}
$$

Every expectation value is constant in time; we might as well drop the factor  $\varphi(t)$  altogether, and simply use  $\psi$  in place of  $\Psi$ . (Indeed, it is common to refer to  $\psi$  as "the wave function," but this is sloppy language that can be dangerous, and it is important to remember that the true wave function always carries that time-dependent wiggle factor.) In particular,  $\langle x \rangle$  is constant, and hence (Equation 1.33)  $\langle p \rangle = 0$ . Nothing ever happens in a stationary state.

2. They are states of definite total energy. In classical mechanics, the total energy (kinetic plus potential) is called the Hamiltonian:

$$
H (x, p) = \frac {p ^ {2}}{2 m} + V (x). \tag {2.10}
$$

The corresponding Hamiltonian operator, obtained by the canonical substitution $p \to -i\hbar(\partial/\partial x)$, is therefore

$$
\hat{H} = -\frac{\hbar^2}{2m} \frac{\partial^2}{\partial x^2} + V(x). \tag{2.11}
$$

Thus the time-independent Schrödinger equation (Equation 2.5) can be written

$$
\hat{H} \psi = E \psi, \tag{2.12}
$$

and the expectation value of the total energy is

$$
\langle H \rangle = \int \psi^* \hat{H} \psi \, dx = E \int |\psi|^2 dx = E \int |\Psi|^2 dx = E. \tag{2.13}
$$

(Notice that the normalization of $\Psi$ entails the normalization of $\psi$.) Moreover,

$$
\hat{H}^2 \psi = \hat{H} (\hat{H} \psi) = \hat{H} (E \psi) = E (\hat{H} \psi) = E^2 \psi,
$$

and hence

$$
\langle H^2 \rangle = \int \psi^* \hat{H}^2 \psi \, dx = E^2 \int |\psi|^2 dx = E^2.
$$

So the variance of $H$ is

$$
\sigma_H^2 = \langle H^2 \rangle - \langle H \rangle^2 = E^2 - E^2 = 0. \tag{2.14}
$$

But remember, if $\sigma = 0$, then every member of the sample must share the same value (the distribution has zero spread). Conclusion: A separable solution has the property that every measurement of the total energy is certain to return the value $E$. (That's why I chose that letter for the separation constant.)

3. The general solution is a linear combination of separable solutions. As we're about to discover, the time-independent Schrödinger equation (Equation 2.5) yields an infinite collection of solutions $(\psi_1(x), \psi_2(x), \psi_3(x), \ldots$, which we write as $\{\psi_n(x)\})$, each with its associated separation constant $(E_1, E_2, E_3, \ldots = E_n)$, thus there is a different wave function for each allowed energy:

$$
\Psi_1(x, t) = \psi_1(x) e^{-iE_1 t / \hbar}, \quad \Psi_2(x, t) = \psi_2(x) e^{-iE_2 t / \hbar}, \ldots.
$$

Now (as you can easily check for yourself) the (time-dependent) Schrödinger equation (Equation 2.1) has the property that any linear combination of solutions is itself a solution. Once we have found the separable solutions, then, we can immediately construct a much more general solution, of the form

$$
\Psi(x, t) = \sum_{n=1}^{\infty} c_n \psi_n(x) e^{-iE_n t / \hbar}. \tag{2.15}
$$

It so happens that every solution to the (time-dependent) Schrödinger equation can be written in this form—it is simply a matter of finding the right constants $(c_1, c_2, \ldots)$ so as to fit the initial conditions for the problem at hand. You'll see in the following sections how all this works out in practice, and in Chapter 3 we'll put it into more elegant language, but the main point is this: Once you've solved the time-independent Schrödinger equation, you're essentially done; getting from there

45

to the general solution of the time-dependent Schrödinger equation is, in principle, simple and straightforward.

A lot has happened in the past four pages, so let me recapitulate, from a somewhat different perspective. Here's the generic problem: You're given a (time-independent) potential $V(x)$, and the starting wave function $\Psi(x,0)$; your job is to find the wave function, $\Psi(x,t)$, for any subsequent time $t$. To do this you must solve the (time-dependent) Schrödinger equation (Equation 2.1). The strategy is first to solve the time-independent Schrödinger equation (Equation 2.5); this yields, in general, an infinite set of solutions, $\{\psi_n(x)\}$, each with its own associated energy, $\{E_n\}$. To fit $\Psi(x,0)$ you write down the general linear combination of these solutions:

$$
\Psi(x, 0) = \sum_{n=1}^{\infty} c_n \psi_n(x); \tag{2.16}
$$

the miracle is that you can always match the specified initial state by appropriate choice of the constants $\{c_n\}$. To construct $\Psi(x,t)$ you simply tack onto each term its characteristic time dependence (its "wiggle factor"), $\exp(-iE_nt/\hbar)$.

$$
\Psi(x, t) = \sum_{n=1}^{\infty} c_n \psi_n(x) e^{-iE_nt/\hbar} = \sum_{n=1}^{\infty} c_n \Psi_n(x, t). \tag{2.17}
$$

The separable solutions themselves,

$$
\Psi_n(x, t) = \psi_n(x) e^{-iE_nt/\hbar}, \tag{2.18}
$$

are stationary states, in the sense that all probabilities and expectation values are independent of time, but this property is emphatically not shared by the general solution (Equation 2.17): the energies are different, for different stationary states, and the exponentials do not cancel, when you construct $|\Psi|^2$.

## Example 2.1

Suppose a particle starts out in a linear combination of just two stationary states:

$$
\Psi(x, 0) = c_1 \psi_1(x) + c_2 \psi_2(x).
$$

(To keep things simple I'll assume that the constants $c_n$ and the states $\psi_n(x)$ are real.) What is the wave function $\Psi(x, t)$ at subsequent times? Find the probability density, and describe its motion.

**Solution:** The first part is easy:

$$
\Psi(x, t) = c_1 \psi_1(x) e^{-iE_1t/\hbar} + c_2 \psi_2(x) e^{-iE_2t/\hbar},
$$

where $E_1$ and $E_2$ are the energies associated with $\psi_1$ and $\psi_2$. It follows that

$$
\begin{aligned}
|\Psi(x, t)|^2 &amp;= \left(c_1 \psi_1 e^{iE_1t/\hbar} + c_2 \psi_2 e^{iE_2t/\hbar}\right) \left(c_1 \psi_1 e^{-iE_1t/\hbar} + c_2 \psi_2 e^{-iE_2t/\hbar}\right) \\
&amp;= c_1^2 \psi_1^2 + c_2^2 \psi_2^2 + 2c_1 c_2 \psi_1 \psi_2 \cos\left[(E_2 - E_1) t/\hbar\right].
\end{aligned}
$$

The probability density oscillates sinusoidally, at an angular frequency $\omega = (E_2 - E_1)/\hbar$; this is certainly not a stationary state. But notice that it took a linear combination of stationary states (with

46

different energies) to produce motion.9

You may be wondering what the coefficients $\{c_{n}\}$ represent *physically*. I’ll tell you the answer, though the explanation will have to await Chapter 3:

$\boxed{|c_{n}|^{2}\quad\text{is the probability that a measurement of the energy would return the value $E_{n}$}.}$ (2.19)

A competent measurement will always yield *one* of the “allowed” values (hence the name), and $|c_{n}|^{2}$ is the probability of getting the *particular* value $E_{n}$. Of course, the *sum* of these probabilities should be 1:

$\boxed{\sum_{n=1}^{\infty}|c_{n}|^{2}=1,}$ (2.20)

and the expectation value of the energy must be

$\boxed{\langle H\rangle=\sum_{n=1}^{\infty}|c_{n}|^{2}\ E_{n}.}$ (2.21)

We’ll soon see how this works out in some concrete examples. Notice, finally, that becausethe constants $\{c_{n}\}$ are independent of time, so too is the probability of getting a particular energy, and, *a fortiori*, the expectation value of $H$. These are manifestations of energy conservation in quantum mechanics.

###### Problem 2.1

Prove the following three theorems:

(a) For normalizable solutions, the separation constant $E$ must be *real*. *Hint:* Write $E$ (in Equation 2.7) as $E_{0}+i\Gamma$ (with $E_{0}$ and $\Gamma$ real), and show that if Equation 1.20 is to hold for all $t$, $\Gamma$ must be zero.

(b) The time-independent wave function $\psi\ (x)$ can always be taken to be *real* (unlike $\Psi\ (x,\,t)$, which is necessarily complex). This doesn’t mean that every solution to the time-independent Schrödinger equation *is* real; what it says is that if you’ve got one that is *not*, it can always be expressed as a linear combination of solutions (with the same energy) that *are*. So you *might as well* stick to $\psi$s that are real. *Hint:* If $\psi\ (x)$ satisfies Equation 2.5, for a given $E$, so too does its complex conjugate, and hence also the real linear combinations $(\psi\,+\,\psi^{*})$ and $i\ (\psi\,-\,\psi^{*})$.

(c) If $V\ (x)$ is an even function (that is, $V\ (-x)\ =V\ (x)$) then $\psi\ (x)$ can always be taken to be either even or odd. *Hint:* If $\psi\ (x)$ satisfies Equation 2.5, for a given $E$, so too does $\psi\ (-x)$, and hence also the even and odd linear combinations $\psi\ (x)\ \pm\ \psi\ (-x)$.

##

Problem 2.2 Show that  $E$  must exceed the minimum value of  $V(x)$ , for every normalizable solution to the time-independent Schrödinger equation. What is the classical analog to this statement? Hint: Rewrite Equation 2.5 in the form

$$
\frac {d ^ {2} \psi}{d x ^ {2}} = \frac {2 m}{\hbar^ {2}} \left[ V (x) - E \right] \psi ;
$$

if  $E &lt; V_{\min}$ , then  $\psi$  and its second derivative always have the same sign—argue that such a function cannot be normalized.

# 2.2 The Infinite Square Well

Suppose

$$
V (x) = \left\{ \begin{array}{l l} 0, &amp; 0 \leq x \leq a, \\ \infty , &amp; \text {o t h e r w i s e} \end{array} \right. \tag {2.22}
$$

(Figure 2.1). A particle in this potential is completely free, except at the two ends ( $x = 0$  and  $x = a$ ), where an infinite force prevents it from escaping. A classical model would be a cart on a frictionless horizontal air track, with perfectly elastic bumpers—it just keeps bouncing back and forth forever. (This potential is artificial, of course, but I urge you to treat it with respect. Despite its simplicity—or rather, precisely because of its simplicity—it serves as a wonderfully accessible test case for all the fancy machinery that comes later. We'll refer back to it frequently.)

![img-15.jpeg](img-15.jpeg)
Figure 2.1: The infinite square well potential (Equation 2.22).

Outside the well,  $\psi(x) = 0$  (the probability of finding the particle there is zero). Inside the well, where  $V = 0$ , the time-independent Schrödinger equation (Equation 2.5) reads

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} = E \psi , \tag {2.23}
$$

or

$$
\frac {d ^ {2} \psi}{d x ^ {2}} = - k ^ {2} \psi , \quad \text {w h e r e} k \equiv \frac {\sqrt {2 m E}}{\hbar}. \tag {2.24}
$$

(By writing it in this way, I have tacitly assumed that  $E \geq 0$ ; we know from Problem 2.2 that  $E &lt; 0$  won't work.) Equation 2.24 is the classical simple harmonic oscillator equation; the general solution is

$$
\psi (x) = A \sin k x + B \cos k x, \tag {2.25}
$$

where  $A$  and  $B$  are arbitrary constants. Typically, these constants are fixed by the boundary conditions of the problem. What are the appropriate boundary conditions for  $\psi(x)$ ? Ordinarily, both  $\psi$  and  $d\psi/dx$  are continuous,[11] but where the potential goes to infinity only the first of these applies. (I'll justify these boundary conditions, and account for the exception when  $V = \infty$ , in Section 2.5; for now I hope you will trust me.)

Continuity of  $\psi (x)$  requires that

$$
\psi (0) = \psi (a) = 0, \tag {2.26}
$$

so as to join onto the solution outside the well. What does this tell us about $A$ and $B$? Well,

$$
\psi (0) = A \sin 0 + B \cos 0 = B,
$$

so $B = 0$, and hence

$$
\psi (x) = A \sin k x. \tag {2.27}
$$

Then $\psi (a) = A\sin ka$, so either $A = 0$ (in which case we're left with the trivial—non-normalizable—solution $\psi (x) = 0$), or else $\sin ka = 0$, which means that

$$
k a = 0, \pm \pi , \pm 2 \pi , \pm 3 \pi , \dots . \tag {2.28}
$$

But $k = 0$ is no good (again, that would imply $\psi(x) = 0$), and the negative solutions give nothing new, since $\sin (-\theta) = -\sin (\theta)$ and we can absorb the minus sign into $A$. So the distinct solutions are

$$
k _ {n} = \frac {n \pi}{a}, \quad \text {with} \ n = 1, 2, 3, \dots . \tag {2.29}
$$

Curiously, the boundary condition at $x = a$ does not determine the constant $A$, but rather the constant $k$, and hence the possible values of $E$:

$$
E _ {n} = \frac {\hbar^ {2} k _ {n} ^ {2}}{2 m} = \frac {n ^ {2} \pi^ {2} \hbar^ {2}}{2 m a ^ {2}}. \tag {2.30}
$$

In radical contrast to the classical case, a quantum particle in the infinite square well cannot have just any old energy—it has to be one of these special ("allowed") values.[12] To find $A$, we normalize $\psi$:[13]

$$
\int_ {0} ^ {a} | A | ^ {2} \sin^ {2} (k x) d x = | A | ^ {2} \frac {a}{2} = 1, \quad \mathrm {so} \quad | A | ^ {2} = \frac {2}{a}.
$$

This only determines the magnitude of $A$, but it is simplest to pick the positive real root: $A = \sqrt{2 / a}$ (the phase of $A$ carries no physical significance anyway). Inside the well, then, the solutions are

$$
\psi_ {n} (x) = \sqrt {\frac {2}{a}} \sin \left(\frac {n \pi}{a} x\right). \tag {2.31}
$$

As promised, the time-independent Schrödinger equation has delivered an infinite set of solutions (one for each positive integer $n$). The first few of these are plotted in Figure 2.2. They look just like the standing waves on a string of length $a$; $\psi_1$, which carries the lowest energy, is called the ground state, the others, whose energies increase in proportion to $n^2$, are called excited states. As a collection, the functions $\psi_n(x)$ have some interesting and important properties:

1. They are alternately even and odd, with respect to the center of the well: $\psi_{1}$ is even, $\psi_{2}$ is odd, $\psi_{3}$ is even, and so on.[14]
2. As you go up in energy, each successive state has one more node (zero-crossing): $\psi_{1}$ has none (the end points don't count), $\psi_{2}$ has one, $\psi_{3}$ has two, and so on.
3. They are mutually orthogonal, in the sense that[15]

$$
\int \psi_ {m} (x) ^ {*} \psi_ {n} (x) d x = 0, \quad (m \neq n). \tag {2.32}
$$

![img-16.jpeg](img-16.jpeg)
Figure 2.2: The first three stationary states of the infinite square well (Equation 2.31).

![img-17.jpeg](img-17.jpeg)

![img-18.jpeg](img-18.jpeg)

Proof:

$$
\begin{array}{l} \int \psi_ {m} (x) ^ {*} \psi_ {n} (x) d x = \frac {2}{a} \int_ {0} ^ {a} \sin \left(\frac {m \pi}{a} x\right) \sin \left(\frac {n \pi}{a} x\right) d x \\ = \frac {1}{a} \int_ {0} ^ {a} \left[ \cos \left(\frac {m - n}{a} \pi x\right) - \cos \left(\frac {m + n}{a} \pi x\right) \right] d x \\ = \left\{\frac {1}{(m - n) \pi} \sin \left(\frac {m - n}{a} \pi x\right) - \frac {1}{(m + n) \pi} \sin \left(\frac {m + n}{a} \pi x\right) \right\} \Bigg | _ {0} ^ {a} \\ = \frac {1}{\pi} \left\{\frac {\sin [ (m - n) \pi ]}{(m - n)} - \frac {\sin [ (m + n) \pi ]}{(m + n)} \right\} = 0. \\ \end{array}
$$

Note that this argument does not work if  $m = n$ . (Can you spot the point at which it fails?) In that case normalization tells us that the integral is 1. In fact, we can combine orthogonality and normalization into a single statement:

(2.33)

$$
\int \psi_ {m} (x) ^ {*} \psi_ {n} (x) d x = \delta_ {m n},
$$

where  $\delta_{mn}$  (the so-called Kronecker delta) is defined by

$$
\delta_ {m n} = \left\{ \begin{array}{l l} 0, &amp; m \neq n, \\ 1, &amp; m = n. \end{array} \right. \tag {2.34}
$$

We say that the  $\psi$ s are orthonormal.

4. They are complete, in the sense that any other function,  $f(x)$ , can be expressed as a linear combination of them:

$$
f (x) = \sum_ {n = 1} ^ {\infty} c _ {n} \psi_ {n} (x) = \sqrt {\frac {2}{a}} \sum_ {n = 1} ^ {\infty} c _ {n} \sin \left(\frac {n \pi}{a} x\right). \tag {2.35}
$$

I'm not about to prove the completeness of the functions  $\sqrt{2/a} \sin (n\pi x / a)$ , but if you've studied advanced calculus you will recognize that Equation 2.35 is nothing but the Fourier series for  $f(x)$ , and the fact that "any" function can be expanded in this way is sometimes called Dirichlet's theorem.[16]

The coefficients  $c_{n}$  can be evaluated—for a given  $f(x)$ —by a method I call Fourier's trick, which beautifully exploits the orthonormality of  $[\psi_n]$ : Multiply both sides of Equation 2.35 by  $\psi_{m}(x)^{*}$ , and integrate.

$$
\int \psi_ {m} (x) ^ {*} f (x) d x = \sum_ {n = 1} ^ {\infty} c _ {n} \int \psi_ {m} (x) ^ {*} \psi_ {n} (x) d x = \sum_ {n = 1} ^ {\infty} c _ {n} \delta_ {m n} = c _ {m}. \tag {2.36}
$$

(Notice how the Kronecker delta kills every term in the sum except the one for which $n = m$.) Thus the $n$th coefficient in the expansion of $f(x)$ is$^{17}$

$$
c_n = \int \psi_n(x)^* f(x) \, dx. \tag{2.37}
$$

These four properties are extremely powerful, and they are not peculiar to the infinite square well. The first is true whenever the potential itself is a symmetric function; the second is universal, regardless of the shape of the potential.$^{18}$ Orthogonality is also quite general—I'll show you the proof in Chapter 3. Completeness holds for all the potentials you are likely to encounter, but the proofs tend to be nasty and laborious; I'm afraid most physicists simply assume completeness, and hope for the best.

The stationary states (Equation 2.18) of the infinite square well are

$$
\Psi_n(x, t) = \sqrt{\frac{2}{a}} \sin \left(\frac{n\pi}{a}x\right) e^{-i(n^2\pi^2 \hbar / 2ma^2)t}. \tag{2.38}
$$

I claimed (Equation 2.17) that the most general solution to the (time-dependent) Schrödinger equation is a linear combination of stationary states:

$$
\Psi(x, t) = \sum_{n=1}^{\infty} c_n \sqrt{\frac{2}{a}} \sin \left(\frac{n\pi}{a}x\right) e^{-i(n^2\pi^2 \hbar / 2ma^2)t}. \tag{2.39}
$$

(If you doubt that this is a solution, by all means check it!) It remains only for me to demonstrate that I can fit any prescribed initial wave function, $\Psi(x,0)$ by appropriate choice of the coefficients $c_n$:

$$
\Psi(x, 0) = \sum_{n=1}^{\infty} c_n \psi_n(x).
$$

The completeness of the $\psi_s$ (confirmed in this case by Dirichlet's theorem) guarantees that I can always express $\Psi(x,0)$ in this way, and their orthonormality licenses the use of Fourier's trick to determine the actual coefficients:

$$
c_n = \sqrt{\frac{2}{a}} \int_0^a \sin \left(\frac{n\pi}{a}x\right) \Psi(x, 0) \, dx. \tag{2.40}
$$

That does it: Given the initial wave function, $\Psi(x,0)$, we first compute the expansion coefficients $c_n$, using Equation 2.40, and then plug these into Equation 2.39 to obtain $\Psi(x,t)$. Armed with the wave function, we are in a position to compute any dynamical quantities of interest, using the procedures in Chapter 1. And this same ritual applies to any potential—the only things that change are the functional form of the $\psi_s$ and the equation for the allowed energies.

## Example 2.2

A particle in the infinite square well has the initial wave function

$$
\Psi(x, 0) = A x (a - x), \quad (0 \leq x \leq a),
$$

for some constant $A$ (see Figure 2.3). Outside the well, of course, $\Psi = 0$. Find $\Psi(x, t)$.

![img-19.jpeg](img-19.jpeg)
Figure 2.3: The starting wave function in Example 2.2.

Solution: First we need to determine  $A$ , by normalizing  $\Psi(x,0)$ :

$$
1 = \int_ {0} ^ {a} | \Psi (x, 0) | ^ {2} d x = | A | ^ {2} \int_ {0} ^ {a} x ^ {2} (a - x) ^ {2} d x = | A | ^ {2} \frac {a ^ {5}}{3 0},
$$

so

$$
A = \sqrt {\frac {3 0}{a ^ {5}}}.
$$

The  $n$ th coefficient is (Equation 2.40)

$$
\begin{array}{l} c _ {n} = \sqrt {\frac {2}{a}} \int_ {0} ^ {a} \sin \left(\frac {n \pi}{a} x\right) \sqrt {\frac {3 0}{a ^ {5}}} x (a - x) d x \\ = \frac {2 \sqrt {1 5}}{a ^ {3}} \left[ a \int_ {0} ^ {a} x \sin \left(\frac {n \pi}{a} x\right) d x - \int_ {0} ^ {a} x ^ {2} \sin \left(\frac {n \pi}{a} x\right) d x \right] \\ = \frac {2 \sqrt {1 5}}{a ^ {3}} \left\{a \left[ \left(\frac {a}{n \pi}\right) ^ {2} \sin \left(\frac {n \pi}{a} x\right) - \frac {a x}{n \pi} \cos \left(\frac {n \pi}{a} x\right) \right] \Bigg | _ {0} ^ {a} \right. \\ \left. - \left[ 2 \left(\frac {a}{n \pi}\right) ^ {2} x \sin \left(\frac {n \pi}{a} x\right) - \frac {(n \pi x / a) ^ {2} - 2}{(n \pi / a) ^ {3}} \cos \left(\frac {n \pi}{a} x\right) \right] \Bigg | _ {0} ^ {a} \right\} \\ = \frac {2 \sqrt {1 5}}{a ^ {3}} \left[ - \frac {a ^ {3}}{n \pi} \cos (n \pi) + a ^ {3} \frac {(n \pi) ^ {2} - 2}{(n \pi) ^ {3}} \cos (n \pi) + a ^ {3} \frac {2}{(n \pi) ^ {3}} \cos (0) \right] \\ = \frac {4 \sqrt {1 5}}{(n \pi) ^ {3}} [ \cos (0) - \cos (n \pi) ] \\ = \left\{ \begin{array}{l l} 0, &amp; n \text {e v e n}, \\ 8 \sqrt {1 5} / (n \pi) ^ {3}, &amp; n \text {o d d}. \end{array} \right. \\ \end{array}
$$

Thus (Equation 2.39):

$$
\Psi (x, t) = \sqrt {\frac {3 0}{a}} \left(\frac {2}{\pi}\right) ^ {3} \sum_ {n = 1, 3, 5 \dots} \frac {1}{n ^ {3}} \sin \left(\frac {n \pi}{a} x\right) e ^ {- i n ^ {2} \pi^ {2} \hbar t / 2 m a ^ {2}}.
$$

Example 2.3

Check that Equation 2.20 is satisfied, for the wave function in Example 2.2. If you measured the energy of a particle in this state, what is the most probable result? What is the expectation value of the energy?

Solution: The starting wave function (Figure 2.3) closely resembles the ground state $\psi_{1}$ (Figure 2.2). This suggests that $|c_{1}|^{2}$ should dominate, [15] and in fact

$|c_{1}|^{2}=\left(\frac{8\sqrt{15}}{\pi^{3}}\right)^{2}=0.998555\ldots.$

The rest of the coefficients make up the difference: [20]

$\sum_{n=1}^{\infty}|c_{n}|^{2}=\left(\frac{8\sqrt{15}}{\pi^{3}}\right)^{2}\sum_{n=1,3,5,\ldots}^{\infty}\frac{1}{n^{6}}=1.$

The most likely outcome of an energy measurement is $E_{1}=\pi^{2}h^{2}/2ma^{2}$—more than 99.8% of all measurements will yield this value. The expectation value of the energy (Equation 2.21) is

$\langle H\rangle=\sum_{n=1,3,5,\ldots}^{\infty}\left(\frac{8\sqrt{15}}{n^{3}\pi^{3}}\right)^{2}\frac{n^{2}\pi^{2}h^{2}}{2ma^{2}}=\frac{480h^{2}}{\pi^{4}ma^{2}}\sum_{n=1,3,5,\ldots}^{\infty}\frac{1}{n^{4}}=\frac{5h^{2}}{ma^{2}}.$

As one would expect, it is very close to $E_{1}$ (5 in place of $\pi^{2}/2\approx 4.935$)—slightly larger, because of the admixture of excited states.

Of course, it’s no accident that Equation 2.20 came out right in Example 2.3. Indeed, this follows from the normalization of $\Psi$ (the $c_{n}$s are independent of time, so I’m going to do the proof for $t=0$; if this bothers you, you can easily generalize the argument to arbitrary $t$).

$1$ $=\int|\Psi\left(x,\,0\right)|^{2}\,dx=\int\left(\sum_{m=1}^{\infty}c_{m}\psi_{m}(x)\right)^{*}\left(\sum_{n=1}^{\infty}c_{n}\psi_{n}(x)\right)dx$
$=\sum_{m=1}^{\infty}\sum_{n=1}^{\infty}c_{m}^{*}c_{n}\int\psi_{m}\left(x\right)^{*}\psi_{n}\left(x\right)\,dx$
$=\sum_{n=1}^{\infty}\sum_{m=1}^{\infty}c_{m}^{*}c_{n}\delta_{mn}=\sum_{n=1}^{\infty}|c_{n}|^{2}\,.$

(Again, the Kronecker delta picks out the term $m=n$ in the summation over $m$.) Similarly, the expectation value of the energy (Equation 2.21) can be checked explicitly: The time-independent Schrödinger equation (Equation 2.12) says

$\hat{H}\psi_{n}=E_{n}\psi_{n}\,,$ (2.41)

so

$$
\begin{array}{l}
\langle H \rangle = \int \Psi^* \hat{H} \Psi \, dx = \int \left( \sum c_m \psi_m \right)^* \hat{H} \left( \sum c_n \psi_n \right) dx \\
= \sum \sum c_m^* c_n E_n \int \psi_m^* \psi_n \, dx = \sum |c_n|^2 E_n.
\end{array}
$$

Problem 2.3 Show that there is no acceptable solution to the (time-independent) Schrödinger equation for the infinite square well with $E = 0$ or $E &lt; 0$. (This is a special case of the general theorem in Problem 2.2, but this time do it by explicitly solving the Schrödinger equation, and showing that you cannot satisfy the boundary conditions.)

Problem 2.4 Calculate $\langle x \rangle, \langle x^2 \rangle, \langle p \rangle, \langle p^2 \rangle, \sigma_x$, and $\sigma_p$, for the $n$th stationary state of the infinite square well. Check that the uncertainty principle is satisfied. Which state comes closest to the uncertainty limit?

Problem 2.5 A particle in the infinite square well has as its initial wave function an even mixture of the first two stationary states:

$$
\Psi(x, 0) = A \left[ \psi_1(x) + \psi_2(x) \right].
$$

(a) Normalize $\Psi(x, 0)$. (That is, find $A$. This is very easy, if you exploit the orthonormality of $\psi_1$ and $\psi_2$. Recall that, having normalized $\Psi$ at $t = 0$, you can rest assured that it stays normalized—if you doubt this, check it explicitly after doing part (b).)

(b) Find $\Psi(x, t)$ and $|\Psi(x, t)|^2$. Express the latter as a sinusoidal function of time, as in Example 2.1. To simplify the result, let $\omega \equiv \pi^2 \hbar / 2ma^2$.

(c) Compute $\langle x \rangle$. Notice that it oscillates in time. What is the angular frequency of the oscillation? What is the amplitude of the oscillation? (If your amplitude is greater than $a/2$, go directly to jail.)

(d) Compute $\langle p \rangle$. (As Peter Lorre would say, "Do it ze kweek vay, Johnny!")

(e) If you measured the energy of this particle, what values might you get, and what is the probability of getting each of them? Find the expectation value of $H$. How does it compare with $E_1$ and $E_2$?

Problem 2.6 Although the overall phase constant of the wave function is of no physical significance (it cancels out whenever you calculate a measurable quantity), the relative phase of the coefficients in Equation 2.17 does matter. For example, suppose we change the relative phase of $\psi_1$ and $\psi_2$ in Problem 2.5:

$$
\Psi(x, 0) = A \left[ \psi_1(x) + e^{i\phi} \psi_2(x) \right],
$$

where  $\phi$  is some constant. Find  $\Psi(x, t)$ ,  $|\Psi(x, t)|^2$ , and  $\langle x \rangle$ , and compare your results with what you got before. Study the special cases  $\phi = \pi/2$  and  $\phi = \pi$ . (For a graphical exploration of this problem see the applet in footnote 9 of this chapter.)

Problem 2.7 A particle in the infinite square well has the initial wave function

$$
\Psi (x, 0) = \left\{ \begin{array}{l l} A x, &amp; 0 \leq x \leq a / 2, \\ A (a - x), &amp; a / 2 \leq x \leq a. \end{array} \right.
$$

(a) Sketch  $\Psi (x,0)$ , and determine the constant  $A$ .
(b) Find  $\Psi (x,t)$
(c) What is the probability that a measurement of the energy would yield the value  $E_{1}$ ?
(d) Find the expectation value of the energy, using Equation 2.21.21

Problem 2.8 A particle of mass  $m$  in the infinite square well (of width  $a$ ) starts out in the state

$$
\Psi (x, 0) = \left\{ \begin{array}{l l} A, &amp; 0 \leq x \leq a / 2, \\ 0, &amp; a / 2 \leq x \leq a, \end{array} \right.
$$

for some constant  $A$ , so it is (at  $t = 0$ ) equally likely to be found at any point in the left half of the well. What is the probability that a measurement of the energy (at some later time  $t$ ) would yield the value  $\pi^2 h^2 / 2ma^2$ ?

Problem 2.9 For the wave function in Example 2.2, find the expectation value of  $H$ , at time  $t = 0$ , the "old fashioned" way:

$$
\langle H \rangle = \int \Psi (x, 0) ^ {*} \hat {H} \Psi (x, 0) d x.
$$

Compare the result we got in Example 2.3. Note: Because  $\langle H\rangle$  is independent of time, there is no loss of generality in using  $t = 0$ .

57

## 2.3 The Harmonic Oscillator

The paradigm for a classical harmonic oscillator is a mass $m$ attached to a spring of force constant $k$. The motion is governed by Hooke's law,

$$
F = -kx = m \frac{d^2 x}{dt^2}
$$

(ignoring friction), and the solution is

$$
x(t) = A \sin(\omega t) + B \cos(\omega t),
$$

where

$$
\omega \equiv \sqrt{\frac{k}{m}} \tag{2.42}
$$

is the (angular) frequency of oscillation. The potential energy is

$$
V(x) = \frac{1}{2}kx^2; \tag{2.43}
$$

its graph is a parabola.

Of course, there's no such thing as a perfect harmonic oscillator—if you stretch it too far the spring is going to break, and typically Hooke's law fails long before that point is reached. But practically any potential is approximately parabolic, in the neighborhood of a local minimum (Figure 2.4). Formally, if we expand $V(x)$ in a Taylor series about the minimum:

$$
V(x) = V(x_0) + V'(x_0)(x - x_0) + \frac{1}{2}V''(x_0)(x - x_0)^2 + \cdots,
$$

subtract $V(x_0)$ (you can add a constant to $V(x)$ with impunity, since that doesn't change the force), recognize that $V'(x_0) = 0$ (since $x_0$ is a minimum), and drop the higher-order terms (which are negligible as long as $(x - x_0)$ stays small), we get

$$
V(x) \approx \frac{1}{2}V''(x_0)(x - x_0)^2,
$$

which describes simple harmonic oscillation (about the point $x_0$), with an effective spring constant $k = V''(x_0)$. That's why the simple harmonic oscillator is so important: Virtually any oscillatory motion is approximately simple harmonic, as long as the amplitude is small.²²

![img-20.jpeg](img-20.jpeg)
Figure 2.4: Parabolic approximation (dashed curve) to an arbitrary potential, in the neighborhood of a local minimum.

The quantum problem is to solve the Schrödinger equation for the potential

$$
V (x) = \frac {1}{2} m \omega^ {2} x ^ {2} \tag {2.44}
$$

(it is customary to eliminate the spring constant in favor of the classical frequency, using Equation 2.42). As we have seen, it suffices to solve the time-independent Schrödinger equation:

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} + \frac {1}{2} m \omega^ {2} x ^ {2} \psi = E \psi . \tag {2.45}
$$

In the literature you will find two entirely different approaches to this problem. The first is a straightforward "brute force" solution to the differential equation, using the power series method; it has the virtue that the same strategy can be applied to many other potentials (in fact, we'll use it in Chapter 4 to treat the hydrogen atom). The second is a diabolically clever algebraic technique, using so-called ladder operators. I'll show you the algebraic method first, because it is quicker and simpler (and a lot more fun);[23] if you want to skip the power series method for now, that's fine, but you should certainly plan to study it at some stage.

59

## 2.3.1 Algebraic Method

To begin with, let's rewrite Equation 2.45 in a more suggestive form:

$$
\frac {1}{2 m} \left[ \hat {p} ^ {2} + (m \omega x) ^ {2} \right] \psi = E \psi , \tag {2.46}
$$

where $\hat{p} \equiv -i\hbar d / dx$ is the momentum operator.²⁴ The basic idea is to factor the Hamiltonian,

$$
\hat {H} = \frac {1}{2 m} \left[ \hat {p} ^ {2} + (m \omega x) ^ {2} \right]. \tag {2.47}
$$

If these were numbers, it would be easy:

$$
u ^ {2} + v ^ {2} = (i u + v) (- i u + v).
$$

Here, however, it's not quite so simple, because $\hat{p}$ and $x$ are operators, and operators do not, in general, commute ($x\hat{p}$ is not the same as $\hat{p} x$, as we'll see in a moment—though you might want to stop right now and think it through for yourself). Still, this does motivate us to examine the quantities

$$
\hat {a} _ {\pm} \equiv \frac {1}{\sqrt {2 \hbar m \omega}} (\mp i \hat {p} + m \omega x) \tag {2.48}
$$

(the factor in front is just there to make the final results look nicer).

Well, what is the product $\hat{a}_{-}\hat{a}_{+}$?

$$
\begin{array}{l} \hat {a} _ {-} \hat {a} _ {+} = \frac {1}{2 \hbar m \omega} (i \hat {p} + m \omega x) (- i \hat {p} + m \omega x) \\ = \frac {1}{2 \hbar m \omega} \left[ \hat {p} ^ {2} + (m \omega x) ^ {2} - i m \omega (x \hat {p} - \hat {p} x) \right]. \\ \end{array}
$$

As anticipated, there's an extra term, involving $\left(x\hat{p} -\hat{p} x\right)$. We call this the commutator of $x$ and $\hat{p}$, it is a measure of how badly they fail to commute. In general, the commutator of operators $\hat{A}$ and $\hat{B}$ (written with square brackets) is

$$
\left[ \hat {A}, \hat {B} \right] \equiv \hat {A} \hat {B} - \hat {B} \hat {A}. \tag {2.49}
$$

In this notation,

$$
\hat {a} _ {-} \hat {a} _ {+} = \frac {1}{2 \hbar m \omega} \left[ \hat {p} ^ {2} + (m \omega x) ^ {2} \right] - \frac {i}{2 \hbar} [ x, \hat {p} ]. \tag {2.50}
$$

We need to figure out the commutator of $x$ and $\hat{p}$. Warning: Operators are notoriously slippery to work with in the abstract, and you are bound to make mistakes unless you give them a "test function," $f(x)$, to act on. At the end you can throw away the test function, and you'll be left with an equation involving the operators alone. In the present case we have:

$$
\begin{array}{l} \left[ x, \hat {p} \right] f (x) = \left[ x (- i \hbar) \frac {d}{d x} (f) - (- i \hbar) \frac {d}{d x} (x f) \right] = - i \hbar \left(x \frac {d f}{d x} - x \frac {d f}{d x} - f\right) \tag {2.51} \\ = i \hbar f (x). \\ \end{array}
$$

Dropping the test function, which has served its purpose,

$$
\left[ x, \hat {p} \right] = i \hbar . \tag {2.52}
$$

This lovely and ubiquitous formula is known as the canonical commutation relation.²⁵

With this, Equation 2.50 becomes

$$
\hat {a} _ {-} \hat {a} _ {+} = \frac {1}{\hbar \omega} \hat {H} + \frac {1}{2}, \tag {2.53}
$$

or

$$
\hat {H} = \hbar \omega \left(\hat {a} _ {-} \hat {a} _ {+} - \frac {1}{2}\right). \tag {2.54}
$$

Evidently the Hamiltonian does not factor perfectly—there's that extra $-1/2$ on the right. Notice that the ordering of $\hat{a}_{+}$ and $\hat{a}_{-}$ is important here; the same argument, with $\hat{a}_{+}$ on the left, yields

$$
\hat {a} _ {+} \hat {a} _ {-} = \frac {1}{\hbar \omega} \hat {H} - \frac {1}{2}. \tag {2.55}
$$

In particular,

$$
\left[ \hat {a} _ {-}, \hat {a} _ {+} \right] = 1. \tag {2.56}
$$

Meanwhile, the Hamiltonian can equally well be written

$$
\hat {H} = \hbar \omega \left(\hat {a} _ {+} \hat {a} _ {-} + \frac {1}{2}\right). \tag {2.57}
$$

In terms of $\hat{a}_{\pm}$, then, the Schrödinger equation²⁶ for the harmonic oscillator takes the form

$$
\hbar \omega \left(\hat {a} _ {\pm} \hat {a} _ {\mp} \pm \frac {1}{2}\right) \psi = E \psi \tag {2.58}
$$

(in equations like this you read the upper signs all the way across, or else the lower signs).

Now, here comes the crucial step: I claim that:

If $\psi$ satisfies the Schrödinger equation with energy $E$ (that is: $\hat{H}\psi = E\psi$), then $\hat{a}_{+}\psi$ satisfies the Schrödinger equation with energy $(E + \hbar \omega)$: $\hat{H} (\hat{a}_{+}\psi) = (E + \hbar \omega)(\hat{a}_{+}\psi)$.

**Proof:**

$$
\begin{array}{l}
\hat {H} (\hat {a} _ {+} \psi) = \hbar \omega (\hat {a} _ {+} \hat {a} _ {-} + \frac {1}{2}) (\hat {a} _ {+} \psi) = \hbar \omega (\hat {a} _ {+} \hat {a} _ {-} \hat {a} _ {+} + \frac {1}{2} \hat {a} _ {+}) \psi \\
= \hbar \omega \hat {a} _ {+} \left(\hat {a} _ {-} \hat {a} _ {+} + \frac {1}{2}\right) \psi = \hat {a} _ {+} \left[ \hbar \omega \left(\hat {a} _ {+} \hat {a} _ {-} + 1 + \frac {1}{2}\right) \psi \right] \\
= \hat {a} _ {+} (\hat {H} + \hbar \omega) \psi = \hat {a} _ {+} (E + \hbar \omega) \psi = (E + \hbar \omega) (\hat {a} _ {+} \psi). \quad \mathrm{QED}
\end{array}
$$

(I used Equation 2.56 to replace  $\hat{a}_{-}\hat{a}_{+}$  by  $(\hat{a}_{+}\hat{a}_{-} + 1)$  in the second line. Notice that whereas the ordering of  $\hat{a}_{+}$  and  $\hat{a}_{-}$  does matter, the ordering of  $\hat{a}_{\pm}$  and any constants—such as  $\hbar$ ,  $\omega$ , and  $E$ —does not; an operator commutes with any constant.)

By the same token,  $\hat{a}_{-}\psi$  is a solution with energy  $(E - \hbar \omega)$ :

$$
\begin{array}{l} \hat {H} (\hat {a} _ {-} \psi) = \hbar \omega (\hat {a} _ {-} \hat {a} _ {+} - \frac {1}{2}) (\hat {a} _ {-} \psi) = \hbar \omega \hat {a} _ {-} (\hat {a} _ {+} \hat {a} _ {-} - \frac {1}{2}) \psi \\ = \hat {a} _ {-} \left[ \hbar \omega \left(\hat {a} _ {-} \hat {a} _ {+} - 1 - \frac {1}{2}\right) \psi \right] = \hat {a} _ {-} \left(\hat {H} - \hbar \omega\right) \psi = \hat {a} _ {-} (E - \hbar \omega) \psi \\ = (E - \hbar \omega) (\hat {a} _ {-} \psi). \\ \end{array}
$$

Here, then, is a wonderful machine for generating new solutions, with higher and lower energies—if we could just find one solution, to get started! We call  $\hat{a}_{\pm}$  ladder operators, because they allow us to climb up and down in energy;  $\hat{a}_{+}$  is the raising operator, and  $\hat{a}_{-}$  the lowering operator. The "ladder" of states is illustrated in Figure 2.5.

![img-21.jpeg](img-21.jpeg)
Figure 2.5: The "ladder" of states for the harmonic oscillator.

But wait! What if I apply the lowering operator repeatedly? Eventually I'm going to reach a state with energy less than zero, which (according to the general theorem in Problem 2.3) does not exist! At some point the machine must fail. How can that happen? We know that  $\hat{a}_{-}\psi$  is a new solution to the Schrödinger

equation, but there is no guarantee that it will be normalizable—it might be zero, or its square-integral might be infinite. In practice it is the former: There occurs a "lowest rung" (call it $\psi_0$) such that

$$
\hat{a}_{-} \psi_{0} = 0. \tag{2.59}
$$

We can use this to determine $\psi_0(x)$:

$$
\frac{1}{\sqrt{2 \hbar m \omega}} \left( \hbar \frac{d}{dx} + m \omega x \right) \psi_{0} = 0,
$$

or

$$
\frac{d \psi_{0}}{dx} = - \frac{m \omega}{\hbar} x \psi_{0}.
$$

This differential equation is easy to solve:

$$
\int \frac{d \psi_{0}}{\psi_{0}} = - \frac{m \omega}{\hbar} \int x \, dx \quad \Rightarrow \quad \ln \psi_{0} = - \frac{m \omega}{2 \hbar} x^{2} + \text{constant},
$$

so

$$
\psi_{0}(x) = A e^{-\frac{m \omega}{2 \hbar} x^{2}}.
$$

We might as well normalize it right away:

$$
1 = |A|^{2} \int_{-\infty}^{\infty} e^{-m \omega x^{2}/\hbar} dx = |A|^{2} \sqrt{\frac{\pi \hbar}{m \omega}},
$$

so $A^{2} = \sqrt{m\omega / \pi\hbar}$, and hence

$$
\psi_{0}(x) = \left( \frac{m \omega}{\pi \hbar} \right)^{1/4} e^{-\frac{m \omega}{2 \hbar} x^{2}}. \tag{2.60}
$$

To determine the energy of this state we plug it into the Schrödinger equation (in the form of Equation 2.58), $\hbar \omega \left( \hat{a}_{+} \hat{a}_{-} + 1/2 \right) \psi_{0} = E_{0} \psi_{0}$, and exploit the fact that $\hat{a}_{-} \psi_{0} = 0$:

$$
E_{0} = \frac{1}{2} \hbar \omega. \tag{2.61}
$$

With our foot now securely planted on the bottom rung (the ground state of the quantum oscillator), we simply apply the raising operator (repeatedly) to generate the excited states,²² increasing the energy by $\hbar \omega$ with each step:

$$
\psi_{n}(x) = A_{n} \left( \hat{a}_{+} \right)^{n} \psi_{0}(x), \quad \text{with} \quad E_{n} = \left( n + \frac{1}{2} \right) \hbar \omega, \tag{2.62}
$$

where $A_{n}$ is the normalization constant. By applying the raising operator (repeatedly) to $\psi_{0}$, then, we can (in principle) construct all²⁸ the stationary states of the harmonic oscillator. Meanwhile, without ever doing that explicitly, we have determined the allowed energies!

62

63

# Example 2.4

Find the first excited state of the harmonic oscillator.

Solution: Using Equation 2.62,

$$
\psi_{1}(x) = A_{1} \hat{a}_{+} \psi_{0} = \frac{A_{1}}{\sqrt{2 \hbar m \omega}} \left(- \hbar \frac{d}{dx} + m \omega x\right) \left(\frac{m \omega}{\pi \hbar}\right)^{1/4} e^{-\frac{m \omega}{2 \hbar} x^{2}} \tag{2.63}
= A_{1} \left(\frac{m \omega}{\pi \hbar}\right)^{1/4} \sqrt{\frac{2 m \omega}{\hbar}} x e^{-\frac{m \omega}{2 \hbar} x^{2}}.
$$

We can normalize it "by hand":

$$
\int |\psi_{1}|^{2} dx = |A_{1}|^{2} \sqrt{\frac{m \omega}{\pi \hbar}} \left(\frac{2 m \omega}{\hbar}\right) \int_{-\infty}^{\infty} x^{2} e^{-\frac{m \omega}{\hbar} x^{2}} dx = |A_{1}|^{2},
$$

so, as it happens, $A_{1} = 1$.

I wouldn't want to calculate $\psi_{50}$ this way (applying the raising operator fifty times!), but never mind: In principle Equation 2.62 does the job—except for the normalization.

You can even get the normalization algebraically, but it takes some fancy footwork, so watch closely. We know that $\hat{a}_{\pm} \psi_{n}$ is proportional to $\psi_{n \pm 1}$,

$$
\hat{a}_{+} \psi_{n} = c_{n} \psi_{n+1}, \quad \hat{a}_{-} \psi_{n} = d_{n} \psi_{n-1} \tag{2.64}
$$

but what are the proportionality factors, $c_{n}$ and $d_{n}$? First note that for "any" functions $f(x)$ and $g(x)$,

$$
\int_{-\infty}^{\infty} f^{*} (\hat{a}_{\pm} g) dx = \int_{-\infty}^{\infty} (\hat{a}_{\mp} f)^{*} g dx. \tag{2.65}
$$

In the language of linear algebra, $\hat{a}_{\mp}$ is the hermitian conjugate (or adjoint) of $\hat{a}_{\pm}$.

## Proof:

$$
\int_{-\infty}^{\infty} f^{*} (\hat{a}_{\pm} g) dx = \frac{1}{\sqrt{2 \hbar m \omega}} \int_{-\infty}^{\infty} f^{*} \left(\mp \hbar \frac{d}{dx} + m \omega x\right) g dx,
$$

and integration by parts takes $\int f^{*} (dg/dx) dx$ to $-\int (df/dx)^{*} g dx$ (the boundary terms vanish, for the reason indicated in footnote 29), so

$$
\begin{aligned}
\int_{-\infty}^{\infty} f^{*} (\hat{a}_{\pm} g) dx &amp;= \frac{1}{\sqrt{2 \hbar m \omega}} \int_{-\infty}^{\infty} \left[ \left(\pm \hbar \frac{d}{dx} + m \omega x\right) f \right]^{*} g dx \\
&amp;= \int_{-\infty}^{\infty} (\hat{a}_{\pm} f)^{*} g dx. \quad \text{QED}
\end{aligned}
$$

In particular,

$$
\int_{-\infty}^{\infty} (\hat{a}_{\pm} \psi_{n})^{*} (\hat{a}_{\pm} \psi_{n}) dx = \int_{-\infty}^{\infty} (\hat{a}_{\mp} \hat{a}_{\pm} \psi_{n})^{*} \psi_{n} dx.
$$

But (invoking Equations 2.58 and 2.62)

$$
\hat{a}_{+} \hat{a}_{-} \psi_{n} = n \psi_{n}, \quad \hat{a}_{-} \hat{a}_{+} \psi_{n} = (n + 1) \psi_{n}, \tag{2.66}
$$

so

$$
\begin{aligned}
&amp; \int_{-\infty}^{\infty} \left(\hat{a}_{+} \psi_{n}\right)^{*} \left(\hat{a}_{+} \psi_{n}\right) dx = |c_{n}|^{2} \int |\psi_{n + 1}|^{2} dx = (n + 1) \int_{-\infty}^{\infty} |\psi_{n}|^{2} dx, \\
&amp; \int_{-\infty}^{\infty} \left(\hat{a}_{-} \psi_{n}\right)^{*} \left(\hat{a}_{-} \psi_{n}\right) dx = |d_{n}|^{2} \int |\psi_{n - 1}|^{2} dx = n \int_{-\infty}^{\infty} |\psi_{n}|^{2} dx.
\end{aligned}
$$

But since $\psi_{n}$ and $\psi_{n\pm 1}$ are normalized, it follows that $|c_{n}|^{2} = n + 1$ and $|d_{n}|^{2} = n$, and hence

$$
\hat{a}_{+} \psi_{n} = \sqrt{n + 1} \psi_{n + 1}, \quad \hat{a}_{-} \psi_{n} = \sqrt{n} \psi_{n - 1}. \tag{2.67}
$$

Thus

$$
\psi_{1} = \hat{a}_{+} \psi_{0}, \quad \psi_{2} = \frac{1}{\sqrt{2}} \hat{a}_{+} \psi_{1} = \frac{1}{\sqrt{2}} \left(\hat{a}_{+}\right)^{2} \psi_{0},
$$

$$
\psi_{3} = \frac{1}{\sqrt{3}} \hat{a}_{+} \psi_{2} = \frac{1}{\sqrt{3 \cdot 2}} \left(\hat{a}_{+}\right)^{3} \psi_{0}, \quad \psi_{4} = \frac{1}{\sqrt{4}} \hat{a}_{+} \psi_{3} = \frac{1}{\sqrt{4 \cdot 3 \cdot 2}} \left(\hat{a}_{+}\right)^{4} \psi_{0},
$$

and so on. Clearly

$$
\psi_{n} = \frac{1}{\sqrt{n!}} \left(\hat{a}_{+}\right)^{n} \psi_{0}, \tag{2.68}
$$

which is to say that the normalization factor in Equation 2.62 is $A_{n} = 1 / \sqrt{n!}$ (in particular, $A_{1} = 1$, confirming our result in Example 2.4).

As in the case of the infinite square well, the stationary states of the harmonic oscillator are orthogonal:

$$
\int_{-\infty}^{\infty} \psi_{m}^{*} \psi_{n} dx = \delta_{mn}. \tag{2.69}
$$

This can be proved using Equation 2.66, and Equation 2.65 twice—first moving $\hat{a}_{+}$ and then moving $\hat{a}_{-}$:

$$
\begin{aligned}
\int_{-\infty}^{\infty} \psi_{m}^{*} \left(\hat{a}_{+} \hat{a}_{-}\right) \psi_{n} dx &amp;= n \int_{-\infty}^{\infty} \psi_{m}^{*} \psi_{n} dx \\
&amp;= \int_{-\infty}^{\infty} \left(\hat{a}_{-} \psi_{m}\right)^{*} \left(\hat{a}_{-} \psi_{n}\right) dx = \int_{-\infty}^{\infty} \left(\hat{a}_{+} \hat{a}_{-} \psi_{m}\right)^{*} \psi_{n} dx \\
&amp;= m \int_{-\infty}^{\infty} \psi_{m}^{*} \psi_{n} dx.
\end{aligned}
$$

Unless $m = n$, then, $\int \psi_{m}^{*} \psi_{n} dx$ must be zero. Orthonormality means that we can again use Fourier's trick (Equation 2.37) to evaluate the coefficients $c_{n}$, when we expand $\Psi(x, 0)$ as a linear combination of stationary states (Equation 2.16). As always, $|c_{n}|^{2}$ is the probability that a measurement of the energy would yield the value $E_{n}$.

64

65

# Example 2.5

Find the expectation value of the potential energy in the $n$th stationary state of the harmonic oscillator.

**Solution:**

$$
\langle V \rangle = \left\langle \frac {1}{2} m \omega^ {2} x ^ {2} \right\rangle = \frac {1}{2} m \omega^ {2} \int_ {- \infty} ^ {\infty} \psi_ {n} ^ {+} x ^ {2} \psi_ {n} d x.
$$

There's a beautiful device for evaluating integrals of this kind (involving powers of $x$ or $\hat{p}$): Use the definition (Equation 2.48) to express $x$ and $\hat{p}$ in terms of the raising and lowering operators:

(2.70)

$$
x = \sqrt {\frac {\hbar}{2 m \omega}} \left(\hat {a} _ {+} + \hat {a} _ {-}\right); \quad \hat {p} = i \sqrt {\frac {\hbar m \omega}{2}} \left(\hat {a} _ {+} - \hat {a} _ {-}\right).
$$

In this example we are interested in $x^2$:

$$
x ^ {2} = \frac {\hbar}{2 m \omega} \left[ \left(\hat {a} _ {+}\right) ^ {2} + \left(\hat {a} _ {+} \hat {a} _ {-}\right) + \left(\hat {a} _ {-} \hat {a} _ {+}\right) + \left(\hat {a} _ {-}\right) ^ {2} \right].
$$

So

$$
\langle V \rangle = \frac {\hbar \omega}{4} \int_ {- \infty} ^ {\infty} \psi_ {n} ^ {+} \left[ \left(\hat {a} _ {+}\right) ^ {2} + \left(\hat {a} _ {+} \hat {a} _ {-}\right) + \left(\hat {a} _ {-} \hat {a} _ {+}\right) + \left(\hat {a} _ {-}\right) ^ {2} \right] \psi_ {n} d x.
$$

But $\left(\hat{a}_{+}\right)^{2}\psi_{n}$ is (apart from normalization) $\psi_{n + 2}$, which is orthogonal to $\psi_{n}$, and the same goes for $\left(\hat{a}_{-}\right)^{2}\psi_{n}$, which is proportional to $\psi_{n - 2}$. So those terms drop out, and we can use Equation 2.66 to evaluate the remaining two:

$$
\langle V \rangle = \frac {\hbar \omega}{4} (n + n + 1) = \frac {1}{2} \hbar \omega \left(n + \frac {1}{2}\right).
$$

As it happens, the expectation value of the potential energy is exactly half the total (the other half, of course, is kinetic). This is a peculiarity of the harmonic oscillator, as we'll see later on (Problem 3.37).

*

# Problem 2.10

(a) Construct $\psi_{2}(x)$.
(b) Sketch $\psi_0, \psi_1$, and $\psi_{2}$.
(c) Check the orthogonality of $\psi_0$, $\psi_1$, and $\psi_2$, by explicit integration. Hint: If you exploit the even-ness and odd-ness of the functions, there is really only one integral left to do.

*

# Problem 2.11

(a) Compute $\langle x\rangle, \langle p\rangle, \langle x^2\rangle$, and $\langle p^2\rangle$, for the states $\psi_0$ (Equation 2.60) and $\psi_{1}$ (Equation 2.63), by explicit integration. Comment: In this and other problems involving the harmonic oscillator it simplifies matters if you

introduce the variable  $\xi \equiv \sqrt{m\omega / \hbar} x$  and the constant  $\alpha \equiv (m\omega /\pi \hbar)^{1 / 4}$

(b) Check the uncertainty principle for these states.
(c) Compute  $\langle T\rangle$  and  $\langle V\rangle$  for these states. (No new integration allowed!) Is their sum what you would expect?

Problem 2.12 Find  $\langle x\rangle ,\langle p\rangle ,\langle x^2\rangle ,\langle p^2\rangle$  , and  $\langle T\rangle$  , for the nth stationary state of the harmonic oscillator, using the method of Example 2.5. Check that the uncertainty principle is satisfied.

Problem 2.13 A particle in the harmonic oscillator potential starts out in the state

$\Psi (x,0) = A\left[3\psi_0(x) + 4\psi_1(x)\right].$

(a) Find  $\mathcal{A}$ .
(b) Construct  $\Psi(x, t)$  and  $|\Psi(x, t)|^2$ . Don't get too excited if  $|\Psi(x, t)|^2$  oscillates at exactly the classical frequency; what would it have been had I specified  $\psi_2(x)$ , instead of  $\psi_1(x)$ ?[31]
(c) Find  $\langle x\rangle$  and  $\langle p\rangle$ . Check that Ehrenfest's theorem (Equation 1.38) holds, for this wave function.
(d) If you measured the energy of this particle, what values might you get, and with what probabilities?

67

## 2.3.2 Analytic Method

We return now to the Schrödinger equation for the harmonic oscillator,

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} + \frac {1}{2} m \omega^ {2} x ^ {2} \psi = E \psi , \tag {2.71}
$$

and solve it directly, by the power series method. Things look a little cleaner if we introduce the dimensionless variable

$$
\xi \equiv \sqrt {\frac {m \omega}{\hbar}} x; \tag {2.72}
$$

in terms of  $\xi$  the Schrödinger equation reads

$$
\frac {d ^ {2} \psi}{d \xi^ {2}} = (\xi^ {2} - K) \psi , \tag {2.73}
$$

where  $K$  is the energy, in units of  $(1 / 2)\hbar \omega$ :

$$
K \equiv \frac {2 E}{\hbar \omega}. \tag {2.74}
$$

Our problem is to solve Equation 2.73, and in the process obtain the "allowed" values of  $K$  (and hence of  $E$ ).

To begin with, note that at very large  $\xi$  (which is to say, at very large  $x$ ),  $\xi^2$  completely dominates over the constant  $K$ , so in this regime

$$
\frac {d ^ {2} \psi}{d \xi^ {2}} \approx \xi^ {2} \psi , \tag {2.75}
$$

which has the approximate solution (check it!)

$$
\psi (\xi) \approx A e ^ {- \xi^ {2} / 2} + B e ^ {+ \xi^ {2} / 2}. \tag {2.76}
$$

The  $B$  term is clearly not normalizable (it blows up as  $|x| \to \infty$ ); the physically acceptable solutions, then, have the asymptotic form

$$
\psi (\xi) \rightarrow ( ) e ^ {- \xi^ {2} / 2}, \quad \text{at large} \xi . \tag {2.77}
$$

This suggests that we "peel off" the exponential part,

$$
\psi (\xi) = h (\xi) e ^ {- \xi^ {2} / 2}, \tag {2.78}
$$

in hopes that what remains,  $h(\xi)$ , has a simpler functional form than  $\psi(\xi)$  itself.²² Differentiating Equation 2.78,

$$
\frac {d \psi}{d \xi} = \left(\frac {d h}{d \xi} - \xi h\right) e ^ {- \xi^ {2} / 2},
$$

and

$$
\frac {d ^ {2} \psi}{d \xi^ {2}} = \left(\frac {d ^ {2} h}{d \xi^ {2}} - 2 \xi \frac {d h}{d \xi} + (\xi^ {2} - 1) h\right) e ^ {- \xi^ {2} / 2},
$$

so the Schrödinger equation (Equation 2.73) becomes

$$
\frac {d ^ {2} h}{d \xi^ {2}} - 2 \xi \frac {d h}{d \xi} + (K - 1) h = 0. \tag {2.79}
$$

I propose to look for solutions to Equation 2.79 in the form of power series in  $\xi$ 33

$$
h (\xi) = a _ {0} + a _ {1} \xi + a _ {2} \xi^ {2} + \dots = \sum_ {j = 0} ^ {\infty} a _ {j} \xi^ {j}. \tag {2.80}
$$

Differentiating the series term by term,

$$
\frac {d h}{d \xi} = a _ {1} + 2 a _ {2} \xi + 3 a _ {3} \xi^ {2} + \dots = \sum_ {j = 0} ^ {\infty} j a _ {j} \xi^ {j - 1},
$$

and

$$
\frac {d ^ {2} h}{d \xi^ {2}} = 2 a _ {2} + 2 \cdot 3 a _ {3} \xi + 3 \cdot 4 a _ {4} \xi^ {2} + \dots = \sum_ {j = 0} ^ {\infty} (j + 1) (j + 2) a _ {j + 2} \xi^ {j}.
$$

Putting these into Equation 2.80, we find

$$
\sum_ {j = 0} ^ {\infty} \left[ (j + 1) (j + 2) a _ {j + 2} - 2 j a _ {j} + (K - 1) a _ {j} \right] \xi^ {j} = 0. \tag {2.81}
$$

It follows (from the uniqueness of power series expansions $^{34}$ ) that the coefficient of each power of  $\xi$  must vanish,

$$
(j + 1) (j + 2) a _ {j + 2} - 2 j a _ {j} + (K - 1) a _ {j} = 0,
$$

and hence that

$$
a _ {j + 2} = \frac {(2 j + 1 - K)}{(j + 1) (j + 2)} a _ {j}. \tag {2.82}
$$

This recursion formula is entirely equivalent to the Schrödinger equation. Starting with  $a_0$ , it generates all the even-numbered coefficients:

$$
a _ {2} = \frac {(1 - K)}{2} a _ {0}, \quad a _ {4} = \frac {(5 - K)}{12} a _ {2} = \frac {(5 - K) (1 - K)}{24} a _ {0}, \quad \ldots ,
$$

and starting with  $a_1$ , it generates the odd coefficients:

$$
a _ {3} = \frac {(3 - K)}{6} a _ {1}, \quad a _ {5} = \frac {(7 - K)}{20} a _ {3} = \frac {(7 - K) (3 - K)}{120} a _ {1}, \quad \ldots .
$$

We write the complete solution as

$$
h (\xi) = h _ {\text {even}} (\xi) + h _ {\text {odd}} (\xi), \tag {2.83}
$$

where

$h_{\text{even}}\ (\xi)\equiv a_{0}+a_{2}\xi^{2}+a_{4}\xi^{4}+\cdots$

is an even function of $\xi$, built on $a_{0}$, and

$h_{\text{odd}}\ (\xi)\equiv a_{1}\xi+a_{3}\xi^{3}+a_{5}\xi^{5}+\cdots$

is an odd function, built on $a_{1}$. Thus Equation 2.82 determines $h\ (\xi)$ in terms of two arbitrary constants ($a_{0}$ and $a_{1}$)—which is just what we would expect, for a second-order differential equation.

However, not all the solutions so obtained are *normalizable*. For at very large $j$, the recursion formula becomes (approximately)

$a_{j+2}\approx\frac{2}{j}a_{j}\,,$

with the (approximate) solution

$a_{j}\approx\frac{C}{(j/2)!}\,,$

for some constant $C$, and this yields (at large $\xi$, where the higher powers dominate)

$h\ (\xi)\approx C\sum\frac{1}{(j/2)!}\xi^{j}\approx C\sum\frac{1}{j!}\xi^{2j}\approx Ce^{\xi^{2}}\,.$

Now, if $b$ goes like $\exp\left(\xi^{2}\right)$, then $\psi$ (remember $\psi$?—that’s what we’re trying to calculate) goes like $\exp\left(\xi^{2}/2\right)$ (Equation 2.78), which is precisely the asymptotic behavior we *didn’t* want. There is only one way to wiggle out of this: For normalizable solutions *the power series must terminate*. There must occur some “highest” $j$ (call it $n$), such that the recursion formula spits out $a_{n+2}=0$ (this will truncate *either* the series $h_{\text{even}}$ *or* the series $h_{\text{odd}}$; the *other* one must be zero from the start: $a_{1}=0$ if $n$ is even, and $a_{0}=0$ if $n$ is odd). For physically acceptable solutions, then, Equation 2.82 requires that

$K=2n+1,$

for some positive integer $n$, which is to say (referring to Equation 2.74) that the *energy* must be

$E_{n}=\left(n+\frac{1}{2}\right)\hbar\omega,\quad\text{for }n=0,1,2,\dots.$ (2.84)

Thus we recover, by a completely different method, the fundamental quantization condition we found algebraically in Equation 2.62.

It seems at first rather surprising that the quantization of energy should emerge from a technical detail in the power series solution to the Schrödinger equation, but let’s look at it from a different perspective. Equation 2.71 has solutions, of course, for *any* value of $E$ (in fact, it has *two* linearly independent solutions for every $E$). But almost all of these solutions blow up exponentially at large $x$, and hence are not normalizable. Imagine, for example, using an $E$ that is slightly *less* than one of the allowed values (say, $0.49\hbar\omega$), and plotting the solution: Figure 2.6(a). Now try an $E$ slightly *larger* (say, $0.51\hbar\omega$); the “tail” now blows up in the *other* direction (Figure 2.6(b)). As you tweak the parameter in tiny increments from 0.49 to 0.51, the graph

"flips over" at precisely the value 0.5—only here does the solution escape the exponential asymptotic growth that renders it physically unacceptable.[36]

![img-22.jpeg](img-22.jpeg)

![img-23.jpeg](img-23.jpeg)
Figure 2.6: Solutions to the Schrödinger equation for (a)  $E = 0.49\hbar \omega$ , and (b)  $E = 0.51\hbar \omega$ .

For the allowed values of  $K$ , the recursion formula reads

$$
a _ {j + 2} = \frac {- 2 (n - j)}{(j + 1) (j + 2)} a _ {j}. \tag {2.85}
$$

If  $n = 0$ , there is only one term in the series (we must pick  $a_1 = 0$  to kill  $h_{\mathrm{odd}}$ , and  $j = 0$  in Equation 2.85 yields  $a_2 = 0$ ):

$h_0(\xi) = a_0$

and hence

$$
\psi_ {0} (\xi) = a _ {0} e ^ {- \xi^ {2} / 2}
$$

(which, apart from the normalization, reproduces Equation 2.60). For  $n = 1$  we take  $a_0 = 0$ , and Equation 2.85 with  $j = 1$  yields  $a_3 = 0$ , so

$h_1(\xi) = a_1\xi$

and hence

$$
\psi_ {1} (\xi) = a _ {1} \xi e ^ {- \xi^ {2} / 2}
$$

(confirming Equation 2.63). For  $n = 2$ ,  $j = 0$  yields  $a_2 = -2a_0$ , and  $j = 2$  gives  $a_4 = 0$ , so

$h_2(\xi) = a_0\left(1 - 2\xi^2\right),$

and

$\psi_{2}(\xi) = a_{0}\left(1 - 2\xi^{2}\right)e^{-\xi^{2} / 2},$

and so on. (Compare Problem 2.10, where this last result was obtained by algebraic means).

In general,  $h_n(\xi)$  will be a polynomial of degree  $n$  in  $\xi$ , involving even powers only, if  $n$  is an even integer, and odd powers only, if  $n$  is an odd integer. Apart from the overall factor  $(a_0 \text{ or } a_1)$  they are the so-called Hermite polynomials,  $H_n(\xi)$ . The first few of them are listed in Table 2.1. By tradition, the arbitrary multiplicative factor is chosen so that the coefficient of the highest power of  $\xi$  is  $2^n$ . With this convention, the normalized stationary states for the harmonic oscillator are

$$
\psi_ {n} (x) = \left(\frac {m \omega}{\pi \hbar}\right) ^ {1 / 4} \frac {1}{\sqrt {2 ^ {n} n !}} H _ {n} (\xi) e ^ {- \xi^ {2} / 2}. \tag {2.86}
$$

They are identical (of course) to the ones we obtained algebraically in Equation 2.68.

Table 2.1: The first few Hermite polynomials,  $H_{n}(\xi)$ .

|  H0=1,  |
| --- |
|  H1=2ξ,  |
|  H2=4ξ2-2,  |
|  H3=8ξ3-12ξ,  |
|  H4=16ξ4-48ξ2+12,  |
|  H5=32ξ5-160ξ3+120ξ.  |

In Figure 2.7(a) I have plotted  $\psi_{n}(x)$  for the first few ns. The quantum oscillator is strikingly different from its classical counterpart—not only are the energies quantized, but the position distributions have some bizarre features. For instance, the probability of finding the particle outside the classically allowed range (that is, with  $x$  greater than the classical amplitude for the energy in question) is not zero (see Problem 2.14), and in all odd states the probability of finding the particle at the center is zero. Only at large  $n$  do we begin to see some resemblance to the classical case. In Figure 2.7(b) I have superimposed the classical position distribution (Problem 1.11) on the quantum one (for  $n = 60$ ); if you smoothed out the bumps, the two would fit pretty well.

![img-24.jpeg](img-24.jpeg)
(a)

![img-25.jpeg](img-25.jpeg)
(b)
Figure 2.7: (a) The first four stationary states of the harmonic oscillator. (b) Graph of  $|\psi_{60}|^2$ , with the classical distribution (dashed curve) superimposed.

Problem 2.14 In the ground state of the harmonic oscillator, what is the probability (correct to three significant digits) of finding the particle outside the classically allowed region? Hint: Classically, the energy of an oscillator is  $E = (1/2)ka^2 = (1/2)m\omega^2a^2$ , where  $a$  is the amplitude. So the "classically allowed region" for an oscillator of energy  $E$  extends from  $-\sqrt{2E/m\omega^2}$  to  $+\sqrt{2E/m\omega^2}$ . Look in a math table under "Normal Distribution" or "Error Function" for the numerical value of the integral, or evaluate it by computer.

Problem 2.15 Use the recursion formula (Equation 2.85) to work out $H_5(\xi)$ and $H_6(\xi)$. Invoke the convention that the coefficient of the highest power of $\xi$ is $2^n$ to fix the overall constant.

Problem 2.16 In this problem we explore some of the more useful theorems (stated without proof) involving Hermite polynomials.

(a) The Rodrigues formula says that

$$
H_n(\xi) = (-1)^n e^{\xi^2} \left(\frac{d}{d\xi}\right)^n e^{-\xi^2}. \tag{2.87}
$$

Use it to derive $H_3$ and $H_4$.

(b) The following recursion relation gives you $H_{n+1}$ in terms of the two preceding Hermite polynomials:

$$
H_{n+1}(\xi) = 2\xi H_n(\xi) - 2n H_{n-1}(\xi). \tag{2.88}
$$

Use it, together with your answer in (a), to obtain $H_5$ and $H_6$.

(c) If you differentiate an $n$th-order polynomial, you get a polynomial of order $(n-1)$. For the Hermite polynomials, in fact,

$$
\frac{dH_n}{d\xi} = 2n H_{n-1}(\xi). \tag{2.89}
$$

Check this, by differentiating $H_5$ and $H_6$.

(d) $H_n(\xi)$ is the $n$th $z$-derivative, at $z = 0$, of the generating function $\exp(-z^2 + 2z\xi)$; or, to put it another way, it is the coefficient of $z^n / n!$ in the Taylor series expansion for this function:

$$
e^{-z^2 + 2z\xi} = \sum_{n=0}^{\infty} \frac{z^n}{n!} H_n(\xi). \tag{2.90}
$$

Use this to obtain $H_1$, $H_2$, and $H_3$.

74

# 2.4 The Free Particle

We turn next to what should have been the simplest case of all: the free particle $(V(x) = 0$ everywhere). Classically this would just be motion at constant velocity, but in quantum mechanics the problem is surprisingly subtle. The time-independent Schrödinger equation reads

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} = E \psi , \tag {2.91}
$$

or

$$
\frac {d ^ {2} \psi}{d x ^ {2}} = - k ^ {2} \psi , \quad \text{where } k \equiv \frac {\sqrt {2 m E}}{\hbar}. \tag {2.92}
$$

So far, it's the same as inside the infinite square well (Equation 2.24), where the potential is also zero; this time, however, I prefer to write the general solution in exponential form (instead of sines and cosines), for reasons that will appear in due course:

$$
\psi (x) = A e ^ {i k x} + B e ^ {- i k x}. \tag {2.93}
$$

Unlike the infinite square well, there are no boundary conditions to restrict the possible values of $k$ (and hence of $E$); the free particle can carry any (positive) energy. Tacking on the standard time dependence, $\exp(-iEt / \hbar)$,

$$
\Psi (x, t) = A e ^ {i k \left(x - \frac {\hbar k}{2 m} t\right)} + B e ^ {- i k \left(x + \frac {\hbar k}{2 m} t\right)}. \tag {2.94}
$$

Now, any function of $x$ and $t$ that depends on these variables in the special combination $(x \pm vt)$ (for some constant $v$) represents a wave of unchanging shape, traveling in the $\mp x$-direction at speed $v$: A fixed point on the waveform (for example, a maximum or a minimum) corresponds to a fixed value of the argument, and hence to $x$ and $t$ such that

$$
x \pm v t = \text{constant}, \quad \text{or} \quad x = \mp v t + \text{constant}.
$$

Since every point on the waveform moves with the same velocity, its shape doesn't change as it propagates. Thus the first term in Equation 2.94 represents a wave traveling to the right, and the second represents a wave (of the same energy) going to the left. By the way, since they only differ by the sign in front of $k$, we might as well write

$$
\Psi_ {k} (x, t) = A e ^ {i \left(k x - \frac {\hbar k ^ {2}}{2 m} t\right)}, \tag {2.95}
$$

and let $k$ run negative to cover the case of waves traveling to the left:

$$
k \equiv \pm \frac {\sqrt {2 m E}}{\hbar}, \quad \text{with} \left\{ \begin{array}{l l} k &gt; 0 \Rightarrow &amp; \text{traveling to the right}, \\ k &lt; 0 \Rightarrow &amp; \text{traveling to the left}. \end{array} \right. \tag {2.96}
$$

Evidently the "stationary states" of the free particle are propagating waves; their wavelength is $\lambda = 2\pi / |k|$, and, according to the de Broglie formula (Equation 1.39), they carry momentum

$$
p = \hbar k. \tag {2.97}
$$

The speed of these waves (the coefficient of $t$ over the coefficient of $x$) is

$$
v _ {\text {quantum}} = \frac {\hbar | k |}{2 m} = \sqrt {\frac {E}{2 m}}. \tag {2.98}
$$

On the other hand, the classical speed of a free particle with energy $E$ is given by $E = (1 / 2)m v^2$ (pure kinetic, since $V = 0$), so

$$
v _ {\text {classical}} = \sqrt {\frac {2 E}{m}} = 2 v _ {\text {quantum}}. \tag {2.99}
$$

Apparently the quantum mechanical wave function travels at half the speed of the particle it is supposed to represent! We'll return to this paradox in a moment—there is an even more serious problem we need to confront first: This wave function is not normalizable:

$$
\int_ {- \infty} ^ {+ \infty} \Psi_ {k} ^ {+} \Psi_ {k} d x = | A | ^ {2} \int_ {- \infty} ^ {+ \infty} d x = | A | ^ {2} (\infty). \tag {2.100}
$$

In the case of the free particle, then, the separable solutions do not represent physically realizable states. A free particle cannot exist in a stationary state; or, to put it another way, there is no such thing as a free particle with a definite energy.

But that doesn't mean the separable solutions are of no use to us. For they play a mathematical role that is entirely independent of their physical interpretation: The general solution to the time-dependent Schrödinger equation is still a linear combination of separable solutions (only this time it's an integral over the continuous variable $k$, instead of a sum over the discrete index $n$):

$$
\Psi (x, t) = \frac {1}{\sqrt {2 \pi}} \int_ {- \infty} ^ {+ \infty} \phi (k) e ^ {i \left(k x - \frac {\hbar k ^ {2}}{2 m} t\right)} d k. \tag {2.101}
$$

(The quantity $1 / \sqrt{2\pi}$ is factored out for convenience; what plays the role of the coefficient $c_{n}$ in Equation 2.17 is the combination $\left(1 / \sqrt{2\pi}\right)\phi (k)dk$.) Now this wave function can be normalized (for appropriate $\phi (k)$). But it necessarily carries a range of $k$, and hence a range of energies and speeds. We call it a wave packet.[40]

In the generic quantum problem, we are given $\Psi(x,0)$, and we are asked to find $\Psi(x,t)$. For a free particle the solution takes the form of Equation 2.101; the only question is how to determine $\phi(k)$ so as to match the initial wave function:

$$
\Psi (x, 0) = \frac {1}{\sqrt {2 \pi}} \int_ {- \infty} ^ {+ \infty} \phi (k) e ^ {i k x} d k. \tag {2.102}
$$

This is a classic problem in Fourier analysis; the answer is provided by Plancherel's theorem (see Problem 2.19):

$$
f (x) = \frac {1}{\sqrt {2 \pi}} \int_ {- \infty} ^ {+ \infty} F (k) e ^ {i k x} d k \iff F (k) = \frac {1}{\sqrt {2 \pi}} \int_ {- \infty} ^ {+ \infty} f (x) e ^ {- i k x} d x. \tag {2.103}
$$

$F(k)$  is called the Fourier transform of  $f(x)$ ;  $f(x)$  is the inverse Fourier transform of  $F(k)$  (the only difference is the sign in the exponent).42 There is, of course, some restriction on the allowable functions: The integrals have to exist.42 For our purposes this is guaranteed by the physical requirement that  $\Psi(x,0)$  itself be normalized. So the solution to the generic quantum problem, for the free particle, is Equation 2.101, with

(2.104)

$\phi (k) = \frac{1}{\sqrt{2\pi}}\int_{-\infty}^{+\infty}\Psi (x,0)e^{-ikx}dx.$

# Example 2.6

A free particle, which is initially localized in the range  $-a &lt; x &lt; a$ , is released at time  $t = 0$ :

$\Psi (x,0) = \left\{ \begin{array}{ll}A, &amp; -a &lt;   x &lt;   a,\\ 0, &amp; \mathrm{otherwise}, \end{array} \right.$

where  $\mathcal{A}$  and  $a$  are positive real constants. Find  $\Psi (x,t)$

Solution: First we need to normalize  $\Psi (x,0)$

$1 = \int_{-\infty}^{\infty}|\Psi (x,0)|^2 dx = |A|^2\int_{-a}^{a}dx = 2a|A|^2\Rightarrow A = \frac{1}{\sqrt{2a}}.$

Next we calculate  $\phi (k)$  , using Equation 2.104:

$\phi (k) = \frac{1}{\sqrt{2\pi}}\frac{1}{\sqrt{2a}}\int_{-a}^{a}e^{-ikx}dx = \frac{1}{2\sqrt{\pi a}}\frac{e^{-ikx}}{-ik}\bigg|_{-a}^{a}$ $= \frac{1}{k\sqrt{\pi a}}\left(\frac{e^{ika} - e^{-ika}}{2i}\right) = \frac{1}{\sqrt{\pi a}}\frac{\sin(ka)}{k}.$

Finally, we plug this back into Equation 2.101:

$\Psi (x,t) = \frac{1}{\pi\sqrt{2a}}\int_{-\infty}^{\infty}\frac{\sin(ka)}{k} e^{i\left(kx - \frac{6k^2}{2m}t\right)}dk.$  (2.105)

Unfortunately, this integral cannot be solved in terms of elementary functions, though it can of course be evaluated numerically (Figure 2.8). (There are, in fact, precious few cases in which the integral for  $\Psi(x,t)$  (Equation 2.101) can be carried out explicitly; see Problem 2.21 for a particularly beautiful example.)

![img-26.jpeg](img-26.jpeg)

In Figure 2.9 I have plotted  $\Psi(x,0)$  and  $\phi(\hat{k})$ . Note that for small  $a, \Psi(x,0)$  is narrow (in  $x$ ), while  $\phi(k)$  is broad (in  $k$ ), and vice versa for large  $a$ . But  $k$  is related to momentum, by Equation 2.97, so this is a manifestation of the uncertainty principle: the position can be well defined (small  $a$ ), or the momentum (large  $a$ ), but not both.

![img-27.jpeg](img-27.jpeg)
Figure 2.8: Graph of  $|\Psi(x,t)|^2$  (Equation 2.105) at  $t = 0$  (the rectangle) and at  $t = ma^2 / \hbar$  (the curve).
Figure 2.9: (a) Graph of  $\Psi(x,0)$ . (b) Graph of  $\phi(\hat{k})$ .

![img-28.jpeg](img-28.jpeg)

I return now to the paradox noted earlier: the fact that the separable solution  $\Psi_{k}(x,t)$  travels at the "wrong" speed for the particle it ostensibly represents. Strictly speaking, the problem evaporated when we discovered that  $\Psi_{k}$  is not a physically realizable state. Nevertheless, it is of interest to figure out how information about the particle velocity is contained in the wave function (Equation 2.101). The essential idea is this: A wave packet is a superposition of sinusoidal functions whose amplitude is modulated by  $\Phi$  (Figure 2.10); it consists of "ripples" contained within an "envelope." What corresponds to the particle velocity is not the speed of the individual ripples (the so-called phase velocity), but rather the speed of the envelope (the group velocity)—which, depending on the nature of the waves, can be greater than, less than, or equal to, the velocity of the ripples that go to make it up. For waves on a string, the group velocity is the same as the phase velocity. For water waves it is one-half the phase velocity, as you may have noticed when you toss a rock into a pond (if you concentrate on a particular ripple, you will see it build up from the rear, move forward through the group, and fade away at the front, while the group as a whole propagates out at half that speed). What I need to show is that for the wave function of a free particle in quantum mechanics the group velocity is twice the phase velocity—just right to match the classical particle speed.

![img-29.jpeg](img-29.jpeg)

Figure 2.10: A wave packet. The "envelope" travels at the group velocity; the "ripples" travel at the phase velocity.

The problem, then, is to determine the group velocity of a wave packet with the generic form

$$
\Psi (x, t) = \frac {1}{\sqrt {2 \pi}} \int_ {- \infty} ^ {+ \infty} \phi (k) e ^ {i (k x - \omega t)} d k. \tag {2.106}
$$

In our case  $\omega = \left(\hbar k^2 / 2m\right)$ , but what I have to say now applies to any kind of wave packet, regardless of its dispersion relation (the formula for  $\omega$  as a function of  $k$ ). Let us assume that  $\phi(k)$  is narrowly peaked about some particular value  $k_0$ . (There is nothing illegal about a broad spread in  $k$ , but such wave packets change shape rapidly—different components travel at different speeds, so the whole notion of a "group," with a well-defined velocity, loses its meaning.) Since the integrand is negligible except in the vicinity of  $k_0$ , we may as well Taylor-expand the function  $\omega(k)$  about that point, and keep only the leading terms:

$$
\omega (k) \approx \omega_ {0} + \omega_ {0} ^ {\prime} (k - k _ {0}),
$$

where  $\omega_0^{\prime}$  is the derivative of  $\omega$  with respect to  $k$ , at the point  $k_{0}$ .

Changing variables from  $k$  to  $s \equiv k - k_0$  (to center the integral at  $k_0$ ), we have

$$
\begin{array}{l} \Psi (x, t) \approx \frac {1}{\sqrt {2 \pi}} \int_ {- \infty} ^ {+ \infty} \phi \left(k _ {0} + s\right) e ^ {i \left\{\left(k _ {0} + s\right) x - \left(\omega_ {0} + \omega_ {0} ^ {\prime} s\right) t \right\}} d s \tag {2.107} \\ = \frac {1}{\sqrt {2 \pi}} e ^ {i (k _ {0} x - \omega_ {0} t)} \int_ {- \infty} ^ {+ \infty} \phi (k _ {0} + s) e ^ {i s (x - \omega_ {0} ^ {\prime} t)} d s. \\ \end{array}
$$

The term in front is a sinusoidal wave (the "ripples"), traveling at speed  $\omega_0 / k_0$ . It is modulated by the integral (the "envelope"), which is a function of  $x - \omega_0'$ , and therefore propagates at the speed  $\omega_0'$ . Thus the phase velocity is

$$
v _ {\text {p h a s e}} = \frac {\omega}{k}, \tag {2.108}
$$

while the group velocity is

$$
v _ {\text {g r o u p}} = \frac {d \omega}{d k} \tag {2.109}
$$

(both of them evaluated at  $k = k_0$ ).

In our case,  $\omega = \left(\hbar k^2 / 2m\right)$ , so  $\omega / k = (\hbar k / 2m)$ , whereas  $d\omega / dk = (\hbar k / m)$ , which is twice as great. This confirms that the group velocity of the wave packet matches the classical particle velocity:

$$
v _ {\text {c l a s s i c a l}} = v _ {\text {g r o u p}} = 2 v _ {\text {p h a s e}}. \tag {2.110}
$$

* Problem 2.17 Show that  $\left[Ae^{ikx} + Be^{-ikx}\right]$  and  $[C\cos kx + D\sin kx]$  are equivalent ways of writing the same function of  $x$ , and determine the constants  $C$  and  $D$  in terms of  $A$  and  $B$ , and vice versa. Comment: In quantum mechanics, when  $V = 0$ , the exponentials represent traveling waves, and are most convenient in discussing the free particle, whereas sines and cosines correspond to standing waves, which arise naturally in the case of the infinite square well.

Problem 2.18 Find the probability current, $J$ (Problem 1.14) for the free particle wave function Equation 2.95. Which direction does the probability flow?

Problem 2.19 This problem is designed to guide you through a "proof" of Plancherel's theorem, by starting with the theory of ordinary Fourier series on a finite interval, and allowing that interval to expand to infinity.

(a) Dirichlet's theorem says that "any" function $f(x)$ on the interval $[-a, +a]$ can be expanded as a Fourier series:

$$
f (x) = \sum_ {n = 0} ^ {\infty} \left[ a _ {n} \sin \left(\frac {n \pi x}{a}\right) + b _ {n} \cos \left(\frac {n \pi x}{a}\right) \right].
$$

Show that this can be written equivalently as

$$
f (x) = \sum_ {n = - \infty} ^ {\infty} c _ {n} e ^ {i n \pi x / a}.
$$

What is $c_{n}$, in terms of $a_{n}$ and $b_{n}$?

(b) Show (by appropriate modification of Fourier's trick) that

$$
c _ {n} = \frac {1}{2 a} \int_ {- a} ^ {+ a} f (x) e ^ {- i n \pi x / a} d x.
$$

(c) Eliminate $n$ and $c_{n}$ in favor of the new variables $k = (n\pi / a)$ and $F(k) = \sqrt{2 / \pi} ac_{n}$. Show that (a) and (b) now become

$$
f (x) = \frac {1}{\sqrt {2 \pi}} \sum_ {n = - \infty} ^ {\infty} F (k) e ^ {i k x} \Delta k; \quad F (k) = \frac {1}{\sqrt {2 \pi}} \int_ {- a} ^ {+ a} f (x) e ^ {- i k x} d x,
$$

where $\Delta k$ is the increment in $k$ from one $n$ to the next.

(d) Take the limit $a \to \infty$ to obtain Plancherel's theorem. Comment: In view of their quite different origins, it is surprising (and delightful) that the two formulas—one for $F(k)$ in terms of $f(x)$, the other for $f(x)$ in terms of $F(k)$—have such a similar structure in the limit $a \to \infty$.

Problem 2.20 A free particle has the initial wave function

$$
\Psi (x, 0) = A e ^ {- a | x |},
$$

where $A$ and $a$ are positive real constants.

(a) Normalize $\Psi (x,0)$
(b) Find $\phi (k)$
(c) Construct $\Psi (x,t)$, in the form of an integral.
(d) Discuss the limiting cases (a very large, and a very small).

Problem 2.21 The gaussian wave packet. A free particle has the initial wave function

$$
\Psi (x, 0) = A e ^ {- a x ^ {2}},
$$

where  $A$  and  $a$  are (real and positive) constants.

(a) Normalize  $\Psi (x,0)$
(b) Find  $\Psi (x,t)$ . Hint: Integrals of the form

$$
\int_ {- \infty} ^ {+ \infty} e ^ {- (a x ^ {2} + b x)} d x
$$

can be handled by "completing the square": Let  $y \equiv \sqrt{a} \left[ x + (b / 2a) \right]$ , and note that  $(a x^2 + b x) = y^2 - (b^2 / 4a)$ . Answer:

$$
\Psi (x, t) = \left(\frac {2 a}{\pi}\right) ^ {1 / 4} \frac {1}{\gamma} e ^ {- a x ^ {2} / \gamma^ {2}}, \quad \text {where} \quad \gamma \equiv \sqrt {1 + (2 i \hbar a t / m)}. \tag {2.111}
$$

(c) Find  $|\Psi (x,t)|^2$  . Express your answer in terms of the quantity

$$
w \equiv \sqrt {a / \left[ 1 + (2 \hbar a t / m) ^ {2} \right]}.
$$

Sketch  $|\Psi|^2$  (as a function of  $x$ ) at  $t = 0$ , and again for some very large  $t$ . Qualitatively, what happens to  $|\Psi|^2$ , as time goes on?

(d) Find  $\langle x\rangle ,\langle p\rangle ,\langle x^2\rangle ,\langle p^2\rangle ,\sigma_x$  , and  $\sigma_{p}$  . Partial answer:  $\langle p^2\rangle = a\hbar^2$  , but it may take some algebra to reduce it to this simple form.
(e) Does the uncertainty principle hold? At what time  $t$  does the system come closest to the uncertainty limit?

81
## 2.5 The Delta-Function Potential

82

## 2.5.1 Bound States and Scattering States

We have encountered two very different kinds of solutions to the time-independent Schrödinger equation: For the infinite square well and the harmonic oscillator they are normalizable, and labeled by a discrete index $n$; for the free particle they are non-normalizable, and labeled by a continuous variable $k$. The former represent physically realizable states in their own right, the latter do not; but in both cases the general solution to the time-dependent Schrödinger equation is a linear combination of stationary states—for the first type this combination takes the form of a sum (over $n$), whereas for the second it is an integral (over $k$). What is the physical significance of this distinction?

In classical mechanics a one-dimensional time-independent potential can give rise to two rather different kinds of motion. If $V(x)$ rises higher than the particle's total energy ($E$) on either side (Figure 2.11(a)), then the particle is "stuck" in the potential well—it rocks back and forth between the turning points, but it cannot escape (unless, of course, you provide it with a source of extra energy, such as a motor, but we're not talking about that). We call this a bound state. If, on the other hand, $E$ exceeds $V(x)$ on one side (or both), then the particle comes in from "infinity," slows down or speeds up under the influence of the potential, and returns to infinity (Figure 2.11(b)). (It can't get trapped in the potential unless there is some mechanism, such as friction, to dissipate energy, but again, we're not talking about that.) We call this a scattering state. Some potentials admit only bound states (for instance, the harmonic oscillator); some allow only scattering states (a potential hill with no dips in it, for example); some permit both kinds, depending on the energy of the particle.

![img-30.jpeg](img-30.jpeg)
(a)

![img-31.jpeg](img-31.jpeg)
(b)

![img-32.jpeg](img-32.jpeg)

![img-33.jpeg](img-33.jpeg)
(c)
Figure 2.11: (a) A bound state. (b) Scattering states. (c) A classical bound state, but a quantum scattering state.

The two kinds of solutions to the Schrödinger equation correspond precisely to bound and scattering states. The distinction is even cleaner in the quantum domain, because the phenomenon of tunneling (which we'll come to shortly) allows the particle to "leak" through any finite potential barrier, so the only thing that matters is the potential at infinity (Figure 2.11(c)):

$$
\left\{ \begin{array}{l l} E &lt;   V (- \infty) \text { and } V (+ \infty) \Rightarrow &amp; \text { bound state}, \\ E &gt; V (- \infty) \text { or } V (+ \infty) \Rightarrow &amp; \text { scattering state}. \end{array} \right. \tag {2.112}
$$

In real life most potentials go to zero at infinity, in which case the criterion simplifies even further:

$$
\left\{ \begin{array}{l l} E &lt;   0 \Rightarrow &amp; \text { bound state}, \\ E &gt; 0 \Rightarrow &amp; \text { scattering state}. \end{array} \right. \tag {2.113}
$$

Because the infinite square well and harmonic oscillator potentials go to infinity as  $\chi \rightarrow \pm \infty$ , they admit bound states only; because the free particle potential is zero everywhere, it only allows scattering states.[43] In

this section (and the following one) we shall explore potentials that support both kinds of states.

85

## 2.5.2 The Delta-Function Well

The Dirac delta function is an infinitely high, infinitesimally narrow spike at the origin, whose area is 1 (Figure 2.12):

$$
\delta (x) \equiv \left\{ \begin{array}{l l} 0, &amp; \text{if } x \neq 0 \\ \infty, &amp; \text{if } x = 0 \end{array} \right\}, \text{ with } \int_{-\infty}^{+\infty} \delta (x) \, dx = 1. \tag{2.114}
$$

Technically, it isn't a function at all, since it is not finite at $x = 0$ (mathematicians call it a generalized function, or distribution).³⁴ Nevertheless, it is an extremely useful construct in theoretical physics. (For example, in electrodynamics the charge density of a point charge is a delta function.) Notice that $\delta(x - a)$ would be a spike of area 1 at the point $a$. If you multiply $\delta(x - a)$ by an ordinary function $f(x)$, it's the same as multiplying by $f(a)$,

$$
f (x) \delta (x - a) = f (a) \delta (x - a), \tag{2.115}
$$

because the product is zero anyway except at the point $a$. In particular,

$$
\int_{-\infty}^{+\infty} f (x) \delta (x - a) \, dx = f (a) \int_{-\infty}^{+\infty} \delta (x - a) \, dx = f (a). \tag{2.116}
$$

That's the most important property of the delta function: Under the integral sign it serves to "pick out" the value of $f(x)$ at the point $a$. (Of course, the integral need not go from $-\infty$ to $+\infty$; all that matters is that the domain of integration includes the point $a$, so $a - \epsilon$ to $a + \epsilon$ would do, for any $\epsilon &gt; 0$.)

![img-34.jpeg](img-34.jpeg)
Figure 2.12: The Dirac delta function (Equation 2.114).

Let's consider a potential of the form

$$
V (x) = - \alpha \delta (x), \tag{2.117}
$$

where $\alpha$ is some positive constant.³⁵ This is an artificial potential, to be sure (so was the infinite square well), but it's delightfully simple to work with, and illuminates the basic theory with a minimum of analytical clutter. The Schrödinger equation for the delta-function well reads

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} - \alpha \delta (x) \psi = E \psi ; \tag{2.118}
$$

it yields both bound states ($E &lt; 0$) and scattering states ($E &gt; 0$).

We'll look first at the bound states. In the region $x &lt; 0$, $V(x) = 0$, so

$$
\frac {d ^ {2} \psi}{d x ^ {2}} = - \frac {2 m E}{h ^ {2}} \psi = \kappa^ {2} \psi , \tag {2.119}
$$

where

$$
\kappa \equiv \frac {\sqrt {- 2 m E}}{h}. \tag {2.120}
$$

$(E$ is negative, by assumption, so $\kappa$ is real and positive.) The general solution to Equation 2.119 is

$$
\psi (x) = A e ^ {- \kappa x} + B e ^ {\kappa x}, \tag {2.121}
$$

but the first term blows up as $x \to -\infty$, so we must choose $A = 0$:

$$
\psi (x) = B e ^ {\kappa x}, \quad (x &lt; 0). \tag {2.122}
$$

In the region $x &gt; 0$, $V(x)$ is again zero, and the general solution is of the form $F\exp (-\kappa x) + G\exp (\kappa x)$; this time it's the second term that blows up (as $x\to +\infty$), so

$$
\psi (x) = F e ^ {- \kappa x}, \quad (x &gt; 0). \tag {2.123}
$$

It remains only to stitch these two functions together, using the appropriate boundary conditions at $x = 0$. I quoted earlier the standard boundary conditions for $\psi$:

$$
\left\{ \begin{array}{l l} 1. &amp; \psi \quad \text{is always continuous}; \\ 2. &amp; d \psi / d x \quad \text{is continuous except at points where the potential is infinite}. \end{array} \right. \tag {2.124}
$$

In this case the first boundary condition tells us that $F = B$, so

$$
\psi (x) = \left\{ \begin{array}{l l} B e ^ {\kappa x}, &amp; (x \leq 0), \\ B e ^ {- \kappa x}, &amp; (x \geq 0); \end{array} \right. \tag {2.125}
$$

$\psi(x)$ is plotted in Figure 2.13. The second boundary condition tells us nothing; this is (like the walls of the infinite square well) the exceptional case where $V$ is infinite at the join, and it's clear from the graph that this function has a kink at $x = 0$. Moreover, up to this point the delta function has not come into the story at all. It turns out that the delta function determines the discontinuity in the derivative of $\psi$, at $x = 0$. I'll show you now how this works, and as a byproduct we'll see why $d\psi / dx$ is ordinarily continuous.

![img-35.jpeg](img-35.jpeg)
Figure 2.13: Bound state wave function for the delta-function potential (Equation 2.125).

The idea is to integrate the Schrödinger equation, from $-\epsilon$ to $+\epsilon$, and then take the limit as $\epsilon \to 0$.

86

$$
- \frac {\hbar^ {2}}{2 m} \int_ {- \epsilon} ^ {+ \epsilon} \frac {d ^ {2} \psi}{d x ^ {2}} d x + \int_ {- \epsilon} ^ {+ \epsilon} V (x) \psi (x) d x = E \int_ {- \epsilon} ^ {+ \epsilon} \psi (x) d x \tag {2.126}
$$

The first integral is nothing but  $\frac{d\psi}{dx}$ , evaluated at the two end points; the last integral is zero, in the limit  $\epsilon \to 0$ , since it's the area of a sliver with vanishing width and finite height. Thus

$$
\Delta \left(\frac {d \psi}{d x}\right) \equiv \lim  _ {\epsilon \rightarrow 0} \left(\frac {\partial \psi}{\partial x} | _ {+ \epsilon} - \frac {\partial \psi}{\partial x} | _ {- \epsilon}\right) = \frac {2 m}{\hbar^ {2}} \lim  _ {\epsilon \rightarrow 0} \int_ {- \epsilon} ^ {+ \epsilon} V (x) \psi (x) d x. \tag {2.127}
$$

Ordinarily, the limit on the right is again zero, and that's why  $d\psi /dx$  is ordinarily continuous. But when  $V(x)$  is infinite at the boundary, this argument fails. In particular, if  $V(x) = -\alpha \delta (x)$ , Equation 2.116 yields

$$
\Delta \left(\frac {d \psi}{d x}\right) = - \frac {2 m \alpha}{\hbar^ {2}} \psi (0). \tag {2.128}
$$

For the case at hand (Equation 2.125),

$$
\left\{ \begin{array}{l l} d \psi / d x = - B \kappa e ^ {- \kappa x}, &amp; \text {for} (x &gt; 0), \quad \text {so} d \psi / d x | _ {+} = - B \kappa , \\ d \psi / d x = + B \kappa e ^ {+ \kappa x}, &amp; \text {for} (x &lt; 0), \quad \text {so} d \psi / d x | _ {-} = + B \kappa , \end{array} \right.
$$

and hence  $\Delta (d\psi /dx) = -2B\kappa$  . And  $\psi (0) = B$  . So Equation 2.128 says

$$
\kappa = \frac {m \alpha}{\hbar^ {2}}, \tag {2.129}
$$

and the allowed energy (Equation 2.120) is

$$
E = - \frac {\hbar^ {2} \kappa^ {2}}{2 m} = - \frac {m \alpha^ {2}}{2 \hbar^ {2}}. \tag {2.130}
$$

Finally, we normalize  $\psi$ :

$$
\int_ {- \infty} ^ {+ \infty} | \psi (x) | ^ {2} d x = 2 | B | ^ {2} \int_ {0} ^ {\infty} e ^ {- 2 \kappa x} d x = \frac {| B | ^ {2}}{\kappa} = 1,
$$

so (choosing the positive real root):

$$
B = \sqrt {\kappa} = \frac {\sqrt {m \alpha}}{\hbar}. \tag {2.131}
$$

Evidently the delta function well, regardless of its "strength"  $\mathfrak{a}$ , has exactly one bound state:

$$
\psi (x) = \frac {\sqrt {m \alpha}}{\hbar} e ^ {- m \alpha | x | / \hbar^ {2}}; \quad E = - \frac {m \alpha^ {2}}{2 \hbar^ {2}}. \tag {2.132}
$$

What about scattering states, with  $E &gt; 0$ ? For  $x &lt; 0$  the Schrödinger equation reads

$$
\frac {d ^ {2} \psi}{d x ^ {2}} = - \frac {2 m E}{\hbar^ {2}} \psi = - k ^ {2} \psi ,
$$

where

is real and positive. The general solution is

$\psi\ (x)=Ae^{ikx}+Be^{-ikx},$ (2.134)

and this time we cannot rule out either term, since neither of them blows up. Similarly, for $x>0$,

$\psi\ (x)=Fe^{ikx}+Ge^{-ikx}.$ (2.135)

The continuity of $\psi\ (x)$ at $x=0$ requires that

$F+G=A+B.$ (2.136)

The derivatives are

\[ \begin{cases}d\psi/dx=ik\left(Fe^{ikx}-Ge^{-ikx}\right),\ \mbox{for}\ \ (x>0)\,,\quad\hbox{so}\ d\psi/dx|_{+}=ik\ (F-G)\,,\\
d\psi/dx=ik\left(Ae^{ikx}-Be^{-ikx}\right),\ \mbox{for}\ \ (x<0)\,,\quad\hbox{so}\ d\psi/dx|_{-}=ik\ (A-B)\,,\end{cases} \]

and hence $\Delta\ (d\psi/dx)=ik\ (F-G-A+B)$. Meanwhile, $\psi\ (0)=(A+B)$, so the second boundary condition (Equation 2.128) says

$ik\ (F-G-A+B)=-\frac{2m\alpha}{\hbar^{2}}\ (A+B)\,,$ (2.137)

or, more compactly,

$F-G=A\ (1+2i\beta)-B\ (1-2i\beta)\,,\quad\mbox{where}\ \beta\equiv\frac{m\alpha}{\hbar^{2}k}.$ (2.138)

Having imposed both boundary conditions, we are left with two equations (Equations 2.136 and 2.138) in four unknowns $(A$, $B$, $F$, and $G)$—five, if you count $k$. Normalization won’t help—this isn’t a normalizable state. Perhaps we’d better pause, then, and examine the physical significance of these various constants. Recall that $\exp\left(ikx\right)$ gives rise (when coupled with the wiggle factor $\exp\left(-iEt/\hbar\right)$) to a wave function propagating to the right, and $\exp\left(-ikx\right)$ leads to a wave propagating to the left. It follows that $A$ (in Equation 2.134) is the amplitude of a wave coming in from the left, $B$ is the amplitude of a wave returning to the left; $F$ (Equation 2.135) is the amplitude of a wave traveling off to the right, and $G$ is the amplitude of a wave coming in from the right (see Figure 2.14). In a typical scattering experiment particles are fired in from one direction—let’s say, from the left. In that case the amplitude of the wave coming in from the right will be zero:

$G=0\quad\mbox{ (for scattering from the left)}\,;$ (2.139)

$A$ is the amplitude of the incident wave, $B$ is the amplitude of the reflected wave, and $F$ is the amplitude of the transmitted wave. Solving Equations 2.136 and 2.138 for $B$ and $F$, we find

$B=\frac{i\beta}{1-i\beta}A\,,\quad F=\frac{1}{1-i\beta}A\,.$ (2.140)

(If you want to study scattering from the right, set $A=0$; then $G$ is the incident amplitude, $F$ is the reflected amplitude, and $B$ is the transmitted amplitude.)

![img-36.jpeg](img-36.jpeg)
Figure 2.14: Scattering from a delta function well.

Now, the probability of finding the particle at a specified location is given by  $|\Psi|^2$ , so the relative $^{36}$  probability that an incident particle will be reflected back is

$$
R \equiv \frac {\left| B \right| ^ {2}}{\left| A \right| ^ {2}} = \frac {\beta^ {2}}{1 + \beta^ {2}}. \tag {2.141}
$$

$R$  is called the reflection coefficient. (If you have a beam of particles, it tells you the fraction of the incoming number that will bounce back.) Meanwhile, the probability that a particle will continue right on through is the transmission coefficient $^{37}$

$$
T \equiv \frac {\left| F \right| ^ {2}}{\left| A \right| ^ {2}} = \frac {1}{1 + \beta^ {2}}. \tag {2.142}
$$

Of course, the sum of these probabilities should be 1—and it is:

$$
R + T = 1. \tag {2.143}
$$

Notice that  $R$  and  $T$  are functions of  $\beta$ , and hence (Equations 2.133 and 2.138) of  $E$ :

$$
R = \frac {1}{1 + \left(2 \hbar^ {2} E / m \alpha^ {2}\right)}, \quad T = \frac {1}{1 + \left(m \alpha^ {2} / 2 \hbar^ {2} E\right)}. \tag {2.144}
$$

The higher the energy, the greater the probability of transmission (which makes sense).

This is all very tidy, but there is a sticky matter of principle that we cannot altogether ignore: These scattering wave functions are not normalizable, so they don't actually represent possible particle states. We know the resolution to this problem: form normalizable linear combinations of the stationary states, just as we did for the free particle—true physical particles are represented by the resulting wave packets. Though straightforward in principle, this is a messy business in practice, and at this point it is best to turn the problem over to a computer.[48] Meanwhile, since it is impossible to create a normalizable free-particle wave function without involving a range of energies,  $R$  and  $T$  should be interpreted as the approximate reflection and transmission probabilities for particles with energies in the vicinity of  $E$ .

Incidentally, it might strike you as peculiar that we were able to analyze a quintessentially time-dependent problem (particle comes in, scatters off a potential, and flies off to infinity) using stationary states. After all,  $\psi$  (in Equations 2.134 and 2.135) is simply a complex, time-independent, sinusoidal function, extending (with constant amplitude) to infinity in both directions. And yet, by imposing appropriate boundary conditions on this function we were able to determine the probability that a particle (represented by a localized

wave packet) would bounce off, or pass through, the potential. The mathematical miracle behind this is, I suppose, the fact that by taking linear combinations of states spread over all space, and with essentially trivial time dependence, we can construct wave functions that are concentrated about a (moving) point, with quite elaborate behavior in time (see Problem 2.42).

As long as we've got the relevant equations on the table, let's look briefly at the case of a delta-function barrier (Figure 2.15). Formally, all we have to do is change the sign of  $\mathfrak{a}$ . This kills the bound state, of course (Problem 2.2). On the other hand, the reflection and transmission coefficients, which depend only on  $\alpha^2$ , are unchanged. Strange to say, the particle is just as likely to pass through the barrier as to cross over the well! Classically, of course, a particle cannot make it over an infinitely high barrier, regardless of its energy. In fact, classical scattering problems are pretty dull: If  $E &gt; V_{\mathrm{max}}$ , then  $T = 1$  and  $R = 0$ —the particle certainly makes it over; if  $E &lt; V_{\mathrm{max}}$  then  $T = 0$  and  $R = 1$ —it rides up the hill until it runs out of steam, and then returns the same way it came. Quantum scattering problems are much richer: The particle has some nonzero probability of passing through the potential even if  $E &lt; V_{\mathrm{max}}$ . We call this phenomenon tunneling; it is the mechanism that makes possible much of modern electronics—not to mention spectacular advances in microscopy. Conversely, even if  $E &gt; V_{\mathrm{max}}$  there is a possibility that the particle will bounce back—though I wouldn't advise driving off a cliff in the hope that quantum mechanics will save you (see Problem 2.35).

![img-37.jpeg](img-37.jpeg)
Figure 2.15: The delta-function barrier.

Problem 2.22 Evaluate the following integrals:

(a)  $\int_{-3}^{+1}\left(x^3 - 3x^2 + 2x - 1\right)\delta(x + 2)dx.$
(b)  $\int_0^\infty [\cos (3x) + 2]\delta (x - \pi)dx.$
(c)  $\int_{-1}^{+1}\exp (|x| + 3)\delta (x - 2)dx.$

Problem 2.23 Delta functions live under integral signs, and two expressions  $(D_{1}(x)$  and  $D_{2}(x))$  involving delta functions are said to be equal if

$\int_{-\infty}^{+\infty}f(x)D_1(x)dx = \int_{-\infty}^{+\infty}f(x)D_2(x)dx,$

for every (ordinary) function  $f(x)$ .

(a) Show that

(2.145)

$\delta (cx) = \frac{1}{|c|}\delta (x),$

where  $c$  is a real constant. (Be sure to check the case where  $c$  is negative.)

(b) Let  $\theta (x)$  be the step function:

$$
\theta (x) \equiv \left\{ \begin{array}{l l} 1, &amp; x &gt; 0, \\ 0, &amp; x &lt; 0. \end{array} \right. \tag {2.146}
$$

(In the rare case where it actually matters, we define  $\theta(0)$  to be  $1/2$ .) Show that  $d\theta/dx = \delta(x)$ .

** Problem 2.24 Check the uncertainty principle for the wave function in Equation 2.132. Hint: Calculating  $\langle p^2\rangle$  can be tricky, because the derivative of  $\psi$  has a step discontinuity at  $x = 0$ . You may want to use the result in Problem 2.23(b). Partial answer:  $\langle p^2\rangle = (m\alpha /\hbar)^2$ .

Problem 2.25 Check that the bound state of the delta-function well (Equation 2.132) is orthogonal to the scattering states (Equations 2.134 and 2.135).

* Problem 2.26 What is the Fourier transform of  $\delta(x)$ ? Using Plancherel's theorem, show that

$$
\delta (x) = \frac {1}{2 \pi} \int_ {- \infty} ^ {+ \infty} e ^ {i k x} d k. \tag {2.147}
$$

Comment: This formula gives any respectable mathematician apoplexy. Although the integral is clearly infinite when  $x = 0$ , it doesn't converge (to zero or anything else) when  $x \neq 0$ , since the integrand oscillates forever. There are ways to patch it up (for instance, you can integrate from  $-L$  to  $+L$ , and interpret Equation 2.147 to mean the average value of the finite integral, as  $L \to \infty$ ). The source of the problem is that the delta function doesn't meet the requirement (square-integrability) for Plancherel's theorem (see footnote 42). In spite of this, Equation 2.147 can be extremely useful, if handled with care.

** Problem 2.27 Consider the double delta-function potential

$$
V (x) = - \alpha [ \delta (x + a) + \delta (x - a) ],
$$

where  $\mathfrak{a}$  and  $a$  are positive constants.

(a) Sketch this potential.
(b) How many bound states does it possess? Find the allowed energies, for  $\alpha = \hbar^2 / ma$  and for  $\alpha = \hbar^2 / 4ma$ , and sketch the wave functions.
(c) What are the bound state energies in the limiting cases (i)  $a \to 0$  and (ii)  $a \to \infty$  (holding  $\mathfrak{a}$  fixed)? Explain why your answers are reasonable, by comparison with the single delta-function well.

Problem 2.28 Find the transmission coefficient, for the potential in Problem 2.27.

# 2.6 The Finite Square Well

As a last example, consider the finite square well

$$
V (x) = \left\{ \begin{array}{l l} - V _ {0}, &amp; - a \leq x \leq a, \\ 0, &amp; | x | &gt; a, \end{array} \right. \tag {2.148}
$$

where $V_{0}$ is a (positive) constant (Figure 2.16). Like the delta-function well, this potential admits both bound states (with $E &lt; 0$) and scattering states (with $E &gt; 0$). We'll look first at the bound states.

![img-38.jpeg](img-38.jpeg)
Figure 2.16: The finite square well (Equation 2.148).

In the region $x &lt; -a$ the potential is zero, so the Schrödinger equation reads

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} = E \psi , \quad \mathrm {o r} \ \frac {d ^ {2} \psi}{d x ^ {2}} = \kappa^ {2} \psi ,
$$

where

$$
\kappa \equiv \frac {\sqrt {- 2 m E}}{\hbar} \tag {2.149}
$$

is real and positive. The general solution is $\psi(x) = A\exp(-\kappa x) + B\exp(\kappa x)$, but the first term blows up (as $x \to -\infty$), so the physically admissible solution is

$$
\psi (x) = B e ^ {\kappa x}, \quad (x &lt; - a). \tag {2.150}
$$

In the region $-a &lt; x &lt; a$, $V(x) = -V_0$, and the Schrödinger equation reads

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} - V _ {0} \psi = E \psi , \quad \mathrm {o r} \ \frac {d ^ {2} \psi}{d x ^ {2}} = - l ^ {2} \psi ,
$$

where

$$
l \equiv \frac {\sqrt {2 m (E + V _ {0})}}{\hbar}. \tag {2.151}
$$

Although $E$ is negative, for bound states, it must be greater than $-V_{0}$, by the old theorem $E &gt; V_{\min}$ (Problem 2.2); so $l$ is also real and positive. The general solution is$^{49}$

$$
\psi (x) = C \sin (l x) + D \cos (l x), \quad (- a &lt; x &lt; a), \tag {2.152}
$$

where $C$ and $D$ are arbitrary constants. Finally, in the region $x &gt; a$ the potential is again zero; the general solution is $\psi(x) = F\exp(-\kappa x) + G\exp(\kappa x)$, but the second term blows up (as $x \to \infty$), so we are left with

$$
\psi(x) = F e^{-\kappa x}, \quad (x &gt; a). \tag{2.153}
$$

The next step is to impose boundary conditions: $\psi$ and $d\psi/dx$ continuous at $-a$ and $+a$. But we can save a little time by noting that this potential is an even function, so we can assume with no loss of generality that the solutions are either even or odd (Problem 2.1(c)). The advantage of this is that we need only impose the boundary conditions on one side (say, at $+a$); the other side is then automatic, since $\psi(-x) = \pm \psi(x)$. I'll work out the even solutions; you get to do the odd ones in Problem 2.29. The cosine is even (and the sine is odd), so I'm looking for solutions of the form

$$
\psi(x) = \begin{cases}
F e^{-\kappa x}, &amp; (x &gt; a), \\
D \cos(lx), &amp; (0 &lt; x &lt; a), \\
\psi(-x), &amp; (x &lt; 0).
\end{cases} \tag{2.154}
$$

The continuity of $\psi(x)$, at $x = a$, says

$$
F e^{-\kappa a} = D \cos(la), \tag{2.155}
$$

and the continuity of $d\psi/dx$ says

$$
- \kappa F e^{-\kappa a} = - l D \sin(la). \tag{2.156}
$$

Dividing Equation 2.156 by Equation 2.155, we find that

$$
\kappa = l \tan(la). \tag{2.157}
$$

This is a formula for the allowed energies, since $\kappa$ and $l$ are both functions of $E$. To solve for $E$, we first adopt some nicer notation: Let

$$
z \equiv l a, \quad \text{and} \quad z_0 \equiv \frac{a}{\hbar} \sqrt{2m V_0}. \tag{2.158}
$$

According to Equations 2.149 and 2.151, $(\kappa^2 + l^2) = 2m V_0 / \hbar^2$, so $\kappa a = \sqrt{z_0^2 - z^2}$, and Equation 2.157 reads

$$
\tan z = \sqrt{(z_0 / z)^2 - 1}. \tag{2.159}
$$

This is a transcendental equation for $z$ (and hence for $E$) as a function of $z_0$ (which is a measure of the "size" of the well). It can be solved numerically, using a computer, or graphically, by plotting $\tan z$ and $\sqrt{(z_0 / z)^2 - 1}$ on the same grid, and looking for points of intersection (see Figure 2.17). Two limiting cases are of special interest:

1. Wide, deep well. If $z_0$ is very large (pushing the curve $\sqrt{(z_0 / z)^2 - 1}$ upward on the graph, and sliding the zero crossing, $z_0$, to the right) the intersections occur just slightly below $z_n = n\pi / 2$, with $n$ odd; it follows (Equations 2.158 and 2.151) that

94

$$
E _ {n} + V _ {0} \approx \frac {n ^ {2} \pi^ {2} \hbar^ {2}}{2 m (2 a) ^ {2}} \quad (n = 1, 3, 5, \dots). \tag {2.160}
$$

But  $E + V_0$  is the energy above the bottom of the well, and on the right side we have precisely the infinite square well energies, for a well of width  $2a$  (see Equation 2.30)—or rather, half of them, since this  $n$  is odd. (The other ones, of course, come from the odd wave functions, as you'll discover in Problem 2.29.) So the finite square well goes over to the infinite square well, as  $V_0 \to \infty$ ; however, for any finite  $V_0$  there are only a finite number of bound states.

2. Shallow, narrow well. As  $z_0$  decreases, there are fewer and fewer bound states, until finally, for  $z_0 &lt; \pi / 2$ , only one remains. It is interesting to note, however, that there is always one bound state, no matter how "weak" the well becomes.

![img-39.jpeg](img-39.jpeg)
Figure 2.17: Graphical solution to Equation 2.159, for  $z_0 = 8$  (even states).

You're welcome to normalize  $\psi$  (Equation 2.154), if you're interested (Problem 2.30), but I'm going to move on now to the scattering states  $(E &gt; 0)$ . To the left, where  $V(x) = 0$ , we have

$$
\psi (x) = A e ^ {i k x} + B e ^ {- i k x}, \quad \text {for} \quad (x &lt;   - a), \tag {2.161}
$$

where (as usual)

$$
k \equiv \frac {\sqrt {2 m E}}{\hbar}. \tag {2.162}
$$

Inside the well, where  $V(x) = -V_0$ ,

$$
\psi (x) = C \sin (l x) + D \cos (l x), \quad \text {for} \quad (- a &lt;   x &lt;   a), \tag {2.163}
$$

where, as before,

$$
l \equiv \frac {\sqrt {2 m (E + V _ {0})}}{\hbar}. \tag {2.164}
$$

To the right, assuming there is no incoming wave in this region, we have

$$
\psi (x) = F e ^ {i k x}. \tag {2.165}
$$

Here  $A$  is the incident amplitude,  $B$  is the reflected amplitude, and  $F$  is the transmitted amplitude.50

There are four boundary conditions: Continuity of  $\psi(x)$  at  $-a$  says

$$
A e ^ {- i k a} + B e ^ {i k a} = - C \sin (l a) + D \cos (l a), \tag {2.166}
$$

continuity of $d\psi /dx$ at $-a$ gives

$$
ik \left[ A e^{-ika} - B e^{ika} \right] = l \left[ C \cos (la) + D \sin (la) \right] \tag{2.167}
$$

continuity of $\psi (x)$ at $+a$ yields

$$
C \sin (la) + D \cos (la) = F e^{ika}, \tag{2.168}
$$

and continuity of $d\psi /dx$ at $+a$ requires

$$
l \left[ C \cos (la) - D \sin (la) \right] = ik F e^{ika}. \tag{2.169}
$$

We can use two of these to eliminate $C$ and $D$, and solve the remaining two for $B$ and $F$ (see Problem 2.32):

$$
B = i \frac{\sin (2la)}{2kl} \left(l^2 - k^2\right) F, \tag{2.170}
$$

$$
F = \frac{e^{-2ika} A}{\cos (2la) - i \frac{\left(k^2 + l^2\right)}{2kl} \sin (2la)}. \tag{2.171}
$$

The transmission coefficient $\left(T = |F|^2 / |A|^2\right)$, expressed in terms of the original variables, is given by

$$
T^{-1} = 1 + \frac{V_0^2}{4E (E + V_0)} \sin^2 \left(\frac{2a}{\hbar} \sqrt{2m (E + V_0)}\right). \tag{2.172}
$$

Notice that $T = 1$ (the well becomes "transparent") whenever the sine is zero, which is to say, when

$$
\frac{2a}{\hbar} \sqrt{2m (E_n + V_0)} = n\pi, \tag{2.173}
$$

where $n$ is any integer. The energies for perfect transmission, then, are given by

$$
E_n + V_0 = \frac{n^2 \pi^2 \hbar^2}{2m (2a)^2}, \tag{2.174}
$$

which happen to be precisely the allowed energies for the infinite square well. $T$ is plotted in Figure 2.18, as a function of energy. [51]

![img-40.jpeg](img-40.jpeg)
Figure 2.18: Transmission coefficient as a function of energy (Equation 2.172).

* Problem 2.29 Analyze the odd bound state wave functions for the finite square well. Derive the transcendental equation for the allowed energies, and solve it

graphically. Examine the two limiting cases. Is there always an odd bound state?

Problem 2.30 Normalize $\psi(x)$ in Equation 2.154, to determine the constants $D$ and $F$.

Problem 2.31 The Dirac delta function can be thought of as the limiting case of a rectangle of area 1, as the height goes to infinity and the width goes to zero. Show that the delta-function well (Equation 2.117) is a "weak" potential (even though it is infinitely deep), in the sense that $z_0 \to 0$. Determine the bound state energy for the delta-function potential, by treating it as the limit of a finite square well. Check that your answer is consistent with Equation 2.132. Also show that Equation 2.172 reduces to Equation 2.144 in the appropriate limit.

Problem 2.32 Derive Equations 2.170 and 2.171. Hint: Use Equations 2.168 and 2.169 to solve for $C$ and $D$ in terms of $F$:

$$
C = \left[ \sin (l a) + i \frac {k}{l} \cos (l a) \right] e ^ {i k a} F; \quad D = \left[ \cos (l a) - i \frac {k}{l} \sin (l a) \right] e ^ {i k a} F.
$$

Plug these back into Equations 2.166 and 2.167. Obtain the transmission coefficient, and confirm Equation 2.172.

Problem 2.33 Determine the transmission coefficient for a rectangular barrier (same as Equation 2.148, only with $V(x) = +V_0 &gt; 0$ in the region $-a &lt; x &lt; a$). Treat separately the three cases $E &lt; V_0$, $E = V_0$, and $E &gt; V_0$ (note that the wave function inside the barrier is different in the three cases). Partial answer: for $E &lt; V_0$.

$$
T ^ {- 1} = 1 + \frac {V _ {0} ^ {2}}{4 E (V _ {0} - E)} \sinh^ {2} \left(\frac {2 a}{\hbar} \sqrt {2 m (V _ {0} - E)}\right).
$$

Problem 2.34 Consider the "step" potential:

$$
V (x) = \left\{ \begin{array}{l l} 0, &amp; x \leq 0, \\ V _ {0}, &amp; x &gt; 0. \end{array} \right.
$$

(a) Calculate the reflection coefficient, for the case $E &lt; V_0$, and comment on the answer.
(b) Calculate the reflection coefficient for the case $E &gt; V_0$.

97

(c) For a potential (such as this one) that does not go back to zero to the right of the barrier, the transmission coefficient is not simply  $|F|^2 / |A|^2$  (with  $A$  the incident amplitude and  $F$  the transmitted amplitude), because the transmitted wave travels at a different speed. Show that

(2.175)

for  $E &gt; V_0$  Hint: You can figure it out using Equation 2.99, or—more elegantly, but less informatively—from the probability current (Problem 2.18). What is  $T$ , for  $E &lt; V_0$ ?

(d) For  $E &gt; V_0$ , calculate the transmission coefficient for the step potential, and check that  $T + R = 1$ .

Problem 2.35 A particle of mass  $m$  and kinetic energy  $E &gt; 0$  approaches an abrupt potential drop  $V_{0}$  (Figure 2.19).

![img-41.jpeg](img-41.jpeg)
Figure 2.19: Scattering from a "cliff" (Problem 2.35).

(a) What is the probability that it will "reflect" back, if  $E = V_0 / 3$ ? Hint: This is just like Problem 2.34, except that the step now goes down, instead of up.
(b) I drew the figure so as to make you think of a car approaching a cliff, but obviously the probability of "bouncing back" from the edge of a cliff is far smaller than what you got in (a)—unless you're Bugs Bunny. Explain why this potential does not correctly represent a cliff. Hint: In Figure 2.20 the potential energy of the car drops discontinuously to  $-V_{0}$ , as it passes  $x = 0$ ; would this be true for a falling car?
(c) When a free neutron enters a nucleus, it experiences a sudden drop in potential energy, from  $V = 0$  outside to around  $-12 \mathrm{MeV}$  (million electron volts) inside. Suppose a neutron, emitted with kinetic energy 4 MeV by a fission event, strikes such a nucleus. What is the probability it will be absorbed, thereby initiating another fission? Hint: You calculated the probability of reflection

in part (a); use  $T = 1 - R$  to get the probability of transmission through the surface.

![img-42.jpeg](img-42.jpeg)
Figure 2.20: The double square well (Problem 2.47).

# Further Problems on Chapter 2

Problem 2.36 Solve the time-independent Schrödinger equation with appropriate boundary conditions for the "centered" infinite square well: $V(x) = 0$ (for $-a &lt; x &lt; +a$), $V(x) = \infty$ (otherwise). Check that your allowed energies are consistent with mine (Equation 2.30), and confirm that your $\psi_s$ can be obtained from mine (Equation 2.31) by the substitution $x \to (x + a)/2$ (and appropriate renormalization). Sketch your first three solutions, and compare Figure 2.2. Note that the width of the well is now $2a$.

Problem 2.37 A particle in the infinite square well (Equation 2.22) has the initial wave function

$$
\Psi (x, 0) = A \sin^ {3} (\pi x / a) \quad (0 \leq x \leq a).
$$

Determine $A$, find $\Psi(x, t)$, and calculate $\langle x \rangle$, as a function of time. What is the expectation value of the energy? Hint: $\sin^n \theta$ and $\cos^n \theta$ can be reduced, by repeated application of the trigonometric sum formulas, to linear combinations of $\sin(m\theta)$ and $\cos(m\theta)$, with $m = 0, 1, 2, \ldots, n$.

Problem 2.38

(a) Show that the wave function of a particle in the infinite square well returns to its original form after a quantum revival time $T = 4ma^2/\pi \hbar$. That is: $\Psi(x, T) = \Psi(x, 0)$ for any state (not just a stationary state).

(b) What is the classical revival time, for a particle of energy $E$ bouncing back and forth between the walls?

(c) For what energy are the two revival times equal?$^{55}$

Problem 2.39 In Problem 2.7(d) you got the expectation value of the energy by summing the series in Equation 2.21, but I warned you (in footnote 21) not to try it the "old fashioned way," $\langle H\rangle = \int \Psi (x,0)^{*}\hat{H}\Psi (x,0)dx$, because the discontinuous first derivative of $\Psi (x,0)$ renders the second derivative problematic. Actually, you could have done it using integration by parts, but the Dirac delta function affords a much cleaner way to handle such anomalies.

(a) Calculate the first derivative of $\Psi(x, 0)$ (in Problem 2.7), and express the answer in terms of the step function, $\theta(x - a/2)$, defined in Equation 2.146.

(b) Exploit the result of Problem 2.23(b) to write the second derivative of $\Psi(x, 0)$ in terms of the delta function.

(c) Evaluate the integral $\int \Psi (x,0)^{*}\hat{H}\Psi (x,0)dx$, and check that you get the same answer as before.

** Problem 2.40 A particle of mass  $m$  in the harmonic oscillator potential (Equation 2.44) starts out in the state

$\Psi (x,0) = A\left(1 - 2\sqrt{\frac{m\omega}{\hbar}} x\right)^{2}e^{-\frac{m\omega}{2\hbar} x^{2}},$

for some constant  $A$

(a) Determine  $A$  and the coefficients  $c_{n}$  in the expansion of this state in terms of the stationary states of the harmonic oscillator.
(b) In a measurement of the particle's energy, what results could you get, and what are their probabilities? What is the expectation value of the energy?
(c) At a later time  $T$  the wave function is

$$
\Psi (x, T) = B \left(1 + 2 \sqrt {\frac {m \omega}{\hbar}} x\right) ^ {2} e ^ {- \frac {m \omega}{2 \hbar} x ^ {2}},
$$

for some constant  $B$ . What is the smallest possible value of  $T$ ?

Problem 2.41 Find the allowed energies of the half harmonic oscillator

$$
V (x) = \left\{ \begin{array}{l l} (1 / 2) m \omega^ {2} x ^ {2}, &amp; x &gt; 0, \\ \infty , &amp; x &lt;   0. \end{array} \right.
$$

(This represents, for example, a spring that can be stretched, but not compressed.) Hint: This requires some careful thought, but very little actual calculation.

***

Problem 2.42 In Problem 2.21 you analyzed the stationary gaussian free particle wave packet. Now solve the same problem for the traveling gaussian wave packet, starting with the initial wave function

$$
\Psi (x, 0) = A e ^ {- a x ^ {2}} e ^ {i l x},
$$

where  $l$  is a (real) constant. [Suggestion: In going from  $\phi(k)$  to  $\Psi(x, t)$ , change variables to  $u \equiv k - l$  before doing the integral.] Partial answer:

$$
\Psi (x, t) = \left(\frac {2 a}{\pi}\right) ^ {1 / 4} \frac {1}{\gamma} e ^ {- a (x - \hbar l t / m) ^ {2} / \gamma^ {2}} e ^ {i l (x - \hbar l t / 2 m)}
$$

where  $\gamma \equiv \sqrt{1 + 2ia\hbar t / m}$ , as before. Notice that  $\Psi (x,t)$  has the structure of a gaussian "envelope" modulating a traveling sinusoidal wave. What is the speed of the envelope? What is the speed of the traveling wave?

***

Problem 2.43 Solve the time-independent Schrödinger equation for a centered infinite square well with a delta-function barrier in the middle:

$$
V (x) = \left\{ \begin{array}{l l} \alpha \delta (x), &amp; - a &lt;   x &lt;   + a, \\ \infty , &amp; | x | \geq a. \end{array} \right.
$$

Treat the even and odd wave functions separately. Don't bother to normalize them. Find the allowed energies (graphically, if necessary). How do they compare with the corresponding energies in the absence of the delta function?

Explain why the odd solutions are not affected by the delta function. Comment on the limiting cases $\alpha \to 0$ and $\alpha \to \infty$.

**Problem 2.44** If two (or more) distinct$^{56}$ solutions to the (time-independent) Schrödinger equation have the same energy $E$, these states are said to be degenerate. For example, the free particle states are doubly degenerate—one solution representing motion to the right, and the other motion to the left. But we have never encountered *normalizable* degenerate solutions, and this is no accident. Prove the following theorem: In one dimension$^{57}$ ($-\infty &lt; x &lt; \infty$) there are no degenerate bound states. [Hint: Suppose there are two solutions, $\psi_1$ and $\psi_2$, with the same energy $E$. Multiply the Schrödinger equation for $\psi_1$ by $\psi_2$, and the Schrödinger equation for $\psi_2$ by $\psi_1$, and subtract, to show that $(\psi_2 d\psi_1 / dx - \psi_1 d\psi_2 / dx)$ is a constant. Use the fact that for normalizable solutions $\psi \to 0$ at $\pm \infty$ to demonstrate that this constant is in fact zero. Conclude that $\psi_2$ is a multiple of $\psi_1$, and hence that the two solutions are not distinct.]

**Problem 2.45** In this problem you will show that the number of nodes of the stationary states of a one-dimensional potential always increases with energy.$^{58}$ Consider two (real, normalized) solutions $(\psi_n$ and $\psi_m)$ to the time-independent Schrödinger equation (for a given potential $V(x)$), with energies $E_n &gt; E_m$.

(a) Show that

$$
\frac{d}{dx} \left( \frac{d \psi_m}{dx} \psi_n - \psi_m \frac{d \psi_n}{dx} \right) = \frac{2m}{\hbar^2} (E_n - E_m) \psi_m \psi_n.
$$

(b) Let $x_1$ and $x_2$ be two adjacent nodes of the function $\psi_m(x)$. Show that

$$
\psi_m'(x_2) \psi_n(x_2) - \psi_m'(x_1) \psi_n(x_1) = \frac{2m}{\hbar^2} (E_n - E_m) \int_{x_1}^{x_2} \psi_m \psi_n dx.
$$

(c) If $\psi_n(x)$ has no nodes between $x_1$ and $x_2$, then it must have the same sign everywhere in the interval. Show that (b) then leads to a contradiction. Therefore, between every pair of nodes of $\psi_m(x)$, $\psi_n(x)$ must have at least one node, and in particular the number of nodes increases with energy.

**Problem 2.46** Imagine a bead of mass $m$ that slides frictionlessly around a circular wire ring of circumference $L$. (This is just like a free particle, except that $\psi(x + L) = \psi(x)$.) Find the stationary states (with appropriate normalization) and the corresponding allowed energies. Note that there are (with one exception) two independent solutions for each energy $E_n$ — corresponding to clockwise and counter-clockwise circulation; call them $\psi_n^+(x)$ and $\psi_n^-(x)$. How do you account for this degeneracy, in view of the theorem in Problem 2.44 (why does the theorem fail, in this case)?

103

** Problem 2.47 Attention: This is a strictly qualitative problem—no calculations allowed! Consider the "double square well" potential (Figure 2.20). Suppose the depth  $V_{0}$  and the width  $a$  are fixed, and large enough so that several bound states occur.

(a) Sketch the ground state wave function  $\psi_{1}$  and the first excited state  $\psi_{2}$ , (i) for the case  $b = 0$ , (ii) for  $b \approx a$ , and (iii) for  $b \gg a$ .
(b) Qualitatively, how do the corresponding energies  $(E_{1}$  and  $E_{2})$  vary, as  $b$  goes from 0 to  $\infty$ ? Sketch  $E_{1}(b)$  and  $E_{2}(b)$  on the same graph.
(c) The double well is a very primitive one-dimensional model for the potential experienced by an electron in a diatomic molecule (the two wells represent the attractive force of the nuclei). If the nuclei are free to move, they will adopt the configuration of minimum energy. In view of your conclusions in (b), does the electron tend to draw the nuclei together, or push them apart? (Of course, there is also the internuclear repulsion to consider, but that's a separate problem.)

Problem 2.48 Consider a particle of mass  $m$  in the potential

$$
V (x) = \left\{ \begin{array}{l l} \infty &amp; x &lt;   0, \\ - 3 2 \hbar^ {2} / m a ^ {2} &amp; 0 \leq x \leq a, \\ 0 &amp; x &gt; a. \end{array} \right.
$$

(a) How many bound states are there?
(b) In the highest-energy bound state, what is the probability that the particle would be found outside the well  $(x &gt; a)$ ? Answer: 0.542, so even though it is "bound" by the well, it is more likely to be found outside than inside!

***

Problem 2.49

(a) Show that

$$
\Psi (x, t) = \left(\frac {m \omega}{\pi \hbar}\right) ^ {1 / 4} \exp \left[ - \frac {m \omega}{2 \hbar} \left(x ^ {2} + \frac {x _ {0} ^ {2}}{2} \left(1 + e ^ {- 2 i \omega t}\right) + \frac {i \hbar t}{m} - 2 x _ {0} x e ^ {- i \omega t}\right) \right]
$$

satisfies the time-dependent Schrödinger equation for the harmonic oscillator potential (Equation 2.44). Here  $x_0$  is any real constant with the dimensions of length.[29]

(b) Find  $|\Psi (x,t)|^2$  , and describe the motion of the wave packet.
(c) Compute  $\langle x\rangle$  and  $\langle p\rangle$ , and check that Ehrenfest's theorem (Equation 1.38) is satisfied.

** Problem 2.50 Consider the moving delta-function well:

$$
V (x, t) = - \alpha \delta (x - v t),
$$

where  $v$  is the (constant) velocity of the well.

(a) Show that the time-dependent Schrödinger equation admits the exact solution $^{(a)}$

$$
\Psi (x, t) = \frac {\sqrt {m \alpha}}{\hbar} e ^ {- m \alpha | x - v t | / \hbar^ {2}} e ^ {- i [ (E + (1 / 2) m v ^ {2}) t - m v x ] / \hbar},
$$

where  $E = -m\alpha^2 / 2\hbar^2$  is the bound-state energy of the stationary delta function. Hint: Plug it in and check it! Use the result of Problem 2.23(b).

(b) Find the expectation value of the Hamiltonian in this state, and comment on the result.

** Problem 2.51 Free fall. Show that

$$
\Psi (x, t) = \Psi_ {0} \left(x + \frac {1}{2} g t ^ {2}, t\right) \exp \left[ - i \frac {m g t}{\hbar} \left(x + \frac {1}{6} g t ^ {2}\right) \right] \tag {2.176}
$$

satisfies the time-dependent Schrödinger equation for a particle in a uniform gravitational field,

$$
V (x) = m g x, \tag {2.177}
$$

where  $\Psi_0(x,t)$  is the free gaussian wave packet (Equation 2.111). Find  $\langle x\rangle$  as a function of time, and comment on the result.[61]

** Problem 2.52 Consider the potential

$$
V (x) = - \frac {\hbar^ {2} a ^ {2}}{m} \operatorname {s e c h} ^ {2} (a x),
$$

where  $a$  is a positive constant, and "sech" stands for the hyperbolic secant.

(a) Graph this potential.
(b) Check that this potential has the ground state

$$
\psi_ {0} (x) = A \operatorname {s e c h} (a x),
$$

and find its energy. Normalize  $\psi_0$ , and sketch its graph.

(c) Show that the function

$$
\psi_ {k} (x) = A \left(\frac {i k - a \tanh  (a x)}{i k + a}\right) e ^ {i k x},
$$

(where  $k \equiv \sqrt{2mE} / \hbar$ , as usual) solves the Schrödinger equation for any (positive) energy  $E$ . Since  $\tanh z \to -1$  as  $z \to -\infty$ ,

$$
\psi_ {k} (x) \approx A e ^ {i k x}, \quad \text {for large negative} x.
$$

This represents, then, a wave coming in from the left with no accompanying reflected wave (i.e. no term  $\exp(-ikx)$ ). What is the asymptotic form of  $\psi_k(x)$  at large positive  $x$ ? What are  $R$  and  $T$ , for this potential? Comment: This is a famous example of a reflectionless potential—every incident particle, regardless its energy, passes right through.[62]

Problem 2.53 The Scattering Matrix. The theory of scattering generalizes in a pretty obvious way to arbitrary localized potentials (Figure 2.21). To the left (Region I), $V(x) = 0$, so

$$
\psi (x) = A e ^ {i k x} + B e ^ {- i k x}, \quad \text{where} \ k \equiv \frac {\sqrt {2 m E}}{\hbar}. \tag {2.178}
$$

To the right (Region III), $V(x)$ is again zero, so

$$
\psi (x) = F e ^ {i k x} + G e ^ {- i k x}. \tag {2.179}
$$

In between (Region II), of course, I can't tell you what $\psi$ is until you specify the potential, but because the Schrödinger equation is a linear, second-order differential equation, the general solution has got to be of the form

$$
\psi (x) = C f (x) + D g (x),
$$

where $f(x)$ and $g(x)$ are two linearly independent particular solutions. $^{63}$ There will be four boundary conditions (two joining Regions I and II, and two joining Regions II and III). Two of these can be used to eliminate $C$ and $D$, and the other two can be "solved" for $B$ and $F$ in terms of $A$ and $G$:

$$
B = S _ {1 1} A + S _ {1 2} G, \quad F = S _ {2 1} A + S _ {2 2} G.
$$

The four coefficients $S_{ij}$, which depend on $k$ (and hence on $E$), constitute a $2 \times 2$ matrix $S$, called the scattering matrix (or $S$-matrix, for short). The $S$-matrix tells you the outgoing amplitudes ($B$ and $F$) in terms of the incoming amplitudes ($A$ and $G$):

$$
\left( \begin{array}{l} B \\ F \end{array} \right) = \left( \begin{array}{l l} S _ {1 1} &amp; S _ {1 2} \\ S _ {2 1} &amp; S _ {2 2} \end{array} \right) \left( \begin{array}{l} A \\ G \end{array} \right). \tag {2.180}
$$

In the typical case of scattering from the left, $G = 0$, so the reflection and transmission coefficients are

$$
R _ {l} = \left. \frac {| B | ^ {2}}{| A | ^ {2}} \right| _ {G = 0} = | S _ {1 1} | ^ {2}, \quad T _ {l} = \left. \frac {| F | ^ {2}}{| A | ^ {2}} \right| _ {G = 0} = | S _ {2 1} | ^ {2}. \tag {2.181}
$$

For scattering from the right, $A = 0$, and

$$
R _ {r} = \left. \frac {| F | ^ {2}}{| G | ^ {2}} \right| _ {A = 0} = | S _ {2 2} | ^ {2}, \quad T _ {r} = \left. \frac {| B | ^ {2}}{| G | ^ {2}} \right| _ {A = 0} = | S _ {1 2} | ^ {2}. \tag {2.182}
$$

(a) Construct the $S$-matrix for scattering from a delta-function well (Equation 2.117).
(b) Construct the $S$-matrix for the finite square well (Equation 2.148). Hint: This requires no new work, if you carefully exploit the symmetry of the problem.

106

![img-43.jpeg](img-43.jpeg)
Figure 2.21: Scattering from an arbitrary localized potential  $(V(x) = 0$  except in Region II); Problem 2.53.

***

Problem 2.54 The transfer matrix. $^{64}$  The  $S$ -matrix (Problem 2.53) tells you the outgoing amplitudes  $(B$  and  $F)$  in terms of the incoming amplitudes  $(A$  and  $G)$  —Equation 2.180. For some purposes it is more convenient to work with the transfer matrix,  $\mathsf{M}_1$ , which gives you the amplitudes to the right of the potential  $(F$  and  $G)$  in terms of those to the left  $(A$  and  $B)$ :

$$
\left( \begin{array}{l} F \\ G \end{array} \right) = \left( \begin{array}{l l} M _ {1 1} &amp; M _ {1 2} \\ M _ {2 1} &amp; M _ {2 2} \end{array} \right) \left( \begin{array}{l} A \\ B \end{array} \right). \tag {2.183}
$$

(a) Find the four elements of the  $M$ -matrix, in terms of the elements of the  $S$ -matrix, and vice versa. Express  $R_{l}, T_{l}, R_{r}$ , and  $T_{r}$  (Equations 2.181 and 2.182) in terms of elements of the  $M$ -matrix.
(b) Suppose you have a potential consisting of two isolated pieces (Figure 2.22). Show that the  $M$ -matrix for the combination is the product of the two  $M$ -matrices for each section separately:

$$
\mathrm {M} = \mathrm {M} _ {2} \mathrm {M} _ {1}. \tag {2.184}
$$

(This obviously generalizes to any number of pieces, and accounts for the usefulness of the  $M$ -matrix.)

(c) Construct the  $M$ -matrix for scattering from a single delta-function potential at point  $a$ :

$$
V (x) = - \alpha \delta (x - a).
$$

(d) By the method of part (b), find the  $M$ -matrix for scattering from the double delta-function

$$
V (x) = - \alpha [ \delta (x + a) + \delta (x - a) ].
$$

What is the transmission coefficient for this potential?

![img-44.jpeg](img-44.jpeg)
Figure 2.22: A potential consisting of two isolated pieces (Problem 2.54).

Problem 2.55 Find the ground state energy of the harmonic oscillator, to five significant digits, by the “wag-the-dog” method. That is, solve Equation 2.73 numerically, varying $K$ until you get a wave function that goes to zero at large $\xi$. In Mathematica, appropriate input code would be

Plot[

Evaluate[

u[x] /.

NDSolve[

[u$\nu$[x] - (x^{2} - K)*u[x] == 0, u[0] == 1, u$\nu$[0] == 0],

u[x], [x, 0, b]

]

],

[x, a, b], PlotRange -> [c, d]

]

(Here $(a,b)$ is the horizontal range of the graph, and $(c,d)$ is the vertical range—start with $a=0$, $b=10$, $c=-10$, $d=10$.) We know that the correct solution is $K=2n+1$, so you might start with a “guess” of $K=0.9$. Notice what the “tail” of the wave function does. Now try $K=1.1$, and note that the tail flips over. Somewhere in between those values lies the correct solution. Zero in on it by bracketing $K$ tighter and tighter. As you do so, you may want to adjust $a$, $b$, $c$, and $d$, to zero in on the cross-over point.

Problem 2.56 Find the first three excited state energies (to five significant digits) for the harmonic oscillator, by wagging the dog (Problem 2.55). For the first (and third) excited state you will need to set $\mathbf{u}[\mathbf{0}] == \mathbf{0}$, $\mathbf{u}^{\prime}[\mathbf{0}] == \mathbf{1}$.

Problem 2.57 Find the first four allowed energies (to five significant digits) for the infinite square well, by wagging the dog. Hint: Refer to Problem 2.55, making appropriate changes to the differential equation. This time the condition you are looking for is $u(1) = 0$.

Problem 2.58 In a monovalent metal, one electron per atom is free to roam throughout the object. What holds such a material together—why doesn’t it simply fall apart into a pile of individual atoms? Evidently the energy of the composite structure must be less than the energy of the isolated atoms. This problem offers a crude but illuminating explanation for the cohesiveness of metals.

(a) Estimate the energy of $N$ isolated atoms, by treating each one as an electron in the ground state of an infinite square well of width $a$ (Figure 2.23(a)).

(b) When these atoms come together to form a metal, we get $N$ electrons in a much larger infinite square well of width $Na$ (Figure 2.23(b)). Because of the Pauli exclusion principle (which we will discuss in Chapter 5) there can only be one electron (two, if you include spin, but let’s ignore that) in

each allowed state. What is the lowest energy for this system (Figure 2.23(b))?

(c) The difference of these two energies is the cohesive energy of the metal—the energy it would take to tear it apart into isolated atoms. Find the cohesive energy per atom, in the limit of large  $N$ .
(d) Atypical atomic separation in a metal is a few Ångström (say,  $a \approx 4$  Å). What is the numerical value of the cohesive energy per atom, in this model? (Measured values are in the range of 2–4 eV.)

![img-45.jpeg](img-45.jpeg)

![img-46.jpeg](img-46.jpeg)
Figure 2.23 (a)  $N$  electrons in individual wells of width  $a$ . (b)  $N$  electrons in a single well of width  $Na$ .

Problem 2.59 The "bouncing ball." Suppose

$$
V (x) = \left\{ \begin{array}{l l} m g x, &amp; x &gt; 0, \\ \infty , &amp; x \leq 0. \end{array} \right. \tag {2.185}
$$

(a) Solve the (time-independent) Schrödinger equation for this potential. Hint: First convert it to dimensionless form:

$$
- y ^ {\prime \prime} (z) + z y (z) = \epsilon y (z) \tag {2.186}
$$

by letting  $z \equiv ax$  and  $y(z) \equiv \left(1 / \sqrt{a}\right)\psi(x)$  (the  $\sqrt{a}$  is just so  $y(z)$  is normalized with respect to  $z$  when  $\psi(x)$  is normalized with respect to  $x$ ). What are the constants  $a$  and  $\varepsilon$ ? Actually, we might as well set  $a \to 1$  — this amounts to a convenient choice for the unit of length. Find the general solution to this equation (in Mathematica D Solve will do the job). The result is (of course) a linear combination of two (probably unfamiliar) functions. Plot each of them, for  $(-15 &lt; z &lt; 5)$ . One of them clearly does not go to zero at large  $z$  (more precisely, it's not normalizable), so discard it. The allowed values of  $\varepsilon$  (and hence of  $E$ ) are determined by the condition  $\psi(0) = 0$ . Find the ground state  $\epsilon_1$  numerically (in Mathematica FindRoot will do it), and also the 10th,  $\epsilon_{10}$ . Obtain the corresponding normalization factors. Plot  $\psi_1(x)$  and  $\psi_{10}(x)$ ,

for $0 \leq z &lt; 16$. Just as a check, confirm that $\psi_{1}(x)$ and $\psi_{10}(x)$ are orthogonal.

(b) Find (numerically) the uncertainties $\sigma_{x}$ and $\sigma_{p}$ for these two states, and check that the uncertainty principle is obeyed.

(c) The probability of finding the ball in the neighborhood $dx$ of height $x$ is (of course) $\rho_{Q}(x)dx = |\psi(x)|^{2}dx$. The nearest classical analog would be the fraction of time an elastically bouncing ball (with the same energy, $E$) spends in the neighborhood $dx$ of height $x$ (see Problem 1.11). Show that this is

$$
\rho_{C}(x) dx = \frac{mg}{2\sqrt{E(E - mgx)}} dx, \tag{2.187}
$$

or, in our units (with $a = 1$),

$$
\rho_{C}(x) = \frac{1}{2\sqrt{\epsilon(\epsilon - x)}}. \tag{2.188}
$$

Plot $\rho_{Q}(x)$ and $\rho_{C}(x)$ for the state $\psi_{10}(x)$, on the range $0 \leq x \leq 12.5$; superimpose the graphs (Show, in Mathematica), and comment on the result.

Problem 2.60 The $1 / x^2$ potential. Suppose

$$
V(x) = \begin{cases}
-\alpha / x^{2}, &amp; x &gt; 0, \\
\infty, &amp; x \leq 0.
\end{cases} \tag{2.189}
$$

where $\alpha$ is some positive constant with the appropriate dimensions. We'd like to find the bound states—solutions to the time-independent Schrödinger equation

$$
- \frac{\hbar^{2}}{2m} \frac{d^{2}\psi}{dx^{2}} - \frac{\alpha}{x^{2}} \psi = E \psi \tag{2.190}
$$

with negative energy ($E &lt; 0$).

(a) Let's first go for the ground state energy, $E_0$. Prove, on dimensional grounds, that there is no possible formula for $E_0$—no way to construct (from the available constants $m$, $\hbar$, and $\alpha$) a quantity with the units of energy. That's weird, but it gets worse ...

(b) For convenience, rewrite Equation 2.190 as

$$
\frac{d^{2}\psi}{dx^{2}} + \frac{\beta}{x^{2}} \psi = \kappa^{2} \psi, \text{ where } \beta \equiv \frac{2m\alpha}{\hbar^{2}} \text{ and } \kappa \equiv \frac{\sqrt{-2mE}}{\hbar}. \tag{2.191}
$$

Show that if $\psi(x)$ satisfies this equation with energy $E$, then so too does $\psi(\lambda x)$, with energy $E' = \lambda^2 E$, for any positive number $\lambda$. [This is a catastrophe: if there exists any solution at all, then there's a solution for every (negative) energy! Unlike the square well, the harmonic oscillator,

***

and every other potential well we have encountered, there are no discrete allowed states—and no ground state. A system with no ground state—no lowest allowed energy—would be wildly unstable, cascading down to lower and lower levels, giving off an unlimited amount of energy as it falls. It might solve our energy problem, but we'd all be fried in the process.] Well, perhaps there simply are no solutions at all ...

(c) (Use a computer for the remainder of this problem.) Show that

$$
\psi_{\kappa}(x) = A \sqrt{x} K_{ig}(\kappa x), \tag{2.192}
$$

satisfies Equation 2.191 (here $K_{ig}$ is the modified Bessel function of order $ig$, and $g \equiv \sqrt{\beta - 1/4}$). Plot this function, for $g = 4$ (you might as well let $\kappa = 1$ for the graph; this just sets the scale of length). Notice that it goes to 0 as $x \to 0$ and as $x \to \infty$. And it's normalizable: determine $A$. How about the old rule that the number of nodes counts the number of lower-energy states? This function has an infinite number of nodes, regardless of the energy (i.e. of $\kappa$). I guess that's consistent, since for any $E$ there are always an infinite number of states with even lower energy.

(d) This potential confounds practically everything we have come to expect. The problem is that it blows up too violently as $x \to 0$. If you move the "brick wall" over a hair,

$$
V(x) = \begin{cases}
-\alpha / x^2, &amp; x &gt; \epsilon &gt; 0, \\
\infty, &amp; x \leq \epsilon,
\end{cases} \tag{2.193}
$$

it's suddenly perfectly normal. Plot the ground state wave function, for $g = 4$ and $\epsilon = 1$ (you'll first need to determine the appropriate value of $\kappa$), from $x = 0$ to $x = 6$. Notice that we have introduced a new parameter $(\epsilon)$, with the dimensions of length, so the argument in (a) is out the window. Show that the ground state energy takes the form

$$
E_0 = -\frac{\alpha}{\epsilon^2} f(\beta), \tag{2.194}
$$

for some function $f$ of the dimensionless quantity $\beta$.

Problem 2.61 One way to obtain the allowed energies of a potential well numerically is to turn the Schrödinger equation into a matrix equation, by discretizing the variable $x$. Slice the relevant interval at evenly spaced points $\{x_j\}$, with $x_{j+1} - x_j \equiv \Delta x$, and let $\psi_j \equiv \psi(x_j)$ (likewise $V_j \equiv V(x_j)$). Then

$$
\frac{d\psi}{dx} \approx \frac{\psi_{j+1} - \psi_j}{\Delta x}, \quad \frac{d^2\psi}{dx^2} \approx \frac{(\psi_{j+1} - \psi_j) - (\psi_j - \psi_{j-1})}{(\Delta x)^2} = \frac{\psi_{j+1} - 2\psi_j + \psi_{j-1}}{(\Delta x)^2}. \tag{2.195}
$$

(The approximation presumably improves as  $\Delta x$  decreases.) The discretized Schrödinger equation reads

$$
- \frac {\hbar^ {2}}{2 m} \left(\frac {\psi_ {j + 1} - 2 \psi_ {j} + \psi_ {j - 1}}{(\Delta x) ^ {2}}\right) + V _ {j} \psi_ {j} = E \psi_ {j}, \tag {2.196}
$$

or

$$
- \lambda \psi_ {j + 1} + (2 \lambda + V _ {j}) \psi_ {j} - \lambda \psi_ {j - 1} = E \psi_ {j}, \quad \text {w h e r e} \quad \lambda \equiv \frac {\hbar^ {2}}{2 m (\Delta x) ^ {2}}. \tag {2.197}
$$

In matrix form,

$$
\mathsf {H} \Psi = E \Psi \tag {2.198}
$$

where (letting  $v_{j}\equiv V_{j} / \lambda$ )

$$
\mathsf {H} \equiv \lambda \left( \begin{array}{c c c c c c} \ddots &amp; &amp; &amp; &amp; &amp; \\ &amp; - 1 &amp; (2 + v _ {j - 1}) &amp; - 1 &amp; 0 &amp; 0 \\ &amp; 0 &amp; - 1 &amp; (2 + v _ {j}) &amp; - 1 &amp; 0 \\ &amp; 0 &amp; 0 &amp; - 1 &amp; (2 + v _ {j + 1}) &amp; - 1 \\ &amp; &amp; &amp; &amp; &amp; \ddots \end{array} \right) \tag {2.199}
$$

and

$$
\Psi \equiv \left( \begin{array}{c} \vdots \\ \psi_ {j - 1} \\ \psi_ {j} \\ \psi_ {j + 1} \\ \vdots \end{array} \right) \tag {2.200}
$$

(what goes in the upper left and lower right corners of  $\mathsf{H}$  depends on the boundary conditions, as we shall see). Evidently the allowed energies are the eigenvalues of the matrix  $\mathsf{H}$  (or would be, in the limit  $\Delta x\to 0$ ).67

Apply this method to the infinite square well. Chop the interval  $(0 \leq x \leq a)$  into  $N + 1$  equal segments (so that  $\Delta x = a / (N + 1)$ ), letting  $x_0 \equiv 0$  and  $x_{N + 1} \equiv a$ . The boundary conditions fix  $\psi_0 = \psi_{N + 1} = 0$ , leaving

$$
\Psi \equiv \left( \begin{array}{c} \psi_ {1} \\ \vdots \\ \psi_ {N} \end{array} \right). \tag {2.201}
$$

(a) Construct the  $N \times N$  matrix  $\mathsf{H}$ , for  $N = 1$ ,  $N = 2$ , and  $N = 3$  (Make sure you are correctly representing Equation 2.197 for the special cases  $j = 1$  and  $j = N$ .)
(b) Find the eigenvalues of  $\mathsf{H}$  for these three cases "by hand," and compare them with the exact allowed energies (Equation 2.30).

(c) Using a computer (Mathematica's Eigenvalues package will do it) find the five lowest eigenvalues numerically for $N = 10$ and $N = 100$, and compare the exact energies.
(d) Plot (by hand) the eigenvectors for $N = 1, 2$, and 3, and (by computer, Eigenvectors) the first three eigenvectors for $N = 10$ and $N = 100$.

Problem 2.62 Suppose the bottom of the infinite square well is not flat $(V(x) = 0)$, but rather

$$
V(x) = 500\,V_0 \sin \left(\frac{\pi x}{a}\right), \quad \text{where} \quad V_0 \equiv \frac{\hbar^2}{2ma^2}.
$$

Use the method of Problem 2.61 to find the three lowest allowed energies numerically, and plot the associated wave functions (use $N = 100$).

Problem 2.63 The Boltzmann equation$^{68}$

$$
P(n) = \frac{1}{Z} e^{-\beta E_n}, \quad Z \equiv \sum_n e^{-\beta E_n}, \quad \beta \equiv \frac{1}{k_B T}, \tag{2.202}
$$

gives the probability of finding a system in the state $n$ (with energy $E_n$), at temperature $T$ ($k_B$ is Boltzmann's constant). Note: The probability here refers to the random thermal distribution, and has nothing to do with quantum indeterminacy. Quantum mechanics will only enter this problem through quantization of the energies $E_n$.

(a) Show that the thermal average of the system's energy can be written as

$$
\bar{E} = \sum_n E_n P(n) = -\frac{\partial}{\partial \beta} \ln(Z). \tag{2.203}
$$

(b) For a quantum simple harmonic oscillator the index $n$ is the familiar quantum number, and $E_n = (n + 1/2)\hbar\omega$. Show that in this case the partition function $Z$ is

$$
Z = \frac{e^{-\beta \hbar \omega / 2}}{1 - e^{-\beta \hbar \omega}}. \tag{2.204}
$$

You will need to sum a geometric series. Incidentally, for a classical simple harmonic oscillator it can be shown that $Z_{\text{classical}} = 2\pi / (\omega \beta)$.

(c) Use your results from parts (a) and (b) to show that for the quantum oscillator

$$
\bar{E} = \left(\frac{\hbar \omega}{2}\right) \frac{1 + e^{-\beta \hbar \omega}}{1 - e^{-\beta \hbar \omega}}. \tag{2.205}
$$

For a classical oscillator the same reasoning would give $\bar{E}_{\text{classical}} = 1/\beta = k_B T$.

(d) Acrystal consisting of $N$ atoms can be thought of as a collection of $3N$ oscillators (each atom is attached by springs to its 6 nearest neighbors,

113

along the  $x, y,$  and  $z$  directions, but those springs are shared by the atoms at the two ends). The heat capacity of the crystal (per atom) will therefore be

(2.206)

$$
C = 3 \frac {\partial \tilde {E}}{\partial T}.
$$

Show that (in this model)

(2.207)

$$
C = 3 k _ {B} \left(\frac {\theta_ {E}}{T}\right) ^ {2} \frac {e ^ {\theta_ {E} / T}}{\left(e ^ {\theta_ {E} / T} - 1\right) ^ {2}},
$$

where  $\theta_{E} \equiv \hbar \omega / k_{B}$  is the so-called Einstein temperature. The same reasoning using the classical expression for  $\tilde{E}$  yields  $C_{\mathrm{classical}} = 3k_{B}$ , independent of temperature.

(e) Sketch the graph of  $C / k_{B}$  versus  $T / \theta_{E}$ . Your result should look something like the data for diamond in Figure 2.24, and nothing like the classical prediction.

![img-47.jpeg](img-47.jpeg)
Figure 2.24: Specific heat of diamond (for Problem 2.63). From Semiconductors on NSM (http://www.ioffe.rssi.ru/SVA/NSM/Semicond/).

Problem 2.64 Legendre's differential equation reads

(2.208)

$$
\left(1 - x ^ {2}\right) \frac {d ^ {2} f}{d x ^ {2}} - 2 x \frac {d f}{d x} + \ell (\ell + 1) f = 0,
$$

where  $\xi$  is some (non-negative) real number.

(a) Assume a power series solution,

$$
f (x) = \sum_ {n = 0} ^ {\infty} a _ {n} x ^ {n},
$$

and obtain a recursion relation for the constants  $a_{n}$

(b) Argue that unless the series truncates (which can only happen if  $\xi$  is an integer), the solution will diverge at  $x = 1$ .

(c) When  $\xi$  is an integer, the series for one of the two linearly independent solutions (either  $f_{\mathrm{even}}$  or  $f_{\mathrm{odd}}$  depending on whether  $\xi$  is even or odd) will truncate, and those solutions are called Legendre polynomials  $P_{\ell}(x)$ . Find  $P_0(x), P_1(x), P_2(x)$ , and  $P_3(x)$  from the recursion relation. Leave your answer in terms of either  $a_0$  or  $a_1$ .

1 It is tiresome to keep saying "potential energy function," so most people just call  $V$  the "potential," even though this invites occasional confusion with electric potential, which is actually potential energy per unit charge.
2 Note that this would not be true if  $V$  were a function of  $t$  as well as  $x$ .
3 Using Euler's formula,

$$
e ^ {i \theta} = \cos \theta + i \sin \theta ,
$$

you could equivalently write

$$
\varphi (t) = \cos (E t / \hbar) + i \sin (E t / \hbar);
$$

the real and imaginary parts oscillate sinusoidally. Mike Casper (of Carleton College) dubbed  $\psi$  the "wiggle factor"—it's the characteristic time dependence in quantum mechanics.

For normalizable solutions,  $E$  must be real (see Problem 2.1(a)).
Whenever confusion might arise, I'll put a "hat"  $(^a)$  on the operator, to distinguish it from the dynamical variable it represents.
A linear combination of the functions  $f_{1}(z), f_{2}(z), \ldots$  is an expression of the form

$$
f (z) = c _ {1} f _ {1} (z) + c _ {2} f _ {2} (z) + \dots ,
$$

where  $c_1, c_2, \ldots$  are (possibly complex) constants.

In principle, any normalized function  $\Psi(x, \theta)$  is fair game—it need not even be continuous. How you might actually get a particle into that state is a different question, and one (curiously) we seldom have occasion to ask.
If this is your first encounter with the method of separation of variables, you may be disappointed that the solution takes the form of an infinite series. Occasionally it is possible to sum the series, or to solve the time-dependent Schrödinger equation without recourse to separation of variables—see, for instance, Problems 2.49, 2.50, and 2.51. But such cases are extremely rare.
This is nicely illustrated in an applet by Paul Falstad, at www.falstad.com/qm1d/.
Some people will tell you that  $|c_n|^2$  is "the probability that the particle is in the  $n$ th stationary state," but this is bad language: the particle is in the state  $\Psi$ , not  $\Psi_n$ , and anyhow, in the laboratory you don't "find the particle to be in a particular state," you measure some observable, and what you get is a number, not a wave function.
That's right:  $\psi (x)$  is a continuous function of  $x$ , even though  $\Psi (x,t)$  need not be.
Notice that the quantization of energy emerges as a rather technical consequence of the boundary conditions on solutions to the time-independent Schrödinger equation.
Actually, it's  $\Psi (x,t)$  that must be normalized, but in view of Equation 2.7 this entails the normalization of  $\psi (x)$ .
To make this symmetry more apparent, some authors center the well at the origin (running it now from  $a$  to  $+a$ ). The even functions are then cosines, and the odd ones are sines. See Problem 2.36.
In this case the  $\psi$ s are real, so the complex conjugation  $(^{*})$  of  $\psi_{m}$  is unnecessary, but for future purposes it's a good idea to get in the habit of putting it there.
See, for example, Mary Boas, Mathematical Methods in the Physical Sciences, 3rd edn (New York: John Wiley, 2006), p. 356;  $f(x)$  can even have a finite number of finite discontinuities.
It doesn't matter whether you use  $m$  or  $n$  as the "dummy index" here (as long as you are consistent on the two sides of the equation, of course); whatever letter you use, it just stands for "any positive integer."
Problem 2.45 explores this property. For further discussion, see John L. Powell and Bernd Crasemann, Quantum Mechanics (Addison-Wesley, Reading, MA, 1961), Section 5-7.
Loosely speaking,  $c_{n}$  tells you the "amount of  $\psi_{n}$  that is contained in  $\Psi$ ".
20 You can look up the series

$$
\frac {1}{1 6} + \frac {1}{3 6} + \frac {1}{5 6} + \dots = \frac {\pi^ {6}}{9 6 0}
$$

and

$$
\frac{1}{1^4} + \frac{1}{3^4} + \frac{1}{5^4} + \cdots = \frac{\pi^4}{96}
$$

in math tables, under "Sums of Reciprocal Powers" or "Riemann Zeta Function."

21 Remember, there is no restriction in principle on the shape of the starting wave function, as long as it is normalizable. In particular, $\Psi(x, 0)$ need not have a continuous derivative. However, if you try to calculate $\langle H \rangle$ using $\int \Psi(x, 0)^\alpha \, \hat{H} \, \Psi(x, 0) \, dx$ in such a case, you may encounter technical difficulties, because the second derivative of $\Psi(x, 0)$ is ill defined. It works in Problem 2.9 because the discontinuities occur at the end points, where the wave function is zero anyway. In Problem 2.39 you'll see how to manage cases like Problem 2.7.

22 Note that $V''(x_0) \geq 0$, since by assumption $\mathcal{N}_0$ is a minimum. Only in the rare case $V''(x_0) = 0$ is the oscillation not even approximately simple harmonic.

23 We'll encounter some of the same strategies in the theory of angular momentum (Chapter 4), and the technique generalizes to a broad class of potentials in supersymmetric quantum mechanics (Problem 3.47; see also Richard W. Robinett, Quantum Mechanics (Oxford University Press, New York, 1997), Section 14.4).

24 Put a hat on $x$, too, if you like, but since $\hat{x} = x$ we usually leave it off.

25 In a deep sense all of the mysteries of quantum mechanics can be traced to the fact that position and momentum do not commute. Indeed, some authors take the canonical commutation relation as an axiom of the theory, and use it to derive $\hat{p} = -i\hbar d/dx$.

26 I'm getting tired of writing "time-independent Schrödinger equation," so when it's clear from the context which one I mean, I'll just call it the "Schrödinger equation."

27 In the case of the harmonic oscillator it is customary, for some reason, to depart from the usual practice, and number the states starting with $n = 0$, instead of $n = 1$. Of course, the lower limit on the sum in a formula such as Equation 2.17 should be altered accordingly.

28 Note that we obtain all the (normalizable) solutions by this procedure. For if there were some other solution, we could generate from it a second ladder, by repeated application of the raising and lowering operators. But the bottom rung of this new ladder would have to satisfy Equation 2.59, and since that leads inexorably to Equation 2.60, the bottom rungs would be the same, and hence the two ladders would in fact be identical.

29 Of course, the integrals must exist, and this means that $f(x)$ and $g(x)$ must go to zero at $\pm \infty$.

30 Of course, we could multiply $c_n$ and $d_n$ by phase factors, amounting to a different definition of the $\psi_n$ but this choice keeps the wave functions real.

31 However, $\langle x\rangle$ does oscillate at the classical frequency—see Problem 3.40.

32 Note that although we invoked some approximations to motivate Equation 2.78, what follows is exact. The device of stripping off the asymptotic behavior is the standard first step in the power series method for solving differential equations—see, for example, Boas (footnote 16), Chapter 12.

33 According to Taylor's theorem, any reasonably well-behaved function can be expressed as a power series, so Equation 2.80 ordinarily involves no loss of generality. For conditions on the applicability of the method, see Boas (footnote 16) or George B. Arfken and Hans-Jurgen Weber, Mathematical Methods for Physicists, 7th edn, Academic Press, Orlando (2013), Section 7.5.

34 See, for example, Arfken and Weber (footnote 33), Section 1.2.

35 It's no surprise that the ill-behaved solutions are still contained in Equation 2.82; this recursion relation is equivalent to the Schrödinger equation, so it's got to include both the asymptotic forms we found in Equation 2.76.

36 It is possible to set this up on a computer, and discover the allowed energies "experimentally." You might call it the wag the dog method: When the tail wags, you know you've just passed over an allowed value. Computer scientists call it the shooting method (Nicholas Giordano, Computational Physics, Prentice Hall, Upper Saddle River, NJ (1997), Section 10.2). See Problems 2.55–2.57.

37 Note that there is a completely different set of coefficients $\alpha j$ for each value of $n$.

38 The Hermite polynomials have been studied extensively in the mathematical literature, and there are many tools and tricks for working with them. A few of these are explored in Problem 2.16.

39 I shall not work out the normalization constant here; if you are interested in knowing how it is done, see for example Leonard Schiff, Quantum Mechanics, 3rd edn, McGraw-Hill, New York (1968), Section 13.

40 Sinusoidal waves extend out to infinity, and they are not normalizable. But superpositions of such waves lead to interference, which allows for localization and normalizability.

41 Some people define the Fourier transform without the factor of $1/\sqrt{2\pi}$. Then the inverse transform becomes $f(x) = (1/2\pi) \int_{-\infty}^{\infty} F(k) e^{ikx} \, dk$, spoiling the symmetry of the two formulas.

42 The necessary and sufficient condition on $f(x)$ is that $\int_{-\infty}^{\infty} |f(x)|^2 \, dx$ be finite. (In that case $\int_{-\infty}^{\infty} |F(k)|^2 \, dk$ is also finite, and in fact the two integrals are equal. Some people call this Plancherel's theorem, leaving Equation 2.102 without a name.) See Arfken and Weber (footnote 33), Section 20.4.

43 If you are irritatingly observant, you may have noticed that the general theorem requiring $E &gt; V_{\min}$ (Problem 2.2) does not really apply to scattering states, since they are not normalizable. If this bothers you, try solving the Schrödinger equation with $E \leq 0$, for the free particle, and note that even linear combinations of these solutions cannot be normalized. The positive energy solutions by themselves constitute a complete set.

44 The delta function can be thought of as the limit of a sequence of functions, such as rectangles (or triangles) of ever-increasing height and ever-decreasing width.

116

45} The delta function itself carries units of $1\mathop{\left/{\vphantom{\frac{1}{2}}length}}\right.$ (see Equation 2.114), so $\mathfrak{a}$ has the dimensions energy$\times$length.
46 This is not a normalizable wave function, so the absolute probability of finding the particle at a particular location is not well defined; nevertheless, the ratio of probabilities for the incident and reflected waves is meaningful. More on this in the next paragraph.
47 Note that the particle’s velocity is the same on both sides of the well. Problem 2.34 treats the general case.
48 There exist some powerful programs for analyzing the scattering of a wave packet from a one-dimensional potential; see, for instance, “Quantum Tunneling and Wave Packets,” at PhET Interactive Simulations, University of Colorado Boulder, https://phet.colorado.edu.
49 You can, if you like, write the general solution in exponential form $\left(C^{\prime}e^{iIx}+D^{\prime}e^{-iIx}\right)$. This leads to the same final result, but since the potential is symmetric, we know the solutions will be either even or odd, and the sine/cosine notation allows us to exploit this right from the start.
50 We could look for even and odd functions, as we did in the case of bound states, but the scattering problem is inherently asymmetric, since the waves come in from one side only, and the exponential notation (representing traveling waves) is more natural in this context.
51 This remarkable phenomenon was observed in the laboratory before the advent of quantum mechanics, in the form of the Ramsauer–Townsend effect. For an illuminating discussion see Richard W. Robinett, Quantum Mechanics, Oxford University Press, 1997, Section 12.4.1.
52 This is a good example of tunneling—classically the particle would bounce back.
53 For interesting commentary see C. O. Dib and O. Orellana, Eur. J. Phys. 38, 045403 (2017).
54 For further discussion see P. L. Garrido, et al., Am. J. Phys. 79, 1218 (2011).
55 The fact that the classical and quantum revival times bear no obvious relation to one another (and the quantum one doesn’t even depend on the energy) is a curious paradox; see D. F. Styer, Am. J. Phys. 69, 56 (2001).
56 If two solutions differ only by a multiplicative constant (so that, once normalized, they differ only by a phase factor $e^{i\phi}$), they represent the same physical state, and in this sense they are not distinct solutions. Technically, by “distinct” I mean “linearly independent.”
57 In higher dimensions such degeneracy is very common, as we shall see in Chapters 4 and 6. Assume that the potential does not consist of isolated pieces separated by regions where $V=\infty$—two isolated infinite square wells, for instance, would give rise to degenerate bound states, for which the particle is either in one well or in the other.
58 M. Moriconi, Am. J. Phys. 75, 284 (2007).
59 This rare example of an exact closed-form solution to the time-dependent Schrödinger equation was discovered by Schrödinger himself, in 1926. One way to obtain it is explored in Problem 6.30. For a discussion of this and related problems see W. van Dijk, et al., Am. J. Phys. 82, 955 (2014).
60 See Problem 6.35 for a derivation.
61 For illuminating discussion see M. Nauenberg, Am. J. Phys. 84, 879 (2016).
62 R. E. Crandall and B. R. Litt, Annals of Physics, 146, 458 (1983).
63 See any book on differential equations—for example, John L. Van Iwaarden, Ordinary Differential Equations with Numerical Techniques, Harcourt Brace Jovanovich, San Diego, 1985, Chapter 3.
64 For applications of this method see, for instance, D. J. Griffiths and C. A. Steinke, Am. J. Phys. 69, 137 (2001) or S. Das, Am. J. Phys. 83, 590 (2015).
65 This problem was suggested by Nicholas Wheeler.
66 $\psi_{k}(x)$ is normalizable as long as $g$ is real—which is to say, provided $\beta>1/4$. For more on this strange problem see A. M. Essin and D. J. Griffiths, Am. J. Phys. 74, 109 (2006), and references therein.
67 For further discussion see Joel Franklin, Computational Methods for Physics (Cambridge University Press, Cambridge, UK, 2013), Section 10.4.2.
68 See, for instance, Daniel V. Schroeder, An Introduction to Thermal Physics, Pearson, Boston (2000), Section 6.1.
69 By convention Legendre polynomials are normalized such that $P_{\xi}(1)=1$. Note that the nonvanishing coefficients will take different values for different $\bar{\varepsilon}$.

3
Formalism
*
118

119

# 3.1 Hilbert Space

In the previous two chapters we have stumbled on a number of interesting properties of simple quantum systems. Some of these are "accidental" features of specific potentials (the even spacing of energy levels for the harmonic oscillator, for example), but others seem to be more general, and it would be nice to prove them once and for all (the uncertainty principle, for instance, and the orthogonality of stationary states). The purpose of this chapter is to recast the theory in more powerful form, with that in mind. There is not much here that is genuinely new; the idea, rather, is to make coherent sense of what we have already discovered in particular cases.

Quantum theory is based on two constructs: wave functions and operators. The state of a system is represented by its wave function, observables are represented by operators. Mathematically, wave functions satisfy the defining conditions for abstract vectors, and operators act on them as linear transformations. So the natural language of quantum mechanics is linear algebra. $^{1}$

But it is not, I suspect, a form of linear algebra with which you may be familiar. In an $N$-dimensional space it is simplest to represent a vector, $|\alpha\rangle$, by the $N$-tuple of its components, $\{a_n\}$, with respect to a specified orthonormal basis:

$$
|\alpha\rangle \rightarrow \mathbf{a} = \begin{pmatrix} a_1 \\ a_2 \\ \vdots \\ a_N \end{pmatrix}; \tag{3.1}
$$

the inner product, $\langle \alpha | \beta \rangle$, of two vectors (generalizing the dot product in three dimensions) is a complex number,

$$
\langle \alpha | \beta \rangle = a_1^* b_1 + a_2^* b_2 + \cdots + a_N^* b_N; \tag{3.2}
$$

linear transformations, $T$, are represented by matrices (with respect to the specified basis), which act on vectors (to produce new vectors) by the ordinary rules of matrix multiplication:

$$
|\beta\rangle = \hat{T} | \alpha \rangle \rightarrow \mathbf{b} = \mathbf{T} \mathbf{a} = \begin{pmatrix} t_{11} &amp; t_{12} &amp; \cdots &amp; t_{1N} \\ t_{21} &amp; t_{22} &amp; \cdots &amp; t_{2N} \\ \vdots &amp; \vdots &amp; &amp; \vdots \\ t_{N1} &amp; t_{N2} &amp; \cdots &amp; t_{NN} \end{pmatrix} \begin{pmatrix} a_1 \\ a_2 \\ \vdots \\ a_N \end{pmatrix}. \tag{3.3}
$$

But the "vectors" we encounter in quantum mechanics are (for the most part) functions, and they live in infinite-dimensional spaces. For them the $N$-tuple/matrix notation is awkward, at best, and manipulations that are well behaved in the finite-dimensional case can be problematic. (The underlying reason is that whereas the finite sum in Equation 3.2 always exists, an infinite sum—or an integral—may not converge, in which case the inner product does not exist, and any argument involving inner products is immediately suspect.) So even though most of the terminology and notation should be familiar, it pays to approach this subject with caution.

The collection of all functions of $x$ constitutes a vector space, but for our purposes it is much too large. To represent a possible physical state, the wave function $\Psi$ must be normalized:

$$
\int |\Psi|^2 dx = 1.
$$

The set of all square-integrable functions, on a specified interval,²

$$
f(x) \quad \text{such that} \quad \int_{a}^{b} |f(x)|^2 dx &lt; \infty, \tag{3.4}
$$

constitutes a (much smaller) vector space (see Problem 3.1(a)). Mathematicians call it $L^2(a, b)$; physicists call it Hilbert space.³ In quantum mechanics, then:

$$
\text{Wave functions live in Hilbert space.} \tag{3.5}
$$

We define the inner product of two functions, $f(x)$ and $g(x)$, as follows:

$$
\langle f|g\rangle \equiv \int_{a}^{b} f(x)^* g(x) dx. \tag{3.6}
$$

If $f$ and $g$ are both square-integrable (that is, if they are both in Hilbert space), their inner product is guaranteed to exist (the integral in Equation 3.6 converges to a finite number).⁴ This follows from the integral Schwarz inequality:⁵

$$
\left| \int_{a}^{b} f(x)^* g(x) dx \right| \leq \sqrt{ \int_{a}^{b} |f(x)|^2 dx \int_{a}^{b} |g(x)|^2 dx }. \tag{3.7}
$$

You can check for yourself that definition (Equation 3.6) satisfies all the conditions for an inner product (Problem 3.1(b)). Notice in particular that

$$
\langle g|f\rangle = \langle f|g\rangle^*. \tag{3.8}
$$

Moreover, the inner product of $f(x)$ with itself,

$$
\langle f|f\rangle = \int_{a}^{b} |f(x)|^2 dx, \tag{3.9}
$$

is real and non-negative; it's zero only when $f(x) = 0$.⁶

A function is said to be normalized if its inner product with itself is 1; two functions are orthogonal if their inner product is 0; and a set of functions, $\{f_n\}$, is orthonormal if they are normalized and mutually orthogonal:

$$
\langle f_m|f_n\rangle = \delta_{mn}. \tag{3.10}
$$

Finally, a set of functions is complete if any other function (in Hilbert space) can be expressed as a linear combination of them:

$$
f(x) = \sum_{n=1}^{\infty} c_n f_n(x). \tag{3.11}
$$

If the functions $\{f_n(x)\}$ are orthonormal, the coefficients are given by Fourier's trick:

$$
c_n = \langle f_n|f\rangle,
$$

120

as you can check for yourself. I anticipated this terminology, of course, back in Chapter 2. (The (3.12) stationary states of the infinite square well (Equation 2.31) constitute a complete orthonormal set on the interval  $(0,a)$ ; the stationary states for the harmonic oscillator (Equation 2.68 or 2.86) are a complete orthonormal set on the interval  $(-\infty, \infty)$ .)

# Problem 3.1

(a) Show that the set of all square-integrable functions is a vector space (refer to Section A.1 for the definition). Hint: The main point is to show that the sum of two square-integrable functions is itself square-integrable. Use Equation 3.7. Is the set of all normalized functions a vector space?
(b) Show that the integral in Equation 3.6 satisfies the conditions for an inner product (Section A.2).

# Problem 3.2

(a) For what range of  $\mathsf{V}$  is the function  $f(x) = x^{\nu}$  in Hilbert space, on the interval  $(0,1)^{\nu}$ . Assume  $\mathsf{V}$  is real, but not necessarily positive.
(b) For the specific case  $\nu = 1 / 2$ , is  $f(x)$  in this Hilbert space? What about  $xf(x)^{\nu}$  How about  $(d / dx)f(x)^{\nu}$

122
## 3.2 Observables

123

## 3.2.1 Hermitian Operators

The expectation value of an observable $Q(x, p)$ can be expressed very neatly in inner-product notation:7

$$
\langle Q \rangle = \int \Psi^* \hat{Q} \Psi \, dx = \langle \Psi | \hat{Q} \Psi \rangle. \tag{3.13}
$$

Now, the outcome of a measurement has got to be real, and so, a fortiori, is the average of many measurements:

$$
\langle Q \rangle = \langle Q \rangle^*. \tag{3.14}
$$

But the complex conjugate of an inner product reverses the order (Equation 3.8), so

$$
\langle \Psi | \hat{Q} \Psi \rangle = \langle \hat{Q} \Psi | \Psi \rangle, \tag{3.15}
$$

and this must hold true for any wave function $\Psi$. Thus operators representing observables have the very special property that

$$
\langle f | \hat{Q} f \rangle = \langle \hat{Q} f | f \rangle \quad \text{for all } f(x). \tag{3.16}
$$

We call such operators hermitian.8

Actually, most books require an ostensibly stronger condition:

$$
\langle f | \hat{Q} g \rangle = \langle \hat{Q} f | g \rangle \quad \text{for all } f(x) \text{ and all } g(x). \tag{3.17}
$$

But it turns out, in spite of appearances, that this is perfectly equivalent to my definition (Equation 3.16), as you will prove in Problem 3.3. So use whichever you like. The essential point is that a hermitian operator can be applied either to the first member of an inner product or to the second, with the same result, and hermitian operators naturally arise in quantum mechanics because their expectation values are real:

**Observables are represented by hermitian operators.** \tag{3.18}

Well, let's check this. Is the momentum operator, for example, hermitian?

$$
\langle f | \hat{p} g \rangle = \int_{-\infty}^{\infty} f^* (-i\hbar) \frac{dg}{dx} dx = -i\hbar f^* g |_{-\infty}^{\infty} + \int_{-\infty}^{\infty} \left(-i\hbar \frac{df}{dx}\right)^* g dx = \langle \hat{p} f | g \rangle. \tag{3.19}
$$

I used integration by parts, of course, and threw away the boundary term for the usual reason: If $f(x)$ and $g(x)$ are square integrable, they must go to zero at $\pm \infty$. Notice how the complex conjugation of $i$ compensates for the minus sign picked up from integration by parts—the operator $d/dx$ (without the $i$) is not hermitian, and it does not represent a possible observable.

The hermitian conjugate (or adjoint) of an operator $\hat{Q}$ is the operator $\hat{Q}^{\dagger}$ such that

$$
\langle f | \hat{Q} g \rangle = \langle \hat{Q}^{\dagger} f | g \rangle \quad (\text{for all } f \text{ and } g). \tag{3.20}
$$

A hermitian operator, then, is equal to its hermitian conjugate: $\hat{Q} = \hat{Q}^{\dagger}$.

Problem 3.3 Show that if  $\langle h|\hat{Q} h\rangle = \langle \hat{Q} h|h\rangle$  for all  $h$  (in Hilbert space), then  $\langle f|\hat{Q} g\rangle = \langle \hat{Q} f|g\rangle$  for all  $f$  and  $g$  (i.e. the two definitions of "hermitian" — Equations 3.16 and 3.17—are equivalent). Hint: First let  $h = f + g$ , and then let  $h = f + ig$ .

# Problem 3.4

(a) Show that the sum of two hermitian operators is hermitian.
(b) Suppose  $\hat{Q}$  is hermitian, and  $\mathfrak{a}$  is a complex number. Under what condition (on  $\mathfrak{a}$ ) is  $\mathcal{A}\hat{\mathcal{Q}}$  hermitian?
(c) When is the product of two hermitian operators hermitian?
(d) Show that the position operator  $(\hat{x})$  and the Hamiltonian operator  $(\hat{H} = -\left(\hbar^{2} / 2m\right)d^{2} / dx^{2} + V(x))$  are hermitian.

# Problem 3.5

(a) Find the hermitian conjugates of  $x, i$ , and  $d / dx$ .
(b) Show that  $\left(\hat{Q}\hat{R}\right)^{\dagger} = \hat{R}^{\dagger}\hat{Q}^{\dagger}$  (note the reversed order),  $\left(\hat{Q} +\hat{R}\right) = \hat{Q}^{\dagger} + \hat{R}^{\dagger}$ , and  $(c\hat{Q})^{\dagger} = c^{*}\hat{Q}^{\dagger}$  for a complex number  $c$ .
(c) Construct the hermitian conjugate of  $a_{+}$  (Equation 2.48).

125

## 3.2.2 Determinate States

Ordinarily, when you measure an observable $Q$ on an ensemble of identically prepared systems, all in the same state $\Psi$, you do not get the same result each time—this is the indeterminacy of quantum mechanics. Question: Would it be possible to prepare a state such that every measurement of $Q$ is certain to return the same value (call it $q$)? This would be, if you like, a determinate state, for the observable $Q$. (Actually, we already know one example: Stationary states are determinate states of the Hamiltonian; a measurement of the energy, on a particle in the stationary state $\Psi_{H}$, is certain to yield the corresponding "allowed" energy $E_{H}$.)

Well, the standard deviation of $Q$, in a determinate state, would be zero, which is to say,

$$
\sigma^2 = \left\langle \left(Q - \langle Q \rangle\right)^2 \right\rangle = \left\langle \Psi \mid \left(\hat{Q} - q\right)^2 \Psi \right\rangle = \left\langle \left(\hat{Q} - q\right) \Psi \mid \left(\hat{Q} - q\right) \Psi \right\rangle = 0. \tag{3.21}
$$

(Of course, if every measurement gives $q$, their average is also $q$: $\langle Q \rangle = q$. I used the fact that $\hat{Q}$ (and hence also $\hat{Q} - q$) is a hermitian operator, to move one factor over to the first term in the inner product.) But the only vector whose inner product with itself vanishes is 0, so

$$
\hat{Q} \Psi = q \Psi. \tag{3.22}
$$

This is the eigenvalue equation for the operator $\hat{Q}$; $\Psi$ is an eigenfunction of $\hat{Q}$, and $q$ is the corresponding eigenvalue:

$$
\text{Determinate states of } Q \text{ are eigenfunctions of } \hat{Q}. \tag{3.23}
$$

Measurement of $Q$ on such a state is certain to yield the eigenvalue, $q$.10

Note that the eigenvalue is a number (not an operator or a function). You can multiply any eigenfunction by a constant, and it is still an eigenfunction, with the same eigenvalue. Zero does not count as an eigenfunction (we exclude it by definition—otherwise every number would be an eigenvalue, since $\hat{Q}0 = q0 = 0$ for any linear operator $\hat{Q}$ and all $q$). But there's nothing wrong with zero as an eigenvalue. The collection of all the eigenvalues of an operator is called its spectrum. Sometimes two (or more) linearly independent eigenfunctions share the same eigenvalue; in that case the spectrum is said to be degenerate. (You encountered this term already, for the case of energy eigenstates, if you worked Problems 2.44 or 2.46.)

For example, determinate states of the total energy are eigenfunctions of the Hamiltonian:

$$
\hat{H} \psi = E \psi, \tag{3.24}
$$

which is precisely the time-independent Schrödinger equation. In this context we use the letter $E$ for the eigenvalue, and the lower case $\psi$ for the eigenfunction (tack on the wiggle factor $\exp\left(-iEt / \hbar\right)$ to make it $\Psi$, if you like; it's still an eigenfunction of $\hat{H}$).

### Example 3.1

Consider the operator

$$
\hat{Q} \equiv i \frac{d}{d\phi}, \tag{3.25}
$$

where $\phi$ is the usual polar coordinate in two dimensions. (This operator might arise in a physical context if we were studying the bead-on-a-ring; see Problem 2.46.) Is $\hat{\underline{Q}}$ hermitian? Find its eigenfunctions and eigenvalues.

**Solution**: Here we are working with functions $f(\phi)$ on the finite interval $0 \leq \phi \leq 2\pi$, with the property that

$$
f(\phi + 2\pi) = f(\phi), \tag{3.26}
$$

since $\phi$ and $\phi + 2\pi$ describe the same physical point. Using integration by parts,

$$
\left\langle f \mid \hat{Q} g \right\rangle = \int_{0}^{2\pi} f^* \left(i \frac{dg}{d\phi}\right) d\phi = i f^* g \Big|_{0}^{2\pi} - \int_{0}^{2\pi} i \left(\frac{df^*}{d\phi}\right) g d\phi = \left\langle \hat{Q} f \mid g \right\rangle,
$$

so $\hat{\underline{Q}}$ is hermitian (this time the boundary term disappears by virtue of Equation 3.26).

The eigenvalue equation,

$$
i \frac{d}{d\phi} f(\phi) = q f(\phi), \tag{3.27}
$$

has the general solution

$$
f(\phi) = A e^{-i q \phi}. \tag{3.28}
$$

Equation 3.26 restricts the possible values of the $q$:

$$
e^{-i q 2\pi} = 1 \quad \Rightarrow \quad q = 0, \pm 1, \pm 2, \dots \tag{3.29}
$$

The spectrum of this operator is the set of all integers, and it is nondegenerate.

**Problem 3.6** Consider the operator $\hat{\underline{Q}} = d^2 / d\phi^2$, where (as in Example 3.1) $\phi$ is the azimuthal angle in polar coordinates, and the functions are subject to Equation 3.26. Is $\hat{\underline{Q}}$ hermitian? Find its eigenfunctions and eigenvalues. What is the spectrum of $\hat{\underline{Q}}^2$? Is the spectrum degenerate?

126

127

## 3.3 Eigenfunctions of a Hermitian Operator

Our attention is thus directed to the eigenfunctions of hermitian operators (physically: determinate states of observables). These fall into two categories: If the spectrum is discrete (i.e. the eigenvalues are separated from one another) then the eigenfunctions lie in Hilbert space and they constitute physically realizable states. If the spectrum is continuous (i.e. the eigenvalues fill out an entire range) then the eigenfunctions are not normalizable, and they do not represent possible wave functions (though linear combinations of them—involving necessarily a spread in eigenvalues—may be normalizable). Some operators have a discrete spectrum only (for example, the Hamiltonian for the harmonic oscillator), some have only a continuous spectrum (for example, the free particle Hamiltonian), and some have both a discrete part and a continuous part (for example, the Hamiltonian for a finite square well). The discrete case is easier to handle, because the relevant inner products are guaranteed to exist—in fact, it is very similar to the finite-dimensional theory (the eigenvectors of a hermitian matrix). I'll treat the discrete case first, and then the continuous one.

128

## 3.3.1 Discrete Spectra

Mathematically, the normalizable eigenfunctions of a hermitian operator have two important properties:

**Theorem 1** Their eigenvalues are real.

Proof: Suppose

$$
\hat {Q} f = q f,
$$

(i.e. $f(x)$ is an eigenfunction of $\hat{Q}$, with eigenvalue $q$), and

$$
\left\langle f \mid \hat {Q} f \right\rangle = \left\langle \hat {Q} f \mid f \right\rangle
$$

($\hat{Q}$ is hermitian). Then

$$
q \langle f | f \rangle = q ^ {*} \langle f | f \rangle
$$

($q$ is a number, so it comes outside the integral, and because the first function in the inner product is complex conjugated (Equation 3.6), so too is the $q$ on the right). But $\langle f|f\rangle$ cannot be zero ($f(x) = 0$ is not a legal eigenfunction), so $q = q^{*}$, and hence $q$ is real. QED

This is comforting: If you measure an observable on a particle in a determinate state, you will at least get a real number.

**Theorem 2** Eigenfunctions belonging to distinct eigenvalues are orthogonal.

Proof: Suppose

$$
\hat {Q} f = q f, \quad \text{and} \quad \hat {Q} g = q ^ {\prime} g,
$$

and $\hat{Q}$ is hermitian. Then $\left\langle f \mid \hat{Q} g \right\rangle = \left\langle \hat{Q} f \mid g \right\rangle$, so

$$
q ^ {\prime} \langle f | g \rangle = q ^ {*} \langle f | g \rangle
$$

(again, the inner products exist because the eigenfunctions are in Hilbert space). But $q$ is real (from Theorem 1), so if $q' \neq q$ it must be that $\langle f | g \rangle = 0$. QED

That's why the stationary states of the infinite square well, for example, or the harmonic oscillator, are orthogonal—they are eigenfunctions of the Hamiltonian with distinct eigenvalues. But this property is not peculiar to them, or even to the Hamiltonian—the same holds for determinate states of any observable.

Unfortunately, Theorem 2 tells us nothing about degenerate states ($q' = q$). However, if two (or more) eigenfunctions share the same eigenvalue, any linear combination of them is itself an eigenfunction, with the same eigenvalue (Problem 3.7), and we can use the Gram-Schmidt orthogonalization procedure (Problem A.4) to construct orthogonal eigenfunctions within each degenerate subspace. It is almost never necessary to do this explicitly (thank God!), but it can always be done in principle. So even in the presence of degeneracy the eigenfunctions can be chosen to be orthonormal, and we shall always assume that this has been done. That licenses the use of Fourier's trick, which depends on the orthonormality of the basis functions.

In a finite-dimensional vector space the eigenvectors of a hermitian matrix have a third fundamental property: They span the space (every vector can be expressed as a linear combination of them). Unfortunately,

the proof does not generalize to infinite-dimensional spaces. But the property itself is essential to the internal consistency of quantum mechanics, so (following Dirac $^{12}$ ) we will take it as an axiom (or, more precisely, as a restriction on the class of hermitian operators that can represent observables):

Axiom: The eigenfunctions of an observable operator are complete: Any function (in Hilbert space) can be expressed as a linear combination of them. $^{13}$

# Problem 3.7

(a) Suppose that  $f(x)$  and  $g(x)$  are two eigenfunctions of an operator  $\hat{\mathcal{Q}}$ , with the same eigenvalue  $q$ . Show that any linear combination of  $f$  and  $g$  is itself an eigenfunction of  $\hat{\mathcal{Q}}$ , with eigenvalue  $q$ .
(b) Check that  $f(x) = \exp (x)$  and  $g(x) = \exp (-x)$  are eigenfunctions of the operator  $d^2 /dx^2$ , with the same eigenvalue. Construct two linear combinations of  $f$  and  $g$  that are orthogonal eigenfunctions on the interval  $(-1,1)$ .

# Problem 3.8

(a) Check that the eigenvalues of the hermitian operator in Example 3.1 are real. Show that the eigenfunctions (for distinct eigenvalues) are orthogonal.
(b) Do the same for the operator in Problem 3.6.

130

## 3.3.2 Continuous Spectra

If the spectrum of a hermitian operator is *continuous*, the eigenfunctions are not normalizable, and the proofs of Theorems 1 and 2 fail, because the inner products may not exist. Nevertheless, there is a sense in which the three essential properties (reality, orthogonality, and completeness) still hold. I think it's best to approach this case through specific examples.

### Example 3.2

Find the eigenfunctions and eigenvalues of the momentum operator (on the interval $-\infty &lt; x &lt; \infty$).

**Solution**: Let $f_{p}(x)$ be the eigenfunction and $p$ the eigenvalue:

$$
-i \hbar \frac{d}{dx} f_{p}(x) = p f_{p}(x). \tag{3.30}
$$

The general solution is

$$
f_{p}(x) = A e^{i p x / \hbar}.
$$

This is not square-integrable for any (complex) value of $p$ — the momentum operator has no eigenfunctions in Hilbert space.

And yet, if we restrict ourselves to *real* eigenvalues, we do recover a kind of *ersatz* "orthonormality." Referring to Problems 2.23(a) and 2.26,

$$
\int_{-\infty}^{\infty} f_{p'}^*(x) f_{p}(x) dx = |A|^2 \int_{-\infty}^{\infty} e^{i (p - p') x / \hbar} dx = |A|^2 2\pi \hbar \delta (p - p'). \tag{3.31}
$$

If we pick $A = 1 / \sqrt{2\pi \hbar}$, so that

$$
f_{p}(x) = \frac{1}{\sqrt{2\pi \hbar}} e^{i p x / \hbar}, \tag{3.32}
$$

then

$$
\left\langle f_{p'} \right| f_{p} \rangle = \delta (p - p'), \tag{3.33}
$$

which is reminiscent of *true* orthonormality (Equation 3.10) — the indices are now continuous variables, and the Kronecker delta has become a Dirac delta, but otherwise it looks just the same. I'll call Equation 3.33 *Dirac orthonormality*.

Most important, the eigenfunctions (with real eigenvalues) are *complete*, with the sum (in Equation 3.11) replaced by an integral: Any (square-integrable) function $f(x)$ can be written in the form

$$
f(x) = \int_{-\infty}^{\infty} c(p) f_{p}(x) dp = \frac{1}{\sqrt{2\pi \hbar}} \int_{-\infty}^{\infty} c(p) e^{i p x / \hbar} dp. \tag{3.34}
$$

The "coefficients" (now a *function*, $c(p)$) are obtained, as always, by Fourier's trick:

$$
\left\langle f _ {p ^ {\prime}} \mid f \right\rangle = \int_ {- \infty} ^ {\infty} c (p) \left\langle f _ {p ^ {\prime}} \mid f _ {p} \right\rangle d p = \int_ {- \infty} ^ {\infty} c (p) \delta (p - p ^ {\prime}) d p = c (p ^ {\prime}). \tag {3.35}
$$

Alternatively, you can get them from Plancherel's theorem (Equation 2.103); indeed, the expansion (Equation 3.34) is nothing but a Fourier transform.

The eigenfunctions of momentum (Equation 3.32) are sinusoidal, with wavelength

$$
\lambda = \frac {2 \pi \hbar}{p}. \tag {3.36}
$$

This is the old de Broglie formula (Equation 1.39), which I promised to justify at the appropriate time. It turns out to be a little more subtle than de Broglie imagined, because we now know that there is actually no such thing as a particle with determinate momentum. But we could make a normalizable wave packet with a narrow range of momenta, and it is to such an object that the de Broglie relation applies.

What are we to make of Example 3.2? Although none of the eigenfunctions of  $\hat{p}$  lives in Hilbert space, a certain family of them (those with real eigenvalues) resides in the nearby "suburbs," with a kind of quasi-normalizability. They do not represent possible physical states, but they are still very useful (as we have already seen, in our study of one-dimensional scattering).[14]

## Example 3.3

Find the eigenfunctions and eigenvalues of the position operator.

**Solution:** Let  $g_{y}(x)$  be the eigenfunction and  $y$  the eigenvalue:

$$
\hat {x} g _ {y} (x) = x g _ {y} (x) = y g _ {y} (x). \tag {3.37}
$$

Here  $y$  is a fixed number (for any given eigenfunction), but  $x$  is a continuous variable. What function of  $x$  has the property that multiplying it by  $x$  is the same as multiplying it by the constant  $y$ ? Obviously it's got to be zero, except at the one point  $x = y$ ; in fact, it is nothing but the Dirac delta function:

$$
g _ {y} (x) = A \delta (x - y).
$$

This time the eigenvalue has to be real; the eigenfunctions are not square integrable, but again they admit Dirac orthonormality:

$$
\int_ {- \infty} ^ {\infty} g _ {y ^ {\prime}} ^ {*} (x) g _ {y} (x) d x = | A | ^ {2} \int_ {- \infty} ^ {\infty} \delta (x - y ^ {\prime}) \delta (x - y) d x = | A | ^ {2} \delta (y - y ^ {\prime}). \tag {3.38}
$$

If we pick  $A = 1$ , so

$$
g _ {y} (x) = \delta (x - y), \tag {3.39}
$$

then

$$
\left\langle g _ {y ^ {\prime}} \right| g _ {y} \rangle = \delta (y - y ^ {\prime}). \tag {3.40}
$$

These eigenfunctions are also complete:

$$
f(x) = \int_{-\infty}^{\infty} c(y) g_y(x) dy = \int_{-\infty}^{\infty} c(y) \delta(x - y) dy, \tag{3.41}
$$

with

$$
c(y) = f(y) \tag{3.42}
$$

(trivial, in this case, but you can get it from Fourier's trick if you insist).

If the spectrum of a hermitian operator is continuous (so the eigenvalues are labeled by a continuous variable—$p$ or $y$, in the examples; $z$, generically, in what follows), the eigenfunctions are not normalizable, they are not in Hilbert space and they do not represent possible physical states; nevertheless, the eigenfunctions with real eigenvalues are Dirac orthonormalizable and complete (with the sum now an integral). Luckily, this is all we really require.

## Problem 3.9

(a) Cite a Hamiltonian from Chapter 2 (other than the harmonic oscillator) that has only a discrete spectrum.
(b) Cite a Hamiltonian from Chapter 2 (other than the free particle) that has only a continuous spectrum.
(c) Cite a Hamiltonian from Chapter 2 (other than the finite square well) that has both a discrete and a continuous part to its spectrum.

## Problem 3.10

Is the ground state of the infinite square well an eigenfunction of momentum? If so, what is its momentum? If not, why not? [For further discussion, see Problem 3.34.]

133

# 3.4 Generalized Statistical Interpretation

In Chapter 1 I showed you how to calculate the probability that a particle would be found in a particular location, and how to determine the expectation value of any observable quantity. In Chapter 2 you learned how to find the possible outcomes of an energy measurement, and their probabilities. I am now in a position to state the generalized statistical interpretation, which subsumes all of this, and enables you to figure out the possible results of any measurement, and their probabilities. Together with the Schrödinger equation (which tells you how the wave function evolves in time) it is the foundation of quantum mechanics.

Generalized statistical interpretation: If you measure an observable $Q(x, p)$ on a particle in the state $\Psi(x, t)$, you are certain to get one of the eigenvalues of the hermitian operator $\hat{Q}(x, -\mathrm{i}\hbar d / dx)$. If the spectrum of $\hat{Q}$ is discrete, the probability of getting the particular eigenvalue $q_n$ associated with the (orthonormalized) eigenfunction $f_n(x)$ is

$$
\left| c _ {n} \right| ^ {2}, \quad \text{where} \quad c _ {n} = \langle f _ {n} | \Psi \rangle . \tag {3.43}
$$

If the spectrum is continuous, with real eigenvalues $q(z)$ and associated (Dirac-orthonormalized) eigenfunctions $f_{z}(x)$, the probability of getting a result in the range $dz$ is

$$
\left| c (z) \right| ^ {2} d z \quad \text{where} \quad c (z) = \langle f _ {z} | \Psi \rangle . \tag {3.44}
$$

Upon measurement, the wave function "collapses" to the corresponding eigenstate.^[15]

The statistical interpretation is radically different from anything we encounter in classical physics. A somewhat different perspective helps to make it plausible: The eigenfunctions of an observable operator are complete, so the wave function can be written as a linear combination of them:

$$
\Psi (x, t) = \sum_ {n} c _ {n} (t) f _ {n} (x). \tag {3.45}
$$

(For simplicity, I'll assume that the spectrum is discrete; it's easy to generalize this discussion to the continuous case.) Because the eigenfunctions are orthonormal, the coefficients are given by Fourier's trick:^[17]

$$
c _ {n} (t) = \langle f _ {n} | \Psi \rangle = \int f _ {n} (x) ^ {*} \Psi (x, t) d x. \tag {3.46}
$$

Qualitatively, $c_{n}$ tells you "how much $f_{n}$ is contained in $\Psi$," and given that a measurement has to return one of the eigenvalues of $\hat{\mathbf{Q}}$, it seems reasonable that the probability of getting the particular eigenvalue $q_{n}$ would be determined by the "amount of $f_{n}$" in $\Psi$. But because probabilities are determined by the absolute square of the wave function, the precise measure is actually $|c_{n}|^{2}$. That's the essential message of the generalized statistical interpretation.^[18]

Of course, the total probability (summed over all possible outcomes) has got to be one:

$$
\sum_ {n} \left| c _ {n} \right| ^ {2} = 1, \tag {3.47}
$$

and sure enough, this follows from the normalization of the wave function:

$$
\begin{array}{l} 1 = \langle \Psi | \Psi \rangle = \left\langle \left(\sum_ {n ^ {\prime}} c _ {n ^ {\prime}} f _ {n ^ {\prime}}\right) \right| \left(\sum_ {n} c _ {n} f _ {n}\right) \Bigg \rangle = \sum_ {n ^ {\prime}} \sum_ {n} c _ {n ^ {\prime}} ^ {*} c _ {n} \left\langle f _ {n ^ {\prime}} \mid f _ {n} \right\rangle \tag {3.48} \\ = \sum_ {n ^ {\prime}} \sum_ {n} c _ {n ^ {\prime}} ^ {*} c _ {n} \delta_ {n ^ {\prime} n} = \sum_ {n} c _ {n} ^ {*} c _ {n} = \sum_ {n} | c _ {n} | ^ {2}. \\ \end{array}
$$

Similarly, the expectation value of  $Q$  should be the sum over all possible outcomes of the eigenvalue times the probability of getting that eigenvalue:

$$
\langle Q \rangle = \sum_ {n} q _ {n} | c _ {n} | ^ {2}. \tag {3.49}
$$

Indeed,

$$
\langle Q \rangle = \left\langle \Psi \right| \hat {Q} \Psi \rangle = \left\langle \left(\sum_ {n ^ {\prime}} c _ {n ^ {\prime}} f _ {n ^ {\prime}}\right) \right| \left(\hat {Q} \sum_ {n} c _ {n} f _ {n}\right) \Bigg \rangle , \tag {3.50}
$$

but  $\hat{Q} f_{n} = q_{n}f_{n^{\prime}}$  so

$$
\langle Q \rangle = \sum_ {n ^ {\prime}} \sum_ {n} c _ {n ^ {\prime}} ^ {*} c _ {n} q _ {n} \left\langle f _ {n ^ {\prime}} \right| f _ {n} \rangle = \sum_ {n ^ {\prime}} \sum_ {n} c _ {n ^ {\prime}} ^ {*} c _ {n} q _ {n} \delta_ {n ^ {\prime} n} = \sum_ {n} q _ {n} \left| c _ {n} \right| ^ {2}. \tag {3.51}
$$

So far, at least, everything looks consistent.

Can we reproduce, in this language, the original statistical interpretation for position measurements? Sure—it's overkill, but worth checking. A measurement of  $x$  on a particle in state  $\Psi$  must return one of the eigenvalues of the position operator. Well, in Example 3.3 we found that every (real) number  $y$  is an eigenvalue of  $x$ , and the corresponding (Dirac-orthonormalized) eigenfunction is  $g_{y}(x) = \delta(x - y)$ . Evidently

$$
c (y) = \left\langle g _ {y} \right| \Psi \rangle = \int_ {- \infty} ^ {\infty} \delta (x - y) \Psi (x, t) d x = \Psi (y, t), \tag {3.52}
$$

so the probability of getting a result in the range  $dy$  is  $|\Psi(y, t)|^2 dy$ , which is precisely the original statistical interpretation.

What about momentum? In Example 3.2 we found the (Dirac-orthonormalized) eigenfunctions of the momentum operator,  $f_{p}(x) = (1 / \sqrt{2\pi\hbar})\exp (ipx / \hbar)$ , so

$$
c (p) = \left\langle f _ {p} \right| \Psi \rangle = \frac {1}{\sqrt {2 \pi \hbar}} \int_ {- \infty} ^ {\infty} e ^ {- i p x / \hbar} \Psi (x, t) d x. \tag {3.53}
$$

This is such an important quantity that we give it a special name and symbol: the momentum space wave function,  $\Phi(p,t)$ . It is essentially the Fourier transform of the (position space) wave function  $\Psi(x,t)$  which, by Plancherel's theorem, is its inverse Fourier transform:

$$
\Phi (p, t) = \frac {1}{\sqrt {2 \pi \hbar}} \int_ {- \infty} ^ {\infty} e ^ {- i p x / \hbar} \Psi (x, t) d x; \tag {3.54}
$$

$$
\Psi (x, t) = \frac {1}{\sqrt {2 \pi \hbar}} \int_ {- \infty} ^ {\infty} e ^ {i p x / \hbar} \Phi (p, t) d p. \tag {3.55}
$$

According to the generalized statistical interpretation, the probability that a measurement of momentum would yield a result in the range $dp$ is

$$
\left| \Phi (p, t) \right| ^ {2} d p. \tag {3.56}
$$

## Example 3.4

A particle of mass $m$ is bound in the delta function well $V(x) = -\alpha \delta (x)$. What is the probability that a measurement of its momentum would yield a value greater than $p_0 = m\alpha /\hbar$?

**Solution:** The (position space) wave function is (Equation 2.132)

$$
\Psi (x, t) = \frac {\sqrt {m \alpha}}{\hbar} e ^ {- m \alpha | x | / \hbar^ {2}} e ^ {- i E t / \hbar}
$$

(where $E = -m\alpha^2 / 2\hbar^2$). The momentum space wave function is therefore

$$
\Phi (p, t) = \frac {1}{\sqrt {2 \pi \hbar}} \frac {\sqrt {m \alpha}}{\hbar} e ^ {- i E t / \hbar} \int_ {- \infty} ^ {\infty} e ^ {- i p x / \hbar} e ^ {- m \alpha | x | / \hbar^ {2}} d x = \sqrt {\frac {2}{\pi}} \frac {p _ {0} ^ {3 / 2} e ^ {- i E t / \hbar}}{p ^ {2} + p _ {0} ^ {2}}
$$

(I looked up the integral). The probability, then, is

$$
\frac {2}{\pi} p _ {0} ^ {3} \int_ {p _ {0}} ^ {\infty} \frac {1}{\left(p ^ {2} + p _ {0} ^ {2}\right) ^ {2}} d p = \frac {1}{\pi} \left[ \frac {p p _ {0}}{p ^ {2} + p _ {0} ^ {2}} + \tan^ {- 1} \left(\frac {p}{p _ {0}}\right) \right] \Bigg | _ {p _ {0}} ^ {\infty} = \frac {1}{4} - \frac {1}{2 \pi} = 0.0908
$$

(again, I looked up the integral).

**Problem 3.11** Find the momentum-space wave function, $\Phi (p,t)$, for a particle in the ground state of the harmonic oscillator. What is the probability (to two significant digits) that a measurement of $p$ on a particle in this state would yield a value outside the classical range (for the same energy)? *Hint:* Look in a math table under "Normal Distribution" or "Error Function" for the numerical part—or use Mathematica.

**Problem 3.12** Find $\Phi (p,t)$ for the free particle in terms of the function $\phi (k)$ introduced in Equation 2.101. Show that for the free particle $|\Phi (p,t)|^2$ is independent of time. *Comment:* the time independence of $|\Phi (p,t)|^2$ for the free particle is a manifestation of momentum conservation in this system.

**Problem 3.13** Show that

$$
\langle x \rangle = \int \Phi^ {*} \left(i \hbar \frac {\partial}{\partial p}\right) \Phi d p. \tag {3.57}
$$

Hint: Notice that  $x \exp (ipx / \hbar) = -i\hbar (\partial /\partial p)\exp (ipx / \hbar)$ , and use Equation 2.147. In momentum space, then, the position operator is  $i\hbar \partial /\partial p$ . More generally,

$$
\langle Q (x, p, t) \rangle = \left\{ \begin{array}{l l} \int \Psi^ {*} \hat {Q} (x, - i \hbar \frac {\partial}{\partial x}, t) \Psi d x, &amp; \text {i n p o s i t i o n s p a c e ;} \\ \int \Phi^ {*} \hat {Q} (i \hbar \frac {\partial}{\partial p}, p, t) \Phi d p, &amp; \text {i n m o m e n t u m s p a c e .} \end{array} \right. \tag {3.58}
$$

In principle you can do all calculations in momentum space just as well (though not always as easily) as in position space.

137

## 3.5 The Uncertainty Principle

I stated the uncertainty principle (in the form $\sigma_x\sigma_p \geq \hbar / 2$), back in Section 1.6, and you have checked it several times, in the problems. But we have never actually proved it. In this section I will prove a more general version of the uncertainty principle, and explore some of its ramifications. The argument is beautiful, but rather abstract, so watch closely.

138

# 3.5.1 Proof of the Generalized Uncertainty Principle

For any observable $A$, we have (Equation 3.21):

$$
\sigma_{A}^{2} = \left\langle \left(\hat{A} - \langle A \rangle\right) \Psi \mid \left(\hat{A} - \langle A \rangle\right) \Psi \right\rangle = \langle f | f \rangle
$$

where $f \equiv \left(\hat{A} - \langle A \rangle\right)\Psi$. Likewise, for any other observable, $B$,

$$
\sigma_{B}^{2} = \langle g | g \rangle, \quad \text{where } g \equiv \left(\hat{B} - \langle B \rangle\right)\Psi.
$$

Therefore (invoking the Schwarz inequality, Equation 3.7),

$$
\sigma_{A}^{2} \sigma_{B}^{2} = \langle f | f \rangle \langle g | g \rangle \geq |\langle f | g \rangle|^{2}. \tag{3.59}
$$

Now, for any complex number $z$,

$$
|z|^{2} = [\operatorname{Re}(z)]^{2} + [\operatorname{Im}(z)]^{2} \geq [\operatorname{Im}(z)]^{2} = \left[ \frac{1}{2i} (z - z^{*}) \right]^{2}. \tag{3.60}
$$

Therefore, letting $z = \langle f | g \rangle$,

$$
\sigma_{A}^{2} \sigma_{B}^{2} \geq \left(\frac{1}{2i} \left[ \langle f | g \rangle - \langle g | f \rangle \right]\right)^{2}. \tag{3.61}
$$

But (exploiting the hermiticity of $\left(\hat{A} - \langle A \rangle\right)$ in the first line)

$$
\begin{aligned}
\langle f | g \rangle &amp;= \left\langle \left(\hat{A} - \langle A \rangle\right) \Psi \mid \left(\hat{B} - \langle B \rangle\right) \Psi \right\rangle = \left\langle \Psi \mid \left(\hat{A} - \langle A \rangle\right) \left(\hat{B} - \langle B \rangle\right) \Psi \right\rangle \\
&amp;= \left\langle \Psi \mid \left(\hat{A} \hat{B} - \hat{A} \langle B \rangle - \hat{B} \langle A \rangle + \langle A \rangle \langle B \rangle\right) \Psi \right\rangle \\
&amp;= \left\langle \Psi \mid \hat{A} \hat{B} \Psi \right\rangle - \langle B \rangle \left\langle \Psi \mid \hat{A} \Psi \right\rangle - \langle A \rangle \left\langle \Psi \mid \hat{B} \Psi \right\rangle + \langle A \rangle \langle B \rangle \langle \Psi | \Psi \rangle \\
&amp;= \left\langle \hat{A} \hat{B} \right\rangle - \langle B \rangle \langle A \rangle - \langle A \rangle \langle B \rangle + \langle A \rangle \langle B \rangle \\
&amp;= \left\langle \hat{A} \hat{B} \right\rangle - \langle A \rangle \langle B \rangle.
\end{aligned}
$$

(Remember, $\langle A \rangle$ and $\langle B \rangle$ are numbers, not operators, so you can write them in either order.) Similarly,

$$
\langle g | f \rangle = \left\langle \hat{B} \hat{A} \right\rangle - \langle A \rangle \langle B \rangle,
$$

so

$$
\langle f | g \rangle - \langle g | f \rangle = \left\langle \hat{A} \hat{B} \right\rangle - \left\langle \hat{B} \hat{A} \right\rangle = \left\langle \left[ \hat{A}, \hat{B} \right] \right\rangle,
$$

where

$$
\left[ \hat{A}, \hat{B} \right] \equiv \hat{A} \hat{B} - \hat{B} \hat{A}
$$

is the commutator of the two operators (Equation 2.49). Conclusion:

$\boxed{\sigma_{A}^{2}\sigma_{B}^{2}\geq\left(\frac{1}{2i}\left\langle\left[\hat{A},\hat{B}\right]\right\rangle\right)^{2}.}$ (3.62)

This is the (generalized) uncertainty principle. (You might think the $i$ makes it trivial—isn't the right side negative? No, for the commutator of two hermitian operators carries its own factor of $i$, and the two cancel out; [19] the quantity in parentheses is real, and its square is positive.)

As an example, suppose the first observable is position $\left(\hat{A}=x\right)$, and the second is momentum $\left(\hat{B}=-i\hbar d/dx\right)$. We worked out their commutator back in Chapter 2 (Equation 2.52):

$\left[\hat{x},\hat{p}\right]=i\hbar.$

So

$\sigma_{x}^{2}\sigma_{p}^{2}\geq\left(\frac{1}{2i}i\hbar\right)^{2}=\left(\frac{\hbar}{2}\right)^{2},$

or, since standard deviations are by their nature positive,

$\sigma_{x}\sigma_{p}\geq\frac{\hbar}{2}.$ (3.63)

That's the original Heisenberg uncertainty principle, but we now see that it is just one application of a much more general theorem.

There is, in fact, an “uncertainty principle” for every pair of observables whose operators do not commute—we call them incompatible observables. Incompatible observables do not have shared eigenfunctions—at least, they cannot have a complete set of common eigenfunctions (see Problem 3.16). By contrast, compatible (commuting) observables do admit complete sets of simultaneous eigenfunctions (that is: states that are determinate for both observables). [20] For example, in the hydrogen atom (as we shall see in Chapter 4) the Hamiltonian, the magnitude of the angular momentum, and the $z$ component of angular momentum are mutually compatible observables, and we will construct simultaneous eigenfunctions of all three, labeled by their respective eigenvalues. But there is no eigenfunction of position that is also an eigenfunction of momentum; these operators are incompatible.

Note that the uncertainty principle is not an extra assumption in quantum theory, but rather a consequence of the statistical interpretation. You might wonder how it is enforced in the laboratory—why can't you determine (say) both the position and the momentum of a particle? You can certainly measure the position of the particle, but the act of measurement collapses the wave function to a narrow spike, which necessarily carries a broad range of wavelengths (hence momenta) in its Fourier decomposition. If you now measure the momentum, the state will collapse to a long sinusoidal wave, with (now) a well-defined wavelength—but the particle no longer has the position you got in the first measurement. [21] The problem, then, is that the second measurement renders the outcome of the first measurement obsolete. Only if the wave function were simultaneously an eigenstate of both observables would it be possible to make the second measurement without disturbing the state of the particle (the second collapse wouldn't change anything, in that case). But this is only possible, in general, if the two observables are compatible.

Problem 3.14

(a) Prove the following commutator identities:

$$
\left[ \hat {A} + \hat {B}, \hat {C} \right] = \left[ \hat {A}, \hat {C} \right] + \left[ \hat {B}, \hat {C} \right], \tag {3.64}
$$

$$
\left[ \hat {A} \hat {B}, \hat {C} \right] = \hat {A} \left[ \hat {B}, \hat {C} \right] + \left[ \hat {A}, \hat {C} \right] \hat {B}. \tag {3.65}
$$

(b) Show that

$$
\left[ x ^ {n}, \hat {p} \right] = i \hbar n x ^ {n - 1}.
$$

(c) Show more generally that

$$
\left[ f (x), \hat {p} \right] = i \hbar \frac {d f}{d x}, \tag {3.66}
$$

for any function  $f(x)$  that admits a Taylor series expansion.

(d) Show that for the simple harmonic oscillator

$$
\left[ \hat {H}, \hat {a} _ {\pm} \right] = \pm \hbar \omega \hat {a} _ {\pm}. \tag {3.67}
$$

Hint: Use Equation 2.54.

Problem 3.15 Prove the famous “(your name) uncertainty principle,” relating the uncertainty in position  $(A = x)$  to the uncertainty in energy  $\left(B = p^{2} / 2m + V\right)$ :

$$
\sigma_ {x} \sigma_ {H} \geq \frac {\hbar}{2 m} | \langle p \rangle |.
$$

For stationary states this doesn't tell you much—why not?

Problem 3.16 Show that two noncommuting operators cannot have a complete set of common eigenfunctions. Hint: Show that if  $\hat{\pmb{p}}$  and  $\hat{\pmb{Q}}$  have a complete set of common eigenfunctions, then  $\left[\hat{P},\hat{Q}\right]f = 0$  for any function in Hilbert space.

141

## 3.5.2 The Minimum-Uncertainty Wave Packet

We have twice encountered wave functions that bit the position-momentum uncertainty limit $\left(\sigma_{x}\sigma_{p} = \hbar /2\right)$; the ground state of the harmonic oscillator (Problem 2.11) and the Gaussian wave packet for the free particle (Problem 2.21). This raises an interesting question: What is the most general minimum-uncertainty wave packet? Looking back at the proof of the uncertainty principle, we note that there were two points at which inequalities came into the argument: Equation 3.59 and Equation 3.60. Suppose we require that each of these be an equality, and see what this tells us about $\Psi$.

The Schwarz inequality becomes an equality when one function is a multiple of the other: $g(x) = cf(x)$, for some complex number $c$ (see Problem A.5). Meanwhile, in Equation 3.60 I threw away the real part of $z$; equality results if $\operatorname{Re}(z) = 0$, which is to say, if $\operatorname{Re}\langle f|g\rangle = \operatorname{Re}\left(c\langle f|f\rangle\right) = 0$. Now, $\langle f|f\rangle$ is certainly real, so this means the constant $c$ must be pure imaginary—let's call it $ia$. The necessary and sufficient condition for minimum uncertainty, then, is

$$
g (x) = i a f (x), \quad \text{where } a \text{ is real}. \tag {3.68}
$$

For the position-momentum uncertainty principle this criterion becomes:

$$
\left(- i \hbar \frac {d}{d x} - \langle p \rangle\right) \Psi = i a (x - \langle x \rangle) \Psi , \tag {3.69}
$$

which is a differential equation for $\Psi$ as a function of $x$. Its general solution (see Problem 3.17) is

$$
\Psi (x) = A e ^ {- a (x - \langle x \rangle) ^ {2} / 2 \hbar} e ^ {i \langle p \rangle x / \hbar}. \tag {3.70}
$$

Evidently the minimum-uncertainty wave packet is a gaussian—and, sure enough, the two examples we encountered earlier were gaussians.²²

**Problem 3.17** Solve Equation 3.69 for $\Psi(x)$. Note that $\langle x \rangle$ and $\langle p \rangle$ are constants (independent of $s$).

142

## 3.5.3 The Energy-Time Uncertainty Principle

The position-momentum uncertainty principle is often written in the form

$$
\Delta x \Delta p \geq \frac {\hbar}{2}; \tag {3.71}
$$

$\Delta x$ (the "uncertainty" in $x$) is loose notation (and sloppy language) for the standard deviation of the results of repeated measurements on identically prepared systems.²³ Equation 3.71 is often paired with the energy-time uncertainty principle,

$$
\Delta t \Delta E \geq \frac {\hbar}{2}. \tag {3.72}
$$

Indeed, in the context of special relativity the energy-time form might be thought of as a consequence of the position-momentum version, because $x$ and $t$ (or rather, $ct$) go together in the position-time four-vector, while $p$ and $E$ (or rather, $E/c$) go together in the energy-momentum four-vector. So in a relativistic theory Equation 3.72 would be a necessary concomitant to Equation 3.71. But we're not doing relativistic quantum mechanics. The Schrödinger equation is explicitly nonrelativistic: It treats $t$ and $x$ on a very unequal footing (as a differential equation it is first-order in $t$, but second-order in $x$), and Equation 3.72 is emphatically not implied by Equation 3.71. My purpose now is to derive the energy-time uncertainty principle, and in the course of that derivation to persuade you that it is really an altogether different beast, whose superficial resemblance to the position-momentum uncertainty principle is actually quite misleading.

After all, position, momentum, and energy are all dynamical variables—measurable characteristics of the system, at any given time. But time itself is not a dynamical variable (not, at any rate, in a nonrelativistic theory): You don't go out and measure the "time" of a particle, as you might its position or its energy. Time is the independent variable, of which the dynamical quantities are functions. In particular, the $\Delta t$ in the energy-time uncertainty principle is not the standard deviation of a collection of time measurements; roughly speaking (I'll make this more precise in a moment) it is the time it takes the system to change substantially.

As a measure of how fast the system is changing, let us compute the time derivative of the expectation value of some observable, $Q(x, p, t)$:

$$
\frac {d}{d t} \langle Q \rangle = \frac {d}{d t} \left\langle \Psi \right| \hat {Q} \Psi \rangle = \left(\frac {\partial \Psi}{\partial t} \left| \hat {Q} \Psi \right.\right) + \left\langle \Psi \left| \frac {\partial \hat {Q}}{\partial t} \Psi \right.\right) + \left\langle \Psi \left| \hat {Q} \frac {\partial \Psi}{\partial t} \right.\right).
$$

Now, the Schrödinger equation says

$$
i \hbar \frac {\partial \Psi}{\partial t} = \hat {H} \Psi
$$

(where $H = p^2 / 2m + V$ is the Hamiltonian). So

$$
\frac {d}{d t} \langle Q \rangle = - \frac {1}{i \hbar} \left\langle \hat {H} \Psi \right| \hat {Q} \Psi \rangle + \frac {1}{i \hbar} \left\langle \Psi \right| \hat {Q} \hat {H} \Psi \rangle + \left\langle \frac {\partial \hat {Q}}{\partial t} \right\rangle .
$$

But $\hat{H}$ is hermitian, so $\langle \hat{H}\Psi |\hat{Q}\Psi \rangle = \langle \Psi |\hat{H}\hat{Q}\Psi \rangle$, and hence

$$
\frac {d}{d t} \langle Q \rangle = \frac {i}{\hbar} \left\langle \left[ \hat {H}, \hat {Q} \right] \right\rangle + \left\langle \frac {\partial \hat {Q}}{\partial t} \right\rangle . \tag {3.73}
$$

This is an interesting and useful result in its own right (see Problems 3.18 and 3.37). It has no name, though it surely deserves one; I'll call it the generalized Ehrenfest theorem. In the typical case where the operator does not depend explicitly on time,[23] it tells us that the rate of change of the expectation value is determined by the commutator of the operator with the Hamiltonian. In particular, if  $\hat{Q}$  commutes with  $\hat{H}$ , then  $\langle Q\rangle$  is constant, and in this sense  $Q$  is a conserved quantity.

Now, suppose we pick  $A = H$  and  $B = Q$ , in the generalized uncertainty principle (Equation 3.62), and assume that  $Q$  does not depend explicitly on  $t$ :

$$
\sigma_ {H} ^ {2} \sigma_ {Q} ^ {2} \geq \left(\frac {1}{2 i} \left\langle \left[ \hat {H}, \hat {Q} \right] \right\rangle\right) ^ {2} = \left(\frac {1}{2 i} \frac {\hbar}{i} \frac {d \langle Q \rangle}{d t}\right) ^ {2} = \left(\frac {\hbar}{2}\right) ^ {2} \left(\frac {d \langle Q \rangle}{d t}\right) ^ {2}.
$$

Or, more simply,

$$
\sigma_ {H} \sigma_ {Q} \geq \frac {\hbar}{2} \left| \frac {d \langle Q \rangle}{d t} \right|. \tag {3.74}
$$

Let's define  $\Delta E \equiv \sigma_H$ , and

$$
\Delta t \equiv \frac {\sigma_ {Q}}{| d \langle Q \rangle / d t |}. \tag {3.75}
$$

Then

$$
\Delta E \Delta t \geq \frac {\hbar}{2}, \tag {3.76}
$$

and that's the energy-time uncertainty principle. But notice what is meant by  $\Delta t$ , here: Since

$$
\sigma_ {Q} = \left| \frac {d \langle Q \rangle}{d t} \right| \Delta t,
$$

$\Delta t$  represents the amount of time it takes the expectation value of  $Q$  to change by one standard deviation.[25] In particular,  $\Delta t$  depends entirely on what observable  $(Q)$  you care to look at—the change might be rapid for one observable and slow for another. But if  $\Delta E$  is small, then the rate of change of all observables must be very gradual; or, to put it the other way around, if any observable changes rapidly, the "uncertainty" in the energy must be large.

## Example 3.5

In the extreme case of a stationary state, for which the energy is uniquely determined, all expectation values are constant in time ( $\Delta E = 0 \Rightarrow \Delta t = \infty$ )—as in fact we noticed some time ago (see Equation 2.9). To make something happen you must take a linear combination of at least two stationary states—say:

$$
\Psi (x, t) = a \psi_ {1} (x) e ^ {- i E _ {1} t / \hbar} + b \psi_ {2} (x) e ^ {- i E _ {2} t / \hbar}.
$$

If  $a, b, \psi_1$ , and  $\psi_2$  are real,

143

$|\Psi (x,t)|^2 = a^2 (\psi_1(x))^2 +b^2 (\psi_2(x))^2 +2ab\psi_1(x)\psi_2(x)\cos \left(\frac{E_2 - E_1}{\hbar} t\right).$

The period of oscillation is  $\tau = 2\pi \hbar / (E_2 - E_1)$ . Roughly speaking,  $\Delta E = E_2 - E_1$  and  $\Delta t = \tau$  (for the exact calculation see Problem 3.20), so

$\Delta E\Delta t = 2\pi \hbar$

which is indeed  $\geq \hbar /2$

# Example 3.6

Let  $\Delta t$  be the time it takes a free-particle wave packet to pass a particular point (Figure 3.1). Qualitatively (an exact version is explored in Problem 3.21),  $\Delta t = \Delta x / v = m\Delta x / p$ . But  $E = p^2 / 2m$ , so  $\Delta E = p\Delta p / m$ , and therefore,

$\Delta E \Delta t = \frac{p \Delta p}{m} \frac{m \Delta x}{p} = \Delta x \Delta p,$

which is  $\geq \hbar /2$  by the position-momentum uncertainty principle.

![img-48.jpeg](img-48.jpeg)
Figure 3.1: A free particle wave packet approaches the point  $A$  (Example 3.6).

# Example 3.7

The  $\Delta$  particle lasts about  $10^{-23}$  s, before spontaneously disintegrating. If you make a histogram of all measurements of its mass, you get a kind of bell-shaped curve centered at  $1232\mathrm{MeV} / c^2$ , with a width of about  $120\mathrm{MeV} / c^2$  (Figure 3.2). Why does the rest energy  $(mc^2)$  sometimes come out higher than 1232, and sometimes lower? Is this experimental error? No, for if we take  $\Delta t$  to be the lifetime of the particle (certainly one measure of "how long it takes the system to change appreciably"),

$\Delta E \Delta t = \left(\frac{120}{2} \mathrm{MeV}\right) \left(10^{-23} \mathrm{s}\right) = 6 \times 10^{-22} \mathrm{MeV} \cdot \mathrm{s},$

whereas  $\hbar /2 = 3\times 10^{-22}\mathrm{MeV}$  s. So the spread in  $m$  is about as small as the uncertainty principle allows—a particle with so short a lifetime just doesn't have a very well-defined mass.[26]

![img-49.jpeg](img-49.jpeg)
Figure 3.2: Measurements of the  $\Delta$  mass (Example 3.7).

Notice the variety of specific meanings attaching to the term  $\Delta t$  in these examples: In Example 3.5 it's a period of oscillation; in Example 3.6 it's the time it takes a particle to pass a point; in Example 3.7 it's the lifetime of an unstable particle. In every case, however,  $\Delta t$  is the time it takes for the system to undergo "substantial" change.

It is often said that the uncertainty principle means energy is not strictly conserved in quantum mechanics—that you're allowed to "borrow" energy  $\Delta E$ , as long as you "pay it back" in a time  $\Delta t \approx \hbar / (2\Delta E)$ ; the greater the violation, the briefer the period over which it can occur. Now, there are many legitimate readings of the energy-time uncertainty principle, but this is not one of them. Nowhere does quantum mechanics license violation of energy conservation, and certainly no such authorization entered into the derivation of Equation 3.76. But the uncertainty principle is extraordinarily robust: It can be misused without leading to seriously incorrect results, and as a consequence physicists are in the habit of applying it rather carelessly.

Problem 3.18 Apply Equation 3.73 to the following special cases: (a)  $Q = 1$ ; (b)  $Q = H$ ; (c)  $Q = x$ ; (d)  $Q = p$ . In each case, comment on the result, with particular reference to Equations 1.27, 1.33, 1.38, and conservation of energy (see remarks following Equation 2.21).

Problem 3.19 Use Equation 3.73 (or Problem 3.18 (c) and (d)) to show that:

(a) For any (normalized) wave packet representing a free particle  $(V(x) = 0)$ ,  $\langle x\rangle$  moves at constant velocity (this is the quantum analog to Newton's first law). Note: You showed this for a gaussian wave packet in Problem 2.42, but it is completely general.
(b) For any (normalized) wave packet representing a particle in the harmonic oscillator potential  $\left(V(x) = \frac{1}{2} m\omega^2 x^2\right)$ ,  $\langle x\rangle$  oscillates at the classical frequency. Note: You showed this for a particular gaussian wave packet in Problem 2.49, but it is completely general.

Problem 3.20 Test the energy-time uncertainty principle for the wave function in Problem 2.5 and the observable  $x$ , by calculating  $\sigma_{H}, \sigma_{x}$ , and  $d\langle x\rangle / dt$  exactly.

Problem 3.21 Test the energy-time uncertainty principle for the free particle wave packet in Problem 2.42 and the observable  $x$ , by calculating  $\sigma_{H}$ ,  $\sigma_{x}$ , and  $d\langle x\rangle /dt$  exactly.

Problem 3.22 Show that the energy-time uncertainty principle reduces to the "your name" uncertainty principle (Problem 3.15), when the observable in question is  $x$ .

147
## 3.6 Vectors and Operators

# 3.6.1 Bases in Hilbert Space

Imagine an ordinary vector  $\mathbf{A}$  in two dimensions (Fig. 3.3(a)). How would you describe this vector to someone? You might tell them "It's about an inch long, and it points  $20^{\circ}$  clockwise from straight up, with respect to the page." But that's pretty awkward. A better way would be to introduce cartesian axes,  $x$  and  $y$ , and specify the components of  $\mathbf{A}$ :  $A_{x} = \hat{i} \cdot \mathbf{A}$ ,  $A_{y} = \hat{j} \cdot \mathbf{A}$  (Fig. 3.3(b)). Of course, your sister might draw a different set of axes,  $x'$  and  $y'$ , and she would report different components:  $A_{x}' = \hat{i}' \cdot \mathbf{A}$ ,  $A_{y}' = \hat{j}' \cdot \mathbf{A}$  (Fig. 3.3(c)) ...but it's all the same vector—we're simply expressing it with respect to two different bases  $\left(\left\{\hat{i}, \hat{j}\right\}$  and  $\left\{\hat{i}', \hat{j}'\right\}\right)$ . The vector itself lives "out there in space," independent of anybody's (arbitrary) choice of coordinates.

![img-50.jpeg](img-50.jpeg)
(a)

![img-51.jpeg](img-51.jpeg)
(b)

![img-52.jpeg](img-52.jpeg)
(c)
Figure 3.3: (a) Vector A. (b) Components of A with respect to  $xy$  axes. (c) Components of A with respect to  $x'y'$  axes.

The same is true for the state of a system in quantum mechanics. It is represented by a vector,  $|S(t)\rangle$ , that lives "out there in Hilbert space," but we can express it with respect to any number of different bases. The wave function  $\Psi(x,t)$  is actually the  $x$  "component" in the expansion of  $|S(t)\rangle$  in the basis of position eigenfunctions:

$$
\Psi (x, t) = \langle x | S (t) \rangle , \tag {3.77}
$$

(the analog to  $\hat{i}$ ,  $\mathbf{A}$ ) with  $|x\rangle$  standing for the eigenfunction of  $\hat{x}$  with eigenvalue  $x$ . The momentum space wave function  $\Phi(p, t)$  is the  $p$  component in the expansion of  $|S(t)\rangle$  in the basis of momentum eigenfunctions:

$$
\Phi (p, t) = \langle p | \mathcal {S} (t) \rangle \tag {3.78}
$$

(with  $|p\rangle$  standing for the eigenfunction of  $\hat{p}$  with eigenvalue  $p$ ).28 Or we could expand  $|S(t)\rangle$  in the basis of energy eigenfunctions (supposing for simplicity that the spectrum is discrete):

$$
c _ {n} (t) = \langle n | \mathcal {S} (t) \rangle \tag {3.79}
$$

(with  $|n\rangle$  standing for the  $n$ th eigenfunction of  $\hat{p}$  —Equation 3.46). But it's all the same state; the functions  $\Psi$  and  $\Phi$ , and the collection of coefficients  $\{c_n\}$ , contain exactly the same information—they are simply three different ways of identifying the same vector:

$$
\begin{array}{l} \left| \mathcal {S} (t) \right\rangle \rightarrow \int \Psi (y, t) \delta (x - y) d y = \int \Phi (p, t) \frac {1}{\sqrt {2 \pi \hbar}} e ^ {i p x / \hbar} d p \tag {3.80} \\ = \sum c _ {n} e ^ {- i E _ {n} t / \hbar} \psi_ {n} (x). \\ \end{array}
$$

Operators (representing observables) are linear transformations on Hilbert space—they "transform" one vector into another:

$$
\left| \beta \right\rangle = \hat {Q} | \alpha \rangle . \tag {3.81}
$$

Just as vectors are represented, with respect to an orthonormal basis  $\{|e_n\rangle \} ,^{29}$  by their components,

$$
\left| \alpha \right\rangle = \sum_ {n} a _ {n} \left| e _ {n} \right\rangle , \quad \left| \beta \right\rangle = \sum_ {n} b _ {n} \left| e _ {n} \right\rangle , \quad a _ {n} = \left\langle e _ {n} \mid \alpha \right\rangle , \quad b _ {n} = \left\langle e _ {n} \mid \beta \right\rangle , \tag {3.82}
$$

operators are represented (with respect to a particular basis) by their matrix elements $^{30}$

$$
\left\langle e _ {m} \right| \hat {Q} \left| e _ {n} \right\rangle \equiv Q _ {m n}. \tag {3.83}
$$

In this notation Equation 3.81 says

$$
\sum_ {n} b _ {n} \left| e _ {n} \right\rangle = \sum_ {n} a _ {n} \hat {Q} \left| e _ {n} \right\rangle , \tag {3.84}
$$

or, taking the inner product with  $|e_m\rangle$

$$
\sum_ {n} b _ {n} \left\langle e _ {m} \right| e _ {n} \rangle = \sum_ {n} a _ {n} \left\langle e _ {m} \right| \hat {Q} \left| e _ {n} \right\rangle , \tag {3.85}
$$

and hence (since  $\langle e_m|e_n\rangle = \delta_{mn}$ )

$$
b _ {m} = \sum_ {n} Q _ {m n} a _ {n}. \tag {3.86}
$$

Thus the matrix elements of  $\hat{\mathcal{Q}}$  tell you how the components transform.31

Later on we will encounter systems that admit only a finite number  $N$  of linearly independent states. In that case  $|S(t)\rangle$  lives in an  $N$ -dimensional vector space; it can be represented as a column of  $(N)$  components (with respect to a given basis), and operators take the form of ordinary  $(N\times N)$  matrices. These are the simplest quantum systems—none of the subtleties associated with infinite-dimensional vector spaces arise. Easiest of all is the two-state system, which we explore in the following example.

Example 3.8

Imagine a system in which there are just two linearly independent states:32

$$
| 1 \rangle = \left( \begin{array}{c} 1 \\ 0 \end{array} \right) \quad \text {and} \quad | 2 \rangle = \left( \begin{array}{c} 0 \\ 1 \end{array} \right).
$$

The most general state is a normalized linear combination:

$$
| S \rangle = a | 1 \rangle + b | 2 \rangle = \left( \begin{array}{c} a \\ b \end{array} \right), \quad \text {with} \ | a | ^ {2} + | b | ^ {2} = 1.
$$

The Hamiltonian can be expressed as a (hermitian) matrix (Equation 3.83); suppose it has the specific form

149

$$
\mathsf {H} = \left( \begin{array}{c c} h &amp; g \\ g &amp; h \end{array} \right),
$$

where $g$ and $h$ are real constants. If the system starts out (at $t = 0$) in state $|1\rangle$, what is its state at time $t$?

Solution: The (time-dependent) Schrödinger equation$^{33}$ says

$$
i \hbar \frac {d}{d t} | \mathcal {S} (t) \rangle = \hat {H} | \mathcal {S} (t) \rangle . \tag {3.87}
$$

As always, we begin by solving the time-independent Schrödinger equation:

$$
\hat {H} | s \rangle = E | s \rangle ; \tag {3.88}
$$

that is, we look for the eigenvectors and eigenvalues of $\hat{H}$. The characteristic equation determines the eigenvalues:

$$
\det  \left( \begin{array}{c c} h - E &amp; g \\ g &amp; h - E \end{array} \right) = (h - E) ^ {2} - g ^ {2} = 0 \Rightarrow h - E = \mp g \Rightarrow E _ {\pm} = h \pm g.
$$

Evidently the allowed energies are $(h + g)$ and $(h - g)$. To determine the eigenvectors, we write

$$
\left( \begin{array}{c c} h &amp; g \\ g &amp; h \end{array} \right) \left( \begin{array}{c} \alpha \\ \beta \end{array} \right) = (h \pm g) \left( \begin{array}{c} \alpha \\ \beta \end{array} \right) \Rightarrow h \alpha + g \beta = (h \pm g) \alpha \Rightarrow \beta = \pm \alpha ,
$$

so the normalized eigenvectors are

$$
\left| s _ {\pm} \right\rangle = \frac {1}{\sqrt {2}} \left( \begin{array}{c} 1 \\ \pm 1 \end{array} \right).
$$

Next we expand the initial state as a linear combination of eigenvectors of the Hamiltonian:

$$
| \mathcal {S} (0) \rangle = \left( \begin{array}{c} 1 \\ 0 \end{array} \right) = \frac {1}{\sqrt {2}} (| s _ {+} \rangle + | s _ {-} \rangle).
$$

Finally, we tack on the standard time-dependence (the wiggle factor) $\exp (-iE_{n}t / \hbar)$ :

$$
\begin{array}{l} | S (t) \rangle = \frac {1}{\sqrt {2}} \left[ e ^ {- i (h + g) t / \hbar} | s _ {+} \rangle + e ^ {- i (h - g) t / \hbar} | s _ {-} \rangle \right] \\ = \frac {1}{2} e ^ {- i h t / \hbar} \left[ e ^ {- i g t / \hbar} \left( \begin{array}{c} 1 \\ 1 \end{array} \right) + e ^ {i g t / \hbar} \left( \begin{array}{c} 1 \\ - 1 \end{array} \right) \right] \\ = \frac {1}{2} e ^ {- i h t / \hbar} \left( \begin{array}{c} e ^ {- i g t / \hbar} + e ^ {i g t / \hbar} \\ e ^ {- i g t / \hbar} - e ^ {i g t / \hbar} \end{array} \right) = e ^ {- i h t / \hbar} \left( \begin{array}{c} \cos (g t / \hbar) \\ - i \sin (g t / \hbar) \end{array} \right). \\ \end{array}
$$

If you doubt this result, by all means check it: Does it satisfy the time-dependent Schrödinger equation (Equation 3.87)? Does it match the initial state when $t = 0$?$^{33}$

Just as vectors look different when expressed in different bases, so too do operators (or, in the discrete case, the matrices that represent them). We have already encountered a particularly nice example:

$$
\hat{x} \text{ (the position operator)} \rightarrow \begin{cases} x &amp; \text{ (in position space)}, \\ i \hbar \partial / \partial p &amp; \text{ (in momentum space)}; \end{cases}
$$

$$
\hat{p} \text{ (the momentum operator)} \rightarrow \begin{cases} -i \hbar \partial / \partial x &amp; \text{ (in position space)}, \\ p &amp; \text{ (in momentum space)}. \end{cases}
$$

("Position space" is nothing but the position basis; "momentum space" is the momentum basis.) If someone asked you, "What is the operator, $\hat{x}$ , representing position, in quantum mechanics?" you would probably answer "Just $x$ itself." But an equally correct reply would be "$i \hbar \partial / \partial p$," and the best response would be "With respect to what basis?"

I have often said "the state of a system is represented by its wave function, $\Psi(x, t)$," and this is true, in the same sense that an ordinary vector in three dimensions is "represented by" the triplet of its components; but really, I should always add "in the position basis." After all, the state of the system is a vector in Hilbert space, $|\mathcal{S}(t)\rangle$; it makes no reference to any particular basis. Its connection to $\Psi(x, t)$ is given by Equation 3.77: $\Psi(x, t) = \langle x | \mathcal{S}(t) \rangle$. Having said that, for the most part we do in fact work in position space, and no serious harm comes from referring to the wave function as "the state of the system."

151

152

## 3.6.2 Dirac Notation

Dirac proposed to chop the bracket notation for the inner product, $\langle \alpha |\beta \rangle$, into two pieces, which he called bra, $\langle \alpha |$, and ket, $|\beta \rangle$ (I don't know what happened to the c). The latter is a vector, but what exactly is the former? It's a linear function of vectors, in the sense that when it hits a vector (to its right) it yields a (complex) number—the inner product. (When an operator hits a vector, it delivers another vector; when a bra hits a vector, it delivers a number.) In a function space, the bra can be thought of as an instruction to integrate:

$$
\langle f | = \int f ^ {*} [ \dots ] d x,
$$

with the ellipsis $[\dots]$ waiting to be filled by whatever function the bra encounters in the ket to its right. In a finite-dimensional vector space, with the kets expressed as columns (of components with respect to some basis),

$$
| \alpha \rangle \rightarrow \left(\begin{array}{c}a _ {1}\\a _ {2}\\\vdots\\a _ {n}\end{array}\right), \tag {3.89}
$$

the bras are rows:

$$
\langle \beta | \rightarrow \left(b _ {1} ^ {*} b _ {2} ^ {*} \dots b _ {n} ^ {*}\right), \tag {3.90}
$$

and $\langle \beta |\alpha \rangle = b_1^* a_1 + b_2^* a_2 + \dots +b_n^* a_n$ is the matrix product. The collection of all bras constitutes another vector space—the so-called dual space.

The license to treat bras as separate entities in their own right allows for some powerful and pretty notation. For example, if $|\alpha \rangle$ is a normalized vector, the operator

$$
\hat {P} \equiv | \alpha \rangle \langle \alpha | \tag {3.91}
$$

picks out the portion of any other vector that "lies along" $|\alpha \rangle$:

$$
\tilde {P} | \beta \rangle = (\langle \alpha | \beta \rangle) | \alpha \rangle ;
$$

we call it the projection operator onto the one-dimensional subspace spanned by $|\alpha \rangle$. If $\{|e_n\rangle\}$ is a discrete orthonormal basis,

$$
\left\langle e _ {m} \right| e _ {n} \rangle = \delta_ {m n}, \tag {3.92}
$$

then

$$
\sum_ {n} \left| e _ {n} \right\rangle \left\langle e _ {n} \right| = 1 \tag {3.93}
$$

(the identity operator). For if we let this operator act on any vector $|\alpha \rangle$, we recover the expansion of $|\alpha \rangle$ in the $\{|e_n\rangle\}$ basis:

$$
\sum_ {n} \left(\left\langle e _ {n} \mid \alpha \right\rangle\right) \mid e _ {n} \rangle = \left| \alpha \right\rangle . \tag {3.94}
$$

Similarly, if $\{|e_z\rangle\}$ is a Dirac orthonormalized continuous basis,

$$
\left\langle e _ {z} \mid e _ {z ^ {\prime}} \right\rangle = \delta (z - z ^ {\prime}), \tag {3.95}
$$

then

$$
\int \left| e _ {z} \right\rangle \left\langle e _ {z} \right| d z = 1. \tag {3.96}
$$

Equations 3.93 and 3.96 are the tidiest ways to express completeness.

Technically, the guts of a ket or a bra (the ellipsis in  $|\dots\rangle$  or  $\langle \dots|$ ) is a name—the name of the vector in question: “ $\mathfrak{a}$ ,” or “ $n$ ,” or for that matter “Alice,” or “Bob.” It is endowed with no intrinsic mathematical attributes. Of course, it may be helpful to choose an evocative name—for instance, if you're working in the space  $\mathcal{L}^2$  of square-integrable functions, it is natural to name each vector after the function it represents:  $|f\rangle$ . Then, for example, we can write the definition of a hermitian operator as we did in Equation 3.17:

$$
\left\langle f \mid \hat {Q} f \right\rangle = \left\langle \hat {Q} f \mid f \right\rangle .
$$

Strictly speaking, in Dirac notation this is a nonsense expression:  $f$  here is a name, and operators act on vectors, not on names. The left side should properly be written as

$$
\left\langle f \left| \hat {Q} \right| f \right\rangle ,
$$

but what are we to make of the right side?  $\left\langle \hat{Q} f\right|$  really means "the bra dual to  $\hat{Q} |f\rangle$  " but what is its name? I suppose we could say

$$
\left\langle \left(\text {the name of the vector} \hat {Q} | f \rangle\right) \right|,
$$

but that's a mouthful. However, since we have chosen to name each vector after the function it represents, and since we do know how  $\hat{Q}$  acts on the function (as opposed to the name)  $f$ , this in fact becomes[35]

$$
\langle \hat {Q} f |,
$$

and we are OK after all.36

An operator takes one vector in Hilbert space and delivers another:

$$
\hat {Q} | \alpha \rangle = | \beta \rangle . \tag {3.97}
$$

The sum of two operators is defined in the obvious way,

$$
\left(\hat {Q} + \hat {R}\right) | \alpha \rangle = \hat {Q} | \alpha \rangle + \hat {R} | \alpha \rangle , \tag {3.98}
$$

and the product of two operators is

$$
\hat {Q} \hat {R} | \alpha \rangle = \hat {Q} (\hat {R} | \alpha \rangle) \tag {3.99}
$$

(first apply  $\hat{R}$  to  $|\alpha\rangle$ , and then apply  $\hat{Q}$  to what you got—being careful, of course, to respect their ordering). Occasionally we shall encounter functions of operators. They are typically defined by the power series

153

expansion:

$$
e ^ {\hat {Q}} \equiv 1 + \hat {Q} + \frac {1}{2} \hat {Q} ^ {2} + \frac {1}{3 !} \hat {Q} ^ {3} + \dots \tag {3.100}
$$

$$
\frac {1}{1 - \hat {Q}} \equiv 1 + \hat {Q} + \hat {Q} ^ {2} + \hat {Q} ^ {3} + \hat {Q} ^ {4} + \dots \tag {3.101}
$$

$$
\ln \left(1 + \hat {Q}\right) \equiv \hat {Q} - \frac {1}{2} \hat {Q} ^ {2} + \frac {1}{3} \hat {Q} ^ {3} - \frac {1}{4} \hat {Q} ^ {4} + \dots \tag {3.102}
$$

and so on. On the right-hand side we have only sums and products, and we know how to handle them.

Problem 3.23 Show that projection operators are idempotent: $\hat{p}^2 = \hat{p}$. Determine the eigenvalues of $\hat{p}$, and characterize its eigenvectors.

Problem 3.24 Show that if an operator $\hat{Q}$ is hermitian, then its matrix elements in any orthonormal basis satisfy $Q_{mn} = Q_{nnr}^{*}$. That is, the corresponding matrix is equal to its transpose conjugate.

Problem 3.25 The Hamiltonian for a certain two-level system is

$$
\hat {H} = \epsilon (| 1 \rangle \langle 1 | - | 2 \rangle \langle 2 | + | 1 \rangle \langle 2 | + | 2 \rangle \langle 1 |),
$$

where $|1\rangle, |2\rangle$ is an orthonormal basis and $\epsilon$ is a number with the dimensions of energy. Find its eigenvalues and eigenvectors (as linear combinations of $|1\rangle$ and $|2\rangle$). What is the matrix $\mathbf{H}$ representing $\hat{H}$ with respect to this basis?

Problem 3.26 Consider a three-dimensional vector space spanned by an orthonormal basis $|1\rangle, |2\rangle, |3\rangle$. Kets $|\alpha\rangle$ and $|\beta\rangle$ are given by

$$
| \alpha \rangle = i | 1 \rangle - 2 | 2 \rangle - i | 3 \rangle , \quad | \beta \rangle = i | 1 \rangle + 2 | 3 \rangle .
$$

(a) Construct $\langle \alpha |$ and $\langle \beta |$ (in terms of the dual basis $\langle 1|, \langle 2|, \langle 3|)$.
(b) Find $(\alpha |\beta)$ and $(\beta |\alpha)$, and confirm that $(\beta |\alpha) = \langle \alpha |\beta \rangle^{*}$.
(c) Find all nine matrix elements of the operator $\hat{A} \equiv |\alpha\rangle\langle\beta|$, in this basis, and construct the matrix $\mathbf{A}$. Is it hermitian?

Problem 3.27 Let $\hat{Q}$ be an operator with a complete set of orthonormal eigenvectors:

$$
\hat {Q} \left| e _ {n} \right\rangle = q _ {n} \left| e _ {n} \right\rangle \quad (n = 1, 2, 3, \dots).
$$

(a) Show that $\hat{Q}$ can be written in terms of its spectral decomposition:

154

$$
\hat {Q} = \sum_ {n} q _ {n} | e _ {n} \rangle \langle e _ {n} |. \tag {3.103}
$$

Hint: An operator is characterized by its action on all possible vectors, so what you must show is that

$$
\hat {Q} | \alpha \rangle = \left\{\sum_ {n} q _ {n} | e _ {n} \rangle \langle e _ {n} | \right\} | \alpha \rangle ,
$$

for any vector  $|\alpha \rangle$

(b) Another way to define a function of  $\hat{Q}$  is via the spectral decomposition:

$$
f (\hat {Q}) = \sum_ {n} f \left(q _ {n}\right) \left| e _ {n} \right\rangle \left\langle e _ {n} \right|. \tag {3.104}
$$

Show that this is equivalent to Equation 3.100 in the case of  $e\hat{Q}$ .

Problem 3.28 Let  $\hat{D} = d / dx$  (the derivative operator). Find

(a)  $\left(\sin \hat{D}\right)x^5.$
(b)  $\left(\frac{1}{1 - \hat{D} / 2}\right)\cos (x).$

**Problem 3.29** Consider operators  $\hat{A}$  and  $\hat{B}$  that do not commute with each other  $(\hat{C} = [\hat{A},\hat{B}])$  but do commute with their commutator:  $[\hat{A},\hat{C}] = [\hat{B},\hat{C}] = 0$  (for instance,  $\hat{x}$  and  $\hat{p}$ ).

(a) Show that

$$
\left[ \hat {A} ^ {n}, \hat {B} \right] = n \hat {A} ^ {n - 1} \hat {C}.
$$

Hint: You can prove this by induction on  $n$ , using Equation 3.65.

(b) Show that

$$
\left[ e ^ {\lambda \hat {A}}, \hat {B} \right] = \lambda e ^ {\lambda \hat {A}} \hat {C},
$$

where  $\lambda$  is any complex number. Hint: Express  $e^{\lambda \hat{A}}$  as a power series.

(c) Derive the Baker-Campbell-Hausdorff formula:37

$$
e ^ {\hat {A} + \hat {B}} = e ^ {\hat {A}} e ^ {\hat {B}} e ^ {- \hat {C} / 2}.
$$

Hint: Define the functions

$$
\hat {f} (\lambda) = e ^ {\lambda (\hat {A} + \hat {B})}, \quad \hat {g} (\lambda) = e ^ {\lambda \hat {A}} e ^ {\lambda \hat {B}} e ^ {- \lambda^ {2} \hat {C} / 2}.
$$

Note that these functions are equal at  $\lambda = 0$ , and show that they satisfy the same differential equation:  $d\hat{f} / d\lambda = (\hat{A} + \hat{B})\hat{f}$  and

$$
d \hat {g} / d \lambda = (\hat {A} + \hat {B}) \hat {g}. \text {Therefore, the functions are themselves equal for all} \lambda .^{28}
$$

156

157

## 3.6.3 Changing Bases in Dirac Notation

The advantage of Dirac notation is that it frees us from working in any particular basis, and makes transforming between bases seamless. Recall that the identity operator can be written as a projection onto a complete set of states (Equations 3.93 and 3.96); of particular interest are the position eigenstates $|x\rangle$, the momentum eigenstates $|p\rangle$, and the energy eigenstates (we will assume those are discrete) $|n\rangle$:

$$
1 = \int dx \, |x\rangle \langle x|, \tag{3.106}
$$

$$
1 = \int dp \, |p\rangle \langle p|,
$$

$$
1 = \sum |n\rangle \langle n|.
$$

Acting on the state vector $|\mathcal{S}(t)\rangle$ with each of these resolutions of the identity gives

$$
|\mathcal{S}(t)\rangle = \int dx \, |x\rangle \langle x|\mathcal{S}(t)\rangle \equiv \int \Psi(x,t) \, |x\rangle \, dx, \tag{3.107}
$$

$$
|\mathcal{S}(t)\rangle = \int dp \, |p\rangle \langle p|\mathcal{S}(t)\rangle \equiv \int \Phi(p,t) \, |p\rangle \, dp,
$$

$$
|\mathcal{S}(t)\rangle = \sum_n |n\rangle \langle n|\mathcal{S}(t)\rangle \equiv \sum c_n(t) \, |n\rangle.
$$

Here we recognize the position-space, momentum-space, and "energy-space" wave functions (Equations 3.77–3.79) as the components of the vector $|\mathcal{S}(t)\rangle$ in the respective bases.

### Example 3.9

Derive the transformation from the position-space wave function to the momentum-space wave function. (We already know the answer, of course, but I want to show you how this works out in Dirac notation.)

**Solution**: We want to find $\Phi(p,t) = \langle p|\mathcal{S}(t)\rangle$ given $\Psi(x,t) = \langle x|\mathcal{S}(t)\rangle$. We can relate the two by inserting a resolution of the identity:

$$
\begin{aligned}
\Phi(p,t) &amp;= \langle p|\mathcal{S}(t)\rangle \tag{3.108} \\
&amp;= \left\langle p\left|\left(\int dx \, |x\rangle \langle x|\right)\right|\mathcal{S}(t)\right\rangle \\
&amp;= \int \langle p|x\rangle \langle x|\mathcal{S}(t)\rangle \, dx \\
&amp;= \int \langle p|x\rangle \Psi(x,t) \, dx.
\end{aligned}
$$

Now, $\langle x|p\rangle$ is the momentum eigenstate (with eigenvalue $p$) in the position basis—what we called $f_p(x)$, in Equation 3.32. So

$$
\langle p|x\rangle = \langle x|p\rangle^* = \left[f_p(x)\right]^* = \frac{1}{\sqrt{2\pi\hbar}} e^{-ipx/\hbar}.
$$

Plugging this into Equation 3.108 gives

$$
\Phi (p, t) = \int \frac {1}{\sqrt {2 \pi \hbar}} e ^ {- i p x / \hbar} \Psi (x, t) d x,
$$

which is precisely Equation 3.54.

Just as the wave function takes different forms in different bases, so do operators. The position operator is given by

$$
\hat {x} \rightarrow x
$$

in the position basis, or

$$
\hat {x} \rightarrow i \hbar \frac {\partial}{\partial p}
$$

in the momentum basis. However, Dirac notation allows us to do away with the arrows and stick to equalities. Operators act on kets (for instance,  $\hat{x} |S(t)\rangle$ ); the outcome of this operation can be expressed in any basis by taking the inner product with an appropriate basis vector. That is,

$$
\left\langle x \left| \hat {x} \right| \mathcal {S} (t) \right\rangle = \text {action of position operator in } x \text { basis } = x \Psi (x, t), \tag {3.109}
$$

or

$$
\left\langle p \left| \hat {x} \right| \mathcal {S} (t) \right\rangle = \text {action of position operator in } p \text { basis } = i \hbar \frac {\partial \Phi}{\partial p}. \tag {3.110}
$$

In this notation it is straightforward to transform operators between bases, as the following example illustrates.

## Example 3.10

Obtain the position operator in the momentum basis (Equation 3.110) by inserting a resolution of the identity on the left-hand side.

**Solution:**

$$
\begin{array}{l}
\left\langle p \left| \hat {x} \right| \mathcal {S} (t) \right\rangle = \left\langle p \left| \hat {x} \int d x \right| x \right\rangle \left\langle x \left| \right| \mathcal {S} (t) \right\rangle \\
= \int \langle p | x | x \rangle \langle x | S (t) \rangle d x,
\end{array}
$$

where I've used the fact that  $|x\rangle$  is an eigenstate of  $\hat{x}\big(\hat{x} |x\rangle = x|x\rangle \big)$ ;  $x$  can then be pulled out of the inner product (it's just a number) and

$$
\begin{array}{l}
\left\langle p \left| \hat{x} \right| \mathcal{S}(t) \right\rangle = \int x \left\langle p \mid x \right\rangle \Psi(x, t) \, dx \\
= \int x \frac{e^{-ipx/\hbar}}{\sqrt{2\pi\hbar}} \Psi(x, t) \, dx \\
= i\hbar \frac{\partial}{\partial p} \int \frac{e^{-ipx/\hbar}}{\sqrt{2\pi\hbar}} \Psi(x, t) \, dx.
\end{array}
$$

Finally we recognize the integral as $\Phi(p, t)$ (Equation 3.54).

**Problem 3.30** Derive the transformation from the position-space wave function to the "energy-space" wave function $(c_n(t))$ using the technique of Example 3.9. Assume that the energy spectrum is discrete, and the potential is time-independent.

159

Further Problems on Chapter 3

Problem 3.31 Legendre polynomials. Use the Gram-Schmidt procedure (Problem A.4) to orthonormalize the functions $I, x, x^2$, and $x^3$, on the interval $-\mathrm{I} \leq x \leq \mathrm{I}$. You may recognize the results—they are (apart from normalization) $^{39}$ Legendre polynomials (Problem 2.64 and Table 4.1).

Problem 3.32 An anti-hermitian (or skew-hermitian) operator is equal to minus its hermitian conjugate:

$$
\hat {Q} ^ {\dagger} = - \hat {Q}. \tag {3.111}
$$

(a) Show that the expectation value of an anti-hermitian operator is imaginary.
(b) Show that the eigenvalues of an anti-hermitian operator are imaginary.
(c) Show that the eigenvectors of an anti-hermitian operator belonging to distinct eigenvalues are orthogonal.
(d) Show that the commutator of two hermitian operators is anti-hermitian. How about the commutator of two anti-hermitian operators?
(e) Show that any operator $\hat{Q}$ can be written as a sum of a hermitian operator $\hat{A}$ and an anti-hermitian operator $\hat{B}$, and give expressions for $\hat{A}$ and $\hat{B}$ in terms of $\hat{Q}$ and its adjoint $\hat{Q}^{\dagger}$.

Problem 3.33 Sequential measurements. An operator $\hat{A}$, representing observable $A$, has two (normalized) eigenstates $\psi_{1}$ and $\psi_{2}$, with eigenvalues $a_{1}$ and $a_{2}$, respectively. Operator $\hat{B}$, representing observable $B$, has two (normalized) eigenstates $\phi_{1}$ and $\phi_{2}$, with eigenvalues $b_{1}$ and $b_{2}$. The eigenstates are related by

$$
\psi_ {1} = \left(3 \phi_ {1} + 4 \phi_ {2}\right) / 5, \quad \psi_ {2} = \left(4 \phi_ {1} - 3 \phi_ {2}\right) / 5.
$$

(a) Observable $A$ is measured, and the value $a_1$ is obtained. What is the state of the system (immediately) after this measurement?
(b) If $B$ is now measured, what are the possible results, and what are their probabilities?
(c) Right after the measurement of $B$, $A$ is measured again. What is the probability of getting $a_1$? (Note that the answer would be quite different if I had told you the outcome of the $B$ measurement.)

Problem 3.34

(a) Find the momentum-space wave function $\Phi_{\kappa}(p,t)$ for the $n$th stationary state of the infinite square well.

***

(b) Find the probability density $|\Phi_n(p,t)|^2$. Graph this function, for $n = 1$, $n = 2$, $n = 5$, and $n = 10$. What are the most probable values of $p$, for large $n$? Is this what you would have expected? Compare your answer to Problem 3.10.
(c) Use $\Phi_n(p, t)$ to calculate the expectation value of $p^2$, in the $n$th state. Compare your answer to Problem 2.4.

Problem 3.35 Consider the wave function

$$
\Psi (x, 0) = \left\{ \begin{array}{l l} \frac {1}{\sqrt {2 n \lambda}} e ^ {i 2 \pi x / \lambda}, &amp; - n \lambda &lt; x &lt; n \lambda , \\ 0, &amp; \text{otherwise}, \end{array} \right.
$$

where $n$ is some positive integer. This function is purely sinusoidal (with wavelength $\lambda$) on the interval $-n\lambda &lt; x &lt; n\lambda$, but it still carries a range of momenta, because the oscillations do not continue out to infinity. Find the momentum space wave function $\Phi(p,0)$. Sketch the graphs of $|\Psi(x,0)|^2$ and $|\Phi(p,0)|^2$, and determine their widths, $w_x$ and $w_p$ (the distance between zeros on either side of the main peak). Note what happens to each width as $n \to \infty$. Using $w_x$ and $w_p$ as estimates of $\Delta x$ and $\Delta p$, check that the uncertainty principle is satisfied. Warning: If you try calculating $\sigma_p$, you're in for a rude surprise. Can you diagnose the problem?

Problem 3.36 Suppose

$$
\Psi (x, 0) = \frac {A}{x ^ {2} + a ^ {2}}, \quad (- \infty &lt; x &lt; \infty)
$$

for constants $A$ and $a$.

(a) Determine $A$, by normalizing $\Psi (x,0)$.
(b) Find $\langle x\rangle ,\langle x^2\rangle$ and $\sigma_{x}$ (at time $t = 0$).
(c) Find the momentum space wave function $\Phi(p, 0)$, and check that it is normalized.
(d) Use $\Phi(p, 0)$ to calculate $\langle p \rangle, \langle p^2 \rangle$, and $\sigma_p$ (at time $t = 0$).
(e) Check the Heisenberg uncertainty principle for this state.

Problem 3.37 Virial theorem. Use Equation 3.73 to show that

$$
\frac {d}{d t} \langle x p \rangle = 2 \langle T \rangle - \left\langle x \frac {\partial V}{\partial x} \right\rangle , \tag {3.112}
$$

where $T$ is the kinetic energy $(H = T + V)$. In a stationary state the left side is zero (why?) so

$$
2 \langle T \rangle = \left\langle x \frac {d V}{d x} \right\rangle . \tag {3.113}
$$

This is called the virial theorem. Use it to prove that $\langle T\rangle = \langle V\rangle$ for stationary states of the harmonic oscillator, and check that this is consistent with the

161

results you got in Problems 2.11 and 2.12.

Problem 3.38 In an interesting version of the energy-time uncertainty principle $^{41}$ $\Delta t = \tau / \pi$ , where $\tau$ is the time it takes $\Psi(x, t)$ to evolve into a state orthogonal to $\Psi(x, 0)$. Test this out, using a wave function that is a linear combination of two (orthonormal) stationary states of some (arbitrary) potential: $\Psi(x, 0) = \left(1 / \sqrt{2}\right) [\psi_1(x) + \psi_2(x)]$.

** Problem 3.39 Find the matrix elements $\langle n|x|n^{\prime}\rangle$ and $\langle n|p|n^{\prime}\rangle$ in the (orthonormal) basis of stationary states for the harmonic oscillator (Equation 2.68). You already calculated the "diagonal" elements $(n = n^{\prime})$ in Problem 2.12; use the same technique for the general case. Construct the corresponding (infinite) matrices, $\mathbf{X}$ and $\mathbf{P}$. Show that $(1 / 2m)\mathsf{P}^2 +(m\omega^2 /2)\mathsf{X}^2 = \mathsf{H}$ is diagonal, in this basis. Are its diagonal elements what you would expect? Partial answer:

$$
\left\langle n \mid x \mid n ^ {\prime} \right\rangle = \sqrt {\frac {\hbar}{2 m \omega}} \left(\sqrt {n ^ {\prime}} \delta_ {n, n ^ {\prime} - 1} + \sqrt {n} \delta_ {n ^ {\prime}, n - 1}\right). \tag {3.114}
$$

** Problem 3.40 The most general wave function of a particle in the simple harmonic oscillator potential is

$$
\Psi (x, t) = \sum_ {n} c _ {n} \psi_ {n} (x) e ^ {- i E _ {n} t / \hbar}.
$$

Show that the expectation value of position is

$$
\langle x \rangle = C \cos (\omega t - \phi),
$$

where the real constants $C$ and $\phi$ are given by

$$
C e ^ {- i \phi} = \left(\sqrt {\frac {2 \hbar}{m \omega}}\right) \sum_ {n = 0} ^ {\infty} \sqrt {n + 1} c _ {n + 1} ^ {*} c _ {n}.
$$

Thus the expectation value of position for a particle in the harmonic oscillator oscillates at the classical frequency $\omega$ (as you would expect from Ehrenfest's theorem; see problem 3.19(b)). Hint: Use Equation 3.114. As an example, find $C$ and $\phi$ for the wave function in Problem 2.40.

Problem 3.41 A harmonic oscillator is in a state such that a measurement of the energy would yield either $(1/2)\hbar\omega$ or $(3/2)\hbar\omega$, with equal probability. What is the largest possible value of $\langle p\rangle$ in such a state? If it assumes this maximal value at time $t = 0$, what is $\Psi(x,t)$?

** Problem 3.42 Coherent states of the harmonic oscillator. Among the stationary states of the harmonic oscillator (Equation 2.68) only $n = 0$ hits the uncertainty limit $(\sigma_{x}\sigma_{p} = \hbar /2)$; in general, $\sigma_{x}\sigma_{p} = (2n + 1)\hbar /2$, as you found in Problem 2.12. But certain linear combinations (known as coherent

162

states) also minimize the uncertainty product. They are (as it turns out) eigenfunctions of the lowering operator:42

$a_{-}|\alpha \rangle = \alpha |\alpha \rangle$

(the eigenvalue  $\mathfrak{a}$  can be any complex number).

(a) Calculate  $\langle x\rangle ,\left\langle x^2\right\rangle ,\langle p\rangle ,\left\langle p^2\right\rangle$  in the state  $|\alpha \rangle$  . Hint: Use the technique in Example 2.5, and remember that  $a_{+}$  is the hermitian conjugate of  $a_{-}$  . Do not assume a is real.
(b) Find  $\sigma_{x}$  and  $\sigma_{p}$  show that  $\sigma_{x}\sigma_{p} = \hbar /2$
(c) Like any other wave function, a coherent state can be expanded in terms of energy eigenstates:

$|\alpha \rangle = \sum_{n = 0}^{\infty}c_n|n\rangle$

Show that the expansion coefficients are

$c_{n} = \frac{\alpha^{n}}{\sqrt{n!}} c_{0}.$

(d) Determine  $c_0$  by normalizing  $|\alpha \rangle$ . Answer:  $\exp \left(-|\alpha|^2 / 2\right)$ .
(e) Now put in the time dependence:

$|n\rangle \rightarrow e^{-iE_n t / \hbar} |n\rangle$

and show that  $|\alpha(t)\rangle$  remains an eigenstate of  $a_{-}$ , but the eigenvalue evolves in time:

$\alpha (t) = e^{-i\omega t}\alpha$

So a coherent state stays coherent, and continues to minimize the uncertainty product.

(f) Based on your answers to (a), (b), and (e), find  $\langle x\rangle$  and  $\sigma_{x}$  as functions of time. It helps if you write the complex number  $\mathfrak{a}$  as

$\alpha = C\sqrt{\frac{m\omega}{2\hbar}} e^{i\phi}$

for real numbers  $C$  and  $\Phi$ . Comment: In a sense, coherent states behave quasi-classically.

(g) Is the ground state  $(|n = 0\rangle)$  itself a coherent state? If so, what is the eigenvalue?

Problem 3.43 Extended uncertainty principle.43 The generalized uncertainty principle (Equation 3.62) states that

$\sigma_A^2\sigma_B^2\geq \frac{1}{4}\langle C\rangle^2$

where $\hat{C} \equiv -i[\hat{A},\hat{B}]$.

(a) Show that it can be strengthened to read

$$
\sigma_{A}^{2} \sigma_{B}^{2} \geq \frac{1}{4} \left(\langle C \rangle^{2} + \langle D \rangle^{2}\right), \tag{3.115}
$$

where $\hat{D} \equiv \hat{A}\hat{B} + \hat{B}\hat{A} - 2\langle A\rangle \langle B\rangle$. Hint: Keep the $\operatorname{Re}(z)$ term in Equation 3.60.

(b) Check Equation 3.115 for the case $B = A$ (the standard uncertainty principle is trivial, in this case, since $\hat{C} \equiv 0$ unfortunately, the extended uncertainty principle doesn't help much either).

Problem 3.44 The Hamiltonian for a certain three-level system is represented by the matrix

$$
\mathsf{H} = \begin{pmatrix}
a &amp; 0 &amp; b \\
0 &amp; c &amp; 0 \\
b &amp; 0 &amp; a
\end{pmatrix},
$$

where $a, b,$ and $c$ are real numbers.

(a) If the system starts out in the state

$$
|S(0)\rangle = \begin{pmatrix}
0 \\
1 \\
0
\end{pmatrix},
$$

what is $|S(t)\rangle$?

(b) If the system starts out in the state

$$
|S(0)\rangle = \begin{pmatrix}
1 \\
0 \\
0
\end{pmatrix},
$$

what is $|S(t)\rangle$?

Problem 3.45 Find the position operator in the basis of simple harmonic oscillator energy states. That is, express

$$
\langle n |\hat{x}|S(t) \rangle
$$

in terms of $c_{n}(t) = \langle n|S(t)\rangle$. Hint: Use Equation 3.114.

Problem 3.46 The Hamiltonian for a certain three-level system is represented by the matrix

$$
\mathsf{H} = \hbar \omega \begin{pmatrix}
1 &amp; 0 &amp; 0 \\
0 &amp; 2 &amp; 0 \\
0 &amp; 0 &amp; 2
\end{pmatrix}.
$$

Two other observables, $A$ and $B$, are represented by the matrices

164

$$
\mathsf{A} = \lambda \left( \begin{array}{ccc} 0 &amp; 1 &amp; 0 \\ 1 &amp; 0 &amp; 0 \\ 0 &amp; 0 &amp; 2 \end{array} \right), \quad \mathsf{B} = \mu \left( \begin{array}{ccc} 2 &amp; 0 &amp; 0 \\ 0 &amp; 0 &amp; 1 \\ 0 &amp; 1 &amp; 0 \end{array} \right),
$$

where $\omega, \lambda$, and $\mu$ are positive real numbers.

(a) Find the eigenvalues and (normalized) eigenvectors of $\mathsf{H}, \mathsf{A}$, and $\mathsf{B}$.

(b) Suppose the system starts out in the generic state

$$
|S(0)\rangle = \left( \begin{array}{c} c_1 \\ c_2 \\ c_3 \end{array} \right),
$$

with $|c_1|^2 + |c_2|^2 + |c_3|^2 = 1$. Find the expectation values (at $t = 0$) of $H, A$, and $B$.

(c) What is $|S(t)\rangle$? If you measured the energy of this state (at time $t$), what values might you get, and what is the probability of each? Answer the same questions for observables $A$ and for $B$.

**Problem 3.47 Supersymmetry.** Consider the two operators

$$
\hat{A} = i \frac{\hat{p}}{\sqrt{2m}} + W(x) \quad \text{and} \quad \hat{A}^\dagger = -i \frac{\hat{p}}{\sqrt{2m}} + W(x), \tag{3.116}
$$

for some function $W(x)$. These may be multiplied in either order to construct two Hamiltonians:

$$
\hat{H}_1 \equiv \hat{A}^\dagger \hat{A} = \frac{\hat{p}^2}{2m} + V_1(x) \quad \text{and} \quad \hat{H}_2 \equiv \hat{A} \hat{A}^\dagger = \frac{\hat{p}^2}{2m} + V_2(x); \tag{3.117}
$$

$V_1$ and $V_2$ are called supersymmetric partner potentials. The energies and eigenstates of $\hat{H}_1$ and $\hat{H}_2$ are related in interesting ways.⁴⁴

(a) Find the potentials $V_1(x)$ and $V_2(x)$, in terms of the superpotential, $W(x)$.

(b) Show that if $\psi_n^{(1)}$ is an eigenstate of $\hat{H}_1$ with eigenvalue $E_n^{(1)}$, then $\hat{A}\psi_n^{(1)}$ is an eigenstate of $\hat{H}_2$ with the same eigenvalue. Similarly, show that if $\psi_n^{(2)}(x)$ is an eigenstate of $\hat{H}_2$ with eigenvalue $E_n^{(2)}$, then $\hat{A}^\dagger\psi_n^{(2)}$ is an eigenstate of $\hat{H}_1$ with the same eigenvalue. The two Hamiltonians therefore have essentially identical spectra.

(c) One ordinarily chooses $W(x)$ such that the ground state of $\hat{H}_1$ satisfies

$$
\hat{A} \psi_0^{(1)}(x) = 0, \tag{3.118}
$$

and hence $E_0^{(1)} = 0$. Use this to find the superpotential $W(x)$, in terms of the ground state wave function, $\psi_0^{(1)}(x)$. (The fact that $\hat{A}$ annihilates $\psi_0^{(1)}$ means that $\hat{H}_2$ actually has one less eigenstate than $\hat{H}_1$, and is missing the eigenvalue $E_0^{(1)}$)

(d) Consider the Dirac delta function well,

165

$$
V _ {1} (x) = \frac {m \alpha^ {2}}{2 h ^ {2}} - \alpha \delta (x), \tag {3.119}
$$

(the constant term, $m\alpha^2 / 2\hbar^2$, is included so that $E_0^{(1)} = 0$). It has a single bound state (Equation 2.132)

$$
\psi_ {0} ^ {(1)} (x) = \frac {\sqrt {m \alpha}}{\hbar} \exp \left[ - \frac {m \alpha}{\hbar^ {2}} | x | \right]. \tag {3.120}
$$

Use the results of parts (a) and (c), and Problem 2.23(b), to determine the superpotential $W(x)$ and the partner potential $V_{2}(x)$. This partner potential is one that you will likely recognize, and while it has no bound states, the supersymmetry between these two systems explains the fact that their reflection and transmission coefficients are identical (see the last paragraph of Section 2.5.2).

**Problem 3.48** An operator is defined not just by its action (what it does to the vector it is applied to) but its domain (the set of vectors on which it acts). In a finite-dimensional vector space the domain is the entire space, and we don't need to worry about it. But for most operators in Hilbert space the domain is restricted. In particular, only functions such that $\hat{Q}f(x)$ remains in Hilbert space are allowed in the domain of $\hat{Q}$. (As you found in Problem 3.2, the derivative operator can knock a function out of $L^2$.)

A hermitian operator is one whose action is the same as that of its adjoint$^{45}$ (Problem 3.5). But what is required to represent observables is actually something more: the domains of $\hat{Q}$ and $\hat{Q}^{\dagger}$ must also be identical. Such operators are called self-adjoint.$^{46}$

(a) Consider the momentum operator, $\hat{p} = -i\hbar d / dx$, on the finite interval $0 \leq x \leq a$. With the infinite square well in mind, we might define its domain as the set of functions $f(x)$ such that $f(0) = f(a) = 0$ (it goes without saying that $f(x)$ and $\hat{p}f(x)$ are in $L^2(0,a)$). Show that $\hat{p}$ is hermitian: $\langle g|\hat{p}f\rangle = \langle \hat{p}^\dagger g|f\rangle$, with $\hat{p}^\dagger = \hat{p}$. But is it self-adjoint? Hint: as long as $f(0) = f(a) = 0$, there is no restriction on $g(0)$ or $g(a)$—the domain of $\hat{p}^\dagger$ is much larger than the domain of $\hat{p}$.$^{47}$

(b) Suppose we extend the domain of $\hat{p}$ to include all functions of the form $f(a) = \lambda f(0)$, for some fixed complex number $\lambda$. What condition must we then impose on the domain of $\hat{p}^{\dagger}$ in order that $\hat{p}$ be hermitian? What value(s) of $\lambda$ will render $\hat{p}$ self-adjoint? Comment: Technically, then, there is no momentum operator on the finite interval—or rather, there are infinitely many, and no way to decide which of them is "correct." (In Problem 3.34 we avoided the issue by working on the infinite interval.)

(c) What about the semi-infinite interval, $0 \leq x &lt; \infty$? Is there a self-adjoint momentum operator in this case?$^{48}$

**Problem 3.49**

166

(a) Write down the time-dependent "Schrödinger equation" in momentum space, for a free particle, and solve it. Answer:  $\exp \left(-ip^2 t / 2m\hbar\right)\Phi (p,0).$
(b) Find  $\Phi(p, 0)$  for the traveling gaussian wave packet (Problem 2.42), and construct  $\Phi(p, t)$  for this case. Also construct  $|\Phi(p, t)|^2$ , and note that it is independent of time.
(c) Calculate  $\langle p\rangle$  and  $\langle p^2\rangle$  by evaluating the appropriate integrals involving  $\Phi$ , and compare your answers to Problem 2.42.
(d) Show that  $\langle H\rangle = \langle p\rangle^2 /2m + \langle H\rangle_0$  (where the subscript 0 denotes the stationary gaussian), and comment on this result.

1 If you have never studied linear algebra, you should read the Appendix before continuing.
2 For us, the limits  $(a$  and  $b)$  will almost always be  $\pm \infty$ , but we might as well keep things more general for the moment.
3 Technically, a Hilbert space is a complete inner product space, and the collection of square-integrable functions is only one example of a Hilbert space—indeed, every finite-dimensional vector space is trivially a Hilbert space. But since  $L^2$  is the arena of quantum mechanics, it's what physicists generally mean when they say "Hilbert space." By the way, the word complete here means that any Cauchy sequence of functions in Hilbert space converges to a function that is also in the space: it has no "holes" in it, just as the set of all real numbers has no holes (by contrast, the space of all polynomials, for example, like the set of all rational numbers, certainly does have holes in it). The completeness of a space has nothing to do with the completeness (same word, unfortunately) of a set of functions, which is the property that any other function can be expressed as a linear combination of them. For an accessible introduction to Hilbert space see Daniel T. Gillespie, A Quantum Mechanics Primer (International Textbook Company, London, 1970), Sections 2.3 and 2.4.
4 In Chapter 2 we were obliged on occasion to work with functions that were not normalizable. Such functions lie outside Hilbert space, and we are going to have to handle them with special care. For the moment, I shall assume that all the functions we encounter are in Hilbert space.
For a proof, see Frigyes Riesz and Bela Sz.-Nagy, Functional Analysis (Dover, Mineola, NY, 1990), Section 21. In a finite-dimensional vector space the Schwarz inequality,  $|\langle \alpha |\beta \rangle |^2\leq \langle \alpha |\alpha \rangle \langle \beta |\beta \rangle$  is easy to prove (see Problem A.5). But that proof assumes the existence of the inner products, which is precisely what we are trying to establish here.
5 What about a function that is zero everywhere except at a few isolated points? The integral (Equation 3.9) would still vanish, even though the function itself does not. If this bothers you, you should have been a math major. In physics such pathological functions do not occur, but in any case, in Hilbert space two functions are considered equivalent if the integral of the absolute square of their difference vanishes. Technically, vectors in Hilbert space represent equivalence classes of functions.
Remember that  $\hat{Q}$  is the operator constructed from  $Q$  by the replacement  $p\to -i\hbar d / dx$ . These operators are linear, in the sense that  $\hat{Q}\left[af(x) + bg(x)\right] = a\hat{Q} f(x) + b\hat{Q} g(x)$ ,

for any functions  $f$  and  $g$  and any complex numbers  $a$  and  $b$ . They constitute linear transformations (Section A.3) on the space of all functions. However, they sometimes carry a function inside Hilbert space into a function outside it (see Problem 3.2(b)), and in that case the domain of the operator (the set of functions on which it acts) may have to be restricted (see Problem 3.48).

In a finite-dimensional vector space hermitian operators are represented by hermitian matrices; a hermitian matrix is equal to its transpose conjugate:  $\mathbf{T} = \mathbf{T}^{\dagger} = \hat{\mathbf{T}}^{n}$ . If this is unfamiliar to you please see the Appendix.
As I mentioned in Chapter 1, there exist pathological functions that are square-integrable but do not go to zero at infinity. However, such functions do not arise in physics, and if you are worried about it we will simply restrict the domain of our operators to exclude them. On finite intervals, though, you really do have to be more careful with the boundary terms, and an operator that is hermitian on  $(-\infty, \infty)$  may not be hermitian on  $(0, \infty)$  or  $(-\pi, \pi)$ . (If you're wondering about the infinite square well, it's safest to think of those wave functions as residing on the infinite line—they just happen to be zero outside  $(0, a)$ .) See Problem 3.48.
10 I'm talking about a competent measurement, of course—it's always possible to make a mistake, and simply get the wrong answer, but that's not the fault of quantum mechanics.
It is here that we assume the eigenfunctions are in Hilbert space—otherwise the inner product might not exist at all.
12 P. A. M. Dirac, The Principles of Quantum Mechanics, Oxford University Press, New York (1958).
In some specific cases completeness is provable (we know that the stationary states of the infinite square well, for example, are complete, because of Dirichlet's theorem). It is a little awkward to call something an "axiom" that is provable in some cases, but I don't know a better way to do it.

168

13 What about the eigenfunctions with nonreal eigenvalues? These are not merely non-normalizable—they actually blow up at $\pm \infty$. Functions in what I called the "suburbs" of Hilbert space (the entire metropolitan area is sometimes called a "rigged Hilbert space"; see, for example, Leslie Ballentine's Quantum Mechanics: A Modern Development, World Scientific, 1998) have the property that although they have no (finite) inner product with themselves, they do admit inner products with all members of Hilbert space. This is not true for eigenfunctions of $\hat{p}$ with nonreal eigenvalues. In particular, I showed that the momentum operator is hermitian for functions in Hilbert space, but the argument depended on dropping the boundary term (in Equation 3.19). That term is still zero if $g$ is an eigenfunction of $\hat{p}$ with a real eigenvalue (as long as $f$ is in Hilbert space), but not if the eigenvalue has an imaginary part. In this sense any complex number is an eigenvalue of the operator $\hat{p}$, but only real numbers are eigenvalues of the hermitian operator $\hat{p}$—the others lie outside the space over which $\hat{p}$ is hermitian.

15 You may have noticed that there is an ambiguity in this prescription, if $Q(x, p)$ involves the product $np$. Because $\hat{x}$ and $\hat{p}$ do not commute (Equation 2.52)—whereas the classical variables $x$ and $p$, of course, do—it is not clear whether we should write $\hat{X} \hat{p}$ or $\hat{p} \hat{X}$ (or perhaps some linear combination of the two). Luckily, such observables are very rare, but when they do occur some other consideration must be invoked to resolve the ambiguity.

16 In the case of continuous spectra the collapse is to a narrow range about the measured value, depending on the precision of the measuring device.

17 Notice that the time dependence—which is not at issue here—is carried by the coefficients; to make this explicit I write $\ell_{R}(I)$. In the special case of the Hamiltonian $(\hat{Q} = \hat{H})$ when the potential energy is time independent, the coefficients are in fact constant, as we saw in Section 2.1.

18 Again, I am scrupulously avoiding the all-too-common claim $\left|_{\ell_R}\right|^2$ is the probability that the particle is in the state $f_{R}$. This is nonsense: The particle is in the state $\Psi$, period. Rather, $\left|_{\ell_R}\right|^2$ is the probability that a measurement of $Q$ would yield the value $\Psi n$. It is true that such a measurement will collapse the state to the eigenfunction $f_{R}$, so one might correctly say $\left|_{\ell_R}\right|^2$ is the probability that a particle which is now in the state $\Psi$ will be in the state $f_{R}$ subsequent to a measurement of $Q$. ...but that's a quite different assertion.

19 More precisely, the commutator of two hermitian operators is itself anti-hermitian $\left(\hat{Q}^{\dagger} = -\hat{Q}\right)$, and its expectation value is imaginary (Problem 3.32).

20 This corresponds to the fact that noncommuting matrices cannot be simultaneously diagonalized (that is, they cannot both be brought to diagonal form by the same similarity transformation), whereas commuting hermitian matrices can be simultaneously diagonalized. See Section A.5.

21 Bohr and Heisenberg were at pains to track down the mechanism by which the measurement of $x$ (for instance) destroys the previously existing value of $p$. The crux of the matter is that in order to determine the position of a particle you have to poke it with something—shine light on it, say. But these photons impart to the particle a momentum you cannot control. You now know the position, but you no longer know the momentum. Bohr's famous debates with Einstein include many delightful examples, showing in detail how experimental constraints enforce the uncertainty principle. For an inspired account see Bohr's article in Albert Einstein: Philosopher-Scientist, edited by Paul A. Schilpp, Open Court Publishing Co., Peru, IL (1970). In recent years the Bohr/Heisenberg explanation has been called into question; for a nice discussion see G. Brumfiel, Nature News https://doi.org/10.1038/nature.2012.11394.

22 Note that it is only the dependence of $\Psi$ on $x$ that is at issue here—the "constants" $A, a, \langle x \rangle$, and $\langle p \rangle$ may all be functions of time, and for that matter $\Psi$ may evolve away from the minimal form. All I'm asserting is that if, at some instant, the wave function is gaussian in $x$, then (at that instant) the uncertainty product is minimal.

23 Many casual applications of the uncertainty principle are actually based (often inadvertently) on a completely different—and sometimes quite unjustified—measure of "uncertainty." See J. Hilgevoord, Am. J. Phys. 70, 983 (2002).

24 Operators that depend explicitly on $t$ are quite rare, so almost always $\partial \hat{Q} / \partial t = 0$. As an example of explicit time dependence, consider the potential energy of a harmonic oscillator whose spring constant is changing (perhaps the temperature is rising, so the spring becomes more flexible): $Q = (1/2) m[\omega(t)]^2 x^2$.

25 This is sometimes called the "Mandelstam-Tamm" formulation of the energy-time uncertainty principle. For a review of alternative approaches see P. Busch, Found. Phys. 20, 1 (1990).

26 In truth, Example 3.7 is a bit of a fraud. You can't measure $10^{-23}$ s on a stop-watch, and in practice the lifetime of such a short-lived particle is inferred from the width of the mass plot, using the uncertainty principle as input. However, the point is valid, even if the logic is backwards. Moreover, if you assume the $\Delta$ is about the same size as a proton $\left(\sim 10^{-15} \mathrm{~m}\right)$, then $10^{-23}$ sec is roughly the time it takes light to cross the particle, and it's hard to imagine that the lifetime could be much less than that.

27 I hesitate to call it $\chi_{X}$ (Equation 3.39), because that is its form in the position basis, and the whole point here is to free ourselves from any particular basis. Indeed, when I first defined Hilbert space as the set of square-integrable functions—over $x$—that was already too restrictive, committing us to a specific representation (the position basis). I want now to think of it as an abstract vector space, whose members can be expressed with respect to any basis you like.

28 In position space it would be $f_{R}$ (Equation 3.32).

29 I'll assume the basis is discrete; otherwise $n$ becomes a continuous index and the sums are replaced by integrals.

30 This terminology is inspired, obviously, by the finite-dimensional case, but the "matrix" will now typically have an infinite (maybe even uncountable) number of elements.

169

In matrix notation Equation 3.86 becomes $\mathbf{b} = \mathbf{Q}\mathbf{a}$ (with the vectors expressed as columns), by the ordinary rules of matrix multiplication — see Equation A.42.

Technically, the "equals" signs here mean "is represented by," but I don't think any confusion will arise if we adopt the customary informal notation.

We began, back in Chapter 1, with the Schrödinger equation for the wave function in position space; here we generalize it to the state vector in Hilbert space.

This is a crude model for (among other things) neutrino oscillations. In that context $|1\rangle$ represents (say) the electron neutrino, and $|\mathfrak{Z}\rangle$ the muon neutrino; if the Hamiltonian has a nonvanishing off-diagonal term $(\vec{g})$ then in the course of time the electron neutrino will turn into a muon neutrino (and back again).

Note that $(\hat{Q}\hat{f}| = \langle \hat{f}\rangle \hat{Q}^{\dagger}$, by virtue of Equation 3.20.

Like his delta function, Dirac's notation is beautiful, powerful, and obedient. You can abuse it (everyone does), and it won't bite. But once in a while you should pause to ask yourself what the symbols really mean.

This is a special case of a more general formula that applies when $\hat{\mathbf{A}}$ and $\hat{\mathbf{B}}$ do not commute with $\hat{\mathbf{C}}$. See, for example, Eugen Merzbacher, Quantum Mechanics, 3rd edn, Wiley, New York (1998), page 40.

The product rule holds for differentiating operators as long as you respect their order:

$$
\frac {d}{d \lambda} \left[ \hat {A} (\lambda) \hat {B} (\lambda) \right] = \hat {A} ^ {\prime} (\lambda) \hat {B} (\lambda) + \hat {A} (\lambda) \hat {B} ^ {\prime} (\lambda). \tag {3.105}
$$

Legendre didn't know what the best convention would be; he picked the overall factor so that all his functions would go to 1 at $x = 1$, and we're stuck with his unfortunate choice.

See F. L. Markley, Am. J. Phys. 40, 1545 (1972).

See L. Vaidman, Am. J. Phys. 60, 182 (1992) for a proof.

There are no normalizable eigenfunctions of the raising operator.

For interesting commentary and references, see R. R. Puri, Phys. Rev. A 49, 2178 (1994).

Fred Cooper, Avinash Khare, and Uday Sukhatme, Supersymmetry in Quantum Mechanics, World Scientific, Singapore, 2001.

Mathematicians call them "symmetric" operators.

Because the distinction rarely intrudes, physicists tend to use the word "hermitian" indiscriminately; technically, we should always say "self-adjoint," meaning $\hat{Q} = \hat{Q}^{\dagger}$ both in action and in domain.

The domain of $\hat{\mathbf{Q}}$ is something we stipulate; that determines the domain of $\hat{\mathbf{Q}}^{\dagger}$.

J. von Neumann introduced machinery for generating self-adjoint extensions of hermitian operators—or in some cases proving that they cannot exist. For an accessible introduction see G. Bonneau, J. Faraut, and B. Valent, Am. J. Phys. 69, 322 (2001); for an interesting application see M. T. Ahari, G. Ortiz, and B. Seradjeh, Am. J. Phys. 84, 858 (2016).

4
Quantum Mechanics in Three Dimensions
170

171

# 4.1 The Schrödinger Equation

The generalization to three dimensions is straightforward. Schrödinger's equation says

$$
i \hbar \frac {\partial \Psi}{\partial t} = \hat {H} \Psi ; \tag {4.1}
$$

the Hamiltonian operator  $\hat{H}$  is obtained from the classical energy

$$
\frac {1}{2} m v ^ {2} + V = \frac {1}{2 m} \left(p _ {x} ^ {2} + p _ {y} ^ {2} + p _ {z} ^ {2}\right) + V
$$

by the standard prescription (applied now to  $y$  and  $z$ , as well as  $x$ ):

$$
p _ {x} \rightarrow - i \hbar \frac {\partial}{\partial x}, \quad p _ {y} \rightarrow - i \hbar \frac {\partial}{\partial y}, \quad p _ {z} \rightarrow - i \hbar \frac {\partial}{\partial z}, \tag {4.2}
$$

or

$$
\boxed {\mathbf {p} \rightarrow - i \hbar \nabla ,} \tag {4.3}
$$

for short. Thus

$$
i \hbar \frac {\partial \Psi}{\partial t} = - \frac {\hbar^ {2}}{2 m} \nabla^ {2} \Psi + V \Psi , \tag {4.4}
$$

where

$$
\nabla^ {2} \equiv \frac {\partial^ {2}}{\partial x ^ {2}} + \frac {\partial^ {2}}{\partial y ^ {2}} + \frac {\partial^ {2}}{\partial z ^ {2}}, \tag {4.5}
$$

is the Laplacian, in cartesian coordinates.

The potential energy  $V$  and the wave function  $\Psi$  are now functions of  $\mathbf{r} = (x, y, z)$  and  $t$ . The probability of finding the particle in the infinitesimal volume  $d^3\mathbf{r} = dx dy dz$  is  $|\Psi(\mathbf{r}, t)|^2 d^3\mathbf{r}$ , and the normalization condition reads

$$
\int | \Psi | ^ {2} d ^ {3} \mathbf {r} = 1, \tag {4.6}
$$

with the integral taken over all space. If  $V$  is independent of time, there will be a complete set of stationary states,

$$
\Psi_ {n} (\mathbf {r}, t) = \psi_ {n} (\mathbf {r}) e ^ {- i E _ {n} t / \hbar}, \tag {4.7}
$$

where the spatial wave function  $\psi_{n}$  satisfies the time-independent Schrödinger equation:

$$
- \frac {\hbar^ {2}}{2 m} \nabla^ {2} \psi + V \psi = E \psi . \tag {4.8}
$$

The general solution to the (time-dependent) Schrödinger equation is

$$
\Psi (\mathbf {r}, t) = \sum c _ {n} \psi_ {n} (\mathbf {r}) e ^ {- i E _ {n} t / \hbar}, \tag {4.9}
$$

with the constants  $c_{n}$  determined by the initial wave function,  $\Psi (\mathbf{r},0)$ , in the usual way. (If the potential admits continuum states, then the sum in Equation 4.9 becomes an integral.)

# Problem 4.1

(a) Work out all of the canonical commutation relations for components of the operators  $\mathbf{r}$  and  $\mathbf{p}$ :  $[x, y] \cdot [x, p_y] \cdot [x, p_x] \cdot [p_y, p_z]$  and so on. Answer:

$$
\left[ r _ {i}, p _ {j} \right] = - \left[ p _ {i}, r _ {j} \right] = i \hbar \delta_ {i j}, \quad \left[ r _ {i}, r _ {j} \right] = \left[ p _ {i}, p _ {j} \right] = 0, \tag {4.10}
$$

where the indices stand for  $x, y$ , or  $z$ , and  $r_x = x, r_y = y$ , and  $r_z = z$ .

(b) Confirm the three-dimensional version of Ehrenfest's theorem,

$$
\frac {d}{d t} \langle \mathbf {r} \rangle = \frac {1}{m} \langle \mathbf {p} \rangle , \quad \text {and} \quad \frac {d}{d t} \langle \mathbf {p} \rangle = \langle - \nabla V \rangle . \tag {4.11}
$$

(Each of these, of course, stands for three equations—one for each component.) Hint: First check that the "generalized" Ehrenfest theorem, Equation 3.73, is valid in three dimensions.

(c) Formulate Heisenberg's uncertainty principle in three dimensions. Answer:

$$
\sigma_ {x} \sigma_ {p _ {x}} \geq \hbar / 2, \quad \sigma_ {y} \sigma_ {p _ {y}} \geq \hbar / 2, \quad \sigma_ {z} \sigma_ {p _ {z}} \geq \hbar / 2, \tag {4.12}
$$

but there is no restriction on, say,  $\sigma_{x}\sigma_{p_{y}}$

# Problem 4.2 Use separation of variables in cartesian coordinates to solve the infinite cubical well (or "particle in a box"):

$$
V (x, y, z) = \left\{ \begin{array}{l l} 0, &amp; x, y, z \text{ all between } 0 \text{ and } a; \\ \infty , &amp; \text{otherwise}. \end{array} \right.
$$

(a) Find the stationary states, and the corresponding energies.
(b) Call the distinct energies  $E_{1}, E_{2}, E_{3}, \ldots$ , in order of increasing energy. Find  $E_{1}, E_{2}, E_{3}, E_{4}, E_{5}$ , and  $E_{6}$ . Determine their degeneracies (that is, the number of different states that share the same energy). Comment: In one dimension degenerate bound states do not occur (see Problem 2.44), but in three dimensions they are very common.
(c) What is the degeneracy of  $E_{14}$ , and why is this case interesting?

172

173

# 4.1.1 Spherical Coordinates

Most of the applications we will encounter involve central potentials, for which  $V$  is a function only of the distance from the origin,  $V(\mathbf{r}) \to V(r)$ . In that case it is natural to adopt spherical coordinates,  $(r,\theta ,\phi)$  (Figure 4.1). In spherical coordinates the Laplacian takes the form

$$
\nabla^ {2} = \frac {1}{r ^ {2}} \frac {\partial}{\partial r} \left(r ^ {2} \frac {\partial}{\partial r}\right) + \frac {1}{r ^ {2} \sin \theta} \frac {\partial}{\partial \theta} \left(\sin \theta \frac {\partial}{\partial \theta}\right) + \frac {1}{r ^ {2} \sin^ {2} \theta} \left(\frac {\partial^ {2}}{\partial \phi^ {2}}\right). \tag {4.13}
$$

In spherical coordinates, then, the time-independent Schrödinger equation reads

$$
- \frac {\hbar^ {2}}{2 m} \left[ \frac {1}{r ^ {2}} \frac {\partial}{\partial r} \left(r ^ {2} \frac {\partial \psi}{\partial r}\right) + \frac {1}{r ^ {2} \sin \theta} \frac {\partial}{\partial \theta} \left(\sin \theta \frac {\partial \psi}{\partial \theta}\right) + \frac {1}{r ^ {2} \sin^ {2} \theta} \left(\frac {\partial^ {2} \psi}{\partial \phi^ {2}}\right) \right] + V \psi = E \psi . \tag {4.14}
$$

![img-53.jpeg](img-53.jpeg)
Figure 4.1: Spherical coordinates: radius  $r$ , polar angle  $\theta$ , and azimuthal angle  $\phi$ .

We begin by looking for solutions that are separable into products (a function of  $r$  times a function of  $\theta$  and  $\phi$ ):

$$
\psi (r, \theta , \phi) = R (r) Y (\theta , \phi). \tag {4.15}
$$

Putting this into Equation 4.14, we have

$$
- \frac {\hbar^ {2}}{2 m} \left[ \frac {Y}{r ^ {2}} \frac {d}{d r} \left(r ^ {2} \frac {d R}{d r}\right) + \frac {R}{r ^ {2} \sin \theta} \frac {\partial}{\partial \theta} \left(\sin \theta \frac {\partial Y}{\partial \theta}\right) + \frac {R}{r ^ {2} \sin^ {2} \theta} \frac {\partial^ {2} Y}{\partial \phi^ {2}} \right] + V R Y = E R Y.
$$

Dividing by  $YR$  and multiplying by  $-2mr^2 / \hbar^2$ :

$$
\left\{\frac {1}{R} \frac {d}{d r} \left(r ^ {2} \frac {d R}{d r}\right) - \frac {2 m r ^ {2}}{\hbar^ {2}} [ V (r) - E ] \right\} + \frac {1}{Y} \left\{\frac {1}{\sin \theta} \frac {\partial}{\partial \theta} \left(\sin \theta \frac {\partial Y}{\partial \theta}\right) + \frac {1}{\sin^ {2} \theta} \frac {\partial^ {2} Y}{\partial \phi^ {2}} \right\} = 0.
$$

The term in the first curly bracket depends only on  $r$ , whereas the remainder depends only on  $\theta$  and  $\phi$ ; accordingly, each must be a constant. For reasons that will appear in due course, I will write this "separation constant" in the form  $\ell (\ell + 1)$ :

$$
\frac {1}{R} \frac {d}{d r} \left(r ^ {2} \frac {d R}{d r}\right) - \frac {2 m r ^ {2}}{\hbar^ {2}} [ V (r) - E ] = \ell (\ell + 1); \tag {4.16}
$$

$$
\frac {1}{Y} \left\{\frac {1}{\sin \theta} \frac {\partial}{\partial \theta} \left(\sin \theta \frac {\partial Y}{\partial \theta}\right) + \frac {1}{\sin^ {2} \theta} \frac {\partial^ {2} Y}{\partial \phi^ {2}} \right\} = - \ell (\ell + 1). \tag {4.17}
$$

**Problem 4.3**

(a) Suppose $\psi (r,\theta ,\phi) = Ae^{-r / a}$, for some constants $A$ and $a$. Find $E$ and $V(r)$, assuming $V(r)\to 0$ as $r\to \infty$.

(b) Do the same for $\psi (r,\theta ,\phi) = Ae^{-r^2 /a^2}$, assuming $V(0) = 0$.

175

176

## 4.1.2 The Angular Equation

Equation 4.17 determines the dependence of $\psi$ on $\theta$ and $\phi$; multiplying by $Y \sin^2 \theta$, it becomes:

$$
\sin \theta \frac {\partial}{\partial \theta} \left(\sin \theta \frac {\partial Y}{\partial \theta}\right) + \frac {\partial^ {2} Y}{\partial \phi^ {2}} = - \ell (\ell + 1) \sin^ {2} \theta Y. \tag {4.18}
$$

You might recognize this equation—it occurs in the solution to Laplace's equation in classical electrodynamics. As always, we solve it by separation of variables:

$$
Y (\theta , \phi) = \Theta (\theta) \Phi (\phi). \tag {4.19}
$$

Plugging this in, and dividing by $\Theta \Phi$,

$$
\left\{\frac {1}{\Theta} \left[ \sin \theta \frac {d}{d \theta} \left(\sin \theta \frac {d \Theta}{d \theta}\right) \right] + \ell (\ell + 1) \sin^ {2} \theta \right\} + \frac {1}{\Phi} \frac {d ^ {2} \Phi}{d \phi^ {2}} = 0.
$$

The first term is a function only of $\theta$, and the second is a function only of $\phi$, so each must be a constant. This time² I'll call the separation constant $m^2$:

$$
\frac {1}{\Theta} \left[ \sin \theta \frac {d}{d \theta} \left(\sin \theta \frac {d \Theta}{d \theta}\right) \right] + \ell (\ell + 1) \sin^ {2} \theta = m ^ {2}; \tag {4.20}
$$

$$
\frac {1}{\Phi} \frac {d ^ {2} \Phi}{d \phi^ {2}} = - m ^ {2}. \tag {4.21}
$$

The $\phi$ equation is easy:

$$
\frac {d ^ {2} \Phi}{d \phi^ {2}} = - m ^ {2} \Phi \Rightarrow \Phi (\phi) = e ^ {i m \phi}. \tag {4.22}
$$

Actually, there are two solutions: $\exp (im\phi)$ and $\exp (-im\phi)$, but we'll cover the latter by allowing $m$ to run negative. There could also be a constant factor in front, but we might as well absorb that into $\Theta$. Incidentally, in electrodynamics we would write the azimuthal function $(\Phi)$ in terms of sines and cosines, instead of exponentials, because electric fields are real. But there is no such constraint on the wave function, and exponentials are a lot easier to work with. Now, when $\phi$ advances by $2\pi$, we return to the same point in space (see Figure 4.1), so it is natural to require that³

$$
\Phi (\phi + 2 \pi) = \Phi (\phi). \tag {4.23}
$$

In other words, $\exp [im(\phi + 2\pi)] = \exp (im\phi)$, or $\exp (2\pi im) = 1$. From this it follows that $m$ must be an integer:

$$
m = 0, \pm 1, \pm 2, \dots . \tag {4.24}
$$

The $\theta$ equation,

$$
\sin \theta \frac {d}{d \theta} \left(\sin \theta \frac {d \Theta}{d \theta}\right) + \left[ \ell (\ell + 1) \sin^ {2} \theta - m ^ {2} \right] \Theta = 0, \tag {4.25}
$$

may not be so familiar. The solution is

$$
\Theta (\theta) = A P _ {\ell} ^ {m} (\cos \theta), \tag {4.26}
$$

where  $P_{\ell}^{m}$  is the associated Legendre function, defined by

$$
P _ {\ell} ^ {m} (x) \equiv (- 1) ^ {m} \left(1 - x ^ {2}\right) ^ {m / 2} \left(\frac {d}{d x}\right) ^ {m} P _ {\ell} (x), \tag {4.27}
$$

and  $P_{\ell}(x)$  is the  $\xi$ th Legendre polynomial, defined by the Rodrigues formula:

$$
P _ {\ell} (x) \equiv \frac {1}{2 ^ {\ell} \ell !} \left(\frac {d}{d x}\right) ^ {\ell} \left(x ^ {2} - 1\right) ^ {\ell}. \tag {4.28}
$$

For example,

$$
P _ {0} (x) = 1, \quad P _ {1} (x) = \frac {1}{2} \frac {d}{d x} \left(x ^ {2} - 1\right) = x,
$$

$$
P _ {2} (x) = \frac {1}{4 \cdot 2} \left(\frac {d}{d x}\right) ^ {2} \left(x ^ {2} - 1\right) ^ {2} = \frac {1}{2} \left(3 x ^ {2} - 1\right),
$$

and so on. The first few Legendre polynomials are listed in Table 4.1. As the name suggests,  $P_{\ell}(x)$  is a polynomial (of degree  $\xi$ ) in  $x$ , and is even or odd according to the parity of  $\xi$ . But  $P_{\ell}^{m}(x)$  is not, in general, a polynomial — if  $m$  is odd it carries a factor of  $\sqrt{1 - x^2}$ :

$$
P _ {2} ^ {0} (x) = \frac {1}{2} \left(3 x ^ {2} - 1\right), P _ {2} ^ {1} (x) = - \left(1 - x ^ {2}\right) ^ {1 / 2} \frac {d}{d x} \left[ \frac {1}{2} \left(3 x ^ {2} - 1\right) \right] = - 3 x \sqrt {1 - x ^ {2}},
$$

$$
P _ {2} ^ {2} (x) = \left(1 - x ^ {2}\right) \left(\frac {d}{d x}\right) ^ {2} \left[ \frac {1}{2} \left(3 x ^ {2} - 1\right) \right] = 3 \left(1 - x ^ {2}\right),
$$

etc. (On the other hand, what we need is  $P_{\ell}^{m}(\cos \theta)$ , and  $\sqrt{1 - \cos^2\theta} = \sin \theta$ , so  $P_{\ell}^{m}(\cos \theta)$  is always a polynomial in  $\cos \theta$ , multiplied—if  $m$  is odd—by  $\sin \theta$ . Some associated Legendre functions of  $\cos \theta$  are listed in Table 4.2.)

Table 4.1: The first few Legendre polynomials,  $P_{\ell}(x)$ : (a) functional form, (b) graph.

![img-54.jpeg](img-54.jpeg)
(a)

![img-55.jpeg](img-55.jpeg)
(b)
Table 4.2: Some associated Legendre functions,  $P_{\ell}^{m}(\cos \theta)$ : (a) functional form, (b) graphs of  $r = \left|P_{\ell}^{m}(\cos \theta)\right|$  (in these plots  $r$  tells you the magnitude of the function in the direction  $\theta$ ; each figure should be rotated about the  $z$  axis).

![img-56.jpeg](img-56.jpeg)
(a)

![img-57.jpeg](img-57.jpeg)
(b)

Notice that  $\bar{\varepsilon}$  must be a non-negative integer, for the Rodrigues formula to make any sense; moreover, if  $m &gt; \bar{\varepsilon}$ , then Equation 4.27 says  $P_{\bar{\varepsilon}}^{m} = 0$ . For any given  $\bar{\varepsilon}$ , then, there are  $(2\bar{\varepsilon} + 1)$  possible values of  $m$ :

$$
\ell = 0, 1, 2, \dots ; \quad m = - \ell , - \ell + 1, \dots , - 1, 0, 1, \dots , \ell - 1, \ell . \tag {4.29}
$$

But wait! Equation 4.25 is a second-order differential equation: It should have two linearly independent solutions, for any old values of  $\bar{\varepsilon}$  and  $m$ . Where are all the other solutions? Answer: They exist, of course, as mathematical solutions to the equation, but they are physically unacceptable, because they blow up at  $\theta = 0$  and/or  $\theta = \pi$  (see Problem 4.5).

Now, the volume element in spherical coordinates is

$$
d ^ {3} \mathbf {r} = r ^ {2} \sin \theta d r d \theta d \phi = r ^ {2} d r d \Omega , \quad \text {w h e r e} \quad d \Omega \equiv \sin \theta d \theta d \phi , \tag {4.30}
$$

so the normalization condition (Equation 4.6) becomes

$$
\int | \psi | ^ {2} r ^ {2} \sin \theta d r d \theta d \phi = \int | R | ^ {2} r ^ {2} d r \int | Y | ^ {2} d \Omega = 1.
$$

It is convenient to normalize  $R$  and  $Y$  separately:

$$
\int_ {0} ^ {\infty} | R | ^ {2} r ^ {2} d r = 1 \quad \text {a n d} \quad \int_ {0} ^ {\pi} \int_ {0} ^ {2 \pi} | Y | ^ {2} \sin \theta d \theta d \phi = 1. \tag {4.31}
$$

The normalized angular wave functions are called spherical harmonics:

$$
Y _ {\ell} ^ {m} (\theta , \phi) = \sqrt {\frac {(2 \ell + 1)}{4 \pi} \frac {(\ell - m) !}{(\ell + m) !}} e ^ {i m \phi} P _ {\ell} ^ {m} (\cos \theta), \tag {4.32}
$$

As we shall prove later on, they are automatically orthogonal:

$$
\int_ {0} ^ {\pi} \int_ {0} ^ {2 \pi} \left[ Y _ {\ell} ^ {m} (\theta , \phi) \right] ^ {*} \left[ Y _ {\ell^ {\prime}} ^ {m ^ {\prime}} (\theta , \phi) \right] \sin \theta d \theta d \phi = \delta_ {\ell \ell^ {\prime}} \delta_ {m m ^ {\prime}}, \tag {4.33}
$$

In Table 4.3 I have listed the first few spherical harmonics.

Table 4.3: The first few spherical harmonics,  ${Y}_{\ell }^{m}\left( {\theta ,\phi }\right)$  .

|  Y00=(1/4π)1/2 | Y22=(15/32π)1/2sin2θe±2iφ  |
| --- | --- |
|  Y10=(3/4π)1/2cos θ | Y30=(7/16π)1/2(5 cos3θ-3 cos θ)  |
|  Y1±1=τ(3/8π)1/2sin θe±iφ | Y3±1=τ(21/64π)1/2sin θ(5 cos2θ-1)e±iφ  |
|  Y20=(5/16π)1/2(3 cos2θ-1) | Y3±2=(105/32π)1/2sin2θcos θe±2iφ  |
|  Y2±1=τ(15/8π)1/2sin θcos θe±iφ | Y3±3=τ(35/64π)1/2sin3θe±3iφ  |

*

Problem 4.4 Use Equations 4.27, 4.28, and 4.32, to construct  $Y_0^0$  and  $Y_2^1$ . Check that they are normalized and orthogonal.

Problem 4.5 Show that

$\Theta (\theta) = A\ln \left[\tan \left(\theta /2\right)\right]$

satisfies the  $\Theta$  equation (Equation 4.25), for  $\ell = m = 0$ . This is the unacceptable "second solution"—what's wrong with it?

Problem 4.6 Using Equation 4.32 and footnote 5, show that

$Y_{\ell}^{-m} = (-1)^{m}\left(Y_{\ell}^{m}\right)^{*}$

*

Problem 4.7 Using Equation 4.32, find  $Y_{\ell}^{\ell}(\theta, \phi)$  and  $Y_{3}^{2}(\theta, \phi)$ . (You can take  $P_{3}^{2}$  from Table 4.2, but you'll have to work out  $P_{\ell}^{\ell}$  from Equations 4.27 and 4.28.) Check that they satisfy the angular equation (Equation 4.18), for the appropriate values of  $\ell$  and  $m$ .

**

Problem 4.8 Starting from the Rodrigues formula, derive the orthonormality condition for Legendre polynomials:

(4.34)

$\int_{-1}^{1}P_{\ell}(x)P_{\ell^{\prime}}(x)dx = \left(\frac{2}{2\ell + 1}\right)\delta_{\ell \ell^{\prime}}.$

Hint: Use integration by parts.

180

## 4.1.3 The Radial Equation

Notice that the angular part of the wave function, $Y(\theta, \phi)$, is the same for all spherically symmetric potentials; the actual shape of the potential, $V(r)$, affects only the radial part of the wave function, $R(r)$, which is determined by Equation 4.16:

$$
\frac {d}{d r} \left(r ^ {2} \frac {d R}{d r}\right) - \frac {2 m r ^ {2}}{\hbar^ {2}} [ V (r) - E ] R = \ell (\ell + 1) R. \tag {4.35}
$$

This simplifies if we change variables: Let

$$
u (r) \equiv r R (r), \tag {4.36}
$$

so that $R = u / r, dR / dr = \left[r(du / dr) - u\right] / r^2, (d / dr)\left[r^2(dR / dr)\right] = rd^2u / dr^2$, and hence

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} u}{d r ^ {2}} + \left[ V + \frac {\hbar^ {2}}{2 m} \frac {\ell (\ell + 1)}{r ^ {2}} \right] u = E u. \tag {4.37}
$$

This is called the radial equation; it is identical in form to the one-dimensional Schrödinger equation (Equation 2.5), except that the effective potential,

$$
V _ {\text {e f f}} = V + \frac {\hbar^ {2}}{2 m} \frac {\ell (\ell + 1)}{r ^ {2}}, \tag {4.38}
$$

contains an extra piece, the so-called centrifugal term, $\left(\hbar^2 / 2m\right)\left[\ell (\ell + 1) / r^2\right]$. It tends to throw the particle outward (away from the origin), just like the centrifugal (pseudo-)force in classical mechanics. Meanwhile, the normalization condition (Equation 4.31) becomes

$$
\int_ {0} ^ {\infty} | u | ^ {2} d r = 1. \tag {4.39}
$$

That's as far as we can go until a specific potential $V(r)$ is provided.

### Example 4.1

Consider the infinite spherical well,

$$
V (r) = \left\{ \begin{array}{l l} 0, &amp; r \leq a; \\ \infty , &amp; r &gt; a. \end{array} \right. \tag {4.40}
$$

Find the wave functions and the allowed energies.

**Solution**: Outside the well the wave function is zero; inside the well, the radial equation says

$$
\frac {d ^ {2} u}{d r ^ {2}} = \left[ \frac {\ell (\ell + 1)}{r ^ {2}} - k ^ {2} \right] u, \tag {4.41}
$$

where

$$
k \equiv \frac {\sqrt {2 m E}}{\hbar}. \tag {4.42}
$$

Our problem is to solve Equation 4.41, subject to the boundary condition  $u(a) = 0$ . The case  $\ell = 0$  is easy:

$$
\frac {d ^ {2} u}{d r ^ {2}} = - k ^ {2} u \Rightarrow u (r) = A \sin (k r) + B \cos (k r).
$$

But remember, the actual radial wave function is  $R(r) = u(r) / r$ , and  $[\cos (kr)] / r$  blows up as  $r\to 0$ . So  $B = 0$ . The boundary condition then requires  $\sin (ka) = 0$ , and hence  $ka = N\pi$ , for some integer  $N$ . The allowed energies are

$$
E _ {N 0} = \frac {N ^ {2} \pi^ {2} \hbar^ {2}}{2 m a ^ {2}}, \quad (N = 1, 2, 3, \dots) \tag {4.43}
$$

(same as for the one-dimensional infinite square well, Equation 2.30). Normalizing  $u(r)$  yields  $A = \sqrt{2 / a}$ :

$$
u _ {N 0} = \sqrt {\frac {2}{a}} \sin \left(\frac {N \pi r}{a}\right). \tag {4.44}
$$

Notice that the radial wave function has  $N - 1$  nodes (or, if you prefer,  $N$  "lobes").

The general solution to Equation 4.41 (for an arbitrary integer  $\xi$ ) is not so familiar:

$$
u (r) = A r j _ {\ell} (k r) + B r n _ {\ell} (k r), \tag {4.45}
$$

where  $j_{\ell}(x)$  is the spherical Bessel function of order  $\xi$ , and  $n_{\ell}(x)$  is the spherical Neumann function of order  $\xi$ . They are defined as follows:

$$
j _ {\ell} (x) \equiv (- x) ^ {\ell} \left(\frac {1}{x} \frac {d}{d x}\right) ^ {\ell} \frac {\sin x}{x}; \quad n _ {\ell} (x) \equiv - (- x) ^ {\ell} \left(\frac {1}{x} \frac {d}{d x}\right) ^ {\ell} \frac {\cos x}{x}. \tag {4.46}
$$

For example,

$$
j _ {0} (x) = \frac {\sin x}{x}; \quad n _ {0} (x) = - \frac {\cos x}{x};
$$

$$
j _ {1} (x) = (- x) \frac {1}{x} \frac {d}{d x} \left(\frac {\sin x}{x}\right) = \frac {\sin x}{x ^ {2}} - \frac {\cos x}{x};
$$

$$
\begin{array}{l} j _ {2} (x) = (- x) ^ {2} \left(\frac {1}{x} \frac {d}{d x}\right) ^ {2} \frac {\sin x}{x} = x ^ {2} \left(\frac {1}{x} \frac {d}{d x}\right) \frac {x \cos x - \sin x}{x ^ {3}} \\ = \frac {3 \sin x - 3 x \cos x - x ^ {2} \sin x}{x ^ {3}}; \\ \end{array}
$$

and so on. The first few spherical Bessel and Neumann functions are listed in Table 4.4. For small  $x$  (where  $\sin x = x - x^3 / 3! + x^5 / 5! - \dots$  and  $\cos x = 1 - x^2 / 2 + x^4 / 4! - \dots$ ),

$$
j _ {0} (x) \approx 1; \quad n _ {0} (x) \approx \frac {1}{x}; \quad j _ {1} (x) \approx \frac {x}{3}; \quad j _ {2} (x) \approx \frac {x ^ {2}}{1 5};
$$

etc. Notice that Bessel functions are finite at the origin, but Neumann functions blow up at the origin. Accordingly,  $B_{\ell} = 0$ , and hence

$$
R (r) = A j _ {\ell} (k r). \tag {4.47}
$$

There remains the boundary condition,  $R(a) = 0$ . Evidently  $k$  must be chosen such that

$$
j _ {\ell} (k a) = 0; \tag {4.48}
$$

that is,  $(ka)$  is a zero of the  $\ell$ th-order spherical Bessel function. Now, the Bessel functions are oscillatory (see Figure 4.2); each one has an infinite number of zeros. But (unfortunately for us) they are not located at nice sensible points (such as multiples of  $\pi$ ); they have to be computed numerically.[11] At any rate, the boundary condition requires that

$$
k = \frac {1}{a} \beta_ {N \ell}, \tag {4.49}
$$

where  $\beta_{N\ell}$  is the  $N$ th zero of the  $\ell$ th spherical Bessel function. The allowed energies, then, are given by

$$
E _ {N \ell} = \frac {\hbar^ {2}}{2 m a ^ {2}} \beta_ {N \ell} ^ {2}. \tag {4.50}
$$

It is customary to introduce the principal quantum number,  $n$ , which simply orders the allowed energies, starting with 1 for the ground state (see Figure 4.3). The wave functions are

$$
\psi_ {n \ell m} (r, \theta , \phi) = A _ {n \ell} j _ {\ell} \left(\beta_ {N \ell} \frac {r}{a}\right) Y _ {\ell} ^ {m} (\theta , \phi), \tag {4.51}
$$

with the constant  $A_{n\ell}$  to be determined by normalization. As before, the wave function has  $N - 1$  radial nodes.[12]

Table 4.4 The first few spherical Bessel and Neumann functions,  $j_{\ell}(x)$  and  $n_{\ell}(x)$ ; asymptotic forms for small  $x$ .

|  j0= sin x/x | n0=- cos x/x  |
| --- | --- |
|  j1= sin x/x2- cos x/x | n1=- cos x/x2- sin x/x  |
|  j2=(3/x3-1/x) sin x-3/x2 cos x | n2=- (3/x3-1/x) cos x-3/x2 sin x  |
|  jℓ→ 2ℓℓ!/(2ℓ+1)!xℓ, | nℓ→ - (2ℓ)!/2ℓℓ! 1/xℓ+1, for x<<1.  |

![img-58.jpeg](img-58.jpeg)
Figure 4.2: Graphs of the first four spherical Bessel functions.

![img-59.jpeg](img-59.jpeg)
Figure 4.3: Energy levels of the infinite spherical well (Equation 4.50). States with the same value of  $N$  are connected by dashed lines.

Notice that the energy levels are  $(2\ell + 1)$ -fold degenerate, since there are  $(2\ell + 1)$  different values of  $m$  for each value of  $\xi$  (see Equation 4.29). This is the degeneracy to be expected for a spherically symmetric potential, since  $m$  does not appear in the radial equation (which determines the energy). But in some cases (most famously the hydrogen atom) there is extra degeneracy, due to coincidences in the energy levels not attributable to spherical symmetry alone. The deeper reason for such "accidental" degeneracy is intriguing, as we shall see in Chapter 6.

# Problem 4.9

(a) From the definition (Equation 4.46), construct  $n_1(x)$  and  $n_2(x)$ .
(b) Expand the sines and cosines to obtain approximate formulas for  $n_1(x)$  and  $n_2(x)$ , valid when  $x \ll 1$ . Confirm that they blow up at the origin.

# Problem 4.10

(a) Check that  $Arj_{1}(kr)$  satisfies the radial equation with  $V(r) = 0$  and  $\ell = 1$ .
(b) Determine graphically the allowed energies for the infinite spherical well, when  $\ell = 1$ . Show that for large  $N$ ,  $E_{N1} \approx \left(\hbar^2 \pi^2 / 2ma^2\right)(N + 1/2)^2$ . Hint: First show that  $j_1(x) = 0 \Rightarrow x = \tan x$ . Plot  $x$  and  $\tan x$  on the same graph, and locate the points of intersection.

** Problem 4.11 A particle of mass  $m$  is placed in a finite spherical well:

$$
V (r) = \left\{ \begin{array}{l l} - V _ {0}, &amp; r \leq a; \\ 0, &amp; r &gt; a. \end{array} \right.
$$

Find the ground state, by solving the radial equation with  $\ell = 0$ . Show that there is no bound state if  $V_0a^2 &lt; \pi^2\hbar^2 /8m$ .

# 4.2 The Hydrogen Atom

The hydrogen atom consists of a heavy, essentially motionless proton (we may as well put it at the origin), of charge  $e$ , together with a much lighter electron (mass  $m_e$ , charge  $-e$ ) that orbits around it, bound by the mutual attraction of opposite charges (see Figure 4.4). From Coulomb's law, the potential energy of the electron[13] (in SI units) is

$$
V (r) = - \frac {e ^ {2}}{4 \pi \epsilon_ {0}} \frac {1}{r}, \tag {4.52}
$$

and the radial equation (Equation 4.37) says

$$
- \frac {\hbar^ {2}}{2 m _ {e}} \frac {d ^ {2} u}{d r ^ {2}} + \left[ - \frac {e ^ {2}}{4 \pi \epsilon_ {0}} \frac {1}{r} + \frac {\hbar^ {2}}{2 m _ {e}} \frac {\ell (\ell + 1)}{r ^ {2}} \right] u = E u. \tag {4.53}
$$

(The effective potential—the term in square brackets—is shown in Figure 4.5.) Our problem is to solve this equation for  $u(r)$ , and determine the allowed energies. The hydrogen atom is such an important case that I'm not going to hand you the solutions this time—we'll work them out in detail, by the method we used in the analytical solution to the harmonic oscillator. (If any step in this process is unclear, you may want to refer back to Section 2.3.2 for a more complete explanation.) Incidentally, the Coulomb potential (Equation 4.52) admits continuum states (with  $E &gt; 0$ ), describing electron-proton scattering, as well as discrete bound states, representing the hydrogen atom, but we shall confine our attention to the latter.[14]

![img-60.jpeg](img-60.jpeg)
Figure 4.4: The hydrogen atom.

![img-61.jpeg](img-61.jpeg)
Figure 4.5: The effective potential for hydrogen (Equation 4.53), if  $\ell &gt;0$

186

187

## 4.2.1 The Radial Wave Function

Our first task is to tidy up the notation. Let

$$
\kappa \equiv \frac {\sqrt {- 2 m _ {e} E}}{\hbar}. \tag {4.54}
$$

(For bound states, $E$ is negative, so $\kappa$ is real.) Dividing Equation 4.53 by $E$, we have

$$
\frac {1}{\kappa^ {2}} \frac {d ^ {2} u}{d r ^ {2}} = \left[ 1 - \frac {m _ {e} e ^ {2}}{2 \pi \epsilon_ {0} \hbar^ {2} \kappa} \frac {1}{(\kappa r)} + \frac {\ell (\ell + 1)}{(\kappa r) ^ {2}} \right] u.
$$

This suggests that we introduce

$$
\rho \equiv \kappa r, \quad \text{and} \quad \rho_ {0} \equiv \frac {m _ {e} e ^ {2}}{2 \pi \epsilon_ {0} \hbar^ {2} \kappa}, \tag {4.55}
$$

so that

$$
\frac {d ^ {2} u}{d \rho^ {2}} = \left[ 1 - \frac {\rho_ {0}}{\rho} + \frac {\ell (\ell + 1)}{\rho^ {2}} \right] u. \tag {4.56}
$$

Next we examine the asymptotic form of the solutions. As $\rho \to \infty$, the constant term in the brackets dominates, so (approximately)

$$
\frac {d ^ {2} u}{d \rho^ {2}} = u.
$$

The general solution is

$$
u (\rho) = A e ^ {- \rho} + B e ^ {\rho}, \tag {4.57}
$$

but $e^{\rho}$ blows up (as $\rho \to \infty$), so $B = 0$. Evidently,

$$
u (\rho) \sim A e ^ {- \rho}, \tag {4.58}
$$

for large $\rho$. On the other hand, as $\rho \to 0$ the centrifugal term dominates;[15] approximately, then:

$$
\frac {d ^ {2} u}{d \rho^ {2}} = \frac {\ell (\ell + 1)}{\rho^ {2}} u.
$$

The general solution (check it!) is

$$
u (\rho) = C \rho^ {\ell + 1} + D \rho^ {- \ell},
$$

but $\rho^{-\ell}$ blows up (as $\rho \to 0$), so $D = 0$. Thus

$$
u (\rho) \sim C \rho^ {\ell + 1}, \tag {4.59}
$$

for small $\rho$.

The next step is to peel off the asymptotic behavior, introducing the new function $v(\rho)$:

$$
u (\rho) = \rho^ {\ell + 1} e ^ {- \rho} v (\rho), \tag {4.60}
$$

in the hope that $\mathbf{v}(\rho)$ will turn out to be simpler than $\mathbf{u}(\rho)$. The first indications are not auspicious:

$$
\frac {d u}{d \rho} = \rho^ {\ell} e ^ {- \rho} \left[ (\ell + 1 - \rho) v + \rho \frac {d v}{d \rho} \right],
$$

and

$$
\frac {d ^ {2} u}{d \rho^ {2}} = \rho^ {\ell} e ^ {- \rho} \left\{\left[ - 2 \ell - 2 + \rho + \frac {\ell (\ell + 1)}{\rho} \right] v + 2 (\ell + 1 - \rho) \frac {d v}{d \rho} + \rho \frac {d ^ {2} v}{d \rho^ {2}} \right\}.
$$

In terms of $\mathbf{v}(\rho)$, then, the radial equation (Equation 4.56) reads

$$
\rho \frac {d ^ {2} v}{d \rho^ {2}} + 2 (\ell + 1 - \rho) \frac {d v}{d \rho} + [ \rho_ {0} - 2 (\ell + 1) ] v = 0. \tag {4.61}
$$

Finally, we assume the solution, $\mathbf{v}(\rho)$, can be expressed as a power series in $\pmb{\rho}$:

$$
v (\rho) = \sum_ {j = 0} ^ {\infty} c _ {j} \rho^ {j}. \tag {4.62}
$$

Our problem is to determine the coefficients $(c_0, c_1, c_2, \ldots)$. Differentiating term by term:

$$
\frac {d v}{d \rho} = \sum_ {j = 0} ^ {\infty} j c _ {j} \rho^ {j - 1} = \sum_ {j = 0} ^ {\infty} (j + 1) c _ {j + 1} \rho^ {j}.
$$

(In the second summation I have renamed the "dummy index": $j \rightarrow j + 1$. If this troubles you, write out the first few terms explicitly, and check it. You may object that the sum should now begin at $j = -1$, but the factor $(j + 1)$ kills that term anyway, so we might as well start at zero.) Differentiating again,

$$
\frac {d ^ {2} v}{d \rho^ {2}} = \sum_ {j = 0} ^ {\infty} j (j + 1) c _ {j + 1} \rho^ {j - 1}.
$$

Inserting these into Equation 4.61,

$$
\begin{array}{l} \sum_ {j = 0} ^ {\infty} j (j + 1) c _ {j + 1} \rho^ {j} + 2 (\ell + 1) \sum_ {j = 0} ^ {\infty} j (j + 1) c _ {j + 1} \rho^ {j} \\ - 2 \sum_ {j = 0} ^ {\infty} j c _ {j} \rho^ {j} + [ \rho_ {0} - 2 (\ell + 1) ] \sum_ {j = 0} ^ {\infty} c _ {j} \rho^ {j} = 0. \\ \end{array}
$$

Equating the coefficients of like powers yields

$$
j (j + 1) c _ {j + 1} + 2 (\ell + 1) (j + 1) c _ {j + 1} - 2 j c _ {j} + [ \rho_ {0} - 2 (\ell + 1) ] c _ {j} = 0,
$$

or:

$$
c _ {j + 1} = \left\{\frac {2 (j + \ell + 1) - \rho_ {0}}{(j + 1) (j + 2 \ell + 2)} \right\} c _ {j}. \tag {4.63}
$$

This recursion formula determines the coefficients, and hence the function $\mathbf{v}(\rho)$: We start with $c_0$ (this becomes an overall constant, to be fixed eventually by normalization), and Equation 4.63 gives us $c_1$; putting

188

this back in, we obtain $c_2$, and so on. $^{16}$

Now let's see what the coefficients look like for large $j$ (this corresponds to large $\rho$, where the higher powers dominate). In this regime the recursion formula says $^{17}$

$$
c_{j+1} \approx \frac{2j}{j(j+1)} c_j = \frac{2}{j+1} c_j,
$$

so

$$
c_j \approx \frac{2^j}{j!} c_0. \tag{4.64}
$$

Suppose for a moment that this were the exact result. Then

$$
v(\rho) = c_0 \sum_{j=0}^{\infty} \frac{2^j}{j!} \rho^j = c_0 e^{2\rho},
$$

and hence

$$
u(\rho) = c_0 \rho^{l+1} e^{\rho}, \tag{4.65}
$$

which blows up at large $\rho$. The positive exponential is precisely the asymptotic behavior we didn't want, in Equation 4.57. (It's no accident that it reappears here; after all, it does represent the asymptotic form of some solutions to the radial equation—they just don't happen to be the ones we're interested in, because they aren't normalizable.)

There is only one escape from this dilemma: The series must terminate. There must occur some integer $N$ such that

$$
c_{N-1} \neq 0 \quad \text{but} \quad c_N = 0 \tag{4.66}
$$

(beyond this all coefficients vanish automatically). $^{18}$ In that case Equation 4.63 says

$$
2(N + \ell) - \rho_0 = 0.
$$

Defining

$$
n \equiv N + \ell, \tag{4.67}
$$

we have

$$
\rho_0 = 2n. \tag{4.68}
$$

But $\rho_0$ determines $E$ (Equations 4.54 and 4.55):

$$
E = -\frac{\hbar^2 \kappa^2}{2m} = -\frac{m_e e^4}{8\pi^2 \epsilon_0^2 \hbar^2 \rho_0^2}, \tag{4.69}
$$

so the allowed energies are

$$
E_n = -\left[\frac{m_e}{2\hbar^2} \left(\frac{e^2}{4\pi \epsilon_0}\right)^2\right] \frac{1}{n^2} = \frac{E_1}{n^2}, \quad n = 1, 2, 3, \dots. \tag{4.70}
$$

This is the famous Bohr formula—by any measure the most important result in all of quantum mechanics. Bohr obtained it in 1913 by a serendipitous mixture of inapplicable classical physics and premature quantum theory (the Schrödinger equation did not come until 1926).

Combining Equations 4.55 and 4.68, we find that

$$
\kappa = \left(\frac {m _ {e} e ^ {2}}{4 \pi \epsilon_ {0} \hbar^ {2}}\right) \frac {1}{n} = \frac {1}{a n}, \tag {4.71}
$$

where

$$
a \equiv \frac {4 \pi \epsilon_ {0} \hbar^ {2}}{m _ {e} e ^ {2}} = 0. 5 2 9 \times 1 0 ^ {- 1 0} \mathrm {m} \tag {4.72}
$$

is the so-called Bohr radius. $^{19}$  It follows (again, from Equation 4.55) that

$$
\rho = \frac {r}{a n}. \tag {4.73}
$$

The spatial wave functions are labeled by three quantum numbers  $(n,\xi ,$  and  $m)$  :20

$$
\psi_ {n \ell m} (r, \theta , \phi) = R _ {n \ell} (r) Y _ {\ell} ^ {m} (\theta , \phi), \tag {4.74}
$$

where (referring back to Equations 4.36 and 4.60)

$$
R _ {n \ell} (r) = \frac {1}{r} \rho^ {\ell + 1} e ^ {- \rho} v (\rho), \tag {4.75}
$$

and  $v(\rho)$  is a polynomial of degree  $n - \ell - 1$  in  $\mathfrak{p}$ , whose coefficients are determined (up to an overall normalization factor) by the recursion formula

$$
c _ {j + 1} = \frac {2 (j + \ell + 1 - n)}{(j + 1) (j + 2 \ell + 2)} c _ {j}. \tag {4.76}
$$

The ground state (that is, the state of lowest energy) is the case  $n = 1$ ; putting in the accepted values for the physical constants, we get:21

$$
E _ {1} = - \left[ \frac {m _ {e}}{2 \hbar^ {2}} \left(\frac {e ^ {2}}{4 \pi \epsilon_ {0}}\right) ^ {2} \right] = - 1 3. 6 \mathrm {e V}. \tag {4.77}
$$

In other words, the binding energy of hydrogen (the amount of energy you would have to impart to the electron in its ground state in order to ionize the atom) is  $13.6\mathrm{eV}$ . Equation 4.67 forces  $\xi = 0$ , whence also  $m = 0$  (see Equation 4.29), so

$$
\psi_ {1 0 0} (r, \theta , \phi) = R _ {1 0} (r) Y _ {0} ^ {0} (\theta , \phi). \tag {4.78}
$$

The recursion formula truncates after the first term (Equation 4.76 with  $j = 0$  yields  $c_{1} = 0$ ), so  $v(\rho)$  is a constant  $(c_{0})$ , and

$$
R _ {1 0} (r) = \frac {c _ {0}}{a} e ^ {- r / a}. \tag {4.79}
$$

Normalizing it, in accordance with Equation 4.31:

$$
\int_{0}^{\infty} |R_{10}|^{2} r^{2} dr = \frac{|c_{0}|^{2}}{a^{2}} \int_{0}^{\infty} e^{-2r/a} r^{2} dr = |c_{0}|^{2} \frac{a}{4} = 1,
$$

so $c_{0} = 2 / \sqrt{a}$. Meanwhile, $Y_{0}^{0} = 1 / \sqrt{4\pi}$, and hence the ground state of hydrogen is

$$
\psi_{100}(r, \theta, \phi) = \frac{1}{\sqrt{\pi a^{3}}} e^{-r/a}. \tag{4.80}
$$

If $n = 2$ the energy is

$$
E_{2} = \frac{-13.6 \, \mathrm{eV}}{4} = -3.40 \, \mathrm{eV}; \tag{4.81}
$$

this is the first excited state—or rather, states, since we can have either $\ell = 0$ (in which case $m = 0$) or $\ell = 1$ (with $m = -1$, 0, or +1); evidently four different states share this same energy. If $\ell = 0$, the recursion relation (Equation 4.76) gives

$$
c_{1} = -c_{0} \text{ (using } j = 0\text{), \quad and } c_{2} = 0 \text{ (using } j = 1\text{),}
$$

so $v(\rho) = c_{0}(1 - \rho)$, and therefore

$$
R_{20}(r) = \frac{c_{0}}{2a} \left(1 - \frac{r}{2a}\right) e^{-r/2a}. \tag{4.82}
$$

(Notice that the expansion coefficients $(c_j)$ are completely different for different quantum numbers $n$ and $\ell$.) If $\ell = 1$ the recursion formula terminates the series after a single term; $v(\rho)$ is a constant, and we find

$$
R_{21}(r) = \frac{c_{0}}{4a^{2}} r e^{-r/2a}. \tag{4.83}
$$

(In each case the constant $c_{0}$ is to be determined by normalization—see Problem 4.13.)

For arbitrary $n$, the possible values of $\ell$ (consistent with Equation 4.67) are

$$
\ell = 0, 1, 2, \dots, n - 1, \tag{4.84}
$$

and for each $\ell$ there are $(2\ell + 1)$ possible values of $m$ (Equation 4.29), so the total degeneracy of the energy level $E_n$ is

$$
d(n) = \sum_{\ell=0}^{n-1} (2\ell + 1) = n^{2}. \tag{4.85}
$$

In Figure 4.6 I plot the energy levels for hydrogen. Notice that different values of $\ell$ carry the same energy (for a given $n$)—contrast the infinite spherical well, Figure 4.3. (With Equation 4.67, $\ell$ dropped out of sight, in the derivation of the allowed energies, though it does still affect the wave functions.) This is what gives rise to the "extra" degeneracy of the Coulomb potential, as compared to what you would expect from spherical symmetry alone ($n^{2} = 1, 4, 9, 16, \ldots$, as opposed to $(2\ell + 1) = 1, 3, 5, 7, \ldots$).

![img-62.jpeg](img-62.jpeg)
Figure 4.6: Energy levels for hydrogen (Equation 4.70);  $n = 1$  is the ground state, with  $E_{1} = -13.6\mathrm{eV}$ ; an infinite number of states are squeezed in between  $n = 5$  and  $n = \infty$ ;  $E_{\infty} = 0$  separates the bound states from the scattering states. Compare Figure 4.3, and note the extra ("accidental") degeneracy of the hydrogen energies.

The polynomial  $v(\rho)$  (defined by the recursion formula, Equation 4.76) is a function well known to apply mathematicians; apart from normalization, it can be written as

$$
v (\rho) = L _ {n - \ell - 1} ^ {2 \ell + 1} (2 \rho), \tag {4.86}
$$

where

$$
L _ {q} ^ {p} (x) \equiv (- 1) ^ {p} \left(\frac {d}{d x}\right) ^ {p} L _ {p + q} (x) \tag {4.87}
$$

is an associated Laguerre polynomial, and

$$
L _ {q} (x) \equiv \frac {e ^ {x}}{q !} \left(\frac {d}{d x}\right) ^ {q} \left(e ^ {- x} x ^ {q}\right) \tag {4.88}
$$

is the  $q$ th Laguerre polynomial. $^{22}$  The first few Laguerre polynomials are listed in Table 4.5; some associated Laguerre polynomials are given in Table 4.6. The first few radial wave functions are listed in Table 4.7, and plotted in Figure 4.7.) The normalized hydrogen wave functions are $^{23}$

$$
\psi_ {n \ell m} = \sqrt {\left(\frac {2}{n a}\right) ^ {3} \frac {(n - \ell - 1) !}{2 n (n + \ell) !}} e ^ {- r / n a} \left(\frac {2 r}{n a}\right) ^ {\ell} \left[ L _ {n - \ell - 1} ^ {2 \ell + 1} (2 r / n a) \right] Y _ {\ell} ^ {m} (\theta , \phi). \tag {4.89}
$$

They are not pretty, but don't complain—this is one of the very few realistic systems that can be solved at all, in exact closed form. The wave functions are mutually orthogonal:

$$
\int \psi_ {n \ell m} ^ {*} \psi_ {n ^ {\prime} \ell^ {\prime} m ^ {\prime}} r ^ {2} d r d \Omega = \delta_ {n n ^ {\prime}} \delta_ {\ell \ell^ {\prime}} \delta_ {m m ^ {\prime}}. \tag {4.90}
$$

This follows from the orthogonality of the spherical harmonics (Equation 4.33) and (for  $n \neq n'$ ) from the fact that they are eigenfunctions of  $\hat{H}$  with distinct eigenvalues.

Table 4.5: The first few Laguerre polynomials.

|  L0(x) | = | 1  |
| --- | --- | --- |
|  L1(x) | = | -x+1  |
|  L2(x) | = | 1/2x2-2x+1  |
|  L3(x) | = | -1/6x3+3/2x2-3x+1  |
|  L4(x) | = | 1/24x4-5/3x3+3x2-4x+1  |
|  L5(x) | = | -1/120x5+5/24x4-5/3x3+5x2-5x+1  |
|  L6(x) | = | 1/720x6-1/20x5+5/8x4-10/3x3+15/2x2-6x+1  |

Table 4.6: Some associated Laguerre polynomials.

|  L0(0)(x) | = | 1 | L0(2)(x) | = | 1  |
| --- | --- | --- | --- | --- | --- |
|  L1(0)(x) | = | -x+1 | L1(2)(x) | = | -x+3  |
|  L2(0)(x) | = | 1/2x2-2x+1 | L2(2)(x) | = | 1/2x2-4x+6  |
|  L0(1)(x) | = | 1 | L0(3)(x) | = | 1  |
|  L1(1)(x) | = | -x+2 | L1(3)(x) | = | -x+4  |
|  L2(1)(x) | = | 1/2x2-3x+3 | L2(3)(x) | = | 1/2x2-5x+10  |

Table 4.7: The first few radial wave functions for hydrogen,  $R_{n\ell}(r)$ .

|  R10=2a-3/2 exp(-r/a)  |
| --- |
|  R20=1/√2a-3/2(1-1/r/2a) exp(-r/2a)  |
|  R21=1/2√6a-3/2(r/a) exp(-r/2a)  |
|  R30=2/3√3a-3/2(1-2/r/3a+2/27(r/a)2) exp(-r/3a)  |
|  R31=8/27√6a-3/2(1-1/r/6a)(r/a) exp(-r/3a)  |
|  R32=4/81√30a-3/2(r/a)2 exp(-r/3a)  |
|  R40=1/4a-3/2(1-3/r/4a+1/8(r/a)2-1/192(r/a)3) exp(-r/4a)  |
|  R41=5/16√15a-3/2(1-1/r/4a+1/80(r/a)2)(r/a) exp(-r/4a)  |
|  R42=1/64√5a-3/2(1-1/r/12r/a)(r/a)2 exp(-r/4a)  |
|  R43=1/768√35a-3/2(r/a)3 exp(-r/4a)  |

![img-63.jpeg](img-63.jpeg)
Figure 4.7: Graphs of the first few hydrogen radial wave functions,  $R_{n\ell}(r)$ .

Visualizing the hydrogen wave functions is not easy. Chemists like to draw density plots, in which the brightness of the cloud is proportional to  $|\psi|^2$  (Figure 4.8). More quantitative (but perhaps harder to decipher) are surfaces of constant probability density (Figure 4.9). The quantum numbers  $n$ ,  $\ell$ , and  $m$  can be identified from the nodes of the wave function. The number of radial nodes is, as always, given by  $N - 1$  (for hydrogen this is  $n - \ell - 1$ ). For each radial node the wave function vanishes on a sphere, as can be seen in Figure 4.8. The quantum number  $m$  counts the number of nodes of the real (or imaginary) part of the wave function in the  $\phi$  direction. These nodes are planes containing the  $z$  axis on which the real or imaginary part of  $\psi$  vanishes.[23] Finally,  $\ell - m$  gives the number of nodes in the  $\theta$  direction. These are cones about the  $z$  axis on which  $\psi$  vanishes (note that a cone with opening angle  $\pi / 2$  is the  $x = y$  plane itself).

![img-64.jpeg](img-64.jpeg)
(2,0,0)

![img-65.jpeg](img-65.jpeg)
(3,1,0)

![img-66.jpeg](img-66.jpeg)
(4,0,0)

![img-67.jpeg](img-67.jpeg)
(4,1,0)

![img-68.jpeg](img-68.jpeg)
(4,2,0)

![img-69.jpeg](img-69.jpeg)
(4,3,0)
Figure 4.8: Density plots for the first few hydrogen wave functions, labeled by  $(n,\ell,m)$ . Printed by permission using "Atom in a Box" by Dauger Research. You can make your own plots by going to: http://dauger.com.

![img-70.jpeg](img-70.jpeg)

![img-71.jpeg](img-71.jpeg)

![img-72.jpeg](img-72.jpeg)

![img-73.jpeg](img-73.jpeg)

![img-74.jpeg](img-74.jpeg)

![img-75.jpeg](img-75.jpeg)

![img-76.jpeg](img-76.jpeg)
Figure 4.9: Shaded regions indicate significant electron density  $\langle |\psi|^2 &gt; 0.25 / \mathrm{nm}^3\rangle$  for the first few hydrogen wave functions. The region  $0 &lt; \phi &lt; \pi / 2$  has been cut away;  $|\psi|^2$  has azimuthal symmetry in all cases.

![img-77.jpeg](img-77.jpeg)

![img-78.jpeg](img-78.jpeg)

Problem 4.12 Work out the radial wave functions  $R_{30}, R_{31}$ , and  $R_{32}$ , using the recursion formula (Equation 4.76). Don't bother to normalize them.

Problem 4.13

(a)Normalize  $R_{20}$  (Equation 4.82), and construct the function  $\psi_{200}$
(b)Normalize  $R_{21}$  (Equation 4.83), and construct  $\psi_{211},\psi_{210}$  ,and  $\psi_{21 - 1}$

Problem 4.14

(a) Using Equation 4.88, work out the first four Laguerre polynomials.
(b) Using Equations 4.86, 4.87, and 4.88, find  $v(\rho)$ , for the case  $n = 5$ ,  $\ell = 2$ .
(c) Find  $v(\rho)$  again (for the case  $n = 5, \ell = 2$ ), but this time gets it from the recursion formula (Equation 4.76).

# Problem 4.15

(a) Find  $\langle r\rangle$  and  $\langle r^2\rangle$  for an electron in the ground state of hydrogen. Express your answers in terms of the Bohr radius.
(b) Find  $\langle x\rangle$  and  $\langle x^2\rangle$  for an electron in the ground state of hydrogen. Hint: This requires no new integration—note that  $r^2 = x^2 +y^2 +z^2$ , and exploit the symmetry of the ground state.
(c) Find  $\langle x^2\rangle$  in the state  $n = 2,\ell = 1,m = 1$  . Hint: this state is not symmetrical in  $x,y,z$  . Use  $x = r\sin \theta \cos \phi$

Problem 4.16 What is the most probable value of  $r$ , in the ground state of hydrogen? (The answer is not zero!) Hint: First you must figure out the probability that the electron would be found between  $r$  and  $r + dr$ .

Problem 4.17 Calculate  $\left\langle z\hat{H} z\right\rangle$  in the ground state of hydrogen. Hint: This takes two pages and six integrals, or four lines and no integrals, depending on how you set it up. To do it the quick way, start by noting that  $[z,[H,z]] = 2zHz - Hz^2 -z^2 H$ .

Problem 4.18 A hydrogen atom starts out in the following linear combination of the stationary states  $n = 2, \ell = 1, m = 1$  and  $n = 2, \ell = 1, m = -1$ :

$$
\Psi (\mathbf {r}, 0) = \frac {1}{\sqrt {2}} \left(\psi_ {2 1 1} + \psi_ {2 1 - 1}\right).
$$

(a) Construct  $\Psi (\mathbf{r},t)$ . Simplify it as much as you can.
(b) Find the expectation value of the potential energy,  $\langle V\rangle$ . (Does it depend on  $t$ ?) Give both the formula and the actual number, in electron volts.

198

## 4.2.2 The Spectrum of Hydrogen

In principle, if you put a hydrogen atom into some stationary state $\Psi_{n\ell m}$, it should stay there forever. However, if you tickle it slightly (by collision with another atom, say, or by shining light on it), the atom may undergo a transition to some other stationary state—either by absorbing energy, and moving up to a higher-energy state, or by giving off energy (typically in the form of electromagnetic radiation), and moving down.²⁶ In practice such perturbations are always present; transitions (or, as they are sometimes called, quantum jumps) are constantly occurring, and the result is that a container of hydrogen gives off light (photons), whose energy corresponds to the difference in energy between the initial and final states:

$$
E_{\gamma} = E_{i} - E_{f} = -13.6\mathrm{eV} \left(\frac{1}{n_{i}^{2}} - \frac{1}{n_{f}^{2}}\right). \tag{4.91}
$$

Now, according to the Planck formula,²⁷ the energy of a photon is proportional to its frequency:

$$
E_{\gamma} = h\nu. \tag{4.92}
$$

Meanwhile, the wavelength is given by $\lambda = c / \nu$, so

$$
\frac{1}{\lambda} = \mathcal{R} \left(\frac{1}{n_{f}^{2}} - \frac{1}{n_{i}^{2}}\right), \tag{4.93}
$$

where

$$
\mathcal{R} \equiv \frac{m_{e}}{4\pi c h^{3}} \left(\frac{e^{2}}{4\pi\epsilon_{0}}\right)^{2} = 1.097 \times 10^{7} \mathrm{m}^{-1} \tag{4.94}
$$

is known as the Rydberg constant. Equation 4.93 is the Rydberg formula for the spectrum of hydrogen; it was discovered empirically in the nineteenth century, and the greatest triumph of Bohr's theory was its ability to account for this result—and to calculate $\mathcal{R}$ in terms of the fundamental constants of nature. Transitions to the ground state $(n_f = 1)$ lie in the ultraviolet; they are known to spectroscopists as the Lyman series. Transitions to the first excited state $(n_f = 2)$ fall in the visible region; they constitute the Balmer series. Transitions to $n_f = 3$ (the Paschen series) are in the infrared; and so on (see Figure 4.10). (At room temperature, most hydrogen atoms are in the ground state; to obtain the emission spectrum you must first populate the various excited states; typically this is done by passing an electric spark through the gas.)

![img-79.jpeg](img-79.jpeg)
Figure 4.10: Energy levels and transitions in the spectrum of hydrogen.

Problem 4.19 A hydrogenic atom consists of a single electron orbiting a nucleus with  $Z$  protons. ( $Z = 1$  would be hydrogen itself,  $Z = 2$  is ionized helium,  $Z = 3$  is doubly ionized lithium, and so on.) Determine the Bohr energies  $E_{n}(Z)$ , the binding energy  $E_{1}(Z)$ , the Bohr radius  $a(Z)$ , and the Rydberg constant  $\mathcal{R}(Z)$  for a hydrogenic atom. (Express your answers as appropriate multiples of the hydrogen values.) Where in the electromagnetic spectrum would the Lyman series fall, for  $Z = 2$  and  $Z = \Re$  Hint: There's nothing much to calculate here—in the potential (Equation 4.52)  $e^{2} \rightarrow Ze^{2}$ , so all you have to do is make the same substitution in all the final results.

Problem 4.20 Consider the earth-sun system as a gravitational analog to the hydrogen atom.

(a) What is the potential energy function (replacing Equation 4.52)? (Let  $m_E$  be the mass of the earth, and  $M$  the mass of the sun.)
(b) What is the "Bohr radius,"  $a_{g}$ , for this system? Work out the actual number.
(c) Write down the gravitational "Bohr formula," and, by equating  $E_{n}$  to the classical energy of a planet in a circular orbit of radius  $r_{o}$ , show that  $n = \sqrt{r_o / a_g}$ . From this, estimate the quantum number  $n$  of the earth.
(d) Suppose the earth made a transition to the next lower level  $(n - 1)$ . How much energy (in Joules) would be released? What would the wavelength of the emitted photon (or, more likely, graviton) be? (Express your answer in light years—is the remarkable answer $^{28}$  a coincidence?)

200

201

# 4.3 Angular Momentum

As we have seen, the stationary states of the hydrogen atom are labeled by three quantum numbers: $n$, $\xi$, and $m$. The principal quantum number $(n)$ determines the energy of the state (Equation 4.70); $\xi$ and $m$ are related to the orbital angular momentum. In the classical theory of central forces, energy and angular momentum are the fundamental conserved quantities, and it is not surprising that angular momentum plays an important role in the quantum theory.

Classically, the angular momentum of a particle (with respect to the origin) is given by the formula

$$
\mathbf{L} = \mathbf{r} \times \mathbf{p}, \tag{4.95}
$$

which is to say, $^{29}$

$$
L_x = y p_z - z p_y, \quad L_y = z p_x - x p_z, \quad L_z = x p_y - y p_x. \tag{4.96}
$$

The corresponding quantum operators $^{20}$ are obtained by the standard prescription $p_x \rightarrow -i\hbar \partial/\partial x$, $p_y \rightarrow -i\hbar \partial/\partial y$, $p_z \rightarrow -i\hbar \partial/\partial z$. In this section we'll obtain the eigenvalues of the angular momentum operators by a purely algebraic technique reminiscent of the one we used in Chapter 2 to get the allowed energies of the harmonic oscillator; it is all based on the clever exploitation of commutation relations. After that we will turn to the more difficult problem of determining the eigenfunctions.

202

## 4.3.1 Eigenvalues

The operators $L_{x}$ and $L_{y}$ do not commute; in fact

$$
\begin{aligned}
\left[ L _ {x}, L _ {y} \right] &amp;= \left[ y p _ {z} - z p _ {y}, z p _ {x} - x p _ {z} \right] \tag {4.97} \\
&amp;= \left[ y p _ {z}, z p _ {x} \right] - \left[ y p _ {z}, x p _ {z} \right] - \left[ z p _ {y}, z p _ {x} \right] + \left[ z p _ {y}, x p _ {z} \right].
\end{aligned}
$$

From the canonical commutation relations (Equation 4.10) we know that the only operators here that fail to commute are $x$ with $p_x, y$ with $p_y$, and $z$ with $p_z$. So the two middle terms drop out, leaving

$$
\left[ L _ {x}, L _ {y} \right] = y p _ {x} \left[ p _ {z}, z \right] + x p _ {y} \left[ z, p _ {z} \right] = i \hbar \left(x p _ {y} - y p _ {x}\right) = i \hbar L _ {z}. \tag {4.98}
$$

Of course, we could have started out with $\left[L_y,L_z\right]$ or $\left[L_z,L_x\right]$, but there is no need to calculate these separately—we can get them immediately by cyclic permutation of the indices $(x\to y,y\to z,z\to x)$:

$$
\left[ L _ {x}, L _ {y} \right] = i \hbar L _ {z}; \quad \left[ L _ {y}, L _ {z} \right] = i \hbar L _ {x}; \quad \left[ L _ {z}, L _ {x} \right] = i \hbar L _ {y}. \tag {4.99}
$$

These are the fundamental commutation relations for angular momentum; everything follows from them.

Notice that $L_{x}, L_{y}$, and $L_{z}$ are incompatible observables. According to the generalized uncertainty principle (Equation 3.62),

$$
\sigma_ {L _ {x}} ^ {2} \sigma_ {L _ {y}} ^ {2} \geq \left(\frac {1}{2 i} (i \hbar L _ {z})\right) ^ {2} = \frac {\hbar^ {2}}{4} (L _ {z}) ^ {2},
$$

or

$$
\sigma_ {L _ {x}} \sigma_ {L _ {y}} \geq \frac {\hbar}{2} | \langle L _ {z} \rangle |. \tag {4.100}
$$

It would therefore be futile to look for states that are simultaneously eigenfunctions of $L_{x}$ and $L_{y}$. On the other hand, the square of the total angular momentum,

$$
L ^ {2} \equiv L _ {x} ^ {2} + L _ {y} ^ {2} + L _ {z} ^ {2}, \tag {4.101}
$$

does commute with $L_{x}$:

$$
\begin{aligned}
\left[ L ^ {2}, L _ {x} \right] &amp;= \left[ L _ {x} ^ {2}, L _ {x} \right] + \left[ L _ {y} ^ {2}, L _ {x} \right] + \left[ L _ {z} ^ {2}, L _ {x} \right] \\
&amp;= L _ {y} \left[ L _ {y}, L _ {x} \right] + \left[ L _ {y}, L _ {x} \right] L _ {y} + L _ {z} \left[ L _ {z}, L _ {x} \right] + \left[ L _ {z}, L _ {x} \right] L _ {z} \\
&amp;= L _ {y} \left(- i \hbar L _ {z}\right) + \left(- i \hbar L _ {z}\right) L _ {y} + L _ {z} \left(i \hbar L _ {y}\right) + \left(i \hbar L _ {y}\right) L _ {z} \\
&amp;= 0.
\end{aligned}
$$

(I used Equation 3.65 to reduce the commutators; of course, any operator commutes with itself.) It follows that $L^2$ also commutes with $L_y$ and $L_z$:

$$
\left[ L ^ {2}, L _ {x} \right] = 0, \quad \left[ L ^ {2}, L _ {y} \right] = 0, \quad \left[ L ^ {2}, L _ {z} \right] = 0, \tag {4.102}
$$

or, more compactly,

$$
\left[ L ^ {2}, \mathbf {L} \right] = 0, \tag {4.103}
$$

So $\underline{L}^2$ is compatible with each component of $\mathbf{L}$, and we can hope to find simultaneous eigenstates of $\underline{L}^2$ and (say) $\underline{L}_z$:

$$
L^2 f = \lambda f \quad \text{and} \quad L_z f = \mu f. \tag{4.104}
$$

We'll use a ladder operator technique, very similar to the one we applied to the harmonic oscillator back in Section 2.3.1. Let

$$
L_\pm \equiv L_x \pm i L_y. \tag{4.105}
$$

Its commutator with $L_z$ is

$$
\left[ L_z, L_\pm \right] = \left[ L_z, L_x \right] \pm i \left[ L_z, L_y \right] = i \hbar L_y \pm i (-i \hbar L_x) = \pm \hbar \left( L_x \pm i L_y \right),
$$

so

$$
\left[ L_z, L_\pm \right] = \pm \hbar L_\pm. \tag{4.106}
$$

Also (from Equation 4.102)

$$
\left[ L^2, L_\pm \right] = 0. \tag{4.107}
$$

I claim that if $f$ is an eigenfunction of $\underline{L}^2$ and $L_z$, so also is $L_\pm f$: Equation 4.107 says

$$
L^2 (L_\pm f) = L_\pm \left( L^2 f \right) = L_\pm (\lambda f) = \lambda (L_\pm f), \tag{4.108}
$$

so $L_\pm f$ is an eigenfunction of $\underline{L}^2$, with the same eigenvalue $\lambda$, and Equation 4.106 says

$$
\begin{array}{l}
L_z (L_\pm f) = \left( L_z L_\pm - L_\pm L_z \right) f + L_\pm L_z f = \pm \hbar L_\pm f + L_\pm (\mu f) \tag{4.109} \\
= (\mu \pm \hbar) (L_\pm f),
\end{array}
$$

so $L_\pm f$ is an eigenfunction of $L_z$ with the new eigenvalue $\mu \pm \hbar$. We call $L_+$ the raising operator, because it increases the eigenvalue of $L_z$ by $\hbar$, and $L_-$ the lowering operator, because it lowers the eigenvalue by $\hbar$.

For a given value of $\lambda$, then, we obtain a "ladder" of states, with each "rung" separated from its neighbors by one unit of $\hbar$ in the eigenvalue of $L_z$ (see Figure 4.11). To ascend the ladder we apply the raising operator, and to descend, the lowering operator. But this process cannot go on forever: Eventually we're going to reach a state for which the $z$-component exceeds the total, and that cannot be.[31] There must exist a "top rung", $f_t$, such that[32]

$$
L_+ f_t = 0. \tag{4.110}
$$

Let $\hbar \ell$ be the eigenvalue of $L_z$ at the top rung (the appropriateness of the letter "$\ell$" will appear in a moment):

$$
L_z f_t = \hbar \ell f_t; \quad L^2 f_t = \lambda f_t. \tag{4.111}
$$

Now,

$$
\begin{array}{l}
L_\pm L_\mp = \left( L_x \pm i L_y \right) \left( L_x \mp i L_y \right) = L_x^2 + L_y^2 \mp i \left( L_x L_y - L_y L_x \right) \\
= L^2 - L_z^2 \mp i (i \hbar L_z),
\end{array}
$$

or, putting it the other way around,

203

$$
L ^ {2} = L _ {\pm} L _ {\mp} + L _ {z} ^ {2} \mp \hbar L _ {z}. \tag {4.112}
$$

It follows that

$$
L ^ {2} f _ {t} = \left(L _ {-} L _ {+} + L _ {z} ^ {2} + \hbar L _ {z}\right) f _ {t} = \left(0 + \hbar^ {2} \ell^ {2} + \hbar^ {2} \ell\right) f _ {t} = \hbar^ {2} \ell (\ell + 1) f _ {t},
$$

and hence

$$
\lambda = \hbar^ {2} \ell (\ell + 1). \tag {4.113}
$$

This tells us the eigenvalue of  $L^2$  in terms of the maximum eigenvalue of  $L_{z}$ .

![img-80.jpeg](img-80.jpeg)
Figure 4.11: The "ladder" of angular momentum states.

Meanwhile, there is also (for the same reason) a bottom rung,  $f_{b}$ , such that

$$
L _ {-} f _ {b} = 0. \tag {4.114}
$$

Let  $\hbar \vec{\ell}$  be the eigenvalue of  $L_{z}$  at this bottom rung:

$$
L _ {z} f _ {b} = \hbar \vec {\ell} f _ {b}; \quad L ^ {2} f _ {b} = \lambda f _ {b}. \tag {4.115}
$$

Using Equation 4.112, we have

$$
L ^ {2} f _ {b} = \left(L _ {+} L _ {-} + L _ {z} ^ {2} - \hbar L _ {z}\right) f _ {b} = \left(0 + \hbar^ {2} \bar {\ell} ^ {2} - \hbar^ {2} \bar {\ell}\right) f _ {b} = \hbar^ {2} \bar {\ell} (\bar {\ell} - 1) f _ {b},
$$

and therefore

$$
\lambda = \hbar^ {2} \bar {\ell} (\bar {\ell} - 1). \tag {4.116}
$$

Comparing Equations 4.113 and 4.116, we see that  $\ell (\ell +1) = \bar{\ell} (\bar{\ell} -1)$ , so either  $\bar{\ell} = \ell +1$  (which is absurd—the bottom rung would be higher than the top rung!) or else

$$
\bar {\ell} = - \ell . \tag {4.117}
$$

So the eigenvalues of  $L_{z}$  are  $m\hbar$ , where  $m$  (the appropriateness of this letter will also be clear in a moment) goes from  $-\ell$  to  $+\ell$ , in  $N$  integer steps. In particular, it follows that  $\ell = -\ell + N$ , and hence  $\ell = N / 2$ , so  $\ell$  must be an integer or a half-integer. The eigenfunctions are characterized by the numbers  $\ell$  and  $m$ :

$$
L ^ {2} f _ {\ell} ^ {m} = \hbar^ {2} \ell (\ell + 1) f _ {\ell} ^ {m}; \quad L _ {z} f _ {\ell} ^ {m} = \hbar m f _ {\ell} ^ {m}, \tag {4.118}
$$

where

$$
\ell = 0, 1 / 2, 1, 3 / 2, \dots ; \quad m = - \ell , - \ell + 1, \dots , \ell - 1, \ell . \tag {4.119}
$$

For a given value of  $\ell$ , there are  $2\ell + 1$  different values of  $m$  (i.e.  $2\ell + 1$  "rungs" on the "ladder").

Some people like to illustrate this with the diagram in Figure 4.12 (drawn for the case  $\ell = 2$ ). The arrows are supposed to represent possible angular momenta (in units of  $\hbar$ )—they all have the same length  $\sqrt{\ell(\ell + 1)}$  (in this case  $\sqrt{6} = 2.45$ ), and their  $z$  components are the allowed values of  $m(-2, -1, 0, 1, 2)$ . Notice that the magnitude of the vectors (the radius of the sphere) is greater than the maximum  $z$  component! (In general,  $\sqrt{\ell(\ell + 1)} &gt; \ell$ , except for the "trivial" case  $\ell = 0$ .) Evidently you can't get the angular momentum to point perfectly along the  $z$  direction. At first, this sounds absurd. "Why can't I just pick my axes so that  $z$  points along the direction of the angular momentum vector?" Well, to do that you would have to know all three components simultaneously, and the uncertainty principle (Equation 4.100) says that's impossible. "Well, all right, but surely once in a while, by good fortune, I will just happen to aim my  $z$  axis along the direction of  $\mathbf{L}$ ." No, no! You have missed the point. It's not merely that you don't know all three components of  $\mathbf{L}$ ; there just aren't three components—a particle simply cannot have a determinate angular momentum vector, any more than it can simultaneously have a determinate position and momentum. If  $L_z$  has a well-defined value, then  $L_x$  and  $L_y$  do not. It is misleading even to draw the vectors in Figure 4.12—at best they should be smeared out around the latitude lines, to indicate that  $L_x$  and  $L_y$  are indeterminate.

205

![img-81.jpeg](img-81.jpeg)
Figure 4.12: Angular momentum states (for  $\ell = 2$ ).

I hope you're impressed: By purely algebraic means, starting with the fundamental commutation relations for angular momentum (Equation 4.99), we have determined the eigenvalues of  $L^2$  and  $L_z$  without ever seeing the eigenfunctions themselves! We turn now to the problem of constructing the eigenfunctions, but I should warn you that this is a much messier business. Just so you know where we're headed, I'll let you in on the punch line:  $f_{\ell}^{m} = Y_{\ell}^{m}$  the eigenfunctions of  $L^2$  and  $L_z$  are nothing but the old spherical harmonics, which we came upon by a quite different route in Section 4.1.2 (that's why I chose the same letters  $\ell$  and  $m$ , of course). And I can now explain why the spherical harmonics are orthogonal: They are eigenfunctions of hermitian operators  $\left(L^2 \text{ and } L_z\right)$  belonging to distinct eigenvalues (Theorem 2, Section 3.3.1).

Problem 4.21 The raising and lowering operators change the value of  $m$  by one unit:

$$
L _ {+} f _ {\ell} ^ {m} = \left(A _ {\ell} ^ {m}\right) f _ {\ell} ^ {m + 1}, \quad L _ {-} f _ {\ell} ^ {m} = \left(B _ {\ell} ^ {m}\right) f _ {\ell} ^ {m - 1} \tag {4.120}
$$

where  $A_{\ell}^{m}$  and  $B_{\ell}^{m}$  are constants. Question: What are they, if the eigenfunctions are to be normalized? Hint: First show that  $L_{\mp}$  is the hermitian conjugate of  $L_{\pm}$  (since  $L_{x}$  and  $L_{y}$  are observables, you may assume they are hermitian...but prove it if you like); then use Equation 4.112. Answer:

$$
A _ {\ell} ^ {m} = \hbar \sqrt {\ell (\ell + 1) - m (m + 1)} = \hbar \sqrt {(\ell - m) (\ell + m + 1)}, \tag {4.121}
$$

$$
B _ {\ell} ^ {m} = \hbar \sqrt {\ell (\ell + 1) - m (m - 1)} = \hbar \sqrt {(\ell + m) (\ell - m + 1)}.
$$

Note what happens at the top and bottom of the ladder (i.e. when you apply  $L_{+}$  to  $f_{\ell}^{\ell}$  or  $L_{-}$  to  $f_{\ell}^{-\ell}$ ).

Problem 4.22

(a) Starting with the canonical commutation relations for position and momentum (Equation 4.10), work out the following commutators:

$$
\left[ L _ {z}, x \right] = i \hbar y, \quad \left[ L _ {z}, y \right] = - i \hbar x, \quad \left[ L _ {z}, z \right] = 0 \tag {4.122}
$$

$$
\left[ L _ {z}, p _ {x} \right] = i \hbar p _ {y}, \quad \left[ L _ {z}, p _ {y} \right] = - i \hbar p _ {x}, \quad \left[ L _ {z}, p _ {z} \right] = 0.
$$

(b) Use these results to obtain  $\left[L_z, L_x\right] = i\hbar L_y$  directly from Equation 4.96.
(c) Find the commutators  $\left[L_z, r^2\right]$  and  $\left[L_z, p^2\right]$  (where, of course,  $r^2 = x^2 + y^2 + z^2$  and  $p^2 = p_x^2 + p_y^2 + p_z^2$ ).
(d) Show that the Hamiltonian  $H = \left(p^{2} / 2m\right) + V$  commutes with all three components of  $\mathbf{L}$ , provided that  $V$  depends only on  $r$ . (Thus  $H, L^{2}$ , and  $L_{z}$  are mutually compatible observables.)

# Problem 4.23

(a) Prove that for a particle in a potential  $V(\mathbf{r})$  the rate of change of the expectation value of the orbital angular momentum  $\mathbf{L}$  is equal to the expectation value of the torque:

$$
\frac {d}{d t} \left\langle \mathbf {L} \right\rangle = \left\langle \mathbf {N} \right\rangle ,
$$

where

$$
\mathbf {N} = \mathbf {r} \times (- \nabla V).
$$

(Thisis the rotational analog to Ehrenfest's theorem.)

(b) Show that  $d\langle \mathbf{L}\rangle /dt = 0$  for any spherically symmetric potential. (This is one form of the quantum statement of conservation of angular momentum.)

208

## 4.3.2 Eigenfunctions

First of all we need to rewrite $L_x, L_y$, and $L_z$ in spherical coordinates. Now, $\mathbf{L} = -i\hbar (\mathbf{r} \times \nabla)$, and the gradient, in spherical coordinates, is: $^{13}$

$$
\nabla = \hat{r} \frac{\partial}{\partial r} + \hat{\theta} \frac{1}{r} \frac{\partial}{\partial \theta} + \hat{\phi} \frac{1}{r \sin \theta} \frac{\partial}{\partial \phi}; \tag{4.123}
$$

meanwhile, $\mathbf{r} = r\hat{r}$, so

$$
\mathbf{L} = -i\hbar \left[ r \left(\hat{r} \times \hat{r}\right) \frac{\partial}{\partial r} + \left(\hat{r} \times \hat{\theta}\right) \frac{\partial}{\partial \theta} + \left(\hat{r} \times \hat{\phi}\right) \frac{1}{\sin \theta} \frac{\partial}{\partial \phi} \right].
$$

But $\left(\hat{r} \times \hat{r}\right) = 0$, $\left(\hat{r} \times \hat{\theta}\right) = \hat{\phi}$, and $\left(\hat{r} \times \hat{\phi}\right) = -\hat{\theta}$ (see Figure 4.1), and hence

$$
\mathbf{L} = -i\hbar \left(\hat{\phi} \frac{\partial}{\partial \theta} - \hat{\theta} \frac{1}{\sin \theta} \frac{\partial}{\partial \phi}\right). \tag{4.124}
$$

The unit vectors $\hat{\phi}$ and $\hat{\phi}$ can be resolved into their cartesian components:

$$
\hat{\theta} = (\cos \theta \cos \phi) \hat{i} + (\cos \theta \sin \phi) \hat{j} - (\sin \theta) \hat{k}; \tag{4.125}
$$

$$
\hat{\phi} = - (\sin \phi) \hat{i} + (\cos \phi) \hat{j}. \tag{4.126}
$$

Thus

$$
\begin{aligned}
\mathbf{L} &amp;= -i\hbar \left[ \left(- \sin \phi \hat{i} + \cos \phi \hat{j}\right) \frac{\partial}{\partial \theta} - \left(\cos \theta \cos \phi \hat{i} + \cos \theta \sin \phi \hat{j} - \sin \theta \hat{k}\right) \frac{1}{\sin \theta} \frac{\partial}{\partial \phi} \right].
\end{aligned}
$$

So

$$
L_x = -i\hbar \left(- \sin \phi \frac{\partial}{\partial \theta} - \cos \phi \cot \theta \frac{\partial}{\partial \phi}\right), \tag{4.127}
$$

$$
L_y = -i\hbar \left(+ \cos \phi \frac{\partial}{\partial \theta} - \sin \phi \cot \theta \frac{\partial}{\partial \phi}\right), \tag{4.128}
$$

and

$$
\boxed{L_z = -i\hbar \frac{\partial}{\partial \phi}.} \tag{4.129}
$$

We shall also need the raising and lowering operators:

$$
L_{\pm} = L_x \pm i L_y = -i\hbar \left[ \left(- \sin \phi \pm i \cos \phi\right) \frac{\partial}{\partial \theta} - \left(\cos \phi \pm i \sin \phi\right) \cot \theta \frac{\partial}{\partial \phi} \right].
$$

But $\cos \phi \pm i \sin \phi = e^{\pm i\phi}$, so

$$
L _ {\pm} = \pm \hbar e ^ {\pm i \phi} \left(\frac {\partial}{\partial \theta} \pm i \cot \theta \frac {\partial}{\partial \phi}\right). \tag {4.130}
$$

In particular (Problem 4.24(a)):

$$
L _ {+} L _ {-} = - \hbar^ {2} \left(\frac {\partial^ {2}}{\partial \theta^ {2}} + \cot \theta \frac {\partial}{\partial \theta} + \cot^ {2} \theta \frac {\partial^ {2}}{\partial \phi^ {2}} + i \frac {\partial}{\partial \phi}\right), \tag {4.131}
$$

and hence (Problem 4.24(b)):

$$
L ^ {2} = - \hbar^ {2} \left[ \frac {1}{\sin \theta} \frac {\partial}{\partial \theta} \left(\sin \theta \frac {\partial}{\partial \theta}\right) + \frac {1}{\sin^ {2} \theta} \frac {\partial^ {2}}{\partial \phi^ {2}} \right]. \tag {4.132}
$$

We are now in a position to determine  $f_{\ell}^{m}(\theta, \phi)$ . It's an eigenfunction of  $L^2$ , with eigenvalue  $\hbar^2 \ell (\ell + 1)$ :

$$
L ^ {2} f _ {\ell} ^ {m} = - \hbar^ {2} \left[ \frac {1}{\sin \theta} \frac {\partial}{\partial \theta} \left(\sin \theta \frac {\partial}{\partial \theta}\right) + \frac {1}{\sin^ {2} \theta} \frac {\partial^ {2}}{\partial \phi^ {2}} \right] f _ {\ell} ^ {m} = \hbar^ {2} \ell (\ell + 1) f _ {\ell} ^ {m}.
$$

But this is precisely the "angular equation" (Equation 4.18). And it's also an eigenfunction of  $L_{z}$ , with the eigenvalue  $m\hbar$ :

$$
L _ {z} f _ {\ell} ^ {m} = - i \hbar \frac {\partial}{\partial \phi} f _ {\ell} ^ {m} = \hbar m f _ {\ell} ^ {m},
$$

but this is equivalent to the azimuthal equation (Equation 4.21). We have already solved this system of equations! The result (appropriately normalized) is the spherical harmonic,  $Y_{\ell}^{m}(\theta ,\phi)$ . Conclusion: Spherical harmonics are the eigenfunctions of  $L^2$  and  $L_{z}$ . When we solved the Schrödinger equation by separation of variables, in Section 4.1, we were inadvertently constructing simultaneous eigenfunctions of the three commuting operators  $H,L^2$ , and  $L_{z}$ :

$$
H \psi = E \psi , \quad L ^ {2} \psi = \hbar^ {2} \ell (\ell + 1) \psi , \quad L _ {z} \psi = \hbar m \psi . \tag {4.133}
$$

Incidentally, we can use Equation 4.132 to rewrite the Schrödinger equation (Equation 4.14) more compactly:

$$
\frac {1}{2 m r ^ {2}} \left[ - \hbar^ {2} \frac {\partial}{\partial r} \left(r ^ {2} \frac {\partial}{\partial r}\right) + L ^ {2} \right] \psi + V \psi = E \psi .
$$

There is a curious final twist to this story: the algebraic theory of angular momentum permits  $\xi$  (and hence also  $m$ ) to take on half-integer values (Equation 4.119), whereas separation of variables yielded eigenfunctions only for integer values (Equation 4.29).34 You might suppose that the half-integer solutions are spurious, but it turns out that they are of profound importance, as we shall see in the following sections.

* Problem 4.24

(a) Derive Equation 4.131 from Equation 4.130. Hint: Use a test function; otherwise you're likely to drop some terms.
(b) Derive Equation 4.132 from Equations 4.129 and 4.131. Hint: Use Equation 4.112.

# Problem 4.25

(a) What is  $L_{+}Y_{\ell}^{\ell}$ ? (No calculation allowed!)
(b) Use the result of (a), together with Equation 4.130 and the fact that  $L_{\varepsilon}Y_{\ell}^{\ell} = \hbar \ell Y_{\ell}^{\ell}$ , to determine  $Y_{\ell}^{\ell}(\theta, \phi)$ , up to a normalization constant.
(c) Determine the normalization constant by direct integration. Compare your final answer to what you got in Problem 4.7.

Problem 4.26 In Problem 4.4 you showed that

$Y_{2}^{1}(\theta ,\phi) = -\sqrt{15 / 8\pi}\sin \theta \cos \theta e^{i\phi}.$

Apply the raising operator to find  $Y_2^2 (\theta ,\phi)$ . Use Equation 4.121 to get the normalization.

# **

Problem 4.27 Two particles (masses  $m_1$  and  $m_2$ ) are attached to the ends of a massless rigid rod of length  $a$ . The system is free to rotate in three dimensions about the (fixed) center of mass.

(a) Show that the allowed energies of this rigid rotor are

$E_{n} = \frac{\hbar^{2}}{2I} n(n + 1),\quad (n = 0,1,2,\ldots),\quad \mathrm{where}\quad I = \frac{m_{1}m_{2}}{(m_{1} + m_{2})} a^{2}$  is the moment of inertia of the system. Hint: First express the (classical) energy in terms of the angular momentum.
(b) What are the normalized eigenfunctions for this system? (Let  $\theta$  and  $\phi$  define the orientation of the rotor axis.) What is the degeneracy of the  $n$ th energy level?
(c) What spectrum would you expect for this system? (Give a formula for the frequencies of the spectral lines.) Answer:  $v_{j} = \hbar j / 2\pi I, j = 1,2,3,\ldots$
(d) Figure 4.13 shows a portion of the rotational spectrum of carbon monoxide (CO). What is the frequency separation  $(\Delta v)$  between adjacent lines? Look up the masses of  $^{12}\mathrm{C}$  and  $^{16}\mathrm{O}$ , and from  $m_{1}, m_{2}$ , and  $\Delta v$  determine the distance between the atoms.

![img-82.jpeg](img-82.jpeg)
Figure 4.13: Rotation spectrum of CO. Note that the frequencies are in spectroscopist's units: inverse centimeters. To convert to Hertz, multiply by  $c = 3.00 \times 10^{10} \mathrm{~cm/s}$ . Reproduced by permission from John M. Brown and Allan Carrington, Rotational Spectroscopy of Diatomic Molecules, Cambridge University Press, 2003, which in turn was adapted from E. V. Loewenstein, Journal of the Optical Society of America, 50, 1163 (1960).

212

# 4.4 Spin

In classical mechanics, a rigid object admits two kinds of angular momentum: orbital $(\mathbf{L} = \mathbf{r} \times \mathbf{p})$, associated with motion of the center of mass, and spin $(\mathbf{S} = I\omega)$, associated with motion about the center of mass. For example, the earth has orbital angular momentum attributable to its annual revolution around the sun, and spin angular momentum coming from its daily rotation about the north-south axis. In the classical context this distinction is largely a matter of convenience, for when you come right down to it, $\mathbf{S}$ is nothing but the sum total of the "orbital" angular momenta of all the rocks and dirt clods that go to make up the earth, as they circle around the axis. But a similar thing happens in quantum mechanics, and here the distinction is absolutely fundamental. In addition to orbital angular momentum, associated (in the case of hydrogen) with the motion of the electron around the nucleus (and described by the spherical harmonics), the electron also carries another form of angular momentum, which has nothing to do with motion in space (and which is not, therefore, described by any function of the position variables $r, \theta, \phi$) but which is somewhat analogous to classical spin (and for which, therefore, we use the same word). It doesn't pay to press this analogy too far: The electron (as far as we know) is a structureless point, and its spin angular momentum cannot be decomposed into orbital angular momenta of constituent parts (see Problem 4.28). [35] Suffice it to say that elementary particles carry intrinsic angular momentum ($\mathbf{S}$) in addition to their "extrinsic" angular momentum ($\mathbf{L}$).

The algebraic theory of spin is a carbon copy of the theory of orbital angular momentum, beginning with the fundamental commutation relations: [36]

$$
[ S _ {x}, S _ {y} ] = i \hbar S _ {z}, \quad [ S _ {y}, S _ {z} ] = i \hbar S _ {x}, \quad [ S _ {z}, S _ {x} ] = i \hbar S _ {y}. \tag {4.134}
$$

It follows (as before) that the eigenvectors of $S^2$ and $S_z$ satisfy [37]

$$
S ^ {2} | s m \rangle = \hbar^ {2} s (s + 1) | s m \rangle ; \quad S _ {z} | s m \rangle = \hbar m | s m \rangle ; \tag {4.135}
$$

and

$$
S _ {\pm} | s m \rangle = \hbar \sqrt {s (s + 1) - m (m \pm 1)} | s (m \pm 1) \rangle , \tag {4.136}
$$

where $S_{\pm} \equiv S_x \pm iS_y$. But this time the eigenvectors are not spherical harmonics (they're not functions of $\theta$ and $\phi$ at all), and there is no reason to exclude the half-integer values of $s$ and $m$:

$$
s = 0, \frac {1}{2}, 1, \frac {3}{2}, \dots ; \quad m = - s, - s + 1, \dots , s - 1, s. \tag {4.137}
$$

It so happens that every elementary particle has a specific and immutable value of $s$, which we call the spin of that particular species: $\pi$ mesons have spin 0; electrons have spin 1/2; photons have spin 1; $\Delta$ baryons have spin 3/2; gravitons have spin 2; and so on. By contrast, the orbital angular momentum quantum number $l$ (for an electron in a hydrogen atom, say) can take on any (integer) value you please, and will change from one to another when the system is perturbed. But $s$ is fixed, for any given particle, and this makes the theory of spin comparatively simple. [38]

Problem 4.28 If the electron were a classical solid sphere, with radius

$$
r _ {c} = \frac {e ^ {2}}{4 \pi \epsilon_ {0} m c ^ {2}}, \tag {4.138}
$$

(the so-called classical electron radius, obtained by assuming the electron's mass is attributable to energy stored in its electric field, via the Einstein formula  $E = mc^2$ ), and its angular momentum is  $(1/2)\hbar$ , then how fast (in m/s) would a point on the "equator" be moving? Does this model make sense? (Actually, the radius of the electron is known experimentally to be much less than  $r_c$ , but this only makes matters worse.) $^{39}$

214

## 4.4.1 Spin 1/2

By far the most important case is $s = 1/2$, for this is the spin of the particles that make up ordinary matter (protons, neutrons, and electrons), as well as all quarks and all leptons. Moreover, once you understand spin 1/2, it is a simple matter to work out the formalism for any higher spin. There are just two eigenstates: $\left|\frac{1}{2}\frac{1}{2}\right\rangle$, which we call spin up (informally, $\uparrow$), and $\left|\frac{1}{2}\left(-\frac{1}{2}\right)\right\rangle$, spin down ($\downarrow$). Using these as basis vectors, the general state$^{40}$ of a spin-1/2 particle can be represented by a two-element column matrix (or spinor):

$$
\chi = \left( \begin{array}{c} a \\ b \end{array} \right) = a \chi_{+} + b \chi_{-}, \tag{4.139}
$$

with

$$
\chi_{+} = \left( \begin{array}{c} 1 \\ 0 \end{array} \right) \tag{4.140}
$$

representing spin up, and

$$
\chi_{-} = \left( \begin{array}{c} 0 \\ 1 \end{array} \right) \tag{4.141}
$$

for spin down.

With respect to this basis the spin operators become $2 \times 2$ matrices,$^{41}$ which we can work out by noting their effect on $\chi_{+}$ and $\chi_{-}$. Equation 4.135 says

$$
\mathbb{S}^{2} \chi_{+} = \frac{3}{4} \hbar^{2} \chi_{+} \quad \text{and} \quad \mathbb{S}^{2} \chi_{-} = \frac{3}{4} \hbar^{2} \chi_{-}. \tag{4.142}
$$

If we write $\mathbb{S}^2$ as a matrix with (as yet) undetermined elements,

$$
\mathbb{S}^{2} = \left( \begin{array}{cc} c &amp; d \\ e &amp; f \end{array} \right),
$$

then the first equation says

$$
\left( \begin{array}{cc} c &amp; d \\ e &amp; f \end{array} \right) \left( \begin{array}{c} 1 \\ 0 \end{array} \right) = \frac{3}{4} \hbar^{2} \left( \begin{array}{c} 1 \\ 0 \end{array} \right), \quad \text{or} \quad \left( \begin{array}{c} c \\ e \end{array} \right) = \left( \begin{array}{c} \frac{3}{4} \hbar^{2} \\ 0 \end{array} \right),
$$

so $c = (3/4) \hbar^{2}$ and $e = 0$. The second equation says

$$
\left( \begin{array}{cc} c &amp; d \\ e &amp; f \end{array} \right) \left( \begin{array}{c} 0 \\ 1 \end{array} \right) = \frac{3}{4} \hbar^{2} \left( \begin{array}{c} 0 \\ 1 \end{array} \right), \quad \text{or} \quad \left( \begin{array}{c} d \\ f \end{array} \right) = \left( \begin{array}{c} 0 \\ \frac{3}{4} \hbar^{2} \end{array} \right),
$$

so $d = 0$ and $f = (3/4) \hbar^{2}$. Conclusion:

$$
\mathbb{S}^{2} = \frac{3}{4} \hbar^{2} \left( \begin{array}{cc} 1 &amp; 0 \\ 0 &amp; 1 \end{array} \right). \tag{4.143}
$$

Similarly,

$$
\mathbb {S} _ {z} \chi_ {+} = \frac {\hbar}{2} \chi_ {+}, \quad \mathbb {S} _ {z} \chi_ {-} = - \frac {\hbar}{2} \chi_ {-}, \tag {4.144}
$$

from which it follows that

$$
\mathbb {S} _ {z} = \frac {\hbar}{2} \left( \begin{array}{c c} 1 &amp; 0 \\ 0 &amp; - 1 \end{array} \right). \tag {4.145}
$$

Meanwhile, Equation 4.136 says

$$
\mathbb {S} _ {+} \chi_ {-} = \hbar \chi_ {+}, \quad \mathbb {S} _ {-} \chi_ {+} = \hbar \chi_ {-}, \quad \mathbb {S} _ {+} \chi_ {+} = \mathbb {S} _ {-} \chi_ {-} = 0,
$$

so

$$
\mathbb {S} _ {+} = \hbar \left( \begin{array}{l l} 0 &amp; 1 \\ 0 &amp; 0 \end{array} \right), \quad \mathbb {S} _ {-} = \hbar \left( \begin{array}{l l} 0 &amp; 0 \\ 1 &amp; 0 \end{array} \right). \tag {4.146}
$$

Now $S_{\pm} = S_x \pm iS_y$, so $S_x = (1/2)(S_+ + S_-)$ and $S_y = (1/2i)(S_+ - S_-)$, and hence

$$
\mathbb {S} _ {x} = \frac {\hbar}{2} \left( \begin{array}{l l} 0 &amp; 1 \\ 1 &amp; 0 \end{array} \right), \quad \mathbb {S} _ {y} = \frac {\hbar}{2} \left( \begin{array}{l l} 0 &amp; - i \\ i &amp; 0 \end{array} \right). \tag {4.147}
$$

Since $\mathbb{S}_x, \mathbb{S}_y$, and $\mathbb{S}_z$ all carry a factor of $\hbar / 2$, it is tidier to write $\mathbb{S} = (\hbar / 2)\sigma$, where

$$
\sigma_ {x} \equiv \left( \begin{array}{l l} 0 &amp; 1 \\ 1 &amp; 0 \end{array} \right), \sigma_ {y} \equiv \left( \begin{array}{l l} 0 &amp; - i \\ i &amp; 0 \end{array} \right), \sigma_ {z} \equiv \left( \begin{array}{l l} 1 &amp; 0 \\ 0 &amp; - 1 \end{array} \right). \tag {4.148}
$$

These are the famous Pauli spin matrices. Notice that $\mathbb{S}_x, \mathbb{S}_y, \mathbb{S}_z$, and $\mathbb{S}^2$ are all hermitian matrices (as they should be, since they represent observables). On the other hand, $\mathbb{S}_+$ and $\mathbb{S}_-$ are not hermitian—evidently they are not observable.

The eigenspinors of $\mathbb{S}_z$ are (or course):

$$
\chi_ {+} = \binom {1} {0}, \left(\text {eigenvalue} + \frac {\hbar}{2}\right); \quad \chi_ {-} = \binom {0} {1}, \left(\text {eigenvalue} - \frac {\hbar}{2}\right). \tag {4.149}
$$

If you measure $S_{z}$ on a particle in the general state $\chi$ (Equation 4.139), you could get $+\hbar /2$, with probability $|a|^2$, or $-\hbar /2$, with probability $|b|^2$. Since these are the only possibilities,

$$
\left| a \right| ^ {2} + \left| b \right| ^ {2} = 1 \tag {4.150}
$$

(i.e. the spinor must be normalized: $\chi^{\dagger}\chi = 1$).42

But what if, instead, you chose to measure $S_{x}$? What are the possible results, and what are their respective probabilities? According to the generalized statistical interpretation, we need to know the eigenvalues and eigenspinors of $\mathbb{S}_x$. The characteristic equation is

$$
\left| \begin{array}{c c} - \lambda &amp; \hbar / 2 \\ \hbar / 2 &amp; - \lambda \end{array} \right| = 0 \Rightarrow \lambda^ {2} = \left(\frac {\hbar}{2}\right) ^ {2} \Rightarrow \lambda = \pm \frac {\hbar}{2}.
$$

Not surprisingly (but it gratifying to see how it works out), the possible values for $S_{x}$ are the same as those for $S_{z}$. The eigenspinors are obtained in the usual way:

215

$$
\frac {\hbar}{2} \left( \begin{array}{cc} 0 &amp; 1 \\ 1 &amp; 0 \end{array} \right) \left( \begin{array}{c} \alpha \\ \beta \end{array} \right) = \pm \frac {\hbar}{2} \left( \begin{array}{c} \alpha \\ \beta \end{array} \right) \Rightarrow \left( \begin{array}{c} \beta \\ \alpha \end{array} \right) = \pm \left( \begin{array}{c} \alpha \\ \beta \end{array} \right),
$$

so $\beta = \pm \alpha$. Evidently the (normalized) eigenspinors of $\mathbb{S}_x$ are

$$
\chi_ {+} ^ {(x)} = \left( \begin{array}{c} 1 / \sqrt {2} \\ 1 / \sqrt {2} \end{array} \right), \left(\text {eigenvalue} + \frac {\hbar}{2}\right); \chi_ {-} ^ {(x)} = \left( \begin{array}{c} 1 / \sqrt {2} \\ - 1 / \sqrt {2} \end{array} \right), \left(\text {eigenvalue} - \frac {\hbar}{2}\right). \tag {4.151}
$$

As the eigenvectors of a hermitian matrix, they span the space; the generic spinor $\chi$ (Equation 4.139) can be expressed as a linear combination of them:

$$
\chi = \left(\frac {a + b}{\sqrt {2}}\right) \chi_ {+} ^ {(x)} + \left(\frac {a - b}{\sqrt {2}}\right) \chi_ {-} ^ {(x)}. \tag {4.152}
$$

If you measure $S_{x}$, the probability of getting $+\hbar / 2$ is $(1/2) |a + b|^2$, and the probability of getting $-\hbar / 2$ is $(1/2) |a - b|^2$. (Check for yourself that these probabilities add up to 1.)

## Example 4.2

Suppose a spin-1/2 particle is in the state

$$
\chi = \frac {1}{\sqrt {6}} \left( \begin{array}{c} 1 + i \\ 2 \end{array} \right).
$$

What are the probabilities of getting $+\hbar /2$ and $-\hbar /2$, if you measure $S_{z}$ and $S_{x}$?

**Solution:** Here $a = (1 + i) / \sqrt{6}$ and $b = 2 / \sqrt{6}$, so for $S_{z}$ the probability of getting $+\hbar /2$ is $\left|(1 + i) / \sqrt{6}\right|^2 = 1 / 3$ and the probability of getting $-\hbar /2$ is $\left|2 / \sqrt{6}\right|^2 = 2 / 3$. For $S_{x}$ the probability of getting $+\hbar /2$ is $(1 / 2)\left|(3 + i) / \sqrt{6}\right|^2 = 5 / 6$, and the probability of getting $-\hbar /2$ is $(1 / 2)\left|(-1 + i) / \sqrt{6}\right|^2 = 1 / 6$. Incidentally, the expectation value of $S_{x}$ is

$$
\frac {5}{6} \left(+ \frac {\hbar}{2}\right) + \frac {1}{6} \left(- \frac {\hbar}{2}\right) = \frac {\hbar}{3},
$$

which we could also have obtained more directly:

$$
\langle S _ {x} \rangle = \chi^ {\dagger} \mathbb {S} _ {x} \chi = \left((1 - i) / \sqrt {6} \quad 2 / \sqrt {6}\right) \left( \begin{array}{cc} 0 &amp; \hbar / 2 \\ \hbar / 2 &amp; 0 \end{array} \right) \left( \begin{array}{c} (1 + i) / \sqrt {6} \\ 2 / \sqrt {6} \end{array} \right) = \frac {\hbar}{3}.
$$

I'd like now to walk you through an imaginary measurement scenario involving spin 1/2, because it serves to illustrate in very concrete terms some of the abstract ideas we discussed back in Chapter 1. Let's say we start out with a particle in the state $\chi_{+}$. If someone asks, "What is the $z$-component of that particle's spin angular momentum?", we can answer unambiguously: $+\hbar /2$. For a measurement of $S_{z}$ is certain to return that value. But if our interrogator asks instead, "What is the $x$-component of that particle's spin angular momentum?" we are obliged to equivocate: If you measure $S_{x}$, the chances are fifty-fifty of getting either $\hbar /2$ or $-\hbar /2$. If the questioner is a classical physicist, or a "realist" (in the sense of Section 1.2), he will regard this as an inadequate—not to say impertinent—response: "Are you telling me that you don't know the true state of that particle?" On the contrary; I know precisely what the state of the particle is: $\chi_{+}$. "Well, then, how come

216

you can't tell me what the  $x$ -component of its spin is?" Because it simply does not have a particular  $x$ -component of spin. Indeed, it cannot, for if both  $S_x$  and  $S_z$  were well-defined, the uncertainty principle would be violated.

At this point our challenger grabs the test-tube and measures the  $x$ -component of the particle's spin; let's say he gets the value  $+\hbar /2$ . "Aha!" (he shouts in triumph), "You lied! This particle has a perfectly well-defined value of  $S_{x}$ :  $\hbar /2$ ." Well, sure—it does now, but that doesn't prove it had that value, prior to your measurement. "You have obviously been reduced to splitting hairs. And anyway, what happened to your uncertainty principle? I now know both  $S_{x}$  and  $S_{z}$ ." I'm sorry, but you do not: In the course of your measurement, you altered the particle's state; it is now in the state  $\chi_{+}^{(x)}$ , and whereas you know the value of  $S_{x}$ , you no longer know the value of  $S_{z}$ . "But I was extremely careful not to disturb the particle when I measured  $S_{x}$ ." Very well, if you don't believe me, check it out: Measure  $S_{z}$ , and see what you get. (Of course, he may get  $+\hbar /2$ , which will be embarrassing to my case—but if we repeat this whole scenario over and over, half the time he will get  $-\hbar /2$ .)

To the layman, the philosopher, or the classical physicist, a statement of the form "this particle doesn't have a well-defined position" (or momentum, or  $x$ -component of spin angular momentum, or whatever) sounds vague, incompetent, or (worst of all) profound. It is none of these. But its precise meaning is, I think, almost impossible to convey to anyone who has not studied quantum mechanics in some depth. If you find your own comprehension slipping, from time to time (if you don't, you probably haven't understood the problem), come back to the spin-1/2 system: It is the simplest and cleanest context for thinking through the conceptual paradoxes of quantum mechanics.

# Problem 4.29

(a) Check that the spin matrices (Equations 4.145 and 4.147) obey the fundamental commutation relations for angular momentum, Equation 4.134.
(b) Show that the Pauli spin matrices (Equation 4.148) satisfy the product rule

$$
\sigma_ {j} \sigma_ {k} = \delta_ {j k} + i \sum_ {l} \epsilon_ {j k l} \sigma_ {l}, \tag {4.153}
$$

where the indices stand for  $x, y$ , or  $z$ , and  $\epsilon_{jkl}$  is the Levi-Civita symbol:  $+1$  if  $jkl = 123$ , 231, or 312;  $-1$  if  $jkl = 132$ , 213, or 321; 0 otherwise.

# Problem 4.30 An electron is in the spin state

$$
\chi = A \left( \begin{array}{c} 3 i \\ 4 \end{array} \right).
$$

(a) Determine the normalization constant  $\mathcal{A}$ .
(b) Find the expectation values of  $S_{x}, S_{y}$ , and  $S_{z}$ .
(c) Find the "uncertainties"  $\sigma_{S_x}, \sigma_{S_y}$ , and  $\sigma_{S_z}$ . Note: These sigmas are standard deviations, not Pauli matrices!

(d) Confirm that your results are consistent with all three uncertainty principles (Equation 4.100 and its cyclic permutations—only with  $S$  in place of  $L$ , of course).

Problem 4.31 For the most general normalized spinor  $\chi$  (Equation 4.139), compute  $\langle S_x\rangle$ ,  $\langle S_y\rangle$ ,  $\langle S_z\rangle$ ,  $\langle S_x^2\rangle$ ,  $\langle S_y^2\rangle$ , and  $\langle S_z^2\rangle$ . Check that  $\langle S_x^2\rangle + \langle S_y^2\rangle + \langle S_z^2\rangle = \langle S^2\rangle$ .

# Problem 4.32

(a) Find the eigenvalues and eigenspinors of  $\mathbf{S}_y$
(b) If you measured  $S_{x}$  on a particle in the general state  $\chi$  (Equation 4.139), what values might you get, and what is the probability of each? Check that the probabilities add up to 1. Note:  $a$  and  $b$  need not be real!
(c) If you measured  $S_{z}^{2}$ , what values might you get, and with what probabilities?

Problem 4.33 Construct the matrix  $\mathbf{S}_r$  representing the component of spin angular momentum along an arbitrary direction  $\hat{r}$ . Use spherical coordinates, for which

$$
\hat {r} = \sin \theta \cos \phi \hat {i} + \sin \theta \sin \phi \hat {j} + \cos \theta \hat {k}. \tag {4.154}
$$

Find the eigenvalues and (normalized) eigenspinors of  $\mathbf{S}_r$ . Answer:

$$
\chi_ {+} ^ {(r)} = \left( \begin{array}{c} \cos (\theta / 2) \\ e ^ {i \phi} \sin (\theta / 2) \end{array} \right); \quad \chi_ {-} ^ {(r)} = \left( \begin{array}{c} e ^ {- i \phi} \sin (\theta / 2) \\ - \cos (\theta / 2) \end{array} \right). \tag {4.155}
$$

Note: You're always free to multiply by an arbitrary phase factor—say,  $e^{i\phi}$ —so your answer may not look exactly the same as mine.

Problem 4.34 Construct the spin matrices  $\left(\mathbf{S}_x, \mathbf{S}_y, \text{and} \mathbf{S}_z\right)$  for a particle of spin 1. Hint: How many eigenstates of  $\mathbf{S}_z$  are there? Determine the action of  $\mathbf{S}_z, \mathbf{S}_+$ , and  $\mathbf{S}_-$  on each of these states. Follow the procedure used in the text for spin  $1/2$ .

219

## 4.4.2 Electron in a Magnetic Field

A spinning charged particle constitutes a magnetic dipole. Its **magnetic dipole moment**, $\mu$, is proportional to its spin angular momentum, $S$:

$$
\mu = \gamma S; \tag{4.156}
$$

the proportionality constant, $\gamma$, is called the **gyromagnetic ratio**.$^{43}$ When a magnetic dipole is placed in a magnetic field $\mathbf{B}$, it experiences a torque, $\mu \times \mathbf{B}$, which tends to line it up parallel to the field (just like a compass needle). The energy associated with this torque is$^{43}$

$$
H = - \mu \cdot \mathbf{B}, \tag{4.157}
$$

so the Hamiltonian matrix for a spinning charged particle, at rest$^{42}$ in a magnetic field $\mathbf{B}$, is

$$
\mathsf{H} = - \gamma \mathbf{B} \cdot \mathsf{S}, \tag{4.158}
$$

where $\mathsf{S}$ is the appropriate spin matrix (Equations 4.145 and 4.147, in the case of spin $1/2$).

### Example 4.3

**Larmor precession**: Imagine a particle of spin $1/2$ at rest in a uniform magnetic field, which points in the $z$-direction:

$$
\mathbf{B} = B_0 \hat{k}. \tag{4.159}
$$

The Hamiltonian (Equation 4.158) is

$$
\mathsf{H} = - \gamma B_0 \mathsf{S}_z = - \frac{\gamma B_0 \hbar}{2} \begin{pmatrix} 1 &amp; 0 \\ 0 &amp; -1 \end{pmatrix}. \tag{4.160}
$$

The eigenstates of $\mathsf{H}$ are the same as those of $\mathsf{S}_z$:

$$
\left\{
\begin{array}{l}
\chi_{+}, \quad \text{with energy } E_{+} = - (\gamma B_0 \hbar) / 2, \\
\chi_{-}, \quad \text{with energy } E_{-} = + (\gamma B_0 \hbar) / 2.
\end{array}
\right. \tag{4.161}
$$

The energy is lowest when the dipole moment is parallel to the field—just as it would be classically.

Since the Hamiltonian is time independent, the general solution to the time-dependent Schrödinger equation,

$$
i \hbar \frac{\partial \chi}{\partial t} = \mathsf{H} \chi, \tag{4.162}
$$

can be expressed in terms of the stationary states:

$$
\chi(t) = a \chi_{+} e^{-i E_{+} t / \hbar} + b \chi_{-} e^{-i E_{-} t / \hbar} = \begin{pmatrix} a e^{i \gamma B_0 t / 2} \\ b e^{-i \gamma B_0 t / 2} \end{pmatrix}.
$$

The constants $a$ and $b$ are determined by the initial conditions:

$$
\chi(0) = \begin{pmatrix} a \\ b \end{pmatrix},
$$

(of course,  $|a|^2 + |b|^2 = 1$ ). With no essential loss of generality $^{46}$  I'll write  $a = \cos(\alpha/2)$  and  $b = \sin(\alpha/2)$ , where  $\mathfrak{a}$  is a fixed angle whose physical significance will appear in a moment. Thus

$$
\chi (t) = \left( \begin{array}{l} \cos (\alpha / 2) e ^ {i \gamma B _ {0} t / 2} \\ \sin (\alpha / 2) e ^ {- i \gamma B _ {0} t / 2} \end{array} \right). \tag {4.163}
$$

To get a feel for what is happening here, let's calculate the expectation value of  $\mathbf{S}$ , as a function of time:

$$
\begin{array}{l} \langle S _ {x} \rangle = \chi (t) ^ {\dagger} \mathsf {S} _ {x} \chi (t) \\ = \left(\cos (\alpha / 2) e ^ {- i \gamma B _ {0} t / 2} \sin (\alpha / 2) e ^ {i \gamma B _ {0} t / 2}\right) \frac {\hbar}{2} \left( \begin{array}{l l} 0 &amp; 1 \\ 1 &amp; 0 \end{array} \right) \left( \begin{array}{l} \cos (\alpha / 2) e ^ {i \gamma B _ {0} t / 2} \\ \sin (\alpha / 2) e ^ {- i \gamma B _ {0} t / 2} \end{array} \right) \\ = \frac {\hbar}{2} \sin \alpha \cos (\gamma B _ {0} t). \tag {4.164} \\ \end{array}
$$

Similarly,

$$
\left\langle S _ {y} \right\rangle = \chi (t) ^ {\dagger} \mathbb {S} _ {y} \chi (t) = - \frac {\hbar}{2} \sin \alpha \sin (\gamma B _ {0} t), \tag {4.165}
$$

and

$$
\langle S _ {z} \rangle = \chi (t) ^ {\dagger} \mathbb {S} _ {z} \chi (t) = \frac {\hbar}{2} \cos \alpha . \tag {4.166}
$$

Thus  $\langle \mathbf{S}\rangle$  is tilted at a constant angle  $\mathfrak{a}$  to the  $z$  axis, and precesses about the field at the Larmor frequency

$$
\omega = \gamma B _ {0}, \tag {4.167}
$$

just as it would classically $^{47}$  (see Figure 4.14). No surprise here—Ehrenfest's theorem (in the form derived in Problem 4.23) guarantees that  $\langle \mathbf{S} \rangle$  evolves according to the classical laws. But it's nice to see how this works out in a specific context.

![img-83.jpeg](img-83.jpeg)
Figure 4.14: Precession of  $\langle \mathbf{S} \rangle$  in a uniform magnetic field.

# Example 4.4

The Stern-Gerlach experiment: In an inhomogeneous magnetic field, there is not only a torque, but also a force, on a magnetic dipole:[48]

$$
\mathbf {F} = \nabla (\boldsymbol {\mu} \cdot \mathbf {B}). \tag {4.168}
$$

This force can be used to separate out particles with a particular spin orientation. Imagine a beam of heavy neutral atoms,[49] traveling in the  $y$  direction, which passes through a region of static but inhomogeneous magnetic field (Figure 4.15)—say

$$
\mathbf {B} (x, y, z) = - \alpha x \hat {i} + \left(B _ {0} + \alpha z\right) \hat {k}, \tag {4.169}
$$

where  $B_0$  is a strong uniform field and the constant  $\mathfrak{a}$  describes a small deviation from homogeneity. (Actually, what we'd prefer is just the  $z$  component of this field, but unfortunately that's impossible—it would violate the electromagnetic law  $\nabla \cdot \mathbf{B} = 0$ ; like it or not, the  $x$  component comes along for the ride.) The force on these atoms is $^{50}$

$$
\mathbf {F} = \gamma \alpha \left(- S _ {x} \hat {i} + S _ {z} \hat {k}\right).
$$

![img-84.jpeg](img-84.jpeg)
Figure 4.15: The Stern-Gerlach apparatus.

But because of the Larmor precession about  $\mathbf{B}_0$ ,  $S_x$  oscillates rapidly, and averages to zero; the net force is in the  $z$  direction:

$$
F _ {z} = \gamma \alpha S _ {z}, \tag {4.170}
$$

and the beam is deflected up or down, in proportion to the  $z$  component of the spin angular momentum. Classically we'd expect a smear (because  $S_{z}$  would not be quantized), but in fact the beam splits into  $2s + 1$  separate streams, beautifully demonstrating the quantization of angular momentum. (If you use silver atoms, all the inner electrons are paired, in such a way that their angular momenta cancel. The net spin is simply that of the outermost—unpaired—electron, so in this case  $s = 1/2$ , and the beam splits in two.)

The Stern-Gerlach experiment has played an important role in the philosophy of quantum mechanics, where it serves both as the prototype for the preparation of a quantum state and as an illuminating model for a certain kind of quantum measurement. We tend casually to assume that the initial state of a system is known (the Schrödinger equation tells us how it subsequently evolves)—but it is natural to wonder how you get a system into a particular state in the first place. Well, if you want to prepare a beam of atoms in a given spin configuration, you pass an unpolarized beam through a Stern-Gerlach magnet, and select the outgoing stream you are interested in (closing off the others

with suitable baffles and shutters). Conversely, if you want to measure the  $z$  component of an atom's spin, you send it through a Stern-Gerlach apparatus, and record which bin it lands in. I do not claim that this is always the most practical way to do the job, but it is conceptually very clean, and hence a useful context in which to explore the problems of state preparation and measurement.

# Problem 4.35 In Example 4.3:

(a) If you measured the component of spin angular momentum along the  $x$  direction, at time  $t$ , what is the probability that you would get  $+\hbar /2\rangle$
(b) Same question, but for the  $y$  component.
(c) Same, for the  $z$  component.

# **

# Problem 4.36 An electron is at rest in an oscillating magnetic field

$\mathbf{B} = B_0\cos (\omega t)\hat{k},$

where  $B_0$  and  $\omega$  are constants.

(a) Construct the Hamiltonian matrix for this system.
(b) The electron starts out (at  $t = 0$ ) in the spin-up state with respect to the  $x$  axis (that is:  $\chi(0) = \chi_{+}^{(x)}$ ). Determine  $\chi(t)$  at any subsequent time. Beware: This is a time-dependent Hamiltonian, so you cannot get  $\chi(t)$  in the usual way from stationary states. Fortunately, in this case you can solve the time-dependent Schrödinger equation (Equation 4.162) directly.
(c) Find the probability of getting  $-\hbar / 2$ , if you measure  $S_{x}$ . Answer:

$\sin^2 \left( \frac{\gamma B_0}{2 \omega} \sin (\omega t) \right)$ .

(d) What is the minimum field  $(B_0)$  required to force a complete flip in  $S_{x}$ ?

223

## 4.4.3 Addition of Angular Momenta

Suppose now that we have two particles, with spins $s_1$ and $s_2$. Say, the first is in the state $|s_1 m_1\rangle$ and the second in the state $|s_2 m_2\rangle$. We denote the composite state by $|s_1 s_2 m_1 m_2\rangle$:

$$
S^{(1)^2} |s_1 s_2 m_1 m_2\rangle = s_1 (s_1 + 1) \hbar^2 |s_1 s_2 m_1 m_2\rangle, \tag{4.171}
$$

$$
S^{(2)^2} |s_1 s_2 m_1 m_2\rangle = s_2 (s_2 + 1) \hbar^2 |s_1 s_2 m_1 m_2\rangle,
$$

$$
S_{\xi}^{(1)} |s_1 s_2 m_1 m_2\rangle = m_1 \hbar |s_1 s_2 m_1 m_2\rangle,
$$

$$
S_{\xi}^{(2)} |s_1 s_2 m_1 m_2\rangle = m_2 \hbar |s_1 s_2 m_1 m_2\rangle.
$$

**Question**: What is the *total* angular momentum,

$$
\mathbf{S} = \mathbf{S}^{(1)} + \mathbf{S}^{(2)}, \tag{4.172}
$$

of this system? That is to say: what is the net spin, $s$, of the combination, and what is the $z$ component, $m$? The $z$ component is easy:

$$
\begin{aligned}
S_{\xi} |s_1 s_2 m_1 m_2\rangle &amp;= S_{\xi}^{(1)} |s_1 s_2 m_1 m_2\rangle + S_{\xi}^{(2)} |s_1 s_2 m_1 m_2\rangle, \tag{4.173} \\
&amp;= \hbar (m_1 + m_2) |s_1 s_2 m_1 m_2\rangle = \hbar m |s_1 s_2 m_1 m_2\rangle,
\end{aligned}
$$

so

$$
m = m_1 + m_2; \tag{4.174}
$$

it's just the *sum*. But $s$ is much more subtle, so let's begin with the simplest nontrivial example.

### Example 4.5

Consider the case of two spin-$1/2$ particles—say, the electron and the proton in the ground state of hydrogen. Each can have spin up or spin down, so there are four possibilities in all: $^{51}$

$$
|\uparrow\uparrow\rangle = \left| \frac{1}{2} \frac{1}{2} \frac{1}{2} \frac{1}{2} \right\rangle, \qquad m = 1,
$$

$$
|\uparrow\downarrow\rangle = \left| \frac{1}{2} \frac{1}{2} \frac{1}{2} \frac{-1}{2} \right\rangle, \qquad m = 0,
$$

$$
|\downarrow\uparrow\rangle = \left| \frac{1}{2} \frac{1}{2} \frac{-1}{2} \frac{1}{2} \right\rangle, \qquad m = 0,
$$

$$
|\downarrow\downarrow\rangle = \left| \frac{1}{2} \frac{1}{2} \frac{-1}{2} \frac{-1}{2} \right\rangle, \quad m = -1.
$$

This doesn't look right: $m$ is supposed to advance in integer steps, from $-s$ to $+s$, so it appears that $s = 1$—but there is an "extra" state with $m = 0$.

One way to untangle this problem is to apply the lowering operator, $S_{-} = S_{-}^{(1)} + S_{-}^{(2)}$ to the state $|\uparrow\uparrow\rangle$, using Equation 4.146:

$$
\begin{aligned}
S_{-} |\uparrow\uparrow\rangle &amp;= (S_{-}^{(1)} |\uparrow\rangle) |\uparrow\rangle + |\uparrow\rangle (S_{-}^{(2)} |\uparrow\rangle) \\
&amp;= (\hbar |\downarrow\rangle) |\uparrow\rangle + |\uparrow\rangle (\hbar |\downarrow\rangle) = \hbar (|\downarrow\uparrow\rangle + |\uparrow\downarrow\rangle).
\end{aligned}
$$

Evidently the three states with $s = 1$ are (in the notation $|sm\rangle$):

$$
\left\{ \begin{array}{l l l} | 1 1 \rangle &amp; = &amp; | \uparrow \uparrow \rangle \\ | 1 0 \rangle &amp; = &amp; \frac {1}{\sqrt {2}} (| \uparrow \downarrow \rangle + | \downarrow \uparrow \rangle) \\ | 1 - 1 \rangle &amp; = &amp; | \downarrow \downarrow \rangle \end{array} \right\} \quad s = 1 (\text {t r i p l e t}). \tag {4.175}
$$

(As a check, try applying the lowering operator to  $|10\rangle$ ; what should you get? See Problem 4.37(a).) This is called the triplet combination, for the obvious reason. Meanwhile, the orthogonal state with  $m = 0$  carries  $s = 0$ :

$$
\left\{ \begin{array}{l} | 0 0 \rangle = \frac {1}{\sqrt {2}} (| \uparrow \downarrow \rangle - | \downarrow \uparrow \rangle) \end{array} \right\} \quad s = 0 (\text {s i n g l e t}). \tag {4.176}
$$

(If you apply the raising or lowering operator to this state, you'll get zero. See Problem 4.37(b).)

I claim, then, that the combination of two spin-1/2 particles can carry a total spin of 1 or 0, depending on whether they occupy the triplet or the singlet configuration. To confirm this, I need to prove that the triplet states are eigenvectors of  $S^2$  with eigenvalue  $2\hbar^2$ , and the singlet is an eigenvector of  $S^2$  with eigenvalue 0. Now,

$$
S ^ {2} = \left(\mathbf {S} ^ {(1)} + \mathbf {S} ^ {(2)}\right) \cdot \left(\mathbf {S} ^ {(1)} + \mathbf {S} ^ {(2)}\right) = \left(S ^ {(1)}\right) ^ {2} + \left(S ^ {(2)}\right) ^ {2} + 2 \mathbf {S} ^ {(1)} \cdot \mathbf {S} ^ {(2)}. \tag {4.177}
$$

Using Equations 4.145 and 4.147, we have

$$
\begin{array}{l} \mathbf {S} ^ {(1)} \cdot \mathbf {S} ^ {(2)} | \uparrow \downarrow \rangle = \left(S _ {x} ^ {(1)} | \uparrow \rangle\right) \left(S _ {x} ^ {(2)} | \downarrow \rangle\right) + \left(S _ {y} ^ {(1)} | \uparrow \rangle\right) \left(S _ {y} ^ {(2)} | \downarrow \rangle\right) + \left(S _ {z} ^ {(1)} | \uparrow \rangle\right) \left(S _ {z} ^ {(2)} | \downarrow \rangle\right) \\ = \left(\frac {\hbar}{2} | \downarrow \rangle\right) \left(\frac {\hbar}{2} | \uparrow \rangle\right) + \left(\frac {i \hbar}{2} | \downarrow \rangle\right) \left(\frac {- i \hbar}{2} | \uparrow \rangle\right) + \left(\frac {\hbar}{2} | \uparrow \rangle\right) \left(\frac {- \hbar}{2} | \downarrow \rangle\right) \\ = \frac {\hbar^ {2}}{4} (2 | \downarrow \uparrow \rangle - | \uparrow \downarrow \rangle). \\ \end{array}
$$

Similarly,

$$
\mathbf {S} ^ {(1)} \cdot \mathbf {S} ^ {(2)} (| \downarrow \uparrow \rangle) = \frac {\hbar^ {2}}{4} (2 | \uparrow \downarrow \rangle - | \downarrow \uparrow \rangle).
$$

It follows that

$$
\mathbf {S} ^ {(1)} \cdot \mathbf {S} ^ {(2)} | 1 0 \rangle = \frac {\hbar^ {2}}{4} \frac {1}{\sqrt {2}} (2 | \downarrow \uparrow \rangle - | \uparrow \downarrow \rangle + 2 | \uparrow \downarrow \rangle - | \downarrow \uparrow \rangle) = \frac {\hbar^ {2}}{4} | 1 0 \rangle , \tag {4.178}
$$

and

$$
\mathbf {S} ^ {(1)} \cdot \mathbf {S} ^ {(2)} | 0 0 \rangle = \frac {\hbar^ {2}}{4} \frac {1}{\sqrt {2}} (2 | \downarrow \uparrow \rangle - | \uparrow \downarrow \rangle - 2 | \uparrow \downarrow \rangle + | \downarrow \uparrow \rangle) = - \frac {3 \hbar^ {2}}{4} | 0 0 \rangle . \tag {4.179}
$$

Returning to Equation 4.177 (and using Equation 4.142), we conclude that

$$
S ^ {2} | 1 0 \rangle = \left(\frac {3 \hbar^ {2}}{4} + \frac {3 \hbar^ {2}}{4} + 2 \frac {\hbar^ {2}}{4}\right) | 1 0 \rangle = 2 \hbar^ {2} | 1 0 \rangle , \tag {4.180}
$$

so $|10\rangle$ is indeed an eigenstate of $S^2$ with eigenvalue $2\hbar^2$; and

$$
S^2 |00\rangle = \left(\frac{3\hbar^2}{4} + \frac{3\hbar^2}{4} - 2\frac{3\hbar^2}{4}\right) |00\rangle = 0, \tag{4.181}
$$

so $|00\rangle$ is an eigenstate of $S^2$ with eigenvalue 0. (I will leave it for you to confirm that $|11\rangle$ and $|1-1\rangle$ are eigenstates of $S^2$, with the appropriate eigenvalue—see Problem 4.37(c).)

What we have just done (combining spin 1/2 with spin 1/2 to get spin 1 and spin 0) is the simplest example of a larger problem: If you combine spin $s_1$ with spin $s_2$, what total spins $s$ can you get? The answer is that you get every spin from $(s_1 + s_2)$ down to $(s_1 - s_2)$—or $(s_2 - s_1)$, if $s_2 &gt; s_1$—in integer steps:

$$
s = (s_1 + s_2), (s_1 + s_2 - 1), (s_1 + s_2 - 2), \dots, |s_1 - s_2|. \tag{4.182}
$$

(Roughly speaking, the highest total spin occurs when the individual spins are aligned parallel to one another, and the lowest occurs when they are antiparallel.) For example, if you package together a particle of spin 3/2 with a particle of spin 2, you could get a total spin of 7/2, 5/2, 3/2, or 1/2, depending on the configuration. Another example: If a hydrogen atom is in the state $\psi_{n\ell m}$, the net angular momentum of the electron (spin plus orbital) is $\ell + 1/2$ or $\ell - 1/2$; if you now throw in spin of the proton, the atom's total angular momentum quantum number is $\ell + 1$, $\ell$, or $\ell - 1$ (and $\ell$ can be achieved in two distinct ways, depending on whether the electron alone is in the $\ell + 1/2$ configuration or the $\ell - 1/2$ configuration).

The combined state $|sm\rangle$ with total spin $s$ and $z$-component $m$ will be some linear combination of the composite states $|s_1s_2m_1m_2\rangle$:

$$
|sm\rangle = \sum_{m_1 + m_2 = m} C_{m_1m_2m}^{s_1s_2s} |s_1s_2m_1m_2\rangle \tag{4.183}
$$

(because the $z$-components add, the only composite states that contribute are those for which $m_1 + m_2 = m$). Equations 4.175 and 4.176 are special cases of this general form, with $s_1 = s_2 = 1/2$. The constants $C_{m_1m_2m}^{s_1s_2s}$ are called Clebsch-Gordan coefficients. A few of the simplest cases are listed in Table 4.8. For example, the shaded column of the $2 \times 1$ table tells us that

$$
|30\rangle = \frac{1}{\sqrt{5}} |21\rangle |1-1\rangle + \sqrt{\frac{3}{5}} |20\rangle |10\rangle + \frac{1}{\sqrt{5}} |2-1\rangle |11\rangle.
$$

If two particles (of spin 2 and spin 1) are at rest in a box, and the total spin is 3, and its $z$ component is 0, then a measurement of $S_z^{(1)}$ could return the value $\hbar$ (with probability 1/5), or 0 (with probability 3/5), or $-\hbar$ (with probability 1/5). Notice that the probabilities add up to 1 (the sum of the squares of any column on the Clebsch-Gordan table is 1).

These tables also work the other way around:

$$
|s_1s_2m_1m_2\rangle = \sum_s C_{m_1m_2m}^{s_1s_2s} |sm\rangle, \quad (m = m_1 + m_2). \tag{4.184}
$$

For example, the shaded row in the $3/2 \times 1$ table tells us that

225

$$
\left| \frac {3}{2} 1 \frac {1}{2} 0 \right\rangle = \sqrt {\frac {3}{5}} \left| \frac {5}{2} \frac {1}{2} \right\rangle + \sqrt {\frac {1}{1 5}} \left| \frac {3}{2} \frac {1}{2} \right\rangle - \sqrt {\frac {1}{3}} \left| \frac {1}{2} \frac {1}{2} \right\rangle .
$$

If you put particles of spin  $3/2$  and spin 1 in the box, and you know that the first has  $m_1 = 1/2$  and the second has  $m_2 = 0$  (so  $m$  is necessarily  $1/2$ ), and you measured the total spin,  $s$ , you could get  $5/2$  (with probability  $3/5$ ), or  $3/2$  (with probability  $1/15$ ), or  $1/2$  (with probability  $1/3$ ). Again, the sum of the probabilities is 1 (the sum of the squares of each row on the Clebsch-Gordan table is 1).

Table 4.8: Clebsch-Gordan coefficients. (A square root sign is understood for every entry; the minus sign, if present, goes outside the radical.)

![img-85.jpeg](img-85.jpeg)

If you think this is starting to sound like mystical numerology, I don't blame you. We will not be using the Clebsch-Gordan tables much in the rest of the book, but I wanted you to know where they fit into the scheme of things, in case you encounter them later on. In a mathematical sense this is all applied group theory —what we are talking about is the decomposition of the direct product of two irreducible representations of the rotation group into a direct sum of irreducible representations (you can quote that, to impress your friends).

# Problem 4.37

(a) Apply  $S_{-}$  to  $|10\rangle$  (Equation 4.175), and confirm that you get  $\sqrt{2} h|1 - 1\rangle$ .
(b) Apply  $S_{\pm}$  to  $|00\rangle$  (Equation 4.176), and confirm that you get zero.
(c) Show that  $|11\rangle$  and  $|1 - 1\rangle$  (Equation 4.175) are eigenstates of  $S^2$ , with the appropriate eigenvalue.

Problem 4.38 Quarks carry spin  $1/2$ . Three quarks bind together to make a baryon (such as the proton or neutron); two quarks (or more precisely a quark and an antiquark) bind together to make a meson (such as the pion or the kaon). Assume the quarks are in the ground state (so the orbital angular momentum is zero).

(a) What spins are possible for baryons?
(b) What spins are possible for mesons?

Problem 4.39 Verify Equations 4.175 and 4.176 using the Clebsch-Gordan table.

# Problem 4.40

(a) A particle of spin 1 and a particle of spin 2 are at rest in a configuration such that the total spin is 3, and its  $z$  component is  $\pmb{\gamma}_{b}$ . If you measured the  $z$ -component of the angular momentum of the spin-2 particle, what values might you get, and what is the probability of each one? Comment: Using Clebsch-Gordan tables is like driving a stick-shift—scary and frustrating when you start out, but easy once you get the hang of it.
(b) An electron with spin down is in the state  $\psi_{510}$  of the hydrogen atom. If you could measure the total angular momentum squared of the electron alone (not including the proton spin), what values might you get, and what is the probability of each?

Problem 4.41 Determine the commutator of  $S^2$  with  $S_{\xi}^{(1)}$  (where  $\mathbf{S} \equiv \mathbf{S}^{(1)} + \mathbf{S}^{(2)}$ ). Generalize your result to show that

$$
\left[ S ^ {2}, \mathbf {S} ^ {(1)} \right] = 2 i \hbar \left(\mathbf {S} ^ {(1)} \times \mathbf {S} ^ {(2)}\right). \tag {4.185}
$$

Comment: Because  $S_{\xi}^{(1)}$  does not commute with  $S^2$ , we cannot hope to find states that are simultaneous eigenvectors of both. In order to form eigenstates of  $S^2$  we need linear combinations of eigenstates of  $S_{\xi}^{(1)}$ . This is precisely what the Clebsch-Gordan coefficients (in Equation 4.183) do for us. On the other hand, it follows by obvious inference from Equation 4.185 that the sum  $\mathbf{S}^{(1)} + \mathbf{S}^{(2)}$  does commute with  $S^2$ , which only confirms what we already knew (see Equation 4.103).

228
## 4.5 Electromagnetic Interactions

229

## 4.5.1 Minimal Coupling

In classical electrodynamics$^{55}$ the force on a particle of charge $q$ moving with velocity $\mathbf{v}$ through electric and magnetic fields $\mathbf{E}$ and $\mathbf{B}$ is given by the Lorentz force law:

$$
\mathbf{F} = q \left(\mathbf{E} + \mathbf{v} \times \mathbf{B}\right). \tag{4.186}
$$

This force cannot be expressed as the gradient of a scalar potential energy function, and therefore the Schrödinger equation in its original form (Equation 1.1) cannot accommodate it. But in the more sophisticated form

$$
i \hbar \frac{\partial \Psi}{\partial t} = \hat{H} \Psi \tag{4.187}
$$

there is no problem. The classical Hamiltonian for a particle of charge $q$ and momentum $\mathbf{p}$, in the presence of electromagnetic fields is$^{56}$

$$
H = \frac{1}{2m} \left(\mathbf{p} - q \mathbf{A}\right)^2 + q \varphi, \tag{4.188}
$$

where $\mathbf{A}$ is the vector potential and $\varphi$ is the scalar potential:

$$
\mathbf{E} = -\nabla \varphi - \partial \mathbf{A} / \partial t, \quad \mathbf{B} = \nabla \times \mathbf{A}. \tag{4.189}
$$

Making the standard substitution $\mathbf{p} \rightarrow -i\hbar \nabla$, we obtain the Hamiltonian operator$^{57}$

$$
\hat{H} = \frac{1}{2m} \left(-i\hbar \nabla - q \mathbf{A}\right)^2 + q \varphi, \tag{4.190}
$$

and the Schrödinger equation becomes

$$
i \hbar \frac{\partial \Psi}{\partial t} = \left[ \frac{1}{2m} \left(-i\hbar \nabla - q \mathbf{A}\right)^2 + q \varphi \right] \Psi. \tag{4.191}
$$

This is the quantum implementation of the Lorentz force law; it is sometimes called the minimal coupling rule.$^{58}$

***

### Problem 4.42

(a) Using Equation 4.190 and the generalized Ehrenfest theorem (3.73), show that

$$
\frac{d \langle \mathbf{r} \rangle}{dt} = \frac{1}{m} \langle (\mathbf{p} - q \mathbf{A}) \rangle. \tag{4.192}
$$

Hint: This stands for three equations—one for each component. Work it out for, say, the $x$ component, and then generalize your result.

(b) As always (see Equation 1.32) we identify $d \langle \mathbf{r} \rangle / dt$ with $\langle \mathbf{v} \rangle$. Show that$^{59}$

$$
m \frac{d \langle \mathbf{v} \rangle}{dt} = q \langle \mathbf{E} \rangle + \frac{q}{2m} \langle (\mathbf{p} \times \mathbf{B} - \mathbf{B} \times \mathbf{p}) \rangle - \frac{q^2}{m} \langle (\mathbf{A} \times \mathbf{B}) \rangle. \tag{4.193}
$$

(c) In particular, if the fields  $\mathbf{E}$  and  $\mathbf{B}$  are uniform over the volume of the wave packet, show that

$$
m \frac {d \langle \mathbf {v} \rangle}{d t} = q (\mathbf {E} + \langle \mathbf {v} \rangle \times \mathbf {B}), \tag {4.194}
$$

so the expectation value of  $\mathbf{v}$  moves according to the Lorentz force law, as we would expect from Ehrenfest's theorem.

***

Problem 4.43 Suppose

$$
\mathbf {A} = \frac {B _ {0}}{2} (x \hat {j} - y \hat {t}), \quad \text {and} \quad \varphi = K z ^ {2},
$$

where  $B_0$  and  $K$  are constants.

(a) Find the fields  $\mathbf{E}$  and  $\mathbf{B}$ .
(b) Find the allowed energies, for a particle of mass  $m$  and charge  $q$ , in these fields. Answer:

$$
E \left(n _ {1}, n _ {2}\right) = \left(n _ {1} + \frac {1}{2}\right) \hbar \omega_ {1} + \left(n _ {2} + \frac {1}{2}\right) \hbar \omega_ {2}, \quad \left(n _ {1}, n _ {2} = 0, 1, 2, \dots\right), \tag {4.195}
$$

where  $\omega_{1} \equiv qB_{0} / m$  and  $\omega_{2} \equiv \sqrt{2qK / m}$ . Comment: In two dimensions ( $x$  and  $y$ , with  $K = 0$ ) this is the quantum analog to cyclotron motion;  $\omega_{1}$  is the classical cyclotron frequency, and  $\omega_{2}$  is zero. The allowed energies,  $\left(n_{1} + \frac{1}{2}\right)\hbar \omega_{1}$ , are called Landau Levels. $^{60}$

231

## 4.5.2 The Aharonov-Bohm Effect

In classical electrodynamics the potentials $\mathbf{A}$ and $\varphi$ are not uniquely determined; the *physical* quantities are the *fields*, $\mathbf{E}$ and $\mathbf{B}$. Specifically, the potentials

$$
\varphi' \equiv \varphi - \frac{\partial \Lambda}{\partial t}, \quad \mathbf{A}' \equiv \mathbf{A} + \nabla \Lambda \tag{4.196}
$$

(where $\Lambda$ is an arbitrary real function of position and time) yield the same fields as $\varphi$ and $\mathbf{A}$. (Check that for yourself, using Equation 4.189.) Equation 4.196 is called a *gauge transformation*, and the theory is said to be *gauge invariant*.

In quantum mechanics the potentials play a more direct role (it is they, not the fields, that appear in the Equation 4.191), and it is of interest to ask whether the theory remains gauge invariant. It is easy to show (Problem 4.44) that

$$
\Psi' \equiv e^{iq \Lambda / \hbar} \Psi \tag{4.197}
$$

satisfies Equation 4.191 with the gauge-transformed potentials $\varphi'$ and $\mathbf{A}'$ (Equation 4.196). Since $\Psi'$ differs from $\Psi$ only by a *phase factor*, it represents the same physical state, and in this sense the theory *is* gauge invariant. For a long time it was taken for granted that there could be no electromagnetic influences in regions where $\mathbf{E}$ and $\mathbf{B}$ are zero—any more than there can be in the classical theory. But in 1959 Aharonov and Bohm showed that the vector potential *can* affect the quantum behavior of a charged particle, *even when the particle is confined to a region where the field itself is zero*.

### Example 4.6

Imagine a particle constrained to move in a circle of radius $b$ (a bead on a wire ring, if you like). Along the axis runs a solenoid of radius $a &lt; b$, carrying a steady electric current $I$ (see Figure 4.16). If the solenoid is extremely long, the magnetic field inside it is uniform, and the field outside is zero. But the vector potential outside the solenoid is *not* zero; in fact (adopting the convenient gauge condition $\nabla \cdot \mathbf{A} = 0$),

$$
\mathbf{A} = \frac{\Phi}{2\pi r} \hat{\phi}, \quad (r &gt; a), \tag{4.198}
$$

where $\Phi = \pi a^2 B$ is the *magnetic flux* through the solenoid. Meanwhile, the solenoid itself is uncharged, so the scalar potential $\varphi$ is zero. In this case the Hamiltonian (Equation 4.190) becomes

$$
\hat{H} = \frac{1}{2m} \left[ -\hbar^2 \nabla^2 + q^2 A^2 + 2i \hbar q \mathbf{A} \cdot \nabla \right] \tag{4.199}
$$

(Problem 4.45(a)). But the wave function depends only on the azimuthal angle $\phi$ ($\theta = \pi/2$ and $r = b$), so $\nabla \rightarrow \left( \hat{\phi}/b \right) (d/d\phi)$, and the Schrödinger equation reads

$$
\frac{1}{2m} \left[ -\frac{\hbar^2}{b^2} \frac{d^2}{d\phi^2} + \left( \frac{q \Phi}{2\pi b} \right)^2 + i \frac{\hbar q \Phi}{\pi b^2} \frac{d}{d\phi} \right] \psi(\phi) = E \psi(\phi). \tag{4.200}
$$

![img-86.jpeg](img-86.jpeg)
Figure 4.16: Charged bead on a circular ring through which a long solenoid passes.

This is a linear differential equation with constant coefficients:

$$
\frac {d ^ {2} \psi}{d \phi^ {2}} - 2 i \beta \frac {d \psi}{d \phi} + \epsilon \psi = 0, \tag {4.201}
$$

where

$$
\beta \equiv \frac {q \Phi}{2 \pi \hbar} \quad \text {and} \quad \epsilon \equiv \frac {2 m b ^ {2} E}{\hbar^ {2}} - \beta^ {2}. \tag {4.202}
$$

Solutions are of the form

$$
\psi = A e ^ {i \lambda \phi}, \tag {4.203}
$$

with

$$
\lambda = \beta \pm \sqrt {\beta^ {2} + \epsilon} = \beta \pm \frac {b}{\hbar} \sqrt {2 m E}. \tag {4.204}
$$

Continuity of  $\psi (\phi)$  , at  $\phi = 2\pi$  , requires that  $\lambda$  be an integer:

$$
\beta \pm \frac {b}{\hbar} \sqrt {2 m E} = n, \tag {4.205}
$$

and it follows that

$$
E _ {n} = \frac {\hbar^ {2}}{2 m b ^ {2}} \left(n - \frac {q \Phi}{2 \pi \hbar}\right) ^ {2}, \quad (n = 0, \pm 1, \pm 2, \dots). \tag {4.206}
$$

The solenoid lifts the two-fold degeneracy of the bead-on-a-ring (Problem 2.46): positive  $n$ , representing a particle traveling in the same direction as the current in the solenoid, has a somewhat lower energy (assuming  $q$  is positive) than negative  $n$ , describing a particle traveling in the opposite direction. More important, the allowed energies clearly depend on the field inside the solenoid, even though the field at the location of the particle is zero!

More generally, suppose a particle is moving through a region where $\mathbf{B}$ is zero (so $\nabla \times \mathbf{A} \equiv \mathbf{0}$), but $\mathbf{A}$ itself is not. (I'll assume that $\mathbf{A}$ is static, although the method can be generalized to time-dependent potentials.) The Schrödinger equation,

233

$$
\left[ \frac {1}{2 m} (- i \hbar \nabla - q \mathbf {A}) ^ {2} \right] \Psi = i \hbar \frac {\partial \Psi}{\partial t}, \tag {4.207}
$$

can be simplified by writing

$$
\Psi = e ^ {i g} \Psi^ {\prime}, \tag {4.208}
$$

where

$$
g (\mathbf {r}) \equiv \frac {q}{\hbar} \int_ {\mathcal {O}} ^ {\mathbf {r}} \mathbf {A} \left(\mathbf {r} ^ {\prime}\right) \cdot d \mathbf {r} ^ {\prime}, \tag {4.209}
$$

and  $\mathcal{O}$  is some (arbitrarily chosen) reference point. (Note that this definition makes sense only when  $\nabla \times \mathbf{A} = \mathbf{0}$  throughout the region in question $^{66}$ —otherwise the line integral would depend on the path taken from  $\mathcal{O}$  to  $\mathbf{r}$ , and hence would not define a function of  $\mathbf{r}$ .) In terms of  $\psi'$ , the gradient of  $\psi$  is

$$
\nabla \Psi = e ^ {i g} (i \nabla g) \Psi^ {\prime} + e ^ {i g} (\nabla \Psi^ {\prime});
$$

but  $\nabla g = (q / \hbar)\mathbf{A}$  so

$$
\left(- i \hbar \nabla - q \mathbf {A}\right) \Psi = - i \hbar e ^ {i g} \nabla \Psi^ {\prime}, \tag {4.210}
$$

and it follows that

$$
\left(- i \hbar \nabla - q \mathbf {A}\right) ^ {2} \Psi = - \hbar^ {2} e ^ {i g} \nabla^ {2} \Psi^ {\prime} \tag {4.211}
$$

(Problem 4.45(b)). Putting this into Equation 4.207, and cancelling the common factor of  $e^{ig}$ , we are left with

$$
- \frac {\hbar^ {2}}{2 m} \nabla^ {2} \Psi^ {\prime} = i \hbar \frac {\partial \Psi^ {\prime}}{\partial t}. \tag {4.212}
$$

Evidently  $\psi'$  satisfies the Schrödinger equation without  $\mathbf{A}$ . If we can solve Equation 4.212, correcting for the presence of a (curl-free) vector potential will be trivial: just tack on the phase factor  $e^{ig}$ .

Aharonov and Bohm proposed an experiment in which a beam of electrons is split in two, and they pass either side of a long solenoid before recombining (Figure 4.17). The beams are kept well away from the solenoid itself, so they encounter only regions where  $\mathbf{B} = \mathbf{0}$ . But  $\mathbf{A}$ , which is given by Equation 4.198, is not zero, and the two beams arrive with different phases:67

$$
g = \frac {q}{\hbar} \int \mathbf {A} \cdot d \mathbf {r} = \frac {q \Phi}{2 \pi \hbar} \int \left(\frac {1}{r} \hat {\phi}\right) \cdot \left(r \hat {\phi} d \phi\right) = \pm \frac {q \Phi}{2 \hbar}. \tag {4.213}
$$

The plus sign applies to the electrons traveling in the same direction as A—which is to say, in the same direction as the current in the solenoid. The beams arrive out of phase by an amount proportional to the magnetic flux their paths encircle:

$$
\text {phase difference} = \frac {q \Phi}{\hbar}. \tag {4.214}
$$

This phase shift leads to measurable interference, which has been confirmed experimentally by Chambers and others.[68]

234

![img-87.jpeg](img-87.jpeg)
Figure 4.17: The Aharonov-Bohm effect: The electron beam splits, with half passing either side of a long solenoid.

What are we to make of the Aharonov-Bohm effect? It seems our classical preconceptions are simply mistaken: There can be electromagnetic effects in regions where the fields are zero. Note, however, that this does not make A itself measurable—only the enclosed flux comes into the final answer, and the theory remains gauge invariant.[69]

Problem 4.44 Show that  $\psi'$  (Equation 4.197) satisfies the Schrödinger equation (Equation 4.191 with the potentials  $\varphi'$  and  $\mathbf{A}'$  (Equation 4.196).

# Problem 4.45

(a) Derive Equation 4.199 from Equation 4.190.
(b) Derive Equation 4.211, starting with Equation 4.210.

Further Problems on Chapter 4

Problem 4.46 Consider the three-dimensional harmonic oscillator, for which the potential is

$$
V(r) = \frac{1}{2} m \omega^2 r^2. \tag{4.215}
$$

(a) Show that separation of variables in cartesian coordinates turns this into three one-dimensional oscillators, and exploit your knowledge of the latter to determine the allowed energies. Answer:

$$
E_n = \left(n + \frac{3}{2}\right) \hbar \omega. \tag{4.216}
$$

(b) Determine the degeneracy $d(n)$ of $E_n$.

Problem 4.47 Because the three-dimensional harmonic oscillator potential (see Equation 4.215) is spherically symmetrical, the Schrödinger equation can also be handled by separation of variables in spherical coordinates. Use the power series method (as in Sections 2.3.2 and 4.2.1) to solve the radial equation. Find the recursion formula for the coefficients, and determine the allowed energies. (Check that your answer is consistent with Equation 4.216.) How is $N$ related to $n$ in this case? Draw the diagram analogous to Figures 4.3 and 4.6, and determine the degeneracy of $n$th energy level.^[70]

Problem 4.48

(a) Prove the three-dimensional virial theorem:

$$
2 \langle T \rangle = \langle \mathbf{r} \cdot \nabla V \rangle \tag{4.217}
$$

(for stationary states). Hint: refer to Problem 3.37.

(b) Apply the virial theorem to the case of hydrogen, and show that

$$
\langle T \rangle = -E_n; \quad \langle V \rangle = 2E_n. \tag{4.218}
$$

(c) Apply the virial theorem to the three-dimensional harmonic oscillator (Problem 4.46), and show that in this case

$$
\langle T \rangle = \langle V \rangle = E_n / 2. \tag{4.219}
$$

Problem 4.49 Warning: Attempt this problem only if you are familiar with vector calculus. Define the (three-dimensional) probability current by generalization of Problem 1.14:

$$
\mathbf{J} \equiv \frac{i \hbar}{2m} \left(\Psi \nabla \Psi^* - \Psi^* \nabla \Psi\right). \tag{4.220}
$$

236

(a) Show that $\mathbf{J}$ satisfies the continuity equation

$$
\nabla \cdot \mathbf{J} = - \frac{\partial}{\partial t} |\Psi|^2, \tag{4.221}
$$

which expresses local conservation of probability. It follows (from the divergence theorem) that

$$
\oint_S \mathbf{J} \cdot d\mathbf{a} = - \frac{d}{dt} \int_\mathcal{V} |\Psi|^2 d^3\mathbf{r}, \tag{4.222}
$$

where $\mathcal{V}$ is a (fixed) volume and $S$ is its boundary surface. In words: The flow of probability out through the surface is equal to the decrease in probability of finding the particle in the volume.

(b) Find $\mathbf{J}$ for hydrogen in the state $n = 2, l = 1, m = 1$. Answer:

$$
\frac{\hbar}{64\pi m a^5} r e^{-r/a} \sin \theta \hat{\phi}.
$$

(c) If we interpret $m\mathbf{J}$ as the flow of mass, the angular momentum is

$$
\mathbf{L} = m \int (\mathbf{r} \times \mathbf{J}) d^3\mathbf{r}.
$$

Use this to calculate $L_z$ for the state $\psi_{211}$, and comment on the result.^[71]

Problem 4.50 The (time-independent) momentum space wave function in three dimensions is defined by the natural generalization of Equation 3.54:

$$
\phi(\mathbf{p}) \equiv \frac{1}{(2\pi\hbar)^{3/2}} \int e^{-i(\mathbf{p}\cdot\mathbf{r})/\hbar} \psi(\mathbf{r}) d^3\mathbf{r}. \tag{4.223}
$$

(a) Find the momentum space wave function for the ground state of hydrogen (Equation 4.80). Hint: Use spherical coordinates, setting the polar axis along the direction of $\mathbf{p}$. Do the $\theta$ integral first. Answer:

$$
\phi(\mathbf{p}) = \frac{1}{\pi} \left( \frac{2a}{\hbar} \right)^{3/2} \frac{1}{\left[ 1 + (ap/\hbar)^2 \right]^2}. \tag{4.224}
$$

(b) Check that $\phi(\mathbf{p})$ is normalized.

(c) Use $\phi(\mathbf{p})$ to calculate $\langle p^2\rangle$, in the ground state of hydrogen.

(d) What is the expectation value of the kinetic energy in this state? Express your answer as a multiple of $E_1$, and check that it is consistent with the virial theorem (Equation 4.218).

Problem 4.51 In Section 2.6 we noted that the finite square well (in one dimension) has at least one bound state, no matter how shallow or narrow it may be. In Problem 4.11 you showed that the finite spherical well (three dimensions) has no bound state, if the potential is sufficiently weak. Question: What about the finite circular well (two dimensions)? Show that (like the one-

dimensional case) there is always at least one bound state. Hint: Look up any information you need about Bessel functions, and use a computer to draw the graphs.

# Problem 4.52

(a) Construct the spatial wave function  $(\psi)$  for hydrogen in the state  $n = 3$ ,  $\ell = 2$ ,  $m = 1$ . Express your answer as a function of  $r$ ,  $\theta$ ,  $\phi$ , and  $a$  (the Bohr radius) only—no other variables  $(\rho, z, \text{etc.})$  or functions  $(Y, v, \text{etc.})$ , or constants  $(A, C_0, \text{etc.})$ , or derivatives, allowed ( $\pi$  is okay, and  $e$ , and  $2$ , etc.).
(b) Check that this wave function is properly normalized, by carrying out the appropriate integrals over  $r$ ,  $\theta$ , and  $\phi$ .
(c) Find the expectation value of  $r^s$  in this state. For what range of  $s$  (positive and negative) is the result finite?

# Problem 4.53

(a) Construct the wave function for hydrogen in the state  $n = 4$ ,  $\ell = 3$ ,  $m = 3$ . Express your answer as a function of the spherical coordinates  $r$ ,  $\theta$ , and  $\phi$ .
(b) Find the expectation value of  $r$  in this state. (As always, look up any nontrivial integrals.)
(c) If you could somehow measure the observable  $L_{x}^{2} + L_{y}^{2}$  on an atom in this state, what value (or values) could you get, and what is the probability of each?

Problem 4.54 What is the probability that an electron in the ground state of hydrogen will be found inside the nucleus?

(a) First calculate the exact answer, assuming the wave function (Equation 4.80) is correct all the way down to  $r = 0$ . Let  $b$  be the radius of the nucleus.
(b) Expand your result as a power series in the small number  $\epsilon \equiv 2b / a$ , and show that the lowest-order term is the cubic:  $P \approx (4 / 3)(b / a)^3$ . This should be a suitable approximation, provided that  $b \ll a$  (which it is).
(c) Alternatively, we might assume that  $\psi(r)$  is essentially constant over the (tiny) volume of the nucleus, so that  $P \approx (4/3)\pi b^3 |\psi(0)|^2$ . Check that you get the same answer this way.
(d) Use  $b \approx 10^{-15} \mathrm{~m}$  and  $a \approx 0.5 \times 10^{-10} \mathrm{~m}$  to get a numerical estimate for  $P$ . Roughly speaking, this represents the "fraction of its time that the electron spends inside the nucleus."

# Problem 4.55

(a) Use the recursion formula (Equation 4.76) to confirm that when  $\ell = n - 1$  the radial wave function takes the form

$$
R _ {n (n - 1)} = N _ {n} r ^ {n - 1} e ^ {- r / n a},
$$

and determine the normalization constant $N_{n}$ by direct integration.

(b) Calculate $\langle r\rangle$ and $\left\langle r^2\right\rangle$ for states of the form $\psi_{n(n - 1)nr}$
(c) Show that the "uncertainty" in $r(\sigma_r)$ is $\langle r\rangle / \sqrt{2n + 1}$ for such states. Note that the fractional spread in $r$ decreases, with increasing $n$ (in this sense the system "begins to look classical," with identifiable circular "orbits," for large $n$). Sketch the radial wave functions for several values of $n$, to illustrate this point.

Problem 4.56 Coincident spectral lines.²² According to the Rydberg formula (Equation 4.93) the wavelength of a line in the hydrogen spectrum is determined by the principal quantum numbers of the initial and final states. Find two distinct pairs $\{n_i, n_f\}$ that yield the same $\lambda$. For example, $\{6851, 6409\}$ and $\{15283, 11687\}$ will do it, but you're not allowed to use those!

Problem 4.57 Consider the observables $A = x^2$ and $B = L_z$.

(a) Construct the uncertainty principle for $\sigma_{A}\sigma_{B}$
(b) Evaluate $\sigma_{B}$ in the hydrogen state $\psi_{n\ell n\nu}$
(c) What can you conclude about $\langle xy\rangle$ in this state?

Problem 4.58 An electron is in the spin state

$$
\chi = A \left( \begin{array}{c} 1 - 2i \\ 2 \end{array} \right).
$$

(a) Determine the constant $A$ by normalizing $\chi$.
(b) If you measured $S_{z}$ on this electron, what values could you get, and what is the probability of each? What is the expectation value of $S_{z}$?
(c) If you measured $S_{x}$ on this electron, what values could you get, and what is the probability of each? What is the expectation value of $S_{x}$?
(d) If you measured $S_{y}$ on this electron, what values could you get, and what is the probability of each? What is the expectation value of $S_{y}$?

Problem 4.59 Suppose two spin-1/2 particles are known to be in the singlet configuration (Equation 4.176). Let $S_{a}^{(1)}$ be the component of the spin angular momentum of particle number 1 in the direction defined by the vector $\mathbf{a}$. Similarly, let $S_{b}^{(2)}$ be the component of 2's angular momentum in the direction $\mathbf{b}$. Show that

$$
\left\langle S_{a}^{(1)} S_{b}^{(2)} \right\rangle = - \frac{\hbar^{2}}{4} \cos \theta , \tag{4.225}
$$

where $\theta$ is the angle between $\mathbf{a}$ and $\mathbf{b}$.

Problem 4.60

(a) Work out the Clebsch–Gordan coefficients for the case $s_1 = 1/2$, $s_2 =$ anything. Hint: You're looking for the coefficients $A$ and $B$ in

$$
| s m \rangle = A \left| \frac {1}{2} s _ {2} \frac {1}{2} \left(m - \frac {1}{2}\right) \right\rangle + B \left| \frac {1}{2} s _ {2} \frac {- 1}{2} \left(m + \frac {1}{2}\right) \right\rangle ,
$$

such that  $|sm\rangle$  is an eigenstate of  $S^2$ . Use the method of Equations 4.177 through 4.180. If you can't figure out what  $S_x^{(2)}$  (for instance) does to  $|s_2m_2\rangle$ , refer back to Equation 4.136 and the line before Equation 4.147. Answer:

$$
A = \sqrt {\frac {s _ {2} \pm m + 1 / 2}{2 s _ {2} + 1}}; \quad B = \pm \sqrt {\frac {s _ {2} \mp m + 1 / 2}{2 s _ {2} + 1}},
$$

where the signs are determined by  $s = s_2 \pm 1/2$ .

(b) Check this general result against three or four entries in Table 4.8.

Problem 4.61 Find the matrix representing  $S_{x}$  for a particle of spin  $3/2$  (using as your basis the eigenstates of  $S_{z}$ ). Solve the characteristic equation to determine the eigenvalues of  $\mathbb{S}_{x}$ .

****

Problem 4.62 Work out the spin matrices for arbitrary spin  $s$ , generalizing spin  $1/2$  (Equations 4.145 and 4.147), spin 1 (Problem 4.34), and spin  $3/2$  (Problem 4.61). Answer:

$$
\mathbb {S} _ {z} = \hbar \left( \begin{array}{c c c c c} s &amp; 0 &amp; 0 &amp; \dots &amp; 0 \\ 0 &amp; s - 1 &amp; 0 &amp; \dots &amp; 0 \\ 0 &amp; 0 &amp; s - 2 &amp; \dots &amp; 0 \\ \vdots &amp; \vdots &amp; \vdots &amp; \dots &amp; \vdots \\ 0 &amp; 0 &amp; 0 &amp; \dots &amp; - s \end{array} \right);
$$

$$
\mathbb {S} _ {x} = \frac {\hbar}{2} \left( \begin{array}{c c c c c c c} 0 &amp; b _ {s} &amp; 0 &amp; 0 &amp; \dots &amp; 0 &amp; 0 \\ b _ {s} &amp; 0 &amp; b _ {s - 1} &amp; 0 &amp; \dots &amp; 0 &amp; 0 \\ 0 &amp; b _ {s - 1} &amp; 0 &amp; b _ {s - 2} &amp; \dots &amp; 0 &amp; 0 \\ 0 &amp; 0 &amp; b _ {s - 2} &amp; 0 &amp; \dots &amp; 0 &amp; 0 \\ \vdots &amp; \vdots &amp; \vdots &amp; \vdots &amp; \dots &amp; \vdots &amp; \vdots \\ 0 &amp; 0 &amp; 0 &amp; 0 &amp; \dots &amp; 0 &amp; b _ {- s + 1} \\ 0 &amp; 0 &amp; 0 &amp; 0 &amp; \dots &amp; b _ {- s + 1} &amp; 0 \end{array} \right)
$$

$$
\mathbb {S} _ {y} = \frac {\hbar}{2} \left( \begin{array}{c c c c c c c} 0 &amp; - i b _ {s} &amp; 0 &amp; 0 &amp; \dots &amp; 0 &amp; 0 \\ i b _ {s} &amp; 0 &amp; - i b _ {s - 1} &amp; 0 &amp; \dots &amp; 0 &amp; 0 \\ 0 &amp; i b _ {s - 1} &amp; 0 &amp; - i b _ {s - 2} &amp; \dots &amp; 0 &amp; 0 \\ 0 &amp; 0 &amp; i b _ {s - 2} &amp; 0 &amp; \dots &amp; 0 &amp; 0 \\ \vdots &amp; \vdots &amp; \vdots &amp; \vdots &amp; \dots &amp; \vdots &amp; \vdots \\ 0 &amp; 0 &amp; 0 &amp; 0 &amp; \dots &amp; 0 &amp; - i b _ {- s + 1} \\ 0 &amp; 0 &amp; 0 &amp; 0 &amp; \dots &amp; i b _ {- s + 1} &amp; 0 \end{array} \right)
$$

where

$$
b _ {j} \equiv \sqrt {(s + j) (s + 1 - j)}.
$$

***

Problem 4.63 Work out the normalization factor for the spherical harmonics, as follows. From Section 4.1.2 we know that

$$
Y _ {\ell} ^ {m} = K _ {\ell} ^ {m} e ^ {i m \phi} P _ {\ell} ^ {m} (\cos \theta);
$$

the problem is to determine the factor  $K_{\ell}^{m}$  (which I quoted, but did not derive, in Equation 4.32). Use Equations 4.120, 4.121, and 4.130 to obtain a recursion relation giving  $K_{\ell}^{m + 1}$  in terms of  $K_{\ell}^{m}$ . Solve it by induction on  $m$  to get  $K_{\ell}^{m}$  up to an overall constant,  $C(\ell) \equiv K_{\ell}^{0}$ . Finally, use the result of Problem 4.25 to fix the constant. You may find the following formula for the derivative of an associated Legendre function useful:

$$
\left(1 - x ^ {2}\right) \frac {d P _ {\ell} ^ {m}}{d x} = - \sqrt {1 - x ^ {2}} P _ {\ell} ^ {m + 1} - m x P _ {\ell} ^ {m}. \tag {4.226}
$$

Problem 4.64 The electron in a hydrogen atom occupies the combined spin and position state

$$
R _ {2 1} \left(\sqrt {1 / 3} Y _ {1} ^ {0} \chi_ {+} + \sqrt {2 / 3} Y _ {1} ^ {1} \chi_ {-}\right).
$$

(a) If you measured the orbital angular momentum squared  $(L^2)$ , what values might you get, and what is the probability of each?
(b) Same for the  $z$  component of orbital angular momentum  $(L_z)$ .
(c) Same for the spin angular momentum squared  $(S^2)$ .
(d) Same for the  $z$  component of spin angular momentum  $(S_z)$ .

Let  $\mathbf{J} \equiv \mathbf{L} + \mathbf{S}$  be the total angular momentum.

(e) If you measured  $j^2$ , what values might you get, and what is the probability of each?
(f) Same for  $J_{z}$ .
(g) If you measured the position of the particle, what is the probability density for finding it at  $r$ ,  $\theta$ ,  $\phi$ ?
(h) If you measured both the  $z$  component of the spin and the distance from the origin (note that these are compatible observables), what is the probability per unit  $r$  for finding the particle with spin up and at radius  $r$ ?

Problem 4.65 If you combine three spin-1/2 particles, you can get a total spin of  $3/2$  or  $1/2$  (and the latter can be achieved in two distinct ways). Construct the quadruplet and the two doublets, using the notation of Equations 4.175 and 4.176:

$$
\left\{ \begin{array}{l c l} \left| \frac {3}{2} \frac {3}{2} \right\rangle &amp; = &amp; ?? \\ \left| \frac {3}{2} \frac {1}{2} \right\rangle &amp; = &amp; ?? \\ \left| \frac {3}{2} \frac {- 1}{2} \right\rangle &amp; = &amp; ?? \\ \left| \frac {3}{2} \frac {- 3}{2} \right\rangle &amp; = &amp; ?? \end{array} \right. \quad s = \frac {3}{2} \quad (\text{quadruplet})
$$

$$
\left\{ \begin{array}{l c l} \left| \frac {1}{2} \frac {1}{2} \right\rangle_ {\mathrm {I}} &amp; = &amp; ?? \\ \left| \frac {1}{2} \frac {- 1}{2} \right\rangle_ {\mathrm {I}} &amp; = &amp; ?? \end{array} \right. \quad s = \frac {1}{2} \quad (\text{doublet 1})
$$

$$
\left\{ \begin{array}{l c l} \left| \frac {1}{2} \frac {1}{2} \right\rangle_ {2} &amp; = &amp; \text{??} \\ \left| \frac {1}{2} \frac {- 1}{2} \right\rangle_ {2} &amp; = &amp; \text{??} \end{array} \right\} \quad s = \frac {1}{2} \quad (\text{doublet 2})
$$

Hint: The first one is easy: $\left| \frac{3}{2} \frac{3}{2} \right\rangle = |\uparrow \uparrow \uparrow \rangle$; apply the lowering operator to get the other states in the quadruplet. For the doublets you might start with the first two in the singlet state, and tack on the third:

$$
\left| \frac {1}{2} \frac {1}{2} \right\rangle_ {1} = \frac {1}{\sqrt {2}} \left( \left| \uparrow \downarrow \right\rangle - \left| \downarrow \uparrow \right\rangle \right) \left| \uparrow \right\rangle .
$$

Take it from there (make sure $\left| \frac{1}{2} \frac{1}{2} \right\rangle_2$ is orthogonal to $\left| \frac{1}{2} \frac{1}{2} \right\rangle_1$ and to $\left| \frac{3}{2} \frac{1}{2} \right\rangle$). Note: the two doublets are not uniquely determined—any linear combination of them would still carry spin 1/2. The point is to construct two independent doublets.

Problem 4.66 Deduce the condition for minimum uncertainty in $S_{x}$ and $S_{y}$ (that is, equality in the expression $\sigma_{S_x}\sigma_{S_y}\geq (\hbar /2)\left|\langle S_z\rangle \right|$), for a particle of spin 1/2 in the generic state (Equation 4.139). Answer: With no loss of generality we can pick $a$ to be real; then the condition for minimum uncertainty is that $b$ is either pure real or else pure imaginary.

Problem 4.67 Magnetic frustration. Consider three spin-1/2 particles arranged on the corners of a triangle and interacting via the Hamiltonian

$$
H = J \left( \mathbf{S}_1 \cdot \mathbf{S}_2 + \mathbf{S}_2 \cdot \mathbf{S}_3 + \mathbf{S}_3 \cdot \mathbf{S}_1 \right), \tag{4.227}
$$

where $J$ is a positive constant. This interaction favors opposite alignment of neighboring spins (antiferromagnetism, if they are magnetic dipoles), but the triangular arrangement means that this condition cannot be satisfied simultaneously for all three pairs (Figure 4.18). This is known as geometrical "frustration."

(a) Show that the Hamiltonian can be written in terms of the square of the total spin, $S^2$, where $\mathbf{S} = \sum_{i} \mathbf{S}_{i}$.

(b) Determine the ground state energy, and its degeneracy.

(c) Now consider four spin-1/2 particles arranged on the corners of a square, and interacting with their nearest neighbors:

$$
H = J \left( \mathbf{S}_1 \cdot \mathbf{S}_2 + \mathbf{S}_2 \cdot \mathbf{S}_3 + \mathbf{S}_3 \cdot \mathbf{S}_4 + \mathbf{S}_4 \cdot \mathbf{S}_1 \right). \tag{4.228}
$$

In this case there is a unique ground state. Show that the Hamiltonian in this case can be written

$$
H = \frac {1}{2} J \left[ S^2 - \left( \mathbf{S}_1 + \mathbf{S}_3 \right)^2 - \left( \mathbf{S}_2 + \mathbf{S}_4 \right)^2 \right]. \tag{4.229}
$$

What is the ground state energy?

![img-88.jpeg](img-88.jpeg)
Figure 4.18: The figure shows three spins arranged around a triangle, where there is no way for each spin to be anti-aligned with all of its neighbors. In contrast, there is no such frustration with four spins arranged around a square.

![img-89.jpeg](img-89.jpeg)

Problem 4.68 Imagine a hydrogen atom at the center of an infinite spherical well of radius  $b$ . We will take  $b$  to be much greater than the Bohr radius  $(a)$ , so the low-  $n$  states are not much affected by the distant "wall" at  $r = b$ . But since  $u(b) = 0$  we can use the method of Problem 2.61 to solve the radial equation (4.53) numerically.

(a) Show that  $v_{j}$  (in Problem 2.61) takes the form

$v_{j} = -\frac{2\beta}{j} + \frac{\ell(\ell + 1)}{j^{2}} \quad \text{where} \quad \beta \equiv \frac{b}{(N + 1)a}$ .

(b) We want  $\Delta r \ll a$  (so as to sample a reasonable number of points within the potential) and  $a \ll b$  (so the wall doesn't distort the atom too much). Thus

$1\ll \beta^{-1}\ll N$

Let's use  $\beta = 1 / 50$  and  $N = 1000$ . Find the three lowest eigenvalues of  $\mathsf{H}$ , for  $\ell = 0$ ,  $\ell = 1$ , and  $\ell = 2$ , and plot the corresponding eigenfunctions. Compare the known (Bohr) energies (Equation 4.70). Note: Unless the wave function drops to zero well before  $r = b$ , the energies of this system cannot be expected to match those of free hydrogen, but they are of interest in their own right as allowed energies of "compressed" hydrogen.[73]

Problem 4.69 Find a few of the Bohr energies for hydrogen by "wagging the dog" (Problem 2.55), starting with Equation 4.53—or, better yet, Equation 4.56; in fact, why not use Equation 4.68 to set  $\rho_0 = 2n$ , and tweak  $n$ ? We know that the correct solutions occur when  $n$  is a positive integer, so you might start with  $n = 0, 9, 1.9, 2.9$ , etc., and increase it in small increments—the tail should wag when you pass 1, 2, 3, ... Find the lowest three  $ns$ , to four significant digits, first for  $\ell = 0$ , and then for  $\ell = 1$  and  $\ell = 2$ . Warning: Mathematica doesn't like to divide by zero, so you might change  $\rho$  to  $(\rho + 0.000001)$  in the denominator. Note:  $u(0) = 0$  in all cases, but  $u'(0) = 0$  only for  $\ell \geq 1$  (Equation 4.59). So for  $\ell = 0$  you can use  $u(0) = 0$ ,  $u'(0) = 1$ . For  $\ell &gt; 0$  you might be tempted to use  $u(0) = 0$  and  $u'(0) = 0$ , but Mathematica is

lazy, and will go for the trivial solution $u(\rho) \equiv 0$ better, therefore, to use (say) $u(1) = 1$ and $u'(0) = 0$.

## Problem 4.70 Sequential Spin Measurements.

(a) At time $t = 0$ a large ensemble of spin-1/2 particles is prepared, all of them in the spin-up state (with respect to the $z$ axis).²⁴ They are not subject to any forces or torques. At time $t_1 &gt; 0$ each spin is measured—some along the $z$ direction and others along the $x$ direction (but we aren't told the results). At time $t_2 &gt; t_1$ their spin is measured again, this time along the $x$ direction, and those with spin up (along $x$) are saved as a subensemble (those with spin down are discarded). Question: Of those remaining (the subensemble), what fraction had spin up (along $z$ or $x$, depending on which was measured) in the first measurement?

(b) Part (a) was easy—trivial, really, once you see it. Here's a more pithy generalization: At time $t = 0$ an ensemble of spin-1/2 particles is prepared, all in the spin-up state along direction a. At time $t_1 &gt; 0$ their spins are measured along direction b (but we are not told the results), and at time $t_2 &gt; t_1$ their spins are measured along direction c. Those with spin up (along c) are saved as a subensemble. Of the particles in this subensemble, what fraction had spin up (along b) in the first measurement? Hint: Use Equation 4.155 to show that the probability of getting spin up (along b) in the first measurement is $P_{+} = \cos^2 (\theta_{ab} / 2)$, and (by extension) the probability of getting spin up in both measurements is $P_{++} = \cos^2 (\theta_{ab} / 2)\cos^2 (\theta_{bc} / 2)$. Find the other three probabilities $(P_{+-}, P_{+-},$ and $P_{--})$. Beware: If the outcome of the first measurement was spin down, the relevant angle is now the supplement of $\theta_{bc}$. Answer: $\left[1 + \tan^2 (\theta_{ab} / 2)\tan^2 (\theta_{bc} / 2)\right]^{-1}$.

## Problem 4.71 In molecular and solid-state applications, one often uses a basis of orbitals aligned with the cartesian axes rather than the basis $\psi_{n\ell m}$ used throughout this chapter. For example, the orbitals

$$
\psi_{2p_x}(r, \theta, \phi) = \frac{1}{\sqrt{32\pi a^3}} \frac{x}{a} e^{-r/2a}
$$

$$
\psi_{2p_y}(r, \theta, \phi) = \frac{1}{\sqrt{32\pi a^3}} \frac{y}{a} e^{-r/2a}
$$

$$
\psi_{2p_z}(r, \theta, \phi) = \frac{1}{\sqrt{32\pi a^3}} \frac{z}{a} e^{-r/2a}
$$

are a basis for the hydrogen states with $n = 2$ and $\ell = 1$.

(a) Show that each of these orbitals can be written as a linear combination of the orbitals $\psi_{n\ell m}$ with $n = 2, \ell = 1$, and $m = -1, 0, 1$.

(b) Show that the states $\psi_{2p_i}$ are eigenstates of the corresponding component of angular momentum: $\hat{L}_\ell$ What is the eigenvalue in each case.

244

(c) Make contour plots (as in Figure 4.9) for the three orbitals. In Mathematica use ContourPlot3D.

Problem 4.72 Consider a particle with charge  $q$ , mass  $m$ , and spin  $s$ , in a uniform magnetic field  $\mathbf{B}_0$ . The vector potential can be chosen as

$$
\mathbf {A} = - \frac {1}{2} \mathbf {r} \times \mathbf {B} _ {0}.
$$

(a) Verify that this vector potential produces a uniform magnetic field  $\mathbf{B}_0$ .
(b) Show that the Hamiltonian can be written

$$
H = \frac {p ^ {2}}{2 m} + q \varphi - \mathbf {B} _ {0} \cdot \left(\gamma_ {o} \mathbf {L} + \gamma \mathbf {S}\right) + \frac {q ^ {2}}{8 m} \left[ r ^ {2} B _ {0} ^ {2} - \left(\mathbf {r} \cdot \mathbf {B} _ {0}\right) ^ {2} \right], \tag {4.230}
$$

where  $\gamma_{o} = q / 2m$  is the gyromagnetic ratio for orbital motion.

Note: The term linear in  $\mathbf{B}_0$  makes it energetically favorable for the magnetic moments (orbital and spin) to align with the magnetic field; this is the origin of paramagnetism in materials. The term quadratic in  $\mathbf{B}_0$  leads to the opposite effect: diamagnetism.[73]

Problem 4.73 Example 4.4, couched in terms of forces, was a quasi-classical explanation for the Stern-Gerlach effect. Starting from the Hamiltonian for a neutral, spin-1/2 particle traveling through the magnetic field given by Equation 4.169,

$$
H = \frac {p ^ {2}}{2 m} - \gamma \mathbf {B} \cdot \mathbf {S},
$$

use the generalized Ehrenfest theorem (Equation 3.73) to show that

$$
m \frac {d ^ {2}}{d t ^ {2}} \left\langle z \right\rangle = \gamma \alpha \left\langle S _ {z} \right\rangle .
$$

Comment: Equation 4.170 is therefore a correct quantum-mechanical statement, with the understanding that the quantities refer to expectation values.

Problem 4.74 Neither Example 4.4 nor Problem 4.73 actually solved the Schrödinger equation for the Stern-Gerlach experiment. In this problem we will see how to set up that calculation. The Hamiltonian for a neutral, spin-1/2 particle traveling through a Stern-Gerlach device is

$$
H = \frac {p ^ {2}}{2 m} - \gamma \mathbf {B} \cdot \mathbf {S}
$$

where  $\mathbf{B}$  is given by Equation 4.169. The most general wave function for a spin-  $1 / 2$  particle—including both spatial and spin degrees of freedom—is $^{78}$

$$
\Psi (\mathbf {r}, t) = \Psi_ {+} (\mathbf {r}, t) \chi_ {+} + \Psi_ {-} (\mathbf {r}, t) \chi_ {-}.
$$

(a) Put  $\Psi (\mathbf{r},t)$  into the Schrodinger equation

$$
H \boldsymbol {\Psi} = i \hbar \frac {\partial}{\partial t} \boldsymbol {\Psi}
$$

to obtain a pair of coupled equations for  $\Psi_{\pm}$ . Partial answer:

$$
- \frac {\hbar^ {2}}{2 m} \nabla^ {2} \Psi_ {+} - \frac {\hbar}{2} \gamma (B _ {0} + \alpha z) \Psi_ {+} + \frac {\hbar}{2} \gamma \alpha x \Psi_ {-} = i \hbar \frac {\partial}{\partial t} \Psi_ {+}.
$$

(b) We know from Example 4.3 that the spin will precess in a uniform field  $B_0\mathring{k}$ . We can factor this behavior out of our solution—with no loss of generality—by writing

$$
\Psi_ {\pm} (\mathbf {r}, t) = e ^ {\pm i \gamma B _ {0} t / 2} \tilde {\Psi} (\mathbf {r}, t).
$$

Find the coupled equations for  $\tilde{\Psi}_{\pm}$ . Partial answer:

$$
- \frac {\hbar^ {2}}{2 m} \nabla^ {2} \tilde {\Psi} _ {+} - \frac {\hbar}{2} \gamma \alpha z \tilde {\Psi} _ {+} + \frac {\hbar}{2} \gamma \alpha x e ^ {- i \gamma B _ {0} t} \tilde {\Psi} _ {-} = i \hbar \frac {\partial}{\partial t} \tilde {\Psi} _ {+}.
$$

(c) If one ignores the oscillatory term in the solution to (b)—on the grounds that it averages to zero (see discussion in Example 4.4)—one obtains uncoupled equations of the form

$$
- \frac {\hbar^ {2}}{2 m} \nabla^ {2} \tilde {\Psi} _ {\pm} + V _ {\pm} \tilde {\Psi} _ {\pm} = i \hbar \frac {\partial}{\partial t} \tilde {\Psi} _ {\pm}.
$$

Based upon the motion you would expect for a particle in the "potential"  $V_{\pm}$ , explain the Stern-Gerlach experiment.

Problem 4.75 Consider the system of Example 4.6, now with a time-dependent flux  $\Phi(t)$  through the solenoid. Show that

$$
\Psi (t) = \frac {1}{\sqrt {2 \pi}} e ^ {i n \phi} e ^ {- i f (t)}
$$

with

$$
f (t) = \frac {1}{\hbar} \int_ {0} ^ {t} \frac {\hbar^ {2}}{2 m b ^ {2}} \left(n - \frac {q \Phi (t ^ {\prime})}{2 \pi \hbar}\right) ^ {2} d t ^ {\prime}
$$

is a solution to the time-dependent Schrödinger equation.

Problem 4.76 The shift in the energy levels in Example 4.6 can be understood from classical electrodynamics. Consider the case where initially no current flows in the solenoid. Now imagine slowly increasing the current.

(a) Calculate (from classical electrodynamics) the emf produced by the changing flux and show that the rate at which work is done on the charge confined to the ring can be written

$$
\frac {d W}{d \Phi} = - q \frac {\omega}{2 \pi},
$$

where $\omega$ is the angular velocity of the particle.

(b) Calculate the $z$ component of the mechanical angular momentum, $^{22}$

$$
\mathbf {L} _ {\text {mechanical}} = \mathbf {r} \times m \mathbf {v} = \mathbf {r} \times (\mathbf {p} - q \mathbf {A}), \tag {4.231}
$$

for a particle in the state $\psi_{n}$ in Example 4.6. Note that the mechanical angular momentum is not quantized in integer multiples of $p$. $^{28}$

(c) Show that your result from part (a) is precisely equal to the rate at which the stationary state energies change as the flux is increased: $dE_{n} / d\Phi$.

In principle, this can be obtained by change of variables from the cartesian expression 4.5. However, there are much more efficient ways of getting it; see, for instance, M. Boas, *Mathematical Methods in the Physical Sciences* 3rd edn, Wiley, New York (2006), Chapter 10, Section 9.

2 Note that there is no loss of generality here—at this stage $\xi$ could be any complex number. Later on we'll discover that $\xi$ must in fact be an integer, and it is in anticipation of that result that I express the separation constant in a way that looks peculiar now.

3 Again, there is no loss of generality here, since at this stage $m$ could be any complex number; in a moment, though, we will discover that $m$ must in fact be an integer. *Brucare*: The letter $m$ is now doing double duty, as *mass* and as a separation constant. There is no graceful way to avoid this confusion, since both uses are standard. Some authors now switch to $M$ or $\mu$ for mass, but I hate to change notation in midstream, and I don't think confusion will arise, a long as you are aware of the problem.

4 This is more slippery than it looks. After all, the *probability* density $(|\Phi|^2)$ is single valued regardless of $m$. In Section 4.3 we'll obtain the condition on $m$ by an entirely different—and more compelling—argument.

5 Some books (including earlier editions of this one) do not include the factor $(-1)^{m}$ in the definition of $P_{\xi}^{m}$. Equation 4.27 assumes that $m \geq 0$; for negative values we define

$$
P _ {\xi} ^ {- m} (x) = (- 1) ^ {m} \frac {(\ell - m) !}{(\ell + m) !} P _ {\xi} ^ {m} (x).
$$

A few books (including earlier versions of this one) define $P_{\xi}^{-m} = P_{\xi}^{m}$. I am adopting now the more standard convention used by Mathematica.

6 Nevertheless, some authors call them (confusingly) "associated Legendre polynomials."

7 See, for instance, Boas (footnote 1), Chapter 3, Section 4.

8 The normalization factor is derived in Problem 4.63.

9 Those $ms$ are masses, of course—the separation constant $m$ does not appear in the radial equation.

10 Actually, all we require is that the wave function be normalizable, not that it be finite: $R(r) \sim 1 / r$ at the origin is normalizable (because of the $r^2$ in Equation 4.31). For a compelling general argument that $\mu(0) = 0$, see Ramamurti Shankar, *Principles of Quantum Mechanics*, 2nd edn (Plenum, New York, 1994), p. 342. For further discussion see F. A. B. Coutinho and M. Amaku, *Eur. J. Phys.* 30, 1015 (2009).

11 Milton Abramowitz and Irene A. Stegun, eds., *Handbook of Mathematical Functions*, Dover, New York (1965), Chapter 10, provides an extensive listing.

12 We shall use this notation $(\mathcal{N} - 1)$ as a count of the number of radial nodes, $n$ for the order of the energy with all central potentials. Both $n$ and $N$ are by their nature integers $(1, 2, 3, \ldots)$; $n$ is determined by $N$ and $\xi$ (conversely, $N$ is determined by $n$ and $\xi$), but the actual relation can (as here) be complicated. In the special case of the Coulomb potential, as we shall see, there is a delightfully simple formula relating the two.

13 This is what goes into the Schrödinger equation—not the electric potential $(e / 4\pi \epsilon_0 r)$.

14 Note, however, that the bound states by themselves are not complete.

15 This argument does not apply when $\xi = 0$ (although the conclusion, Equation 4.59, is in fact valid for that case too). But never mind: All I am trying to do is provide some motivation for a change of variables (Equation 4.60).

16 You might wonder why I didn't use the series method directly on $\mu(\rho)$—why factor out the asymptotic behavior before applying this procedure? Well, the reason for peeling off $\rho^{\ell+1}$ is largely aesthetic: Without this, the sequence would begin with a long string of zeros (the first nonzero coefficient being $c_{\ell+1}$); by factoring out $\rho^{\ell+1}$ we obtain a series that starts out with $\rho^0$. The $e^{-\rho}$ factor is more critical—if you don't pull that out, you get a three-term recursion formula, involving $c_{j+2}, c_{j+1}$ and $c_{j}$ (try it!), and that is enormously more difficult to work with.

17 Why not drop the 1 in $j + 1$? After all, I'm ignoring $2(\ell + 1) - \rho_0$ in the numerator, and $2\ell + 2$ in the denominator. In this approximation it would be fine to drop the 1 as well, but keeping it makes the argument a little cleaner. Try doing it without the 1, and

247

you'll see what I mean.

15 This makes $v(\rho)$ a polynomial of order $(N-1)$, with (therefore) $N-1$ roots, and hence the radial wave function has $N-1$ nodes.

It is customary to write the Bohr radius with a subscript: $\theta 0$. But this is cumbersome and unnecessary, so I prefer to leave the subscript off.

Again, $n$ is the principal quantum number; it tells you the energy of the electron (Equation 4.70). For unfortunate historical reasons $\xi$ is called the azimuthal quantum number and $m$ the magnetic quantum number; as we'll see in Section 4.3, they are related to the angular momentum of the electron.

An electron volt is the energy acquired by an electron when accelerated through an electric potential of 1 volt: $1\,\mathrm{eV} = 1.60\times 10^{-19}\,\mathrm{J}$.

As usual, there are rival normalization conventions in the literature. Older physics books (including earlier editions of this one) leave off the factor $(1/q!)$. But I think it is best to adopt the Mathematica standard (which sets $L_{q}(0)=1$). As the names suggest, $L_{q}(x)$ and $L_{q}^{p}(x)$ are polynomials (of degree $q$) in $x$. Incidentally, the associated Laguerre polynomials can also be written in the form

$$
L_{q}^{p}(x) = \frac{x^{-p} e^{x}}{q!} \left(\frac{d}{dx}\right)^{q} \left(e^{-x} x^{p+q}\right).
$$

If you want to see how the normalization factor is calculated, study (for example), Leonard I. Schiff, Quantum Mechanics, 2nd edn, McGraw-Hill, New York, 1968, page 93. In books using the older normalization convention for the Laguerre polynomials (see footnote 22) the factor $(n+\ell)!$ under the square root will be cubed.

These planes aren't visible in Figure 4.8 or 4.9, since these figures show the absolute value of $\psi_{t}$, and the real and imaginary parts of the wave function vanish on different sets of planes. However, since both sets contain the $x$ axis, the wave function itself must vanish on the $x$ axis for $m\neq 0$ (see Figure 4.9).

The idea is to reorder the operators in such a way that $\hat{H}$ appears either to the left or to the right, because we know (of course) what $\hat{H}\psi_{100}$ is.

By its nature, this involves a time-dependent potential, and the details will have to await Chapter 11; for our present purposes the actual mechanism involved is immaterial.

The photon is a quantum of electromagnetic radiation; it's a relativistic object if there ever was one, and therefore outside the scope of nonrelativistic quantum mechanics. It will be useful in a few places to speak of photons, and to invoke the Planck formula for their energy, but please bear in mind that this is external to the theory we are developing.

Thanks to John Meyer for pointing this out.

Because angular momentum involves the product of position and momentum, you might worry that the ambiguity addressed in Chapter 3 (footnote 15, page 102) would arise. Fortunately, only different components of $\mathbf{r}$ and $\mathbf{p}$ are multiplied, and they commute (Equation 4.10).

To reduce clutter (and avoid confusion with the unit vectors $\hat{i},\hat{j},\hat{k},\hat{r},\hat{\theta},\hat{\phi}$) I'm going to take the hats off operators for the rest of the chapter.

Formally, $\langle L^2\rangle = \langle L_X^2\rangle +\langle L_Y^2\rangle +\langle L_\xi^2\rangle$, but $\langle L_X^2\rangle = \langle f|L_X^2f\rangle = \langle L_Xf|L_Xf\rangle \geq 0$ (and likewise for $L_{Y}$), so $\lambda = \langle L_X^2\rangle +\langle L_Y^2\rangle +\mu^2\geq \mu^2$.

Actually, all we can conclude is that $L_{+}f_{t}$ is not normalizable—its norm could be infinite, instead of zero. Problem 4.21 explores this alternative.

George Arfken and Hans-Jurgen Weber, Mathematical Methods for Physicists, 7th edn, Academic Press, Orlando (2013), Section 3.10.

For an interesting discussion, see I. R. Gatland, Am. J. Phys. 74, 191 (2006).

For a contrary interpretation, see Hans C. Ohanian, "What is Spin?", Am. J. Phys. 54, 500 (1986).

We shall take these as postulates for the theory of spin; the analogous formulas for orbital angular momentum (Equation 4.99) were derived from the known form of the operators (Equation 4.96). Actually, they both follow from rotational invariance in three dimensions, as we shall see in Chapter 6. Indeed, these fundamental commutation relations apply to all forms of angular momentum, whether spin, orbital, or the combined angular momentum of a composite system, which could be partly spin and partly orbital.

Because the eigenstates of spin are not functions, I will switch now to Dirac notation. By the way, I'm running out of letters, so I'll use $m$ for the eigenvalue of $S_{\xi}$, just as I did for $L_{\xi}$ (some authors write $m_{1}$ and $m_{2}$ at this stage, just to be absolutely clear).

Indeed, in a mathematical sense, spin $1/2$ is the simplest possible nontrivial quantum system, for it admits just two basis states (recall Example 3.8). In place of an infinite-dimensional Hilbert space, with all its subtleties and complications, we find ourselves working in an ordinary two-dimensional vector space; instead of unfamiliar differential equations and fancy functions, we are confronted with $2\times 2$ matrices and two-component vectors. For this reason, some authors begin quantum mechanics with the study of spin. (An outstanding example is John S. Townsend, A Modern Approach to Quantum Mechanics, 2nd edn, University Books, Sausalito, CA, 2012.) But the price of mathematical simplicity is conceptual abstraction, and I prefer not to do it that way.

If it comforts you to picture the electron as a tiny spinning sphere, go ahead; I do, and I don't think it hurts, as long as you don't take it literally.

I'm only talking about the spin state, for the moment. If the particle is moving around, we will also need to deal with its position state $(\Psi)$, but for the moment let's put that aside.

I hate to be fussy about notation, but perhaps I should reiterate that a ket (such as $|sm\rangle$) is a vector in Hilbert space (in this case a $(2s+1)$-dimensional vector space), whereas a spinor $\chi$ is a set of components of a vector, with respect to a particular basis $\left(\left|\frac{1}{2}\frac{1}{2}\right.\right)$ and $\left|\frac{1}{2}-\frac{1}{2}\right\rangle$ in the

case of spin $\frac{1}{2}\big{)}$, displayed as a column. Physicists sometimes write, for instance, $\left|\frac{1}{2}\frac{1}{2}\right\rangle = \chi_{+}$, but technically this confuses a vector (which lives "out there" in Hilbert space) with its components (a string of numbers). Similarly, $S_{2}$ (for example) is an operator that acts on kets; it is represented (with respect to the chosen basis) by a matrix $\mathbf{S}_{2}$ (sans serif), which multiplies spinors—but again, $S_{2} = \mathbf{S}_{2}$, though perfectly intelligible, is sloppy language.

42 People often say that $|a|^2$ is the "probability that the particle is in the spin-up state," but this is bad language; what they mean is that if you measured $S_{2}, |a|^2$ is the probability you'd get $\hbar / 2$. See footnote 18, page 103.

43 See, for example, David J. Griffiths, *Introduction to Electrodynamics*, 4th edn (Pearson, Boston, 2013), Problem 5.58. Classically, the gyromagnetic ratio of an object whose charge and mass are identically distributed is $q / 2m$, where $q$ is the charge and $m$ is the mass. For reasons that are fully explained only in relativistic quantum theory, the gyromagnetic ratio of the electron is (almost) exactly twice the classical value: $\gamma = -e / m$.

44 Griffiths (footnote 43), Problem 6.21.

45 If the particle is allowed to move, there will also be kinetic energy to consider; moreover, it will be subject to the Lorentz force $(q\mathbf{v} \times \mathbf{B})$, which is not derivable from a potential energy function, and hence does not fit the Schrödinger equation as we have formulated it so far. I'll show you later on how to handle this (Problem 4.42), but for the moment let's just assume that the particle is free to rotate, but otherwise stationary.

46 This does assume that $a$ and $b$ are real; you can work out the general case if you like, but all it does is add a constant to $t$.

47 See, for instance, Richard P. Feynman and Robert B. Leighton, *The Feynman Lectures on Physics* (Addison-Wesley, Reading, 1964), Volume II, Section 34-3. Of course, in the classical case it is the angular momentum vector itself, not just its expectation value, that precesses around the magnetic field.

48 Griffiths (footnote 43), Section 6.1.2. Note that $\mathbf{F}$ is the negative gradient of the energy (Equation 4.157).

49 We make them neutral so as to avoid the large-scale deflection that would otherwise result from the Lorentz force, and heavy so we can construct localized wave packets and treat the motion in terms of classical particle trajectories. In practice, the Stern-Gerlach experiment doesn't work, for example, with a beam of free electrons. Stern and Gerlach themselves used silver atoms; for the story of their discovery see B. Friedrich and D. Herschbach, *Physics Today* 56, 53 (2003).

50 For a quantum mechanical justification of this equation see Problem 4.73.

51 More precisely, the composite system is in a linear combination of the four states listed. For spin $1/2$ I find the arrows more evocative than the four-index kets, but you can always revert to the formal notation if you're worried about it.

52 I say spins, for simplicity, but either one (or both) could just as well be orbital angular momentum (for which, however, we would use the letter $\epsilon$).

53 For a proof you must look in a more advanced text; see, for instance, Claude Cohen-Tannoudji, Bernard Diu, and Franck Laloë, *Quantum Mechanics*, Wiley, New York (1977), Vol. 2, Chapter X.

54 The general formula is derived in Arno Bohm, *Quantum Mechanics: Foundations and Applications*, 2nd edn, Springer, 1986, p. 172.

55 Readers who have not studied electrodynamics may want to skip Section 4.5.

56 See, for example, Herbert Goldstein, Charles P. Poole, and John Safko, *Classical Mechanics*, 3rd edn, Prentice Hall, Upper Saddle River, NJ, 2002, page 342.

57 In the case of electrostatics we can choose $\mathbf{A} = \mathbf{0}$, and $q\psi$ is the potential energy $V$.

58 Note that the potentials are given, just like the potential energy $V$ in the regular Schrödinger equation. In quantum electrodynamics (QED) the fields themselves are quantized, but that's an entirely different theory.

59 Note that $\mathbf{p}$ does not commute with $\mathbf{B}$, so $(\mathbf{p} \times \mathbf{B}) \neq -(\mathbf{B} \times \mathbf{p})$, but $\mathbf{A}$ does commute with $\mathbf{B}$, so $(\mathbf{A} \times \mathbf{B}) = -(\mathbf{B} \times \mathbf{A})$.

60 For further discussion see Leslie E. Ballentine, *Quantum Mechanics: A Modern Development*, World Scientific, Singapore (1998), Section 11.3.

61 See, for example, Griffiths (footnote 43), Section 10.1.2.

62 That is to say, $\langle \mathbf{r} \rangle, d\langle \mathbf{r} \rangle / dt$, etc. are unchanged. Because $\Lambda$ depends on position, $\langle \mathbf{p} \rangle$ (with $\mathbf{p}$ represented by the operator $-i\hbar \nabla$) does change, but as you found in Equation 4.192, $\mathbf{p}$ does not represent the mechanical momentum $(m\mathbf{v})$ in this context (in Lagrangian mechanics $\mathbf{p} = m\mathbf{v} + q\mathbf{A}$ is the so-called canonical momentum).

63 Y. Aharonov and D. Bohm, *Phys. Rev.* 115, 485 (1959). For a significant precursor, see W. Ehrenberg and R. E. Siday, *Proc. Phys. Soc. London* B62, 8 (1949).

64 See, for instance, Griffiths (footnote 43), Equation 5.71.

65 It is a peculiar property of superconducting rings that the enclosed flux is quantized: $\Phi = (2\pi \hbar / q) n^s$, where $n^s$ is an integer. In that case the effect is undetectable, since $E_n = \left( \hbar^2 / 2m b^2 \right) \left( n + n^s \right)^2$, and $\left( n + n^s \right)$ is just another integer. (Incidentally, the charge $q$ here turns out to be twice the charge of an electron; the superconducting electrons are locked together in pairs.) However, flux quantization is enforced by the superconductor (which induces circulating currents to make up the difference), not by the solenoid or the electromagnetic field, and it does not occur in the (nonsuperconducting) example considered here.

66 The region in question must also be simply connected (no holes). This might seem like a technicality, but in the present example we need to excise the solenoid itself, and that leaves a hole in the space. To get around this we treat each side of the solenoid as a separate simply-connected region. If that bothers you, you're not alone; it seems to have bothered Aharonov and Bohm as well, since—in addition to this argument—they provided an alternative solution to confirm their result (Y. Aharonov and D. Bohm, *Phys. Rev.* 115, 485 (1959)). The

Aharonov–Bohm effect can also be cast as an example of Berry’s phase (see Chapter 11), where this issue does not arise (M. Berry, Proc. Roy. Soc. Lond. A 392, 45 (1984)).

67 Use cylindrical coordinates centered on the axis of the solenoid; put $\mathcal{O}$ on the incoming beam, and let $\phi$ run $\theta &lt; \pi$ on one side and $\theta &gt; -\pi$ on the other, with $r &gt; \alpha$ always.

68 R. G. Chambers, Phys. Rev. Lett. 5, 3 (1960).

69 Aharonov and Bohm themselves concluded that the vector potential has a physical significance in quantum mechanics that it lacks in classical theory, and most physicists today would agree. For the early history of the Aharonov–Bohm effect see H. Ehrlickson, Am. J. Phys. 38, 162 (1970).

70 For some damn reason energy levels are traditionally counted starting with $n \equiv \theta$, for the harmonic oscillator. That conflicts with good sense and with our explicit convention (footnote 12), but please stick with it for this problem.

71 Schrödinger (Annalen der Physik 81, 109 (1926), Section 7) interpreted $\varepsilon \mathbf{J}$ as the electric current density (this was before Born published his statistical interpretation of the wave function), and noted that it is time-independent (in a stationary state): “we may in a certain sense speak of a return to electrostatic and magnetostatic atomic models. In this way the lack of radiation in [a stationary] state would, indeed, find a startlingly simple explanation.” (I thank Kirk McDonald for calling this reference to my attention.)

72 Nicholas Wheeler, “Coincident Spectral Lines” (unpublished Reed College report, 2001).

73 For a variety of reasons this system has been much studied in the literature. See, for example, J. M. Ferreyra and C. R. Proetto, Am. J. Phys. 81, 860 (2013).

74 N. D. Mermin, Physics Today, October 2011, page 8.

75 That’s not obvious but we’ll prove it in Chapter 2.

76 In this notation, $|\Psi_{+}(\mathbf{r})|^{2}d^{3}\mathbf{r}$ gives the probability of finding the particle in the vicinity of $\mathbf{r}$ with spin up, and similarly measuring its spin along the $z$ axis to be up, and similarly for $|\Psi_{-}(\mathbf{r})|^{2}d^{3}\mathbf{r}$ with spin down.

77 See footnote 62 for a discussion of the difference between the canonical and mechanical momentum.

78 However, the electromagnetic fields also carry angular momentum, and the total (mechanical plus electromagnetic) is quantized in integer multiples of $p$. For a discussion see M. Peshkin, Physics Reports 80, 375 (1981) or Chapter 1 of Frank Wilczek, Fractional Statistics and Anyon Superconductivity, World Scientific, New Jersey (1990).

250

5
Identical Particles
*
251

252

# 5.1 Two-Particle Systems

For a single particle, $\Psi(\mathbf{r}, t)$ is a function of the spatial coordinates, $\mathbf{r}$, and the time, $t$ (I'll ignore spin, for the moment). The state of a two-particle system is a function of the coordinates of particle one $(\mathbf{r}_1)$, the coordinates of particle two $(\mathbf{r}_2)$, and the time:

$$
\Psi \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}, t\right). \tag {5.1}
$$

Its time evolution is determined by the Schrödinger equation:

$$
i \hbar \frac {\partial \Psi}{\partial t} = \hat {H} \Psi , \tag {5.2}
$$

where $H$ is the Hamiltonian for the whole works:

$$
\hat {H} = - \frac {\hbar^ {2}}{2 m _ {1}} \nabla_ {1} ^ {2} - \frac {\hbar^ {2}}{2 m _ {2}} \nabla_ {2} ^ {2} + V (\mathbf {r} _ {1}, \mathbf {r} _ {2}, t) \tag {5.3}
$$

(the subscript on $\nabla$ indicates differentiation with respect to the coordinates of particle 1 or particle 2, as the case may be). The statistical interpretation carries over in the obvious way:

$$
\left| \Psi \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}, t\right) \right| ^ {2} d ^ {3} \mathbf {r} _ {1} d ^ {3} \mathbf {r} _ {2} \tag {5.4}
$$

is the probability of finding particle 1 in the volume $d^3\mathbf{r}_1$ and particle 2 in the volume $d^3\mathbf{r}_2$; as always, $\Psi$ must be normalized:

$$
\int \left| \Psi \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}, t\right) \right| ^ {2} d ^ {3} \mathbf {r} _ {1} d ^ {3} \mathbf {r} _ {2} = 1. \tag {5.5}
$$

For time-independent potentials, we obtain a complete set of solutions by separation of variables:

$$
\Psi \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}, t\right) = \psi \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}\right) e ^ {- i E t / \hbar}, \tag {5.6}
$$

where the spatial wave function $(\psi)$ satisfies the time-independent Schrödinger equation:

$$
- \frac {\hbar^ {2}}{2 m _ {1}} \nabla_ {1} ^ {2} \psi - \frac {\hbar^ {2}}{2 m _ {2}} \nabla_ {2} ^ {2} \psi + V \psi = E \psi , \tag {5.7}
$$

and $E$ is the total energy of the system. In general, solving Equation 5.7 is difficult, but two special cases can be reduced to one-particle problems:

1. Noninteracting particles. Suppose the particles do not interact with one another, but each is subject to some external force. For example, they might be attached to two different springs. In that case the total potential energy is the sum of the two:

$$
V \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}\right) = V _ {1} \left(\mathbf {r} _ {1}\right) + V _ {2} \left(\mathbf {r} _ {2}\right), \tag {5.8}
$$

and Equation 5.7 can be solved by separation of variables:

$$
\psi \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}\right) = \psi_ {a} \left(\mathbf {r} _ {1}\right) \psi_ {b} \left(\mathbf {r} _ {2}\right). \tag {5.9}
$$

Plugging Equation 5.9 into Equation 5.7, dividing by $\psi(\mathbf{r}_1, \mathbf{r}_2)$, and collecting the terms in $\mathbf{r}_1$ alone and in $\mathbf{r}_2$ alone, we find that $\psi_a(\mathbf{r}_1)$ and $\psi_b(\mathbf{r}_2)$ each satisfy the one-particle Schrödinger equation:

$$
\begin{aligned}
&amp; -\frac{\hbar^2}{2m_1} \nabla_1^2 \psi_a(\mathbf{r}_1) + V_1(\mathbf{r}_1) \psi_a(\mathbf{r}_1) = E_a \psi_a(\mathbf{r}_1), \\
&amp; -\frac{\hbar^2}{2m_2} \nabla_2^2 \psi_b(\mathbf{r}_2) + V_2(\mathbf{r}_2) \psi_b(\mathbf{r}_2) = E_b \psi_b(\mathbf{r}_2),
\end{aligned}
\tag{5.10}
$$

and $E = E_a + E_b$. In this case the two-particle wave function is a simple product of one-particle wave functions,

$$
\begin{aligned}
\Psi(\mathbf{r}_1, \mathbf{r}_2, t) &amp; = \psi_a(\mathbf{r}_1) \psi_b(\mathbf{r}_2) e^{-i(E_a + E_b)t/\hbar} \\
&amp; = \left( \psi_a(\mathbf{r}_1) e^{-iE_a t/\hbar} \right) \left( \psi_b(\mathbf{r}_2) e^{-iE_b t/\hbar} \right) = \Psi_a(\mathbf{r}_1, t) \Psi_b(\mathbf{r}_2, t),
\end{aligned}
\tag{5.11}
$$

and it makes sense to say that particle 1 is in state $a$, and particle 2 is in state $b$. But any linear combination of such solutions will still satisfy the (time-dependent) Schrödinger equation—for instance

$$
\Psi(\mathbf{r}_1, \mathbf{r}_2, t) = \frac{3}{5} \Psi_a(\mathbf{r}_1, t) \Psi_b(\mathbf{r}_2, t) + \frac{4}{5} \Psi_c(\mathbf{r}_1, t) \Psi_d(\mathbf{r}_2, t).
\tag{5.12}
$$

In this case the state of particle 1 depends on the state of particle 2, and vice versa. If you measured the energy of particle 1, you might get $E_a$ (with probability 9/25), in which case the energy of particle 2 is definitely $E_b$, or you might get $E_c$ (probability 16/25), in which case the energy of particle 2 is $E_d$. We say that the two particles are entangled (Schrödinger's lovely term). An entangled state is one that cannot be written as a product of single-particle states.¹

2. Central potentials. Suppose the particles interact only with one another, via a potential that depends on their separation:

$$
V(\mathbf{r}_1, \mathbf{r}_2) \rightarrow V(|\mathbf{r}_1 - \mathbf{r}_2|).
\tag{5.13}
$$

The hydrogen atom would be an example, if you include the motion of the proton. In this case the two-body problem reduces to an equivalent one-body problem, just as it does in classical mechanics (see Problem 5.1).

In general, though, the two particles will be subject both to external forces and to mutual interactions, and this makes the analysis more complicated. For example, think of the two electrons in a helium atom: each feels the Coulomb attraction of the nucleus (charge $2e$), and at the same time they repel one another:

$$
V(\mathbf{r}_1, \mathbf{r}_2) = \frac{1}{4\pi\epsilon_0} \left( -\frac{2e^2}{|\mathbf{r}_1|} - \frac{2e^2}{|\mathbf{r}_2|} + \frac{e^2}{|\mathbf{r}_1 - \mathbf{r}_2|} \right).
\tag{5.14}
$$

We'll take up this problem in later sections.

253

and $\mathbf{R} \equiv (m_1 \mathbf{r}_1 + m_2 \mathbf{r}_2) / (m_1 + m_2)$ (the center of mass).

(a) Show that $\mathbf{r}_1 = \mathbf{R} + (\mu / m_1)\mathbf{r}$, $\mathbf{r}_2 = \mathbf{R} - (\mu / m_2)\mathbf{r}$, and $\nabla_1 = (\mu / m_2)\nabla_R + \nabla_r, \nabla_2 = (\mu / m_1)\nabla_R - \nabla_r$, where

$$
\mu \equiv \frac {m _ {1} m _ {2}}{m _ {1} + m _ {2}} \tag {5.15}
$$

is the reduced mass of the system.

(b) Show that the (time-independent) Schrödinger equation (5.7) becomes

$$
- \frac {\hbar^ {2}}{2 (m _ {1} + m _ {2})} \nabla_ {R} ^ {2} \psi - \frac {\hbar^ {2}}{2 \mu} \nabla_ {r} ^ {2} \psi + V (\mathbf {r}) \psi = E \psi .
$$

(c) Separate the variables, letting $\psi (\mathbf{R},\mathbf{r}) = \psi_R(\mathbf{R})\psi_r(\mathbf{r})$. Note that $\psi_R$ satisfies the one-particle Schrödinger equation, with the total mass $(m_{1} + m_{2})$ in place of $m$, potential zero, and energy $E_{R}$, while $\psi_r$ satisfies the one-particle Schrödinger equation with the reduced mass in place of $m$, potential $V(\mathbf{r})$, and energy $E_{r}$. The total energy is the sum: $E = E_{R} + E_{r}$. What this tells us is that the center of mass moves like a free particle, and the relative motion (that is, the motion of particle 2 with respect to particle 1) is the same as if we had a single particle with the reduced mass, subject to the potential $V$. Exactly the same decomposition occurs in classical mechanics; it reduces the two-body problem to an equivalent one-body problem.

Problem 5.2 In view of Problem 5.1, we can correct for the motion of the nucleus in hydrogen by simply replacing the electron mass with the reduced mass.

(a) Find (to two significant digits) the percent error in the binding energy of hydrogen (Equation 4.77) introduced by our use of $m$ instead of $\mu$.

(b) Find the separation in wavelength between the red Balmer lines $(n = 3 \rightarrow n = 2)$ for hydrogen and deuterium (whose nucleus contains a neutron as well as the proton).

(c) Find the binding energy of positronium (in which the proton is replaced by a positron—positrons have the same mass as electrons, but opposite charge).

(d) Suppose you wanted to confirm the existence of muonic hydrogen, in which the electron is replaced by a muon (same charge, but 206.77 times heavier). Where (i.e. at what wavelength) would you look for the "Lyman-$\mathfrak{a}$" line $(n = 2 \rightarrow n = 1)$?

Problem 5.3 Chlorine has two naturally occurring isotopes, $\mathrm{Cl}^{35}$ and $\mathrm{Cl}^{37}$. Show that the vibrational spectrum of HCl should consist of closely spaced doublets, with a splitting given by $\Delta v = 7.51 \times 10^{-4}v$, where $\mathbf{v}$ is the frequency of the

254

Problem 5.3 Chlorine has two naturally occurring isotopes, $\mathrm{Cl}^{35}$ and $\mathrm{Cl}^{37}$. Show that the vibrational spectrum of HCl should consist of closely spaced doublets, with a splitting given by $\Delta v = 7.51 \times 10^{-4}v$, where $\mathbf{v}$ is the frequency of the emitted photon. Hint: Think of it as a harmonic oscillator, with $\omega = \sqrt{k / \mu}$, where $\mu$ is the reduced mass (Equation 5.15) and $k$ is presumably the same for both isotopes.

255

5.1.1 Bosons and Fermions

Suppose we have two noninteracting particles, number 1 in the (one-particle) state $\psi_{a}(\mathbf{r})$, and number 2 in the state $\psi_{b}(\mathbf{r})$. In that case $\psi(\mathbf{r}_{1},\mathbf{r}_{2})$ is the product (Equation 5.9):

$\psi(\mathbf{r}_{1},\mathbf{r}_{2})=\psi_{a}(\mathbf{r}_{1})\psi_{b}(\mathbf{r}_{2}).$ (5.16)

Of course, this assumes that we can tell the particles apart—otherwise it wouldn’t make any sense to claim that number 1 is in state $\psi_{a}$ and number 2 is in state $\psi_{b}$; all we could say is that one of them is in the state $\psi_{a}$ and the other is in state $\psi_{b}$, but we wouldn’t know which is which. If we were talking classical mechanics this would be a silly objection: You can always tell the particles apart, in principle—just paint one of them red and the other one blue, or stamp identification numbers on them, or hire private detectives to follow them around. But in quantum mechanics the situation is fundamentally different: You can’t paint an electron red, or pin a label on it, and a detective’s observations will inevitably and unpredictably alter its state, raising the possibility that the two particles might have secretly switched places. The fact is, all electrons are utterly identical, in a way that no two classical objects can ever be. It’s not just that we don’t know which electron is which; God doesn’t know which is which, because there is really no such thing as “this” electron, or “that” electron; all we can legitimately speak about is “an” electron.

Quantum mechanics neatly accommodates the existence of particles that are indistinguishable in principle: We simply construct a wave function that is noncommittal as to which particle is in which state. There are actually two ways to do it:

$\psi_{\pm}(\mathbf{r}_{1},\mathbf{r}_{2})=A\left[\psi_{a}(\mathbf{r}_{1})\psi_{b}(\mathbf{r}_{2})\pm\psi_{b}(\mathbf{r}_{1})\psi_{a}(\mathbf{r}_{2})\right];$ (5.17)

the theory admits two kinds of identical particles: bosons (the plus sign), and fermions (the minus sign). Boson states are symmetric under interchange, $\psi_{+}(\mathbf{r}_{2},\mathbf{r}_{1})=\psi_{+}(\mathbf{r}_{1},\mathbf{r}_{2})$; fermion states are antisymmetric under interchange, $\psi_{-}(\mathbf{r}_{2},\mathbf{r}_{1})=-\psi_{-}(\mathbf{r}_{1},\mathbf{r}_{2})$. It so happens that

all particles with integer spin are bosons, and all particles with half integer spin are fermions. (5.18)

This connection between spin and statistics (bosons and fermions have quite different statistical properties) can be proved in relativistic quantum mechanics; in the nonrelativistic theory it is simply taken as an axiom.

It follows, in particular, that two identical fermions (for example, two electrons) cannot occupy the same state. For if $\psi_{a}=\psi_{b}$, then

$\psi_{-}(\mathbf{r}_{1},\mathbf{r}_{2})=A\left[\psi_{a}(\mathbf{r}_{1})\psi_{a}(\mathbf{r}_{2})-\psi_{a}(\mathbf{r}_{1})\psi_{a}(\mathbf{r}_{2})\right]=0,$

and we are left with no wave function at all. This is the famous Pauli exclusion principle. It is not (as you may have been led to believe) a weird ad hoc assumption applying only to electrons, but rather a consequence of the rules for constructing two-particle wave functions, applying to all identical fermions.

[Example 5.1]

Suppose we have two noninteracting (they pass right through one another…never mind how you would set this up in practice!) particles, both of mass m, in the infinite square well (Section 2.2). The one-particle states are

$$
\psi_{n}(x) = \sqrt{\frac{2}{a}} \sin \left(\frac{n\pi}{a}x\right), \quad E_{n} = n^{2}K
$$

(where $K \equiv \pi^{2} \hbar^{2} / 2ma^{2}$). If the particles are distinguishable, with number 1 in state $n_1$ and number 2 in state $n_2$, the composite wave function is a simple product:

$$
\psi_{n_1 n_2}(x_1, x_2) = \psi_{n_1}(x_1) \psi_{n_2}(x_2), \quad E_{n_1 n_2} = \left(n_1^2 + n_2^2\right) K.
$$

For example, the ground state is

$$
\psi_{11} = \frac{2}{a} \sin \left(\frac{\pi x_1}{a}\right) \sin \left(\frac{\pi x_2}{a}\right), \quad E_{11} = 2K;
$$

the first excited state is doubly degenerate:

$$
\psi_{12} = \frac{2}{a} \sin \left(\frac{\pi x_1}{a}\right) \sin \left(\frac{2\pi x_2}{a}\right), \quad E_{12} = 5K,
$$

$$
\psi_{21} = \frac{2}{a} \sin \left(\frac{2\pi x_1}{a}\right) \sin \left(\frac{\pi x_2}{a}\right), \quad E_{21} = 5K;
$$

and so on. If the two particles are identical bosons, the ground state is unchanged, but the first excited state is nondegenerate:

$$
\frac{\sqrt{2}}{a} \left[ \sin \left(\frac{\pi x_1}{a}\right) \sin \left(\frac{2\pi x_2}{a}\right) + \sin \left(\frac{2\pi x_1}{a}\right) \sin \left(\frac{\pi x_2}{a}\right) \right]
$$

(still with energy $5K$). And if the particles are identical fermions, there is no state with energy $2K$; the ground state is

$$
\frac{\sqrt{2}}{a} \left[ \sin \left(\frac{\pi x_1}{a}\right) \sin \left(\frac{2\pi x_2}{a}\right) - \sin \left(\frac{2\pi x_1}{a}\right) \sin \left(\frac{\pi x_2}{a}\right) \right],
$$

and its energy is $5K$.

---

**Problem 5.4**

(a) If $\psi_a$ and $\psi_b$ are orthogonal, and both are normalized, what is the constant $A$ in Equation 5.17?

(b) If $\psi_a = \psi_b$ (and it is normalized), what is $A$? (This case, of course, occurs only for bosons.)

---

**Problem 5.5**

(a) Write down the Hamiltonian for two noninteracting identical particles in the infinite square well. Verify that the fermion ground state given in Example 5.1 is an eigenfunction of $\hat{\pmb{f}}_i$, with the appropriate eigenvalue.

(b) Find the next two excited states (beyond the ones given in the example)—wave functions, energies, and degeneracies—for each of the three cases

257

(distinguishable, identical bosons, identical fermions).

5.1.2 Exchange Forces

To give you some sense of what the symmetrization requirement (Equation 5.17) actually does, I'm going to work out a simple one-dimensional example. Suppose one particle is in state $\psi_{a}(x)$, and the other is in state $\psi_{b}(x)$, and these two states are orthogonal and normalized. If the two particles are distinguishable, and number 1 is the one in state $\psi_{a}$, then the combined wave function is

$$
\psi(x_1, x_2) = \psi_a(x_1)\psi_b(x_2); \tag{5.19}
$$

if they are identical bosons, the composite wave function is (see Problem 5.4 for the normalization)

$$
\psi_+(x_1, x_2) = \frac{1}{\sqrt{2}} \left[ \psi_a(x_1)\psi_b(x_2) + \psi_b(x_1)\psi_a(x_2) \right]; \tag{5.20}
$$

and if they are identical fermions, it is

$$
\psi_-(x_1, x_2) = \frac{1}{\sqrt{2}} \left[ \psi_a(x_1)\psi_b(x_2) - \psi_b(x_1)\psi_a(x_2) \right]. \tag{5.21}
$$

Let's calculate the expectation value of the square of the separation distance between the two particles,

$$
\left\langle (x_1 - x_2)^2 \right\rangle = \left\langle x_1^2 \right\rangle + \left\langle x_2^2 \right\rangle - 2 \left\langle x_1 x_2 \right\rangle. \tag{5.22}
$$

Case 1: Distinguishable particles. For the wave function in Equation 5.19,

$$
\left\langle x_1^2 \right\rangle = \int x_1^2 |\psi_a(x_1)|^2 dx_1 \int |\psi_b(x_2)|^2 dx_2 = \left\langle x^2 \right\rangle_a
$$

(the expectation value of $\chi^2$ in the one-particle state $\psi_a$),

$$
\left\langle x_2^2 \right\rangle = \int |\psi_a(x_1)|^2 dx_1 \int x_2^2 |\psi_b(x_2)|^2 dx_2 = \left\langle x^2 \right\rangle_b,
$$

and

$$
\left\langle x_1 x_2 \right\rangle = \int x_1 |\psi_a(x_1)|^2 dx_1 \int x_2 |\psi_b(x_2)|^2 dx_2 = \left\langle x \right\rangle_a \left\langle x \right\rangle_b.
$$

In this case, then,

$$
\left\langle (x_1 - x_2)^2 \right\rangle_a = \left\langle x^2 \right\rangle_a + \left\langle x^2 \right\rangle_b - 2 \left\langle x \right\rangle_a \left\langle x \right\rangle_b. \tag{5.23}
$$

(Incidentally, the answer would—of course—be the same if particle 1 had been in state $\psi_b$, and particle 2 in state $\psi_a$.)

Case 2: Identical particles. For the wave functions in Equations 5.20 and 5.21,

$$
\begin{array}{l}
\left\langle x _ {1} ^ {2} \right\rangle = \frac {1}{2} \left[ \int x _ {1} ^ {2} \left| \psi_ {a} (x _ {1}) \right| ^ {2} d x _ {1} \int \left| \psi_ {b} (x _ {2}) \right| ^ {2} d x _ {2} \right. \\
+ \int x _ {1} ^ {2} | \psi_ {b} (x _ {1}) | ^ {2} d x _ {1} \int | \psi_ {a} (x _ {2}) | ^ {2} d x _ {2} \\
\pm \int x _ {1} ^ {2} \psi_ {a} (x _ {1}) ^ {*} \psi_ {b} (x _ {1}) d x _ {1} \int \psi_ {b} (x _ {2}) ^ {*} \psi_ {a} (x _ {2}) d x _ {2} \\
\left. \pm \int x _ {1} ^ {2} \psi_ {b} \left(x _ {1}\right) ^ {*} \psi_ {a} \left(x _ {1}\right) d x _ {1} \int \psi_ {a} \left(x _ {2}\right) ^ {*} \psi_ {b} \left(x _ {2}\right) d x _ {2} \right] \\
= \frac {1}{2} \left[ \left\langle x ^ {2} \right\rangle_ {a} + \left\langle x ^ {2} \right\rangle_ {b} \pm 0 \pm 0 \right] = \frac {1}{2} \left(\left\langle x ^ {2} \right\rangle_ {a} + \left\langle x ^ {2} \right\rangle_ {b}\right).
\end{array}
$$

Similarly,

$$
\left\langle x _ {2} ^ {2} \right\rangle = \frac {1}{2} \left(\left\langle x ^ {2} \right\rangle_ {b} + \left\langle x ^ {2} \right\rangle_ {a}\right).
$$

(Naturally, $\left\langle x_2^2\right\rangle = \left\langle x_1^2\right\rangle$, since you can't tell them apart.) But

$$
\begin{array}{l}
\left\langle x _ {1} x _ {2} \right\rangle = \frac {1}{2} \left[ \int x _ {1} \left| \psi_ {a} (x _ {1}) \right| ^ {2} d x _ {1} \int x _ {2} \left| \psi_ {b} (x _ {2}) \right| ^ {2} d x _ {2} \right. \\
+ \int x _ {1} | \psi_ {b} (x _ {1}) | ^ {2} d x _ {1} \int x _ {2} | \psi_ {a} (x _ {2}) | ^ {2} d x _ {2} \\
\pm \int x _ {1} \psi_ {a} (x _ {1}) ^ {*} \psi_ {b} (x _ {1}) d x _ {1} \int x _ {2} \psi_ {b} (x _ {2}) ^ {*} \psi_ {a} (x _ {2}) d x _ {2} \\
\left. \pm \int x _ {1} \psi_ {b} \left(x _ {1}\right) ^ {*} \psi_ {a} \left(x _ {1}\right) d x _ {1} \int x _ {2} \psi_ {a} \left(x _ {2}\right) ^ {*} \psi_ {b} \left(x _ {2}\right) d x _ {2} \right] \\
= \frac {1}{2} \left(\langle x \rangle_ {a} \langle x \rangle_ {b} + \langle x \rangle_ {b} \langle x \rangle_ {a} \pm \langle x \rangle_ {a b} \langle x \rangle_ {b a} \pm \langle x \rangle_ {b a} \langle x \rangle_ {a b}\right) \\
= \langle x \rangle_ {a} \langle x \rangle_ {b} \pm | \langle x \rangle_ {a b} | ^ {2},
\end{array}
$$

where

$$
\langle x \rangle_ {a b} \equiv \int x \psi_ {a} (x) ^ {*} \psi_ {b} (x) d x. \tag {5.24}
$$

Thus

$$
\left\langle \left(x _ {1} - x _ {2}\right) ^ {2} \right\rangle_ {\pm} = \left\langle x ^ {2} \right\rangle_ {a} + \left\langle x ^ {2} \right\rangle_ {b} - 2 \langle x \rangle_ {a} \langle x \rangle_ {b} \mp 2 | \langle x \rangle_ {a b} | ^ {2}. \tag {5.25}
$$

Comparing Equations 5.23 and 5.25, we see that the difference resides in the final term:

$$
\left\langle \left(\Delta x\right) ^ {2} \right\rangle_ {\pm} = \left\langle \left(\Delta x\right) ^ {2} \right\rangle_ {d} \mp 2 | \langle x \rangle_ {a b} | ^ {2}; \tag {5.26}
$$

identical bosons (the upper signs) tend to be somewhat closer together, and identical fermions (the lower signs) somewhat farther apart, than distinguishable particles in the same two states. Notice that $\langle x\rangle_{ab}$ vanishes unless the two wave functions actually overlap: if $\psi_{a}(x)$ is zero wherever $\psi_{b}(x)$ is nonzero, the integral in Equation 5.24 is zero. So if $\psi_{a}$ represents an electron in an atom in Chicago, and $\psi_{b}$ represents an electron in an atom in Seattle, it's not going to make any difference whether you antisymmetrize the wave function or not. As a practical matter, therefore, it's okay to pretend that electrons with non-overlapping wave functions

260

are distinguishable. (Indeed, this is the only thing that allows chemists to proceed at all, for in principle every electron in the universe is linked to every other one, via the antisymmetrization of their wave functions, and if this really mattered, you wouldn't be able to talk about any one unless you were prepared to deal with them all!)

The interesting case is when the overlap integral (Equation 5.24) is not zero. The system behaves as though there were a "force of attraction" between identical bosons, pulling them closer together, and a "force of repulsion" between identical fermions, pushing them apart (remember that we are for the moment ignoring spin). We call it an exchange force, although it's not really a force at all $^2$  —no physical agency is pushing on the particles; rather, it is a purely geometrical consequence of the symmetrization requirement. It is also a strictly quantum mechanical phenomenon, with no classical counterpart.

*

Problem 5.6 Imagine two noninteracting particles, each of mass  $m$ , in the infinite square well. If one is in the state  $\psi_{n}$  (Equation 2.28), and the other in state  $\psi_{l}$  ( $l \neq n$ ), calculate  $\left\langle (x_{1} - x_{2})^{2} \right\rangle$ , assuming (a) they are distinguishable particles, (b) they are identical bosons, and (c) they are identical fermions.

**

Problem 5.7 Two noninteracting particles (of equal mass) share the same harmonic oscillator potential, one in the ground state and one in the first excited state.

(a) Construct the wave function,  $\psi (x_1,x_2)$ , assuming (i) they are distinguishable, (ii) they are identical bosons, (iii) they are identical fermions. Plot  $|\psi (x_1,x_2)|^2$  in each case (use, for instance, Mathematica's Plot3D).
(b) Use Equations 5.23 and 5.25 to determine  $\left\langle (x_1 - x_2)^2\right\rangle$  for each case.
(c) Express each  $\psi(x_1, x_2)$  in terms of the relative and center-of-mass coordinates  $r \equiv x_1 - x_2$  and  $R \equiv (x_1 + x_2) / 2$ , and integrate over  $R$  to get the probability of finding the particles a distance  $|r|$  apart:

$P(|r|) = 2\int |\psi (R,r)|^2 dR$

(the 2 accounts for the fact that  $r$  could be positive or negative). Graph  $P(r)$  for the three cases.

(d) Define the density operator by

$n(x) = \sum_{i = 1}^{2}\delta (x - x_i)$

$\langle n(x)\rangle dx$  is the expected number of particles in the interval  $dx$ . Compute  $\langle n(x)\rangle$  for each of the three cases and plot your results. (The result may surprise you.)

###### Problem 5.8

Suppose you had *three* particles, one in state $\psi_{a}(x)$, one in state $\psi_{b}(x)$, and one in state $\psi_{c}(x)$. Assuming $\psi_{a}$, $\psi_{b}$, and $\psi_{c}$ are orthonormal, construct the three-particle states (analogous to Equations 5.19, 5.20, and 5.21) representing (a) distinguishable particles, (b) identical bosons, and (c) identical fermions. Keep in mind that (b) must be completely symmetric, under interchange of *any* pair of particles, and (c) must be completely *anti*-symmetric, in the same sense.

###### Comment:

There’s a cute trick for constructing completely antisymmetric wave functions: Form the Slater determinant, whose first row is $\psi_{a}(x_{1})$, $\psi_{b}(x_{1})$, $\psi_{c}(x_{1})$, etc., whose second row is $\psi_{a}(x_{2})$, $\psi_{b}(x_{2})$, $\psi_{c}(x_{2})$, etc., and so on (this device works for any number of particles).

##

5.1.3 Spin

It is time to bring spin into the story. The complete state of an electron (say) includes not only its position wave function, but also a spinor, describing the orientation of its spin:²

$$
\psi (\mathbf {r}) \chi . \tag {5.27}
$$

When we put together the two-particle state,⁸

$$
\psi \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}\right) \chi (1, 2) \tag {5.28}
$$

it is the whole works, not just the spatial part, that has to be antisymmetric with respect to exchange:

$$
\psi \left(\mathbf {r} _ {1}, \mathbf {r} _ {2}\right) \chi (1, 2) = - \psi \left(\mathbf {r} _ {2}, \mathbf {r} _ {1}\right) \chi (2, 1). \tag {5.29}
$$

Now, a glance back at the composite spin states (Equations 4.175 and 4.176) reveals that the singlet combination is antisymmetric (and hence would have to be joined with a symmetric spatial function), whereas the three triplet states are all symmetric (and would require an antisymmetric spatial function). Thus the Pauli principle actually allows two electrons in a given position state, as long as their spins are in the singlet configuration (but they could not be in the same position state and in the same spin state—say, both spin up).

**Problem 5.9** In Example 5.1 and Problem 5.5(b) we ignored spin (or, if you prefer, we assumed the particles are in the same spin state).

(a) Do it now for particles of spin 1/2. Construct the four lowest-energy configurations, and specify their energies and degeneracies. Suggestion: Use the notation  $\psi_{n_1n_2}|sm\rangle$ , where  $\psi_{n_1n_2}$  is defined in Example 5.1 and  $|sm\rangle$  in Section 4.4.3.⁹

(b) Do the same for spin 1. Hint: First work out the spin-1 analogs to the spin-1/2 singlet and triplet configurations, using the Clebsch-Gordan coefficients; note which of them are symmetric and which antisymmetric.¹⁰

263

264

# 5.1.4 Generalized Symmetrization Principle

I have assumed, for the sake of simplicity, that the particles are noninteracting, the spin and position are decoupled (with the combined state a product of position and spin factors), and the potential is time-independent. But the fundamental symmetrization/antisymmetrization requirement for identical bosons/fermions is much more general. Let us define the exchange operator, $\hat{\pmb{p}}$, which interchanges the two particles: [1]

$$
\hat{P} | (1, 2) \rangle = | (2, 1) \rangle. \tag{5.30}
$$

Clearly, $\hat{p}^2 = 1$, and it follows (prove it for yourself) that the eigenvalues of $\hat{\pmb{p}}$ are $\pm 1$. Now, if the two particles are identical, the Hamiltonian must treat them the same: $m_1 = m_2$ and $V(\mathbf{r}_1, \mathbf{r}_2, t) = V(\mathbf{r}_2, \mathbf{r}_1, t)$. It follows that $\hat{\pmb{p}}$ and $\hat{H}$ are compatible observables,

$$
\left[ \hat{P}, \hat{H} \right] = 0, \tag{5.31}
$$

and hence (Equation 3.73)

$$
\frac{d \left\langle \hat{P} \right\rangle}{dt} = 0. \tag{5.32}
$$

If the system starts out in an eigenstate of $\hat{\pmb{p}}$—symmetric $(\langle \hat{P} \rangle = 1)$, or antisymmetric $(\langle \hat{P} \rangle = -1)$—then it will stay that way forever. The symmetrization axiom says that for identical particles the state is not merely allowed, but required to satisfy

$$
| (1, 2) \rangle = \pm | (2, 1) \rangle, \tag{5.33}
$$

with the plus sign for bosons, and the minus sign for fermions. [12] If you have $n$ identical particles, of course, the state must be symmetric or antisymmetric under the interchange of any two:

$$
| (1, 2, \dots, i, \dots, j, \dots, n) \rangle = \pm | (1, 2, \dots, j, \dots, i, \dots, n) \rangle, \tag{5.34}
$$

This is the general statement, of which Equation 5.17 is a special case.

**Problem 5.10** For two spin-1/2 particles you can construct symmetric and antisymmetric states (the triplet and singlet combinations, respectively). For three spin-1/2 particles you can construct symmetric combinations (the quadruplet, in Problem 4.65), but no completely anti-symmetric configuration is possible.

(a) Prove it. Hint: The "bulldozer" method is to write down the most general linear combination:

$$
\chi (1, 2, 3) = a | \uparrow \uparrow \uparrow \rangle + b | \uparrow \uparrow \downarrow \rangle + c | \uparrow \downarrow \uparrow \rangle + d | \uparrow \downarrow \downarrow \rangle + e | \downarrow \uparrow \uparrow \rangle + f | \downarrow \uparrow \downarrow \rangle + g | \downarrow \downarrow \uparrow \rangle + h | \downarrow \downarrow \downarrow \rangle.
$$

What does antisymmetry under $1 \leftrightarrow 2$ tell you about the coefficients? (Note that the eight terms are mutually orthogonal.) Now invoke antisymmetry under $2 \leftrightarrow 3$.

(b) Suppose you put three identical noninteracting spin-1/2 particles in the infinite square well. What is the ground state for this system, what is its energy, and what is its degeneracy? Note: You can't put all three in the position state  $\psi_{1}$  (why not?); you'll need two in  $\psi_{1}$  and the other in  $\psi_{2}$ . But the symmetric configuration  $[\psi_{1}(x_{1})\psi_{1}(x_{2})\psi_{2}(x_{3}) + \psi_{1}(x_{1})\psi_{2}(x_{2})\psi_{1}(x_{3}) + \psi_{2}(x_{1})\psi_{1}(x_{2})\psi_{1}(x_{3})]$  is no good (because there's no antisymmetric spin combination to go with it), and you can't make a completely antisymmetric combination of those three terms. ...In this case you simply cannot construct an antisymmetric product of a spatial state and a spin state. But you can do it with an appropriate linear combination of such products. Hint: Form the Slater determinant (Problem 5.8) whose top row is  $\psi_{1}(x_{1})|\uparrow\rangle_{\mathrm{l}}, \psi_{1}(x_{1})|\downarrow\rangle_{\mathrm{l}}, \psi_{2}(x_{1})|\uparrow\rangle_{\mathrm{l}}$ .

(c) Show that your answer to part (b), properly normalized, can be written in the form

$$
\Phi (1, 2, 3) = \frac {1}{\sqrt {3}} [ \Phi (1, 2) \phi (3) - \Phi (1, 3) \phi (2) + \Phi (2, 3) \phi (1) ]
$$

where  $\Phi (i,j)$  is the wave function of two particles in the  $n = 1$  state and the singlet spin configuration,

$$
\Phi (i, j) = \psi_ {1} \left(x _ {i}\right) \psi_ {1} \left(x _ {j}\right) \frac {\left| \uparrow_ {i} \downarrow_ {j} \right\rangle - \left| \downarrow_ {i} \uparrow_ {j} \right\rangle}{\sqrt {2}}, \tag {5.35}
$$

and  $\phi (i)$  is the wave function of the  $i$ th particle in the  $n = 2$  spin up state:  $\phi (i) = \psi_{2}(x_{i})\left|\uparrow_{i}\right\rangle$ . Noting that  $\Phi (i,j)$  is antisymmetric in  $i\leftrightarrow j$ , check that  $\Phi (1,2,3)$  is antisymmetric in all three exchanges  $(1\leftrightarrow 2,2\leftrightarrow 3,$  and  $3\leftrightarrow 1)$ .

** Problem 5.11 In Section 5.1 we found that for noninteracting particles the wave function can be expressed as a product of single-particle states (Equation 5.9)—or, for identical particles, as a symmetrized/antisymmetrized linear combination of such states (Equations 5.20 and 5.21). For interacting particles this is no longer the case. A famous example is the Laughlin wave function,[13] which is an approximation to the ground state of  $N$  electrons confined to two dimensions in a perpendicular magnetic field of strength  $B$  (the setting for the fractional quantum Hall effect). The Laughlin wave function is

$$
\psi \left(z _ {1}, z _ {2}, \dots , z _ {N}\right) = A \left[ \prod_ {j &lt;   k} ^ {N} \left(z _ {j} - z _ {k}\right) ^ {q} \right] \exp \left[ - \frac {1}{2} \sum_ {k} ^ {N} | z _ {k} | ^ {2} \right]
$$

where  $q$  is a positive odd integer and

$$
z_j \equiv \sqrt{\frac{eB}{2\hbar c}} \left(x_j + i y_j\right).
$$

(Spin is not at issue here; in the ground state all the electrons have spin down with respect to the direction of $\mathbf{B}$, and that is a trivially symmetric configuration.)

(a) Show that $\psi$ has the proper antisymmetry for fermions.

(b) For $q = 1, \psi$ describes noninteracting particles (by which I mean that it can be written as a single Slater determinant—see Problem 5.8). This is true for any $N$, but check it explicitly for $N = 3$. What single particle states are occupied in this case?

(c) For values of $q$ greater than 1, $\psi$ cannot be written as a single Slater determinant, and describes interacting particles (in practice, Coulomb repulsion of the electrons). It can, however, be written as a sum of Slater determinants. Show that, for $q = 3$ and $N = 2$, $\psi$ can be written as a sum of two Slater determinants.

Comment: In the noninteracting case (b) we can describe the wave function as “three particles occupying the three single-particle states $\psi_{\omega}$, $\psi_b$ and $\psi_c$” but in the interacting case (c), no corresponding statement can be made; in that case, the different Slater determinants that make up $\psi$ correspond to occupation of different sets of single-particle states.

266

267

# 5.2 Atoms

A neutral atom, of atomic number $Z$, consists of a heavy nucleus, with electric charge $Ze$, surrounded by $Z$ electrons (mass $m$ and charge $-e$). The Hamiltonian for this system is$^{13}$

$$
\hat{H} = \sum_{j=1}^{Z} \left\{ -\frac{\hbar^2}{2m} \nabla_j^2 - \left( \frac{1}{4\pi \epsilon_0} \right) \frac{Z e^2}{r_j} \right\} + \frac{1}{2} \left( \frac{1}{4\pi \epsilon_0} \right) \sum_{j\neq k}^{Z} \frac{e^2}{|\mathbf{r}_j - \mathbf{r}_k|}. \tag{5.36}
$$

The term in curly brackets represents the kinetic plus potential energy of the $j$th electron, in the electric field of the nucleus; the second sum (which runs over all values of $j$ and $k$ except $j \equiv k$) is the potential energy associated with the mutual repulsion of the electrons (the factor of $1/2$ in front corrects for the fact that the summation counts each pair twice). The problem is to solve Schrödinger's equation,

$$
\hat{H} \psi = E \psi, \tag{5.37}
$$

for the wave function $\psi(\mathbf{r}_1, \mathbf{r}_2, \dots, \mathbf{r}_Z)$.$^{15}$

Unfortunately, the Schrödinger equation with Hamiltonian in Equation 5.36 cannot be solved exactly (at any rate, it hasn't been), except for the very simplest case, $Z \equiv 1$ (hydrogen). In practice, one must resort to elaborate approximation methods. Some of these we shall explore in Part II; for now I plan only to sketch some qualitative features of the solutions, obtained by neglecting the electron repulsion term altogether. In Section 5.2.1 we'll study the ground state and excited states of helium, and in Section 5.2.2 we'll examine the ground states of higher atoms.

## Problem 5.12

(a) Suppose you could find a solution $\psi(\mathbf{r}_1, \mathbf{r}_2, \dots, \mathbf{r}_Z)$ to the Schrödinger equation (Equation 5.37), for the Hamiltonian in Equation 5.36. Describe how you would construct from it a completely symmetric function, and a completely antisymmetric function, which also satisfy the Schrödinger equation, with the same energy. What happens to the completely antisymmetric function if $\psi(\mathbf{r}_1, \mathbf{r}_2, \dots, \mathbf{r}_Z)$ is symmetric in (say) its first two arguments ($\mathbf{r}_1 \leftrightarrow \mathbf{r}_2$)?

(b) By the same logic, show that a completely antisymmetric spin state for $Z$ electrons is impossible, if $Z &gt; 2$ (this generalizes Problem 5.10(a)).

5.2.1 Helium

After hydrogen, the simplest atom is helium ($Z=2$). The Hamiltonian,

$\hat{H}=\left\{-\frac{\hbar^{2}}{2m}\nabla_{1}^{2}-\frac{1}{4\pi\epsilon_{0}}\frac{2e^{2}}{r_{1}}\right\}+\left\{-\frac{\hbar^{2}}{2m}\nabla_{2}^{2}-\frac{1}{4\pi\epsilon_{0}}\frac{2e^{2}}{r_{2}}\right\}+\frac{1}{4\pi\epsilon_{0}}\frac{e^{2}}{|\mathbf{r}_{1}-\mathbf{r}_{2}|},$ (5.38)

consists of two hydrogenic Hamiltonians (with nuclear charge $2e$), one for electron 1 and one for electron 2, together with a final term describing the repulsion of the two electrons. It is this last term that causes all the trouble. If we simply ignore it, the Schrödinger equation separates, and the solutions can be written as products of hydrogen wave functions:

$\psi\left(\mathbf{r}_{1},\mathbf{r}_{2}\right)=\psi_{n\ell m}(\mathbf{r}_{1})\psi_{n^{\prime}\ell^{\prime}m^{\prime}}(\mathbf{r}_{2}),$ (5.39)

only with half the Bohr radius (Equation 4.72), and four times the Bohr energies (Equation 4.70)—if you don’t see why, refer back to Problem 4.19. The total energy would be

$E=4\left(E_{n}+E_{n^{\prime}}\right),$ (5.40)

where $E_{n}=-13.6/n^{2}$ eV. In particular, the ground state would be

$\psi_{0}(\mathbf{r}_{1},\mathbf{r}_{2})=\psi_{100}(\mathbf{r}_{1})\psi_{100}(\mathbf{r}_{2})=\frac{8}{\pi a^{3}}e^{-2\left(r_{1}+r_{2}\right)/a},$ (5.41)

(Equation 4.80), and its energy would be

$E_{0}=8\left(-13.6\text{eV}\right)=-109\text{eV}.$ (5.42)

Because $\psi_{0}$ is a symmetric function, the spin state has to be antisymmetric, so the ground state of helium should be a singlet configuration, with the spins “oppositely aligned.” The actual ground state of helium is indeed a singlet, but the experimentally determined energy is $-$ $78.975$ eV, so the agreement is not very good. But this is hardly surprising: We ignored electron–electron repulsion, which is certainly not a small contribution. It is clearly positive (see Equation 5.38), which is comforting—evidently it brings the total energy up from $-$ $109$ to $-$ $79$ eV (see Problem 5.15).

The excited states of helium consist of one electron in the hydrogenic ground state, and the other in an excited state:

$\psi_{n\ell m}\psi_{100}.$ (5.43)

(If you try to put both electrons in excited states, one immediately drops to the ground state, releasing enough energy to knock the other one into the continuum ($E>0$), leaving you with a helium ion (He^{+}) and a free electron. This is an interesting system in its own right—see Problem 5.13—but it is not our present concern.) We can construct both symmetric and antisymmetric combinations, in the usual way (Equation 5.17); the former go with the antisymmetric spin configuration (the singlet)—they are called parahelium—while the latter require a symmetric spin configuration (the triplet)—they are known as orthohelium. The ground state is necessarily parahelium; the excited states come in both forms. Because the symmetric spatial state brings the electrons closer together (as we discovered in Section 5.1.2), we expect a higher interaction energy in parahelium, and indeed, it is experimentally confirmed that the parahelium states have somewhat higher energy than their orthohelium counterparts (see Figure 5.1).

![img-90.jpeg](img-90.jpeg)
Figure 5.1: Energy level diagram for helium (the notation is explained in Section 5.2.2). Note that parahelium energies are uniformly higher than their orthohelium counterparts. The numerical values on the vertical scale are relative to the ground state of ionized helium  $(\mathrm{He}^{+})$ :  $4 \times (-13.6)\mathrm{eV} = -54.4\mathrm{eV}$ ; to get the total energy of the state, subtract  $54.4\mathrm{eV}$ .

# Problem 5.13

(a) Suppose you put both electrons in a helium atom into the  $n = 2$  state; what would the energy of the emitted electron be? (Assume no photons are emitted in the process.)
(b) Describe (quantitatively) the spectrum of the helium ion,  $\mathrm{He^{+}}$ . That is, state the "Rydberg-like" formula for the emitted wavelengths.

Problem 5.14 Discuss (qualitatively) the energy level scheme for helium if (a) electrons were identical bosons, and (b) if electrons were distinguishable particles (but with the same mass and charge). Pretend these "electrons" still have spin  $1/2$ , so the spin configurations are the singlet and the triplet.

# Problem 5.15

(a) Calculate  $\langle (1 / |\mathbf{r}_1 - \mathbf{r}_2|)\rangle$  for the state  $\psi_0$  (Equation 5.41). Hint: Do the  $d^3\mathbf{r}_2$  integral first, using spherical coordinates, and setting the polar axis

along $\mathbf{r}_1$, so that

$$
\left| \mathbf{r}_1 - \mathbf{r}_2 \right| = \sqrt{r_1^2 + r_2^2 - 2r_1r_2\cos\theta_2}.
$$

The $\theta_2$ integral is easy, but be careful to take the positive root. You'll have to break the $r_2$ integral into two pieces, one ranging from 0 to $r_1$, the other from $r_1$ to $\infty$. Answer: $5/4a$.

(b) Use your result in (a) to estimate the electron interaction energy in the ground state of helium. Express your answer in electron volts, and add it to $E_0$ (Equation 5.42) to get a corrected estimate of the ground state energy. Compare the experimental value. (Of course, we're still working with an approximate wave function, so don't expect perfect agreement.)

Problem 5.16 The ground state of lithium. Ignoring electron–electron repulsion, construct the ground state of lithium ($Z = 3$). Start with a spatial wave function, analogous to Equation 5.41, but remember that only two electrons can occupy the hydrogenic ground state; the third goes to $\psi_{200}$. What is the energy of this state? Now tack on the spin, and antisymmetrize (if you get stuck, refer back to Problem 5.10). What's the degeneracy of the ground state?

270

271

## 5.2.2 The Periodic Table

The ground state electron configurations for heavier atoms can be pieced together in much the same way. To first approximation (ignoring their mutual repulsion altogether) the individual electrons occupy one-particle hydrogenic states $(n, \ell, m)$, called orbitals, in the Coulomb potential of a nucleus with charge $Ze$. If electrons were bosons (or distinguishable particles) they would all shake down to the ground state $(1, 0, 0)$, and chemistry would be very dull indeed. But electrons are in fact identical fermions, subject to the Pauli exclusion principle, so only two can occupy any given orbital (one with spin up, and one with spin down—or, more precisely, in the singlet configuration). There are $n^2$ hydrogenic wave functions (all with the same energy $E_n$) for a given value of $n$, so the $n = 1$ shell has room for two electrons, the $n = 2$ shell holds eight, $n = 3$ takes 18, and in general the $n$th shell can accommodate $2n^2$ electrons. Qualitatively, the horizontal rows on the Periodic Table correspond to filling out each shell (if this were the whole story, they would have lengths 2, 8, 18, 32, 50, etc., instead of 2, 8, 8, 18, 18, etc.; we'll see in a moment how the electron-electron repulsion throws the counting off).

With helium, the $n = 1$ shell is filled, so the next atom, lithium ($Z = 3$), has to put one electron into the $n = 2$ shell. Now, for $n = 2$ we can have $\ell = 0$ or $\ell = 1$; which of these will the third electron choose? In the absence of electron-electron interactions, they have the same energy (the Bohr energies depend on $n$, remember, but not on $\ell$). But the effect of electron repulsion is to favor the lowest value of $\ell$, for the following reason. Angular momentum tends to throw the electron outward, and the farther out it gets, the more effectively the inner electrons screen the nucleus (roughly speaking, the innermost electron "sees" the full nuclear charge $Ze$, but the outermost electron sees an effective charge hardly greater than $e$). Within a given shell, therefore, the state with lowest energy (which is to say, the most tightly bound electron) is $\ell = 0$, and the energy increases with increasing $\ell$. Thus the third electron in lithium occupies the orbital $(2,0,0)$. [17] The next atom (beryllium, with $Z = 4$) also fits into this state (only with "opposite spin"), but boron ($Z = 5$) has to make use of $\ell = 1$.

Continuing in this way, we reach neon ($Z = 10$), at which point the $n = 2$ shell is filled, and we advance to the next row of the periodic table and begin to populate the $n = 3$ shell. First there are two atoms (sodium and magnesium) with $\ell = 0$, and then there are six with $\ell = 1$ (aluminum through argon). Following argon there "should" be 10 atoms with $n = 3$ and $\ell = 2$; however, by this time the screening effect is so strong that it overlaps the next shell; potassium ($Z = 19$) and calcium ($Z = 20$) choose $n = 4$, $\ell = 0$, in preference to $n = 3$, $\ell = 2$. After that we drop back to pick up the $n = 3$, $\ell = 2$ stragglers (scandium through zinc), followed by $n = 4$, $\ell = 1$ (gallium through krypton), at which point we again make a premature jump to the next row ($n = 5$), and wait until later to slip in the $\ell = 2$ and $\ell = 3$ orbitals from the $n = 4$ shell. For details of this intricate counterpoint I refer you to any book on atomic physics. [18]

I would be delinquent if I failed to mention the archaic nomenclature for atomic states, because all chemists and most physicists use it (and the people who make up the Graduate Record Exam have this sort of thing). For reasons known best to nineteenth-century spectroscopists, $\ell = 0$ is called $s$ (for "sharp"), $\ell = 1$ is $p$ (for "principal"), $\ell = 2$ is $d$ ("diffuse"), and $\ell = 3$ is $f$ ("fundamental"); after that I guess they ran out of imagination, because it now continues alphabetically ($g, h, i$, skip $j$, just to be utterly perverse, $k, l$, etc.). [19] The state of a particular electron is represented by the pair $n\ell$, with $n$ (the number) giving the shell, and $\ell$ (the letter) specifying the orbital angular momentum; the magnetic quantum number $m$ is not listed, but an exponent is used to indicate the number of electrons that occupy the state in question. Thus the configuration

$$
(1 s) ^ {2} (2 s) ^ {2} (2 p) ^ {2} \tag {5.44}
$$

tells us that there are two electrons in the orbital  $(1,0,0)$ , two in the orbital  $(2,0,0)$ , and two in some combination of the orbitals  $(2,1,1)$ ,  $(2,1,0)$ , and  $(2,1,-1)$ . This happens to be the ground state of carbon.

In that example there are two electrons with orbital angular momentum quantum number 1, so the total orbital angular momentum quantum number,  $L$  (capital  $L$  not to be confused with the  $L$  denoting  $n = 2$  instead of  $\varepsilon$ , to indicate that this pertains to the total, not to any one particle) could be 2, 1, or 0. Meanwhile, the two (1s) electrons are locked together in the singlet state, with total spin zero, and so are the two (2s) electrons, but the two (2p) electrons could be in the singlet configuration or the triplet configuration. So the total spin quantum number  $S$  (capital, again, because it's the total) could be 1 or 0. Evidently the grand total (orbital plus spin),  $J$ , could be 3, 2, 1, or 0 (Equation 4.182). There exist rituals, known as Hund's Rules (see Problem 5.18) for figuring out what these totals will be, for a particular atom. The result is recorded as the following hieroglyphic:

$$
{ } ^ { 2 S + 1 } L _ { J } , \tag {5.45}
$$

(where  $S$  and  $J$  are the numbers, and  $L$  the letter—capitalized, because we're talking about the totals). The ground state of carbon happens to be  $^3 P_0$ : the total spin is 1 (hence the 3), the total orbital angular momentum is 1 (hence the  $P$ ), and the grand total angular momentum is zero (hence the 0). In Table 5.1 the individual configurations and the total angular momenta (in the notation of Equation 5.45) are listed, for the first four rows of the Periodic Table.[20]

Table 5.1: Ground-state electron configurations for the first four rows of the Periodic Table.

|  Z | Element | Configuration  |   |
| --- | --- | --- | --- |
|  1 | H | (1s) | 2S1/2  |
|  2 | He | (1s)2 | 1S0  |
|  3 | Li | (He)(2s) | 2S1/2  |
|  4 | Be | (He)(2s)2 | 1S0  |
|  5 | B | (He)(2s)2(2p) | 2P1/2  |
|  6 | C | (He)(2s)2(2p)2 | 3P0  |

|  7 | N | (He)(2s)2(2p)3 | 4S3/2  |
| --- | --- | --- | --- |
|  8 | O | (He)(2s)2(2p)4 | 3P2  |
|  9 | F | (He)(2s)2(2p)5 | 2P3/2  |
|  10 | Ne | (He)(2s)2(2p)6 | 1S0  |
|  11 | Na | (Ne)(3s) | 2S1/2  |
|  12 | Mg | (Ne)(3s)2 | 1S0  |
|  13 | Al | (Ne)(3s)2(3p) | 2P1/2  |
|  14 | Si | (Ne)(3s)2(3p)2 | 3P0  |
|  15 | P | (Ne)(3s)2(3p)3 | 4S3/2  |
|  16 | S | (Ne)(3s)2(3p)4 | 3P2  |
|  17 | Cl | (Ne)(3s)2(3p)5 | 2P3/2  |
|  18 | Ar | (Ne)(3s)2(3p)6 | 1S0  |
|  19 | K | (Ar)(4s) | 2S1/2  |
|  20 | Ca | (Ar)(4s)2 | 1S0  |
|  21 | Sc | (Ar)(4s)2(3d) | 2D3/2  |
|  22 | Ti | (Ar)(4s)2(3d)2 | 3F2  |
|  23 | V | (Ar)(4s)2(3d)3 | 4F3/2  |
|  24 | Cr | (Ar)(4s)(3d)5 | 7S1  |
|  25 | Mn | (Ar)(4s)2(3d)5 | 6S5/2  |
|  26 | Fe | (Ar)(4s)2(3d)6 | 5D4  |
|  27 | Co | (Ar)(4s)2(3d)7 | 4F9/2  |
|  28 | Ni | (Ar)(4s)2(3d)8 | 3F4  |
|  29 | Cu | (Ar)(4s)(3d)10 | 2S1/2  |
|  30 | Zn | (Ar)(4s)2(3d)10 | 1S0  |
|  31 | Ga | (Ar)(4s)2(3d)10(4p) | 2P1/2  |
|  32 | Ge | (Ar)(4s)2(3d)10(4p)2 | 3P0  |
|  33 | As | (Ar)(4s)2(3d)10(4p)3 | 4S3/2  |
|  34 | Se | (Ar)(4s)2(3d)10(4p)4 | 3P2  |
|  35 | Br | (Ar)(4s)2(3d)10(4p)5 | 2P3/2  |
|  36 | Kr | (Ar)(4s)2(3d)10(4p)6 | 1S0  |

# Problem 5.17

(a) Figure out the electron configurations (in the notation of Equation 5.44) for the first two rows of the Periodic Table (up to neon), and check your results against Table 5.1.
(b) Figure out the corresponding total angular momenta, in the notation of Equation 5.45, for the first four elements. List all the possibilities for boron, carbon, and nitrogen.

# Problem 5.18

(a) Hund's first rule says that, consistent with the Pauli principle, the state with the highest total spin  $(S)$  will have the lowest energy. What would this predict in the case of the excited states of helium?
(b) Hund's second rule says that, for a given spin, the state with the highest total orbital angular momentum  $(L)$ , consistent with overall antisymmetrization, will have the lowest energy. Why doesn't carbon have  $L = \mathcal{Y}$  Hint: Note that the "top of the ladder"  $(M_L = L)$  is symmetric.

(c) Hund's third rule says that if a subshell  $(n, \ell)$  is no more than half filled, then the lowest energy level has  $J = |L - S|$  if it is more than half filled, then  $J = L + S$  has the lowest energy. Use this to resolve the boron ambiguity in Problem 5.17(b).
(d) Use Hund's rules, together with the fact that a symmetric spin state must go with an antisymmetric position state (and vice versa) to resolve the carbon and nitrogen ambiguities in Problem 5.17(b). Hint: Always go to the "top of the ladder" to figure out the symmetry of a state.

Problem 5.19 The ground state of dysprosium (element 66, in the 6th row of the Periodic Table) is listed as  $^5 I_6$ . What are the total spin, total orbital, and grand total angular momentum quantum numbers? Suggest a likely electron configuration for dysprosium.

275

# 5.3 Solids

In the solid state, a few of the loosely-bound outermost valence electrons in each atom become detached, and roam around throughout the material, no longer subject only to the Coulomb field of a specific "parent" nucleus, but rather to the combined potential of the entire crystal lattice. In this section we will examine two extremely primitive models: first, the "electron gas" theory of Sommerfeld, which ignores all forces (except the confining boundaries), treating the wandering electrons as free particles in a box (the three-dimensional analog to an infinite square well); and second, Bloch's theory, which introduces a periodic potential representing the electrical attraction of the regularly spaced, positively charged, nuclei (but still ignores electron–electron repulsion). These models are no more than the first halting steps toward a quantum theory of solids, but already they reveal the critical role of the Pauli exclusion principle in accounting for "solidity," and provide illuminating insight into the remarkable electrical properties of conductors, semi-conductors, and insulators.

276

# 5.3.1 The Free Electron Gas

Suppose the object in question is a rectangular solid, with dimensions $l_x, l_y, l_z$, and imagine that an electron inside experiences no forces at all, except at the impenetrable walls:

$$
V(x, y, z) = \begin{cases} 0, &amp; 0 &lt; x &lt; l_x, 0 &lt; y &lt; l_y, 0 &lt; z &lt; l_z; \\ \infty, &amp; \text{otherwise}. \end{cases} \tag{5.46}
$$

The Schrödinger equation,

$$
-\frac{\hbar^2}{2m} \nabla^2 \psi = E \psi,
$$

separates, in Cartesian coordinates: $\psi(x, y, z) = X(x)Y(y)Z(z)$, with

$$
-\frac{\hbar^2}{2m} \frac{d^2 X}{dx^2} = E_x X, \quad -\frac{\hbar^2}{2m} \frac{d^2 Y}{dy^2} = E_y Y, \quad -\frac{\hbar^2}{2m} \frac{d^2 Z}{dz^2} = E_z Z,
$$

and $E = E_x + E_y + E_z$. Letting

$$
k_x \equiv \frac{\sqrt{2m E_x}}{\hbar}, \quad k_y \equiv \frac{\sqrt{2m E_y}}{\hbar}, \quad k_z \equiv \frac{\sqrt{2m E_z}}{\hbar},
$$

we obtain the general solutions

$$
X(x) = A_x \sin(k_x x) + B_x \cos(k_x x), \quad Y(y) = A_y \sin(k_y y) + B_y \cos(k_y y),
$$

$$
Z(z) = A_z \sin(k_z z) + B_z \cos(k_z z).
$$

The boundary conditions require that $X(0) = Y(0) = Z(0) = 0$, so $B_x = B_y = B_z = 0$, and $X(l_x) = Y(l_y) = Z(l_z) = 0$, so

$$
k_x l_x = n_x \pi, \quad k_y l_y = n_y \pi, \quad k_z l_z = n_z \pi, \tag{5.47}
$$

where each $n$ is a positive integer:

$$
n_x = 1, 2, 3, \dots, \quad n_y = 1, 2, 3, \dots, \quad n_z = 1, 2, 3, \dots. \tag{5.48}
$$

The (normalized) wave functions are

$$
\psi_{n_x n_y n_z} = \sqrt{\frac{8}{l_x l_y l_z}} \sin\left(\frac{n_x \pi}{l_x} x\right) \sin\left(\frac{n_y \pi}{l_y} y\right) \sin\left(\frac{n_z \pi}{l_z} z\right), \tag{5.49}
$$

and the allowed energies are

$$
E_{n_x n_y n_z} = \frac{\hbar^2 \pi^2}{2m} \left(\frac{n_x^2}{l_x^2} + \frac{n_y^2}{l_y^2} + \frac{n_z^2}{l_z^2}\right) = \frac{\hbar^2 k^2}{2m}, \tag{5.50}
$$

where $k$ is the magnitude of the wave vector, $\mathbf{k} \equiv (k_x, k_y, k_z)$.

If you imagine a three-dimensional space, with axes $k_x, k_y, k_z$, and planes drawn in at $k_x = (\pi / l_x)$, $(2\pi / l_x), (3\pi / l_x), \ldots$, at $k_y = (\pi / l_y), (2\pi / l_y), (3\pi / l_y), \ldots$, and at $k_z = (\pi / l_z), (2\pi / l_z), (3\pi / l_z), \ldots$,

each intersection point represents a distinct (one-particle) stationary state (Figure 5.2). Each block in this grid, and hence also each state, occupies a volume

$$
\frac {\pi^ {3}}{l _ {x} l _ {y} l _ {z}} = \frac {\pi^ {3}}{V} \tag {5.51}
$$

of “ $k$ -space,” where  $V \equiv l_x l_y l_z$  is the volume of the object itself. Suppose our sample contains  $N$  atoms, and each atom contributes  $d$  free electrons. (In practice,  $N$  will be enormous—on the order of Avogadro's number, for an object of macroscopic size—whereas  $d$  is a small number—1, 2, or 3, typically.) If electrons were bosons (or distinguishable particles), they would all settle down to the ground state,  $\psi_{111}$ . But electrons are in fact identical fermions, subject to the Pauli exclusion principle, so only two of them can occupy any given state. They will fill up one octant of a sphere in  $k$ -space, whose radius,  $k_F$ , is determined by the fact that each pair of electrons requires a volume  $\pi^3 / V$  (Equation 5.51):

$$
\frac {1}{8} \left(\frac {4}{3} \pi k _ {F} ^ {3}\right) = \frac {N d}{2} \left(\frac {\pi^ {3}}{V}\right).
$$

Thus

$$
k _ {F} = \left(3 \rho \pi^ {2}\right) ^ {1 / 3}, \tag {5.52}
$$

where

$$
\rho \equiv \frac {N d}{V} \tag {5.53}
$$

is the free electron density (the number of free electrons per unit volume).

277

![img-91.jpeg](img-91.jpeg)
Figure 5.2: Free electron gas. Each intersection on the grid represents a stationary state. The shaded volume is one "block," and there is one state (potentially two electrons) for every block.

The boundary separating occupied and unoccupied states, in  $k$ -space, is called the Fermi surface (hence the subscript  $F$ ). The corresponding energy is the Fermi energy,  $E_{F}$ ; for a free electron gas,

$$
E _ {F} = \frac {\hbar^ {2}}{2 m} \left(3 \rho \pi^ {2}\right) ^ {2 / 3}. \tag {5.54}
$$

The total energy of the electron gas can be calculated as follows: A shell of thickness  $dk$  (Figure 5.3) contains a volume

$$
\frac {1}{8} \left(4 \pi k ^ {2}\right) d k,
$$

so the number of electron states in the shell is

$$
\frac {2 \left[ (1 / 2) \pi k ^ {2} d k \right]}{\left(\pi^ {3} / V\right)} = \frac {V}{\pi^ {2}} k ^ {2} d k.
$$

Each of these states carries an energy  $\hbar^2 k^2 / 2m$  (Equation 5.50), so the energy of the electrons in the shell is

$$
d E = \frac {\hbar^ {2} k ^ {2}}{2 m} \frac {V}{\pi^ {2}} k ^ {2} d k, \tag {5.55}
$$

and hence the total energy of all the filled states is

$$
E _ {\mathrm {t o t}} = \frac {\hbar^ {2} V}{2 \pi^ {2} m} \int_ {0} ^ {k _ {F}} k ^ {4} d k = \frac {\hbar^ {2} k _ {F} ^ {5} V}{1 0 \pi^ {2} m} = \frac {\hbar^ {2} \left(3 \pi^ {2} N d\right) ^ {5 / 3}}{1 0 \pi^ {2} m} V ^ {- 2 / 3}. \tag {5.56}
$$

![img-92.jpeg](img-92.jpeg)
Figure 5.3: One octant of a spherical shell in  $k$ -space.

This quantum mechanical energy plays a role rather analogous to the internal thermal energy  $(U)$  of an ordinary gas. In particular, it exerts a pressure on the walls, for if the box expands by an amount  $dV$ , the total energy decreases:

$$
d E _ {\mathrm {t o t}} = - \frac {2}{3} \frac {\hbar^ {2} \left(3 \pi^ {2} N d\right) ^ {5 / 3}}{1 0 \pi^ {2} m} V ^ {- 5 / 3} d V = - \frac {2}{3} E _ {\mathrm {t o t}} \frac {d V}{V},
$$

and this shows up as work done on the outside  $(dW = PdV)$  by the quantum pressure  $P$ . Evidently

$$
P = \frac {2}{3} \frac {E _ {\mathrm {t o t}}}{V} = \frac {2}{3} \frac {\hbar^ {2} k _ {F} ^ {5}}{1 0 \pi^ {2} m} = \frac {\left(3 \pi^ {2}\right) ^ {2 / 3} \hbar^ {2}}{5 m} \rho^ {5 / 3}. \tag {5.57}
$$

Here, then, is a partial answer to the question of why a cold solid object doesn't simply collapse: There is a stabilizing internal pressure, having nothing to do with electron-electron repulsion (which we have ignored) or thermal motion (which we have excluded), but is strictly quantum mechanical, and derives ultimately from the antisymmetrization requirement for the wave functions of identical fermions. It is sometimes called degeneracy pressure, though "exclusion pressure" might be a better term.[23]

Problem 5.20 Find the average energy per free electron  $(E_{\mathrm{tot}} / Nd)$ , as a fraction of the Fermi energy. Answer:  $(3 / 5)E_F$ .

Problem 5.21 The density of copper is  $8.96\mathrm{g/cm^3}$ , and its atomic weight is 63.5 g/mole.

(a) Calculate the Fermi energy for copper (Equation 5.54). Assume  $d = 1$ , and give your answer in electron volts.
(b) What is the corresponding electron velocity? Hint: Set  $E_{F} = (1 / 2)mv^{2}$ . Is it safe to assume the electrons in copper are nonrelativistic?
(c) At what temperature would the characteristic thermal energy  $\langle k_{B}T$ , where  $k_{B}$  is the Boltzmann constant and  $T$  is the Kelvin temperature) equal the Fermi energy, for copper? Comment: This is called the Fermi

temperature, $T_{F}$. As long as the actual temperature is substantially below the Fermi temperature, the material can be regarded as "cold," with most of the electrons in the lowest accessible state. Since the melting point of copper is $1356\mathrm{K}$, solid copper is always cold.

(d) Calculate the degeneracy pressure (Equation 5.57) of copper, in the electron gas model.

Problem 5.22 Helium-3 is fermion with spin $1/2$ (unlike the more common isotope helium-4 which is a boson). At low temperatures ($T \ll T_F$), helium-3 can be treated as a Fermi gas (Section 5.3.1). Given a density of $82\mathrm{kg/m^3}$, calculate $T_F$ (Problem 5.21(c)) for helium-3.

Problem 5.23 The bulk modulus of a substance is the ratio of a small decrease in pressure to the resulting fractional increase in volume:

$$
B = - V \frac {d P}{d V}.
$$

Show that $B = (5/3)P$, in the free electron gas model, and use your result in Problem 5.21(d) to estimate the bulk modulus of copper. Comment: The observed value is $13.4 \times 10^{10} \mathrm{~N/m^2}$, but don't expect perfect agreement—after all, we're neglecting all electron-nucleus and electron-electron forces! Actually, it is rather surprising that this calculation comes as close as it does.

280

# 5.3.2 Band Structure

We're now going to improve on the free electron model, by including the forces exerted on the electrons by the regularly spaced, positively charged, essentially stationary nuclei. The qualitative behavior of solids is dictated to a remarkable degree by the mere fact that this potential is periodic—its actual shape is relevant only to the finer details. To show you how it goes, I'm going to develop the simplest possible model: a one-dimensional Dirac comb, consisting of evenly spaced delta-function spikes (Figure 5.4). But first I need to introduce a powerful theorem that vastly simplifies the analysis of periodic potentials.

![img-93.jpeg](img-93.jpeg)
Figure 5.4: The Dirac comb, Equation 5.64.

A periodic potential is one that repeats itself after some fixed distance  $a$ :

$$
V (x + a) = V (x). \tag {5.58}
$$

Bloch's theorem tells us that for such a potential the solutions to the Schrödinger equation,

$$
- \frac {\hbar^ {2}}{2 m} \frac {d ^ {2} \psi}{d x ^ {2}} + V (x) \psi = E \psi , \tag {5.59}
$$

can be taken to satisfy the condition

$$
\psi (x + a) = e ^ {i q a} \psi (x), \tag {5.60}
$$

for some constant  $q$  (by "constant" I mean that it is independent of  $x$ ; it may well depend on  $E$ ). In a moment we will discover that  $q$  is in fact real, so although  $\psi(x)$  itself is not periodic,  $|\psi(x)|^2$  is:

$$
\left| \psi (x + a) \right| ^ {2} = \left| \psi (x) \right| ^ {2}, \tag {5.61}
$$

as one would certainly expect.[26]

Of course, no real solid goes on forever, and the edges are going to spoil the periodicity of  $V(x)$ , and render Bloch's theorem inapplicable. However, for any macroscopic crystal, containing something on the order of Avogadro's number of atoms, it is hardly imaginable that edge effects can significantly influence the behavior of electrons deep inside. This suggests the following device to salvage Bloch's theorem: We wrap the  $x$  axis around in a circle, and connect it onto its tail, after a large number  $N \approx 10^{23}$  of periods; formally, we impose the boundary condition

$$
\psi (x + N a) = \psi (x). \tag {5.62}
$$

It follows (from Equation 5.60) that

$$
e ^ {i N q a} \psi (x) = \psi (x),
$$

so  $e^{iNqa} = 1$ , or  $Nqa = 2\pi n$ , and hence

$q=\frac{2\pi\,n}{Na},\quad(n=0,\ \pm 1,\ \pm 2,\ \ldots)\,.$ (5.63)

In particular, $q$ is necessarily real. The virtue of Bloch’s theorem is that we need only solve the Schrödinger equation within a single cell (say, on the interval $0\leq x<a$); recursive application of Equation 5.60 generates the solution everywhere else.

Now, suppose the potential consists of a long string of delta-function spikes (the Dirac comb):

$V(x)=\alpha\sum_{j=0}^{N-1}\delta\left(x-ja\right)\,.$ (5.64)

(In Figure 5.4 you must imagine that the $x$ axis has been “wrapped around”, so the $N$th spike actually appears at $x=-a$.) No one would pretend that this is a realistic model, but remember, it is only the effect of periodicity that concerns us here; the classic Kronig–Penney model*[27]* used a repeating rectangular pattern, and many authors still prefer that one.*[28]* In the region $0<x<a$ the potential is zero, so

$-\frac{\hbar^{2}}{2m}\frac{d^{2}\psi}{dx^{2}}=E\psi,$

or

$\frac{d^{2}\psi}{dx^{2}}=-k^{2}\psi,$

where

$k\equiv\frac{\sqrt{2mE}}{\hbar},$ (5.65)

as usual.

The general solution is

$\psi(x)=A\sin\left(kx\right)+B\cos\left(kx\right),\quad(0<x<a)\,.$ (5.66)

According to Bloch’s theorem, the wave function in the cell immediately to the left of the origin is

$\psi\left(x\right)=e^{-iqa}\left\{A\sin\,\left[k\left(x+a\right)\right]+B\cos\,\left[k\left(x+a\right)\right]\right\},\qquad(-a<x<0)\,.$ (5.67)

At $x=0$, $\psi$ must be continuous, so

$B=e^{-iqa}\left[A\sin\left(ka\right)+B\cos\left(ka\right)\right];$ (5.68)

its derivative suffers a discontinuity proportional to the strength of the delta function (Equation 2.128, with the sign of $0$ switched, since these are spikes instead of wells):

$kA-e^{-iqa}k\left[A\cos\left(ka\right)-B\sin\left(ka\right)\right]=\frac{2m\alpha}{\hbar^{2}}B.$ (5.69)

Solving Equation 5.68 for $A\sin\left(ka\right)$ yields

$A\sin\left(ka\right)=\left[e^{i\,qa}-\cos\left(ka\right)\right]B.$ (5.70)

Substituting this into Equation 5.69, and cancelling  $kB$ , we find

$$
\left[ e ^ {i q a} - \cos (k a) \right] \left[ 1 - e ^ {- i q a} \cos (k a) \right] + e ^ {- i q a} \sin^ {2} (k a) = \frac {2 m \alpha}{h ^ {2} k} \sin (k a),
$$

which simplifies to

$$
\cos (q a) = \cos (k a) + \frac {m \alpha}{h ^ {2} k} \sin (k a). \tag {5.71}
$$

This is the fundamental result, from which all else follows.[29]

Equation 5.71 determines the possible values of  $k$ , and hence the allowed energies. To simplify the notation, let

$$
z \equiv k a, \quad \text {and} \quad \beta \equiv \frac {m \alpha a}{h ^ {2}}, \tag {5.72}
$$

so the right side of Equation 5.71 can be written as

$$
f (z) \equiv \cos (z) + \beta \frac {\sin (z)}{z}. \tag {5.73}
$$

The constant  $\beta$  is a dimensionless measure of the "strength" of the delta function. In Figure 5.5 I have plotted  $f(z)$ , for the case  $\beta = 10$ . The important thing to notice is that  $f(z)$  strays outside the range  $(-1, +1)$ , and in such regions there is no hope of solving Equation 5.71, since  $|\cos (qa)|$ , of course, cannot be greater than 1. These gaps represent forbidden energies; they are separated by bands of allowed energies. Within a given band, virtually any energy is allowed, since according to Equation 5.63,  $qa = 2\pi n / N$ , where  $N$  is a huge number, and  $n$  can be any integer. You might imagine drawing  $N$  horizontal lines on Figure 5.5, at values of  $\cos (2\pi n / N)$  ranging from  $+1$  ( $n = 0$ ) down to  $-1$  ( $n = N / 2$ ), and back almost to  $+1$  ( $n = N - 1$ )—at this point the Bloch factor  $e^{iqa}$  recycles, so no new solutions are generated by further increasing  $n$ . The intersection of each of these lines with  $f(z)$  yields an allowed energy. Evidently there are  $N$  states in each band, so closely spaced that for most purposes we can regard them as forming a continuum (Figure 5.6).

![img-94.jpeg](img-94.jpeg)
Figure 5.5: Graph of  $f(z)$  (Equation 5.73) for  $\beta = 10$ , showing allowed bands separated by forbidden gaps.

283

![img-95.jpeg](img-95.jpeg)
Figure 5.6: The allowed energies for a periodic potential form essentially continuous bands.

So far, we've only put one electron in our potential. In practice there will be  $Nd$  of them, where  $d$  is again the number of "free" electrons per atom. Because of the Pauli exclusion principle, only two electrons can occupy a given spatial state, so if  $d = 1$ , they will half fill the first band, if  $d = 2$  they will completely fill the first band, if  $d = 3$  they half fill the second band, and so on. (In three dimensions, and with more realistic potentials, the band structure may be more complicated, but the existence of allowed bands, separated by forbidden gaps, persists—band structure is the signature of a periodic potential.[20])

Now, if the topmost band is only partly filled, it takes very little energy to excite an electron to the next allowed level, and such a material will be a conductor (a metal). On the other hand, if the top band is completely filled, it takes a relatively large energy to excite an electron, since it has to jump across the forbidden zone. Such materials are typically insulators, though if the gap is rather narrow, and the temperature sufficiently high, then random thermal energy can knock an electron over the hump, and the material is a semiconductor (silicon and germanium are examples).[21] In the free electron model all solids should be metals, since there are no large gaps in the spectrum of allowed energies. It takes the band theory to account for the extraordinary range of electrical conductivities exhibited by the solids in nature.

# Problem 5.24

(a) Using Equations 5.66 and 5.70, show that the wave function for a particle in the periodic delta function potential can be written in the form

$$
\psi (x) = C \left\{\sin (k x) + e ^ {- i q a} \sin [ k (a - x) ] \right\}, \qquad (0 \leq x \leq a).
$$

(Don't bother to determine the normalization constant  $C$ .)

(b) At the top of a band, where  $z = j\pi$ , (a) yields  $\psi(x) = 0/0$  (indeterminate). Find the correct wave function for this case. Note what happens to  $\psi$  at each delta function.

Problem 5.25 Find the energy at the bottom of the first allowed band, for the case  $\beta = 10$ , correct to three significant digits. For the sake of argument, assume  $\alpha / a = 1 \mathrm{eV}$ .

Problem 5.26 Suppose we use delta function wells, instead of spikes (i.e. switch the sign of  $\mathfrak{a}$  in Equation 5.64). Analyze this case, constructing the analog to Figure 5.5. This requires no new calculation, for the positive energy solutions (except that  $\beta$  is now negative; use  $\beta = -1.5$  for the graph), but you do need to work out the negative energy solutions (let  $\kappa \equiv \sqrt{-2mE} /\hbar$  and  $z\equiv -\kappa a$ , for  $E &lt; 0$ ); your graph will now extend to negative  $z$ ). How many states are there in the first allowed band?

Problem 5.27 Show that most of the energies determined by Equation 5.71 are doubly degenerate. What are the exceptional cases? Hint: Try it for  $N = 1, 2, 3, 4, \ldots$ , to see how it goes. What are the possible values of  $\cos(qa)$  in each case?

Problem 5.28 Make a plot of  $E$  vs.  $q$  for the band structure in Section 5.3.2. Use  $\alpha = 1$  (in units where  $m = \hbar = a = 1$ ). Hint: In Mathematica, ContourPlot will graph  $E(q)$  as defined implicitly by Equation 5.71. On other platforms the plot can be obtained as follows:

- Choose a large number (say 30,000) of equally-spaced values for the energy in the range  $E = 0$  and  $E = 30$ .
- For each value of  $E$ , compute the right-hand side of Equation 5.71. If the result is between -1 and 1, solve for  $q$  from Equation 5.71 and record the pair of values  $\{\mathsf{q},\mathsf{E}\}$  and  $\{-\mathsf{q},\mathsf{E}\}$  (there are two solutions for each energy).

You will then have a list of pairs  $\{\{\mathsf{q1},\mathsf{E1}\} ,\{\mathsf{q2},\mathsf{E2}\} ,\ldots \}$  which you can plot.

Further Problems on Chapter 5

Problem 5.29 Suppose you have three particles, and three distinct one-particle states $(\psi_{a}(x),\psi_{b}(x)$, and $\psi_c(x))$ are available. How many different three-particle states can be constructed (a) if they are distinguishable particles, (b) if they are identical bosons, (c) if they are identical fermions? (The particles need not be in different states—$\psi_{a}(x_{1})\psi_{a}(x_{2})\psi_{a}(x_{3})$ would be one possibility, if the particles are distinguishable.)

Problem 5.30 Calculate the Fermi energy for electrons in a two-dimensional infinite square well. Let $\sigma$ be the number of free electrons per unit area.

Problem 5.31 Repeat the analysis of Problem 2.58 to estimate the cohesive energy for a three-dimensional metal, including the effects of spin.

Problem 5.32 Consider a free electron gas (Section 5.3.1) with unequal numbers of spin-up and spin-down particles ($N_{+}$ and $N_{-}$ respectively). Such a gas would have a net magnetization (magnetic dipole moment per unit volume)

$$
\mathbf {M} = - \frac {\left(N _ {+} - N _ {-}\right)}{V} \mu_ {B} \hat {k} = M \hat {k}, \tag {5.74}
$$

where $\mu_B = e\hbar /2m_e$ is the Bohr magneton. (The minus sign is there, of course, because the charge of the electron is negative.)

(a) Assuming that the electrons occupy the lowest energy levels consistent with the number of particles in each spin orientation, find $E_{\mathrm{tot}}$. Check that your answer reduces to Equation 5.56 when $N_{+} = N_{-}$.

(b) Show that for $M / \mu_B \ll \rho \equiv (N_+ + N_-) / V$ (which is to say, $|N_{+} - N_{-}| \ll (N_{+} + N_{-})$), the energy density is

$$
\frac {1}{V} E _ {\mathrm {t o t}} = \frac {\hbar^ {2} \left(3 \pi^ {2} \rho\right) ^ {5 / 3}}{1 0 \pi^ {2} m} \left[ 1 + \frac {5}{9} \left(\frac {M}{\rho \mu_ {B}}\right) ^ {2} \right].
$$

The energy is a minimum for $M = 0$, so the ground state will have zero magnetization. However, if the gas is placed in a magnetic field (or in the presence of interactions between the particles) it may be energetically favorable for the gas to magnetize. This is explored in Problems 5.33 and 5.34.

Problem 5.33 Pauli paramagnetism. If the free electron gas (Section 5.3.1) is placed in a uniform magnetic field $\mathbf{B} = B\hat{\mathbf{k}}$, the energies of the spin-up and spin-down states will be different: $^{32}$

286

$$
E _ {n _ {3} n _ {7} n _ {2}} ^ {\pm} = \frac {\hbar^ {2} \pi^ {2}}{2 m} \left(\frac {n _ {2} ^ {2}}{l _ {5} ^ {2}} + \frac {n _ {7} ^ {2}}{l _ {7} ^ {2}} + \frac {n _ {2} ^ {2}}{l _ {5} ^ {2}}\right) \pm \mu_ {B} B.
$$

There will be more spin-down states occupied than spin-up states (since they are lower in energy), and consequently the system will acquire a magnetization (see Problem 5.32).

(a) In the approximation that  $M / \mu_B \ll \rho$ , find the magnetization that minimizes the total energy. Hint: Use the result of Problem 5.32(b).
(b) The magnetic susceptibility is

$$
\chi = \mu_ {0} \frac {d M}{d B}.
$$

Calculate the magnetic susceptibility for aluminum  $(\rho = 18.1\times 10^{22}\mathrm{cm}^{-3})$  and compare the experimental value $^{34}$  of  $22\times 10^{-6}$ .

Problem 5.34 The Stoner criterion. The free-electron gas model (Section 5.3.1) ignores the Coulomb repulsion between electrons. Because of the exchange force (Section 5.1.2), Coulomb repulsion has a stronger effect on two electrons with antiparallel spins (which behave in a way like distinguishable particles) than two electrons with parallel spins (whose position wave function must be antisymmetric). As a crude way to take account of Coulomb repulsion, pretend that every pair of electrons with opposite spin carries extra energy  $U$ , while electrons with the same spin do not interact at all; this adds  $\Delta E = UN_{+}N_{-}$  to the total energy of the electron gas. As you will show, above a critical value of  $U$ , it becomes energetically favorable for the gas to spontaneously magnetize  $(N_{+}\neq N_{-})$ ; the material becomes ferromagnetic.

(a) Rewrite  $\Delta E$  in terms of the density  $\rho$  and the magnetization  $M$  (Equation 5.74).
(b) Assuming that  $M / \mu_B \ll \rho$ , for what minimum value of  $U$  is a non-zero magnetization energetically favored? Hint: Use the result of Problem 5.32(b).

Problem 5.35 Certain cold stars (called white dwarfs) are stabilized against gravitational collapse by the degeneracy pressure of their electrons (Equation 5.57). Assuming constant density, the radius  $R$  of such an object can be calculated as follows:

(a) Write the total electron energy (Equation 5.56) in terms of the radius, the number of nucleons (protons and neutrons)  $N$ , the number of electrons per nucleon  $d$ , and the mass of the electron  $m$ . Beware: In this problem we are recycling the letters  $N$  and  $d$  for a slightly different purpose than in the text.
(b) Look up, or calculate, the gravitational energy of a uniformly dense sphere. Express your answer in terms of  $G$  (the constant of universal

gravitation), $R$, $N$, and $M$ (the mass of a nucleon). Note that the gravitational energy is negative.

(c) Find the radius for which the total energy, (a) plus (b), is a minimum. Answer:

$$
R = \left(\frac {9 \pi}{4}\right) ^ {2 / 3} \frac {\hbar^ {2} d ^ {5 / 3}}{G m M ^ {2} N ^ {1 / 3}}.
$$

(Note that the radius decreases as the total mass increases!) Put in the actual numbers, for everything except $N$, using $d = 1/2$ (actually, $d$ decreases a bit as the atomic number increases, but this is close enough for our purposes). Answer: $R = 7.6 \times 10^{25} N^{-1/3} \, \mathrm{m}$.

(d) Determine the radius, in kilometers, of a white dwarf with the mass of the sun.

(e) Determine the Fermi energy, in electron volts, for the white dwarf in (d), and compare it with the rest energy of an electron. Note that this system is getting dangerously relativistic (see Problem 5.36).

***

Problem 5.36 We can extend the theory of a free electron gas (Section 5.3.1) to the relativistic domain by replacing the classical kinetic energy, $E = p^2 / 2m$, with the relativistic formula, $E = \sqrt{p^2c^2 + m^2c^4} - mc^2$. Momentum is related to the wave vector in the usual way: $\mathbf{p} = \hbar \mathbf{k}$. In particular, in the extreme relativistic limit, $E \approx pc = \hbar ck$.

(a) Replace $\hbar^2 k^2 / 2m$ in Equation 5.55 by the ultra-relativistic expression, $\hbar ck$, and calculate $E_{\mathrm{tot}}$ in this regime.

(b) Repeat parts (a) and (b) of Problem 5.35 for the ultra-relativistic electron gas. Notice that in this case there is no stable minimum, regardless of $R$; if the total energy is positive, degeneracy forces exceed gravitational forces, and the star will expand, whereas if the total is negative, gravitational forces win out, and the star will collapse. Find the critical number of nucleons, $N_{c}$, such that gravitational collapse occurs for $N &gt; N_{c}$. This is called the Chandrasekhar limit. Answer: $2.04 \times 10^{57}$. What is the corresponding stellar mass (give your answer as a multiple of the sun's mass). Stars heavier than this will not form white dwarfs, but collapse further, becoming (if conditions are right) neutron stars.

(c) At extremely high density, inverse beta decay, $e^{-} + p^{+} \rightarrow n + \nu$, converts virtually all of the protons and electrons into neutrons (liberating neutrinos, which carry off energy, in the process). Eventually neutron degeneracy pressure stabilizes the collapse, just as electron degeneracy does for the white dwarf (see Problem 5.35). Calculate the radius of a neutron star with the mass of the sun. Also calculate the (neutron) Fermi energy, and compare it to the rest energy of a neutron. Is it reasonable to treat a neutron star nonrelativistically?

288

Problem 5.37 An important quantity in many calculations is the density of states $G(E)$:

$G(E)dE\equiv$ number of states with energy between $E$ and $E+dE$.

For a one-dimensional band structure,

$G(E)dE=2\left(\frac{dq}{2\pi/Na}\right),$

where $dq/(2\pi/Na)$ counts the number of states in the range $dq$ (see Equation 5.63), and the factor of 2 accounts for the fact that states with $q$ and $-q$ have the same energy. Therefore

$\frac{1}{Na}G(E)=\frac{1}{\pi}\frac{1}{|dE/dq|}.$

(a) Show that for $\alpha=0$ (a free particle) the density of states is given by

$\frac{1}{Na}G_{\text{free}}(E)=\frac{1}{\pi\hbar}\sqrt{\frac{m}{2E}}.$

(b) Find the density of states for $\alpha\neq 0$ by differentiating Equation 5.71 with respect to $q$ to determine $dE/dq$. Note: Your answer should be written as a function of $E$ only (well, and $\mathsf{a}$, $m,\hbar$, $a$, and $N$) and must not contain $q$ (use $k$ as a shorthand for $\sqrt{2mE}/\hbar$, if you like).

(c) Make a single plot showing $G(E)/Na$ for both $\alpha=0$ and $\alpha=1$ (in units where $m=\hbar=a=1$). Comment: The divergences at the band edges are examples of van Hove singularities. [35]

Problem 5.38 The harmonic chain consists of $N$ equal masses arranged along a line and connected to their neighbors by identical springs:

$\hat{H}=-\frac{\hbar^{2}}{2m}\sum_{j=1}^{N}\frac{\partial}{\partial x_{j}^{2}}+\sum_{j=1}^{N}\frac{1}{2}m\omega^{2}\left(x_{j+1}-x_{j}\right)^{2},$

where $x_{j}$ is the displacement of the $j$th mass from its equilibrium position. This system (and its extension to two or three dimensions—the harmonic crystal) can be used to model the vibrations of a solid. For simplicity we will use periodic boundary conditions: $x_{N+1}=x_{1}$, and introduce the ladder operators [36]

$\hat{a}_{k\pm}\equiv\frac{1}{\sqrt{N}}\sum_{j=1}^{N}e^{\pm i2\pi jk/N}\left[\sqrt{\frac{m\omega_{k}}{2\hbar}}x_{j}\mp\sqrt{\frac{\hbar}{2m\omega_{k}}}\frac{\partial}{\partial x_{j}}\right]$ (5.75)

where $k=1,\dots,N-1$ and the frequencies are given by

$$
\omega_{k} = 2 \omega \sin \left(\frac{\pi k}{N}\right).
$$

(a) Prove that, for integers $k$ and $k'$ between 1 and $N - 1$,

$$
\frac{1}{N} \sum_{j=1}^{N} e^{i 2 \pi j (k - k') / N} = \delta_{k', k}
$$

$$
\frac{1}{N} \sum_{j=1}^{N} e^{i 2 \pi j (k + k') / N} = \delta_{k', N - k}.
$$

Hint: Sum the geometric series.

(b) Derive the commutation relations for the ladder operators:

$$
\left[ \hat{a}_{k-}, \hat{a}_{k'+} \right] = \delta_{k, k'} \text{ and } \left[ \hat{a}_{k-}, \hat{a}_{k'-} \right] = \left[ \hat{a}_{k+}, \hat{a}_{k'+} \right] = 0. \tag{5.76}
$$

(c) Using Equation 5.75, show that

$$
x_{j} = R + \frac{1}{\sqrt{N}} \sum_{k=1}^{N-1} \sqrt{\frac{\hbar}{2 m \omega_{k}}} \left(\hat{a}_{k-} + \hat{a}_{N-k+}\right) e^{i 2 \pi j k / N}
$$

$$
\frac{\partial}{\partial x_{j}} = \frac{1}{N} \frac{\partial}{\partial R} + \frac{1}{\sqrt{N}} \sum_{k=1}^{N-1} \sqrt{\frac{m \omega_{k}}{2 \hbar}} \left(\hat{a}_{k-} - \hat{a}_{N-k+}\right) e^{i 2 \pi j k / N}
$$

where $R = \sum_{j} x_{j} / N$ is the center of mass coordinate.

(d) Finally, show that

$$
\hat{H} = - \frac{\hbar^{2}}{2 (N m)} \frac{\partial^{2}}{\partial R^{2}} + \sum_{k=1}^{N-1} \hbar \omega_{k} \left(\hat{a}_{k+} \hat{a}_{k-} + \frac{1}{2}\right).
$$

Comment: Written in this form above, the Hamiltonian describes $N - 1$ independent oscillators with frequencies $\omega_{k}$ (as well as a center of mass that moves as a free particle of mass $Nm$). We can immediately write down the allowed energies:

$$
E = - \frac{\hbar^{2} K^{2}}{2 (N m)} + \sum_{k=1}^{N-1} \hbar \omega_{k} \left(n_{k} + \frac{1}{2}\right)
$$

where $\hbar K$ is the momentum of the center of mass and $n_k = 0, 1, \ldots$ is the energy level of the $k$th mode of vibration. It is conventional to call $n_k$ the number of phonons in the $k$th mode. Phonons are the quanta of sound (atomic vibrations), just as photons are the quanta of light. The ladder operators $a_{k+}$ and $a_{k-}$ are called phonon creation and annihilation operators since they increase or decrease the number of phonons in the $k$th mode.

Problem 5.39 In Section 5.3.1 we put the electrons in a box with impenetrable walls. The same results can be obtained using periodic boundary conditions. We still imagine the electrons to be confined to a box with sides of length $l_{x}$,

290

$l_{y}$, and $l_{z}$ but instead of requiring the wave function to vanish on each wall, we require it to take the same value on opposite walls:

$\psi\left(x,y,z\right)=\psi\left(x+l_{x},y,z\right)=\psi\left(x,y+l_{y},z\right)=\psi\left(x,y,z+l_{z}\right).$

In this case we can represent the wave functions as *traveling* waves,

$\psi=\frac{1}{\sqrt{l_{x}l_{y}l_{z}}}e^{i\mathbf{k}\cdot\mathbf{r}}=\frac{1}{\sqrt{l_{x}l_{y}l_{z}}}e^{i\left(k_{x}x+k_{y}y+k_{z}z\right)},$

rather than as *standing* waves (Equation 5.49). Periodic boundary conditions—while certainly not physical—are often easier to work with (to describe something like electrical current a basis of traveling waves is more natural than a basis of standing waves) and if you are computing *bulk* properties of a material it shouldn’t matter which you use.

1. [label=()]
2. The classic example of an entangled state is two spin-1/2 particles in the singlet configuration (Equation 4.176).
3. See, for example, Jerry B. Marion and Stephen T. Thornton, *Classical Dynamics of Particles and Systems*, 4th edn, Saunders, Fort Worth, TX (1995), Section 8.2.
4. It seems strange that *relativity* should have anything to do with it, and there has been a lot of discussion as to whether it might be possible to prove the spin-statistics connection in other ways. See, for example, Robert C. Hilborn, *Am. J. Phys.* 63, 298 (1995); Ian Duck and E. C. G. Sudarshan, *Pauli and the Spin–Statistics Theorem*, World Scientific, Singapore (1997). For a comprehensive bibliography on spin and statistics see C. Curceanu, J. D. Gillaspy, and R. C. Hilborn, *Am. J. Phys.* 80, 561 (2010).
5. I’m still leaving out the spin, don’t forget—if this bothers you (after all, a spinless fermion is an oxymoron), assume they’re in the *same* spin state. I’ll show you how spin affects the story in Section 5.1.3
6. For an incisive critique of this terminology see W. J. Mullin and G. Blaylock, *Am. J. Phys.* 71, 1223 (2003).
7. To construct a completely *symmetric* configuration, use the *permanent* (same as determinant, but without the minus signs).
8. In the absence of coupling between spin and position, we are free to assume that the state is *separable* in its spin and spatial coordinates. This just says that the probability of getting spin up is independent of the *location* of the particle. In the *presence* of coupling, the general state would take the form of a linear combination: $\psi_{+}\left(\mathbf{r}\right)\chi_{+}+\psi_{-}\left(\mathbf{r}\right)\chi_{-}$, as in Problem 4.64.
9. I’ll let $\chi\left(1,2\right)$ stand for the combined spin state; in Dirac notation it is some linear combination of the states $\left|s_{1}s_{2}m_{1}m_{2}\right\rangle$. I assume that the state is again a simple product of a position state and a spin state; as you’ll see in Problem 5.10, this is not always true when three or more electrons are involved—even in the absence of coupling.
10. Of course, spin requires three dimensions, whereas we ordinarily think of the infinite square well as existing in one dimension. But it could represent a particle in three dimensions that is confined to a one-dimensional wire.
11. This problem was suggested by Greg Elliott.
12. $\hat{\rho}$ switches the particles $\left(1\leftrightarrow 2\right)$; this means exchanging their positions, their spins, and any other properties they might possess. If you like, it switches the *labels*, 1 and 2. I claimed (in Chapter 1) that all our operators would involve multiplication or differentiation; that was a lie. The exchange operator is an exception—and for that matter so is the projection operator (Section 3.6.2).

292

12 It is sometimes alleged that the symmetrization requirement (Equation 5.33) is forced by the fact that $\hat{p}$ and $\hat{\mu}$ commute. This is false: It is perfectly possible to imagine a system of two distinguishable particles (say, an electron and a positron) for which the Hamiltonian is symmetric, and yet there is no requirement that the state be symmetric (or antisymmetric). But identical particles have to occupy symmetric or antisymmetric states, and this is a new fundamental law—on a par, logically, with Schrödinger's equation and the statistical interpretation. Of course, there didn't have to be any such things as identical particles; it could have been that every single particle in the universe was distinguishable from every other one. Quantum mechanics allows for the possibility of identical particles, and nature (being lazy) seized the opportunity. (But don't complain—this makes matters enormously simpler!)

13 "Robert B. Laughlin—Nobel Lecture: Fractional Quantization." Nobelprize.org. Nobel Media AB 2014. { http://www.nobelprize.org/nobel_prizes/physics/laureates/1998/laughlin-lecture.html}

14 I'm assuming the nucleus is stationary. The trick of accounting for nuclear motion by using the reduced mass (Problem 5.1) works only for the two-body problem; fortunately, the nucleus is so much heavier than the electrons that the correction is extremely small even in the case of hydrogen (see Problem 5.2(a)), and it is smaller still for other atoms. There are more interesting effects, due to magnetic interactions associated with electron spin, relativistic corrections, and the finite size of the nucleus. We'll look into these in later chapters, but all of them are minute corrections to the "purely coulombic" atom described by Equation 5.36.

15 Because the Hamiltonian (5.36) makes no reference to spin, the product $\psi(\mathbf{r}_1, \mathbf{r}_2, \dots, \mathbf{r}_Z) \chi(\mathbf{s}_1, \mathbf{s}_2, \dots, \mathbf{s}_Z)$ still satisfies the Schrödinger equation. However, for $Z &gt; 2$ such product states cannot in general meet the (anti-)symmetrization requirement, and it is necessary to construct linear combinations, with permuted indices (see Problem 5.16). But that comes at the end of the story; for the moment we are only concerned with the spatial wave function.

16 Actually, $\xi = 1$ would do just as well, but electron–electron repulsion favors $\xi = 0$, as we shall see.

17 This standard argument has been called into question by W. Stacey and F. Marsiglio, EPL, 100, 43002 (2012).

18 See, for example, Ugo Fano and L. Fano, Basic Physics of Atoms and Molecules, Wiley, New York (1959), Chapter 18, or the classic by Gerhard Herzberg, Atomic Spectra and Atomic Structure, Dover, New York (1944).

19 The shells themselves are assigned equally arbitrary nicknames, starting (don't ask me why) with $K$: The $K$ shell is $\pi = 1$, the $L$ shell is $\pi = 2$, $M$ is $\pi = 3$, and so on (at least they're in alphabetical order).

20 After krypton—element 36—the situation gets more complicated (fine structure starts to play a significant role in the ordering of the states) so it is not for want of space that the table terminates there.

21 I'm assuming there is no appreciable thermal excitation, or other disturbance, to lift the solid out of its collective ground state. If you like, I'm talking about a "cold" solid, though (as you will see in Problem 5.21(c)), typical solids are still "cold," in this sense, far above room temperature.

22 Because $N$ is such a huge number, we need not worry about the distinction between the actual jagged edge of the grid and the smooth spherical surface that approximates it.

23 We derived Equations 5.52, 5.54, 5.56, and 5.57 for the special case of an infinite rectangular well, but they hold for containers of any shape, as long as the number of particles is extremely large.

24 It would be more natural to let the delta functions go down, so as to represent the attractive force of the nuclei. But then there would be negative energy solutions as well as positive energy solutions, and that makes the calculations more cumbersome (see Problem 5.26). Since all we're trying to do here is explore the consequences of periodicity, it is simpler to adopt this less plausible shape; if it comforts you, think of the nuclei as residing at $\pm a/2, \pm 3a/2, \pm 5a/2, \ldots$.

25 The proof of Bloch's theorem will come in Chapter 6 (see Section 6.2.2).

26 Indeed, you might be tempted to reverse the argument, starting with Equation 5.61, as a way of proving Bloch's theorem. It doesn't work, for Equation 5.61 alone would allow the phase factor in Equation 5.60 to be a function of $x$.

27 R. de L. Kronig and W. G. Penney, Proc. R. Soc. Lond., ser. A, 130, 499 (1930).

28 See, for instance, David Park, Introduction to the Quantum Theory, 3nd edn, McGraw-Hill, New York (1992).

29 For the Kronig–Penney potential (footnote 27, page 221), the formula is more complicated, but it shares the qualitative features we are about to explore.

30 Regardless of dimension, if $d$ is an odd integer you are guaranteed to have partially-filled bands and you would expect metallic behavior. If $d$ is an even integer, it depends on the specific band structure whether there will be partially-filled bands or not. Interestingly, some materials, called Mott insulators, are nonconductors even though $d$ is odd. In that case it is the interactions between electrons that leads to the insulating behavior, not the presence of gaps in the single-particle energy spectrum.

31 Semiconductors typically have band gaps of $4\,\mathrm{eV}$ or less, small enough that thermal excitation at room temperature ($\chi_B T \approx 0.025\,\mathrm{eV}$) produces perceptible conductivity. The conductivity of a semiconductor can be controlled by doping: including a few atoms of larger or smaller $d$; this puts some "extra" electrons into the next higher band, or creates some holes in the previously filled one, allowing in either case for weak electric currents to flow.

32 Here we are considering only the coupling of the spin to the magnetic field, and ignoring any coupling of the orbital motion.

33 Strictly speaking, the susceptibility is $dM/dH$, but the difference is negligible when, as here, $\chi \ll 1$.

34 For some metals, such as copper, the agreement is not so good—even the sign is wrong: copper is diamagnetic ($\chi &lt; 0$). The explanation for this discrepancy lies in what has been left out of our model. In addition to the paramagnetic coupling of the spin magnetic moment to an applied field there is a coupling of the orbital magnetic moment to an applied field and this has both paramagnetic and diamagnetic

contributions (see Problem 4.72). In addition, the free electron gas model ignores the tightly-bound core electrons and these also couple to the magnetic field. In the case of copper, it is the diamagnetic coupling of the core electrons that dominates.

35 These one-dimensional Van Hove singularities have been observed in the spectroscopy of carbon nanotubes; see J. W. G. Wildöer et al., Nature, 391, 59 (1998).

36 If you are familiar with the classical problem of coupled oscillators, these ladder operators are straightforward to construct. Start with the normal mode coordinates you would use to decouple the classical problem, namely

$$
q _ {k} = \frac {1}{\sqrt {N}} \sum_ {j = 1} ^ {N} e ^ {- i 2 \pi j k / N} x _ {j}.
$$

The frequencies $\theta k$ are the classical normal mode frequencies, and you simply create a pair of ladder operators for each normal mode, by analogy with the single-particle case (Equation 2.48).

293

6
Symmetries &amp; Conservation Laws
294

# 6.1 Introduction

Conservation laws (energy, momentum, and angular momentum) are familiar from your first course in classical mechanics. These same conservation laws hold in quantum mechanics; in both contexts they are the result of symmetries. In this chapter we will explain what a symmetry is and what it means for something to be conserved in quantum mechanics—and show how the two are related. Along the way we'll investigate two related properties of quantum systems—energy level degeneracy and the selection rules that distinguish allowed from "forbidden" transitions.

What is a symmetry? It is some transformation that leaves the system unchanged. As an example consider rotating a square piece of paper, as shown in Figure 6.1. If you rotate it by  $30^{\circ}$  about an axis through its center it will be in a different orientation than the one it started in, but if you rotate it by  $90^{\circ}$  it will resume its original orientation; you wouldn't even know it had been rotated unless (say) you wrote numbers on the corners (in which case they would be permuted). A square therefore has a discrete rotational symmetry: a rotation by  $n\pi /2$  for any integer  $n$  leaves it unchanged. If you repeated this experiment with a circular piece of paper, a rotation by any angle would leave it unchanged; the circle has continuous rotational symmetry. We will see that both discrete and continuous symmetries are important in quantum mechanics.

![img-96.jpeg](img-96.jpeg)
Figure 6.1: A square has a discrete rotational symmetry; it is unchanged when rotated by  $\pi /2$  or multiples thereof. A circle has continuous rotational symmetry; it is unchanged when rotated by any angle  $\mathfrak{a}$ .

![img-97.jpeg](img-97.jpeg)

Now imagine that the shapes in Figure 6.1 refer not to pieces of paper, but to the boundaries of a two-dimensional infinite square well. In that case the potential energy would have the same rotational symmetries as the piece of paper and (because the kinetic energy is unchanged by a rotation) the Hamiltonian would also be invariant. In quantum mechanics, when we say that a system has a symmetry, this is what we mean: that the Hamiltonian is unchanged by some transformation, such as a rotation or a translation.

# 6.1.1 Transformations in Space

In this section, we introduce the quantum mechanical operators that implement translations, inversions, and rotations. We define each of these operators by how it acts on an arbitrary function. The translation operator takes a function and shifts it a distance  $a$ . The operator that accomplishes this is defined by the relation

$$
\hat {T} (a) \psi (x) = \psi^ {\prime} (x) = \psi (x - a). \tag {6.1}
$$

The sign can be confusing at first; this equation says that the translated function  $\psi'$  at  $x$  is equal to the untranslated function  $\psi$  at  $x - a$  (Figure 6.2)—the function itself has been shifted to the right by an amount  $a$ .

![img-98.jpeg](img-98.jpeg)
Figure 6.2: A wave function  $\psi(x)$  and the translated wave function  $\psi'(x) = \hat{T}(a)\psi(x)$ . Note that the value of  $\psi'$  at  $x$  is equal to the value of  $\psi$  at  $x - a$ .

The operator that reflects a function about the origin, the parity operator in one dimension, is defined by

$$
\hat {\Pi} \psi (x) = \psi^ {\prime} (x) = \psi (- x).
$$

The effect of parity is shown graphically in Figure 6.3. In three dimensions parity changes the sign of all three coordinates:  $\hat{\Pi}\psi (x,y,z) = \psi (-x, - y, - z)^{2}$

![img-99.jpeg](img-99.jpeg)

Finally, the operator that rotates a function about the $z$ axis through an angle $\varphi$ is most naturally expressed in polar coordinates as

$\hat{R}_{z}\left(\varphi\right)\psi\left(r,\theta,\phi\right)=\psi^{\prime}\left(r,\theta,\phi\right)=\psi\left(r,\theta,\phi-\varphi\right).$ (6.2)

When we take up the study of rotations in Section 6.5, we will introduce expressions for rotations about arbitrary axes. The action of the rotation operator on a function $\psi$ is illustrated in Figure 6.4.

![img-100.jpeg](img-100.jpeg)
Figure 6.3: A function $\psi\left(x\right)$ and the function $\psi^{\prime}\left(x\right)=\hat{\Pi}\psi\left(x\right)=\psi\left(-x\right)$ after a spatial inversion. The value of $\psi^{\prime}$ at $x$ is equal to the value of $\psi$ at $-x$.

Figure 6.4: A function $\psi\left(r,\phi\right)$ and the rotated function $\psi^{\prime}\left(r,\phi\right)=\psi\left(r,\phi-\varphi\right)$ after a counter-clockwise rotation about the vertical axis by an angle $\psi$.

Problem 6.1 Consider the parity operator in three dimensions.

(a) Show that $\hat{\Pi}\psi\left(\mathbf{r}\right)=\psi^{\prime}\left(\mathbf{r}\right)=\psi\left(-\mathbf{r}\right)$ is equivalent to a mirror reflection followed by a rotation.

(b) Show that, for $\psi$ expressed in polar coordinates, the action of the parity operator is

$\hat{\Pi}\psi\left(r,\theta,\phi\right)=\psi\left(r,\pi-\theta,\phi+\pi\right).$

(c) Show that for the hydrogenic orbitals,

$\hat{\Pi}\psi_{n\ell m}\left(r,\theta,\phi\right)=\left(-1\right)^{\ell}\psi_{n\ell m}\left(r,\theta,\phi\right).$

That is, $\psi_{n\ell m}$ is an eigenstate of the parity operator, with eigenvalue $\left(-1\right)^{\ell}$. Note: This result actually applies to the stationary states of any central potential $V\left(\mathbf{r}\right)=V\left(r\right)$. For a central potential, the eigenstates may be written in the separable form $R_{n\ell}\left(r\right)Y_{\ell}^{m}\left(\theta,\phi\right)$ where only the radial function $R_{n\ell}$—which plays no role in determining the parity of the state—depends on the specific functional form of $V(r)$.

297

298

# 6.2 The Translation Operator

Equation 6.1 defines the translation operator. We can express $\hat{T}(a)$ in terms of the momentum operator, to which it is intimately related. To that end, we replace $\psi(x - a)$ by its Taylor series$^3$

$$
\begin{array}{l}
\hat{T}(a) \psi(x) = \psi(x - a) = \sum_{n=0}^{\infty} \frac{1}{n!} (-a)^n \frac{d^n}{dx^n} \psi(x) \\
= \sum_{n=0}^{\infty} \frac{1}{n!} \left(\frac{-ia}{\hbar} \hat{p}\right)^n \psi(x).
\end{array}
$$

The right-hand side of this equation is the exponential function,$^4$ so

$$
\hat{T}(a) = \exp \left[ -\frac{ia}{\hbar} \hat{p} \right]. \tag{6.3}
$$

We say that momentum is the "generator" of translations.$^5$

Note that $\hat{T}(a)$ is a unitary operator:$^6$

$$
\hat{T}(a)^{-1} = \hat{T}(-a) = \hat{T}(a)^\dagger. \tag{6.4}
$$

The first equality is obvious physically (the inverse operation of shifting something to the right is shifting it by an equal amount to the left), and the second equality then follows from taking the adjoint of Equation 6.3 (see Problem 6.2).

*   Problem 6.2 Show that, for a Hermitian operator $\hat{Q}$, the operator $\hat{U} = \exp \left[i \hat{Q}\right]$ is unitary. Hint: First you need to prove that the adjoint is given by $\hat{U}^\dagger = \exp \left[-i \hat{Q}\right]$; then prove that $\hat{U}^\dagger \hat{U} = 1$. Problem 3.5 may help.

299

## 6.2.1 How Operators Transform

So far I have shown how to translate a function; this has an obvious graphical interpretation via Figure 6.2. We can also consider what it means to translate an operator. The transformed operator $\hat{Q}'$ is defined to be the operator that gives the same expectation value in the untranslated state $\psi$ as does the operator $\hat{Q}$ in the translated state $\psi'$:

$$
\left\langle \psi^ {\prime} \middle | \hat {Q} \middle | \psi^ {\prime} \right\rangle = \left\langle \psi \middle | \hat {Q} ^ {\prime} \middle | \psi \right\rangle .
$$

There are two ways to calculate the effect of a translation on an expectation value. One could actually shift the wave function over some distance (this is called an active transformation) or one could leave the wave function where it was and shift the origin of our coordinate system by the same amount in the opposite direction (a passive transformation). The operator $\hat{Q}'$ is the operator in this shifted coordinate system.

Using Equation 6.1,

$$
\left\langle \psi \left| \hat {T} ^ {\dagger} \hat {Q} \hat {T} \right| \psi \right\rangle = \left\langle \psi \left| \hat {Q} ^ {\prime} \right| \psi \right\rangle . \tag {6.5}
$$

Here I am using the fact that the adjoint of an operator is defined such that, if $\hat{T} |f\rangle \equiv |Tf\rangle$, then $\langle Tf| = \langle f|\hat{T}^{\dagger}$ (see Problem 3.5). Because Equation 6.5 is to hold for all $\psi$, it follows that

$$
\hat {Q} ^ {\prime} = \hat {T} ^ {\dagger} \hat {Q} \hat {T}. \tag {6.6}
$$

The transformed operator for the case $\hat{Q} = \hat{x}$ is worked out in Example 6.1. Figure 6.5 illustrates the equivalence of the two ways of carrying out the transformation.

### Example 6.1

Find the operator $\hat{x}^{\prime}$ obtained by applying a translation through a distance $a$ to the operator $\hat{x}$. That is, what is the action of $\hat{x}^{\prime}$, as defined by Equation 6.6, on an arbitrary $f(x)$?

**Solution:** Using the definition of $\hat{x}^{\prime}$ (Equation 6.6) and a test function $f(x)$ we have

$$
\hat {x} ^ {\prime} f (x) = \hat {T} ^ {\dagger} (a) \hat {x} \hat {T} (a) f (x),
$$

and since $\hat{T}^{\dagger}(a) = \hat{T}(-a)$ (Equation 6.4),

$$
\hat {x} ^ {\prime} f (x) = \hat {T} (- a) \hat {x} \hat {T} (a) f (x).
$$

From Equation 6.1

$$
\hat {x} ^ {\prime} f (x) = \hat {T} (- a) x f (x - a),
$$

and from Equation 6.1 again, $\hat{T}(-a) [x f(x - a)] = (x + a) f(x)$, so

$$
\hat {x} ^ {\prime} f (x) = (x + a) f (x).
$$

Finally we may read off the operator

$$
\hat {x} ^ {\prime} = \hat {x} + a. \tag {6.7}
$$

As expected, Equation 6.7 corresponds to shifting the origin of our coordinates to the left by  $a$  so that positions in these transformed coordinates are greater by  $a$  than in the untransformed coordinates.

![img-101.jpeg](img-101.jpeg)

![img-102.jpeg](img-102.jpeg)

![img-103.jpeg](img-103.jpeg)
Figure 6.5: Active vs. passive transformations: (a) depicts the original function, (b) illustrates an active transformation in which the function is shifted to the right by an amount  $a$ , and (c) illustrates a passive transformation where the axes are shifted to the left by an amount  $a$ . A point on the wave a distance  $b$  from the origin before the transformation is a distance  $a + b$  from the origin after the transformation in either (b) or (c); this is the equivalence of the two pictures.

In Problem 6.3 you will apply a translation to the momentum operator to show that  $\hat{p}^{\prime} = \hat{T}^{\dagger}\hat{p}\hat{T} = \hat{p}$ : the momentum operator is unchanged by this transformation. Physically, this is because the particle's momentum is independent of where you place the origin of your coordinates, depending only on differences in

position: $p = mdx/dt$. Once you know how the position and momentum operators behave under a translation, you know how any operator does, since

$$
\hat {Q} ^ {\prime} (\hat {x}, \hat {p}) = \hat {T} ^ {\dagger} \hat {Q} (\hat {x}, \hat {p}) \hat {T} = \hat {Q} (\hat {x} ^ {\prime}, \hat {p} ^ {\prime}) = \hat {Q} (\hat {x} + a, \hat {p}). \tag {6.8}
$$

Problem 6.4 will walk you through the proof.

**Problem 6.3** Show that the operator $\hat{p}^{\prime}$ obtained by applying a translation to the operator $\hat{p}$ is $\hat{p}^{\prime} = \hat{T}^{\dagger}\hat{p}\hat{T} = \hat{p}$

**Problem 6.4** Prove Equation 6.8. You may assume that $Q(\hat{x}, \hat{p})$ can be written in a power series

$$
\hat {Q} (\hat {x}, \hat {p}) = \sum_ {m = 0} ^ {\infty} \sum_ {n = 0} ^ {\infty} a _ {m n} \hat {x} ^ {m} \hat {p} ^ {n}
$$

for some constants $a_{mn}$.

301

6.2.2 Translational Symmetry

So far we have seen how a function behaves under a translation and how an operator behaves under a translation. I am now in a position to make precise the notion of a symmetry that I mentioned in the introduction. A system is translationally invariant (equivalent to saying it has translational symmetry) if the Hamiltonian is unchanged by the transformation:

$$
\hat {H} ^ {\prime} = \hat {T} ^ {\dagger} \hat {H} \hat {T} = \hat {H}.
$$

Because  $\hat{T}$  is unitary (Equation 6.4) we can multiply both sides of this equation by  $\hat{T}$  to get

$$
\hat {H} \hat {T} = \hat {T} \hat {H}.
$$

Therefore, a system has translational symmetry if the Hamiltonian commutes with the translation operator:

$$
\left[ \hat {H}, \hat {T} \right] = 0. \tag {6.9}
$$

For a particle of mass  $m$  moving in a one-dimensional potential, the Hamiltonian is

$$
\hat {H} = \frac {\hat {p} ^ {2}}{2 m} + V (x).
$$

According to Equation 6.8, the transformed Hamiltonian is

$$
\hat {H} ^ {\prime} = \frac {\hat {p} ^ {2}}{2 m} + V (x + a)
$$

so translational symmetry implies that

$$
V (x + a) = V (x). \tag {6.10}
$$

Now, there are two very different physical settings where Equation 6.10 might arise. The first is a constant potential, where Equation 6.10 holds for every value of  $a$ ; such a system is said to have continuous translational symmetry. The second is a periodic potential, such as an electron might encounter in a crystal, where Equation 6.10 holds only for a discrete set of  $as$ ; such a system is said to have discrete translational symmetry. The two cases are illustrated in Figure 6.6.

302

![img-104.jpeg](img-104.jpeg)

![img-105.jpeg](img-105.jpeg)
Figure 6.6: Potentials for a system with continuous (top) and discrete (bottom) translational symmetry. In the former case the potential is the same when shifted right or left by any amount; in the latter case the potential is the same when shifted right or left by an integer multiple of  $a$ .

Discrete Translational Symmetry and Bloch's Theorem

What are the implications of translational symmetry? For a system with a discrete translational symmetry, the most important consequence is Bloch's theorem; the theorem specifies the form taken by the stationary states. We used this theorem in Section 5.3.2; I will now prove it.

In Section A.5 it is shown that if two operators commute, then they have a complete set of simultaneous eigenstates. This means that if the Hamiltonian is translationally invariant (which is to say, if it commutes with the translation operator), then the eigenstates  $\psi(x)$  of the Hamiltonian can be chosen to be simultaneously eigenstates of  $\hat{\pmb{T}}$ :

$$
\hat {H} \psi (x) = E \psi (x), \quad \hat {T} (a) \psi (x) = \lambda \psi (x),
$$

where  $\lambda$  is the eigenvalue associated with  $\hat{T}$ . Since  $\hat{T}$  is unitary, its eigenvalues have magnitude 1 (see Problem A.30), which means that  $\lambda$  can be written as  $\lambda = e^{i\phi}$  for some real number  $\phi$ . By convention we write  $\phi = -qa$  where  $\hbar q$  is called the crystal momentum. Therefore, the stationary states of a particle of mass  $m$  moving in a periodic potential have the property

$$
\psi (x - a) = e ^ {- i q a} \psi (x). \tag {6.11}
$$

There is a more illuminating way to write Equation 6.11:2

$$
\psi (x) = e ^ {i q x} u (x) \tag {6.12}
$$

where  $u(x)$  is a periodic function of  $x$ :  $u(x + a) = u(x)$  and  $e^{iqx}$  is a traveling wave (recall that a traveling wave by itself describes a free particle—Section 2.4) with wavelength  $2\pi / q$ . Equation 6.12 is Bloch's theorem and it says that the stationary states of a particle in a periodic potential are periodic functions multiplying traveling waves. Note that just because the Hamiltonian is translationally invariant, that doesn't mean the stationary states themselves are translationally invariant, it simply means that they can be chosen to be eigenstates of the translation operator.

Bloch's theorem is truly remarkable. It tells us that the stationary states of a particle in a periodic potential (such as an electron in a crystal) are, apart from a periodic modulation, traveling waves. As such, they have a nonzero velocity. This means that an electron could travel through a perfect crystal without scattering! That has dramatic implications for electronic conduction in solids.

Continuous Translational Symmetry and Momentum Conservation

If a system has continuous translation symmetry then the Hamiltonian commutes with $\hat{T}(\vec{a})$ for any choice of $a$. In this case it is useful to consider an infinitesimal translation

$$
\hat{T}(\delta) = e^{-i\delta \hat{p}/\hbar} \approx 1 - i \frac{\delta}{\hbar} \hat{p},
$$

where $\delta$ is an infinitesimal length.⁹

If the Hamiltonian has continuous translational symmetry, then it must be unchanged under any translation, including an infinitesimal one; equivalently it commutes with the translation operator, and hence

$$
\left[ \hat{H}, \hat{T}(\delta) \right] = \left[ \hat{H}, 1 - i \frac{\delta}{\hbar} \hat{p} \right] = 0 \Rightarrow \left[ \hat{H}, \hat{p} \right] = 0.
$$

So if the Hamiltonian has continuous translational symmetry, it must commute with the momentum operator. And if the Hamiltonian commutes with momentum, then according to the "generalized Ehrenfest's theorem" (Equation 3.73)

$$
\frac{d}{dt} \langle p \rangle = \frac{i}{\hbar} \left\langle \left[ \hat{H}, \hat{p} \right] \right\rangle = 0. \tag{6.13}
$$

This is a statement of momentum conservation and we have now shown that continuous translational symmetry implies that momentum is conserved. This is our first example of a powerful general principle: symmetries imply conservation laws.¹⁰

Of course, if we're talking about a single particle of mass $m$ moving in a potential $V(x)$, the only potential that has continuous translational symmetry is the constant potential, which is equivalent to the free particle. And it is pretty obvious that momentum is conserved in that case. But the analysis here readily extends to a system of interacting particles (see Problem 6.7). The fact that momentum is conserved in that case as well (so long as the Hamiltonian is translationally invariant) is a highly nontrivial result. In any event, the point to remember is that conservation of momentum is a consequence of translational symmetry.

Problem 6.5 Show that Equation 6.12 follows from Equation 6.11. Hint: First write $\psi(x) = e^{iqx} u(x)$, which is certainly true for some $u(x)$, and then show that $u(x)$ is necessarily a periodic function of $x$.

Problem 6.6 Consider a particle of mass $m$ moving in a potential $V(x)$ with period $a$. We know from Bloch's theorem that the wave function can be written in the form of Equation 6.12. Note: It is conventional to label the states with quantum numbers $n$ and $q$ as $\psi_{nq}(x) = e^{-iqx} u_{nq}(x)$ where $E_{nq}$ is the $n$th energy for a given value of $q$.

(a) Show that $u$ satisfies the equation

$$
- \frac{\hbar^2}{2m} \frac{d^2 u_{nq}}{dx^2} - \frac{i \hbar^2 q}{m} \frac{d u_{nq}}{dx} + V(x) u_{nq} = \left(E_{nq} - \frac{\hbar^2 q^2}{2m}\right) u_{nq}.
$$

305

(b) Use the technique from Problem 2.61 to solve the differential equation for $u_{nq}$. You need to use a two-sided difference for the first derivative so that you have a Hermitian matrix to diagonalize: $\frac{d\psi}{dx} \approx \frac{\psi_{j+1} - \psi_{j-1}}{2\Delta x}$. For the potential in the interval 0 to $a$ let

$$
V (x) = \left\{ \begin{array}{l l} - V _ {0} &amp; a / 4 &lt; x &lt; 3 a / 4 \\ 0 &amp; \text{else} \end{array} \right.
$$

with $V_0 = 20\hbar^2 / 2ma^2$. (You will need to modify the technique slightly to account for the fact that the function $u_{nq}$ is periodic.) Find the lowest two energies for the following values of the crystal momentum: $qa = -\pi, -\pi/2, 0, \pi/2, \pi$. Note that $q$ and $q + 2\pi/a$ describe the same wave function (Equation 6.12), so there is no reason to consider values of $qa$ outside of the interval from $-\pi$ to $\pi$. In solid state physics, the values of $q$ inside this range constitute the first Brillouin zone.

(c) Make a plot of the energies $E_{1q}$ and $E_{2q}$ for values of $q$ between $-\pi/a$ and $\pi/a$. If you've automated the code that you used in part (b), you should be able to show a large number of $q$ values in this range. If not, simply plot the values that you computed in (b).

Problem 6.7 Consider two particles of mass $m_1$ and $m_2$ (in one dimension) that interact via a potential that depends only on the distance between the particles $V(|x_1 - x_2|)$, so that the Hamiltonian is

$$
\hat {H} = - \frac {\hbar^ {2}}{2 m _ {1}} \frac {\partial^ {2}}{\partial x _ {1} ^ {2}} - \frac {\hbar^ {2}}{2 m _ {2}} \frac {\partial^ {2}}{\partial x _ {2} ^ {2}} + V (| x _ {1} - x _ {2} |).
$$

Acting on a two-particle wave function the translation operator would be

$$
\hat {T} (a) \psi (x _ {1}, x _ {2}) = \psi (x _ {1} - a, x _ {2} - a).
$$

(a) Show that the translation operator can be written

$$
\hat {T} (a) = e ^ {- \frac {i g}{\hbar} \hat {P}},
$$

where $\hat{P} = \hat{p}_1 + \hat{p}_2$ is the total momentum.

(b) Show that the total momentum is conserved for this system.

307

# 6.3 Conservation Laws

In classical mechanics the meaning of a conservation law is straightforward: the quantity in question is the same before and after some event. Drop a rock, and potential energy is converted into kinetic energy, but the total is the same just before it hits the ground as when it was released; collide two billiard balls and momentum is transferred from one to the other, but the total remains unchanged. But in quantum mechanics a system does not in general have a definite energy (or momentum) before the process begins (or afterward). What does it mean, in that case, to say that the observable $Q$ is (or is not) conserved? Here are two possibilities:

- First definition: The expectation value $\langle Q\rangle$ is independent of time.
- Second definition: The probability of getting any particular value is independent of time.

Under what conditions does each of these conservation laws hold?

Let us stipulate that the observable in question does not depend explicitly on time: $\partial Q / \partial t = 0$. In that case the generalized Ehrenfest theorem (Equation 3.73) tells us that the expectation value of $Q$ is independent of time if The operator $\hat{Q}$ commutes with the Hamiltonian. It so happens that the same criterion guarantees conservation by the second definition.

I will now prove this result. Recall that the probability of getting the result $q_{n}$ in a measurement of $Q$ at time $t$ is (Equation 3.43)

$$
P \left(q _ {n}\right) = \left| \left\langle f _ {n} \mid \Psi (t) \right\rangle \right| ^ {2}, \tag {6.15}
$$

where $f_{n}$ is the corresponding eigenvector: $\hat{Q} |f_n\rangle = q_n|f_n\rangle$. We know that the time evolution of the wave function is (Equation 2.17)

$$
| \Psi (t) \rangle = \sum_ {m} e ^ {- i E _ {m} t / \hbar} c _ {m} | \psi_ {m} \rangle ,
$$

where the $|\psi_n\rangle$ are the eigenstates of $\hat{\pmb{f}}_n$, and therefore

$$
P \left(q _ {n}\right) = \left| \sum_ {m} e ^ {- i E _ {m} t / \hbar} c _ {m} \left\langle f _ {n} \right| \psi_ {m} \right\rangle \Bigg | ^ {2}.
$$

Now the key point: since $\hat{Q}$ and $\hat{f}_n$ commute we can find a complete set of simultaneous eigenstates for them (see Section A.5); without loss of generality then $|f_n\rangle = |\psi_n\rangle$. Using the orthonormality of the $|\psi_n\rangle$,

$$
P \left(q _ {n}\right) = \left| \sum_ {m} e ^ {- i E _ {m} t / \hbar} c _ {m} \left\langle \psi_ {n} \right| \psi_ {m} \right\rangle \Bigg | ^ {2} = | c _ {n} | ^ {2},
$$

which is clearly independent of time.

308
## 6.4 Parity

309

# 6.4.1 Parity in One Dimension

A spatial inversion is implemented by the parity operator $\hat{\Pi}$ in one dimension,

$$
\hat{\Pi} \psi(x) = \psi'(x) = \psi(-x).
$$

Evidently, the parity operator is its own inverse: $\hat{\Pi}^{-1} = \hat{\Pi}$ in Problem 6.8 you will show that it is Hermitian: $\hat{\Pi}^{\dagger} = \hat{\Pi}$. Putting this together, the parity operator is unitary as well:

$$
\hat{\Pi}^{-1} = \hat{\Pi} = \hat{\Pi}^{\dagger}. \tag{6.16}
$$

Operators transform under a spatial inversion as

$$
\hat{Q}' = \hat{\Pi}^{\dagger} \hat{Q} \hat{\Pi}. \tag{6.17}
$$

I won't repeat the argument leading up to Equation 6.17, since it is identical to the one by which we arrived at Equation 6.6 in the case of translations. The position and momentum operators are "odd under parity" (Problem 6.10):

$$
\hat{x}' = \hat{\Pi}^{\dagger} \hat{x} \hat{\Pi} = -\hat{x}, \tag{6.18}
$$

$$
\hat{p}' = \hat{\Pi}^{\dagger} \hat{p} \hat{\Pi} = -\hat{p}, \tag{6.19}
$$

and this tells us how any operator transforms (see Problem 6.4):

$$
\hat{Q}'(\hat{x}, \hat{p}) = \hat{\Pi}^{\dagger} \hat{Q}(\hat{x}, \hat{p}) \hat{\Pi} = \hat{Q}(-\hat{x}, -\hat{p}).
$$

A system has inversion symmetry if the Hamiltonian is unchanged by a parity transformation:

$$
\hat{H}' = \hat{\Pi}^{\dagger} \hat{H} \hat{\Pi} = \hat{H},
$$

or, using the unitarity of the parity operator,

$$
\left[ \hat{H}, \hat{\Pi} \right] = 0. \tag{6.20}
$$

If our Hamiltonian describes a particle of mass $m$ in a one-dimensional potential $V(x)$, then inversion symmetry simply means that the potential is an even function of position:

$$
V(x) = V(-x).
$$

The implications of inversion symmetry are two: First, we can find a complete set of simultaneous eigenstates of $\hat{\Pi}$ and $\hat{H}$. Let such an eigenstate be written $\psi_n$: it satisfies

$$
\hat{\Pi} \psi_n(x) = \psi_n(-x) = \pm \psi_n(x),
$$

since the eigenvalues of the parity operator are restricted to $\pm 1$ (Problem 6.8). So the stationary states of a potential that is an even function of position are themselves even or odd functions (or can be chosen as such, in the case of degeneracy).[12] This property is familiar from the simple harmonic oscillator, the infinite square well (if the origin is placed at the center of the well), and the Dirac delta function potential, and you proved it in general in Problem 2.1.

Second, according to Ehrenfest's theorem, if the Hamiltonian has an inversion symmetry then

$$
\frac {d}{d t} \langle \Pi \rangle = \frac {i}{\hbar} \left\langle \left[ \hat {H}, \hat {\Pi} \right] \right\rangle = 0
$$

so parity is conserved for a particle moving in a symmetric potential. And not just the expectation value, but the probability of any particular outcome in a measurement, in accord with the theorem of Section 6.3. Parity conservation means, for example, that if the wave function of a particle in a harmonic oscillator potential is even at  $t = 0$  then it will be even at any later time  $t$ ; see Figure 6.7.

![img-106.jpeg](img-106.jpeg)
Figure 6.7: This filmstrip shows the time evolution of a particular wave function  $\left(\Psi_0(\xi) = A\xi^2 e^{-\xi^2 /2}\right)$  for a particle in the harmonic oscillator potential. The solid and dashed curves are the real and imaginary parts of the wave function respectively, and time increases from top to bottom. Since parity is conserved, a wave function which is initially an even function of position (as this one is) remains an even function at all later times.

311

* Problem 6.8

(a) Show that the parity operator  $\hat{\Pi}$  is Hermitian.
(b) Show that the eigenvalues of the parity operator are  $\pm 1$ .

6.4.2 Parity in Three Dimensions

The spatial inversion generated by the parity operator in three dimensions is

$$
\hat {\Pi} \psi (\mathbf {r}) = \psi^ {\prime} (\mathbf {r}) = \psi (- \mathbf {r}).
$$

The operators  $\hat{\mathbf{r}}$  and  $\hat{\mathbf{p}}$  transform as

$$
\hat {\mathbf {r}} ^ {\prime} = \hat {\Pi} ^ {\dagger} \hat {\mathbf {r}} \hat {\Pi} = - \hat {\mathbf {r}}, \tag {6.21}
$$

$$
\hat {\mathbf {p}} ^ {\prime} = \hat {\Pi} ^ {\dagger} \hat {\mathbf {p}} \hat {\Pi} = - \hat {\mathbf {p}}. \tag {6.22}
$$

Any other operator transforms as

$$
\hat {Q} ^ {\prime} (\hat {\mathbf {r}}, \hat {\mathbf {p}}) = \hat {\Pi} ^ {\dagger} \hat {Q} (\hat {\mathbf {r}}, \hat {\mathbf {p}}) \hat {\Pi} = \hat {Q} (- \hat {\mathbf {r}}, - \hat {\mathbf {p}}). \tag {6.23}
$$

## Example 6.2

Find the parity-transformed angular momentum operator  $\hat{\mathbf{L}}' = \hat{\Pi}^{\dagger}\hat{\mathbf{L}}\hat{\Pi}$  in terms of  $\hat{\mathbf{L}}$ .

Solution: Since  $\mathbf{L} = \mathbf{r} \times \mathbf{p}$ , Equation 6.23 tells us that

$$
\hat {\mathbf {L}} ^ {\prime} = \hat {\Pi} ^ {\dagger} \hat {\mathbf {L}} \hat {\Pi} = \hat {\mathbf {r}} ^ {\prime} \times \hat {\mathbf {p}} ^ {\prime} = (- \hat {\mathbf {r}}) \times (- \hat {\mathbf {p}}) = \hat {\mathbf {r}} \times \hat {\mathbf {p}} = \hat {\mathbf {L}}. \tag {6.24}
$$

We have a special name for vectors like  $\hat{\mathbf{L}}$ , that are even under parity. We call them pseudovectors, since they don't change sign under parity the way "true" vectors, such as  $\hat{\mathbf{r}}$  or  $\hat{\mathbf{p}}$ , do. Similarly, scalars that are odd under parity are called pseudoscalars, since they do not behave under parity the way that "true" scalars (such as  $\hat{\mathbf{r}} \cdot \hat{\mathbf{r}}$  which is even under parity) do. See Problem 6.9. Note: The labels scalar and vector describe how the operators behave under rotations; we will define these terms carefully in the next section. "True" vectors and pseudovectors behave the same way under a rotation—they are both vectors.

In three dimensions, the Hamiltonian for a particle of mass  $m$  moving in a potential  $V(\mathbf{r})$  will have inversion symmetry if  $V(-\mathbf{r}) = V(\mathbf{r})$ . Importantly, any central potential satisfies this condition. As in the one-dimensional case, parity is conserved for such systems, and the eigenstates of the Hamiltonian may be chosen to be simultaneously eigenstates of parity. In Problem 6.1 you proved that the eigenstates of a particle in a central potential, written  $\psi_{n\ell m}(r,\theta ,\phi) = R_{n\ell}(r)Y_{\ell}^{m}(\theta ,\phi)$ , are eigenstates of parity:

$$
\hat {\Pi} \psi_ {n \ell m} (r, \theta , \phi) = (- 1) ^ {\ell} \psi_ {n \ell m} (r, \theta , \phi).
$$

## Problem 6.9

(a) Under parity, a "true" scalar operator does not change:

$$
\hat {\Pi} ^ {\dagger} \hat {f} \hat {\Pi} = \hat {f},
$$

whereas a pseudoscalar changes sign. Show therefore that  $\left[\hat{\Pi},\hat{f}\right] = 0$  for a "true" scalar, whereas  $\left\{\hat{\Pi},\hat{f}\right\} = 0$  for a pseudoscalar. Note: the

312

anti-commutator of two operators  $\hat{A}$  and  $\hat{B}$  is defined as  $\{\hat{A},\hat{B}\} \equiv \hat{A}\hat{B} +\hat{B}\hat{A}$ .

(b) Similarly, a "true" vector changes sign

$$
\hat {\Pi} ^ {\dagger} \hat {\mathbf {V}} \hat {\Pi} = - \hat {\mathbf {V}},
$$

whereas a pseudovector is unchanged. Show therefore that  $\{\hat{\Pi},\hat{\mathbf{V}}\} = \mathbf{0}$  for a "true" vector and  $[\hat{\Pi},\hat{\mathbf{V}}] = \mathbf{0}$  for a pseudovector.

314

## 6.4.3 Parity Selection Rules

Selection rules tell you when a matrix element is zero based on the symmetry of the situation. Recall that a matrix element is any object of the form $\langle b|\hat{Q} |a\rangle$, an expectation value is a special case of a matrix element with $a = b = \psi$. One operator whose selection rules are physically important is the electric dipole moment operator

$$
\hat {\mathbf {p}} _ {e} = q \hat {\mathbf {r}}.
$$

The selection rules for this operator—the operator itself is nothing more than the charge of the particle times its position—determine which atomic transitions are allowed and which are forbidden (see Chapter 11). It is odd under parity since the position vector $\hat{\mathbf{r}}$ is odd:

$$
\hat {\Pi} ^ {\dagger} \hat {\mathbf {p}} _ {e} \hat {\Pi} = - \hat {\mathbf {p}} _ {e}. \tag {6.25}
$$

Now consider the matrix elements of the electric dipole operator between two states $\psi_{n\ell m}$ and $\psi_{n'\ell'm'}$ (we label the corresponding kets $|n\ell m\rangle$ and $|n'\ell'm'\rangle$). Using Equation 6.25 we have

$$
\begin{array}{l}
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| \hat {\mathbf {p}} _ {e} | n \ell m \rangle = - \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| \hat {\Pi} ^ {\dagger} \hat {\mathbf {p}} _ {e} \hat {\Pi} | n \ell m \rangle \\
= - \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| (- 1) ^ {\ell^ {\prime}} \hat {\mathbf {p}} _ {e} (- 1) ^ {\ell} | n \ell m \rangle \\
= (- 1) ^ {\ell + \ell^ {\prime} + 1} \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| \hat {\mathbf {p}} _ {e} | n \ell m \rangle .
\end{array}
$$

From this we see immediately that

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| \hat {\mathbf {p}} _ {e} | n \ell m \rangle = \mathbf {0} \text{ if } \ell + \ell^ {\prime} \text{ is even}. \tag {6.26}
$$

This is called Laporte's rule; it says that matrix elements of the dipole moment operator vanish between states with the same parity. The reasoning by which we obtained Equation 6.26 can be generalized to derive selection rules for any operator, as long as you know how that operator transforms under parity. In particular, Laporte's rule applies to any operator that is odd under parity. The selection rule for an operator that is even under parity, such as $\hat{\mathbf{L}}$ is derived in Problem 6.11.

**Problem 6.10** Show that the position and momentum operators are odd under parity. That is, prove Equations 6.18, 6.19, and, by extension, 6.21 and 6.22.

*

**Problem 6.11** Consider the matrix elements of $\hat{\mathbf{L}}$ between two definite-parity states: $\langle n^{\prime}\ell^{\prime}m^{\prime}|\hat{\mathbf{L}} |n\ell m\rangle$. Under what conditions is this matrix element guaranteed to vanish? Note that the same selection rule would apply to any pseudovector operator, or any "true" scalar operator.

**Problem 6.12** Spin angular momentum, $\hat{\mathbf{S}}$ is even under parity, just like orbital angular momentum $\hat{\mathbf{L}}$:

$$
\hat {\Pi} ^ {\dagger} \hat {\mathbf {S}} \hat {\Pi} = \hat {\mathbf {S}} \quad \text {or} \quad \left[ \hat {\Pi}, \hat {\mathbf {S}} \right] = 0. \tag {6.27}
$$

Acting on a spinor written in the standard basis (Equation 4.139), the parity operator becomes a  $2 \times 2$  matrix. Show that, due to Equation 6.27, this matrix must be a constant times the identity matrix. As such, the parity of a spinor isn't very interesting since both spin states are parity eigenstates with the same eigenvalue. We can arbitrarily choose that parity to be  $+1$ , so the parity operator has no effect on the spin portion of the wave function.[13]

Problem 6.13 Consider an electron in a hydrogen atom.

(a) Show that if the electron is in the ground state, then necessarily  $\langle \mathbf{p}_e\rangle = 0$  No calculation allowed.
(b) Show that if the electron is in an  $n = 2$  state, then  $\langle \mathbf{p}_e \rangle$  need not vanish. Give an example of a wave function for the energy level  $n = 2$  that has a non-vanishing  $\langle \mathbf{p}_e \rangle$  and compute  $\langle \mathbf{p}_e \rangle$  for this state.

316
## 6.5 Rotational Symmetry

317

# 6.5.1 Rotations About the $z$ Axis

The operator that rotates a function about the $z$ axis by an angle $\varphi$ (Equation 6.2)

$$
\hat{R}_z(\varphi) \psi(r, \theta, \phi) = \psi'(r, \theta, \phi) = \psi(r, \theta, \phi - \varphi) \tag{6.28}
$$

is closely related to the $z$ component of angular momentum (Equation 4.129). By the same reasoning that led to Equation 6.3,

$$
\hat{R}_z(\varphi) = \exp \left[ - \frac{i \varphi}{\hbar} \hat{L}_z \right], \tag{6.29}
$$

and we say that $\hat{L}_z$ is the generator of rotations about the $z$ axis (compare Equation 6.3).

How do the operators $\hat{\mathbf{r}}$ and $\hat{\mathbf{p}}$ transform under rotations? To answer this question we use the infinitesimal form of the operator:

$$
\hat{R}_z(\delta) \approx 1 - \frac{i \delta}{\hbar} \hat{L}_z.
$$

Then the operator $\hat{x}$ transforms as

$$
\begin{array}{l}
\hat{x}' = \hat{R}^\dagger \hat{x} \hat{R} \approx \left(1 + \frac{i \delta}{\hbar} \hat{L}_z\right) \hat{x} \left(1 - \frac{i \delta}{\hbar} \hat{L}_z\right) \\
\approx \hat{x} + \frac{i \delta}{\hbar} \left[ \hat{L}_z, \hat{x} \right] \approx \hat{x} - \delta \hat{y}
\end{array}
$$

(I used Equation 4.122 for the commutator). Similar calculations show that $\hat{y}' = \hat{y} + \delta \hat{x}$ and $\hat{z}' = \hat{z}$. We can combine these results into a matrix equation

$$
\begin{pmatrix}
\hat{x}' \\
\hat{y}' \\
\hat{z}'
\end{pmatrix} =
\begin{pmatrix}
1 &amp; -\delta &amp; 0 \\
\delta &amp; 1 &amp; 0 \\
0 &amp; 0 &amp; 1
\end{pmatrix}
\begin{pmatrix}
\hat{x} \\
\hat{y} \\
\hat{z}
\end{pmatrix}. \tag{6.30}
$$

That doesn't look quite right for a rotation. Shouldn't it be

$$
\begin{pmatrix}
\hat{x}' \\
\hat{y}' \\
\hat{z}'
\end{pmatrix} =
\begin{pmatrix}
\cos \varphi &amp; -\sin \varphi &amp; 0 \\
\sin \varphi &amp; \cos \varphi &amp; 0 \\
0 &amp; 0 &amp; 1
\end{pmatrix}
\begin{pmatrix}
\hat{x} \\
\hat{y} \\
\hat{z}
\end{pmatrix}? \tag{6.31}
$$

Yes, but don't forget, we are assuming $\varphi \rightarrow \delta$ is infinitesimal, so (dropping terms of order $\xi^2$ and higher) $\cos \varphi \rightarrow 1$ and $\sin \varphi \rightarrow \delta$. [15]

**Problem 6.14** In this problem you will establish the correspondence between Equations 6.30 and 6.31.

(a) Diagonalize the matrix [16]

$$
\mathbf{M} = \begin{pmatrix}
1 &amp; -\varphi/N \\
\varphi/N &amp; 1
\end{pmatrix}
$$

to obtain the matrix

$$
\mathbf {M} ^ {\prime} = \mathbf {S M S} ^ {- 1},
$$

where  $\mathbf{S}^{-1}$  is the unitary matrix whose columns are the (normalized) eigenvectors of  $\mathbf{M}$ .

(b) Use the binomial expansion to show that  $\lim_{N\to \infty}\left(\mathbf{M}^{\prime}\right)^{N}$  is a diagonal matrix with entries  $e^{-i\varphi}$  and  $e^{i\varphi}$  on the diagonal.
(c) Transform back to the original basis to show that

$$
\lim  _ {N \rightarrow \infty} \mathbf {M} ^ {N} = \mathbf {S} ^ {- 1} \left[ \lim  _ {N \rightarrow \infty} \left(\mathbf {M} ^ {\prime}\right) ^ {N} \right] \mathbf {S}
$$

agrees with the matrix in Equation 6.31.

# 6.5.2 Rotations in Three Dimensions

Equation 6.29 can be generalized in the obvious way to a rotation about an axis along the unit vector  $\mathbf{n}$ :

(6.32)

Just as linear momentum is the generator of translations, angular momentum is the generator of rotations.

Any operator (with three components) that transforms the same way as the position operator under rotations is called a vector operator. By "transforms the same way" we mean that  $\hat{\mathbf{V}}' = \mathbf{D}\hat{\mathbf{V}}$  where  $\mathbf{D}$  is the same matrix as appears in  $\hat{\mathbf{r}}' = \mathbf{D}\hat{\mathbf{r}}$ . In particular for a rotation about the  $z$  axis, we would have (Equation 6.31)

$$
\left( \begin{array}{l} \hat {V} _ {x} ^ {\prime} \\ \hat {V} _ {y} ^ {\prime} \\ \hat {V} _ {z} ^ {\prime} \end{array} \right) = \left( \begin{array}{c c c} \cos \varphi &amp; - \sin \varphi &amp; 0 \\ \sin \varphi &amp; \cos \varphi &amp; 0 \\ 0 &amp; 0 &amp; 1 \end{array} \right) \left( \begin{array}{l} \hat {V} _ {x} \\ \hat {V} _ {y} \\ \hat {V} _ {z} \end{array} \right).
$$

This transformation rule follows from the commutation relations $^{17}$

$$
\boxed {\left[ \hat {L} _ {i}, \hat {V} _ {j} \right] = i \hbar \epsilon_ {i j k} \hat {V} _ {k},} \tag {6.33}
$$

(see Problem 6.16), and we may take Equation 6.33 as the definition of a vector operator. So far we have encountered three such operators,  $\hat{\mathbf{r}}$ ,  $\hat{\mathbf{p}}$  and  $\hat{\mathbf{l}}$ :

$$
\left[ \hat {L} _ {i}, \hat {r} _ {j} \right] = i \hbar \epsilon_ {i j k} \hat {r} _ {k}, \quad \left[ \hat {L} _ {i}, \hat {p} _ {j} \right] = i \hbar \epsilon_ {i j k} \hat {p} _ {k}, \quad \left[ \hat {L} _ {i}, \hat {L} _ {j} \right] = i \hbar \epsilon_ {i j k} \hat {L} _ {k}
$$

(see Equations 4.99 and 4.122).

A scalar operator is a single quantity that is unchanged by rotations; this is equivalent to saying that the operator commutes with  $\hat{\mathbf{l}}$ :

$$
\boxed {\left[ \hat {L} _ {i}, \hat {f} \right] = 0.} \tag {6.34}
$$

We can now classify operators as either scalars or vectors, based on their commutation relations with  $\hat{\mathbf{l}}$  (how they transform under a rotation), and as "true" or pseudo-quantities, based on their commutators with  $\hat{\mathbf{f}}_1^1$  (how they transform under parity). These results are summarized in Table 6.1. $^{18}$

Table 6.1: Operators are classified as vectors or scalars based on their commutation relations with  $\hat{\mathbf{l}}_i$  which encode how they transform under a rotation, and as pseudo- or "true" quantities based on their commutation relations with  $\hat{\mathbf{f}}_1^1$ , which encode how they transform under a spatial inversion. The curly brackets in the first column denote the anticommutator, defined in Problem 6.9. To include the spin  $\hat{\mathbf{S}}$  in this table, one simply replaces  $\hat{L}_i$  everywhere it appears in the third column with  $\hat{J}_i = \hat{L}_i + \hat{S}_i$  (Problems 6.12 and 6.32, respectively, discuss the effect of parity and rotations on spinors).  $\hat{\mathbf{S}}_i$  like  $\hat{\mathbf{l}}_i$  is then a pseudovector and  $\hat{\mathbf{p}} \cdot \hat{\mathbf{S}}$  is a pseudoscalar.

|   | parity | rotations | examples  |
| --- | --- | --- | --- |
|  true vectorˆV | {ˆΠ,ˆVj} = 0 | [ˆLi,ˆVj] = i hˆεijkˆVk | ˆr,ˆp  |
|  pseudovectorˆV | [ˆΠ,ˆVj] = 0 | [ˆLi,ˆVj] = i hˆεijkˆVk | ˆL  |
|  true scalarˆf | [ˆΠ,ˆf] = 0 | [ˆLi,ˆf] = 0 | ˆr·ˆr  |
|  pseudoscalarˆf | {ˆΠ,ˆf} = 0 | [ˆLi,ˆf] = 0 |   |

continuous rotational symmetry

For a particle of mass $m$ moving in a potential $V(\mathbf{r})$, the Hamiltonian

$\hat{H}=\frac{\hat{p}^{2}}{2m}+V(\mathbf{r})$

is rotationally invariant if $V(\mathbf{r})=V(\mathbf{r})$ (the central potentials studied in Section 4.1.1). In this case the Hamiltonian commutes with a rotation by any angle about an arbitrary axis

$\left[\hat{H},\ \hat{R}_{\mathbf{n}}\ (\varphi)\right]=0,$ (6.35)

In particular, Equation 6.35 must hold for an infinitesimal rotation

$R_{\mathbf{n}}\ (\delta)\approx 1-i\frac{\delta}{\hbar}\mathbf{n}\cdot\hat{\mathbf{L}},$

which means that the Hamiltonian commutes with the three components of $\mathbf{L}$:

$\left[\hat{H},\hat{\mathbf{L}}\right]=\mathbf{0},$ (6.36)

What, then, are the consequences of rotational invariance?

From Equation 6.36 and Ehrenfest’s theorem

$\frac{d}{dt}\ \langle\mathbf{L}\rangle=\frac{i}{\hbar}\left\langle\left[\hat{H},\hat{\mathbf{L}}\right]\right\rangle=\mathbf{0}$ (6.37)

for a central potential. Thus, angular momentum conservation is a consequence of rotational invariance. And beyond the statement 6.37, angular momentum conservation means that the probability distributions (for each component of the angular momentum) are independent of time as well—see Section 6.3.

Since the Hamiltonian for a central potential commutes with all three components of angular momentum, it also commutes with $\hat{\mathbf{L}}^{2}$. The operators $\hat{\mathbf{H}}$, $\hat{\mathbf{L}}_{z}$, and $\hat{\mathbf{L}}^{2}$ form a complete set of compatible observables for the bound states of a central potential. Compatible means that they commute pairwise

$\left[\hat{H},\hat{L}^{2}\right]=0,$ (6.38)
$\left[\hat{H},\hat{L}_{z}\right]=0,$
$\left[\hat{L}_{z},\hat{L}^{2}\right]=0,$

so that the eigenstates of $\hat{\mathbf{H}}$ can be chosen to be simultaneous eigenstates of $\hat{\mathbf{L}}^{2}$ and $\hat{\mathbf{L}}_{z}$.

$\hat{H}\psi_{n\ell m}$ $=E_{n}\psi_{n\ell m},$
$\hat{L}_{z}\psi_{n\ell m}$ $=m\hbar\psi_{n\ell m},$
$\hat{L}^{2}\psi_{n\ell m}$ $=\ell\ (\ell+1)\ \hbar^{2}\psi_{n\ell m}.$

Saying they are complete means that the quantum numbers $n$, $\ell$, and $m$ uniquely specify a bound state of the Hamiltonian. This is familiar from our solution to the hydrogen atom, the infinite spherical well, and the three-dimensional harmonic oscillator, but it is true for any central potential.

Problem 6.15 Show how Equation 6.34 guarantees that a scalar is unchanged by a rotation:  $\hat{f}^{\prime} = \hat{R}^{\dagger}\hat{f}\hat{R} = \hat{f}$

Problem 6.16 Working from Equation 6.33, find how the vector operator  $\hat{\mathbf{V}}$  transforms for an infinitesimal rotation by an angle  $\delta$  about the  $y$  axis. That is, find the matrix  $\mathsf{D}$  in

$$
\hat {\mathbf {V}} ^ {\prime} = \mathsf {D} \hat {\mathbf {V}}.
$$

Problem 6.17 Consider the action of an infinitesimal rotation about the  $\mathbf{n}$  axis of an angular momentum eigenstate  $\psi_{n\ell m}$ . Show that

$$
\hat {R} _ {\mathbf {n}} (\delta) \psi_ {n \ell m} = \sum_ {m ^ {\prime}} D _ {m ^ {\prime} m} \psi_ {n \ell m ^ {\prime}},
$$

and find the complex numbers  $D_{m'm}$  (they will depend on  $\delta, n,$  and  $\varepsilon$  as well as  $m$  and  $m'$ ). This result makes sense: a rotation doesn't change the magnitude of the angular momentum (specified by  $\ell$ ) but does change its projection along the  $z$  axis (specified by  $m$ ).

323

# 6.6 Degeneracy

Symmetry is the source of most$^{20}$ degeneracy in quantum mechanics. We have seen that a symmetry implies the existence of an operator $\hat{\underline{Q}}$ that commutes with the Hamiltonian

$$
\left[ \hat {H}, \hat {Q} \right] = 0. \tag {6.39}
$$

So why does symmetry lead to degeneracy in the energy spectrum? The basic idea is this: if we have a stationary state $|\psi_n\rangle$, then $|\psi_n^{\prime}\rangle = \hat{Q} |\psi_n\rangle$ is a stationary state with the same energy. The proof is straightforward:

$$
\hat {H} \left| \psi_ {n} ^ {\prime} \right\rangle = \hat {H} \left(\hat {Q} \left| \psi_ {n} \right\rangle\right) = \hat {Q} \hat {H} \left| \psi_ {n} \right\rangle = \hat {Q} E _ {n} \left| \psi_ {n} \right\rangle = E _ {n} \left(\hat {Q} \left| \psi_ {n} \right\rangle\right) = E _ {n} \left| \psi_ {n} ^ {\prime} \right\rangle .
$$

For example, if you have an eigenstate of a spherically-symmetric Hamiltonian and you rotate that state about some axis, you must get back another state of the same energy.

You might think that symmetry would always lead to degeneracy, and that continuous symmetries would lead to infinite degeneracy, but that is not the case. The reason is that the two states $|\psi_n\rangle$ and $|\psi_n^{\prime}\rangle$ might be the same.$^{21}$ As an example, consider the Hamiltonian for the harmonic oscillator in one dimension; it commutes with parity. All of its stationary states are either even or odd, so when you act on one with the parity operator you get back the same state you started with (perhaps multiplied by $-1$, but that, physically, is the same state). There is therefore no degeneracy associated with inversion symmetry in this case.

In fact, if there is only a single symmetry operator $\hat{\underline{Q}}$ (or if there are multiple symmetry operators that all commute), you do not get degeneracy in the spectrum. The reason is the same theorem we've now quoted many times: since $\hat{\underline{Q}}$ and $\hat{\underline{H}}$ commute, we can find simultaneous eigenstates $|\psi_n\rangle$ of $\hat{\underline{Q}}$ and $\hat{\underline{H}}$ and these states transform into themselves under the symmetry operation: $\hat{\underline{Q}} |\psi_n\rangle = q_n|\psi_n\rangle$.

But what if there are two operators that commute with the Hamiltonian (call them $\hat{\underline{Q}}$ and $\hat{\Lambda}$), but do not commute with each other? In this case, degeneracy in the energy spectrum is inevitable. Why?

First, consider a state $|\psi\rangle$ that is an eigenstate of both $\hat{H}$ and $\hat{Q}$ with eigenvalues $E_n$ and $q_m$ respectively. Since $\hat{H}$ and $\hat{\Lambda}$ commute we know that the state $|g\rangle = \hat{\Lambda} |\psi\rangle$ is also an eigenstate of $\hat{H}$ with eigenvalue $E_n$. Since $\hat{Q}$ and $\hat{\Lambda}$ do not commute we know (Section A.5) that there cannot exist a complete set of simultaneous eigenstates of all three operators $(\hat{Q}, \hat{\Lambda}$ and $\hat{H})$. Therefore, there must be some $|\psi\rangle$ such that $\hat{\Lambda} |\psi\rangle$ is distinct from $|\psi\rangle$ (specifically, it is not an eigenstate of $\hat{\Lambda}$) meaning that the energy level $E_n$ is at least doubly degenerate. The presence of multiple non-commuting symmetry operators guarantees degeneracy of the energy spectrum.

This is precisely the situation we have encountered in the case of central potentials. Here the Hamiltonian commutes with rotations about any axis (or equivalently with the generators $\hat{L}_x, \hat{L}_y,$ and $\hat{L}_z$) but those rotations don't commute with each other. So we know that there will be degeneracy in the spectrum of a particle in a central potential. The following example shows exactly how much degeneracy is explained by rotational invariance.

## Example 6.3

Consider an eigenstate of a central potential $\psi_{n\ell m}$ with energy $E_n$. Use the fact that the Hamiltonian

for a central potential commutes with any component of  $\hat{\mathbf{L}}$ , and therefore also with  $\hat{L}_{+}$  and  $\hat{L}_{-}$ , to show that  $\psi_{n\ell m\pm 1}$  are necessarily also eigenstates with the same energy as  $\psi_{n\ell m}$ .22

Solution: Since the Hamiltonian commutes with  $\hat{L}_{\pm}$  we have

$$
\left(\hat {H} \hat {L} _ {\pm} - \hat {L} _ {\pm} \hat {H}\right) \psi_ {n \ell m} = 0,
$$

so

$$
\hat {H} \hat {L} _ {\pm} \psi_ {n \ell m} = \hat {L} _ {\pm} \hat {H} \psi_ {n \ell m} = E _ {n} \hat {L} _ {\pm} \psi_ {n \ell m}
$$

or

$$
\hat {H} \psi_ {n \ell m \pm 1} = E _ {n} \psi_ {n \ell m \pm 1}
$$

(I canceled the constant  $\hbar \sqrt{\ell(\ell + 1) - m(m\pm 1)}$  from both sides in the last expression). This argument could obviously be repeated to show that  $\psi_{n\ell m\pm 2}$  has the same energy as  $\psi_{n\ell m\pm 1}$ , and so on until you've exhausted the ladder of states. Therefore, rotational invariance explains why states which differ only in the quantum number  $m$  have the same energy, and since there are  $2\ell +1$  different values of  $m,2\ell +1$  is the "normal" degeneracy for energies in a central potential.

Of course, the degeneracy of hydrogen (neglecting spin) is  $n^2 (= 1, 4, 9, \ldots)$  (Equation 4.85) which is greater than  $2\ell + 1 (= 1, 3, 5, \ldots)$ . Evidently hydrogen has more degeneracy than is explained by rotational invariance alone. The source of the extra degeneracy is an additional symmetry that is unique to the  $1/r$  potential; this is explored in Problem 6.34.

In this section we have focused on continuous rotational symmetry, but discrete rotational symmetry, as experienced (for instance) by an electron in a crystal, can also be of interest. Problem 6.33 explores one such system.

Problem 6.18 Consider the free particle in one dimension:  $\hat{H} = \hat{p}^2 / 2m$ . This Hamiltonian has both translational symmetry and inversion symmetry.

(a) Show that translations and inversion don't commute.
(b) Because of the translational symmetry we know that the eigenstates of  $\hat{H}$  can be chosen to be simultaneous eigenstates of momentum, namely  $f_{p}(x)$  (Equation 3.32). Show that the parity operator turns  $f_{p}(x)$  into  $f_{-p}(x)$ ; these two states must therefore have the same energy.
(c) Alternatively, because of the inversion symmetry we know that the eigenstates of  $\hat{H}$  can be chosen to be simultaneous eigenstates of parity, namely

$$
\frac {1}{\sqrt {\pi \hbar}} \cos \left(\frac {p x}{\hbar}\right) \text { and } \frac {1}{\sqrt {\pi \hbar}} \sin \left(\frac {p x}{\hbar}\right).
$$

Show that the translation operator mixes these two states together; they therefore must be degenerate.

Note: Both parity and translational invariance are required to explain the degeneracy in the free-particle spectrum. Without parity, there is no reason for  $f_{p}(x)$  and  $f_{-p}(x)$  to have the same energy (I mean no reason based on symmetries discussed thus far ...obviously you can plug them in to the time-independent Schrödinger equation and show it's true).

Problem 6.19 For any vector operator  $\hat{\mathbf{V}}$  one can define raising and lowering operators as

$\hat{V}_{\pm} = \hat{V}_x \pm i \hat{V}_y.$

(a) Using Equation 6.33, show that

$\left[\hat{L}_z,\hat{V}_{\pm}\right] = \pm \hbar \hat{V}_{+}$

$\left[\hat{L}^2,\hat{V}_{\pm}\right] = 2\hbar^2\hat{V}_{\pm}\pm 2\hbar \hat{V}_{\pm}\hat{L}_z\mp 2\hbar \hat{V}_z\hat{L}_{\pm}.$

(b) Show that, if  $\psi$  is an eigenstate of  $\hat{L}^2$  and  $\hat{L}_z$  with eigenvalues  $\ell (\ell +1)\hbar^{2}$  and  $\ell \hbar$  respectively, then either  $\hat{V}_{+}\psi$  is zero or  $\hat{V}_{+}\psi$  is also an eigenstate of  $\hat{L}^2$  and  $\hat{L}_z$  with eigenvalues  $(\ell +1)(\ell +2)\hbar^{2}$  and  $(\ell +1)\hbar$  respectively. This means that, acting on a state with maximal  $m_{\ell} = \ell$ , the operator  $\hat{V}_{+}$  either "raises" both the  $\ell$  and  $m$  values by 1 or destroys the state.

6.7 Rotational Selection Rules

The most general statement of the rotational selection rules is the Wigner–Eckart Theorem; as a practical matter, it is arguably the most important theorem in all of quantum mechanics. Rather than prove the theorem in full generality I will work out the selection rules for the two classes of operators one encounters most often: scalar operators (in Section 6.7.1) and vector operators (in Section 6.7.2). In deriving these selection rules we consider only how the operators behave under a rotation; therefore, the results of this section apply equally well to “true” scalars and pseudoscalars, and those of the next section apply equally well to “true” vectors and pseudeovectors. These selection rules can be combined with the parity selection rules of Section 6.4.3 to obtain a larger set of selection rules for the operator.

###

327

# 6.7.1 Selection Rules for Scalar Operators

The commutation relations for a scalar operator $\hat{f}$ with the three components of angular momentum (Equation 6.34) can be rewritten in terms of the raising and lowering operators as

$$
\left[ \hat {L} _ {z}, \hat {f} \right] = 0 \tag {6.40}
$$

$$
\left[ \hat {L} _ {\pm}, \hat {f} \right] = 0 \tag {6.41}
$$

$$
\left[ \hat {L} ^ {2}, \hat {f} \right] = 0. \tag {6.42}
$$

We derive selection rules for $\hat{f}$ by sandwiching these commutators between two states of definite angular momentum, which we will write as $|n\ell m\rangle$ and $|n^{\prime}\ell^{\prime}m^{\prime}\rangle$. These might be hydrogenic orbitals, but they need not be (in fact they need not even be eigenstates of any Hamiltonian but I'll leave the quantum number $n$ there so they look familiar); we require only that $|n\ell m\rangle$ is an eigenstate of $\hat{L}^2$ and $\hat{L}_z$ with quantum numbers $\ell$ and $m$ respectively.²⁵

Sandwiching Equation 6.40 between two such states gives

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| \left[ \hat {L} _ {z}, \hat {f} \right] \left| n \ell m \right\rangle = 0
$$

or

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| \hat {L} _ {z} \hat {f} \left| n \ell m \right\rangle - \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| \hat {f} \hat {L} _ {z} \left| n \ell m \right\rangle = 0
$$

and therefore

$$
\left(m ^ {\prime} - m\right) \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {f} \mid n \ell m \right\rangle = 0 \tag {6.43}
$$

(using the hermiticity of $\hat{L}_z$). Equation 6.43 says that the matrix elements of a scalar operator vanish unless $m' - m \equiv \Delta m = 0$. Repeating this procedure with Equation 6.42 we get

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \left[ \hat {L} ^ {2}, \hat {f} \right] \mid n \ell m \right\rangle = 0 \tag {6.44}
$$

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {L} ^ {2} \hat {f} \mid n \ell m \right\rangle - \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {f} \hat {L} ^ {2} \mid n \ell m \right\rangle = 0
$$

$$
\left[ \ell^ {\prime} \left(\ell^ {\prime} + 1\right) - \ell (\ell + 1) \right] \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {f} \mid n \ell m \right\rangle = 0.
$$

This tells us that the matrix elements of a scalar operator vanish unless $\ell' - \ell \equiv \Delta \ell = 0$.²⁶ These, then, are the selection rules for a scalar operator: $\Delta \ell = 0$ and $\Delta m = 0$.

However, we can get even more information about the matrix elements from the remaining commutators: (I'll just do the $+$ case and leave the $-$ case for Problem 6.20)

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \left[ \hat {L} _ {+}, \hat {f} \right] \mid n \ell m \right\rangle = 0 \tag {6.45}
$$

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {L} _ {+} \hat {f} \mid n \ell m \right\rangle - \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {f} \hat {L} _ {+} \mid n \ell m \right\rangle = 0
$$

$$
B _ {\ell^ {\prime}} ^ {m ^ {\prime}} \left\langle n ^ {\prime} \ell^ {\prime} (m ^ {\prime} - 1) \mid \hat {f} \mid n \ell m \right\rangle - A _ {\ell} ^ {m} \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {f} \mid n \ell (m + 1) \right\rangle = 0,
$$

where (from Problem 4.21)

$$
A _ {\ell} ^ {m} = \hbar \sqrt {\ell (\ell + 1) - m (m + 1)}, \qquad \text {and} \qquad B _ {\ell} ^ {m} = \hbar \sqrt {\ell (\ell + 1) - m (m - 1)}.
$$

(I also used the fact that  $\hat{L}_{\pm}$  is the Hermitian conjugate of  $\hat{L}_{\mp}$ :  $\langle \psi | \hat{L}_{\pm} = \langle L_{\mp} \psi \rangle^{27}$  Both terms in Equation 6.45 are zero unless  $m' = m + 1$  and  $\ell' = \ell$ , as we proved in Equations 6.43 and 6.44. When these conditions are satisfied, the two coefficients are equal  $\left(B_{\ell}^{m+1} = A_{\ell}^{m}\right)$  and Equation 6.45 reduces to

$$
\left\langle n ^ {\prime} \ell m \mid \hat {f} \mid n \ell m \right\rangle = \left\langle n ^ {\prime} \ell (m + 1) \mid \hat {f} \mid n \ell (m + 1) \right\rangle . \tag {6.46}
$$

Evidently the matrix elements of a scalar operator are independent of  $m$ .

The results of this section can be summarized as follows:

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {f} \mid n \ell m \right\rangle = \delta_ {\ell \ell^ {\prime}} \delta_ {m m ^ {\prime}} \left\langle n ^ {\prime} \ell \| f \| n \ell \right\rangle . \tag {6.47}
$$

The funny-looking matrix element on the right, with two bars, is called a reduced matrix element and is just shorthand for "a constant that depends on  $n$ ,  $\ell$ , and  $n'$ , but not  $m$ ."

## Example 6.4

(a) Find  $\langle r^2\rangle$  for all four of the degenerate  $n = 2$  states of a hydrogen atom.

Solution: From Equation 6.47 we have, for the states with  $\ell = 1$ , the following equality:

$$
\left\langle 2 1 1 \mid r ^ {2} \mid 2 1 1 \right\rangle = \left\langle 2 1 0 \mid r ^ {2} \mid 2 1 0 \right\rangle = \left\langle 2 1 - 1 \mid r ^ {2} \mid 2 1 - 1 \right\rangle \equiv \left\langle 2 1 \| r ^ {2} \| 2 1 \right\rangle .
$$

To calculate the reduced matrix element we simply pick any one of these expectation values:

$$
\begin{array}{l} \left\langle 2 1 \left\| r ^ {2} \right\| 2 1 \right\rangle = \left\langle 2 1 0 \left| r ^ {2} \right| 2 1 0 \right\rangle \\ = \int r ^ {2} | \psi_ {2 1 0} (r) | ^ {2} d ^ {3} \mathbf {r} \\ = \int_ {0} ^ {\infty} r ^ {4} | R _ {2 1} (r) | ^ {2} d r \int \left| Y _ {1} ^ {0} (\theta , \phi) \right| ^ {2} d \Omega . \\ \end{array}
$$

The spherical harmonics are normalized (Equation 4.31), so the angular integral is 1, and the radial functions  $R_{n\ell}$  are listed in Table 4.7, giving

$$
\left\langle 2 1 \left\| r ^ {2} \right\| 2 1 \right\rangle = \int_ {0} ^ {\infty} r ^ {4} \frac {1}{2 4 a ^ {3}} \frac {r ^ {2}}{a ^ {2}} e ^ {- r / a} d r = 3 0 a ^ {2}.
$$

That determines three of the expectation values. The final expectation value is

328

$$
\begin{array}{l}
\left\langle 20 \left\| r^{2} \right\| 20 \right\rangle = \left\langle 200 \left| r^{2} \right| 200 \right\rangle \\
= \int r^{2} |\psi_{200}(r)|^{2} d^{3} \mathbf{r} \\
= \int_{0}^{\infty} r^{4} |R_{20}(r)|^{2} dr \int \left| Y_{0}^{0}(\theta, \phi) \right|^{2} d\Omega \\
= \int_{0}^{\infty} r^{4} \frac{1}{2a^{3}} \left(1 - \frac{1}{2} \frac{r}{a}\right)^{2} e^{-r/a} dr \\
= 42a^{2}.
\end{array}
$$

Summarizing:

$$
\left\langle 200 \left| r^{2} \right| 200 \right\rangle = 42a^{2}, \quad \left\langle \begin{array}{l} 211 \left| r^{2} \right| 211 \\ 210 \left| r^{2} \right| 210 \\ 21 - 1 \left| r^{2} \right| 21 - 1 \end{array} \right\} = 30a^{2}. \tag{6.48}
$$

(b) Find the expectation value of $r^2$ for an electron in the superposition state

$$
|\psi\rangle = \frac{1}{\sqrt{2}} (|200\rangle - i |211\rangle).
$$

Solution: We can expand the expectation value as

$$
\begin{array}{l}
\left\langle \psi \left| r^{2} \right| \psi \right\rangle = \frac{1}{2} \left( \langle 200| + i \langle 211| \rangle r^{2} \left( |200\rangle - i |211\rangle \right) \right. \\
= \frac{1}{2} \left( \left\langle 200 \left| r^{2} \right| 200 \right\rangle + i \left\langle 211 \left| r^{2} \right| 200 \right\rangle - i \left\langle 200 \left| r^{2} \right| 211 \right\rangle \right. \\
\left. + \left\langle 211 \left| r^{2} \right| 211 \right\rangle \right).
\end{array}
$$

From Equation 6.47 we see that two of these matrix elements vanish, and

$$
\left\langle \psi \left| r^{2} \right| \psi \right\rangle = \frac{1}{2} \left( \left\langle 20 \left\| r^{2} \right\| 20 \right\rangle + \left\langle 21 \left\| r^{2} \right\| 21 \right\rangle \right) = 36a^{2}. \tag{6.49}
$$

Problem 6.20 Show that the commutator $\left[\hat{L}_{-},\hat{f}\right] = 0$ leads to the same rule, Equation 6.46, as does the commutator $\left[\hat{L}_{+},\hat{f}\right] = 0$.

Problem 6.21 For an electron in the hydrogen state

$$
\psi = \frac{1}{\sqrt{2}} \left( \psi_{211} + \psi_{21-1} \right),
$$

find $\langle r\rangle$ after first expressing it in terms of a single reduced matrix element.

330

331

## 6.7.2 Selection Rules for Vector Operators

We now move on to the selection rules for a vector operator $\hat{\mathbf{V}}$. This is significantly more work than the scalar case, but the result is central to understanding atomic transitions (Chapter 11). We begin by defining, by analogy with the angular momentum raising and lowering operators, the operators$^{28}$

$$
\hat {V} _ {\pm} \equiv \hat {V} _ {x} \pm i \hat {V} _ {y}.
$$

Written in terms of these operators, Equation 6.33 becomes

$$
\left[ \hat {L} _ {z}, \hat {V} _ {z} \right] = 0 \tag {6.50}
$$

$$
\left[ \hat {L} _ {z}, \hat {V} _ {\pm} \right] = \pm \hbar \hat {V} _ {\pm} \tag {6.51}
$$

$$
\left[ \hat {L} _ {\pm}, \hat {V} _ {\pm} \right] = 0 \tag {6.52}
$$

$$
\left[ \hat {L} _ {\pm}, \hat {V} _ {z} \right] = \mp \hbar \hat {V} _ {\pm} \tag {6.53}
$$

$$
\left[ \hat {L} _ {\pm}, \hat {V} _ {\mp} \right] = \pm 2 \hbar \hat {V} _ {z} \tag {6.54}
$$

as you will show in Problem 6.22(a).$^{29}$ Just as for the scalar operator in Section 6.7.1, we sandwich each of these commutators between two states of definite angular momentum to derive (a) conditions under which the matrix elements are guaranteed to vanish and (b) relations between matrix elements with differing values of $m$ or different components of $\hat{\mathbf{V}}$.

From Equation 6.51,

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \left| \hat {L} _ {z} \hat {V} _ {\pm} \right| n \ell m \right\rangle - \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \left| \hat {V} _ {\pm} \hat {L} _ {z} \right| n \ell m \right\rangle = \pm \hbar \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \left| \hat {V} _ {\pm} \right| n \ell m \right\rangle ,
$$

and since our states are eigenstates of $\hat{L}_z$, this simplifies to

$$
\left[ m ^ {\prime} - (m \pm 1) \right] \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \left| \hat {V} _ {\pm} \right| n \ell m \right\rangle = 0. \tag {6.55}
$$

Equation 6.55 says that either $m' = m \pm 1$, or else the matrix element of $\hat{V}_{\pm}$ must vanish. Equation 6.50 works out similarly (see Problem 6.22) and this first set of commutators gives us the selection rules for $m$:

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {V} _ {+} \mid n \ell m \right\rangle = 0 \quad \text{unless } m ^ {\prime} = m + 1 \tag {6.56}
$$

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {V} _ {z} \mid n \ell m \right\rangle = 0 \quad \text{unless } m ^ {\prime} = m \tag {6.57}
$$

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {V} _ {-} \mid n \ell m \right\rangle = 0 \quad \text{unless } m ^ {\prime} = m - 1. \tag {6.58}
$$

Note that, if desired, these expressions can be turned back into selection rules for the $x$- and $y$-components of our operator, since

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \middle | \hat {V} _ {x} \middle | n \ell m \right\rangle = \frac {1}{2} \left[ \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \middle | \hat {V} _ {-} \middle | n \ell m \right\rangle + \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \middle | \hat {V} _ {+} \middle | n \ell m \right\rangle \right]
$$

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \middle | \hat {V} _ {y} \middle | n \ell m \right\rangle = \frac {i}{2} \left[ \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \middle | \hat {V} _ {-} \middle | n \ell m \right\rangle - \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \middle | \hat {V} _ {+} \middle | n \ell m \right\rangle \right].
$$

The remaining commutators, Equations 6.52-6.54, yield a selection rule on  $\xi$  and relations among the nonzero matrix elements. As shown in Problem 6.24, the results may be summarized as $^{20}$

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {V} _ {+} \mid n \ell m \right\rangle = - \sqrt {2} C _ {m 1 m ^ {\prime}} ^ {\ell 1 \ell^ {\prime}} \left\langle n \ell^ {\prime} \| V \| n \ell \right\rangle \tag {6.59}
$$

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {V} _ {-} \mid n \ell m \right\rangle = \sqrt {2} C _ {m - 1 m ^ {\prime}} ^ {\ell 1 \ell^ {\prime}} \left\langle n \ell^ {\prime} \| V \| n \ell \right\rangle \tag {6.60}
$$

$$
\left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \mid \hat {V} _ {z} \mid n \ell m \right\rangle = C _ {m 0 m ^ {\prime}} ^ {\ell 1 \ell^ {\prime}} \left\langle n \ell^ {\prime} \| V \| n \ell \right\rangle . \tag {6.61}
$$

The constants  $C_{m_1m_2M}^{j_1j_2J}$  in these expressions are precisely the Clebsch-Gordan coefficients that appeared in the addition of angular momenta (Section 4.4.3). The Clebsch-Gordan coefficient  $C_{m_1m_2M}^{j_1j_2J}$  vanishes unless  $M = m_1 + m_2$  (since the  $z$ -components of angular momentum add) and unless  $J = j_1 + j_2, j_1 + j_2 - 1, \ldots, |j_1 - j_2|$  (Equation 4.182). In particular, the matrix elements of any component of a vector operator,  $\langle n' \ell'm' | \hat{V}_i | n \ell m \rangle$ , are nonzero only if

$$
\Delta \ell = 0, \pm 1, \quad \text{and} \quad \Delta m = 0, \pm 1. \tag {6.62}
$$

## Example 6.5

Find all of the matrix elements of  $\hat{\mathbf{r}}$  between the states with  $n = 2$ ,  $\ell = 1$  and  $n' = 3$ ,  $\ell' = 2$ :

$$
\langle 32m' | r_i | 21m \rangle
$$

where  $m = -1, 0, 1, m' = -2, -1, 0, 1, 2,$  and  $r_i = x, y, z$ .

**Solution**: With the vector operator  $\hat{\mathbf{V}} = \hat{\mathbf{r}}$ , our components are  $V_z = z$ ,  $V_+ = x + iy$ , and  $V_- = x - iy$ . We start by calculating one of the matrix elements,

$$
\begin{array}{l}
\langle 320 | z | 210 \rangle = \int \psi_{320}(\mathbf{r}) \, r \cos \theta \, \psi_{210}(\mathbf{r}) \, d^3\mathbf{r} \\
= \int R_{32}(r)^* \, r \, R_{21}(r) \, r^2 \, dr \, \int Y_2^0(\theta, \phi)^* \, \cos \theta \, Y_1^0(\theta, \phi) \, d\Omega \\
= \frac{2^{12} \, 3^3 \sqrt{3}}{5^7} \, a.
\end{array}
$$

From Equation 6.61 we can then determine the reduced matrix element

$$
\begin{array}{l}
\langle 320 | z | 210 \rangle = C_{000}^{112} \langle 32 \| V \| 21 \rangle \\
\frac{2^{12} \, 3^3 \sqrt{3}}{5^7} \, a = \sqrt{\frac{2}{3}} \langle 32 \| V \| 21 \rangle.
\end{array}
$$

Therefore

$$
\langle 32 \| V \| 21 \rangle = \frac{2^{12} \, 3^4}{5^7 \sqrt{2}} \, a. \tag {6.63}
$$

We can now find all of the remaining matrix elements from Equations 6.59-6.60 with the help of the Clebsch-Gordan table. The relevant coefficients are shown in Figure 6.8. The nonzero matrix elements are

$\left\langle 322 \mid \hat{V}_{+} \mid 211 \right\rangle = -\sqrt{2} C_{112}^{112} \left\langle 32 \| V \| 21 \right\rangle = -\sqrt{2} \left\langle 32 \| V \| 21 \right\rangle$

$\left\langle 321 \mid \hat{V}_{+} \mid 210 \right\rangle = -\sqrt{2} C_{011}^{112} \left\langle 32 \| V \| 21 \right\rangle = -\left\langle 32 \| V \| 21 \right\rangle$

$\left\langle 320 \mid \hat{V}_{+} \mid 21 - 1 \right\rangle = -\sqrt{2} C_{-110}^{-112} \left\langle 32 \| V \| 21 \right\rangle = -\frac{1}{\sqrt{3}} \left\langle 32 \| V \| 21 \right\rangle$

$\left\langle 320 \mid \hat{V}_{-} \mid 211 \right\rangle = \sqrt{2} C_{1-10}^{1-12} \left\langle 32 \| V \| 21 \right\rangle = \frac{1}{\sqrt{3}} \left\langle 32 \| V \| 21 \right\rangle$

$\left\langle 32 - 1 \mid \hat{V}_{-} \mid 210 \right\rangle = \sqrt{2} C_{0-1-1}^{1-2} \left\langle 32 \| V \| 21 \right\rangle = \left\langle 32 \| V \| 21 \right\rangle$

$\left\langle 32 - 2 \mid \hat{V}_{-} \mid 21 - 1 \right\rangle = \sqrt{2} C_{-1-1-2}^{-1-2} \left\langle 32 \| V \| 21 \right\rangle = \sqrt{2} \left\langle 32 \| V \| 21 \right\rangle$

$\left\langle 321 \mid \hat{V}_{z} \mid 211 \right\rangle = C_{101}^{112} \left\langle 32 \| V \| 21 \right\rangle = \frac{1}{\sqrt{2}} \left\langle 32 \| V \| 21 \right\rangle$

$\left\langle 320 \mid \hat{V}_{z} \mid 210 \right\rangle = C_{000}^{112} \left\langle 32 \| V \| 21 \right\rangle = \sqrt{\frac{2}{3}} \left\langle 32 \| V \| 21 \right\rangle$

$\left\langle 32 - 1 \mid \hat{V}_{z} \mid 21 - 1 \right\rangle = C_{-10-1}^{-11-2} \left\langle 32 \| V \| 21 \right\rangle = \frac{1}{\sqrt{2}} \left\langle 32 \| V \| 21 \right\rangle$

with the reduced matrix element given by Equation 6.63. The other thirty-six matrix elements vanish due to the selection rules (Equations 6.56-6.58 and 6.62). We have determined all forty-five matrix elements and have only needed to evaluate a single integral. I've left the matrix elements in terms of  $V_{+}$  and  $V_{-}$  but it's straightforward to write them in terms of  $x$  and  $y$  using the expressions on page 259.

![img-107.jpeg](img-107.jpeg)
Figure 6.8: The Clebsch-Gordan coefficients for  $[\otimes ]$

It is no coincidence that the Clebsch-Gordan coefficients appear in Equations 6.59-6.61. States have angular momentum, but operators also carry angular momentum. A scalar operator (Equation 6.34) has  $\xi = 0$  —it is unchanged by a rotation—just as a state of angular momentum 0 is unchanged. A vector operator (Equation 6.33) has  $\xi = 1$ ; its three components transform into each other under a rotation in the same way

the triplet of states with angular momentum  $\ell = 1$  transform into each other.31 When we act on a state with an operator, we add together the angular momentum of the state and the operator to obtain the angular momentum of the resultant state; this addition of angular momenta is the source of the Clebsch-Gordan coefficients in Equations 6.59-6.61.32

# Problem 6.22

(a) Show that the commutation relations, Equations 6.50-6.54, follow from the definition of a vector operator, Equation 6.33. If you did Problem 6.19 you already derived one of these.
(b) Derive Equation 6.57.

Problem 6.23 The Clebsch-Gordan coefficients are defined by Equation 4.183. Adding together two states with angular momentum  $j_{1}$  and  $j_{2}$  produces a state with total angular momentum  $J$  according to

$$
| J M \rangle = \sum_ {m _ {1}, m _ {2}} C _ {m _ {1} m _ {2} M} ^ {j _ {1} j _ {2} J} | j _ {1} j _ {2} m _ {1} m _ {2} \rangle . \tag {6.64}
$$

(a) From Equation 6.64, show that the Clebsch-Gordan coefficients satisfy

$$
C _ {m _ {1} m _ {2} M} ^ {j _ {1} j _ {2} J} = \left\langle j _ {1} j _ {2} m _ {1} m _ {2} \right| J M \rangle . \tag {6.65}
$$

(b) Apply  $\hat{J}_{\pm} = \hat{J}_{\pm}^{(1)} + \hat{J}_{\pm}^{(2)}$  to Equation 6.64 to derive the recursion relations for Clebsch-Gordan coefficients:

$$
A _ {j} ^ {M} C _ {m _ {1} m _ {2} M + 1} ^ {j _ {1} j _ {2} J} = B _ {j _ {1}} ^ {m _ {1}} C _ {m _ {1} - 1 m _ {2} M} ^ {j _ {1} j _ {2} J} + B _ {j _ {2}} ^ {m _ {2}} C _ {m _ {1} m _ {2} - 1 M} ^ {j _ {1} j _ {2} J} \tag {6.66}
$$

$$
B _ {J} ^ {M} C _ {m _ {1} m _ {2} M - 1} ^ {j _ {1} j _ {2} J} = A _ {j _ {1}} ^ {m _ {1}} C _ {m + 1 m _ {2} M} ^ {j _ {1} j _ {2} J} + A _ {j _ {2}} ^ {m _ {2}} C _ {m _ {1} m _ {2} + 1 M} ^ {j _ {1} j _ {2} J}
$$

\*\*

# Problem 6.24

(a) Sandwich each of the six commutation relations in Equations 6.52-6.54 between  $\langle n^{\prime}\ell^{\prime}m^{\prime}|$  and  $|n\ell m\rangle$  to obtain relations between matrix elements of  $\hat{\mathbf{V}}$ . As an example, Equation 6.52 with the upper signs gives

$$
B _ {\ell^ {\prime}} ^ {m ^ {\prime}} \left\langle n ^ {\prime} \ell^ {\prime} \left(m ^ {\prime} - 1\right) \right| V _ {+} \left| n \ell m \right\rangle = A _ {\ell} ^ {m} \left\langle n ^ {\prime} \ell^ {\prime} m ^ {\prime} \right| V _ {+} \left| n \ell (m + 1) \right\rangle .
$$

(b) Using the results in Problem 6.23, show that the six expressions you wrote down in part (a) are satisfied by Equations 6.59-6.61.

Problem 6.25 Express the expectation value of the dipole moment  $\mathbf{p}_e$  for an electron in the hydrogen state

$$
\psi = \frac {1}{\sqrt {2}} \left(\psi_ {2 1 1} + \psi_ {2 1 0}\right)
$$

in terms of a single reduced matrix element, and evaluate the expectation value. Note: this is the expectation value of a vector so you need to compute all three components. Don't forget Laporte's rule!

335

336

# 6.8 Translations in Time

In this section we study time-translation invariance. Consider a solution $\Psi(x,t)$ to the time-dependent Schrödinger equation

$$
\hat{H} \Psi (x, t) = i \hbar \frac{\partial}{\partial t} \Psi (x, t).
$$

We can define the operator that propagates the wave function forward in time, $\hat{U} (t)$ by

$$
\hat{U} (t) \Psi (x, 0) = \Psi (x, t); \tag {6.67}
$$

$\hat{U} (t)$ can be expressed in terms of the Hamiltonian, and doing so is straightforward if the Hamiltonian is not itself a function of time. In that case, expanding the right-hand side of Equation 6.67 in a Taylor series gives$^{33}$

$$
\begin{array}{l}
\hat{U} (t) \Psi (x, 0) = \Psi (x, t) = \sum_{n = 0}^{\infty} \frac{1}{n !} \left. \frac{\partial^{n}}{\partial t^{n}} \Psi (x, t) \right|_{t = 0} t^{n} \tag {6.68} \\
= \sum_{n = 0}^{\infty} \frac{1}{n !} \left(- \frac{i}{\hbar} \hat{H} t\right)^{n} \Psi (x, 0). \tag {6.69}
\end{array}
$$

Therefore, in the case of a time-independent Hamiltonian, the time-evolution operator is$^{34}$

$$
\hat{U} (t) = \exp \left[ - \frac{i t}{\hbar} \hat{H} \right]. \tag {6.71}
$$

We say that the Hamiltonian is the generator of translations in time. Note that $\hat{U} (t)$ is a unitary operator (see Problem 6.2).

The time-evolution operator offers a compact way to state the procedure for solving the time-dependent Schrödinger equation. To see the correspondence, write out the wave function at time $t = 0$ as a superposition of stationary states $\left(\hat{H}\psi_{n} = E_{n}\psi_{n}\right)$:

$$
\Psi (x, 0) = \sum_{n} c_{n} \psi_{n} (x).
$$

Then

$$
\begin{array}{l}
\Psi (x, t) = \hat{U} (t) \Psi (x, 0) = \sum_{n} c_{n} \hat{U} (t) \psi_{n} (x) \\
= \sum_{n} c_{n} e^{-i \hat{H} t / \hbar} \psi_{n} (x) = \sum_{n} c_{n} e^{-i E_{n} t / \hbar} \psi_{n} (x).
\end{array}
$$

In this sense Equation 6.71 is shorthand for the process of expanding the initial wave function in terms of stationary states and then tacking on the "wiggle factors" to obtain the wave function at a later time (Section 2.1).

337

338

## 6.8.1 The Heisenberg Picture

Just as for the other transformations studied in this chapter, we can examine the effect of applying time translation to operators, as well as to wave functions. The transformed operators are called Heisenberg-picture operators and we follow the convention of giving them a subscript $H$ rather than a prime:

$$
\hat {Q} _ {H} (t) = \hat {U} ^ {\dagger} (t) \hat {Q} \hat {U} (t). \tag {6.72}
$$

### Example 6.6

A particle of mass $m$ moves in one dimension in a potential $V(x)$:

$$
\hat {H} = \frac {\hat {p} ^ {2}}{2 m} + V (x).
$$

Find the position operator in the Heisenberg picture for an infinitesimal time translation $\delta$.

**Solution**: From Equation 6.71,

$$
\hat {U} (\delta) \approx 1 - i \frac {\delta}{\hbar} \hat {H}.
$$

Applying Equation 6.72, we have

$$
\begin{array}{l} \hat {x} _ {H} (\delta) \approx \left(1 + i \frac {\delta}{\hbar} \hat {H} ^ {\dagger}\right) \hat {x} \left(1 - i \frac {\delta}{\hbar} \hat {H}\right) \\ \approx \hat {x} - i \frac {\delta}{\hbar} \left[ \hat {x}, \hat {H} \right] \approx \hat {x} - i \frac {\delta}{\hbar} i \hbar \frac {\hat {p}}{m} \\ \end{array}
$$

so

$$
\hat {x} _ {H} (\delta) \approx \hat {x} _ {H} (0) + \frac {1}{m} \hat {p} _ {H} (0) \delta
$$

(making use of the fact that the Heisenberg-picture operators at time 0 are just the untransformed operators). This looks exactly like classical mechanics: $x(\delta) \approx x(0) + v(0)\delta$. The Heisenberg picture illuminates the connection between classical and quantum mechanics: the quantum operators obey the classical equations of motion (see Problem 6.29).

### Example 6.7

A particle of mass $m$ moves in one dimension in a harmonic-oscillator potential:

$$
\hat {H} = \frac {\hat {p} ^ {2}}{2 m} + \frac {1}{2} m \omega^ {2} x ^ {2}.
$$

Find the position operator in the Heisenberg picture at time $t$.

**Solution**: Consider the action of $\hat{x}_H$ on a stationary state $\psi_n$. (Introducing $\psi_n$ allows us to replace the operator $e^{-i\hat{H}t/\hbar}$ with the number $e^{-iE_n t/\hbar}$, since $e^{-i\hat{H}t/\hbar}\psi_n = e^{-iE_n t/\hbar}\psi_n$.) Writing $\hat{x}$ in terms of raising and lowering operators we have (using Equations 2.62, 2.67, and 2.70)

$$
\begin{array}{l}
\hat{x}_H(t) \psi_n(x) = \hat{U}^\dagger(t) \hat{x} \hat{U}(t) \psi_n(x) \tag{6.73} \\
= e^{i \hat{H}_t / \hbar} \sqrt{\frac{\hbar}{2m\omega}} (\hat{a}_+ + \hat{a}_-) e^{-i \hat{H}_t / \hbar} \psi_n(x) \\
= \sqrt{\frac{\hbar}{2m\omega}} e^{-i E_n t / \hbar} e^{i \hat{H} t / \hbar} (\hat{a}_+ + \hat{a}_-) \psi_n(x) \\
= \sqrt{\frac{\hbar}{2m\omega}} e^{-i E_n t / \hbar} e^{i \hat{H} t / \hbar} \left[ \sqrt{n + 1} \psi_{n+1}(x) + \sqrt{n} \psi_{n-1}(x) \right] \\
= \sqrt{\frac{\hbar}{2m\omega}} e^{-i E_n t / \hbar} \left[ \sqrt{n + 1} e^{i E_{n+1} t / \hbar} \psi_{n+1}(x) \right. \\
\left. + \sqrt{n} e^{i E_{n-1} t / \hbar} \psi_{n-1}(x) \right] \\
= \sqrt{\frac{\hbar}{2m\omega}} \left[ \sqrt{n + 1} e^{i \omega t} \psi_{n+1}(x) + \sqrt{n} e^{-i \omega t} \psi_{n-1}(x) \right].
\end{array}
$$

Thus³⁵

$$
\hat{x}_H(t) = \sqrt{\frac{\hbar}{2m\omega}} \left[ e^{i \omega t} \hat{a}_+ + e^{-i \omega t} \hat{a}_- \right].
$$

Or, using Equation 2.48 to express $\hat{a}_{\pm}$ in terms of $\hat{x}$ and $\hat{p}$,

$$
\hat{x}_H(t) = \hat{x}_H(0) \cos(\omega t) + \frac{1}{m\omega} \hat{p}_H(0) \sin(\omega t). \tag{6.74}
$$

As in Example 6.6 we see that the Heisenberg-picture operator satisfies the *classical* equation of motion for a mass on a spring.

In this book we have been working in the Schrödinger picture, so-named by Dirac because it was the picture that Schrödinger himself had in mind. In the Schrödinger picture, the wave function evolves in time according to the Schrödinger equation

$$
\hat{H} \Psi(x, t) = i \hbar \frac{\partial}{\partial t} \Psi(x, t).
$$

The operators $\hat{x} = x$ and $\hat{p} = -i\hbar \partial_x$ have no time dependence of their own, and the time dependence of expectation values (or, more generally, matrix elements) comes from the time dependence of the wave function:³⁶

$$
\left\langle \hat{Q} \right\rangle = \left\langle \Psi(t) \mid \hat{Q} \mid \Psi(t) \right\rangle.
$$

In the Heisenberg picture, the wave function is constant in time, $\Psi_H(x) = \Psi(x, 0)$, and the *operators* evolve in time according to Equation 6.72. In the Heisenberg picture, the time dependence of expectation values (or matrix elements) is carried by the *operators*.

$$
\left\langle \hat{Q} \right\rangle = \left\langle \Psi_H \mid \hat{Q}_H(t) \mid \Psi_H \right\rangle.
$$

Of course, the two pictures are entirely equivalent since

339

$$
\left\langle \Psi (t) \mid \hat {Q} \mid \Psi (t) \right\rangle = \left\langle \Psi (0) \mid \hat {U} ^ {\dagger} \hat {Q} \hat {U} \mid \Psi (0) \right\rangle = \left\langle \Psi_ {H} \mid \hat {Q} _ {H} (t) \mid \Psi_ {H} \right\rangle .
$$

A nice analogy for the two pictures runs as follows. On an ordinary clock, the hands move in a clockwise direction while the numbers stay fixed. But one could equally well design a clock where the hands are stationary and the numbers move in the counter-clockwise direction. The correspondence between these two clocks is roughly the correspondence between the Schrödinger and Heisenberg pictures, the hands representing the wave function and the numbers representing the operator. Other pictures could be introduced as well, in which both the hands of the clock and the numbers on the dial move at intermediate rates such that the clock still tells the correct time.[37]

* Problem 6.26 Work out  $\hat{p}_H(t)$  for the system in Example 6.7 and comment on the correspondence with the classical equation of motion.

** Problem 6.27 Consider a free particle of mass  $m$ . Show that the position and momentum operators in the Heisenberg picture are given by

$$
\hat {x} _ {H} (t) = \hat {x} _ {H} (0) + \frac {1}{m} \hat {p} _ {H} (0) t
$$

$$
\hat {p} _ {H} (t) = \hat {p} _ {H} (0).
$$

Comment on the relationship between these equations and the classical equations of motion. Hint: you will first need to evaluate the commutator  $\left[\hat{x},\hat{H}^n\right]$ ; this will allow you to evaluate the commutator  $\left[\hat{x},\hat{U}\right]$ .

340

341

## 6.8.2 Time-Translation Invariance

If the Hamiltonian is time-dependent one can still write the formal solution to the Schrödinger equation in terms of the time-translation operator, $\hat{U}$:

$$
\Psi (x, t) = \hat {U} (t, t _ {0}) \Psi (x, t _ {0}), \tag {6.75}
$$

but $\hat{U}$ no longer takes the simple form 6.71.³⁸ (See Problem 11.23 for the general case.) For an infinitesimal time interval $\delta$ (see Problem 6.28)

$$
\hat {U} \left(t _ {0} + \delta , t _ {0}\right) \approx 1 - \frac {i}{\hbar} \hat {H} \left(t _ {0}\right) \delta . \tag {6.76}
$$

Time-translation invariance means that the time evolution is independent of which time interval we are considering. In other words

$$
\hat {U} \left(t _ {1} + \delta , t _ {1}\right) = \hat {U} \left(t _ {2} + \delta , t _ {2}\right) \tag {6.77}
$$

for any choice of $t_1$ and $t_2$. This ensures that if the system starts in state $|\alpha\rangle$ at time $t_1$ and evolves for a time $\delta$ then it will end up in the same state $|\beta\rangle$ as if the system started in the same state $|\alpha\rangle$ at time $t_2$ and evolved for the same amount of time $\delta$; i.e. the experiment proceeds the same on Thursday as it did on Tuesday, assuming identical conditions. Plugging Equation 6.76 into Equation 6.77 we see that the requirement for this to be true is $\hat{H}(t_1) = \hat{H}(t_2)$, and since this must hold true for all $t_1$ and $t_2$, it must be that the Hamiltonian is in fact time-independent after all (for time-translation invariance to hold):

$$
\frac {\partial \hat {H}}{\partial t} = 0.
$$

In that case the generalized Ehrenfest theorem says

$$
\frac {d}{d t} \left\langle \hat {H} \right\rangle = \frac {i}{\hbar} \left\langle \left[ \hat {H}, \hat {H} \right] \right\rangle + \left\langle \frac {\partial \hat {H}}{\partial t} \right\rangle = 0.
$$

Therefore, energy conservation is a consequence of time-translation invariance.

We have now recovered all the classical conservation laws: conservation of momentum, energy, and angular momentum, and seen that they are each related to a continuous symmetry of the Hamiltonian (spatial translation, time translation, and rotation, respectively). And in quantum mechanics, discrete symmetries (such as parity) can also lead to conservation laws.

**Problem 6.28** Show that Equations 6.75 and 6.76 are the solution to the Schrödinger equation for an infinitesimal time $\delta$. Hint: expand $\Psi(x, t)$ in a Taylor series.

*   Problem 6.29 Differentiate Equation 6.72 to obtain the Heisenberg equations of motion

$$
i \hbar \frac {d}{d t} \hat {Q} _ {H} (t) = \left[ \hat {Q} _ {H} (t), \hat {H} \right] \tag {6.78}
$$

(for $\hat{\mathcal{Q}}$ and $\hat{H}$ independent of time).27 Plug in $\hat{\mathcal{Q}} = \hat{x}$ and $\hat{\mathcal{Q}} = \hat{p}$ to obtain the differential equations for $\hat{x}_H$ and $\hat{p}_H$ in the Heisenberg picture for a single particle of mass $m$ moving in a potential $V(x)$

***

Problem 6.30 Consider a time-independent Hamiltonian for a particle moving in one dimension that has stationary states $\psi_{n}(x)$ with energies $E_{n}$.

(a) Show that the solution to the time-dependent Schrödinger equation can be written

$$
\Psi (x, t) = \hat {U} (t) \Psi (x, 0) = \int K (x, x ^ {\prime}, t) \Psi (x ^ {\prime}, 0) d x ^ {\prime},
$$

where $K(x, x', t)$, known as the propagator, is

$$
K \left(x, x ^ {\prime}, t\right) = \sum_ {n} \psi_ {n} ^ {*} \left(x ^ {\prime}\right) e ^ {- i E _ {n} t / \hbar} \psi_ {n} (x). \tag {6.79}
$$

Here $\left|K(x,x^{\prime},t)\right|^{2}$ is the probability for a quantum mechanical particle to travel from position $x^{\prime}$ to position $x$ in time $t$.

(b) Find $K$ for a particle of mass $m$ in a simple harmonic oscillator potential of frequency $\omega$. You will need the identity

$$
\frac {1}{\sqrt {1 - z ^ {2}}} \exp \left[ - \frac {\xi^ {2} + \eta^ {2} - 2 \xi \eta z}{1 - z ^ {2}} \right] = e ^ {- \xi^ {2}} e ^ {- \eta^ {2}} \sum_ {n = 0} ^ {\infty} \frac {z ^ {n}}{2 ^ {n} n !} H _ {n} (\xi) H _ {n} (\eta).
$$

(c) Find $\Psi (x,t)$ if the particle from part (a) is initially in the state50

$$
\Psi (x, 0) = \left(\frac {2 a}{\pi}\right) ^ {1 / 4} e ^ {- a (x - x _ {0}) ^ {2}}.
$$

Compare your answer with Problem 2.49. Note: Problem 2.49 is a special case with $a = m\omega /2\hbar$.

(d) Find $K$ for a free particle of mass $m$. In this case the stationary states are continuous, not discrete, and one must make the replacement

$$
\sum_ {n} \rightarrow \int_ {- \infty} ^ {\infty} d p
$$

in Equation 6.79.

(e) Find $\Psi (x,t)$ for a free particle that starts out in the state

$$
\Psi (x, 0) = \left(\frac {2 a}{\pi}\right) ^ {1 / 4} e ^ {- a x ^ {2}}.
$$

Compare your answer with Problem 2.21.

343

Further Problems on Chapter 6

Problem 6.31 In deriving Equation 6.3 we assumed that our function had a Taylor series. The result holds more generally if we define the exponential of an operator by its spectral decomposition,

$$
\hat {T} (a) = \int e ^ {- i a p / \hbar} | p \rangle \langle p | d p, \tag {6.80}
$$

rather than its power series. Here I've given the operator in Dirac notation; acting on a position-space function (see the discussion on page 123) this means

$$
\hat {T} (a) \psi (x) = \int_ {- \infty} ^ {\infty} e ^ {- i a p / \hbar} f _ {p} (x) \Phi (p) d p, \tag {6.81}
$$

where  $\Phi(p)$  is the momentum space wave function corresponding to  $\psi(x)$  and  $f_p(x)$  is defined in Equation 3.32. Show that the operator  $\hat{T}(a)$ , as given by Equation 6.81, applied to the function

$$
\psi (x) = \sqrt {\lambda} e ^ {- \lambda | x |}
$$

(whose first derivative is undefined at  $x = 0$ ) gives the correct result.

Problem 6.32 Rotations on spin states are given by an expression identical to Equation 6.32, with the spin angular momentum replacing the orbital angular momentum:

$$
\mathsf {R} _ {\mathbf {n}} (\varphi) = \exp \left[ - i \frac {\varphi}{\hbar} \mathbf {n} \cdot \mathsf {S} \right].
$$

In this problem we will consider rotations of a spin-1/2 state.

(a) Show that

$$
(\mathbf {a} \cdot \boldsymbol {\sigma}) (\mathbf {b} \cdot \boldsymbol {\sigma}) = \mathbf {a} \cdot \mathbf {b} + i (\mathbf {a} \times \mathbf {b}) \cdot \boldsymbol {\sigma},
$$

where the  $\sigma_{i}$  are the Pauli spin matrices and  $\mathbf{a}$  and  $\mathbf{b}$  are ordinary vectors. Use the result of Problem 4.29.

(b) Use your result from part (a) to show that

$$
\exp \left[ - i \frac {\varphi}{\hbar} \mathbf {n} \cdot \mathsf {S} \right] = \cos \left(\frac {\varphi}{2}\right) - i \sin \left(\frac {\varphi}{2}\right) \mathbf {n} \cdot \boldsymbol {\sigma}.
$$

Recall that  $\mathsf{S} = (\hbar /2)\pmb{\sigma}$

(c) Show that your result from part (b) becomes, in the standard basis of spin up and spin down along the  $z$  axis, the matrix

$$
\mathsf {R} _ {\mathbf {n}} = \cos \left(\frac {\varphi}{2}\right) \left( \begin{array}{cc} 1 &amp; 0 \\ 0 &amp; 1 \end{array} \right) - i \sin \left(\frac {\varphi}{2}\right) \left( \begin{array}{cc} \cos \theta &amp; \sin \theta e ^ {- i \phi} \\ \sin \theta e ^ {i \phi} &amp; - \cos \theta \end{array} \right)
$$

where $\theta$ and $\phi$ are the polar coordinates of the unit vector $\mathbf{n}$ that describes the axis of rotation.

(d) Verify that the matrix $\mathsf{R}_{\mathsf{R}}$ in part (c) is unitary.
(e) Compute explicitly the matrix $\mathsf{S}_x' = \mathsf{R}^\dagger \mathsf{S}_x \mathsf{R}$ where $\mathsf{R}$ is a rotation by an angle $\psi$ about the $z$ axis and verify that it returns the expected result. Hint: rewrite your result for $\mathsf{S}_x'$ in terms of $\mathsf{S}_x$ and $\mathsf{S}_y$.
(f) Construct the matrix for a $\pi$ rotation about the $x$ axis and verify that it turns an up spin into a down spin.
(g) Find the matrix describing a $2\pi$ rotation about the $z$ axis. Why is this answer surprising?41

Problem 6.33 Consider a particle of mass $m$ in a two-dimensional infinite square well with sides of length $L$. With the origin placed at the center of the well, the stationary states can be written as

$$
\psi_{n_x n_y}(x, y) = \frac{2}{L} \sin \left[ \frac{n_x \pi}{L} \left(x - \frac{L}{2}\right) \right] \sin \left[ \frac{n_y \pi}{L} \left(y - \frac{L}{2}\right) \right],
$$

with energies

$$
E_{n_x n_y} = \frac{\pi^2 \hbar^2}{2 m L^2} \left(n_x^2 + n_y^2\right),
$$

for positive integers $n_x$ and $n_y$.

(a) The two states $\psi_{ab}$ and $\psi_{ba}$ for $a \neq b$ are clearly degenerate. Show that a rotation by $90^\circ$ counterclockwise about the center of the square carries one into the other,

$\hat{R}\psi_{ab} \propto \psi_{ba},$

and determine the constant of proportionality. Hint: write $\psi_{ab}$ in polar coordinates.

(b) Suppose that instead of $\psi_{ab}$ and $\psi_{ba}$ we choose the basis $\psi_{+}$ and $\psi_{-}$ for our two degenerate states:

$$
\psi_{\pm} = \frac{\psi_{ab} \pm \psi_{ba}}{\sqrt{2}}.
$$

Show that if $a$ and $b$ are both even or both odd, then $\psi_{+}$ and $\psi_{-}$ are eigenstates of the rotation operator.

(c) Make a contour plot of the state $\psi_{-}$ for $a = 5$ and $b = 7$ and verify (visually) that it is an eigenstate of every symmetry operation of the square (rotation by an integer multiple of $\pi/2$, reflection across a diagonal, or reflection along a line bisecting two sides). The fact that $\psi_{+}$ and $\psi_{-}$ are not connected to each other by any symmetry of the square means that there must be additional symmetry explaining the degeneracy of these two states.42

\*\*\*

Problem 6.34 The Coulomb potential has more symmetry than simply rotational invariance. This additional symmetry is manifest in an additional conserved quantity, the Laplace-Runge-Lenz vector

$$
\hat {\mathbf {M}} = \frac {\hat {\mathbf {p}} \times \hat {\mathbf {L}} - \hat {\mathbf {L}} \times \hat {\mathbf {p}}}{2 m} + V (r) \mathbf {r},
$$

where  $V(\mathbf{r})$  is the potential energy,  $V(r) = -e^{2} / 4\pi \epsilon_{0}r$ . The complete set of commutators for the conserved quantities in the hydrogen atom is

(i)  $\left[\hat{H},\hat{M}_i\right] = 0$
(ii)  $\left[\hat{H},\hat{L}_i\right] = 0$
(iii)  $\left[\hat{L}_i,\hat{L}_j\right] = i\hbar \epsilon_{ijk}\hat{L}_k$
(iv)  $\left[\hat{L}_i,\hat{M}_j\right] = i\hbar \epsilon_{ijk}\hat{M}_k$
(v)  $\left[\hat{M}_i,\hat{M}_j\right] = \frac{\hbar}{i}\epsilon_{ijk}L_k\frac{2}{m}\hat{H}.$

The physical content of these equations is that (i)  $\mathbf{M}$  is a conserved quantity, (ii)  $\mathbf{L}$  is a conserved quantity, (iii)  $\mathbf{L}$  is a vector, and (iv)  $\mathbf{M}$  is a vector ((v) has no obvious interpretation). There are two additional relations between the quantities  $\hat{\mathbf{L}},\hat{\mathbf{M}}$  ,and  $\hat{H}$  . They are

(vi)  $\hat{M}^2 = \left(\frac{e^2}{4\pi\epsilon_0}\right)^2 +\frac{2}{m}\hat{H}\left(\hat{L}^2 +\hbar^2\right)$
(vii)  $\hat{\mathbf{M}}\cdot \hat{\mathbf{L}} = 0.$

(a) From the result of Problem 6.19, and the fact that  $\hat{\mathbf{M}}$  is a conserved quantity, we know that  $\hat{M}_{+}\psi_{n\ell \ell} = c_{n\ell}\psi_{n(\ell +1)(\ell +1)}$  for some constants  $c_{n\ell}$ . Apply (vii) to the state  $\psi_{n\ell \ell}$  to show that

$$
\hat {M} _ {z} \psi_ {n \ell \ell} = - \frac {1}{\sqrt {2}} \frac {1}{\sqrt {\ell + 1}} c _ {n \ell} \psi_ {n (\ell + 1) \ell}.
$$

(b) Use (vi) to show that

$$
\hat {M} _ {-} \hat {M} _ {+} \psi_ {n \ell \ell} = \left(\frac {e ^ {2}}{4 \pi \epsilon_ {0}}\right) ^ {2} \left[ 1 - \left(\frac {\ell + 1}{n}\right) ^ {2} \right] \psi_ {n \ell \ell} - \hat {M} _ {z} ^ {2} \psi_ {n \ell \ell}.
$$

(c) From your results to parts (a) and (b), obtain the constants  $c_{n\ell}$ . You should find that  $c_{n\ell}$  is nonzero unless  $\ell = n - 1$ . Hint: Consider  $\int |M_{+}\psi_{n\ell m}|^{2}d^{3}\mathbf{r}$  and use the fact that  $M_{\pm}$  are Hermitian conjugates. Figure 6.9 shows how the degenerate states of hydrogen are related by the generators  $\hat{\mathbf{L}}$  and  $\hat{\mathbf{M}}$ .

![img-108.jpeg](img-108.jpeg)
Figure 6.9: The degenerate  $n = 3$  states of the hydrogen atom, and the symmetry operations that connect them.

Problem 6.35 A Galilean transformation performs a boost from a reference frame  $S$  to a reference frame  $S'$  moving with velocity  $v$  with respect to  $S$  (the origins of the two frames coincide at  $t = 0$ ). The unitary operator that carries out a Galilean transformation at time  $t$  is

$$
\hat {\Gamma} (v, t) = \exp \left[ - \frac {i}{\hbar} v (t \hat {p} - m \hat {x}) \right].
$$

(a) Find  $\hat{x}^{\prime} = \hat{\Gamma}^{\dagger}\hat{x}\hat{\Gamma}$  and  $\hat{p}^{\prime} = \hat{\Gamma}^{\dagger}\hat{p}\hat{\Gamma}$  for an infinitesimal transformation with velocity  $\delta$ . What is the physical meaning of your result?
(b) Show that

$$
\begin{array}{l} \hat {\Gamma} (v, t) = \exp \left[ \frac {i}{\hbar} \left(m x v - \frac {1}{2} m v ^ {2} t\right) \right] \hat {T} (v t) \\ = \hat {T} (v t) \exp \left[ \frac {i}{\hbar} \left(m x v + \frac {1}{2} m v ^ {2} t\right) \right]. \\ \end{array}
$$

where  $\hat{\pmb{T}}$  is the spatial translation operator (Equation 6.3). You will need to use the Baker-Campbell-Hausdorff formula (Problem 3.29).

(c) Show that if  $\Psi$  is a solution to the time-dependent Schrödinger equation with Hamiltonian

$$
\hat {H} = \frac {\hat {p} ^ {2}}{2 m} + V (x)
$$

then the boosted wave function  $\psi' = \hat{\Gamma}(v, t) \psi$  is a solution to the time-dependent Schrödinger equation with the potential  $V(x)$  in motion:

$$
\hat {H} = \frac {\hat {p} ^ {2}}{2 m} + V (x - v t).
$$

Note:  $\left(d / dt\right)e^{\hat{A}} = e^{\hat{A}}\left(d\hat{A} /dt\right)$  only if  $\left[\hat{A},\left(d\hat{A} /dt\right)\right] = 0.$

(d) Show that the result of Problem 2.50(a) is an example of this result.

Problem 6.36 A ball thrown through the air leaves your hand at position  $\mathbf{r}_0$  with a velocity of  $\mathbf{v}_0$  and arrives a time  $t$  later at position  $\mathbf{r}_1$  traveling with a velocity  $\mathbf{v}_1$  (Figure 6.10). Suppose we could instantaneously reverse the ball's velocity when it reaches  $\mathbf{r}_1$ . Neglecting air resistance, it would retrace the path that took it from  $\mathbf{r}_0$  to  $\mathbf{r}_1$  and arrive back at  $\mathbf{r}_0$  after another time  $t$  had passed, traveling with a velocity  $-\mathbf{v}_0$ . This is an example of time-reversal invariance —reverse the motion of a particle at any point along its trajectory and it will retrace its path with an equal and opposite velocity at all positions.

![img-109.jpeg](img-109.jpeg)
Figure 6.10: A ball thrown through the air (ignore air resistance) is an example of a system with time-reversal symmetry. If we flip the velocity of the particle at any point along its trajectory, it will retrace its path.

Why is this called time reversal? After all, it was the velocity that was reversed, not time. Well, if we showed you a movie of the ball traveling from  $\mathbf{r}_1$  to  $\mathbf{r}_0$ , there would be no way to tell if you were watching a movie of the ball after the reversal playing forward, or a movie of the ball before the reversal playing backward. In a time-reversal invariant system, playing the movie backwards represents another possible motion.

A familiar example of a system that does not exhibit time-reversal symmetry is a charged particle moving in an external magnetic field.33 In that case, when you reverse the velocity of the particle, the Lorentz force will also change sign and the particle will not retrace its path; this is illustrated in Figure 6.11.

![img-110.jpeg](img-110.jpeg)
Figure 6.11: An external magnetic field breaks time-reversal symmetry. Shown is the trajectory of a particle of charge  $+q$  traveling in a uniform magnetic field pointing into the page. If we flip the particle's velocity from  $\mathbf{v}_1$  to  $-\mathbf{v}_1$  at the point shown, the particle does not retrace its path, but instead moves onto a new circular orbit.

The time-reversal operator  $\hat{\Theta}$  is the operator that reverses the momentum of the particle  $(\mathbf{p} \rightarrow -\mathbf{p})$ , leaving its position unchanged. A better name would really be the "reversal of the direction of motion" operator.[42] For a spinless particle, the time-reversal operator  $\hat{\Theta}$  simply complex conjugates the position-space wave function[46]

$$
\hat {\Theta} \Psi (x, t) = \Psi^ {*} (x, t). \tag {6.82}
$$

(a) Show that the operators  $\hat{x}$  and  $\hat{p}$  transform under time reversal as

$$
\hat {x} ^ {\prime} = \hat {\Theta} ^ {- 1} \hat {x} \hat {\Theta} = \hat {x}
$$

$$
\hat {p} ^ {\prime} = \hat {\Theta} ^ {- 1} \hat {p} \hat {\Theta} = - \hat {p}.
$$

Hint: Do this by calculating the action of  $\hat{\chi}^{\prime}$  and  $\hat{p}^{\prime}$  on an arbitrary test function  $f(x)$ .

(b) We can write down a mathematical statement of time-reversal invariance from our discussion above. We take a system, evolve it for a time  $t$ , reverse its momentum, and evolve it for time  $t$  again. If the system is time-reversal invariant it will be back where it started, albeit with its momentum reversed (Figure 6.10). As an operator statement this says

$$
\hat {U} (t) \hat {\Theta} \hat {U} (t) = \hat {\Theta}.
$$

If this is to hold for any time interval, it must hold in particular for an infinitesimal time interval  $\delta$ . Show that time-reversal invariance requires

$$
\left[ \hat {\Theta}, \hat {H} \right] = 0. \tag {6.83}
$$

(c) Show that, for a time-reversal invariant Hamiltonian, if  $\psi_n(x)$  is a stationary state with energy  $E_{n}$ , then  $\psi_n^*(x)$  is also a stationary state with the same energy  $E_n$ . If the energy is nondegenerate, this means that the stationary state can be chosen as real.
(d) What do you get by time-reversing a momentum eigenfunction  $f_{p}(x)$  (Equation 3.32)? How about a hydrogen wave function  $\psi_{n\ell m}(r,\theta ,\phi)$ ? Comment on each state's relation to the untransformed state and verify that the transformed and untransformed states share the same energy, as guaranteed by (c).

Problem 6.37 As an angular momentum, a particle's spin must flip under time reversal (Problem 6.36). The action of time-reversal on a spinor (Section 4.4.1) is in fact

$$
\hat {\Theta} \left( \begin{array}{l} a \\ b \end{array} \right) = \left( \begin{array}{c} - b ^ {*} \\ a ^ {*} \end{array} \right) \tag {6.84}
$$

so that, in addition to the complex conjugation, the up and down components are interchanged.[47]

(a) Show that  $\hat{\Theta}^2 = -1$  for a spin-1/2 particle.
(b) Consider an eigenstate  $|\psi_n\rangle$  of a time-reversal invariant Hamiltonian (Equation 6.83) with energy  $E_{n}$ . We know that  $|\psi_n^{\prime}\rangle = \hat{\Theta} |\psi_n\rangle$  is also an eigenstate of  $\hat{H}$  with the same energy  $E_{n}$ . There two possibilities: either  $|\psi_n^{\prime}\rangle$  and  $|\psi_n\rangle$  are the same state (meaning  $|\psi_n^{\prime}\rangle = c|\psi_n\rangle$  for some complex constant  $c$ ) or they are distinct states. Show that the first case leads to a contradiction in the case of a spin-1/2 particle, meaning the energy level must be (at least) two-fold degenerate in that case.

Comment: What you have proved is a special case of Kramer's degeneracy: for an odd number of spin-1/2 particles (or any half-integer spin for that matter), every energy level (of a time-reversal-invariant Hamiltonian) is at least two-fold degenerate. This is because—as you just showed—for half-integer spin a state and its time-reversed state are necessarily distinct.[48]

1 A square of course has other symmetries as well, namely mirror symmetries about axes along a diagonal or bisecting two sides. The set of all transformations that leave the square unchanged is called  $D_4$ , the "dihedral group" of degree 4.
2 The parity operation in three dimensions can be realized as a mirror reflection followed by a rotation (see Problem 6.1). In two dimensions, the transformation  $\psi'(x, y) = \psi(-x, -y)$  is no different from a  $180^{\circ}$  rotation. We will use the term parity exclusively for spatial inversion;  $\hat{\Pi}\psi(\mathbf{r}) = \psi(-\mathbf{r})$ , in one or three dimensions.
3 I'm assuming that our function has a Taylor series expansion, but the final result applies more generally. See Problem 6.31 for the details.
4 See Section 3.6.2 for the definition of the exponential of an operator.

351

2. The term comes from the study of *Lie groups* (the group of translations is an example). If you're interested, an introduction to *Lie groups* (written for physicists) can be found in George B. Arfken, Hans J. Weber, and Frank E. Harris, *Mathematical Methods for Physicists*, 7th edn, Academic Press, New York (2013), Section 17.7.

6. Unitary operators are discussed in Problem A.30. A unitary operator is one whose adjoint is also its inverse: $\hat{U}\hat{U}^{\dagger} = \hat{U}^{\dagger}\hat{U} = 1$

7. It is clear that Equation 6.12 satisfies Equation 6.11. In Problem 6.5 you'll prove that they are in fact equivalent statements.

8. For a delightful proof using perturbation theory, see Neil Ashcroft and N. David Mermin, *Solid State Physics*, Cengage, Belmont, 1976 (p. 765), after you have completed Problem 6.6 and studied Chapter 7.

9. For the case of continuous symmetries, it is often much easier to work with the infinitesimal form of the transformation; any finite transformation can then be built up as a product of infinitesimal transformations. In particular, the finite translation by $a$ is a sequence of $N$ infinitesimal translations with $\delta = a / N$ in the limit that $N \to \infty$:

$$
\lim_{N \to \infty} \left(1 - i \frac{a}{N} \frac{1}{h} \hat{p}\right)^N = \exp \left[ - \frac{i a}{h} \hat{p} \right],
$$

For a proof see R. Shankar, *Basic Training in Mathematics: A Fitness Program for Science Students*, Plenum Press, New York, 1995 (p.11).

10. In the case of a discrete translational symmetry, momentum is not conserved, but there is a conserved quantity closely related to the discrete translational symmetry, which is the crystal momentum. For a discussion of crystal momentum see Steven H. Simon, *The Oxford Solid State Basics*, Oxford, 2013, p.84.

11. If the spectrum of $\hat{Q}$ is degenerate (there are distinct eigenvectors with the same eigenvalue $q_{n} \hat{Q} |f_{n}^{(i)}| = q_{n} |f_{n}^{(i)}|$ for $i = 1,2,\ldots$), then we need to sum over those states:

$$
P(q_{n}) = \sum_{i} \left| \left\langle f_{n}^{(i)} \right| \Psi(t) \right|^2,
$$

Except for the sum over $i$ the proof proceeds unchanged.

12. For bound (normalizable) states in one dimension, there is no degeneracy and every bound state of a symmetric potential is automatically an eigenstate of parity. (However, see Problem 2.46.) For scattering states, degeneracy does occur.

13. Note that Equation 6.24 could equivalently be written as $\left[\hat{\Pi},\hat{\mathbf{L}}\right] = \mathbf{0}$. The fact that parity commutes with every component of the angular momentum (and therefore also $\hat{L}^2$) is the reason you can find simultaneous eigenstates of $\hat{L}^2, \hat{L}_z$, and $\hat{\Pi}$.

14. However, it turns out that *ast*/particles of spin $1/2$ have opposite parity. Thus the electron is conventionally assigned parity $+1$, but the positron then has parity $-1$.

15. To go the other way, from infinitesimal to finite, see Problem 6.14.

16. See Section A.5.

17. The Levi-Civita symbol $\epsilon_{ijk}$ is defined in Problem 4.29.

18. Of course, not every operator will fit into one of these categories. Scalar and vector operators are simply the first two instances in a hierarchy of tensor operators. Next come second-rank tensors (the inertia tensor from classical mechanics or the quadrupole tensor from electrodynamics are examples), third-rank tensors, and so forth.

19. This follows from the fact that the radial Schrödinger equation (Equation 4.35) has at most a single normalizable solution so that, once you have specified $\xi$ and $m$, the energy uniquely specifies the state. The principal quantum number $n$ indexes those energy values that lead to normalizable solutions.

20. When we can't identify the symmetry responsible for a particular degeneracy, we call it an accidental degeneracy. In most such cases, the degeneracy turns out to be no accident at all, but instead due to symmetry that is more difficult to identify than, say, rotational invariance. The canonical example is the larger symmetry group of the hydrogen atom (Problem 6.34).

21. This is highly non-classical. In classical mechanics, if you take a Keplerian orbit there will always be some axis about which you can rotate it to get a different Keplerian orbit (of the same energy) and in fact there will be an infinite number of such orbits with different orientations. In quantum mechanics, if you rotate the ground state of hydrogen you get back exactly the same state regardless of which axis you choose, and if you rotate one of the states with $n = 2$ and $\varepsilon = 1$, you get back a linear combination of the three orthogonal states with these quantum numbers.

22. Of course, we already know the energies are equal since the radial equation, Equation 4.35, does not depend on $m$. This example demonstrates that rotational invariance is behind the degeneracy.

23. I don't mean that they necessarily occur in this order. Look back at the infinite spherical well (Figure 4.3): starting with the ground state the degeneracies are $1, 3, 5, 1, 7, 3, 9, 5, \ldots$. These are precisely the degrees of degeneracy we expect for rotational invariance ($2\varepsilon + 1$ for integer $\varepsilon$) but the symmetry considerations don't tell us where in the spectrum each degeneracy will occur.

24. For the three-dimensional harmonic oscillator the degeneracy is $\pi (\pi + 1) / 2 = 1, 3, 6, 10, \ldots$ (Problem 4.46) which again is greater than $2\varepsilon + 1$. For a discussion of the additional symmetry in the oscillator problem see D. M. Fradkin, *Am. J. Phys.* 33, 207 (1965).

25. Importantly, they satisfy Equations 4.118 and 4.120.

26. The other root of the quadratic $\varepsilon'(\varepsilon' + 1) - \varepsilon(\varepsilon + 1) = 0$ is $\varepsilon' = -(\varepsilon + 1)$; since $\varepsilon$ and $\varepsilon'$ are non-negative integers this isn't possible.

352

22 Since $\hat{L}_x$ and $\hat{L}_y$ are Hermitian,

$$
\hat{L}_{\pm}^{\dagger} = \left(\hat{L}_x \pm i \hat{L}_y\right)^{\dagger} = \hat{L}_x^{\dagger} \pm (-i) \hat{L}_y^{\dagger} = \hat{L}_x \mp i \hat{L}_y = \hat{L}_{\mp}.
$$

23 The operators $\hat{V}_{\pm}$ are, up to constants, components of what are known as spherical tensor operators of rank 1, written $\hat{T}_q^{(k)}$ where $k$ is the rank and $q$ the component of the operator:

$$
\hat{T}_{\pm 1}^{(1)} = \mp \frac{1}{\sqrt{2}} \hat{V}_{\pm} \quad \hat{T}_0^{(1)} = \hat{V}_z.
$$

Similarly, the scalar operator $f$ treated in Section 6.7.1 is a rank-0 spherical tensor operator:

$$
\hat{T}_0^{(0)} = \hat{f}.
$$

23 Equations 6.51–6.54 each stand for two equations: read the upper signs all the way across, or the lower signs.

20 A warning about notation: In the selection rules for the scalar operator $r$,

$$
\left\langle n' \ell' m' \right| r | n \ell m \rangle = \delta_{\ell \ell'} \delta_{mm'} \left\langle n' \ell' \| r \| n \ell \right\rangle,
$$

and for a component (say $z$) of the vector operator $\mathbf{r}$,

$$
\left\langle n' \ell' m' \right| z | n \ell m \rangle = C_{m \Theta m'}^{\ell 1 \ell'} \left\langle n' \ell' \| r \| n \ell \right\rangle,
$$

the two reduced matrix elements are not the same. One is the reduced matrix element for $r$ and one is the reduced matrix element for $\mathbf{r}$, and these are different operators that share the same name. You could tack on a subscript $\left(\left\langle n' \ell' \| r \| n \ell \right\rangle_k \text{ and } \left\langle n' \ell' \| r \| n \ell \right\rangle_k\right)$ to distinguish between the two if that helps keep them straight.

21 In the case of the position operator $\hat{\pmb{r}}$, this correspondence is particularly evident when we rewrite the operator with the help of Table 4.3:

$$
\begin{array}{l}
x \pm i y = r \sin \theta e^{\pm i \phi} = \mp r \sqrt{\frac{8 \pi}{3}} Y_1^{\pm 1} (\theta, \phi) \\
z = r \cos \theta = r \sqrt{\frac{4 \pi}{3}} Y_1^0 (\theta, \phi).
\end{array}
$$

22 Since $C_{m\Theta m'}^{\ell 0\ell'} = \delta_{mm'} \delta_{\ell \ell'}$, one could rewrite the selection rules for a scalar operator (Equation 6.47) as

$$
\left\langle n' \ell' m' \| f \| n \ell m \right\rangle = C_{m \Theta m'}^{\ell 0 \ell'} \left\langle n' \ell' \| f \| n \ell \right\rangle.
$$

23 Why is this analysis limited to the case where $\hat{H}$ is independent of time? Whether or not $\hat{H}$ depends on time, Schrödinger's equation says $i\hbar \dot{\Psi} = \hat{H}\Psi$. However, if $\hat{H}$ is time dependent then the second derivative of $\hat{\Psi}$ is given by

$$
\frac{\partial^2}{\partial t^2} \Psi = \frac{\partial}{\partial t} \left(\frac{1}{i\hbar} \hat{H} \Psi\right) = \frac{1}{i\hbar} \frac{\partial \hat{H}}{\partial t} \Psi - \frac{1}{\hbar^2} \hat{H}^2 \Psi
$$

and higher derivatives will be even more complicated. Therefore, Equation 6.69 only follows from Equation 6.68 when $\hat{H}$ has no time dependence. See also Problem 11.23.

24 This derivation assumes that the actual solution to Schrödinger's equation, $\Psi(x,t)$, can be expanded as a Taylor series in $t$, and nothing guarantees that. B. R. Holstein and A. R. Swift, *A. J. Phys.* 40, 829 (1989) give an innocent-seeming example where such an expansion does not exist. Nonetheless, Equation 6.71 still holds in such cases as long as we define the exponential function through its spectral decomposition (Equation 3.103):

$$
\hat{U}(t) = \sum_n e^{-i E_n t / \hbar} |\psi_n\rangle \langle \psi_n|. \tag{6.70}
$$

See also M. Amaku et al., *Am. J. Phys.* 85, 692 (2017).

25 Since Equation 6.73 holds for any stationary state $\psi_n$ and since the $\psi_n$ constitute a complete set of states, the operators must in fact be identical.

26 I am assuming that $\hat{Q}$, like $\hat{x}$ or $\hat{p}$, has no explicit time dependence.

27 Of these other possible pictures the most important is the interaction picture (or Dirac picture) which is often employed in time-dependent perturbation theory.

353

20 And is a function of *both* the initial time $\underline{\mathbf{t}}\underline{\mathbf{0}}$ and the final time $t$, not simply the amount of time for which the wave function has evolved.

22 For time-dependent $\hat{\underline{Q}}$ and $\hat{\underline{H}}$ the generalization is

$$
i \hbar \frac {d}{d t} \hat {Q} _ {H} (t) = \left[ \hat {Q} _ {H} (t), \hat {H} _ {H} (t) \right] + \hat {U} ^ {\dagger} \frac {\partial \hat {Q}}{\partial t} \hat {U}.
$$

40 The integrals in (c)-(e) can all be done with the following identity:

$$
\int_ {- \infty} ^ {\infty} e ^ {- a x ^ {2} + b x} d x = \sqrt {\frac {\pi}{a}} e ^ {b ^ {2} / 4 a},
$$

which was derived in Problem 2.21.

41 For a discussion of how this sign change is actually *measured*, see S. A. Werner et al., *Phys. Rev. Lett.* 35, 1053 (1975).

42 See F. Leyvraz, et al., *Am. J. Phys.* 65, 1087 (1997) for a discussion of this “accidental” degeneracy.

43 The full symmetry of the Coulomb Hamiltonian is not just the obvious three-dimensional rotation group (known to mathematicians as SO(3)), but the four-dimensional rotation group (SO(4)), which has six generators $(\mathbf{L}$ and $\mathbf{M})$. (If the four axes are $\omega, x, y,$ and $z$, the generators correspond to rotations in each of the six orthogonal planes, $\omega x, \omega y, \omega z$ (that’s $\mathbf{M}$) and $yz, zx, xy$ (that’s $\mathbf{L}$).

44 By external magnetic field, I mean that we we only reverse the velocity of our charge $q$, and not the velocities of the charges producing the magnetic field. If we reversed those velocities as well, the magnetic field would also switch directions, the Lorentz force on the charge $q$ would be unchanged by the reversal, and the system would in fact be time-reversal invariant.

45 See Eugene P. Wigner, *Group Theory and its Applications to Quantum Mechanics and Atomic Spectra* (Academic Press, New York, 1959), p. 325.

46 Time reversal is an **anti-unitary operator**. An anti-unitary operator satisfies

$$
\langle \Theta f | \Theta g \rangle = \langle f | g \rangle^ {*}
$$

$$
\hat {\Theta} (a | \alpha) + b | \beta) = a ^ {*} \hat {\Theta} | \alpha) + b ^ {*} \hat {\Theta} | \beta)
$$

whereas a unitary operator satisfies the same two equations without the complex conjugates. I won’t define the adjoint of an anti-unitary operator; instead I use $\hat{\underline{\Theta}}^{-1}$ for an anti-unitary operator where we might have used $\hat{U}^{\dagger}$ or $\hat{U}^{-1}$ interchangeably for a unitary operator.

47 For arbitrary spin,

$$
\hat {\Theta} = e ^ {- i \pi \hat {S} _ {y} / \hbar} \hat {\mathcal {K}} \tag {6.85}
$$

where the first term is a rotation by $\pi$ about the $y$ axis and $\hat{\mathcal{K}}$ is the operator that performs the complex conjugation.

48 What about in the case of a spin-0 particle—does time-reversal symmetry tell us anything interesting? Actually it does. For one thing, the stationary states can be chosen as real; you proved this back in Problem 2.2 but we now see that it is a consequence of time-reversal symmetry. Another example is the degeneracy of the energy levels in a periodical potential (Section 5.3.2 and Problem 6.6) for states with crystal momentum $q$ and $-\vec{q}$. This can be ascribed to inversion symmetry if the potential is symmetric, but the degeneracy persists even when inversion symmetry is absent (try it out!); that is a result of time-reversal symmetry.
