package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Pointable, PointableList }

class RichPointableList(val underlying: PointableList) extends AnyVal {
  def apply(index: Int): Pointable = underlying get index
}

