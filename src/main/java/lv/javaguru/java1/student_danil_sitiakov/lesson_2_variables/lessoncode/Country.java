package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

class Country {
    private String countryFullNAme;
    private String countryCode;
    private int countryPopulation;

    public Country(String countryfullName, String countryCode, int countryPopulation) {
        countryFullNAme = countryfullName;
        this.countryCode = countryCode;
        this.countryPopulation = countryPopulation;

    }

    public String getCountryFullNAme() {
        return countryFullNAme;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }
}
