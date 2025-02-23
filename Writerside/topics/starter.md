# 메인 페이지

<!--Writerside adds this topic when you create a new documentation project.
You can use it as a sandbox to play with Writerside features, and remove it from the TOC when you don't need it anymore.-->



<procedure id="example-procedure">
Click <control>OK</control>

<format style="bold" color="#654321">Hello, world!</format>
</procedure>
<procedure title="Add something" id="procedure-id">
   <p>Before adding something, create it.</p>
   <step>Do this.</step>
   <step>Do that.</step>
   <p>Congratulation! You've added something.</p>
</procedure>

<procedure>
<step>Download</step>
<resource src="./Tutorial.md"/> and open it.
</procedure>

<code-block lang="tex">
    \begin{equation}
    x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a}
    \end{equation}
</code-block>

Pythagorean theorem: <math>x^2 + y^2 = z^2</math>

# Labels

<primary-label ref="label"/>
<secondary-label ref="wip"/>
<secondary-label ref="beta"/>
<primary-label ref="jetbrains"/>
<secondary-label ref="2023.3"/>
<secondary-label ref="experimental"/>
<procedure>
<step>
</step>
This is a labeled topic about some Beta version of an unfinished feature.

</procedure>

<snippet id="connect-to-db">
    <procedure title="Connect to database">
        <title instance="web">Connect to database in web application</title>
        <title instance="mob">Connect to database in mobile application</title>
        <title filter="mysql">Connection to MySQL</title>
        <title filter="postgres">Connection to PostgreSQL</title>
        <step>...</step>
    </procedure>
</snippet>

# Some chapter

<primary-label ref="jetbrains"/>
<secondary-label ref="2023.3"/>
<secondary-label ref="experimental"/>

This chapter is marked with the JetBrains label,
applies to version 2023.3, and describes something experimental.




<tldr>
    <p>Shortcut: <shortcut>Ctrl+Space</shortcut></p>
    <p>Configure: <ui-path>Settings / Preferences | Editor | Code Completion</ui-path></p>
</tldr>

Send an <tooltip term="HTTP">HTTP</tooltip> request.
<a href="Troubleshooting.md">Link text</a>

<tabs group="os">
    <tab id="windows-instal" title="kotlin"  group-key="탭1">
<code-block lang="kotlin"> 
 class Person(val name: String) {
        val children: MutableList&lt;Person&gt; = mutableListOf()
        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    } 
</code-block>
</tab>
    <tab id="macos-instal" title="kotlin" group-key="탭2">
<code-block lang="kotlin"> 
 class Person(val name: String) {
        val children: MutableList&lt;Person&gt; = mutableListOf()
        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    } 
</code-block>
    </tab>
    <tab id="linux-instal" title="탭3" group-key="탭3">
        How to install on Linux.
    </tab>
</tabs>

<tabs group="os">
    <tab id="windows-install" title="java" group-key="탭1">
        <code-block lang="java">
    class MyClass {
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
    }
</code-block>
    </tab>
    <tab id="macos-install" title="java" group-key="탭2">
        <code-block lang="java">
    class AnyClass {
        public static void main(String[] args) {
            System.out.println("Hello, World");
        }
    }
</code-block>
    </tab>
    <tab id="linux-install" title="탭3" group-key="탭3">
        How to install on Linux.
    </tab>
</tabs>

<procedure title="Some procedure" id="some_procedure" >
<code-block lang="kotlin" collapsible="true" collapsed-title="Person.kt">
    class Person(val name: String) {
        val children: MutableList<Person> = mutableListOf()

        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    }

</code-block>
<code-block lang="kotlin" collapsible="true" collapsed-title="Person.kt">
    class Person(val name: String) {
        val children: MutableList<Person> = mutableListOf()

        constructor(name: String, parent: Person) : this(name) {
            parent.children.add(this)
        }
    }

</code-block>
</procedure>
## Add new topics
You can create empty topics, or choose a template for different types of content that contains some boilerplate structure to help you get started:

![Create new topic options](new_topic_options.png){ width=290 }{border-effect=line}

## Write content

%product% supports two types of markup: Markdown and XML.
When you create a new help article, you can choose between two topic types, but this doesn't mean you have to stick to a
single format.
You can author content in Markdown and extend it with semantic attributes or inject entire XML elements.

## Inject XML

For example, this is how you inject a procedure:

<procedure title="Inject a procedure" id="inject-a-procedure">
    <step>
        <p>Start typing and select a procedure type from the completion suggestions:</p>
        <img src="completion_procedure.png" alt="completion suggestions for procedure" border-effect="line"/>
    </step>
    <step>
        <p>Press <shortcut>Tab</shortcut> or <shortcut>Enter</shortcut> to insert the markup.</p>
    </step>
</procedure>

## Add interactive elements

### Tabs

To add switchable content, you can make use of tabs (inject them by starting to type `tab` on a new line):

<tabs>
    <tab title="Markdown">
        <code-block lang="plain text">![Alt Text](new_topic_options.png){ width=450 }</code-block>
    </tab>
    <tab title="Semantic markup">
        <code-block lang="xml">
            <![CDATA[<img src="new_topic_options.png" alt="Alt text" width="450px"/>]]></code-block>
    </tab>
</tabs>

### Collapsible blocks

Apart from injecting entire XML elements, you can use attributes to configure the behavior of certain elements.
For example, you can collapse a chapter that contains non-essential information:

#### Supplementary info {collapsible="true"}

Content under a collapsible header will be collapsed by default,
but you can modify the behavior by adding the following attribute:
`default-state="expanded"`

### Convert selection to XML

If you need to extend an element with more functions, you can convert selected content from Markdown to semantic markup.
For example, if you want to merge cells in a table, it's much easier to convert it to XML than do this in Markdown.
Position the caret anywhere in the table and press <shortcut>Alt+Enter</shortcut>:

<img src="convert_table_to_xml.png" alt="Convert table to XML" width="706" border-effect="line"/>

## Feedback and support

Please report any issues, usability improvements, or feature requests to our
<a href="https://youtrack.jetbrains.com/newIssue?project=WRS">YouTrack project</a>
(you will need to register).

You are welcome to join our
<a href="https://jb.gg/WRS_Slack">public Slack workspace</a>.
Before you do, please read our [Code of conduct](https://www.jetbrains.com/help/writerside/writerside-code-of-conduct.html).
We assume that you’ve read and acknowledged it before joining.

You can also always email us at [writerside@jetbrains.com](mailto:writerside@jetbrains.com).

<seealso>
    <category ref="wrs">
        <a href="https://www.jetbrains.com/help/writerside/markup-reference.html">Markup reference</a>
        <a href="https://www.jetbrains.com/help/writerside/manage-table-of-contents.html">Reorder topics in the TOC</a>
        <a href="https://www.jetbrains.com/help/writerside/local-build.html">Build and publish</a>
        <a href="https://www.jetbrains.com/help/writerside/configure-search.html">Configure Search</a>
    </category>
</seealso>
