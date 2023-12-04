package lv.javaguru.java1.student_sergejs_roslakovs.lesson_9_project_school_dairy_part_2.lessoncode;

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

}
