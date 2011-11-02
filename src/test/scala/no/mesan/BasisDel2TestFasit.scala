package no.mesan
import org.junit.Test
import org.junit.Assert._

class BasisDel2TestFasit {
 
  @Test
  def testAtEnFunksjonReturnerer42() {
    // lag en funksjon som returnerer heltallet 42
    def enFunksjon() = {
      42
    }
    
    assertEquals(42, enFunksjon())
  }
  
  @Test 
  def testAtEnFunksjonIkkeReturnererEnVerdi()  {
    // lag en funksjon som ikke returnerer noen interresant verdi
    def enFunksjon() : Unit = {
      println("kun en sideeffekt")
    }
    
    assertEquals((), enFunksjon())
  }
  
  @Test
  def testBrukAvTuppler {
      // lag en som gitt to verdier returnerer et tuppel med heltallsdivisjon og restverdi. (inspirert av scala by example)
     // resultat._1 = resultat av heltallsdivison
     // resultat._2 = restverdi 
	  def divmod(x: Int, y: Int) = new Tuple2[Int, Int](x / y, x % y)

	  assertEquals(divmod(5,2), (2,1))
  }
  
  @Test(expected=classOf[IllegalStateException])
  def testExceptionKasting() {
	  // lag en funksjon som alltid kaster IllegalStateException
	  def enFunksjonSomKasterExceptions()  {
		  throw new IllegalStateException;
	  }
    
	  enFunksjonSomKasterExceptions()
  }
  
  @Test
  def testExceptionHaandteringMedTryCatch() {
	  // lag en funksjon som kaster IllegalArgumentException ved valg=1, IllegalStateException ved valg=2, og ellers returnerer valg
	  def enFunksjonSomKasterExceptions(valg: Int) = {
		  if (valg == 1) throw (new IllegalArgumentException)
		  if (valg == 2) throw (new IllegalStateException)
		  valg
	  }
    
	  // håndter exceptions ved hjelp av try/catch 
	  //  IllegalArgumentException fører til verdi -10
	  // IllegalStateException fører til verdi -20
	  def enFunksjonSomHaandtererExceptions(valg : Int) = {
	    try {
	      enFunksjonSomKasterExceptions(valg)
	    } catch {
	    	case e: IllegalArgumentException => -10
	    	case e: IllegalStateException => -20
	    	case e => -30
	    }
	  }
	  
	  assertEquals(enFunksjonSomHaandtererExceptions(0), 0)
	  assertEquals(enFunksjonSomHaandtererExceptions(1), -10)
	  assertEquals(enFunksjonSomHaandtererExceptions(2), -20)
	  assertEquals(enFunksjonSomHaandtererExceptions(3), 3)
  }
  
  	@Test
    def testNullhaanteringMedOption() {
	  // lag en funksjon som dividerer to tall, og som returnerer None ved deling på null, og Some(resultat) ellers
      def div(x: Int, y:Int) : Option[Int] = {
		  if (y == 0) {
		    return None;
		  } 
		  Some(x / y)
	  }
    	  
	  assertFalse(div(2,0).isDefined)
	  assertEquals(2, div(4,2).get)
  }
}