package no.mesan

import losning.{Kasse, Puddel, Mat, Hund}
import org.specs2.mutable.Specification

/**
 * TODO
 *
 * @author Svein Melby
 */

class ObjektorienteringSpec extends Specification {

  /**
   * 1. Lag en klasse Hund med feltene (val) navn (String), farge (String), bjeff(String), alder(Int)
   */
  "Hund" should {
    "ha et navn, en farge sitt bjeff og sin alder" in {
      val hund = new Hund("Fido", "Brun", "Voff", 3) {}
      hund.navn must_== "Fido"
      hund.farge must_== "Brun"
      hund.lyd must_== "Voff"
    }
  }

  /**
   * 2. Variablen lyd skal være mulig å endre. Og det skal legges til '!!!' etter det som skrives inn.
   */
  "Hund" should  {
    "kunne bytte lyden den lager (med modifikasjon)" in {
      val hund = new Hund("Frans", "Hvit", "Knurr", 13) {}
      hund.lyd must_== "Knurr"

      hund.lyd = "Voff"

      hund.lyd must_==  "Voff!!!"
    }
  }

  /**
   * 3. Hund skal overskrive toString(). Teksten skal være hundens navn + "the Dog"
   */
  "Hund" should  {
    "overskrive toString" in  {
      val hund = new Hund("Balder", "Gråhvit", "Voff", 4){}

      hund.toString() must_== "Balder - the Dog"
    }
  }

  /**
   * 4. Lag et trait: Spise med metoden spis(mat: Mat): String. Denne returnerer "Logre logre".
   *    Lag en ny klasse Puddel som extender Hund med traitet Spise
   */
  "Puddel" should {
    "logre når den spiser mat" in {
      val hund = new Puddel("Pluto", "Brun", "Voff", 50)

      hund.spis(new Mat) must_== "Logre logre"
    }
  }

  /**
   * 5. Lag et trait Fillebikje for Hund (selftype) med metoden gneldre(): String som returnerer lyd tre ganger
   *    etterhverandre. Ta i bruk traitet på  Puddel (uten å knekke forrige test).
   */
  "Puddel" should {
    "gneldre..." in {
      val hund = new Puddel("Tanja", "Svart", "Voff", 4)

      hund.gneldre() must_== "VoffVoffVoff"
    }
  }

  /**
   * 6. Lag en generisk klasse Kasse som tar et objekt ved hjelp av generics
   */
  "Kasse" should  {
    "inneholde en Hund" in {
      val kasse = new Kasse(new Puddel("Tiril", "Blå", "Ynk", 6))

      kasse.ting.navn must_== "Tiril"
    }
  }


}
