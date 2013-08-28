package com.github.akiomik.leap_scala

import com.leapmotion.leap.Controller

object StaticController extends StaticController

trait StaticController {
  type PolicyFlag = Controller.PolicyFlag
}

