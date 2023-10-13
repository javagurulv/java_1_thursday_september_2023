package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_4_junior.task_2;

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
    }

}
