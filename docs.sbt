enablePlugins(ParadoxMaterialThemePlugin, ParadoxSitePlugin, GhpagesPlugin)

sourceDirectory in Paradox := baseDirectory.value / "docs"

ParadoxMaterialThemePlugin.paradoxMaterialThemeSettings(Paradox)

paradoxProperties += ("version" -> version.value)

mappings in makeSite ++= Seq(
  file("LICENSE") -> "LICENSE"
)

paradoxMaterialTheme in Paradox := {
  ParadoxMaterialTheme()
    .withColor("light-green", "light-green")
    .withCopyright("© sbt-paradox-diagrams contributors")
    .withRepository(uri("https://github.com/TeamWanari/sbt-paradox-diagrams"))
    .withFont("Source Sans Pro", "Iosevka")
    .withLogoIcon("multiline_chart")
}

git.remoteRepo := "git@github.com:TeamWanari/sbt-paradox-diagrams.git"