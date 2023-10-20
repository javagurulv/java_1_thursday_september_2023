package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_4_junior;

public class DoctorApp {
    public static void main(String[] args) {
        Visit patient1 = new Visit("Vasja", "Sidorov", "cold", 15);
        Visit patient2 = new Visit("Petja", "Ivanov", "flu", 25);
        Doctor appointment = new Doctor(
                "Professor Petrov",
                "pediatrist",
                "20.12.2023",
                patient1,
                patient2);
        System.out.println("Doctor: "+appointment.getNameDoctor());
        System.out.println("Speciality: "+appointment.getSpecialty());
        System.out.println("Data: "+appointment.getVisitData());
        System.out.println("First appointment: " + patient1.getPatientFirstName()+" "+patient1.getPatientSecondName());
        System.out.println("Symptoms: " + patient1.getSymptom());
        System.out.println("Price: " + patient1.getPrice());
        System.out.println("Second appointment: " + patient2.getPatientFirstName()+" "+patient2.getPatientSecondName());
        System.out.println("Symptoms: " + patient2.getSymptom());
        System.out.println("Price: " + patient2.getPrice());



    }
}
