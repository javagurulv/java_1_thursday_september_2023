package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class FizzBuzzTest {

    // 1. num = 9, result = Fizz
    // 2. num = 10, result = Buzz
    // 3. num = 15, result = FizzBuzz
    // 4. num = 11, result = 11

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(9);
        checkResult(result, "Fizz", "test1");
    }

    public void test2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(10);
        checkResult(result, "Buzz", "test2");
    }

    public void test3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        checkResult(result, "FizzBuzz", "test3");
    }

    public void test4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(11);
        checkResult(result, "11", "test4");
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}

