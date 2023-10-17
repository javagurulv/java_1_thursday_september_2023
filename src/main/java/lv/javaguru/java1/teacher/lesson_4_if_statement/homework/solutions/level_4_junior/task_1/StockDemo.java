package lv.javaguru.java1.teacher.lesson_4_if_statement.homework.solutions.level_4_junior.task_1;

class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        System.out.println("Company = " + google.getCompany());
        System.out.println("Current Price = " + google.getCurrentPrice());
        System.out.println("Min Price = " + google.getMinPrice());
        System.out.println("Max Price = " + google.getMaxPrice());
    }

}
