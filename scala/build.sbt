lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.jamesmcguigan",
      scalaVersion := "2.12.7"
    )),
    name := "scala",
    mainClass in (Compile, run) := Some("module_1.CubeCalculator")
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
