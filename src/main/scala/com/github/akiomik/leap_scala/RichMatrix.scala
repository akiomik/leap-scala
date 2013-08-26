package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Matrix, Vector }

class RichMatrix(val underlying: Matrix) extends AnyVal {

  def origin: Vector = underlying.getOrigin

  def origin_=(value: Vector) {
    underlying.setOrigin(value)
  }

  def xBasis: Vector = underlying.getXBasis

  def xBasis_=(value: Vector) {
    underlying.setXBasis(value)
  }

  def yBasis: Vector = underlying.getYBasis

  def yBasis_=(value: Vector) {
    underlying.setYBasis(value)
  }

  def zBasis: Vector = underlying.getZBasis

  def zBasis_=(value: Vector) {
    underlying.setZBasis(value)
  }

  def *(other: Matrix): Matrix = underlying times other

}

