package lv.javaguru.java1.student_valera_kovs.lesson5.lvl3;

public class homework1 {

    public void cash (int borrower ) {

        int cash = 10000;
        int cash2 = 50000;

        if (borrower <= 10000 ){
            System.out.println("0,3");
        }

        if (10000 <= borrower && borrower <= 50000){
            System.out.println("0,4");
        }

        if (cash2 <= borrower ){
            System.out.println("0,5");
        }


    }
}