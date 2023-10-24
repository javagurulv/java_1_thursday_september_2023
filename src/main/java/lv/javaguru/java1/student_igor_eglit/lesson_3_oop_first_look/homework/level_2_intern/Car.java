package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_2_intern;

class Car {
    private String model;
    private String color;
    private int price;

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void run(){
        System.out.println(model+" runs perfect");
    }
    public void feel(){
        System.out.println(model+" feels well");
    }
}