package no.mesan.implicits

/**
 * Abstrakt klasse som kan utføre operasjoner på 2 parametre, og returnere et resultat,
 * og en metode på et objekt som bruker denne utføreren.
 *
 * @author Christian Ihle
 */
abstract class Utforer[T] {
  def utfor(x: T, y: T) : T
}

object Utforer {
  def hentResultat[T](x: T, y: T)(implicit u: Utforer[T]) = {
    u.utfor(x, y)
  }
}
