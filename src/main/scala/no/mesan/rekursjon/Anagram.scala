package no.mesan.rekursjon

object wordList {
  private val theList= List(
    "larve",  "larver", "larves",
    "salve",  "salver", "salves",
    "slave",  "slaver",
    "valse",
    "sval",   "svale",  "svaler",
    "varsel", "varsle", "varslet",
    "amok",   "koma",   "mokka", "komma"
  )

  def contains(word:String): Boolean = theList contains word
  def isPrefix(pfx:String): Boolean = (theList find (_ startsWith pfx)) != None
}

class Anagram(word: String) {
  def findAnagrams: Set[String] = Set()

  // Hint: trekk første bokstav blant bokstavene (inntil alle er prøvd)
  //  Rekursjon: trekk andre bokstav blant de resterende
  //   Osv...
  // For å spare tid, kan det jo være lurt å sjekke at det finnes ord som begynner på det man har valgt så langt
  //   

}