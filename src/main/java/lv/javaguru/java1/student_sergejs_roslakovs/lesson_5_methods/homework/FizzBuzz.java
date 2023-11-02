package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework;

class FizzBuzz {
    public String convert(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
    boolean isDivisibleByThreeAndFive(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    boolean isDivisibleByFive(int number) {
        return number % 5 == 0;

        }
    }








