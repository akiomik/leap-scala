package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ CircleGesture, Gesture }

object StaticCircleGesture extends StaticCircleGesture

trait StaticCircleGesture {
  def classType: Gesture.Type = CircleGesture.classType
}

