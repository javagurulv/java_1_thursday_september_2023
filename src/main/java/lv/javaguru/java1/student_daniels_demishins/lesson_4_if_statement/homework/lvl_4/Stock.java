package lv.javaguru.java1.student_daniels_demishins.lesson_4_if_statement.homework.lvl_4;

 class Stock {

     private String company;
     private int currentPrice;
     private int minPrice;
     private int maxPrice;

     public Stock(String company, int currentPrice, int minPrice, int maxPrice) {
         this.company = company;
         this.currentPrice = currentPrice;
         this.minPrice = minPrice;
         this.maxPrice = maxPrice;
     }

     public String getCompany() {
         return company;
     }

     public int getCurrentPrice() {
         return currentPrice;
     }

     public int getMinPrice() {
         return minPrice;
     }

     public int getMaxPrice() {
         return maxPrice;
     }

     void updatePrice(int newPrice){
         
     }
 }
