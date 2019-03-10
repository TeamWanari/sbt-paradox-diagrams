package com.wanari.paradox.diagrams

import java.util.UUID

import com.lightbend.paradox.markdown.ContainerBlockDirective
import org.pegdown.Printer
import org.pegdown.ast.{DirectiveNode, Visitor}

class MermaidDiagramDirective
    extends ContainerBlockDirective("mermaid-diagram") {
  override def render(node: DirectiveNode,
                      visitor: Visitor,
                      printer: Printer): Unit = {

    val id = s"diagram-${UUID.randomUUID.toString.take(8)}"

    printer.println()
    renderScriptTags(printer)
    printer.println()
    printer
      .print("""<script>mermaid.initialize({startOnLoad:true});</script>""")
      .println()
    printer
      .print(s"""<div class="mermaid" id="$id">""")
      .indent(2)
    node.contentsNode.accept(visitor)
    printer
      .indent(-2)
      .print("</div>")

    printer.println()
  }

  def renderScriptTags(printer: Printer) = {
    printer
      .print(
        """<script src="https://unpkg.com/mermaid@8.0.0/dist/mermaid.min.js"></script>""")
      .println
  }

}
