package lv.javaguru.java1.student_igor_eglit.lesson_8_project_school_dairy_part_1.lessoncode;


import java.util.ArrayList;
import java.util.List;

class MarkBusinessLogic {

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
        int minMark = 11;
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            String markSubject = mark.getSubject();
            if (markSubject.equals(subject)
                    && mark.getMarkValue() < minMark) {
                minMark = mark.getMarkValue();
            }
        }
        return minMark != 11 ? minMark : 0;
    }

    public float findAverageSubjectMark(String subject) {
        int averageSubjectMark = 0;
        int subjectElementCount = 0;
        for (Mark mark : marks) {
            String markSubject = mark.getSubject();
            if (markSubject.equals(subject)) {
                averageSubjectMark += mark.getMarkValue();
                subjectElementCount++;
            }
        }
        return subjectElementCount != 0 ? (averageSubjectMark / subjectElementCount) : averageSubjectMark;
    }

    public float findAverageMark() {
        int averageMark = 0;
        for (Mark mark : marks) {
            averageMark += mark.getMarkValue();
        }
        return marks.size() != 0 ? averageMark / marks.size() : averageMark;
    }

}
