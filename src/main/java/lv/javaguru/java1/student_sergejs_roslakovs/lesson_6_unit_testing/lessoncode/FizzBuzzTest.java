package lv.javaguru.java1.student_sergejs_roslakovs.lesson_6_unit_testing.lessoncode;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();
        test.testCase4();


    }






    public void testCase1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(6);
        if (result.equals("Fizz")) {
            System.out.println("testCase 1 = OK");
        } else {
            System.out.println("testCase 1 = FAIL");
        }
    }




    public void testCase2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(5);
        if (result.equals("Buzz")) {
            System.out.println("testCase 1 = OK");
        } else {
            System.out.println("testCase 1 = FAIL");
        }
    }
    public void testCase3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(15);
        if (result.equals("FizzBuzz")) {
            System.out.println("testCase 1 = OK");
        } else {
            System.out.println("testCase 1 = FAIL");
        }
    }
    public void testCase4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(22);
        if (result.equals("22")) {
            System.out.println("testCase 1 = OK");
        } else {
            System.out.println("testCase 1 = FAIL");











            }

        }














    }








