package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class MaxNumberApplication {

    public static void main(String[] args) {
        MaxNumber maxNumber = new MaxNumber();

        System.out.println("Max(2,2) = " + maxNumber.findMax(2,2));
        System.out.println("Max(2,3) = " + maxNumber.findMax(2,3));
        System.out.println("Max(5,3) = " + maxNumber.findMax(5,3));
    }

}
