package lv.javaguru.java1.student_jelena_vavere.lesson_4_if_statement.lessoncode;

 class BankAccount {

     private String ownerName;
     private int moneyAmount;

     public BankAccount(String ownerName, int moneyAmount) {
         this.ownerName = ownerName;
         this.moneyAmount = moneyAmount;
     }

     public String getOwnerName() {
         return this.ownerName;
     }

     public int getMoneyAmount() {
         return this.moneyAmount;
     }
 }