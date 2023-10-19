package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.lessoncode;

public class CountryApp {
    public static void main(String[] args) {
        Country country1 = new Country("Latvija", "LV", 1600000);
        Country country2 = new Country("Lithuania", "LT", 2100000);
        Country country3 = new Country("Estonia", "EE", 900000);

        System.out.println("Name " + country1.getName() + "/" + "Code " + country1.getCode() + "/" + "Population " + country1.getPopulation());
        System.out.println("Name " + country2.getName() + "/" + "Code " + country2.getCode() + "/" + "Population " + country2.getPopulation());
        System.out.println("Name " + country3.getName() + "/" + "Code " + country3.getCode() + "/" + "Population " + country3.getPopulation());

    }
}
