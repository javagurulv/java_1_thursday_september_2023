package lv.javaguru.java1.student_kirils_petrovs.lesson_3_object.homework.lesson_3_LV4;

class ClientVisit {



    private String ClientNameAndSurname;
    private  String Diagnosis;

    private  String VisitCost;

    public  ClientVisit(String ClientNameAndSurname, String Diagnosis, String VisitCost ) {
        this.ClientNameAndSurname =  ClientNameAndSurname;
        this.Diagnosis = Diagnosis;
        this.VisitCost =  VisitCost;
    }

    public String getClientNameAndSurname() {
        return ClientNameAndSurname;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public String getVisitCost() {
        return VisitCost;
    }
}
