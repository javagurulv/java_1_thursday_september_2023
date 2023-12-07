package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode.Lesson8;

public class SumCalculator {
    // sum = sum + 1
    // i = 2
   public int CalculateSum(int start, int end){
       int sum = 0;
       for (int i = start; i <= end; i++) {
           sum = sum + i;
       }
           return sum;
       }
   }


