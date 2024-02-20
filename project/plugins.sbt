addSbtPlugin("org.scalameta"         % "sbt-scalafmt"               % "2.5.0")
addSbtPlugin("de.heikoseeberger"     % "sbt-header"                 % "5.9.0")
addSbtPlugin("com.github.sbt"        % "sbt-release"                % "1.1.0")
addSbtPlugin("com.typesafe.sbt"      % "sbt-ghpages"                % "0.6.3")
addSbtPlugin("com.typesafe.sbt"      % "sbt-site"                   % "1.3.3")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox"                % "0.6.8")
addSbtPlugin("com.github.sbt"        % "sbt-paradox-material-theme" % "0.7.0")
addSbtPlugin("com.github.sbt"        % "sbt-ci-release"             % "1.5.10")

unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "scala"
