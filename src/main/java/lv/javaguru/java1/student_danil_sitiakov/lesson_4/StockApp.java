package lv.javaguru.java1.student_danil_sitiakov.lesson_4;

class StockApp {
     public static void main(String[] args) {
         Stock apple = new Stock("Apple",10);

         System.out.println(apple.getCompany());
         System.out.println(apple.getCurrentPrice());
         System.out.println(apple.getMaxPrice());
         System.out.println(apple.getMinPrice());

         apple.updatePrice(15);
         apple.updatePrice(7);
         apple.updatePrice(13);

         System.out.println("Company = " + apple.getCompany());
         System.out.println("Current Price = " + apple.getCurrentPrice());
         System.out.println("Min Price = " + apple.getMinPrice());
         System.out.println("Max Price = " + apple.getMaxPrice());

     }
}
