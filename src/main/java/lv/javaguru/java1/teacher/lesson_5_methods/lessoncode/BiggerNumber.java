package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

// BiggerNumber
// FindBigerNumber
// BigNumberAlgoritm
// WhichNumberIsBigger
// MaxNumberDetector

class BiggerNumber {

    // findBiggerNumber
    // findMax
    // findMaxNumber
    // findBigger
    // biggerNumber

    public int findBiggerNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {return number2;
        }
    }

    public int findBiggerNumberV2(int number1, int number2) {
        int result = number1;
        if (number1 > number2) {
            result = number1;
        } else {
            result = number2;
        }
        return result;
    }

    public int findBiggerNumberV3(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    public int findMax(int number1, int number2, int number3) {
        int max = findBiggerNumber(number1, number2);
        max = findBiggerNumber(max, number3);
        return max;
    }

}
