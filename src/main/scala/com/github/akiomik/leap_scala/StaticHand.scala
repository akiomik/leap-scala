package com.github.akiomik.leap_scala

import com.leapmotion.leap.Hand

object StaticHand extends StaticHand

trait StaticHand {
  def invalid: Hand = Hand.invalid
}

