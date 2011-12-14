package no.mesan.xml

import xml.{Elem, UnprefixedAttribute, TopScope, Null, Text}

/**
 * TODO
 *
 * @author Torbjørn S. Knutsen
 */

object OverdreventVanskeligTelefonbok {
  val overdreventVanskeligTelefonbok =
    Elem(null, "telefonbok", Null, TopScope,
      Elem(null, "beskrivelse", Null, TopScope,
        Text("Dette er telefonboken til "),
        Elem(null, "b", Null, TopScope, Text("Mesan AS")),
        Text(".")
      ),
      Elem(null, "oppforing", Null, TopScope,
        Elem(null, "navn", Null, TopScope, Text("Torbjørn Skyberg Knutsen")),
        Elem(null, "telefon", new UnprefixedAttribute("type", "mobil", Null), TopScope,
          Text("977 14 022"))
      )
    )

  def main(args: Array[String]) = {
    Console.println(overdreventVanskeligTelefonbok)
  }
}
