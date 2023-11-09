package lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl1;

public class FizzBuzz {

//    String detect(int number) {
//
//
//        if(number % 5 == 0 && number % 3 == 0) {
//            return "FizzBuzz";
//        }
//
//        if (number % 3 == 0) {
//            return "Fizz";
//        } else if(number % 5 == 0) {
//            return "Buzz";
//        } else {
//            return "" + number;
//        }
//    }

    String fizzBuzz(int number) {
        return number % 3 == 0 && number % 5 == 0 ? "FizzBuzz" : fizz(number);
    }

    String fizz(int number) {
        return number % 3 == 0 ? "Fizz" : buzz(number);
    }

    String buzz(int number) {
        return number % 5 == 0 ? "Buzz" : "" + number;
    }
}
