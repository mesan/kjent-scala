package no.mesan.typer

import org.specs2.mutable.Specification

abstract class BaseEntity {
  
} 

class AliasedClass {
  // type..?
  def get : MyAlias = 1
}

class TypeMemberSpec extends Specification {
  "Type alias" should {
    "" in {
      val ac = new AliasedClass
      ac.get must_== 1
    }
  }
}
