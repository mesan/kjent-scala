package no.mesan.basic

import org.junit.Test

class MyFirstTest {

    @Test
    def accessVal {
      // Make this compile and run

    	// assertEquals("This is a constant", const)

      // When commenting in the following line, you must get a compile error
    	// const = "Must give compile error"
    }

    // @Test
    def changeVar {
      // Make this compile and run

      // assertEquals("This is a variable", variable)
      val text = "Changed it"
      // variable = text
      // assertEquals(text, variable)
      ()
    }

}
