package lv.javaguru.java1.student_valera_kovs.lesson7;

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
