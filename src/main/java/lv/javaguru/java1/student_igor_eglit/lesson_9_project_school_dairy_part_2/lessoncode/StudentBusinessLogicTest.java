package lv.javaguru.java1.student_igor_eglit.lesson_9_project_school_dairy_part_2.lessoncode;

import java.util.List;

class StudentBusinessLogicTest {
    public static void main(String[] args) {
        StudentBusinessLogicTest studentBusinessLogicTest = new StudentBusinessLogicTest();
        studentBusinessLogicTest.deleteMarkFromListTest();
    }

    public void deleteMarkFromListTest() {
        StudentBusinessLogic studentBusinessLogic = new StudentBusinessLogic();
        studentBusinessLogic.addStudent("Ivan", "Ivanov");
        studentBusinessLogic.addMark("Ivan", "Ivanov", "Math", 2);
        studentBusinessLogic.addMark("Ivan", "Ivanov", "Math", 6);
        studentBusinessLogic.addMark("Ivan", "Ivanov", "Math", 9);
        List<Mark> marks = studentBusinessLogic.getMarks("Ivan", "Ivanov", "Math");
        for (Mark mark : marks) {
            System.out.println(mark.getMarkValue() + " , ");
        }

        studentBusinessLogic.deleteMarkFromList("Ivan", "Ivanov", "Math", 9);
        for (Mark mark : marks) {
            System.out.println(mark.getMarkValue() + " , ");
        }
    }
}

