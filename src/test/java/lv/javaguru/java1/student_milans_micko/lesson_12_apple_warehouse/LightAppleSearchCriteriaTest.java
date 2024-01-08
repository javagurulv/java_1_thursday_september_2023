package lv.javaguru.java1.student_milans_micko.lesson_12_apple_warehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightAppleSearchCriteriaTest {
    private LightAppleSearchCriteria criteria = new LightAppleSearchCriteria();

    @Test
    public void shouldBeTrue() {
        Apple apple = new Apple("green", 100);
        assertTrue(criteria.test(apple));
    }
    @Test
    public void shouldBeFalse() {
        Apple apple = new Apple("green", 200);
        assertFalse(criteria.test(apple));
    }

}