package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Finger, FingerList }

class RichFingerList(val underlying: FingerList) extends AnyVal {
  def apply(index: Int): Finger = underlying get index
}

