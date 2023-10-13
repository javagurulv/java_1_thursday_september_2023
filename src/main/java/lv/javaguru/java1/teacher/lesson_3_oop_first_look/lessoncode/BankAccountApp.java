package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount alexBankAccount = new BankAccount("Alex Ivanov", 1000);
        BankAccount viktorsBankAccount = new BankAccount("Viktors Savonin", 2000000);

//        alexBankAccount.owner = "Aleksandrs Ivanovs";
//        alexBankAccount.moneyAmount = 1000;
        System.out.println("Alex Account values are:");
        System.out.println(alexBankAccount.getOwner());
        System.out.println(alexBankAccount.getMoneyAmount());

        int alexBankAccountMoneyAmount = alexBankAccount.getMoneyAmount();
        System.out.println(alexBankAccountMoneyAmount);

        System.out.println("Viktors Account values are:");
        System.out.println(viktorsBankAccount.getOwner());
        System.out.println(viktorsBankAccount.getMoneyAmount());
    }
}
