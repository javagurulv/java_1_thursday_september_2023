package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_5;

public class CompoundInterestApp {

    public static void main(String[] args) {

        CompoundInterest compoundInterest = new CompoundInterest();

        System.out.println("Compound interest is " + compoundInterest.getCompoundInterest(1200,5.4,2));
        System.out.println("Compound interest is " + compoundInterest.getCompoundInterest(1000,2.2,12));
        System.out.println("Compound interest is " + compoundInterest.getCompoundInterest(3000,6.2,4));
        System.out.println("Compound interest is " + compoundInterest.getCompoundInterest(799,9.0,36));
    }
}
