package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level6;

public class AverageTotalGradeCalcDemo {

    public static void main(String[] args) {

        AverageTotalGradeCalc avgTotalGradeCalc = new AverageTotalGradeCalc();

        int[] arrayMathematics = {6,7,4,6,5};
        int[] arrayPhysics = {4,9,6,3,7};
        int[] arrayChemistry = {5,6,6,6,7,7,10};
        int[] arrayBiology = {6,5,1,9,7};
        int[] arrayEnglish = {9,10,9,2,10,10};
        int[] arrayAlcoholism = {10,10,10,10,10,10,10,10,10,10,10,10,10,10};

        GradesTable studentGradesTable1 = new GradesTable("Jack Daniels",
                arrayMathematics,
                arrayPhysics,
                arrayChemistry,
                arrayBiology,
                arrayEnglish,
                arrayAlcoholism
                );
        System.out.println("Student " + studentGradesTable1.getName() + " has average grade: " + avgTotalGradeCalc.AverageTotalGradeCalc(studentGradesTable1));

    }
}
