package lv.javaguru.java1.student_valera_kovs.lesson_1_introduction.lessoncode;

import lv.javaguru.java1.student_daniels_demishins.lesson_2_variables.homework.lvl_4.SystemOutPrint;

public class BankAccauntApp {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasja", 0);
        BankAccount bankAccount2 = new BankAccount("Petja", 10);
        BankAccount bankAccount3 = new BankAccount("Irina", 1000);

        System.out.println("Owner = " + bankAccount1.getOwnerName());
        System.out.println("Owner = " + bankAccount2.getOwnerName());
        System.out.println("Owner = " + bankAccount3.getOwnerName());

        System.out.println("Money = " + bankAccount1.getMoneyAmount());
        System.out.println("Money = " + bankAccount2.getMoneyAmount());
        System.out.println("Money = " + bankAccount3.getMoneyAmount());

    }

}