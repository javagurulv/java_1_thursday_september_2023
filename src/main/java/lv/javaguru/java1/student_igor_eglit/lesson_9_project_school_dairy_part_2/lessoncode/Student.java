package lv.javaguru.java1.student_igor_eglit.lesson_9_project_school_dairy_part_2.lessoncode;

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
