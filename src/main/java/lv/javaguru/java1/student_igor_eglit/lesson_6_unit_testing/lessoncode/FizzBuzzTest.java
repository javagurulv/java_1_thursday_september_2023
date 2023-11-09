package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.lessoncode;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testCase1();
        fizzBuzzTest.testCase2();
        fizzBuzzTest.testCase3();
        fizzBuzzTest.testCase4();
    }
    //test case 1: number 3: expected result = "fizz"
    //test case 1: number 5: expected result = "Buzz"
    //test case 1: number 15: expected result = "fizzBuzz"
    //test case 1: number 17: expected result = "17"
    public void testCase1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(3);
        if (result.equals("Fizz")) {//код не соответствует требованиям
            System.out.println("Test case 1 = OK");
        }else {
            System.out.println("Test case 1 = FAIL");
        }
    }
    public void testCase2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(5);
        if (result.equals("Buzz")) {
            System.out.println("Test case 1 = OK");
        }else {
            System.out.println("Test case 1 = FAIL");
        }
    }
    public void testCase3(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if (result.equals("FizzBuzz")) {//код не соответствует требованиям
            System.out.println("Test case 1 = OK");
        }else {
            System.out.println("Test case 1 = FAIL");
        }
    }
    public void testCase4(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(17);
        if (result.equals(""+17)) {
            System.out.println("Test case 1 = OK");
        }else {
            System.out.println("Test case 1 = FAIL");
        }
    }
}
