package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.lessoncode;

class FizzBuzz {

    // testcase1: 3 ; expected result = Fizz
    // testcase2: 5 ; expected result = Buzz
    // testcase3: 15 ; expected result = FizzBuzz
    // testcase4: 17 ; expected result = "17"

    public static final int NUMBER_5 = 5;
    public static final int NUMBER_3 = 3;

    public String detect(int number) {
        String result;
        if (isDivisibleBy15(number)) result = "FizzBuzz";
        else if (isDivisibleBy3(number)) result = "Fizz";
        else if (isDivisibleBy5(number)) result = "Buzz";
        else result = "" + number;
        return result;
    }

    private boolean isDivisibleBy15(int number) {
        return isDivisibleBy3(number) && isDivisibleBy5(number);
    }

    private boolean isDivisibleBy5(int number) {
        return number % NUMBER_5 == 0;
    }

    private boolean isDivisibleBy3(int number) {
        return number % NUMBER_3 == 0;
    }

}
