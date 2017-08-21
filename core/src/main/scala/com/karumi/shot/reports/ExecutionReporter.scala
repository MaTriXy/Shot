package com.karumi.shot.reports

import java.io.{File, FileWriter}

import com.karumi.shot.domain.ScreenshotsComparisionResult
import com.karumi.shot.domain.model.ScreenshotsSuite
import freemarker.template.{Configuration, TemplateExceptionHandler}

class ExecutionReporter {

  private val freeMarkerConfig: Configuration = {
    val config = new Configuration(Configuration.VERSION_2_3_23)
    config.setClassForTemplateLoading(getClass, "/templates/")
    config.setDefaultEncoding("UTF-8")
    config.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER)
    config
  }

  def generateReport(screenshots: ScreenshotsSuite, comparision: ScreenshotsComparisionResult) = {
    val input: Map[String, Object] = Map("title" -> "asdfasdfasdf")
    val template = freeMarkerConfig.getTemplate("index.ftl")
    val writer = new FileWriter(new File("index.html"))
    template.process(input, writer)
    writer.close()
  }
}
