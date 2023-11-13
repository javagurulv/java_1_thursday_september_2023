package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level1;

class FizzBuzz {
    public void convert(int number) {
        if (isDivisibleByThreeAndFive(number)) {
            System.out.println("FizzBuzz");
        } else if (isDivisibleByThree(number)) {
            System.out.println("Fizz");
        } else if (isDivisibleByFive(number)) {
            System.out.println("Buzz");
        } else {
            System.out.println("" + number);
        }
    }

    private boolean isDivisibleByThreeAndFive(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    private boolean isDivisibleByThree(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }


}








