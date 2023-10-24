package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_7_senior;

class BankAccount {
    private String owner;
    private int money;

    public BankAccount(String owner, int money) {
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
