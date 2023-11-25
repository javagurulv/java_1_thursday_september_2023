package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_3_junior;

class CashCheckAppTest {
    public static void main(String[] args) {
        CashCheckAppTest cashCheckAppTest = new CashCheckAppTest();
        cashCheckAppTest.sumOfCheckValuesTest();
        cashCheckAppTest.middleValueOfChecksTest();

    }
    private static void resultDisplay(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " confirmed, OK");
        }else {
            System.out.println(testName + " failed");
        }
    }
    public CashCheck[] arrayCashCheck(){
        CashCheck[] cashChecks = {
                new CashCheck("gd45",12.56f),
                new CashCheck("gp12", 23.78f),
                new CashCheck("gd21", 32.74f)
        };
        return cashChecks;
    }

    public void sumOfCheckValuesTest(){
        CashCheckApp cashCheckApp = new CashCheckApp();
        float realResult = cashCheckApp.sumOfCheckValues(arrayCashCheck());
        resultDisplay(69.08f,realResult,"Test sumOfCheckValuesTest was ");
    }
    public void middleValueOfChecksTest(){
        CashCheckApp cashCheckApp = new CashCheckApp();
        float realResult = cashCheckApp.middleValueOfChecks(arrayCashCheck());
        resultDisplay(23.026667f, realResult,"Test middleValueOfChecksTest was ");
    }
}
