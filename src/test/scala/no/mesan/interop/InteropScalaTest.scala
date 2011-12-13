package no.mesan.interop

import org.junit.{Test, Before}
import org.junit.Assert._

class InteropScalaTest {
  
  var jp : JPerson = _
  var sp : SPerson = _
  
  @Before
  def lagPersoner {
    jp = new JPerson("Buster", "Minal") // lag person "Buster Minal"
    sp = new SPerson("Buster", "Minal") // lag person "Buster Minal"
  }

  @Test
  def lagJavaPerson {
    assertNotNull(jp)
  }
  @Test
  def lagScalaPerson {
    assertNotNull(sp)
  }
  
  @Test
  def hentNavnFraJavaPerson {
//    assertEquals("Buster", jp.getFirstname)
//    assertEquals("Minal", jp.getLastname)
    fail
  }
  
  @Test
  def hentNavnFraScalaPerson {
//    assertEquals("Buster", jp.firstname)
//    assertEquals("Minal", jp.getLastname)
    fail
  }
  
  @Test
  def settNavnIJavaPerson {
//    jp.setFirstname("Petter")
//    jp.setLastname("Smart")
//    assertEquals("Petter", jp.firstname)
//    assertEquals("Smart", jp.getLastname)
    fail
  }
  
  @Test // NB denne kompilerer ikke ...?
  def settNavnIJavaPersonScalaVennlig {
//    jp.firstname = "Petter"
//    jp.lastname = "Smart"
//    assertEquals("Petter", jp.firstname)
//    assertEquals("Smart", jp.lastname)
    fail
  }

  @Test
  def brukJavaListe {
//    val l : TYPE_HER = null // instansier som javaliste / arraylist
//    l.add("a")
//    l.add("b")
//    l.add("c")
//    assertEquals(3, l.size)
//    assertEquals("b", l.get(1))
    fail
  }

  @Test
  def hentFulltNavnFraScala {
//    val navn = sp.navn
//    assertEquals(("Buster", "Minal"), navn)
    fail
  }
  
  @Test
  def hentFulltNavnFraJava {
//    val navn = jp.navn
//    assertEquals(("Buster", "Minal"), navn)
    fail
  }
  
  @Test
  def javaImplementasjonAvScalaTrait {
//    val mh : MedHistorie = null // implementer og instansier
//    assertEquals("Javas historie", mh.historie)
//    assertEquals("Min historie er: Javas historie", mh.fortellHistorie);
    fail
  }
  
  @Test
  def scalaImplementasjonAvJavaInterface {
//    val mf : MedFortelling = null // implementer
//    assertEquals("Scalas fortelling", mf.fortelling)
    fail
  }
}
