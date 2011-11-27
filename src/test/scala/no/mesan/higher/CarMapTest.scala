package no.mesan.higher

import org.junit.Assert._
import org.junit.{Ignore, Test}

class CarMapTest {
  val cars= List(Vw, Toyota, Bmw, Jaguar, Lada, Porsche, Audi, Boble, Tford) // Finnes i Cars.scala

  def filter(list:List[Car], predicate: Car=>Boolean): List[Car]= {
    List(Lada) // Dette er neppe en fullgod implementasjon...
    // Det er IKKE lov å benytte den eksisterende funksjonen på List
  }

  def map[T](list:List[Car], fun: Car=>T): List[T]= {
    null // mangler vel noe her også...
    // Det er IKKE lov å benytte den eksisterende funksjonen på List
  }

  def partition(list:List[Car], predicate: Car=>Boolean): (List[Car], List[Car]) = {
    (null,null) // ditto
    // Det er IKKE lov å benytte den eksisterende funksjonen på List
  }

  def head(list:List[Car]): Car = {
    null
    // Det er IKKE lov å benytte den eksisterende funksjonen på List
  }

  def tail(list:List[Car]): List[Car] = {
    null
    // Det er IKKE lov å benytte den eksisterende funksjonen på List
  }

  @Test
  def mittEgetFilter() { assertEquals(0, filter(cars, _.year<1900).length) }

  @Test
  def filterTaalerIngenTreff() {
    assertEquals(0, filter(cars, _.year<1900).length)
    assertEquals(0, filter(cars, (c)=> false).length)
  }

  @Test
  def filterTaalerTomListe() {
    assertEquals(0, filter(List[Car](), _.year<1900).length)
  }

  @Test
  def minEgenMap {
    assertEquals(List("BMW","VW1","Toyota","Jaguar","Audi","Porsche","Lada","VW2","Ford").sort(_<_),
                 map(cars, _.ID).sort(_<_))
  }

  @Test
  def mapTaalerNulls {
    assertEquals(cars.map((c)=>null), map(cars, (c)=>null))
  }

  @Test
  def mapTaalerTomListe {
    assertTrue(map(List[Car](), (c)=>c).isEmpty)
  }

  @Test
  def minEgenPartition {
    val (tidlig,sen) = partition(cars, _.ID < "Lada")
    assertEquals(4, tidlig.size)
    assertEquals(5, sen.size)
    assertTrue(sen.contains(Lada))
  }

  @Test
  def partitionTaalerUrettferdighet {
    val (tidlig,sen) = partition(cars, _.ID > "X")
    assertEquals(0, tidlig.size)
    assertEquals(cars.size, sen.size)
    assertTrue(sen.contains(Lada))
  }

  @Test
  def partitionTaalerTomListe {
    val (tidlig,sen) = partition(List[Car](), _.ID!="slurp")
    assertEquals(0, tidlig.size)
    assertEquals(0, sen.size)
  }

  @Test
  def minEgenTail {
    assertEquals(8, tail(cars).size)
    assertFalse(tail(cars).contains(Vw))
  }

@Test(expected=classOf[UnsupportedOperationException])
def tailTaalerIkkeTomListe {
  assertEquals(0, tail(List[Car]()).size)
}

  @Test
  def mittEgetHead {
    assertEquals(Vw, head(cars))
  }

@Test(expected=classOf[NoSuchElementException])
  def headTaalerIkkeTomListe {
    assertEquals(null, head(List[Car]()))
  }
}