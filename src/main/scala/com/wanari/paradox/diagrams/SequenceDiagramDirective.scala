package com.wanari.paradox.diagrams

import java.util.UUID

import com.lightbend.paradox.markdown.ContainerBlockDirective
import org.pegdown.Printer
import org.pegdown.ast.{DirectiveNode, Visitor}

class SequenceDiagramDirective extends ContainerBlockDirective("seqence-diagram") {
  override def render(node: DirectiveNode, visitor: Visitor, printer: Printer): Unit = {

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
      .print(s"""var diagram = Diagram.parse(`""")
    node.contentsNode.accept(visitor)
    printer
      .print("""`);""")
      .println()
      .print(s"""diagram.drawSVG("$id", {theme: 'simple'});""")
      .indent(-2)
      .println()
      .print("</script>")

    printer.println()
  }

  def renderScriptTags(printer: Printer) = {
    printer
      .print("""<script src="https://bramp.github.io/js-sequence-diagrams/js/webfont.js"></script>""")
      .println
    printer
      .print("""<script src="https://bramp.github.io/js-sequence-diagrams/js/snap.svg-min.js"></script>""")
      .println
    printer
      .print("""<script src="https://bramp.github.io/js-sequence-diagrams/js/underscore-min.js"></script>""")
      .println
    printer
      .print("""<script src="https://bramp.github.io/js-sequence-diagrams/js/sequence-diagram-min.js"></script>""")
      .println
  }

}
