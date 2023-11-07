package lv.javaguru.java1.student_daniels_demishins.lesson_5_methods.homework.lvl_1;

class FizzBuzz {


    private boolean isDivined3(int num1) {
        return num1 % 3 == 0;
    }

    private boolean isDivined5(int num2) {
        return num2 % 5 == 0;
    }

    protected String FizzBuzzDetect(int a) {
        if (isDivined3(a)) {
            return "Fizz";

        } else if (isDivined5(a)) {
            return "Buzz";

        } else if (isDivined3(a) && isDivined5(a)) {
            return "FizzBUZZ";
        } else {
            return "" + a;
        }

    }
}

