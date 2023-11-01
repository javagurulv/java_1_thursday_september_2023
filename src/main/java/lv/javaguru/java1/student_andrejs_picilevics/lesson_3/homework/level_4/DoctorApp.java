package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_4;

import java.time.LocalDate;

class
DoctorApp {
    public static void main(String[] args) {


        DoctorsAppointment appointment1 = new DoctorsAppointment("Andrejs","Picilevics","Fly",50, "10:00-12:00");

        DoctorsAppointment appointment2 = new DoctorsAppointment("Elena","Picilevicha","Headache",150, "14:00-16:00");


        DoctorsSchedule schedule = new DoctorsSchedule ("Karina","Kanepe","Family doctor", LocalDate.of(2023, 12, 12), appointment1, appointment2);

        System.out.println("\nFIRST APPOINTMENT: ");
        System.out.println("Patient first name = " + appointment1.getPatientFirstName());
        System.out.println("Patient last name = " + appointment1.getPatientLastName());
        System.out.println("Diagnosis = " + appointment1.getDiagnosis());
        System.out.println("Visit price = " + appointment1.getVisitPrice());
        System.out.println("Visit time = " + appointment1.getTimePeriod());

        System.out.println("Doctor first name = " + schedule.getDoctorFirstName());
        System.out.println("Doctor last name = " + schedule.getDoctorLastName());
        System.out.println("Doctor speciality = " + schedule.getDoctorSpeciality());
        System.out.println("Appointment date = " + schedule.getAppointmentDate());
        System.out.println("Visit time = " + appointment2.getTimePeriod());

        DoctorsSchedule schedule2 = new DoctorsSchedule ("Karina","Kanepe","Family doctor", LocalDate.of(2023, 12, 12), appointment1, appointment2);

        System.out.println("\nSECOND APPOINTMENT: ");
        System.out.println("Patient first name = " + appointment2.getPatientFirstName());
        System.out.println("Patient last name = " + appointment2.getPatientLastName());
        System.out.println("Diagnosis = " + appointment2.getDiagnosis());
        System.out.println("Visit price = " + appointment2.getVisitPrice());
        System.out.println("Visit time = " + appointment2.getTimePeriod());

        System.out.println("Doctor first name = " + schedule2.getDoctorFirstName());
        System.out.println("Doctor last name = " + schedule2.getDoctorLastName());
        System.out.println("Doctor speciality = " + schedule2.getDoctorSpeciality());
        System.out.println("Appointment date = " + schedule2.getAppointmentDate());
        System.out.println("Visit time = " + appointment2.getTimePeriod());

    }


}
