package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.lessoncode;

class CountryApplication {

    public static void main(String[] args) {

        Country country1 = new Country("Latvija","LV", 1000000);
        Country country2 = new Country("Estonia", "EE", 1500000);


        System.out.println("Name = " + country1.getName());
        System.out.println("Name = " + country2.getName());


        System.out.println("Code = " + country1.getCode());
        System.out.println("Code = " + country2.getCode());


        System.out.println("Population = " + country1.getPopulation());
        System.out.println("Population = " + country2.getPopulation());
    }
}





