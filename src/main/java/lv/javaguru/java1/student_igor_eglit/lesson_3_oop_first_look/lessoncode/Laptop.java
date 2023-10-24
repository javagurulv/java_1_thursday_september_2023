package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.lessoncode;

class Laptop {
    private String model;
    private int screenSize;
    private int price;

    public Laptop(String model, int screenSize, int price) {
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getPrice() {
        return price;
    }
}
