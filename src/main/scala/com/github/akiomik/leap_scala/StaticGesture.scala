package com.github.akiomik.leap_scala

import com.leapmotion.leap.Gesture

object StaticGesture extends StaticGesture

trait StaticGesture {
  def invalid: Gesture = Gesture.invalid
}

