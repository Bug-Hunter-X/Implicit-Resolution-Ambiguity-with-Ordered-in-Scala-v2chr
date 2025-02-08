This repository demonstrates a subtle bug related to implicit resolution ambiguity in Scala when working with the `Ordered` type class. The code defines a class `MyClass` that uses an implicit `Ordering` to compare values of type `T`.  The problem arises when providing implicit instances for multiple types (`Int`, `String`), but omitting it for `Double`, causing a compiler error because it can't implicitly resolve the required `Ordering[Double]` instance. The solution shows how to address this issue by either explicitly providing the implicit or handling the case for Double differently.