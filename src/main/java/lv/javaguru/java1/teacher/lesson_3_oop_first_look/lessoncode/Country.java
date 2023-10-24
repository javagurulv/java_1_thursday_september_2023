package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class Country {

    private String fullName;
    private String shortCode;
    private int population;


    public Country(String fullName,
                   String shortCode,
                   int population) {
        this.fullName = fullName;
        this.shortCode = shortCode;
        this.population = population;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortCode() {
        return shortCode;
    }

    public int getPopulation() {
        return population;
    }

}
