package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.lessoncode;

class PrintNumbersApp {
    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        String str = printNumbers.collectNumbersToString(1, 10);
        System.out.println(str);
    }
}
