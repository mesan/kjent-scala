package no.mesan.rekursjon

import org.junit.Assert._
import org.junit.Test

import no.mesan.rekursjon.RecursivePerson._

class RecursivePersonTest {

  @Test
  def ikkebarnAvSegSelv {
    assertFalse(bestefar hasDescendant bestefar)
  }

  @Test
  def barn {
    assertTrue(storebror hasDescendant ole)
    assertTrue(storebror hasDescendant dole)
  }

  @Test
  def ikkeOmvendt {
    assertFalse(lillebror hasDescendant bestefar)
  }

  @Test
  def barneBarnOsv {
    assertTrue(bestefar hasDescendant ole)
    assertTrue(bestemor hasDescendant oldebarn)
  }
}