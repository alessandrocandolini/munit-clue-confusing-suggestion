# `import munit.Clue.generate` minimal working example 

A minimal working example that shows how the suggestions from the **Scala 3** compiler are shadowed by this hint
```bash
[error]    |The following import might make progress towards fixing the problem:
[error]    |
[error]    |  import munit.Clue.generate
```

Code of the test [here](src/test/scala/com/xyz/MinimalTest.scala#L21)

## Configuration
* Scala 3.2.1 
* munit 1.0.0-M7
* sbt 1.8.2 

## Docs

* The issue was reported here https://github.com/lampepfl/dotty/issues/9685 
* It seems the munit test suite covers this case: https://github.com/scalameta/munit/blob/8558ab134313c30f94936c5a1ca5596bda4d6c67/tests/shared/src/test/scala/munit/AssertionsSuite.scala#L196




