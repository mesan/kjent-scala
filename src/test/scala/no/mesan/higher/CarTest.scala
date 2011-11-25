package no.mesan.higher

import org.junit.Assert._
import org.junit.Test

class CarTest {

  val cars= List(Vw, Toyota, Bmw, Jaguar, Lada, Porsche, Audi, Boble, Tford) // Finnes i Cars.scala

  def sirWhiz(car:Car): String = "ID" + car.ID.toUpperCase

  @Test
  def gamleBiler {
    val ids= List() // Hint: cars.??????.map(sirWhiz)
    assertEquals(3, ids.length)
    assertTrue(ids.contains("IDVW2"))
  }

  @Test
  def ingenEkteTraktor {
    val traktor: Option[Car]= None // cars.????
    assertEquals("IDLADA", sirWhiz(traktor.getOrElse(Lada)))
  }

  @Test
  def sorterEtterAlder {
    val liste= List() // cars.??????
    assertEquals(List(Bmw, Vw, Toyota, Jaguar, Audi), liste.take(5))
  }

  @Test
  def delEtterAlder {
    val (gamleBiler, nyeBiler)= (List(), List()) // ????????????
    assertEquals(4, gamleBiler.length)
    assertEquals(5, nyeBiler.length)
    assertTrue(gamleBiler contains "IDVW2")
    assertTrue(nyeBiler contains "IDVW1")
  }
}