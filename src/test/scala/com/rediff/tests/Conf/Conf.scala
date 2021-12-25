package com.rediff.tests.Conf

import com.typesafe.config.ConfigFactory


object Conf {

  protected val configName = Option(System.getProperty("test.conf")).getOrElse("test")

  lazy protected val conf = ConfigFactory.load(configName)

  lazy val host = conf.getString("rediff-tests.host")


}
