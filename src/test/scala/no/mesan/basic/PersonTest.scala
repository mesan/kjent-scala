package no.mesan.basic

import org.junit.Test
import org.junit.Assert._

class PersonTest {
  @Test
  def personShouldBeInitializedWithvalues() {
    val p = new Person("Trond Marius", "Øvstetun")
    assertNotNull(p)
    assertEquals("Trond Marius", p.firstname)
    assertEquals("Øvstetun", p.lastname)
  }
}
