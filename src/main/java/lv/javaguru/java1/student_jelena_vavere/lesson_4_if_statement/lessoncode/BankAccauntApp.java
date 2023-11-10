package lv.javaguru.java1.student_jelena_vavere.lesson_4_if_statement.lessoncode;

class BankAccauntApp {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Vasja" , 0);
        BankAccount bankAccount2 = new BankAccount("Petja" , 10);
        BankAccount bankAccount3 = new BankAccount("Irina" , 1000);

        System.out.println(" Owner = " + bankAccount1.getOwnerName());
        System.out.println(" Owner = " + bankAccount2.getOwnerName());
        System.out.println(" Owner = " + bankAccount3.getOwnerName());

        System.out.println(" Money = " + bankAccount3.getMoneyAmount());
        System.out.println(" Money = " + bankAccount3.getMoneyAmount());
        System.out.println(" mONEY = " + bankAccount3.getMoneyAmount());


    }
}
