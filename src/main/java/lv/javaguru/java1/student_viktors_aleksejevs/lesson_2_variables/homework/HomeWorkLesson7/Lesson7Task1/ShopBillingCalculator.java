package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson7.Lesson7Task1;

class ShopBillingCalculator {
    public int[] billingQuantity() {
        int[] billing = new int[10];

        for (int i = 0; i < billing.length; i++) {
            billing[i] = 0;
        }

        return billing;
    }

    public int calculateSum(int[] billing) {
        int sum = 0;
        for (int i = 0; i < billing.length; i++) {
            sum = sum + billing[i];
        }
        return sum;
    }

    public double calculateAverage(int sum, int billingLength) {
        return (double) sum / billingLength;


    }
}