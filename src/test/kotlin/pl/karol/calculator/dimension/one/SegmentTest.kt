package pl.karol.calculator.dimension.one

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SegmentTest {

    @Test
    fun shouldCalculateSegmentLengthIfEndPointIsGreaterThanStartingPoint() {
        // given
        val startingPoint: Point = Point(4.0)
        val endPoint: Point = Point(8.0)
        val segment: Segment = Segment(startingPoint, endPoint)

        // when
        val lenght = segment.calculateLength()

        // then
        assertThat(lenght).isEqualTo(4.0)
    }

    @Test
    fun shouldCalculateSegmentLengthIfEndPointIsLowerThanStartingPoint() {
        // given
        val startingPoint: Point = Point(8.0)
        val endPoint: Point = Point(4.0)
        val segment: Segment = Segment(startingPoint, endPoint)

        // when
        val lenght = segment.calculateLength()

        // then
        assertThat(lenght).isEqualTo(4.0)
    }

    @Test
    fun shouldCalculateSegmentLengthIfEndPointIsEqualToStartingPoint() {
        // given
        val startingPoint: Point = Point(4.0)
        val endPoint: Point = Point(4.0)
        val segment: Segment = Segment(startingPoint, endPoint)

        // when
        val lenght = segment.calculateLength()

        // then
        assertThat(lenght).isEqualTo(0.0)
    }
}