package lv.javaguru.java1.student_kirils_petrovs.lesson_3_object.homework.lesson_3_task_2_LV2;

class CarApp {
    public static void main(String[] args){

        System.out.println("-------------------------------------------------");



        Car car1 = new Car("BMW","Black",2600);


        System.out.println("Brand:"+" "+car1.getCarMake());
        System.out.println("Color:"+" "+car1.getCarColor());
        System.out.println("Weight:"+" "+car1.getCarWieght()+" "+"Kg");

        System.out.println("Your parameters:");



        System.out.println("-------------------------------------------------");


        Car car2 = new Car("Mercedes","Grey",4400);

        System.out.println("Brand:"+" "+car2.getCarMake());
        System.out.println("Color:"+" "+car2.getCarColor());
        System.out.println("Weight:"+" "+car2.getCarWieght()+" "+"Kg");

        System.out.println("Your parameters:");



        System.out.println("-------------------------------------------------");



        Car car3 = new Car("Tesla","Red",3400);

        System.out.println("Brand:"+" "+car3.getCarMake());
        System.out.println("Color:"+" "+car3.getCarColor());
        System.out.println("Weight:"+" "+car3.getCarWieght()+" "+"Kg");

        System.out.println("Your parameters:");



        System.out.println("-------------------------------------------------");

    }
}
//day1