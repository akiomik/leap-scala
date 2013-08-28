package com.github.akiomik.leap_scala

import com.leapmotion.leap.Pointable

object StaticPointable extends StaticPointable

trait StaticPointable {
  type Zone = Pointable.Zone

  val Zone = StaticZone

  def invalid: Pointable = Pointable.invalid
}

