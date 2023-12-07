package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class FizzBuzzTest {
    public static void main(String [] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();
        test.testCase4();
    }

    public void testCase1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(3);
        if (result.equals("Fizz")) {
            System.out.println("testCase1 = ok");
        } else {
            System.out.println("testcase1 =  fail");
        }
    }

    public void testCase2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(5);
        if (result.equals("Buzz")) {
            System.out.println("testCase2 = ok");
        } else {
            System.out.println("testcase2 =  fail");
        }
    }

    public void testCase3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if (result.equals("FizzBuzz")) {
            System.out.println("testCase3 = ok");
        } else {
            System.out.println("testcase3 =  fail");
        }
    }

    public void testCase4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(16);
        if (result.equals("16")) {
            System.out.println("testCase4 = ok");
        } else {
            System.out.println("testcase4 =  fail");
        }
    }


}
