package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson3.Doctor;

public class DoctorTimeTable {
private String doctorname;
private String doctorsurname;
private String doctorposition;
private double date;
private double timeslot1;
private double timeslot2;

    public String getName() {
        return doctorname;
    }

    public String getSurname() {
        return doctorsurname;
    }

    public String getPosition() {
        return doctorposition;
    }

    public double getDate() {
        return date;
    }

    public double getTimeslot1() {
        return timeslot1;
    }

    public double getTimeslot2() {
        return timeslot2;
    }

    public DoctorTimeTable(String name, String surname, String doctorposition, double date, double timeslot1, double timeslot2) {
        this.doctorname = name;
        this.doctorsurname = surname;
        this.doctorposition = doctorposition;
        this.date = date;
        this.timeslot1 = timeslot1;
        this.timeslot2 = timeslot2;


    }
}
