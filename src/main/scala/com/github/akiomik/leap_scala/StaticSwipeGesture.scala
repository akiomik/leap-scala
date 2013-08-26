package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Gesture, SwipeGesture }

object StaticSwipeGesture extends StaticSwipeGesture

trait StaticSwipeGesture {
  def classType: Gesture.Type = SwipeGesture.classType
}

