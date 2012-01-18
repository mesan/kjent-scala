package no.mesan.typer


trait Foo {
  def bar = "bar"
}
trait Bar {
  def foo = "foo"
}
trait FooBar {
  self: Foo with Bar =>
  def foobar = foo + bar
}

class FooBarImpl extends FooBar

class SelfTypeTraitSpec {
  "FooBar" should {
    "kunne instansieres anonymt" in {
      val f = new FooBar {}
      f.foobar must_== "foobar"
      failure("instansier opp en FooBar riktig")
    }
  }
  "FooBarImpl" should {
    "kunne lages som en klasse" in {
      val f = new FooBarImpl
      f.foobar must_== "foobar"
      failure("implementer foobarimpl!")
    }
  }
}
