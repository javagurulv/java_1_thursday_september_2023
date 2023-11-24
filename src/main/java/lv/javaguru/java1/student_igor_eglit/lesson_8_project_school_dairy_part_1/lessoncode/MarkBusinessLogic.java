package lv.javaguru.java1.student_igor_eglit.lesson_8_project_school_dairy_part_1.lessoncode;


import java.util.ArrayList;
import java.util.List;

public class MarkBusinessLogic {

    private List<Mark> marks;

    public MarkBusinessLogic() {
        this.marks = new ArrayList<>();
    }

    public void addMark(String subject, int markValue) {
        Mark mark = new Mark(subject, markValue);
        marks.add(mark);
    }

    public int findMaxMark(String subject) {
        int maxMark = 0;
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            String markSubject = mark.getSubject();
            if (markSubject.equals(subject)
                    && mark.getMarkValue() > maxMark) {
                maxMark = mark.getMarkValue();
            }
        }


/*
        for (Mark mark : marks) {
            String markSubject = mark.getSubject();
            if (markSubject.equals(subject)
                    && mark.getMarkValue() > maxMark) {
                maxMark = mark.getMarkValue();
            }
        }
*/

        return maxMark;
    }

    public int findMinMark(String subject) {
        int minMark = 0;
        for (Mark mark : marks) {
            String markSubject = mark.getSubject();
            if (markSubject.equals(subject)
                    && mark.getMarkValue() > minMark) {
                minMark = mark.getMarkValue();
            }
        }
        return minMark;
    }

    public float findAverageSubjectMark(String subject) {
        int averageSubjectMark = 0;
        for (Mark mark : marks) {
            String markSubject = mark.getSubject();
            if (markSubject.equals(subject)) {
                averageSubjectMark += mark.getMarkValue();
            }
        }
        return averageSubjectMark / marks.size();
    }

    public float averageMark() {
        int averageMark = 0;
        for (Mark mark : marks) {
            averageMark += mark.getMarkValue();
        }
        return averageMark / marks.size();
    }

}
