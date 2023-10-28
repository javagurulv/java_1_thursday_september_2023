package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.level_4;

import java.util.Date;

class DoctorTimetableApp {

public static void main (String[] args){

    DoctorAppointment appointment1 = new DoctorAppointment("Artjom", "Potasevskis", "heat", 15);
    DoctorAppointment appointment2 = new DoctorAppointment("Nikita", "Potasevskis", "cold", 20);

    DoctorTimetable timetable;
    timetable = new DoctorTimetable("Demids", "Voitehovskis", "family doctor", new Date("29.10.2023"), appointment1, appointment2);

    System.out.println("Patient first name = " + appointment1.getPatientFirstName());
    System.out.println("Patient last name = " + appointment1.getPatientLastName());
    System.out.println("Diagnosis = " + appointment1.getDiagnosis());
    System.out.println("Visit price = " + appointment1.getVisitPrice());

    System.out.println("Doctor first name = " + timetable.getDoctorFirstName());
    System.out.println("Doctor last name = " + timetable.getDoctorLastName());
    System.out.println("Doctor speciality = " + timetable.getDoctorSpeciality());
    System.out.println("Appointment date = " + timetable.getAppointmentDate());


}



}
