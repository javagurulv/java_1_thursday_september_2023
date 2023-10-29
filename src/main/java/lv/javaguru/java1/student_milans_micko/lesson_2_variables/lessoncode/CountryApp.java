package lv.javaguru.java1.student_milans_micko.lesson_2_variables.lessoncode;

class CountryApp {

    public static void main(String[] args) {

        Country lv = new Country("Latvia", "LV", 1000000);
        Country ee = new Country("Estonia", "EE", 1200000);
        Country lt = new Country("Lithuania", "LT", 1400000);

        System.out.println("country 1 =" + lv.getCountryName() + " " + lv.getCountryQuantity());
        System.out.println("country 2 =" + ee.getCountryName() + " " + ee.getCountryQuantity());
        System.out.println("country 3 =" + lt.getCountryName() + " " + lt.getCountryQuantity());

    }

}
