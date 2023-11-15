package lv.javaguru.java1.student_milans_micko.lesson_5_methods.lessoncode;

public class MaxNumberApp {

    public static void main(String[] args) {
        MaxNumber maxNumber = new MaxNumber();

        System.out.println("Max(2,2) = " + maxNumber.findMax(2, 2));
        System.out.println("Max(3,5) = " + maxNumber.findMax(3, 5));
        System.out.println("Max(5,7) = " + maxNumber.findMax(5, 7));

        System.out.println("Max(5,4,7) = " + maxNumber.findMaxOfThree(5,4,7));
        System.out.println("Max(10,3,7) = " + maxNumber.findMaxOfThree(10,3,7));
        System.out.println("Max(4,8,10) = " + maxNumber.findMaxOfThree(4,8,10));
    }
}
