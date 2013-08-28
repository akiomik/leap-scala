package com.github.akiomik.leap_scala

object Imports extends Imports with Implicits

trait Imports extends BaseImports with TypeImports

trait BaseImports {
  val CircleGesture    = StaticCircleGesture
  val Device           = StaticDevice
  val Finger           = StaticFinger
  val Frame            = StaticFrame
  val Gesture          = StaticGesture
  val Hand             = StaticHand
  val InteractionBox   = StaticInteractionBox
  val KeyTapGesture    = StaticKeyTapGesture
  val Matrix           = StaticMatrix
  val Pointable        = StaticPointable
  val ScreenTapGesture = StaticScreenTapGesture
  val SwipeGesture     = StaticSwipeGesture
  val Tool             = StaticTool
  val Vector           = StaticVector
}

trait TypeImports {
  type CircleGesture    = com.leapmotion.leap.CircleGesture
  type Config           = com.leapmotion.leap.Config
  type Controller       = com.leapmotion.leap.Controller
  type Device           = com.leapmotion.leap.Device
  type DeviceList       = com.leapmotion.leap.DeviceList
  type Finger           = com.leapmotion.leap.Finger
  type FingerList       = com.leapmotion.leap.FingerList
  type Frame            = com.leapmotion.leap.Frame
  type Gesture          = com.leapmotion.leap.Gesture
  type GestureList      = com.leapmotion.leap.GestureList
  type Hand             = com.leapmotion.leap.Hand
  type HandList         = com.leapmotion.leap.HandList
  type InteractionBox   = com.leapmotion.leap.InteractionBox
  type KeyTapGesture    = com.leapmotion.leap.KeyTapGesture
  type Listener         = com.leapmotion.leap.Listener
  type Matrix           = com.leapmotion.leap.Matrix
  type Pointable        = com.leapmotion.leap.Pointable
  type PointableList    = com.leapmotion.leap.PointableList
  type ScreenTapGesture = com.leapmotion.leap.ScreenTapGesture
  type SwipeGesture     = com.leapmotion.leap.SwipeGesture
  type Tool             = com.leapmotion.leap.Tool
  type ToolList         = com.leapmotion.leap.ToolList
  type Vector           = com.leapmotion.leap.Vector
}

