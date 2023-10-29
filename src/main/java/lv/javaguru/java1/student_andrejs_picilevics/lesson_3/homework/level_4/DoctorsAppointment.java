package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_4;

class DoctorsAppointment {

    private String patientFirstName;
    private String patientLastName;
    private String diagnosis;
    private int visitPrice;
    private String timePeriod;

    public DoctorsAppointment(String patientFirstName, String patientLastName, String diagnosis, int visitPrice, String timePeriod) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.visitPrice = visitPrice;
        this.timePeriod = timePeriod;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getVisitPrice() {
        return visitPrice;
    }

    public void setVisitPrice(int visitPrice) {
        this.visitPrice = visitPrice;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }
}
