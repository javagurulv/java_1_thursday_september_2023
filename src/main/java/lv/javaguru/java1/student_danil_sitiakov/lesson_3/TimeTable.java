package lv.javaguru.java1.student_danil_sitiakov.lesson_3;

class TimeTable {

    private String docFullName;
    private String speciality;
    private String appointmentDate;
    private Appointment appointment1;
    private Appointment appointment2;

    public TimeTable(String docFullName, String speciality, String appointmentDate,
                     Appointment appointment1, Appointment appointment2) {
        this.docFullName = docFullName;
        this.speciality = speciality;
        this.appointmentDate = appointmentDate;
        this.appointment1 = appointment1;
        this.appointment2 = appointment2;
    }

    public String getDocFullName() {
        return docFullName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public Appointment getAppointment1() {
        return appointment1;
    }

    public Appointment getAppointment2() {
        return appointment2;
    }
}
