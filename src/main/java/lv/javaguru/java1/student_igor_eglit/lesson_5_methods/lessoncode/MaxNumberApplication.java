package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.lessoncode;

public class MaxNumberApplication {
    public static void main(String[] args) {
        MaxNumber maxNumber=new MaxNumber();
        System.out.println("2 and 3 = "+maxNumber.findMax(2,3));
        System.out.println("8 and 3 = "+maxNumber.findMax(8,3));
        System.out.println("8 and 11 = "+maxNumber.findMax(8,11));
        System.out.println();
        System.out.println("5, 3, 7 = "+maxNumber.findMax3(5,3,7));
    }
}
