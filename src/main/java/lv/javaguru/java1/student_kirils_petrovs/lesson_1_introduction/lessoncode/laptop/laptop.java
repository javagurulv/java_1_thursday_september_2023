package lv.javaguru.java1.student_kirils_petrovs.lesson_1_introduction.lessoncode.laptop;

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
