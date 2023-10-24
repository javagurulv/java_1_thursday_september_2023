package lv.javaguru.java1.student_kirils_petrovs.lesson_3_object.homework.lesson_3_LV4;

class Doctor {

    private String NameAndSurname;

    private  String Specialist;
    private  String AdmissionDate;

    private  String AppointmentTime1;
    private  String AppointmentTime2;


    public Doctor(String NameAndSurname, String Specialist, String AdmissionDate, String AppointmentTime1, String AppointmentTime2){
        this.NameAndSurname = NameAndSurname;
        this.Specialist = Specialist;
        this.AdmissionDate = AdmissionDate;
        this.AppointmentTime1 = AppointmentTime1;
        this.AppointmentTime2 = AppointmentTime2;

    }


    public String getNameAndSurname() {
        return NameAndSurname;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public String getAdmissionDate() {
        return AdmissionDate;
    }

    public String getAppointmentTime1() {
        return AppointmentTime1;
    }

    public String getAppointmentTime2() {
        return AppointmentTime2;
    }
}
