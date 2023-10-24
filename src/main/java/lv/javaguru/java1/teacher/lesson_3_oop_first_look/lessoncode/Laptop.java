package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class Laptop {

    private String model;
    private int price;

    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
