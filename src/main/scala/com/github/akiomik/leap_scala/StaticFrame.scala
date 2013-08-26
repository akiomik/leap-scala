package com.github.akiomik.leap_scala

import com.leapmotion.leap.Frame

object StaticFrame extends StaticFrame

trait StaticFrame {
  def invalid: Frame = Frame.invalid
}

