package no.mesan.xml

import org.junit.Test

/**
 * Bruk Pattern matching og/eller XPath-lignende query til å finne verdiene
 *
 * @author Torbjørn S. Knutsen
 */

class EnhetsregisterXmlTest {
  @Test
  def hentHeleXml() {
    println(enhetsRegisterXml)
  }


  @Test
  def hentOrgNr() {
    //val orgNr = ??
    //assertEquals("881886472", orgNr)
  }

  @Test
  def hentNavn() {
    //val navn = ??
    //assertEquals("MESAN AS", navn)
  }

  @Test
  def hentForretningsAddresseRegistreringsDato() {
    //val regDato = ??
    //assertEquals("2009-06-18", regDato)
  }

  @Test
  def hentDagligLederFornavn() {
    //val forNavn = ??
    //assertEquals("Kjell Gorm", forNavn)
  }

  val enhetsRegisterXml =
  <grunndata xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="http://ftp2.brreg.no/xml/skjema/grunndata/2007/01/16/hentBasisdata.xsd">
    <responseHeader prossessDato="2011-12-14" tjeneste="hentBasisdata">
      <orgnr>881886472</orgnr>
      <hovedStatus>0</hovedStatus>
      <underStatus>
        <underStatusMelding kode="0">Data returnert</underStatusMelding>
        <underStatusMelding kode="1020">Enhet 881886472 har ikke postadresse</underStatusMelding>
        <underStatusMelding kode="1165">Enhet 881886472 har ikke hovedforetak</underStatusMelding>
      </underStatus>
    </responseHeader>
    <melding tjeneste="hentBasisdata">
      <organisasjonsnummer registreringsDato="2000-04-05">881886472</organisasjonsnummer>
      <navn registreringsDato="2000-04-05">
        <navn1>MESAN AS</navn1>
      </navn>
      <forretningsAdresse registreringsDato="2009-06-18">
        <adresse1>Akersgata 32</adresse1>
        <postnr>0180</postnr>
        <poststed>OSLO</poststed>
        <kommunenummer>0301</kommunenummer>
        <kommune>OSLO</kommune>
        <landkode>NOR</landkode>
        <land>Norge</land>
      </forretningsAdresse>
      <organisasjonsform registreringsDato="2000-04-05">
        <orgform>AS</orgform>
        <orgformBeskrivelse>Aksjeselskap</orgformBeskrivelse>
      </organisasjonsform>
      <formaal>
        <virksomhetArtBransje registreringsDato="2000-04-05">Konsulenttjenester samt kjøp og salg av relaterte produkter/tjenester. Investering i andre selskaper. </virksomhetArtBransje>
        <vedtektsfestetFormaal registreringsDato="2000-04-05">Konsulenttjenester samt kjøp og salg av relaterte produkter/tjenester. Investering i andre selskaper. </vedtektsfestetFormaal>
      </formaal>
      <stiftelsesdato registreringsDato="2000-04-05">2000-03-23</stiftelsesdato>
      <maalform registreringsDato="2000-04-05">
        <maalformKode>B</maalformKode>
        <maalformTekst>Bokmål</maalformTekst>
      </maalform>
      <kontaktperson>
        <samendring beskrivelse="Daglig leder/ adm.direktør" registreringsDato="2000-09-09" samendringstype="DAGL">
          <rolle beskrivelse="Daglig leder/ adm.direktør" rolletype="DAGL">
            <person beskrivelse="Lever" statuskode="L">
              <fornavn>Kjell Gorm</fornavn>
              <slektsnavn>Hedløy</slektsnavn>
              <adresse1>Jarveien 26</adresse1>
              <postnr>1358</postnr>
              <poststed>JAR</poststed>
              <land landkode4="NOR">Norge</land>
              <fratraadt>N</fratraadt>
            </person>
          </rolle>
        </samendring>
      </kontaktperson>
    </melding>
  </grunndata>

}
