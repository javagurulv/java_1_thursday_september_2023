package lv.javaguru.java1.student_sergejs_roslakovs.lesson_9_project_school_dairy_part_2.lessoncode;

import java.util.ArrayList;
import java.util.List;

class StudentBusinessLogic {

    private List<Student> students;

    public StudentBusinessLogic() {
        students = new ArrayList<>();
    }

    public void addStudent(String fistName, String lastName) {
        Student student = new Student(fistName, lastName);
        students.add(student);
    }

    public void addMark(String fistName,
                        String lastName,
                        String subject,
                        int markValue) {
        Mark mark = new Mark(subject, markValue);
        for (Student student : students) {
            if (student.getFirstName().equals(fistName)
                && student.getLastName().equals(lastName)) {
                student.addMark(mark);
            }
        }
    }

    private Student findStudent(String fistName,
                                String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(fistName)
                    && student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public List<Mark> getMarks(String fistName,
                               String lastName,
                               String subject) {
        // find student -> student
        Student student = findStudent(fistName, lastName);
        if (student != null) {
            // collect student marks by subject <- (student)  -> List<Mark>
            return collectStudentMarksBySubject(subject, student);
        } else {
            return new ArrayList<>();
        }

    }

    private List<Mark> collectStudentMarksBySubject(String subject,
                                                    Student student) {
        List<Mark> subjectMarks = new ArrayList<>();
        for (Mark mark : student.getMarks()) {
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

}
