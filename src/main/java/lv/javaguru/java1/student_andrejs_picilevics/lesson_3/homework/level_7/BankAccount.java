package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_7;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner,int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
