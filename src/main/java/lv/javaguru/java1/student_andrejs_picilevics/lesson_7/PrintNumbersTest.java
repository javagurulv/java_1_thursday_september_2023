package lv.javaguru.java1.student_andrejs_picilevics.lesson_7;

public class PrintNumbersTest {

    public static void main(String[] args) {
        PrintNumbersTest test = new PrintNumbersTest();
        test.testCase1();
    }

    public void testCase1() {
        PrintNumbers numbers = new PrintNumbers();
        String str = numbers.printNumbers(1000);
        if (str.equals("1 2 3 4 5 6 7 8 9 10")){
            System.out.println("TEST OK");
        }else {
            System.out.println("TEST FALSE");
        }

    }
}
