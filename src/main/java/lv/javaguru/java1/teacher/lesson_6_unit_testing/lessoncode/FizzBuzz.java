package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class FizzBuzz {

    // 1. num = 9, result = Fizz
    // 2. num = 10, result = Buzz
    // 3. num = 15, result = FizzBuzz
    // 4. num = 11, result = 11


    public static final int NUMBER_5 = 5;
    public static final int NUMBER_3 = 3;

    public String detect(int number) {
        String result;
        if (isDividedBy15(number)) result = "FizzBuzz";
        else if (isDividedBy3(number)) result = "Fizz";
        else if (isDividedBy5(number)) result = "Buzz";
        else result = "" + number;
        return result;
    }

    private boolean isDividedBy15(int number) {
        return isDividedBy3(number) && isDividedBy5(number);
    }

    private boolean isDividedBy5(int number) {
        return number % NUMBER_5 == 0;
    }

    private boolean isDividedBy3(int number) {
        return number % NUMBER_3 == 0;
    }

}
