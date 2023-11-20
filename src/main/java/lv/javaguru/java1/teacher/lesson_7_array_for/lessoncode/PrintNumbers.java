package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode;

class PrintNumbers {

    public String createStringWithNumbers(int from, int to) {
        String str = "";
        for (int i = from; i <= to; i++) {
            str = str + i + " ";
        }
        return str;
    }


    public String createStringWithNumbersFrom1To10() {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str = str + i + " ";
        }
        return str;
    }

    public void printNumbersFrom1To10() {
        //i++
        // i = i + 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        PrintNumbers numbers = new PrintNumbers();
        numbers.printNumbersFrom1To10();

        System.out.println();

        String str = numbers.createStringWithNumbersFrom1To10();
        System.out.println(str);

        String str1 = numbers.createStringWithNumbers(1, 10);
        System.out.println(str1);

        String str2 = numbers.createStringWithNumbers(5, 20);
        System.out.println(str2);

    }

}
