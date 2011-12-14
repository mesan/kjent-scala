package no.mesan.xml

/**
 * TODO
 *
 * @author Torbjørn S. Knutsen
 */

object Telefonbok {

  val telefonBok =
    <telefonbok>
      <beskrivelse>
        Dette er telefonboken til <b>Mesan AS</b>.
      </beskrivelse>
      <oppforing id="1">
        <navn>Torbjørn Skyberg Knutsen</navn>
        <telefon type="mobil">977 14 022</telefon>
        <telefon type="hjem">12 34 <b>56</b> 78</telefon>
      </oppforing>
    </telefonbok>;

  def main(args: Array[String]) = {
    println(telefonBok)
  }
}




