package lv.javaguru.java1.student_jelena_vavere.lesson_7_array_for.lessoncode;
 class MaxGradeApp {
     public static void main(String[] args) {
         int [] grades = new int[5];
         grades[0] = 7;
         grades[1] = 8;
         grades[2] = 9;
         grades[3] = 3;
         grades[4] = 5;
         MaxGrade maxGrade = new MaxGrade();
         System.out.println(maxGrade.findMaxGrade(grades));
     }
}
