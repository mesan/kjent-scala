package no.mesan.implicits

/**
 * Implicitte verdier. Kan importeres.
 *
 * @author Christian Ihle
 */
object Verdier {
  implicit val norsk = "no"
  implicit val engelsk = "en"
  implicit var mutabel = "bytt meg"
}
