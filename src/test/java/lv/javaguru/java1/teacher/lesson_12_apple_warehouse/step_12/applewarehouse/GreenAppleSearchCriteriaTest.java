package lv.javaguru.java1.teacher.lesson_12_apple_warehouse.step_12.applewarehouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreenAppleSearchCriteriaTest {

    private GreenAppleSearchCriteria criteria = new GreenAppleSearchCriteria();

    @Test
    public void shouldSucceed() {
        Apple apple = new Apple("green", 200);
        assertTrue(criteria.test(apple));
    }

    @Test
    public void shouldFail() {
        Apple apple = new Apple("red", 200);
        assertFalse(criteria.test(apple));
    }

}