package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.lessoncode.lessoncode;

import lv.javaguru.java1.student_milans_micko.lesson_7_array_for.lessoncode.lessoncode.PrintNumbers;

class PrintNumbersApp {

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();

        // 10
        String str1 = printNumbers.collectNumbersToString(1, 10);

        // 1000
        String str2 = printNumbers.collectNumbersToString(990, 1000);

        System.out.println(str1);
        System.out.println(str2);
    }

}
