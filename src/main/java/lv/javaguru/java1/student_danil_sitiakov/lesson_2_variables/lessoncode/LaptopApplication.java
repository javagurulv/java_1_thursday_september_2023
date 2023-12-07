package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class LaptopApplication {
    private static Object price;
    private static Object model;

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("lenovo", 1000);
        Laptop laptop2 = new Laptop("Dell", 900);
        System.out.println("model =" + laptop1.getModel());
        System.out.println("price =" + laptop2.getPrice());
    }

}
