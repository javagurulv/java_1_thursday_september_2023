package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode.Lesson9;

import java.io.InputStream;

public class MarkUI {
    private static MarkBusinessLogic bussinesLogic;

    public static void main(String [] args){
        System.out.println("1. add mark");
        System.out.println("2. find max mark");
        System.out.println("3. find max mark");
        System.out.println("4. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter menu item to execute: ");
        int menuItem = scanner.nextInt();
        if (menuItem == 1){
        System.out.println("Enter subject: ");
        String subject = scanner.nextLine();
        System.out.println("Enter mark value");
        int markvalue = scanner.nextInt();
            MarkBusinessLogic businessLogic = null;
            businessLogic.addMark(subject, markvalue);
        }
        if (menuItem == 2 ){

        }
        if (menuItem == 3){

        }
        if (menuItem == 4){

        }
        System.out.println("Finnished");
    }

    private static class Scanner {
        public Scanner(InputStream in) {

        }

        public int nextInt() {
            return 0;
        }

        public String nextLine() {
        return null;

        }
    }
}
