package lv.javaguru.java1.student_artjoms_potasevskis.lesson_10;


class Trader {

    private String city;
    private String fullName;
    private String country;


    public Trader(String city, String fullName,String country) {
        this.city = city;
        this.fullName = fullName;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry(){
        return country;
    }
}
