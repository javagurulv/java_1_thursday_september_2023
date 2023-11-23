package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_7;

class CompoundInterest {
    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
