package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_4_junior.task_2;

class FactorialRecursion {

    public int factorial(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

}
