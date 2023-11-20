package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode;

class SumFrom1To100Test {

    public static void main(String[] args) {
        SumFrom1To100Test test = new SumFrom1To100Test();
        test.test();
        test.testV2();
        test.testV3();
    }

    public void test() {
        SumFrom1To100 sumFrom1To100 = new SumFrom1To100();
        int sum = sumFrom1To100.sumOfNumbers();
        if (sum == 5050) {
            System.out.println("OK!");
        } else {
            System.out.println("FAIL!");
        }
    }

    public void testV2() {
        SumFrom1To100 sumFrom1To100 = new SumFrom1To100();
        int sum = sumFrom1To100.sumOfNumbers(1, 100);
        if (sum == 5050) {
            System.out.println("OK!");
        } else {
            System.out.println("FAIL!");
        }
    }

    public void testV3() {
        SumFrom1To100 sumFrom1To100 = new SumFrom1To100();
        int sum = sumFrom1To100.sumOfNumbers(50, 90);
        if (sum == 5050) {
            System.out.println("OK!");
        } else {
            System.out.println("FAIL!");
        }
    }

}
