package lv.javaguru.java1.student_artjoms_potasevskis.lesson_4.level_4;

class StockApp {

    public static void main(String[] args){


     Stock apple = new Stock("Appe", 100);

        System.out.println("Company = " + apple.getCompany());
        System.out.println("Current Price = " + apple.getCurrentPrice());
        System.out.println("Min Price = " + apple.getMinPrice());
        System.out.println("Max Price = " + apple.getMaxPrice());

        apple.updatePrice(154);
        apple.updatePrice(723);
        apple.updatePrice(95);

        System.out.println("Company = " + apple.getCompany());
        System.out.println("Current Price = " + apple.getCurrentPrice());
        System.out.println("Min Price = " + apple.getMinPrice());
        System.out.println("Max Price = " + apple.getMaxPrice());
    }
}

