package lv.javaguru.java1.teacher.lesson_8_project_school_dairy_part_1.lessoncode;

import lv.javaguru.java1.student_valera_kovs.lesson3.Robot;

import java.util.ArrayList;
import java.util.List;

class MarkApp {

    public static void main(String[] args) {
        Robot robot = new Robot("csdc");

        boolean isR = robot.equals(robot);


        Mark mark1 = new Mark("Math", 4);
        Mark mark2 = new Mark("Math", 4);

        int maxMark = Mark.maxMarkValue();
        int minMark = Mark.minMarkValue();

        boolean isRobotEquals = mark1.equals(robot);

        boolean isEquals = mark1.equals(mark2);

        Mark mark3 = new Mark("Eng", 9);


        List<Mark> marks = new ArrayList<>();

        boolean mark1Contains = marks.contains(mark1);


        int size = marks.size();

        marks.add(mark1);
        marks.add(mark2);
        marks.add(mark3);

        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);

        }

    }

    public List<Mark> findMathMarks(List<Mark> allMarks) {
        List<Mark> mathMarks = new ArrayList<>();
        for (int i = 0; i < allMarks.size(); i++) {
            Mark mark = allMarks.get(i);
            if (mark.getSubject().equals("Math")) {
                mathMarks.add(mark);
            }
        }
        return mathMarks;
    }

}
