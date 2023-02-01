lazy val root = (project in file("."))
  .settings(
    scalaVersion                     := "3.2.1",
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0-M7"
    ),
  )