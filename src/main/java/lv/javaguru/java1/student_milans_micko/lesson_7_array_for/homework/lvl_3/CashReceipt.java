package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.homework.lvl_3;

class CashReceipt {
    //1 sumOfSoldItems
    //2 averageReceipt
    //3 CashReceipt - int number; double amount
    //4 result= print totalSoldSum & averagePurchasePrice

    String number;
    double sum;

    public CashReceipt(String number, double sum) {
        this.number = number;
        this.sum = sum;
    }

    public String getNumber() {
        return number;
    }

    public double getSum() {
        return sum;
    }

}
