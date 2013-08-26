package com.github.akiomik.leap_scala

import com.leapmotion.leap.Vector

object StaticVector extends StaticVector

trait StaticVector {
  def zero: Vector = Vector.zero

  def backward: Vector = Vector.backward

  def down: Vector = Vector.down

  def forward: Vector = Vector.forward

  def left: Vector = Vector.left

  def right: Vector = Vector.right

  def up: Vector = Vector.up

  def xAxis: Vector = Vector.xAxis

  def yAxis: Vector = Vector.yAxis

  def zAxis: Vector = Vector.zAxis
}

