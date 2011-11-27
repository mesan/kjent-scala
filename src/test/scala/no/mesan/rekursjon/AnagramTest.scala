package no.mesan.rekursjon

import org.junit.Assert._
import org.junit.Test

class AnagramTest {

  // For å få denne opp må du fikse på Anagram-klassen

  @Test
  def ordUtenforOrdlisteGirIngenTreff { assertEquals(0, new Anagram("heks").findAnagrams.size) }

  @Test
  def ordUtenPermutasjonerTrefferSegSelv { assertEquals(1, new Anagram("mokka").findAnagrams.size) }

  @Test
  def ordMedEnPermutasjonGirBegge { assertEquals(2, new Anagram("amok").findAnagrams.size) }

  @Test
  def ordMedFlerePermutasjoner {
    val anagrams = new Anagram("slave").findAnagrams
    assertEquals(4, anagrams.size)
    assertTrue(anagrams.contains("valse"))
  }
}