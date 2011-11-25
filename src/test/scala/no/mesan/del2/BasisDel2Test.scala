package no.mesan.del2

import org.junit.Test
import org.junit.Assert._

class BasisDel2Test {
 
  @Test
  def testAtEnFunksjonReturnerer42() {
    // lag en funksjon som returnerer heltallet 42
    
//    assertEquals(42, enFunksjon())
  }
  
  @Test 
  def testAtEnFunksjonIkkeReturnererEnVerdi()  {
    // lag en funksjon som ikke returnerer noen interresant verdi
    
//    assertEquals((), enFunksjon())
  }
  
  @Test
  def testBrukAvTuppler {
      // lag en som gitt to verdier returnerer et tuppel med heltallsdivisjon og restverdi. (inspirert av scala by example)
     // resultat._1 = resultat av heltallsdivison
     // resultat._2 = restverdi 
	  
//	  assertEquals(divmod(5,2), (2,1))
  }
  
//  @Test(expected=classOf[IllegalStateException])
  def testExceptionKasting() {
	  // lag en funksjon som alltid kaster IllegalStateException
	  
    
//	  enFunksjonSomKasterExceptions()
  }
  
  @Test
  def testExceptionHaandteringMedTryCatch() {
	  // lag en funksjon som kaster IllegalArgumentException ved valg=1, IllegalStateException ved valg=2, og ellers returnerer valg
	  // def enFunksjonSomKasterExceptions(valg: Int) ...
    
	  // håndter exceptions ved hjelp av try/catch 
	  //  IllegalArgumentException fører til verdi -10
	  // IllegalStateException fører til verdi -20
	  
       // def enFunksjonSomHaandtererExceptions(valg : Int) ...
	  
//	  assertEquals(enFunksjonSomHaandtererExceptions(0), 0)
//	  assertEquals(enFunksjonSomHaandtererExceptions(1), -10)
//	  assertEquals(enFunksjonSomHaandtererExceptions(2), -20)
//	  assertEquals(enFunksjonSomHaandtererExceptions(3), 3)
  }
  
    @Test
    def testNullhaanteringMedOption() {
	  // lag en funksjon som dividerer to tall, og som returnerer None ved deling på null, og Some(resultat) ellers

    	  
	  //assertFalse(div(2,0).isDefined)
	  //assertEquals(2, div(4,2).get)
  }
}