package lv.javaguru.java1.student_danil_sitiakov.lesson_3;

class Appointment {

    private String fullName;
    private String diagnose;
    private int price;

    public Appointment(String fullName, String diagnose, int price) {
        this.fullName = fullName;
        this.diagnose = diagnose;
        this.price = price;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public int getPrice() {
        return price;
    }
}
