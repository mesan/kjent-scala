package no.mesan.concurrency.pingpong

import scala.actors.Actor
case object Ping2
case object Pong2
case object Stop2

object pingpongreact extends Application {
  val pong = new Pong2
  val ping = new Ping2(1000000, pong)
  ping.start
  pong.start
}

class Ping2(count: Int, pong: Actor) extends Actor {
  def act() {
    val start = System.currentTimeMillis();
    var pingsLeft = count - 1
    pong ! Ping2
    loop {
      react {
        case Pong2 =>
          if (pingsLeft % 10000 == 0)
            Console.println("Ping: pong")
          if (pingsLeft > 0) {
            pong ! Ping2
            pingsLeft -= 1
          } else {
            Console.println("Ping: stop")
            pong ! Stop2

            val end = System.currentTimeMillis();

            println(((end - start)) + "ms tok det")
            exit()
          }
      }
    }
  }
}

class Pong2 extends Actor {
  def act() {
    var pongCount = 0
    loop {
      react {
        case Ping2 =>
          if (pongCount % 10000 == 0)
            Console.println("Pong: ping " + pongCount)
          sender ! Pong2
          pongCount = pongCount + 1
        case Stop2 =>
          Console.println("Pong: stop")
          exit()
      }
    }
  }
}

