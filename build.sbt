name in ThisBuild := "Bugreport"
scalaVersion in ThisBuild := "2.12.3"

lazy val shared = (crossProject.crossType(CrossType.Pure) in file("shared"))
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.play" %%% "play-json" % "2.6.5"
    )
  )

lazy val sharedJVM = shared.jvm.settings(name := "sharedJVM")
lazy val sharedJS = shared.js.settings(name := "sharedJS")
