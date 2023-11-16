package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode.tasks;

class MaxFinderTest {

    public static void main(String[] args) {
        MaxFinderTest test = new MaxFinderTest();
        test.testCase1();
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

}
