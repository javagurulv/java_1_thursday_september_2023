package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.lessoncode;

class BankAccount {
private String ownerName;
private int moneyAmount;

public BankAccount(String ownerName, int moneyAmount){
    this.ownerName = ownerName;
    this.moneyAmount = moneyAmount;
}
public String getOwnerName() {
    return this.ownerName;
}
public int getMoneyAmount(){
    return this.moneyAmount;
}


}
