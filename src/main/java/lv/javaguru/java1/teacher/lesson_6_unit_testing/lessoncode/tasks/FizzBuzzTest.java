package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode.tasks;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();
        test.testCase4();
    }

    // test case 1:  3 -> "Fizz"
    public void testCase1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(3);
        if (result.equals("Fizz")) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    // test case 2:  5 -> "Buzz"
    public void testCase2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(5);
        if (result.equals("Buzz")) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    // test case 3:  15 -> "FizzBuzz"
    public void testCase3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if (result.equals("FizzBuzz")) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    // test case 4:  17 -> "17"
    public void testCase4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(17);
        if (result.equals("17")) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }


}
