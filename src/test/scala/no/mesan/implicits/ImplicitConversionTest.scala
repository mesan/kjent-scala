package no.mesan.implicits

import org.junit.Test
import org.junit.Assert._

/**
 * Tester som demonstrerer implicit conversion.
 *
 * @author Christian Ihle
 */
class ImplicitConversionTest {

  @Test
  def javaConversionsSkalSkjeAutomatisk() {
    val scalaListe = scala.collection.immutable.List[Int](1, 2, 4)

    // Få til å kompilere, og kjøre grønt - hint: import
//    val resultat = plussInnholdIJavaListe(scalaListe)
//    assertEquals(7, resultat)
  }

  @Test
  def pimpMyStringSkalTilbyKakeMetode() {
    // Få til å kompilere, og kjøre grønt
//    assertEquals("sjokoladekake", "sjokolade".kake());
//    assertEquals("bløtkake", "bløt".kake());
//    assertEquals("ostekake", "oste".kake());
  }

  @Test
  def pimpMyIntSkalTilbyAlternativDSLForGanging() {
    // Få til å kompilere, og kjøre grønt
//    assertEquals(8, 2 ganger 4)
//    assertEquals(12, 3 ganger 4)
  }

  @Test
  def pimpMyIntSkalRegneUtBartesmiley() {
    // Få til å kompilere, og kjøre grønt
//    assertEquals(44, 3 :# 7)
//    assertEquals(18, 2 :# 4)
//    assertEquals(52, 5 :# 5)
  }

  @Test
  def pimpMyIntSkalTilbyDSLForKonverteringAvValuta() {
    // Få til å kompilere, og kjøre grønt
//    assertEquals("290 NOK", 50 USD)
//    assertEquals("580 NOK", 100 USD)
//    assertEquals("780 NOK", 100 EUR)
//    assertEquals("900 NOK", 100 GBP)
  }

  def plussInnholdIJavaListe(javaListe: java.util.List[Int]) = {
    var resultat = 0;

    for (i <- 0 until javaListe.size()) {
      val verdi: Int = javaListe.get(i)
      resultat += verdi;
    }

    resultat
  }
}
