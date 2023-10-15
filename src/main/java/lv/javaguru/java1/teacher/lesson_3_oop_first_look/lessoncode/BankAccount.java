package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

public class BankAccount {

    String owner;
    int moneyAmount;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.moneyAmount = moneyAmount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}
