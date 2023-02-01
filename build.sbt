lazy val root = (project in file("."))
  .settings(
    scalaVersion                     := "3.2.1",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "3.4.5",
      "org.scalameta" %% "munit" % "1.0.0-M7"
    ),
  )