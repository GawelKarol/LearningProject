package pl.karol.calculator.dimension.two

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DeltoidTest {
    @Test
    fun shouldItWork() {
        //given
        val firstPoint: Point = Point(0.0, 2.0)
        val secondPoint: Point = Point(1.5, 3.0)
        val thirdPoint: Point = Point(3.0, 2.0)
        val fourthPoint: Point = Point(1.5, 0.0)
        val deltoid: Deltoid = Deltoid(firstPoint, secondPoint, thirdPoint, fourthPoint)

        //when
        val area = deltoid.calculateArea()

        //then
        assertThat(area).isEqualTo(4.5)
    }
}