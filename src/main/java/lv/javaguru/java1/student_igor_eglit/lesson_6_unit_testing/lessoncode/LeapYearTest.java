package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.lessoncode;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.testCase1();
        leapYearTest.testCase2();

    }

    //test case 1 : 2020: expected result true
    //test case 2 : 2011 : expected result false
    public void testCase1() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeap(2020);
        if (result) {
            System.out.println("TEST CASE 1 = OK");
        } else {
            System.out.println("TEST CASE 1 = FAIL");
        }
    }
    public void testCase2() {
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeap(2011);
        if (!result) {
            System.out.println("TEST CASE 2 = OK");
        } else {
            System.out.println("TEST CASE 2 = FAIL");
        }
    }
}
