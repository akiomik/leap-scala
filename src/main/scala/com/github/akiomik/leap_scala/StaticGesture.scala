package com.github.akiomik.leap_scala

import com.leapmotion.leap.Gesture

object StaticGesture extends StaticGesture

trait StaticGesture {
  type Type  = Gesture.Type
  type State = Gesture.State

  val Type  = StaticType
  val State = StaticState

  def invalid: Gesture = Gesture.invalid
}

