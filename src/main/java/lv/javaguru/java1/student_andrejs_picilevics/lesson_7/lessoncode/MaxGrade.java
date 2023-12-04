package lv.javaguru.java1.student_andrejs_picilevics.lesson_7.lessoncode;

 class MaxGrade {
     public int findMaxGrade(int[]grades){
         int maxNumber = grades[0];

         for(int i = 0; i < grades.length; i++){
             if(grades[i] > maxNumber){
                 maxNumber=grades[i];
             }

             
         }
         return maxNumber;

     }

}
