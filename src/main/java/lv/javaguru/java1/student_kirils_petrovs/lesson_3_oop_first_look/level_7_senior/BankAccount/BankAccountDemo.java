package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.BankAccount;

class BankAccountDemo {

        public static void main(String[] args) {


            BankAccount bankAccount = new BankAccount("Viktor", 100000);




            String owner = bankAccount.getOwner();
            int money = bankAccount.getMoney();




            System.out.println("Owner = " + owner);
            System.out.println("Money = " + money);
        }

    }




