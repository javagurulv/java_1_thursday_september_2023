package lv.javaguru.java1.student_valera_kovs.lesson7;

class PrintNumbersTest {


    public static void main(String[] args) {
        PrintNumbersTest test = new PrintNumbersTest();
        test.testCase1();
    }

    public void testCase1() {
        PrintNumbers numbers = new PrintNumbers();
        String str = numbers.collectNumbersToString(1, 10);
        if (str.equals("1 2 3 4 5 6 7 8 9 10 ")) {
            System.out.println("Test Ok");
        } else {
            System.out.println("Test Fail");
        }
    }
}
