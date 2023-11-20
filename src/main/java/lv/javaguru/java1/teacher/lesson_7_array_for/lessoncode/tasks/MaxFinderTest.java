package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode.tasks;

import java.util.Random;

class MaxFinderTest {

    public static void main(String[] args) {
        MaxFinderTest test = new MaxFinderTest();
        test.testCase1();
        test.testCase2();
    }

    public void testCase1() {
        MaxFinder maxFinder = new MaxFinder();
        int[] grades = {1, 4, 5, 2, 9};
        int max = maxFinder.findMax(grades);
        if (max == 9) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void testCase2() {
        MaxFinder maxFinder = new MaxFinder();
        int[] grades = new int[100];

        Random random = new Random();
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(7);
        }

        grades[5] = 10;

        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        int max = maxFinder.findMax(grades);
        if (max == 10) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }


}
