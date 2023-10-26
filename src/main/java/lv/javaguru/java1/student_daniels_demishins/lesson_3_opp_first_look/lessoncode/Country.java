package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.lessoncode;

class Country {

    private String country;
    private String code;
    private int popu;

    public Country(String country, String code, int popu) {
        this.country = country;
        this.code = code;
        this.popu = popu;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCode() {
        return this.code;
    }

    public int getPopu() {
        return this.popu;
    }


}
