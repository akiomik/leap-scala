package com.github.akiomik.leap_scala

import com.leapmotion.leap.Finger

object StaticFinger extends StaticFinger

trait StaticFinger {
  def invalid: Finger = Finger.invalid
}

