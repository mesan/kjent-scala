package no.mesan.higher

import org.junit.Assert._
import org.junit.Test

class CarTest {

  val cars= List(Vw, Toyota, Bmw, Jaguar, Lada, Porsche, Audi, Boble, Tford) // Finnes i Cars.scala

  def sirWhiz(car:Car): String = "ID" + car.ID.toUpperCase

  @Test
  def gamleBiler {
    // Plukk ut alle biler produsert i forrige århundre
    val ids= List() // Hint: cars.??????.map(sirWhiz)
    assertEquals(3, ids.length)
    assertTrue(ids.contains("IDVW2"))
  }

  @Test
  def sorterEtterAlder {
    // Sorter bilene etter alder
    val liste= List() // cars.??????
    assertEquals(List(Bmw, Vw, Toyota, Jaguar, Audi), liste.take(5))
  }

  @Test
  def delEtterAlder {
    // Vi skal parkere bilene på 2 rekker.  For å se mest mulig oppdatert ut, vil vi ha
    // de nyeste bilene på første rad.
    // Sorter bilene etter alder, og del listen i 2 like deler
    // (ved oddetall settes den ekstra på første rad)
    val (gamleBiler, nyeBiler)= (List(), List()) // ????????????
    assertEquals(4, gamleBiler.length)
    assertEquals(5, nyeBiler.length)
    assertTrue(gamleBiler contains "IDVW2")
    assertTrue(nyeBiler contains "IDVW1")
  }
}