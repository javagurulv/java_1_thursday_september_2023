package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson3.Doctor;

public class DoctorAppointment {
    private String patientname;
    private String patientsurname;
    private String diagnose;
    private int price;

    public DoctorAppointment(String patientname, String patientsurname, String diagnose, int price) {
        this.patientname = patientname;
        this.patientsurname = patientsurname;
        this.diagnose = diagnose;
        this.price = price;
    }

    public String getPatientname() {
        return patientname;
    }

    public String getPatientsurname() {
        return patientsurname;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public int getPrice() {
        return price;
    }
}
