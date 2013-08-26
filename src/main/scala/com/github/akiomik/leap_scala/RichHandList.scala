package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Hand, HandList }

class RichHandList(val underlying: HandList) extends AnyVal {
  def apply(index: Int): Hand = underlying get index
}

