package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void distance() {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 2);
        double actual = pointA.distance(pointB);
        double excepted = 2;
        assertThat(actual).isEqualTo(excepted);
    }
}