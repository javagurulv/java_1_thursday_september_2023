package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.lessoncode;

class Country {
    private String countryName;
    private String countryCode;
    private int countryPopulation;

    public Country (String countryName, String countryCode, int countryPopulation){
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.countryPopulation = countryPopulation;
    }
    public String getCountryName(){
        return this.countryName;
    }
    public String getCountryCode(){
        return this.countryCode;
    }
    public int getCountryPopulation(){
        return this.countryPopulation;
    }
}
