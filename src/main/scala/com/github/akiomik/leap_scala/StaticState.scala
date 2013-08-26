package com.github.akiomik.leap_scala

import com.leapmotion.leap.Gesture.State

object StaticState extends StaticState

trait StaticState {
  val Invalid = State.STATE_INVALID
  val Start   = State.STATE_START
  val Stop    = State.STATE_STOP
  val Update  = State.STATE_UPDATE
}

