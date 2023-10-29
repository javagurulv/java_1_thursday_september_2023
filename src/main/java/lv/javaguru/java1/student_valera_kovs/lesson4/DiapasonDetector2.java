package lv.javaguru.java1.student_valera_kovs.lesson4;

import java.util.Scanner;
public class DiapasonDetector2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  number: ");
        int number = scanner.nextInt();

        if ((number < -1 || (number > 1))) {
            System.out.println("Number is in right diapason");
        }else{
            System.out.println("Number is in wrong diapason");
        }
    }

}
