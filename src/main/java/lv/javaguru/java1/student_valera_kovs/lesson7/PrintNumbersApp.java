package lv.javaguru.java1.student_valera_kovs.lesson7;

class PrintNumbersApp {

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        String str = printNumbers.collectNumbersToString(1, 10);
        System.out.println(str);
    }
}
