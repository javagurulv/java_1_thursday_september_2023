package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.lessoncode;

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
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getPopulation() {
        return population;
    }
}
