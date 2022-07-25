lazy val root = project
  .in(file("."))
  .settings(
    makePom / artifactPath := baseDirectory.value / "pom.xml",
    libraryDependencies ++= Seq(
      "com.github.scopt" %% "scopt" % "4.0.0",
      "com.github.pathikrit" %% "better-files" % "3.8.0",
      "eu.timepit" %% "refined" % "0.10.1",
      "com.google.code.gson" % "gson" % "2.8.8",
    ),
  )
