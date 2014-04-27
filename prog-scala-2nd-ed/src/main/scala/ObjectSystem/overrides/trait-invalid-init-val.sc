// src/main/scala/ObjectSystem/overrides/trait-invalid-init-val.sc
// ERROR: "value" read before initialized.

trait AbstractT2 {
  println("In AbstractT2:")
  val value: Int
  val inverse = 1.0/value      // <1>
  println("AbstractT2: value = "+value+", inverse = "+inverse)
}

val obj = new AbstractT2 {
  println("In obj:")
  val value = 10
}
println("obj.value = "+obj.value+", inverse = "+obj.inverse)
