package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class BankAccountApplication {

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
