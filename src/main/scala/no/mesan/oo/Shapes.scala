package no.mesan.oo

abstract class Shape(val color: String) {

  def area: Double
  def circumference: Double
}

object Shape {

  val DefaultColor = "white"
}

class Rectangle(width: Double, height: Double, color: String) extends Shape(color) {
  // Create a auxiliary constructor

  def area = width * height
  def circumference = 2 * width + 2 * height

}

// override Rectangle
class Square {
  // Create an auxiliary constructor

  // Override the area method

}

// Make Circle extend Shape, and add a primary constructor for radius and color
class Circle {

  // Create a auxiliary constructor

  // Define the area function

  // Make this compile
  // def circumference = 2 * Pi * radius

}
