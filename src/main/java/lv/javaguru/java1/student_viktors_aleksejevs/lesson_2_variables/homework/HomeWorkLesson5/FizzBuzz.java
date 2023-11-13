package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson5;

public class FizzBuzz {
        public String translate(int number) {
            if (isDividedBy3(number) && isDividedBy5(number)) {
                return "Fizz" + "Buzz";
            } else if (isDividedBy5(number)) {
                return "Buzz";
            } else if (isDividedBy3(number)) {
                return "Fizz";
            } else {
                return Integer.toString(number);
            }
        }

        private static boolean isDividedBy5(int number) {
            return number % 5 == 0;
        }

        private static boolean isDividedBy3(int number) {
            return number % 3 == 0;
        }
    }



