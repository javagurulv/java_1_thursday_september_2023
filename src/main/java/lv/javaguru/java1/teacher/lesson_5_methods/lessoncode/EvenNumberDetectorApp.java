package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class EvenNumberDetectorApp {

    public static void main(String[] args) {
        int number = 4525433;
        boolean isEven = (number % 2) == 0;
        System.out.println("Number is even = " + isEven);

        EvenNumberDetector evenNumberDetector = new EvenNumberDetector();
        System.out.println("Number is even = " + evenNumberDetector.isEven(12));
        System.out.println("Number is even = " + evenNumberDetector.isEven(13));
        System.out.println("Number is even = " + evenNumberDetector.isEven(15));
    }

}
