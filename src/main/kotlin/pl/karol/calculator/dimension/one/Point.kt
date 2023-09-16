package pl.karol.calculator.dimension.one

import pl.karol.calculator.dimension.zero.Point as ZeroPoint

open class Point(val firstCoordinate: Double) : ZeroPoint() {
    operator fun minus(point: Point): Double {
        return firstCoordinate - point.firstCoordinate
    }

}
