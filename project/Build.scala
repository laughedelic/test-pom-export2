package org.laughedelic.sbt

import sbt._
import sbt.Keys._
// import sbtdynver.DynVerPlugin.autoImport.dynverSeparator
// import scalafix.sbt.ScalafixPlugin
// import scalafix.sbt.ScalafixPlugin.autoImport._

object SubProject extends AutoPlugin {

  override def trigger = allRequirements

  // override def requires = ScalafixPlugin

  val repo = "https://github.com/laughedelic/test-pom-export"

  override def buildSettings: Seq[Setting[_]] = Seq(
    organization := "laughedelic",
    publishMavenStyle := true,
    scmInfo := Option(ScmInfo(url(repo), s"$repo.git")),
    homepage := Option(url(repo)),
  )

}
