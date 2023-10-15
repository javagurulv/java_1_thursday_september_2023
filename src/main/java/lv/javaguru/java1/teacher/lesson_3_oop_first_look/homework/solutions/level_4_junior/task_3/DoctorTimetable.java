package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_4_junior.task_3;

import java.util.Date;

class DoctorTimetable {

    private String doctorFirstName;
    private String doctorLastName;
    private String doctorSpeciality;
    private Date appointmentDate;
    private DoctorAppointment appointment1;
    private DoctorAppointment appointment2;

    public DoctorTimetable(String doctorFirstName,
                           String doctorLastName,
                           String doctorSpeciality,
                           Date appointmentDate,
                           DoctorAppointment appointment1,
                           DoctorAppointment appointment2) {
        this.doctorFirstName = doctorFirstName;
        this.doctorLastName = doctorLastName;
        this.doctorSpeciality = doctorSpeciality;
        this.appointmentDate = appointmentDate;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public DoctorAppointment getAppointment1() {
        return appointment1;
    }

    public DoctorAppointment getAppointment2() {
        return appointment2;
    }
}
