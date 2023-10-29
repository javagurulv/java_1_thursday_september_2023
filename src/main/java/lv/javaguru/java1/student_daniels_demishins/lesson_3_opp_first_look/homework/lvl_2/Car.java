package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_2;

 class Car {

     private String brand;
     private String color;
     private int price;


     public Car(String brand, String color, int price) {
         this.brand = brand;
         this.color = color;
         this.price = price;
     }

     public String getBrand() {
         return brand;
     }

     public String getColor() {
         return color;
     }

     public int getPrice() {
         return price;
     }

     public void setBrand(String brand) {
         this.brand = brand;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public void setPrice(int price) {
         this.price = price;
     }
 }
