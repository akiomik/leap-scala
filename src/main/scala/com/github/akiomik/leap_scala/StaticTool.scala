package com.github.akiomik.leap_scala

import com.leapmotion.leap.Tool

object StaticTool extends StaticTool

trait StaticTool {
  def invalid: Tool = Tool.invalid
}

