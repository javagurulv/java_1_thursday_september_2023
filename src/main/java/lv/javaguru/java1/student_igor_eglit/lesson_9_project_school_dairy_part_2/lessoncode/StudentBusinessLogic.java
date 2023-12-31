package lv.javaguru.java1.student_igor_eglit.lesson_9_project_school_dairy_part_2.lessoncode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class StudentBusinessLogic {

    private List<Student> students;

    public StudentBusinessLogic() {
        students = new ArrayList<>();
    }

    public void addStudent(String fistName, String lastName) {
        Student student = new Student(fistName, lastName);
        students.add(student);
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
            System.out.println();
        }
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

    public void deleteStudentFromList(String firstName, String lastName) {
        Student student = findStudent(firstName, lastName);
        if (student != null) {
            students.remove(student);
            System.out.println(firstName + " " + lastName + " was deleted");
            System.out.println();

        } else {
            System.out.println("There is no such student");
            System.out.println();
        }
    }

    public void showMarks(String firstName,
                          String lastName,
                          String subject) {
        List<Mark> marks = getMarks(firstName, lastName, subject);
        if (!marks.isEmpty()) {
            for (Mark mark : marks) {
                System.out.print(mark.getMarkValue() + " , ");
            }
        } else {
            System.out.println("!!There is no such student, or no marks for this subject!!");
        }
        System.out.println();
    }

    public void calculateAverageSubjectMark(String firstName,
                                            String lastName,
                                            String subject) {
        List<Mark> marks = getMarks(firstName, lastName, subject);
        int sum = 0;
        for (Mark mark : marks) {
            sum += mark.getMarkValue();
        }
        System.out.println(sum / marks.size());
    }



    public void deleteMarkFromList(String firstName,
                                   String lastName,
                                   String subject,
                                   int markValue) {
        Student student = findStudent(firstName, lastName);
        assert student != null;

        /*Iterator<Mark> marks = student.getMarks().iterator();
        while (marks.hasNext()) {
            Mark nextMark = marks.next();
            if (nextMark.getSubject().equals(subject)
            && Objects.equals(nextMark.getMarkValue(),markValue))
            {
                marks.remove();
            }*/


        List<Mark> marks = student.getMarks();

        for (int i = 0; i < marks.size();i++){
            Mark mark=marks.get(i);
            if(Objects.equals(mark.getSubject(), subject)
                    && Objects.equals(mark.getMarkValue(), markValue)){
                marks.remove(i);
                break;
            }
        }
    }
}
