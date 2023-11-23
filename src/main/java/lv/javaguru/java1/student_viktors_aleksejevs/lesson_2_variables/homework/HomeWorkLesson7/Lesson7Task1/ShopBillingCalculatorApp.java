package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson7.Lesson7Task1;

public class ShopBillingCalculatorApp {
    public static void main(String[] args) {
        ShopBillingCalculator shopBillingCalculator = new ShopBillingCalculator();
        int [] billing = shopBillingCalculator.billingQuantity();

        billing[0] = 100;
        billing[1] = 200;
        billing[2] = 400;
        billing[3] = 600;
        billing[4] = 800;
        billing[5] = 1000;
        billing[6] = 1200;
        billing[7] = 1400;
        billing[8] = 800;
        billing[9] = 250;


        int sum = shopBillingCalculator.calculateSum(billing);
        System.out.println("Sum = " + sum);

        double average = shopBillingCalculator.calculateAverage(sum, billing.length);
        System.out.println("Average = " + average);
    }

}
