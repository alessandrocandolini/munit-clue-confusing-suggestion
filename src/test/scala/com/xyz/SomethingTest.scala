package com.xyz

import munit.FunSuite

class SomethingTest extends FunSuite:
  test("something") {
    assertNoDiff(
      compileErrors("Set(2, 1).sorted"),
      """|error: value sorted is not a member of scala.collection.immutable.Set[Int]
         |Set(2, 1).sorted
         |          ^
         |""".stripMargin
    )
  }
