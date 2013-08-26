package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Gesture, GestureList }

class RichGestureList(val underlying: GestureList) extends AnyVal {
  def apply(index: Int): Gesture = underlying get index
}

