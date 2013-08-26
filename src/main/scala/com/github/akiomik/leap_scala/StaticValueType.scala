package com.github.akiomik.leap_scala

import com.leapmotion.leap.Config.ValueType

object StaticValueType extends StaticValueType

trait StaticValueType {
  val Boolean = ValueType.TYPE_BOOLEAN
  val Float   = ValueType.TYPE_FLOAT
  val Int32   = ValueType.TYPE_INT32
  val String  = ValueType.TYPE_STRING
  val Unknown = ValueType.TYPE_UNKNOWN
}

