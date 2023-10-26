package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.lessoncode;

class Laptop {

    private String model;
    private int price;

    public Laptop (String model, int price){
        this.model = model;
        this.price = price;
    }

    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return this.price;
    }

}
