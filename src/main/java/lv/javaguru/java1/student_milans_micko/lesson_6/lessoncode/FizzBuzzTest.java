package lv.javaguru.java1.student_milans_micko.lesson_6.lessoncode;

public class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testcase1();
        test.testcase2();
        test.testcase3();
        test.testcase4();
    }

    // testcase1: 3 ; expected result = Fizz
    public void testcase1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(3);
        if (result.equals("Fizz")) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    // testcase2: 5 ; expected result = Buzz
    public void testcase2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(5);
        if (result.equals("Buzz")) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }
    // testcase3: 15 ; expected result = FizzBuzz
    public void testcase3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if (result.equals("FizzBuzz")) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }
    // testcase4: 17 ; expected result = "17"
    public void testcase4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(17);
        if (result.equals("17")) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }

}
