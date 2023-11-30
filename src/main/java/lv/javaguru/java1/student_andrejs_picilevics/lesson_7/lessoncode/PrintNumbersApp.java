package lv.javaguru.java1.student_andrejs_picilevics.lesson_7.lessoncode;

public class PrintNumbersApp {

    public static void main(String[] args) {
    PrintNumbers printNumbers = new PrintNumbers();
    String str1 = printNumbers.printNumbers(1000);
    String str2 = printNumbers.printNumbers(20);
        System.out.print(str1);
        System.out.print(str2);
    }
}
