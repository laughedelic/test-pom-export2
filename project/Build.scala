package org.laughedelic.sbt

import sbt._
import sbt.Keys._
import sbtdynver.DynVerPlugin.autoImport.dynverSeparator
import scalafix.sbt.ScalafixPlugin
import scalafix.sbt.ScalafixPlugin.autoImport._

object SubProject extends AutoPlugin {

  override def trigger = allRequirements

  override def requires = ScalafixPlugin

  override def buildSettings: Seq[Setting[_]] =
    Seq(
      organization := "laughedelic",
      dynverSeparator := "-",
      semanticdbEnabled := true, // enable SemanticDB
      semanticdbVersion := scalafixSemanticdb.revision, // use Scalafix compatible version
      scalafixDependencies ++= Seq(
        "com.github.vovapolu" %% "scaluzzi" % "0.1.17",
        "com.eed3si9n.fix" %% "scalafix-noinfer" % "0.1.0-M1",
      ),
    )

}
