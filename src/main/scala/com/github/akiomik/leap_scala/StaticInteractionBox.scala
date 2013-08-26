package com.github.akiomik.leap_scala

import com.leapmotion.leap.InteractionBox

object StaticInteractionBox extends StaticInteractionBox

trait StaticInteractionBox {
  def invalid: InteractionBox = InteractionBox.invalid
}

