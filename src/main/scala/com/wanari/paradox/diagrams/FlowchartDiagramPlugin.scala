package com.wanari.paradox.diagrams

import com.lightbend.paradox.markdown.Writer
import com.lightbend.paradox.sbt.ParadoxPlugin
import com.lightbend.paradox.sbt.ParadoxPlugin.autoImport.paradoxDirectives
import sbt.PluginTrigger.AllRequirements
import sbt._

object FlowchartDiagramPlugin extends AutoPlugin {

  override def requires: Plugins = ParadoxPlugin

  override def trigger: PluginTrigger = AllRequirements

  override def projectSettings: Seq[Setting[_]] =
    flowchartDiagramParadoxSettings(Compile)

  def flowchartDiagramParadoxGlobalSettings: Seq[Setting[_]] = Seq(
    paradoxDirectives ++= Def.taskDyn {
      Def.task {
        Seq(
          { _: Writer.Context ⇒
            new FlowchartDiagramDirective()
          }
        )
      }
    }.value
  )

  def flowchartDiagramParadoxSettings(config: Configuration): Seq[Setting[_]] =
    flowchartDiagramParadoxGlobalSettings ++ inConfig(config)(
      Seq(
        // scoped settings here
      ))
}
