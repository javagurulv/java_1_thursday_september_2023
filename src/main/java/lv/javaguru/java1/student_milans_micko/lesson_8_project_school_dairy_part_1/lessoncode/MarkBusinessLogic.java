package lv.javaguru.java1.student_milans_micko.lesson_8_project_school_dairy_part_1.lessoncode;

import java.util.ArrayList;
import java.util.List;

class MarkBusinessLogic {

    private List<Mark> marks = new ArrayList<>();

    public void addMark( String subject, int markValue) {
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
        return maxMark;

    }




}
