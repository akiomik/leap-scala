package com.github.akiomik.leap_scala

import com.leapmotion.leap.Pointable

object StaticPointable extends StaticPointable

trait StaticPointable {
  def invalid: Pointable = Pointable.invalid
}

