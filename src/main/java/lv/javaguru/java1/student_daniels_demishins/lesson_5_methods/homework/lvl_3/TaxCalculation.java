package lv.javaguru.java1.student_daniels_demishins.lesson_5_methods.homework.lvl_3;

class TaxCalculation {

    String Tax(int a) {
        if (a > 0 && a <= 10000) {
            return a + " euro = nalog 30%";
        } else if (a >= 10001 && a <= 50000) {
            return a + " euro = nalog 40%";
        } else if( a>50001){
            return a + " euro = nalog 50%";
        } else{
            return a + " euro.  Wrong sum!";
        }
    }
}
