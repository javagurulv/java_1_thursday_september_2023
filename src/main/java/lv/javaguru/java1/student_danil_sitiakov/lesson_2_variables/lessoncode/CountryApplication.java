package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

class CountryApplication {

    public static void main(String[] args) {
        Country country1 = new Country("Latvia", "LV", 1900000);
        Country country2 = new Country("Estonia", "EST", 2000000);
        Country country3 = new Country("Lithuania", "LT", 1900000);

        System.out.println("Country =" + country1.getCountryFullNAme());
        System.out.println("Country =" + country2.getCountryFullNAme());
        System.out.println("Country =" + country3.getCountryFullNAme());


    }

}
