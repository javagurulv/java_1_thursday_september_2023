package lv.javaguru.java1.student_danil_sitiakov.lesson_9;


import java.util.List;

class StudentBusinessLogicTest {
    public static void main(String[] args) {
       StudentBusinessLogicTest studentBusinessLogicTest = new StudentBusinessLogicTest();
        studentBusinessLogicTest.deleteMarkFromListTest();
    }

    public void deleteMarkFromListTest() {
        StudentBusinessLogic studentBusinessLogic = new StudentBusinessLogic();
        studentBusinessLogic.addStudent("Artjom", "Potasevskis");
        studentBusinessLogic.addMark("Artjom", "Potasevskis", "Math", 2);
        studentBusinessLogic.addMark("Artjom", "Potasevskis", "Math", 6);
        studentBusinessLogic.addMark("Artjom", "Potasevskis", "Math", 9);
        List<Mark> marks = studentBusinessLogic.getMarks("Artjom", "Potasevskis", "Math");
        for (Mark mark : marks) {
            System.out.println(mark.getmarkValue() + " , ");
        }

    }
}
