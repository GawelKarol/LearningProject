package pl.karol.calculator.dimension.third

import  pl.karol.calculator.dimension.two.Point as TwoPoint

class Point(firstCoordinate: Double, secondCoordinate: Double, val thirdCoordinate: Double) :
    TwoPoint(firstCoordinate, secondCoordinate) {
}