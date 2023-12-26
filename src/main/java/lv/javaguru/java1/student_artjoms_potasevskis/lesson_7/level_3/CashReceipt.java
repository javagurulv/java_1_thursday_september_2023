package lv.javaguru.java1.student_artjoms_potasevskis.lesson_7.level_3;

class CashReceipt {

    private String number;

    private double summa;

    public CashReceipt(String number, double summa){
        this.number = number;
        this.summa = summa;
    }

    public String getNumber(){
        return number;
    }
    public double getSumma(){
        return summa;
    }
}
