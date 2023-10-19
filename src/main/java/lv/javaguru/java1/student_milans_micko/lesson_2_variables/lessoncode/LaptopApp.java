package lv.javaguru.java1.student_milans_micko.lesson_2_variables.lessoncode;

class LaptopApp {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", 100);
        Laptop laptop2 = new Laptop("Asus", 200);

        System.out.println("Type = " + laptop1.getType());
        System.out.println("Type = " + laptop2.getType());


        System.out.println("Price = " + laptop1.getPrice());
        System.out.println("Price = " + laptop2.getPrice());


    }
}
