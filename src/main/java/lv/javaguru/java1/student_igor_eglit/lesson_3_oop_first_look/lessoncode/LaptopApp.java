package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.lessoncode;



public class LaptopApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 14, 1000);
        Laptop laptop1 = new Laptop("IBM", 16, 1200);

        System.out.println("Model "+laptop.getModel()+"/"+"Screen size "+laptop.getScreenSize()+"/"+"Price "+laptop.getPrice());
        System.out.println("Model "+laptop1.getModel()+"/"+"Screen size "+laptop1.getScreenSize()+"/"+"Price "+laptop1.getPrice());
    }

}
