package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

public class BankAccountSetterApp {

    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Alex Ivanov", 1000);
        BankAccount viktorsBankAccount = new BankAccount("Viktors Savonin", 2000000);

        System.out.println("Alex Account values are:");
        System.out.println(alexBankAccount.getOwner());
        System.out.println(alexBankAccount.getMoneyAmount());

        alexBankAccount.setMoneyAmount(500);
        System.out.println(alexBankAccount.getMoneyAmount());

        alexBankAccount.setOwner("Alex Doe");
        System.out.println(alexBankAccount.getOwner());
    }
}
