package lv.javaguru.java1.student_valera_kovs.lesson8;

import java.util.ArrayList;
import java.util.List;

public class SchoolDiary {


    private List<Mark> marks;

    public SchoolDiary() {
        marks = new ArrayList<>();
    }

    public void addMark(Mark newMark) {
        this.marks.add(newMark);
    }

    public int findMaxMark(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        return findMaxMark(subjectMarks);
    }

    public int findMinMark(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        return findMinMark(subjectMarks);
    }

    public int calculateAverageMarkV1(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        int markSum = sumMarks(subjectMarks);
        return calculateAverage(subjectMarks.size(), markSum);
    }

    public int calculateAverageMarkV2(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        int sum = 0;
        for (int i = 0; i < subjectMarks.size(); i++) {
            Mark mark = subjectMarks.get(i);
            sum = sum + mark.getMark();
        }
        return sum / subjectMarks.size();
    }


    private int calculateAverage(int markCount, int markSum) {
        return markSum / markCount;
    }

    private int sumMarks(List<Mark> marks) {
        int sum = 0;
        for (int i = 0; i < marks.size(); i++) {
            Mark mark = marks.get(i);
            sum = sum + mark.getMark();
        }
        return sum;
    }


    public int findMaxMark(List<Mark> subjectMarks) {
        int maxMark = subjectMarks.get(0).getMark();
        for (int i = 0; i < subjectMarks.size(); i++) {
            Mark mark = subjectMarks.get(i);
            if (mark.getMark() > maxMark) {
                maxMark = mark.getMark();
            }
        }
        return maxMark;
    }

    public int findMinMark(List<Mark> subjectMarks) {
        int minMark = subjectMarks.get(0).getMark();
        for (int i = 0; i < subjectMarks.size(); i++) {
            Mark mark = subjectMarks.get(i);
            if (mark.getMark() < minMark) {
                minMark = mark.getMark();
            }
        }
        return minMark;
    }


    public List<Mark> findMarksBySubject(String subject) {
        List<Mark> subjectMarks = new ArrayList<>();
        for (int i = 0; i < this.marks.size(); i++) {
            Mark mark = this.marks.get(i);
            if (mark.getSubject().equals(subject)) {
                subjectMarks.add(mark);
            }
        }
        return subjectMarks;
    }


}

