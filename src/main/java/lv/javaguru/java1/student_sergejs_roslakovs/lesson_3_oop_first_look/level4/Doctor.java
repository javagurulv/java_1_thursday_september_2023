package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.level4;


import java.time.LocalTime;

class Doctor {
    private String firstName;
    private String lastName;
    private String specialty;

    public Doctor(String firstName, String lastName, String specialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getSpecialty() {
        return specialty;
    }
}

class Appointment {
    private String patientFirstName;
    private String patientLastName;
    private String diagnosis;
    private double cost;
    private LocalTime startTime;
    private LocalTime endTime;

    public Appointment(String patientFirstName, String patientLastName, String diagnosis, int cost, LocalTime startTime, LocalTime endTime) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.cost = cost;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public String getPatientFullName() {
        return patientFirstName + " " + patientLastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public double getCost() {
        return cost;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}



