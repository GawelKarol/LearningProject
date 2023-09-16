package pl.karol

import pl.karol.calculator.dimension.one.Segment
import pl.karol.calculator.dimension.two.Deltoid
import pl.karol.calculator.dimension.one.Point as Point1
import pl.karol.calculator.dimension.two.Triangle
import pl.karol.calculator.dimension.two.Point as Point2

fun main() {
    val calculator = Calculator(1.0, 2.0)
    print("dodawani : "); println(calculator.add())
    print("odejmowanie : "); println(calculator.minus())
    print("dzielenie : "); println(calculator.div())
    print("mnożenie : "); println(calculator.mul())
    val segment: Segment = Segment(Point1(5.0), Point1(25.0))
    print("dlugosc odcinka: "); println(segment.calculateLength())
    val triangle: Triangle = Triangle(Point2(0.0, 0.0), Point2(1.0, 1.0), Point2(0.0, 2.0))
    print("Pole Trojkata: "); println(triangle.calculateArea())
    val deltoid: Deltoid = Deltoid(Point2(0.0, 0.0), Point2(15.0, 40.0), Point2(30.0, 0.0), Point2(15.0, -80.0))
    print("Pole Deltoidu: "); println(deltoid.calculateArea())
}
