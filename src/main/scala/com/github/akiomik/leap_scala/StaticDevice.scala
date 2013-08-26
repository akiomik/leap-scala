package com.github.akiomik.leap_scala

import com.leapmotion.leap.Device

object StaticDevice extends StaticDevice

trait StaticDevice {
  def invalid: Device = Device.invalid
}

