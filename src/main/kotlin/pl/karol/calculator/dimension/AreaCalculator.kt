package pl.karol.calculator.dimension

object AreaCalculator {
    fun calculateArea(figure: Figure): Double {
        return figure.area()
    }


}

interface Figure {
    fun area(): Double
}