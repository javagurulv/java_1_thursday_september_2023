package lv.javaguru.java1.student_jelena_vavere.lesson_13_traders_and_transactions;

public class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
    public String toString() {return "Trader:" + this.name + " in " + this.city; }
}