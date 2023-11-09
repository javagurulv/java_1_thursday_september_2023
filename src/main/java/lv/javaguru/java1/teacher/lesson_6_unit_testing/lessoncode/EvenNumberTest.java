package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class EvenNumberTest {

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.testEvenNumber();
        test.testOddNumber();
    }

    public void testEvenNumber() {
        // 1. Подготовка тестовых данных
        // - input      4
        // - output/result = true
        int number = 4;

        // 2. Вызываем продакшн код
        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(number);

        // 3. Сравниваем ожидаемый с полученным результатом
        if (result == true) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }
    }

    public void testOddNumber() {
        // 1. Подготовка тестовых данных
        // - input      5
        // - output/result = false
        int number = 5;

        // 2. Вызываем продакшн код
        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(number);

        // 3. Сравниваем ожидаемый с полученным результатом
        if (result == false) {
            System.out.println("TEST OK!");
        } else {
            System.out.println("TEST FAIL!");
        }
    }

}
