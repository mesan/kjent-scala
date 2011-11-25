package no.mesan.higher

import org.junit.Assert._
import org.junit.Test

import TaxGroup._

class CarFunctionTest {

  // Du må fikse på Car.calculateTax for at dette skal virke

  // Denne kan du bruke som den er
  def ageReductionFactor(age:Int) = if (age<=25) 4*(25-age) else 100

  // Disse 5 funksjonene må puttes i en map som kan settes til kalkulatoren.
  // Objektorientering er noe dritt, vi gjør det på gamlemåten.
  def calcClassA(car:Car): Int = car.nok * 66/100
  def calcClassB(car:Car): Int = car.nok * 55/100
  def calcClassC(car:Car): Int = car.nok * 33/100
  def calcClassD(car:Car): Int = car.nok * 10/100
  def calcClassE(car:Car): Int = car.nok *  0/100

  val taxMap: Map[TaxGroup, Car=>Int] = Map(
    // Fyll på her
  )

  val cars= List(Vw, Toyota, Bmw, Jaguar, Lada, Porsche, Audi, Boble, Tford) // Finnes i Cars.scala

  @Test
  def audiOgPorsche {
    // Skal være riktig hvis du har fått map og funksjon på plass
    assertEquals(26532, Audi.calculateTax(taxMap, ageReductionFactor))
    assertEquals(171600, Porsche.calculateTax(taxMap, ageReductionFactor))
  }

  @Test
  def veteran {
    assertEquals(0, Tford.calculateTax(taxMap, ageReductionFactor))
  }

  @Test
  def bottomLine {
    val taxes= cars.map(_.calculateTax(taxMap, ageReductionFactor))
    val total= 0  // Summer verdiene i taxes -- hint: reduceLeft
    assertEquals(348950, total)
  }
}