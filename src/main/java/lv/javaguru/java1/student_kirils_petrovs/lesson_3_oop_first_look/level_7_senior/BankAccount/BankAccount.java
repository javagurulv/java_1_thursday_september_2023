package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.BankAccount;

class BankAccount {
        private String owner;


        private int Money;

        BankAccount(String owner,int moneyAmount) {


            this.owner = owner;
            this.Money = moneyAmount;




        }

    public String getOwner() {
        return owner;
    }

    public int getMoney() {
        return Money;
    }
}

