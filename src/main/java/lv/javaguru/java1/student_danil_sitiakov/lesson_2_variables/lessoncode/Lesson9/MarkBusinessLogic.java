package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode.Lesson9;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class MarkBusinessLogic {
    private List<Mark> marks = new ArrayList<>();
    private Object maxMark;
    private String markSubject;
    private Object ct;
    public void addMark(String subject, int markValue) {

        Mark mark = new Mark(subject, markValue);
        marks.add(mark);
    }

    private void findMaxMark(String subject){
        int maxMax = 0;
        for(int i = 0; i < marks.size(); i++){
            Mark mark = marks.get(i);
            String maxSubject = mark.getSubject;
            Object Subject = null;
            Object Object;
/*            if (mark.getMarkValue(Object) > maxMark) if (markSubject.equals(subject)) {
                maxMark = mark.getMarkValue();
            }*/
        }
    }
}
