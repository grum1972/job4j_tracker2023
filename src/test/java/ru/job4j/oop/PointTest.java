package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void distance() {
        Point pointA = new Point(0, 0);
        Point pointB = new Point(0, 2);
        double actual = pointA.distance(pointB);
        double expected = 2;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void distance3d() {
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(1, 1, 1);
        double actual = pointA.distance3d(pointB);
        double expected = 1.732;
        assertThat(actual).isCloseTo(expected, offset(0.001));
    }
}