package lv.javaguru.java1.student_danil_sitiakov.lesson_3;

public class TimeTableApp {
    public static void main(String[] args) {
        Appointment appointment1 = new Appointment("Bruce Wayne", "Depression", 500);
        Appointment appointment2 = new Appointment("Tony Stark", "Paranoia", 600);
        TimeTable timeTable1 = new TimeTable("Bruce Banner", "Psyhologist","25.10.23", appointment1, appointment2);

        System.out.println("Doctor name is " + timeTable1.getDocFullName());
        System.out.println("Speciality is " + timeTable1.getSpeciality());
        System.out.println("Data " + timeTable1.getAppointmentDate() +
                "\n" + "Time 10:00-12:00");
        System.out.println("Patient is " + appointment1.getFullName());
        System.out.println("Diagnose is " + appointment1.getDiagnose());
        System.out.println("Price is " + appointment1.getPrice());

        System.out.println("Data " + timeTable1.getAppointmentDate() +
                "\n" + "Time 14:00-16:00");
        System.out.println("Patient is " + appointment2.getFullName());
        System.out.println("Diagnose is " + appointment2.getDiagnose());
        System.out.println("Price is " + appointment2.getPrice());
    }
}
