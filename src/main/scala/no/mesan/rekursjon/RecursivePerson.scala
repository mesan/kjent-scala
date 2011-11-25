package no.mesan.rekursjon

class RecursivePerson (private val name:String) {
  private val children= new scala.collection.mutable.HashSet[RecursivePerson]()
  private def removeChild(conn: RecursivePerson) = children.remove(conn)

  def addChildren(childList: RecursivePerson*) {
    for ( child <- childList) {
      children.add(child)
      child.removeChild(this)
    }
  }

  // skriv om denne slik at den både sjekker barna og også forstår seg på transitive relasjoner (barnebarnebarnebarn...)
  // -- du SKAL bruke rekursjon
  def hasDescendant(other: RecursivePerson): Boolean = false
}

object RecursivePerson {
  def apply(name:String, friends:String*) = new RecursivePerson(name)

  val bestefar= RecursivePerson("Bestefar")
  val storebror= RecursivePerson("Storebror")
  val storesoster= RecursivePerson("Storesøster")
  val bestemor= RecursivePerson("Bestemor")
  val ole= RecursivePerson("Ole")
  val dole= RecursivePerson("Dole")
  val elskerinne= RecursivePerson("Elskerinne")
  val lillebror= RecursivePerson("Lillebror")
  val oldebarn= RecursivePerson("Oldebarn")

  storebror.addChildren(ole, dole)
  bestemor.addChildren(storebror, storesoster)
  bestefar.addChildren(storebror, lillebror, storesoster)
  elskerinne.addChildren(lillebror)
  ole.addChildren(oldebarn)
}