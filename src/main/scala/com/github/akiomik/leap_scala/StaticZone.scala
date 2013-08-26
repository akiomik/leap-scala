package com.github.akiomik.leap_scala

import com.leapmotion.leap.Pointable.Zone

object StaticZone extends StaticZone

trait StaticZone {
  val Hovering = Zone.ZONE_HOVERING
  val None     = Zone.ZONE_NONE
  val Touching = Zone.ZONE_TOUCHING
}

