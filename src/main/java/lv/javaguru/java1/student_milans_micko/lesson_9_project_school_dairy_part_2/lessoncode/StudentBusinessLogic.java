package lv.javaguru.java1.student_milans_micko.lesson_9_project_school_dairy_part_2.lessoncode;

import lv.javaguru.java1.teacher.lesson_9_project_school_dairy_part_2.lessoncode.tasks.Mark;

import java.util.ArrayList;
import java.util.List;

class StudentBusinessLogic {

    private List <Student> students;

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

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
            System.out.println();
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

    private List<Mark> collectStudentMarksBySubject(String subject, Student student) {
        List<Mark> subjectMarks = new ArrayList<>();
        for (Mark mark : student.getMarks()) {
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }

    public void calculateAverageMark(String firstName,
                                     String lastName,
                                     String subject) {
        List<Mark> marks = getMarks(firstName, lastName, subject);
        int sum = 0;
        for (Mark mark : marks) {
            sum += mark.getMarkValue();
        }
        System.out.println(sum / marks.size());
    }

    public int calculateMaxMark(String firstName,
                                String lastName,
                                String subject) {
        List<Mark> marks = getMarks(firstName, lastName, subject);
        int maxMark = 0;
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            String markSubject = mark.getSubject();
            if (markSubject.equals(subject)
                    && mark.getMarkValue() > maxMark) {
                maxMark = mark.getMarkValue();
            }
        }
        return maxMark;
    }

    public int calculateMinMark(String firstName,
                                 String lastName,
                                 String subject) {
        List<Mark> marks = getMarks(firstName, lastName, subject);
        int minMark = 11;
        for (int i = 0; i > marks.size(); i++) {
            Mark mark = marks.get(i);
            String markSubject = mark.getSubject();
            if (markSubject.equals(subject)
                    && mark.getMarkValue() < minMark) {
                minMark = mark.getMarkValue();
            }
        }
        return minMark;
    }


}
