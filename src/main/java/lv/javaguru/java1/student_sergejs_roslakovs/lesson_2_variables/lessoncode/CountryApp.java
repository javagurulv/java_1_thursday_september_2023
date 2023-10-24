package lv.javaguru.java1.student_sergejs_roslakovs.lesson_2_variables.lessoncode;

class CountryApp {
    public static void main(String[] args) {
        Country latvia = new Country("Latvia", "LV", 2000000);
        Country estonia = new Country("Estonia", "EE", 2000000);
        System.out.println("country 1 = " + latvia.getFullName() + " " + latvia.getCode());
        System.out.println("country 2 = " + estonia.getFullName() + " " + estonia.getCode());


    }


}
