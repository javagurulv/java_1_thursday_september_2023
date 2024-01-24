package lv.javaguru.java1.student_artjoms_potasevskis.lesson_12;


import lv.javaguru.java1.student_artjoms_potasevskis.lesson_12.Apple;
import lv.javaguru.java1.student_artjoms_potasevskis.lesson_12.RedAppleSearchCriteria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RedAppleSearchCriteriaTest {

    private RedAppleSearchCriteria criteria = new RedAppleSearchCriteria();

    @Test
    public void shouldSucceed() {
        Apple apple = new Apple("red", 200);
        assertTrue(criteria.test(apple));
    }

    @Test
    public void shouldFail() {
        Apple apple = new Apple("green", 200);
        assertFalse(criteria.test(apple));
    }
}
