package com.github.akiomik.leap_scala

import com.leapmotion.leap.Matrix

object StaticMatrix extends StaticMatrix

trait StaticMatrix {
  def classType: Matrix = Matrix.identity
}

