package lv.javaguru.java1.student_danil_sitiakov.lesson_9;

import java.util.ArrayList;
import java.util.List;

class Student {

    private String firstName;
    private String lastName;
    private List<Mark> marks;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = new ArrayList<>();
    }

    public void addMark(Mark mark) {
        marks.add(mark);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Mark> getMarks() {
        return marks;
    }
}
