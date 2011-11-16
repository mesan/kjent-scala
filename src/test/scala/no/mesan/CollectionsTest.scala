package no.mesan

import org.junit.Test
import org.junit.Assert._

class CollectionsTest {

  @Test
  def hentUtAvMap() {
    val myMap = Map("1" -> "en", "2" -> "to")

    // Fyll inn for spørsmålstegnene
    assertEquals("?", myMap.get("1"))
    assertEquals("to", "?")
    assertEquals("?", myMap.get("3"))
  }

  @Test
  def leggTilIMap() {
    val myMap = Map[String, String]("a" -> "A")

    // Fyll inn for spørsmålstegnet
    //val myMap2 = ?

    //assertEquals("A", myMap2("a"))
    //assertEquals("B", myMap2("b"))
  }

  @Test
  def lagEnListe() {

    // Fyll inn for spørsmålstegnet
    //val myList = ?

//    assertEquals(myList.head, "appelsin")
//    assertEquals(myList.last, "sitron")
//    assertEquals(myList.tail, List("eple", "sitron"))
  }

  @Test
  def tilStoreBokstaver() {
    val myList = List("en", "to")

    // Fyll inn for spørsmålstegnet
    //val myList2 = ?

    //assertEquals(List("EN", "TO"), myList2)
  }

  @Test
  def plukkUtKårene() {
    val personer = List(new Person("kåre","hansen"), new Person("jenny","hansen"), new Person("kåre","jensen"))

    // Fyll inn for spørsmålstegnet
//    val kårene = ?
//
//    assertEquals("kåre", kårene(0).firstname)
//    assertEquals("kåre", kårene(1).firstname)
  }

  @Test
  def plukkUtKåreneOgDeAndre() {
    val personer = List(new Person("kåre","hansen"), new Person("jenny","hansen"), new Person("kåre","jensen"))

    //val (kårene, deandre) = ?
    
//    assertEquals("kåre", kårene(0).firstname)
//    assertEquals("kåre", kårene(1).firstname)
//    assertEquals("jenny", deandre(0).firstname)
  }

  @Test
  def hvorLangtErDetLengsteOrdet() {
    val myList = "det" :: "lengste" :: "ordet" :: "i" :: "listen" :: "er?" :: Nil

    // Finn lengden på det lengste ordet
    //val lengde = ?

    //assertEquals(7, lengde)
  }

}