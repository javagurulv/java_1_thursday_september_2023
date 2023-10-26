package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.lessoncode;

class LaptopApp {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", 1000);
        Laptop laptop2 = new Laptop("MSI", 2000);

        System.out.println("Laptop 1 = Model is " + laptop1.getModel() +
                "\n" + " Price is = " + laptop1.getPrice() +" Euro");
        System.out.println("Laptop 2 = Model is " + laptop2.getModel() +
                "\n" + " Price is = " + laptop2.getPrice() + " Euro");
    }
}
