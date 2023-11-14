package lv.javaguru.java1.student_valera_kovs.lesson6.lesson6.lvl2;


public class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest MaxOfThreeNumbersTest = new MaxOfThreeNumbersTest();
        MaxOfThreeNumbersTest.testCase1();
        MaxOfThreeNumbersTest.testCase2();

    }
    public void testCase1(){
        MaxOfThreeNumbers maxNumber = new MaxOfThreeNumbers();
        int result = maxNumber.findMax(7,5,9);
        if (result == 7) {
            System.out.println("Test 1 = OK");
        }else {
            System.out.println("Test 1 = FAIL");
        }
    }
    public void testCase2(){
        MaxOfThreeNumbers MaxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = MaxOfThreeNumbers.findMax(8,2,5);
        if (result == 8) {
            System.out.println("Test 2 = OK");
        }else {
            System.out.println("Test 2 = FAIL");
        }
    }
}
