package pl.karol.calculator.dimension.two

import pl.karol.calculator.dimension.Figure

class Triangle(val firstPoint: Point, val secondPoint: Point, val thirdPoint: Point) : Figure {
    fun calculateArea(): Double {
        return Math.abs(((secondPoint.firstCoordinate - firstPoint.firstCoordinate) * (thirdPoint.secondCoordinate - firstPoint.secondCoordinate)) - ((secondPoint.secondCoordinate - firstPoint.secondCoordinate) * (thirdPoint.firstCoordinate - firstPoint.firstCoordinate))) / 2

    }

    override fun area(): Double {
        return calculateArea()
    }


}