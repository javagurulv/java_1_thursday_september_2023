package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level6;

public class AverageTotalGradeCalc {

    public double AverageTotalGradeCalc(GradesTable studentGradesTable) {
        return (studentGradesTable.getAverageGrade(studentGradesTable.getGradeListMathematics()) +
                studentGradesTable.getAverageGrade(studentGradesTable.getGradeListPhysics()) +
                studentGradesTable.getAverageGrade(studentGradesTable.getGradeListChemistry()) +
                studentGradesTable.getAverageGrade(studentGradesTable.getGradeListBiology()) +
                studentGradesTable.getAverageGrade(studentGradesTable.getGradeListEnglish()) +
                studentGradesTable.getAverageGrade(studentGradesTable.getGradeListAlcoholism())) / 6;
    }

}
