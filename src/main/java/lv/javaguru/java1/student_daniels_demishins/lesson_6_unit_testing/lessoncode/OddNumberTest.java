package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.lessoncode;

class OddNumberTest {
    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.shouldBeOdd();
        test.shouldNotBeOdd();

    }

    void shouldBeOdd() {
        OddNumber oddNumber = new OddNumber();
        boolean isOdd = oddNumber.isOdd(7);
        if (isOdd == true) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }
    }

    void shouldNotBeOdd() {
        OddNumber oddNumber = new OddNumber();
        boolean isOdd = oddNumber.isOdd(8);
        if (isOdd == false) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }
    }
}
