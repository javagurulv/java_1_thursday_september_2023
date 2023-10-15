package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_4_junior.task_1;

class DoctorAppointment {

    private String patientFirstName;
    private String patientLastName;
    private String diagnosis;
    private int visitPrice;

    public DoctorAppointment(String patientFirstName,
                             String patientLastName,
                             String diagnosis,
                             int visitPrice) {
        this.patientFirstName = patientFirstName;
        this.patientLastName = patientLastName;
        this.diagnosis = diagnosis;
        this.visitPrice = visitPrice;
    }

}
