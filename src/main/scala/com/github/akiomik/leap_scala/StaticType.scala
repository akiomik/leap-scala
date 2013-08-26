package com.github.akiomik.leap_scala

import com.leapmotion.leap.Gesture.Type

object StaticType extends StaticType

trait StaticType {
  val Circle    = Type.TYPE_CIRCLE
  val Invalid   = Type.TYPE_INVALID
  val KeyTap    = Type.TYPE_KEY_TAP
  val ScreenTap = Type.TYPE_SCREEN_TAP
  val Swipe     = Type.TYPE_SWIPE
}

