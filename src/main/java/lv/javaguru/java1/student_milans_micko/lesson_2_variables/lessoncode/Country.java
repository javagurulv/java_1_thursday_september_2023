package lv.javaguru.java1.student_milans_micko.lesson_2_variables.lessoncode;

class Country {
    private String countryName;

    private String countryCode;

    private int countryQuantity;

    public Country(String CountryName, String countryCode, int countryQuantity ) {
        this. countryName = countryName;
        this. countryCode = countryCode;
        this. countryQuantity = countryQuantity;
    }

    public String  getCountryName() { return this.countryName ;}

    public String getCountryCode() { return this.countryCode ;}

    public int getCountryQuantity() { return  this.countryQuantity ;}



}
