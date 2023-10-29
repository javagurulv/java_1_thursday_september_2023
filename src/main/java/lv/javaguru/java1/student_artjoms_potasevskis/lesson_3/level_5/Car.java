package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.level_5;

class Car {

    private String model;

    Car(String newModel) {
        this.model = newModel;
    }

    public String getModel(){return model;

    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }





}
