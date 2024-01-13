package lv.javaguru.java1.student_milans_micko.lesson_12_apple_warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenAppleSearchCriteriaTest {
    private GreenAppleSearchCriteria criteria = new GreenAppleSearchCriteria();

    @Test
    public void shouldBeTrue() {
        Apple apple = new Apple("green", 150);
        assertTrue(criteria.test(apple));
    }

    @Test
    public void shouldBeFalse() {
        Apple apple = new Apple("red", 150);
        assertFalse(criteria.test(apple));
    }

}