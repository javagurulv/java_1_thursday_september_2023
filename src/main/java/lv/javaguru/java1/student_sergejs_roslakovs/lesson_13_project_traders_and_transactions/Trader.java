package lv.javaguru.java1.student_sergejs_roslakovs.lesson_13_project_traders_and_transactions;

class Trader {


    private String sName;
    private String sCity;

    public Trader(String name, String city) {
        this.sName = name;
        this.sCity = city;
    }

    public String getName() {
        return this.sName;
    }

    public String getCity() {
        return this.sCity;
    }

    public String toString() {
        return "Trader: " + this.sName + " in " + this.sCity;
    }

}