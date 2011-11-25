package no.mesan.basic

import org.specs2.mutable.Specification

class PersonSpec extends Specification {
  "Person" should {
    "be initalized with values" in {
      val p = new Person("Trond Marius", "Øvstetun")
      p must_!= null
      p.firstname must_== "Trond Marius"
      p.lastname must_== "Øvstetun"
    }
  }
}
