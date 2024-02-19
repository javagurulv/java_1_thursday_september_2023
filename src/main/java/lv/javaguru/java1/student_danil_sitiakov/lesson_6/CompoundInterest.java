package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

class CompoundInterest {

    double comInterest(double sum, double yearRate, int year){
        return  sum * (Math.pow ((1 + yearRate/100), year));

    }

}
