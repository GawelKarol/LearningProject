package pl.karol.calculator.dimension.two

class Deltoid(val firstPoint: Point, val secondPoint: Point, val thirdPoint: Point, val fourthPoint: Point) {
    fun calculateArea(): Double {
        return Math.sqrt(
            Math.pow(
                thirdPoint.firstCoordinate - firstPoint.firstCoordinate,
                2.0
            ) + Math.pow(thirdPoint.secondCoordinate - firstPoint.secondCoordinate, 2.0)
        ) / 2.0 * (Math.sqrt(
            Math.pow(fourthPoint.firstCoordinate - secondPoint.firstCoordinate, 2.0) + Math.pow(
                fourthPoint.secondCoordinate - secondPoint.secondCoordinate,
                2.0
            )
        ))
    }
}