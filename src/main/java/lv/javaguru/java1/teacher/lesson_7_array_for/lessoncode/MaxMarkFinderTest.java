package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode;

class MaxMarkFinderTest {

    public static void main(String[] args) {
        MaxMarkFinderTest test = new MaxMarkFinderTest();
        test.test1();
    }

    public void test1() {
        int[] marks = {1, 4, 5, 7, 2, 10};
        MaxMarkFinder maxMarkFinder = new MaxMarkFinder();
        int maxMark = maxMarkFinder.findMaxMark(marks);
        if (maxMark == 10) {
            System.out.println("OK!");
        } else {
            System.out.println("FAIL!");
        }
    }

}
