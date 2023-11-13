package lv.javaguru.java1.student_jelena_vavere.lesson_3_oop_first_look.lessoncode;



    class LaptopApplication {

        public static void main(String[] args) {
          Laptop laptop1 = new Laptop("Dell" , 999);
          Laptop laptop2 = new Laptop("IBMl" , 777);

            System.out.println("Model = " + laptop1.getModel());
            System.out.println("Model = " + laptop2.getModel());

            System.out.println("Price = " + laptop1.getPrice());
            System.out.println("Price = " + laptop2.getPrice());

        }

    }

