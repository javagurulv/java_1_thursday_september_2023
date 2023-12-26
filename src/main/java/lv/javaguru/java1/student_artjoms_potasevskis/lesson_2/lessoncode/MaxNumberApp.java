package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.lessoncode;

public class MaxNumberApp {

    public static void main(String[] args) {

        MaxNumber maxNumber = new MaxNumber();

        System.out.println("Max number(2,2) = " + maxNumber.findMax(2,2));
        System.out.println("Max number(2,3) = " + maxNumber.findMax(2,3));
        System.out.println("Max number(5,3) = " + maxNumber.findMax(5,3));

        System.out.println("Max number(5,3,7) = " + maxNumber.findMax(5,3,7));
        System.out.println("Max number(10,3,7) = " + maxNumber.findMax(10,3,7));
        System.out.println("Max number(5,9,7) = " + maxNumber.findMax(5,9,7));
    }



}
