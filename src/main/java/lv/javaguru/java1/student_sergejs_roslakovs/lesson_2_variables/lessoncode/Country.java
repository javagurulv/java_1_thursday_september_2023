package lv.javaguru.java1.student_sergejs_roslakovs.lesson_2_variables.lessoncode;

class Country {
    private String fullName;
    private String code;
    private int population;


    public Country(String fullName, String code, int population) {
        this.fullName = fullName;
        this.code = code;
        this.population = population;
    }

    public String getFullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }









}
