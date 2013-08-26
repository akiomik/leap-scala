package com.github.akiomik.leap_scala

import com.leapmotion.leap.{ Device, DeviceList }

class RichDeviceList(val underlying: DeviceList) extends AnyVal {
  def apply(index: Int): Device = underlying get index
}

