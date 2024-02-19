package lv.javaguru.java1.student_danil_sitiakov.lesson_5;

class FizzBuzzApp {
     public static void main(String[] args) {
         FizzBuzz fizzBuzz = new FizzBuzz();
         System.out.println("3 / 3 = "+fizzBuzz.FizzBuzzDetect(3));
         System.out.println("5 /5 = "+fizzBuzz.FizzBuzzDetect(5));
         System.out.println("15 / 3 && 5 = "+fizzBuzz.FizzBuzzDetect(15));
         System.out.println("11 !/ 3 && 5 = "+fizzBuzz.FizzBuzzDetect(11));
     }
}
