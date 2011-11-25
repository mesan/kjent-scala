package no.mesan.rekursjon

import org.junit.Assert._
import org.junit.Test

class MathRTest {

  @Test
  def fib0 { assertEquals(BigInt(0), MathR.fib(0)) }

  @Test
  def fib1 { assertEquals(BigInt(1), MathR.fib(1)) }

  @Test
  def fib2 { assertEquals(BigInt(1), MathR.fib(2)) }

  @Test
  def fib3 { assertEquals(BigInt(2), MathR.fib(3)) }

  @Test
  def fib7 { assertEquals(BigInt(13), MathR.fib(7)) }

  @Test
  def fib11 { assertEquals(BigInt(89), MathR.fib(11)) }

  @Test
  def fac0 { assertEquals(BigInt(0), MathR.fac(0)) }

  @Test
  def fac1 { assertEquals(BigInt(1), MathR.fac(1)) }

  @Test
  def fac2 { assertEquals(BigInt(2), MathR.fac(2)) }

  @Test
  def fac3 { assertEquals(BigInt(6), MathR.fac(3)) }

  @Test
  def fac6 { assertEquals(BigInt(720), MathR.fac(6)) }
}
