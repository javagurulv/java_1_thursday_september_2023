package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_5.homework;


public class FizzBuzzConverter {
    public static void main(String[] args) {

        System.out.println(convert(3));
        System.out.println(convert(5));
        System.out.println(convert(15));
        System.out.println(convert(7));
        System.out.println(convert(9));
        System.out.println(convert(10));
    }

    public static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    public static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    public static String convert(int number) {
        if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
            return "FizzBuzz";
        } else if (isDivisibleBy3(number)) {
            return "Fizz";
        } else if (isDivisibleBy5(number)) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
