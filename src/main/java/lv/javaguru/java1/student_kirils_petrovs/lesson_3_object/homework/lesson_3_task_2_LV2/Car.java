package lv.javaguru.java1.student_kirils_petrovs.lesson_3_object.homework.lesson_3_task_2_LV2;

class Car {


    private String carMake;
    private String carColor;
    private double carWieght;

    public Car(String carMake, String carColor, double carWieght  ){
        this.carMake = carMake;
        this.carColor = carColor;
        this.carWieght = carWieght;

    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarColor() {
        return carColor;
    }

    public double getCarWieght() {
        return carWieght;
    }
}




