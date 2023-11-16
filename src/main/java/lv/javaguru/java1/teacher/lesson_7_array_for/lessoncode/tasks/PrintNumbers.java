package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode.tasks;

class PrintNumbers {

    public String collectNumbersToString() {
        // i = i + 1
        // i++
        String str = "";

        for (int i = 1; i <= 10; i++) {
            str = str + i;
            str = str + " ";
        }

        return str;
    }

}
