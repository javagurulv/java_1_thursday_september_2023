package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_1_intern;

class FizzBuzz {

    String fizzBuzz(int number) {
    return number % 5 == 0 && number % 3 == 0 ? number + "=FizzBuzz" : fizz(number);
}
    String fizz(int number) {
        return number % 3 == 0 ? number + "=Fizz" : buzz(number);
    }

    String buzz(int number) {
        return number % 5 == 0 ? number +"=Buzz" : "" + number;
    }


}
/* public String detect (int number){
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
*/