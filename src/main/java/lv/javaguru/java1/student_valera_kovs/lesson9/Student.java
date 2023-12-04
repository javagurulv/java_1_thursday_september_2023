package lv.javaguru.java1.student_valera_kovs.lesson9;


public class Student {

    private String firstName;
    private String lastName;
    private int mark;


    public Student(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;

    }

    public String getLastName() {
        return lastName;

    }



    public void addMark(Mark mark) {

    }

    public Mark[] getMarks() {

        return new Mark[0];
    }
}






