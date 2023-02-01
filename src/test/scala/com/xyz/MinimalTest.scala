package com.xyz

import munit.FunSuite

class MinimalTest extends FunSuite:

//    test("see the actual compiler error (without macro). Uncomment this to see the compiler error") {
//      Set(2, 1).sorted
//    }
//
//  test("this test should pass but it fails, uncomment to see it failing") {
//    assertNoDiff(
//      compileErrors("Set(2, 1).sorted"),
//      """|error: value sorted is not a member of scala.collection.immutable.Set[Int]
//         |Set(2, 1).sorted
//         |          ^
//         |""".stripMargin
//    )
//  }

  test("this test should fail but it passes") {
    assertNoDiff(
      compileErrors("Set(2, 1).sorted"),
      """|error:
         |value sorted is not a member of Set[Int], but could be made available as an extension method.
         |
         |The following import might make progress towards fixing the problem:
         |
         |  import munit.Clue.generate
         |
         |Set(2, 1).sorted
         |         ^
         |""".stripMargin
    )
  }




