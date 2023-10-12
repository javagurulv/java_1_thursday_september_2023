package lv.javaguru.java1.teacher.lesson_2_variables.lessoncode;

public class CalculatorDouble {

    // 1 bit (0/1)
    // 8 bit = 1 byte
    // 1024 byte = 1Kbyte
    // 1024 kbyte = 1Mbyte
    // 1024 Mbyte = 1Gb

    public static void main(String[] args) {
        // float value1 = 1.3F;  // 4 byte
        // double value2 = 1.4;  // 8 byte

        // 1.33333333333333333 333333333333333333333

        // int  - 4 byte
        // long - 8 byte  - 2 (63) - 2 (63)

        double number1 = 10.0;
        double number2 = 6.0;

        double result = number1 + number2;
        System.out.println("Plus = " + result);

        result = number1 - number2;
        System.out.println("Minus = " + result);

        result = number1 * number2;
        System.out.println("Multiply = " + result);

        result = number1 / number2;
        System.out.println("Division = " + result);


        // BigDecimal

    }


}
