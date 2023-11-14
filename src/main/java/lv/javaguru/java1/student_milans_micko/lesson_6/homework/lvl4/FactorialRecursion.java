package lv.javaguru.java1.student_milans_micko.lesson_6.homework.lvl4;

class FactorialRecursion {

    public int factorial(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }

}
