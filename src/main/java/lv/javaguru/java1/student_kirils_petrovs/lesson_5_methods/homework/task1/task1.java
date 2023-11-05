package lv.javaguru.java1.student_kirils_petrovs.lesson_5_methods.homework.task1;

class task1 {


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



//1. CСоздать класс
//2. нужно что бы числа которые делятся на 3 возоащались  фразой Фуз
// Реализация  метода
// У нас есть число "Номер1" его надо поделить на 3 и если оно делится на 3 тогда возрощаем его с фразой фух
// Вводные данные
// " int Number1 = 0; (этот параметр можно будет поменять в классе демо) "
//надо использовать оператор if
// if number1 = 0%3;
// return number1;