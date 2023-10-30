package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_5_middle.bankAccount;

public class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private int MoneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.MoneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public int getMoneyAmount() {
        return MoneyAmount;
    }
}
