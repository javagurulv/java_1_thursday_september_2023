package lv.javaguru.java1.student_milans_micko.lesson_2_variables.lessoncode;

class CountryApp {

    public static void main(String[] args) {

        Country country1 = new Country("Latvia", "LV", 1000000);
        Country country2 = new Country("Estonia", "EE", 1200000);
        Country country3 = new Country("Lithuania", "LT", 1400000);

        System.out.println("Country =" + country1.getCountryName() + country1.getCountryCode() + country1.getCountryQuantity());
        System.out.println("Country =" + country2.getCountryName());
        System.out.println("Country =" + country3.getCountryName());

    }

}
