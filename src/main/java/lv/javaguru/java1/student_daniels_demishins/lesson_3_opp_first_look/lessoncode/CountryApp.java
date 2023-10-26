package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.lessoncode;

public class CountryApp {
    public static void main(String[] args) {
        Country country1 = new Country("Latvia", "LV", 100);
        Country country2 = new Country("Estonia", "ES", 200);
        Country country3 = new Country("Litva", "LT", 300);


        System.out.println("Country 1 = Name is " + country1.getCountry() +
                "\n" + " Country code is = " + country1.getCode() +
                "\n" + "Population is = " + country1.getPopu());
        System.out.println("Country 2 = Name is " + country2.getCountry() +
                "\n" + " Country code is = " + country2.getCode() +
                "\n" + "Population is = " + country2.getPopu());
        System.out.println("Country 3 = Name is " + country3.getCountry() +
                "\n" + " Country code is = " + country3.getCode() +
                "\n" + "Population is = " + country3.getPopu());
    }
}
