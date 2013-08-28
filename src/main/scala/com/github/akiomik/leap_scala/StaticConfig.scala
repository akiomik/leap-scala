package com.github.akiomik.leap_scala

import com.leapmotion.leap.Config

object StaticConfig extends StaticConfig

trait StaticConfig {
  type ValueType = Config.ValueType

  val ValueType = StaticValueType
}

