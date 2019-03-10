name := "sbt-paradox-diagrams"
organization := "com.wanari"
organizationName := "Wanari Ltd."

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.8"

enablePlugins(SbtPlugin)

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.5.1")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalafmtOnCompile := true

publishM2 := {
  publishM2.value

  val d = file(sys.env("HOME")) / s".m2/repository/com/wanari/sbt-paradox-diagrams_${scalaBinaryVersion.value}_${sbtBinaryVersion.value}"
  d.renameTo(file(sys.env("HOME")) / ".m2/repository/com/wanari/sbt-paradox-diagrams")
}

sbtPlugin := true
publishMavenStyle := true

import scala.collection.JavaConverters._
scriptedLaunchOpts += ("-Dproject.version=" + version.value)
scriptedLaunchOpts ++= java.lang.management.ManagementFactory.getRuntimeMXBean.getInputArguments.asScala.filter(
  a => Seq("-Xmx", "-Xms", "-XX", "-Dfile").exists(a.startsWith)
)