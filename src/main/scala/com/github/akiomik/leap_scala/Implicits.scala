package com.github.akiomik.leap_scala

import com.leapmotion.leap._
import scala.language.implicitConversions

object Implicits extends Implicits

trait Implicits {
  implicit def richDeviceList(dl: DeviceList): RichDeviceList =
    new RichDeviceList(dl)

  implicit def richFingerList(fl: FingerList): RichFingerList =
    new RichFingerList(fl)

  implicit def richGestureList(gl: GestureList): RichGestureList =
    new RichGestureList(gl)

  implicit def richPointableList(pl: PointableList): RichPointableList =
    new RichPointableList(pl)

  implicit def richHandList(hl: HandList): RichHandList = new RichHandList(hl)

  implicit def richMatrix(m: Matrix): RichMatrix = new RichMatrix(m)

  implicit def richVector(v: Vector): RichVector = new RichVector(v)
}

