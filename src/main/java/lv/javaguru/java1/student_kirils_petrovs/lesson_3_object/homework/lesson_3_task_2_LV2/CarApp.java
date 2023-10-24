package lv.javaguru.java1.student_kirils_petrovs.lesson_3_object.homework.lesson_3_task_2_LV2;

class CarApp {
    public static void main(String[] args){

        System.out.println("-------------------------------------------------");



        Car car1 = new Car("BMW","Black",2600);


        System.out.println("Brand:"+" "+car1.getCarMake());
        System.out.println("Color:"+" "+car1.getCarColor());
        System.out.println("Weight:"+" "+car1.getCarWieght()+" "+"Kg");


        System.out.println(" ");


        System.out.println("Your parameters:");

        car1.setCarMake("Mazda");
        car1.setCarColor("Red");
        car1.setCarWieght(3595);

        System.out.println("Brand:"+" "+car1.getCarMake());
        System.out.println("Color:"+" "+car1.getCarColor());
        System.out.println("Weight:"+" "+car1.getCarWieght()+" "+"Kg");



        System.out.println("-------------------------------------------------");


        Car car2 = new Car("Mercedes","Grey",4400);

        System.out.println("Brand:"+" "+car2.getCarMake());
        System.out.println("Color:"+" "+car2.getCarColor());
        System.out.println("Weight:"+" "+car2.getCarWieght()+" "+"Kg");


        System.out.println(" ");


        System.out.println("Your parameters:");

        car2.setCarMake("Volvo");
        car2.setCarColor("Green");
        car2.setCarWieght(4070);

        System.out.println("Brand:"+" "+car2.getCarMake());
        System.out.println("Color:"+" "+car2.getCarColor());
        System.out.println("Weight:"+" "+car2.getCarWieght()+" "+"Kg");






        System.out.println("-------------------------------------------------");



        Car car3 = new Car("Tesla","Red",3400);

        System.out.println("Brand:"+" "+car3.getCarMake());
        System.out.println("Color:"+" "+car3.getCarColor());
        System.out.println("Weight:"+" "+car3.getCarWieght()+" "+"Kg");


        System.out.println(" ");


        System.out.println("Your parameters:");

        car3.setCarMake("Volkswagen");
        car3.setCarColor("Black");
        car3.setCarWieght(3050);

        System.out.println("Brand:"+" "+car3.getCarMake());
        System.out.println("Color:"+" "+car3.getCarColor());
        System.out.println("Weight:"+" "+car3.getCarWieght()+" "+"Kg");




        System.out.println("-------------------------------------------------");

    }
}
//day1