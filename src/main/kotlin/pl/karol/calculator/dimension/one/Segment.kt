package pl.karol.calculator.dimension.one

class Segment(val startingPoint: Point, val endPoint: Point) {
    fun calculateLength(): Double {
        return Math.abs(endPoint - startingPoint)
    }
}