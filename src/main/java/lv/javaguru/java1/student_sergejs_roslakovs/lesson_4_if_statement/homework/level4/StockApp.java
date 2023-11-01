package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.homework.level4;

public class StockApp {

    public static void main(String[] args) {


        Stock google = new Stock("GOOG", 10);

        System.out.println("Company = " + google.getCompanyName());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        System.out.println("Company = " + google.getCompanyName());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

    }


}
