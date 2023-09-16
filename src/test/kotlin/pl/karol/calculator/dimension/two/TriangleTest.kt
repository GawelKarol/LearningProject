package pl.karol.calculator.dimension.two

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class TriangleTest {
    @Test
    fun shouldCalculateIfAllOfPointIsPositive() {
        //given
        val firstPoint: Point = Point(0.0, 0.0)
        val secondPoint: Point = Point(1.0, 1.0)
        val thirdPoint: Point = Point(0.0, 2.0)
        val triangle: Triangle = Triangle(firstPoint, secondPoint, thirdPoint)

        //when
        val area = triangle.calculateArea()

        //then
        assertThat(area).isEqualTo(1.0)

    }

    @Test
    fun shouldCalculateIfSecondPointIsMinus() {
        //given
        val firstPoint: Point = Point(0.0, 0.0)
        val secondPoint: Point = Point(-1.0, -1.0)
        val thirdPoint: Point = Point(0.0, 2.0)
        val triangle: Triangle = Triangle(firstPoint, secondPoint, thirdPoint)

        //when
        val area = triangle.calculateArea()

        //then
        assertThat(area).isEqualTo(1.0)

    }

    @Test
    fun shouldCalculateIfThirdPointIsMinus() {
        //given
        val firstPoint: Point = Point(0.0, 0.0)
        val secondPoint: Point = Point(1.0, 1.0)
        val thirdPoint: Point = Point(0.0, -2.0)
        val triangle: Triangle = Triangle(firstPoint, secondPoint, thirdPoint)

        //when
        val area = triangle.calculateArea()

        //then
        assertThat(area).isEqualTo(1.0)

    }

    @Test
    fun shouldCalculateIfAllOfPointIsMinus() {
        //given
        val firstPoint: Point = Point(0.0, 0.0)
        val secondPoint: Point = Point(-1.0, -1.0)
        val thirdPoint: Point = Point(0.0, -2.0)
        val triangle: Triangle = Triangle(firstPoint, secondPoint, thirdPoint)

        //when
        val area = triangle.calculateArea()

        //then
        assertThat(area).isEqualTo(1.0)

    }

}