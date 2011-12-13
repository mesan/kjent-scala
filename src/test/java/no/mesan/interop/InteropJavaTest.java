package no.mesan.interop;

import org.junit.Before;
import org.junit.Test;
import scala.Tuple2;
import scala.collection.immutable.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class InteropJavaTest {
    private JPerson jp;
    private SPerson sp;

    @Before
    public void setUp() throws Exception {
        jp = null; // lag person "Buster Minal"
        sp = null; // lag person "Buster Minal"
    }

    @Test
    public void lagJavaPerson() {
        assertNotNull(jp);
    }
    @Test
    public void lagScalaPerson() {
        assertNotNull(sp);
    }

    @Test
    public void hentNavnFraJavaPerson() {
        assertEquals("Buster", jp.getFirstname());
        assertEquals("Minal", jp.getLastname());
    }

    @Test
    public void hentNavnFraScalaPerson() {
//        assertEquals("Buster", sp.firstname());
//        assertEquals("Minal", sp.lastname());
        fail("ikke implementert");
    }
    
    @Test
    public void settNavnIScalaPerson() {
//        sp.firstname_$eq("Petter");
//        sp.lastname_$eq("Smart");
//        assertEquals("Petter", sp.firstname());
//        assertEquals("Smart", sp.lastname());
        fail("ikke implementert");
    }

    @Test
    public void settNavnIScalaPersonJavaVennlig() {
//        sp.setFirstname("Petter");
//        sp.setLastname("Smart");
//        assertEquals("Petter", sp.getFirstname());
//        assertEquals("Smart", sp.getLastname());
        fail("ikke implementert");
    }
    
    @Test
    public void brukScalaListFraJava() {
//        List<String> l = null; // Lag tom (empty) liste
//        List<String> l2 = l; // legg til "a" i front på l som gir en ny liste. HINT: :: (eller cons) i scala. (operator/symbol)
//        String s = l2.head();
//        assertEquals("a", s);
        fail("ikke implementert");
    }

    @Test
    public void hentFulltNavnFraScala() {
//        NOE navn = sp.navn();
//        assertEquals("Buster", navn._1());
//        assertEquals("Minal", navn._2());
        fail("ikke implementert");
    }

    @Test
    public void hentFulltNavnFraJava() {
//        NOE navn = jp.navn();
//        assertEquals("Buster", navn._1());
//        assertEquals("Minal", navn._2());
        fail("ikke implementert");
    }

    @Test
    public void scalaImplementasjonAvJavaInterface() {
//        MedFortelling mf = null; // implementer i scalaklasse og bruk
//        assertEquals("Scalas fortelling", mf.fortelling());
        fail("ikke implementert");
    }

    @Test
    public void javaImplementasjonAvScalaTrait() {
//        MedHistorie mh = null; // implementer i java og bruk
//        assertEquals("Javas historie", mh.historie());
//        assertEquals("Min historie er: Javas historie", mh.fortellHistorie());
        fail("ikke implementert");
    }

    @Test
    public void brukeFunksjonellMetode() {
//        MedHistorie mh = null; // implementer i scala og bruk
//        String endretHistorie = mh.modifiserHistorie(NOE HER); // lag en funksjon som legger til litt tekst først
//        assertEquals("..LAGT TIL.. Javas historie", endretHistorie);
        fail("ikke implementert");
    }
}
