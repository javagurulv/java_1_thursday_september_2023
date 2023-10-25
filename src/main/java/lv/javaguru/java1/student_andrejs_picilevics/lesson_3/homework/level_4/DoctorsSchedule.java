package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_4;



import java.time.LocalDate;
import java.util.Date;

class DoctorsSchedule {
    private String doctorFirstName;
    private String doctorLastName;
    private String doctorSpeciality;
    private LocalDate appointmentDate;
    private DoctorsAppointment appointment1;
   private DoctorsAppointment appointment2;

    public DoctorsSchedule(String doctorFirstName, String doctorLastName, String doctorSpeciality, LocalDate appointmentDate,
                           DoctorsAppointment appointment1, DoctorsAppointment appointment2){

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

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public DoctorsAppointment getAppointment1() {return appointment1;
    }

    public DoctorsAppointment getAppointment2() {
        return appointment2;
    }

}
