ThisBuild / version      := "0.0.1"
ThisBuild / organization := "amillert"
ThisBuild / scalaVersion := "2.13.5"

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core"   % "2.6.1",
      "org.typelevel" %% "cats-effect" % "3.2.9"
    )
  )
