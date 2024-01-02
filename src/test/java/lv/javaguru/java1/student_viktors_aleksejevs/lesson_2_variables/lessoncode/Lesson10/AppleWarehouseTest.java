package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

import lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.Lesson12Apple.Apple;
import lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.Lesson12Apple.AppleWarehouse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AppleWarehouseTest {

    @Test
    public void shouldFindGreenApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> greenApples = appleWarehouse.findGreenApples();
        assertEquals(greenApples.size(), "3");
        assertEquals(greenApples.get(0).getColor(), "green");
        assertEquals(greenApples.get(1).getColor(), "green");
        assertEquals(greenApples.get(2).getColor(), "green");
    }

    @Test
    public void shouldFindYellowApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> greenApples = appleWarehouse.findApplesByColor("yellow");
        assertEquals(greenApples.size(), "2");
        assertEquals(greenApples.get(0).getColor(), "yellow");
        assertEquals(greenApples.get(1).getColor(), "yellow");
    }
}
