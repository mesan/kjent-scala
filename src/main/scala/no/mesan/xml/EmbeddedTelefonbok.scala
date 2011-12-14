package no.mesan.xml

/**
 * TODO
 *
 * @author Torbjørn S. Knutsen
 */

object EmbeddedTelefonBok {
  val firma = <a href="http://www.mesan.no/">Mesan AS</a>
  val forNavn = "Torbjørn"
  val etterNavn = "Skyberg Knutsen"
  val nummerType = "mobil"

  val embeddedTelefonBok =
    <telefonbok>
      <beskrivelse>
        Dette er <b>telefonboken</b> til {firma}.
      </beskrivelse>
      <oppforing>
        <navn>{forNavn + " " + etterNavn}</navn>
        <telefon type={nummerType}>977 14 0{val x = 20 + 2; x}</telefon>
      </oppforing>
    </telefonbok>;

  def main(args: Array[String]) = {
    println(embeddedTelefonBok)
  }
}
