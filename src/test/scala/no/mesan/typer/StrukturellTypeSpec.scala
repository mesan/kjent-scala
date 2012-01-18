package no.mesan.typer

import org.specs2.mutable.Specification

class MyFoo

class StrukturellTypeSpec extends Specification {
  def foo(a:{def bar:String}) = {
    a.bar
  }

  "Strukturell typet metode" should {
    "kreve riktig typet klasse" in {
      foo(new MyFoo) must_== "bar"
      failure("implementer bar=bar i MyFoo")
    }
    "kreve riktig typet anonymt objekt" in {
      foo(new {}) must_== "bar"
      failure("implementer bar=bar")
    }
  }
}
