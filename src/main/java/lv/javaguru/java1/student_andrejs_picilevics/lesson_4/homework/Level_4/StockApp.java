package lv.javaguru.java1.student_andrejs_picilevics.lesson_4.homework.Level_4;

class StockApp {
    public static void main(String[] args) {
        Stock akcija = new Stock("Apple", 10);
        System.out.println("\nCompany = " + akcija.getCompanyName());
        System.out.println("Current Price = " + akcija.getCurrentPrice());
        System.out.println("Min Price = " + akcija.getMinPrice());
        System.out.println("Max Price = " + akcija.getMaxPrice());

        akcija.updatePrice(15);
        akcija.updatePrice(7);
        akcija.updatePrice(14);

        System.out.println("\nCompany = " + akcija.getCompanyName());
        System.out.println("Current Price = " + akcija.getCurrentPrice());
        System.out.println("Min Price = " + akcija.getMinPrice());
        System.out.println("Max Price = " + akcija.getMaxPrice());
    }
}
