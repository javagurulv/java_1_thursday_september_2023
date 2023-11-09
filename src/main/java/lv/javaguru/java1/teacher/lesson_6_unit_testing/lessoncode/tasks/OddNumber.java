package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode.tasks;

class OddNumber {

    // test case 1: number = 7; expected result = true
    // test case 2: number = 2; expected result = false
    // -- test case 3: number = 5; expected result = true
    // -- test case 4: number = 4; expected result = false

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
