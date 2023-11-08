package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_1.task_1;

public class FizzBuzz {

    String dividedBy3And5(int number) {

        if (dividedBy3(number) && dividedBy5(number)) {
        return "FizzBuzz";
        }else if(dividedBy3(number)){
            return "Fizz";
        }else if (dividedBy5(number)){
            return "Buzz";
        }else{
            return "" +  number;
        }
    }

    private boolean dividedBy3(int number) {
        if (number % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean dividedBy5(int number) {
        if (number % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }


}
