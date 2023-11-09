package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.lessoncode;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.fizzBuzzTest();
        test.intReturnTest();
    }

    void fizzTest() {
        FizzBuzz FizzBuzz = new FizzBuzz();
        String expectedResult = FizzBuzz.detect(3);
        if (expectedResult.equals("Fizz")) {
            System.out.println("Test Fizz is Ok");
        } else {
            System.out.println("Test Fizz is Fail");
        }
    }

    void buzzTest() {
        FizzBuzz FizzBuzz = new FizzBuzz();
        String expectedResult = FizzBuzz.detect(5);
        if (expectedResult.equals("Buzz")) {
            System.out.println("Test Buzz is Ok");
        } else {
            System.out.println("Test Buzz is Fail");
        }
    }

    void fizzBuzzTest() {
        FizzBuzz FizzBuzz = new FizzBuzz();
        String expectedResult = FizzBuzz.detect(15);
        if (expectedResult.equals("FizzBuzz")) {
            System.out.println("Test FizzBuzz is Ok");
        } else {
            System.out.println("Test FizzBuzz is Fail");
        }
    }

    void intReturnTest() {
        FizzBuzz FizzBuzz = new FizzBuzz();
        String expectedResult = FizzBuzz.detect(17);
        if (expectedResult.equals("17")) {
            System.out.println("Test IntReturnTest is Ok");
        } else {
            System.out.println("Test IntReturnTest is Fail");
        }
    }

}
