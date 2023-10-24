package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_4_junior;

public class Visit {
    private String patientFirstName;
    private String patientSecondName;
    private String symptom;
    private int price;

    public Visit(String patientFirstName, String patientSecondName, String symptom, int price) {
        this.patientFirstName = patientFirstName;
        this.patientSecondName = patientSecondName;
        this.symptom = symptom;
        this.price = price;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public String getPatientSecondName() {
        return patientSecondName;
    }

    public String getSymptom() {
        return symptom;
    }

    public int getPrice() {
        return price;
    }
}