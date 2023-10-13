package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_7_senior.task_2;

class BankAccount {

    private String owner;
    private int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}
