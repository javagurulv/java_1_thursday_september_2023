package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson6;

// Test 1: 1, 4, 7
// Test 2: 3, 9, 2
// Test 3: 10,1,6
class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
    }
    public void test1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(1,4,7);

        if (result == 7) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }
    public void test2() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(3,9,2);

        if (result == 9) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }
    public void test3() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(10,1,6);

        if (result == 10) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }




}
