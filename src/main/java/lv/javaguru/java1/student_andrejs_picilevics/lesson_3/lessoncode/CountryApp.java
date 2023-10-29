package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.lessoncode;

public class CountryApp {
    public static void main(String[] args) {

        Country country1 = new Country("Latvia","LV",1900000);
        Country country2 = new Country("Estonia","EE",1500000);

        System.out.println("Name = " + country1.getCountryName());
        System.out.println("Name = " + country2.getCountryName());

        System.out.println("Code = " + country1.getCountryCode());
        System.out.println("Code = " + country2.getCountryCode());

        System.out.println("Population = " + country1.getCountryPopulation());
        System.out.println("Population = " + country2.getCountryPopulation());
    }
}
