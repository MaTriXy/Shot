package com.karumi.shot.domain

import org.scalatest.{FlatSpec, Matchers}

class ConfigSpec extends FlatSpec with Matchers {

  "Config" should "use the screenshot tests library implemented by Facebook" in {
    Config.androidDependency shouldBe "com.facebook.testing.screenshot:core:0.4.2"
  }

  it should "add the dependency using the androidTestCompile mode" in {
    Config.androidDependencyModeLegacy shouldBe "androidTestCompile"
  }

  it should "add the dependency using the androidTestImplementation mode" in {
    Config.androidDependencyMode shouldBe "androidTestImplementation"
  }

  it should "save the screenshots into the screenshots folder" in {
    Config.screenshotsFolderName shouldBe "/screenshots/"
  }

  it should "point at the temporal screenshots folder" in {
    Config.pulledScreenshotsFolder shouldBe "/screenshots/screenshots-default/"
  }

  it should "point at the metadata folder" in {
    Config.metadataFileName shouldBe "/screenshots/screenshots-default/metadata.xml"
  }

  it should "point at the tmp folder" in {
    Config.screenshotsTemporalRootPath shouldBe "/tmp/shot/screenshot/"
  }

}
