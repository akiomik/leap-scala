package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Gesture, ScreenTapGesture }

object StaticScreenTapGesture extends StaticScreenTapGesture

trait StaticScreenTapGesture {
  def classType: Gesture.Type = ScreenTapGesture.classType
}

