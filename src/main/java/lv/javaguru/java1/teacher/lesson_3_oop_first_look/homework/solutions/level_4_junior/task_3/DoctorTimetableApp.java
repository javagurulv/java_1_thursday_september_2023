package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_4_junior.task_3;

import java.util.Date;

class DoctorTimetableApp {

    public static void main(String[] args) {
        DoctorAppointment appointment1 = new DoctorAppointment(
                "Vasja", "Pupkin", "cold", 10
        );
        DoctorAppointment appointment2 = new DoctorAppointment(
                "Petja", "Petrov", "heat", 100
        );

        DoctorTimetable timetable = new DoctorTimetable(
            "Kristina",
            "Kozlova",
            "pediatrician",
                        new Date("01.01.2023"),
                        appointment1, appointment2
        );

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
