import scala.io.Source

enablePlugins(ParadoxPlugin)
paradoxTheme := None

TaskKey[Unit]("check") := {
  val reference = Source.fromFile("expected/index.html").getLines.mkString("\n").trim
  val out = Source.fromFile("target/paradox/site/main/index.html").getLines.mkString("\n").trim
  val modifiedOut = out.replaceAll("diagram-[0-9a-z]{8}", "diagram-xxxxxxxx")
  if (modifiedOut != reference) {
    sys.error("unexpected output:\n" + modifiedOut + "\n\n" + (modifiedOut diff reference) + "\n\n" + (reference diff modifiedOut))
  }
  ()
}

