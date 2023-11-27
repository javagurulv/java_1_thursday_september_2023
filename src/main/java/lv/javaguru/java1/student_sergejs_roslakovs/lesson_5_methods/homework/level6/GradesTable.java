package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level6;

public class GradesTable {

    private String sName;
    private int[] iGradeListMathematics;
    private int[] iGradeListPhysics;
    private int[] iGradeListChemistry;
    private int[] iGradeListBiology;
    private int[] iGradeListEnglish;
    private int[] iGradeListAlcoholism;

    public GradesTable (String sName,
                        int[] iGradeListMathematics,
                        int[] iGradeListPhysics,
                        int[] iGradeListChemistry,
                        int[] iGradeListBiology,
                        int[] iGradeListEnglish,
                        int[] iGradeListAlcoholism) {
        this.sName = sName;
        this.iGradeListMathematics = iGradeListMathematics;
        this.iGradeListPhysics = iGradeListPhysics;
        this.iGradeListChemistry = iGradeListChemistry;
        this.iGradeListBiology = iGradeListBiology;
        this.iGradeListEnglish = iGradeListEnglish;
        this.iGradeListAlcoholism = iGradeListAlcoholism;
    }

    public String getName() {
        return this.sName;
    }

    public int[] getGradeListMathematics() {
        return this.iGradeListMathematics;
    }

    public int[] getGradeListPhysics() {
        return this.iGradeListPhysics;
    }

    public int[] getGradeListChemistry() {
        return this.iGradeListChemistry;
    }

    public int[] getGradeListBiology() {
        return this.iGradeListBiology;
    }

    public int[] getGradeListEnglish() {
        return this.iGradeListEnglish;
    }

    public int[] getGradeListAlcoholism() {
        return this.iGradeListAlcoholism;
    }

    public double getAverageGrade(int[] fGradesList) {
        double fAverageGrade = 0.0;
        for (int i = 0; i < fGradesList.length; i++) {
            fAverageGrade = fAverageGrade + fGradesList[i];
        }
        return fAverageGrade/fGradesList.length;
    }

}
