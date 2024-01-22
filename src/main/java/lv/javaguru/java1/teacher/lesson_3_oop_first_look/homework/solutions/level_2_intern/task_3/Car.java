package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_2_intern.task_3;

class Car {

    private String manufacturer;
    private String color;
    private int price;

    public Car(String manufacturer,
               String color,
               int price) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
