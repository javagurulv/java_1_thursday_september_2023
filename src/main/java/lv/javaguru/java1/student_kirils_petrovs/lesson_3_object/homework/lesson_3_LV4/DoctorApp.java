package lv.javaguru.java1.student_kirils_petrovs.lesson_3_object.homework.lesson_3_LV4;

public class DoctorApp {

    public static void main(String[] args) {


        System.out.println("--------------------------------------------------------------------------------------------");

        appointmentTime AppointmentTime = new appointmentTime("10.00"+"-"+"12.00","14.00"+"-"+"16.00");
        System.out.println("Appointment time:"+" "+AppointmentTime.getAppointmentTime3() );
        System.out.println("Appointment time:"+" "+AppointmentTime.getAppointmentTime4() );

        System.out.println("--------------------------------------------------------------------------------------------");


        Doctor doctor = new Doctor("Vasja Pupkin","ENT","20.12.2023","10.00"+"-"+"12.00","14.00"+"-"+"16.00");
        System.out.println("Doctor Name and Surname: "+doctor.getNameAndSurname());
        System.out.println("Specialist: "+doctor.getSpecialist());
        System.out.println("Admission date: "+doctor.getAdmissionDate());
        System.out.println("Appointment time:"+" "+doctor.getAppointmentTime1());
        System.out.println("Appointment time:"+" "+doctor.getAppointmentTime2());

        System.out.println("--------------------------------------------------------------------------------------------");


        ClientVisit clientVisit = new ClientVisit("Artem Bereznev","Nouse","143.46");


        System.out.println("Client Name and Surname: "+clientVisit.getClientNameAndSurname());
        System.out.println("Client diagnosis: "+clientVisit.getDiagnosis());
        System.out.println("Price: "+clientVisit.getVisitCost()+" Euro");







        System.out.println("--------------------------------------------------------------------------------------------");











    }

}
