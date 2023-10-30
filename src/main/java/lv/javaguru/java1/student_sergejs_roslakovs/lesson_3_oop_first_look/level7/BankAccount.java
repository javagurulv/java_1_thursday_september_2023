package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.level7;

class BankAccount {
    private String owner;
    private int money;

    BankAccount(String owner , int money) {
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
