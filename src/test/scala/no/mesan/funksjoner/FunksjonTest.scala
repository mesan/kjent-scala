package no.mesan.funksjoner

import org.junit.Test
import org.junit.Assert._

/**
 * @author JavaBin / Scalabin
 *
 */
class FunksjonTest {

    val Ola = Person2("Ola", 30, List(EmailAddress("ola.nordmann@gmail.com")))
    val kari = Person2("Kari", 33, List(EmailAddress("Kari.nordmann@gmail.com"), EmailAddress("kn@hotmail.com")))
    val rolf = Person2("Rolf", 0, Nil)

    val Person2s = List(Ola, kari, rolf)

    // @Test
    def testAdults {
        // Filter the list of Person2s to find all adults
        val adults = Nil

        assertEquals(List(Ola, kari), adults)
    }

    // @Test
    def testName {
        // Find the names of all Person2s
        val names = Nil

        assertEquals(List("Ola", "kari", "rolf"), names)
    }

    // @Test
    def testNamesOfAdults {
        // Create a list containing the names of the adults,
        // by combining the approaches in the two exercies above
        val names = Nil

        assertEquals(List("Ola", "kari"), names)
    }

    // @Test
    def testAgeLimit {
        // Partition the list of Person2s into two new lists,
        // one containing the adults and one containing the kids
        val (adults, kids) = (Nil, Nil)

        assertEquals(List(Ola, kari), adults)
        assertEquals(List(rolf), kids)
    }

    // @Test
    def testHasMultipleEmails {
        // Split the list of Person2s into two new lists containing
        // techies (more than one email address) and luddites (zero or only one email address)
        val (techies, luddites) = (Nil, Nil)

        assertEquals(List(kari), techies)
        assertEquals(List(Ola, rolf), luddites)
    }

    // @Test
    def testFindByName {
        // Find the Person2 named "rolf" in the list of Person2s
        val name = "rolf"
        val person: Option[Person2] = null

        person match {
            case Some(person) => assertEquals(rolf, person)
            case _ => sys.error("No match")
        }
    }

    // @Test
    def testFindByName2 {
        // Find the Person2 named "Jon-Anders" (should not match)
        val name = "Jon-Anders"
        val person: Option[Person2] = null

        person match {
            case None => "OK"
            case _ => sys.error("Unexpected match")
        }
    }

    // @Test
    def testFindEmailAddressesByName {
        // Find the e-mail addresses of the Person2 named "Ola". 
        // Here you must first find the Person2, 
        // then map the collection to a different type
        val name = "Ola"
        val addresses: Option[List[EmailAddress]] = null

        addresses match {
            case Some(addresses) => assertEquals(Ola.emailAddresses, addresses)
            case _ => sys.error("No match")
        }
    }

    // @Test
    def testFindPerson2ByEmail {
        // Find the Person2 who has the e-mail address "fvr@knowit.no".

        // Hint: Try combinining finding the Person2 and checking if
        // there exists an email address matching the criteria in the
        // Person2's list of email addresses.
        val address = EmailAddress("kari@vraalsen.no")
        val person: Option[Person2] = null

        person match {
            case Some(person) => assertEquals(kari, person)
            case _ => sys.error("No match")
        }
    }

    // @Test
    def testGetFirstEmailAddress {
        // Create a new list of the first e-mail address of each Person2,
        // filtering out Person2s without e-mail addresses. 

        // Hint: Try combining filtering the list and then 
        // mapping it to a different type, only getting
        // the head of the email address list.
        val addresses = Nil

        assertEquals(List(Ola.emailAddresses.head, kari.emailAddresses.head), addresses)
    }

    // @Test
    def testNameToEmailAddress {
        // Create a map from each Person2s name to their e-mail addresses,
        // filtering out Person2s without e-mail addresses
        // Hint: First filter list, then use foldLeft to accumulate...
        val emptyMap: Map[String, List[EmailAddress]] = Map()

        // Insert code here for emptyMap
        val nameToEmail = emptyMap

        assertEquals(Map(Ola.name -> Ola.emailAddresses, kari.name -> kari.emailAddresses), nameToEmail)
    }
}