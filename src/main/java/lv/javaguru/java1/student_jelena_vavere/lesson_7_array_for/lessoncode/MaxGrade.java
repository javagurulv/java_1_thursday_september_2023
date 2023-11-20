package lv.javaguru.java1.student_jelena_vavere.lesson_7_array_for.lessoncode;

 class MaxGrade {
     public int findMaxGrade(int []grades){
         int maxNumber = grades [0];
         for (int grade : grades) {
             if (grade > maxNumber) {
                 maxNumber = grade;
             }
         }
         return maxNumber;
     }
}
