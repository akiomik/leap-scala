package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Gesture, KeyTapGesture }

object StaticKeyTapGesture extends StaticKeyTapGesture

trait StaticKeyTapGesture {
  def classType: Gesture.Type = KeyTapGesture.classType
}

