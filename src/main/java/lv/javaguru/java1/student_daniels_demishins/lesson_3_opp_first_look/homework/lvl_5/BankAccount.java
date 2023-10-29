package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_5;

public class BankAccount {

    private String ownerFirstName;
    private String ownerLastName;
    private int moneyAmount;

    BankAccount(String ownerFirstName,
                String ownerLastName,
                int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    String getOwnerLastName() {
        return this.ownerLastName;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }
}
