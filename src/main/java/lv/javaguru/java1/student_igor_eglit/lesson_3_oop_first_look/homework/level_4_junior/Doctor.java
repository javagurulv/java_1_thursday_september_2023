package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_4_junior;

import javax.xml.crypto.Data;
import java.util.Date;

class Doctor {
    private String nameDoctor;
    private String specialty;
    private String visitData;
    private Visit patient1;
    private Visit patient2;

    public Doctor(String nameDoctor, String specialty, String visitData, Visit patient1, Visit patient2) {
        this.nameDoctor = nameDoctor;
        this.specialty = specialty;
        this.visitData = visitData;
        this.patient1 = patient1;
        this.patient2 = patient2;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getVisitData() {
        return visitData;
    }

    public Visit getPatient1() {
        return patient1;
    }

    public Visit getPatient2() {
        return patient2;
    }
}
