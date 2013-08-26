package com.github.akiomik.leap_scala

import com.leapmotion.leap.Vector

class RichVector(val underlying: Vector) extends AnyVal {
  def x: Float = underlying.getX

  def x_=(x: Float) {
    underlying.setX(x)
  }

  def y: Float = underlying.getY

  def y_=(y: Float) {
    underlying.setY(y)
  }

  def z: Float = underlying.getZ

  def z_=(z: Float) {
    underlying.setZ(z)
  }

  def -(other: Vector): Vector = underlying minus other

  def +(other: Vector): Vector = underlying plus other

  def *(scalar: Float): Vector = underlying times scalar

  def /(scalar: Float): Vector = underlying divide scalar

  def ⋅(other: Vector): Float = underlying dot other

  def ×(other: Vector): Vector = underlying cross other

  def apply(index: Long): Float = underlying get index
}

