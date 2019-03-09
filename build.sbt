name := "sbt-paradox-diagrams"
organization := "com.wanari"
organizationName := "Wanari Ltd."

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.8"

enablePlugins(SbtPlugin)

addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.5.1")

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))

scalafmtOnCompile := true
