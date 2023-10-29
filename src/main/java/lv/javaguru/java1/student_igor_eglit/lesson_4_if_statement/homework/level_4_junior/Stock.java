package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework.level_4_junior;

import java.util.Scanner;

class Stock {
    private String companyName;
    private int currentPrice;
    private int minimumPrice;
    private int maximumPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minimumPrice = currentPrice;
        this.maximumPrice = currentPrice;
    }

    public void newPrice() {
        System.out.println();
        System.out.print("Enter new stock price: ");
        this.currentPrice = new Scanner(System.in).nextInt();
       if (currentPrice<minimumPrice) {
           minimumPrice=currentPrice;
       }
       if (currentPrice>maximumPrice) {
       maximumPrice=currentPrice;
       }

    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getMinimumPrice() {
        return minimumPrice;
    }

    public int getMaximumPrice() {
        return maximumPrice;
    }
}
