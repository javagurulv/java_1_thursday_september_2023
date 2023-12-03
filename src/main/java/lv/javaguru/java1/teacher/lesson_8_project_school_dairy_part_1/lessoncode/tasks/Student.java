package lv.javaguru.java1.teacher.lesson_8_project_school_dairy_part_1.lessoncode.tasks;

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


}
