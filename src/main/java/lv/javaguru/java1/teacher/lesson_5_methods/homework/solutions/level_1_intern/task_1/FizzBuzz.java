package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_1_intern.task_1;

class FizzBuzz {

    public String detect (int number){
        if (isDividedBy3(number) && isDividedBy5(number)){
            return "FizzBuzz";
        } else if (isDividedBy5(number)) {
            return "Buzz";
        }else if (isDividedBy3(number)){
            return "Fizz";
        }else {
            return "" + number;
        }
    }

    private static boolean isDividedBy5(int number) {
        return number % 5 == 0;
    }

    private static boolean isDividedBy3(int number) {
        return number % 3 == 0;
    }

}
