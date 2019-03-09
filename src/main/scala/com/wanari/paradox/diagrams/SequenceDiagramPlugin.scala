package com.wanari.paradox.diagrams

import com.lightbend.paradox.markdown.Writer
import com.lightbend.paradox.sbt.ParadoxPlugin
import com.lightbend.paradox.sbt.ParadoxPlugin.autoImport.paradoxDirectives
import sbt.PluginTrigger.AllRequirements
import sbt._

object SequenceDiagramPlugin extends AutoPlugin {

  override def requires: Plugins = ParadoxPlugin

  override def trigger: PluginTrigger = AllRequirements

  override def projectSettings: Seq[Setting[_]] =
    sequenceDiagramParadoxSettings(Compile)

  def sequenceDiagramParadoxGlobalSettings: Seq[Setting[_]] = Seq(
    paradoxDirectives ++= Def.taskDyn {
      Def.task {
        Seq(
          { _: Writer.Context ⇒
            new SequenceDiagramDirective()
          }
        )
      }
    }.value
  )

  def sequenceDiagramParadoxSettings(config: Configuration): Seq[Setting[_]] =
    sequenceDiagramParadoxGlobalSettings ++ inConfig(config)(
      Seq(
        // scoped settings here
      ))
}
