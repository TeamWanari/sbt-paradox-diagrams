package com.wanari.paradox.diagrams

import java.util.UUID

import com.lightbend.paradox.markdown.ContainerBlockDirective
import org.pegdown.Printer
import org.pegdown.ast.{DirectiveNode, Visitor}

class FlowchartDiagramDirective
    extends ContainerBlockDirective("flowchart-diagram") {
  override def render(node: DirectiveNode,
                      visitor: Visitor,
                      printer: Printer): Unit = {

    val id = s"diagram-${UUID.randomUUID.toString.take(8)}"

    printer.println()
    renderScriptTags(printer)
    printer.println()
    printer
      .print(s"""<div id="$id"></div>""")
      .println()
      .print("<script>")
      .indent(2)
      .println()
      .print(s"""var diagram = flowchart.parse(`""")
    node.contentsNode.accept(visitor)
    printer
      .print("""`);""")
      .println()
      .print(s"""diagram.drawSVG("$id");""")
      .indent(-2)
      .println()
      .print("</script>")

    printer.println()
  }

  def renderScriptTags(printer: Printer) = {
    printer
      .print(
        """<script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>""")
      .println
    printer
      .print(
        """<script src="https://flowchart.js.org/flowchart-latest.js"></script>""")
      .println
  }

}
