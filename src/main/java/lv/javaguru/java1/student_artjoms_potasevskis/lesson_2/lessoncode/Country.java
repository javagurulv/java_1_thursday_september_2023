package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.lessoncode;

class Country {

    private String name;

    private String code;
    private int population;

    public Country(String name, String code, int population) {

        this.name = name;
        this.code = code;
        this.population = population;
    }

    public String getName() {

        return this.name;

    }

    public String getCode() {

        return this.code;

    }


    public int getPopulation() {


        return this.population;
    }



}
