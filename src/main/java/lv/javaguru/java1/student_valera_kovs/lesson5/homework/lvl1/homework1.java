package lv.javaguru.java1.student_valera_kovs.lesson5.homework.lvl1;

class homework1 {

    //1.cоздать класс
    //2.числа которые деляться на 3 - Fizz
    //3.num1 делить на 3 и если делится на 3 тогда фраза Fizz
    //4.метод if else
    //5.return
    //6.num1 = 0
    //7.создать 2 класс чтоб поменять параметры -FizzBuzz

    public String convert(int num1) {
        if (num1 % 3 == 0 && num1 % 5 == 0) {
            return "FizzBuzz";
        } else if (num1 % 3 == 0) {
            return "Fizz";
        } else if (num1 % 5 == 0) {
            return "Buzz";
        } else {
            return "" + num1;
        }
    }

    boolean isDivisibleBy3And5(int num1) {
        return num1 % 3 == 0 && num1 % 5 == 0;
    }

    boolean isDivisibleBy3(int num1) {
        return num1 % 3 == 0;
    }

    boolean isDivisibleBy5(int num1) {
        return num1 % 5 == 0;

    }
}



