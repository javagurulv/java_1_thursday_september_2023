package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.lessoncode;

class LaptopApp {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", 1000);
        Laptop laptop2 = new Laptop("Asus",1500);

        System.out.println("Model = " + laptop1.getModelName());
        System.out.println("Model = " + laptop2.getModelName());

        System.out.println("Price = " + laptop1.getPrice());
        System.out.println("Price = " + laptop1.getPrice());
    }
}
