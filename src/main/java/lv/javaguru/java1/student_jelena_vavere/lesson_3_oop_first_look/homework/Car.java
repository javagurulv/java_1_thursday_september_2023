package lv.javaguru.java1.student_jelena_vavere.lesson_3_oop_first_look.homework;

 class Car {
     private String name;
     private String colour;
     private int price;

     public Car (String name, String colour, int price){
         this.name = name;
         this.colour = colour;
         this.price = price;
     }
     public String getName(){ return this.name;}

     public String getColor(){ return  this.colour;}

     public int getPrice() {return this.price;}


     public String setName (String name){this.name = name;
     return name;}
     public String setColour(String colour){this.colour = colour;
     return colour;}
     public int setPrice(int price){this.price = price;
         return price;
     }

 }
