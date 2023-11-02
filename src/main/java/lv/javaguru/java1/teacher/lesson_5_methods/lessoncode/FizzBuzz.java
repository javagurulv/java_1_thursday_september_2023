package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class FizzBuzz {

    public static final int NUMBER_5 = 5;
    public static final int NUMBER_3 = 3;

    public String translateNumberToString(int number) {
        String result;
        if (isDevidedBy15(number)) result = "fizzBuzz";
        else if (isDevidedBy3(number)) result = "fizz";
        else if (isDevidedBy5(number)) result = "Buzz";
        else result = "" + number;
        return result;
    }

    private boolean isDevidedBy15(int number) {
        return isDevidedBy3(number) && isDevidedBy5(number);
    }

    private boolean isDevidedBy5(int number) {
        return number % NUMBER_5 == 0;
    }

    private boolean isDevidedBy3(int number) {
        return number % NUMBER_3 == 0;
    }

}
