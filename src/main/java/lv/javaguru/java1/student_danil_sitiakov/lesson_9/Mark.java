package lv.javaguru.java1.student_danil_sitiakov.lesson_9;

class Mark {

    private String subject;

    private int markValue;

    public Mark(String subject,int markValue){

        this.subject = subject;
        this.markValue = markValue;
    }
    public String getSubject(){
        return subject;
    }
    public int getmarkValue(){
        return markValue;
    }

}
