package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_3_junior;

class CashCheckApp {
    float sumOfCheckValues(CashCheck[] cashCheck) {
        float sum=0;
        for (int i = 0; i < cashCheck.length; i++) {
            CashCheck value = cashCheck[i];
            sum+=value.getCheckValue();
        }
        return sum;
    }
    public float middleValueOfChecks(CashCheck[] cashChecks) {
        float result = 0;
        if (cashChecks.length == 0) {
            System.out.println("no Checks in records");
        } else {
            result = sumOfCheckValues(cashChecks) / cashChecks.length;
        }
        return result;
    }
}
