package lv.javaguru.java1.student_sergejs_roslakovs.lesson_2_variables.lessoncode;

class LapTopApp {
    public static void main(String[] args) {
        LapTop lapTop = new LapTop("Dell", 1000);
        String model = lapTop.getModel();
        int price = lapTop.getPrice();
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);


    }




}
