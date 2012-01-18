package no.mesan.typer

import org.specs2.mutable.Specification

abstract class BaseEntity {
  type IDType
  var id:IDType = _
}
class Person extends BaseEntity {
  
}

class AliasedClass {
  // type..?
  def get : MyAlias = 1
}

class TypeMemberSpec extends Specification {
  "Type alias" should {
    "må aliases.." in {
      val ac = new AliasedClass
      ac.get must_== 1
    }
  }
  "Person" should {
    "må definere IDTypen" in {
      val p = new Person
      p.id = 1
      p.id must_== 1
    }
  }
}
