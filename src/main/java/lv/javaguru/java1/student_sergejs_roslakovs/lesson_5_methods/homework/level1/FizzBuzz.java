package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level1;

class FizzBuzz {
    public void convert(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            //return "FizzBuzz";
            printString("FizzBuzz");
        } else if (number % 3 == 0) {
            printString("Fizz");
        } else if (number % 5 == 0) {
            printString("Buzz");
        } else {
            printString("" + number);
        }
    }

    public void printString(String str){
        System.out.println(str);
    }

    }








