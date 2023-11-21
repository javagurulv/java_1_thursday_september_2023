package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.lessoncode;

class PrintNumbers {

    public String collectNumbersToString(int numberFrom, int numberTo) {
        // i = i + 1
        // i++
        String str = "";

        for (int i = numberFrom; i <= numberTo; i++) {
            str = str + i;
            str = str + " ";
        }

        return str;
    }

}
