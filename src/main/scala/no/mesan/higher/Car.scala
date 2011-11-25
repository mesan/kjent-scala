package no.mesan.higher

import java.util.Calendar

object TaxGroup extends Enumeration {
  type TaxGroup = Value
  val A, B, C, D, E = Value
}
import TaxGroup._

class Car(val ID: String, val year:Int, val make:String, val tax: TaxGroup, val nok:Int) {
  private lazy val thisYear= Calendar.getInstance().get(Calendar.YEAR)
  def age= thisYear-year

  def calculateTax(taxMap: Map[TaxGroup, (Car=>Int)], ageCalc: (Int=>Double)): Int = {
    val baseTax= 0 // Må vel slå opp denne
    val factor= ageCalc(age)
    val res= baseTax * ((100-factor)/100)
    res.toInt
  }
}

object Bmw extends Car("BMW", 2011, "X3", TaxGroup.B, 835900)
object Vw extends Car("VW1", 2010, "Caravelle", TaxGroup.C, 429000)
object Toyota extends Car("Toyota", 2009, "RAV4", TaxGroup.B, 392000)
object Jaguar extends Car("Jaguar", 2008, "XF", TaxGroup.A, 1615000)
object Audi extends Car("Audi", 2007, "A6", TaxGroup.B, 301500)
object Porsche extends Car("Porsche", 2006, "Cayenne", TaxGroup.A, 1300000)
object Lada extends Car("Lada", 1985, "1600", TaxGroup.D, 42200)
object Boble extends Car("VW2", 1965, "Boble", TaxGroup.D, 62000)
object Tford extends Car("Ford", 1912, "T", TaxGroup.E, 330000)
