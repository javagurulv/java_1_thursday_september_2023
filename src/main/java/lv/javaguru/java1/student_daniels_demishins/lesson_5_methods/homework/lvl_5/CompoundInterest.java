package lv.javaguru.java1.student_daniels_demishins.lesson_5_methods.homework.lvl_5;

class CompoundInterest {

    double comInterest(double sum, double yearRate, int year){
        return  sum * (Math.pow ((1 + yearRate/100), year));

    }

}
