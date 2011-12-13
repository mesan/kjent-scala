package no.mesan.interop

trait MedHistorie {
  def historie : String

  def fortellHistorie = "Min historie er: " + historie
  
  def modifiserHistorie (f: String => String) : String = {
    f(historie)
  }
}
