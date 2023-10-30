package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.level4;


import java.time.LocalTime;

class DoctorApp {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Sergej", "Roslakov", "Dentist");

        Appointment appointment1 = new Appointment("Anna", "Ivanova", "Toothache", 50, LocalTime.of(10, 0), LocalTime.of(12, 0));
        Appointment appointment2 = new Appointment("Dmitrij", "Petrov", "Teeth whitening", 180, LocalTime.of(14, 0), LocalTime.of(16, 0));

        System.out.println("Doctor: " + doctor.getFullName());
        System.out.println("Specialty: " + doctor.getSpecialty());

        System.out.println("Appointments for the day:");
        System.out.println("Appointment 1:");
        System.out.println("Patient: " + appointment1.getPatientFullName());
        System.out.println("Diagnosis: " + appointment1.getDiagnosis());
        System.out.println("Cost: $" + appointment1.getCost());
        System.out.println("Time: " + appointment1.getStartTime() + " - " + appointment1.getEndTime());

        System.out.println("Appointment 2:");
        System.out.println("Patient: " + appointment2.getPatientFullName());
        System.out.println("Diagnosis: " + appointment2.getDiagnosis());
        System.out.println("Cost: $" + appointment2.getCost());
        System.out.println("Time: " + appointment2.getStartTime() + " - " + appointment2.getEndTime());
    }
}


