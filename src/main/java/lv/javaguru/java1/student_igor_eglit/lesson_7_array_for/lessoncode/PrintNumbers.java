package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.lessoncode;

class PrintNumbers {
    public String collectNumbersToString(int numberFrom, int numberTo) {
        String str = "";
        for (int i = numberFrom; i <= numberTo; i++) {
            str = str + i;
            str = str + " ";
        }
        return str;
    }
}
