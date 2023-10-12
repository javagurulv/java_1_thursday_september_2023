package lv.javaguru.java1.student_milans_micko.lesson_2_variables.lessoncode;

public class CalculatorDouble {

    // 1 bit (0/1)
    // 8 bit = 1 byte
    // 1024 byte = 1Kbyte
    // 1024 Kbyte = 1Mbyte
    // 1024 Mbyte = 1Gb

    public static void main(String[] args) {
        //float value1 = 1.3F; // 4 byte
        //double value2 = 1.4; // 8 byte

        // int  - 4 byte
        // long - 8 byte

        double number1 = 1.534346;
        double number2 = 2.7;

        double result = number1 + number2;
        System.out.println("Plus = " + result);

        result = number1 - number2;
        System.out.println("Minus = " + result);

        result = number1 * number2;
        System.out.println("Multiply = " + result);

        result = number1 / number2;
        System.out.println("Division =" + result);

        // BigDecimal

        //double additionResult2 = number1 + number2;
        //double additionResult3 = number1 + number2;
        //double additionResult4 = number1 + number2;
        //double additionResult5 = number1 + number2;


        double subtractionResult = number1 - number2;
        double multiplicationResult = number1 * number2;
        double divisionResult = number1 / number2;
        System.out.println();
    }
}
