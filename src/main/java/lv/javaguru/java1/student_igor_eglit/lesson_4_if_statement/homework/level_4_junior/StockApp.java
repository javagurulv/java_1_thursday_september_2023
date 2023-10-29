package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework.level_4_junior;

public class StockApp {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        System.out.println("Company = " + google.getCompanyName());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinimumPrice());
        System.out.println("Max Price = " + google.getMaximumPrice());

        for (int i = 0; i < 10; i++) {
            google.newPrice();
            System.out.println("Company = " + google.getCompanyName());
            System.out.println("Current Price = " + google.getCurrentPrice());
            System.out.println("Min Price = " + google.getMinimumPrice());
            System.out.println("Max Price = " + google.getMaximumPrice());
        }
    }
}

