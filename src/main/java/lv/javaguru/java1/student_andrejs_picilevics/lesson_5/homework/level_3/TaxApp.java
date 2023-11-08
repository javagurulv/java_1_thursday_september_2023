package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_3;

public class TaxApp {
    public static void main(String[] args) {
        Tax tax = new Tax();
        System.out.println(tax.getTax(10500));
        System.out.println(tax.getTax(10000));
        System.out.println(tax.getTax(51000));
        System.out.println(tax.getTax(40000));
        System.out.println(tax.getTax(25000));
    }
}
