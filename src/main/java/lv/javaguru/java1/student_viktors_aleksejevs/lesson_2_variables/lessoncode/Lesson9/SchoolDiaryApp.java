package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson9;


import lv.javaguru.java1.student_sergejs_roslakovs.lesson_9_project_school_dairy_part_2.homework.Mark;

import java.util.List;

public class SchoolDiaryApp {

    public static void main(String[] args) {
        SchoolDiary schoolDiary = new SchoolDiary();
        schoolDiary.addMark(new Mark("Math", 10));
        schoolDiary.addMark(new Mark("Eng", 5));
        schoolDiary.addMark(new Mark("Eng", 6));
        schoolDiary.addMark(new Mark("Math", 6));

        int maxMark = schoolDiary.findMaxMark("Math");

        int maxMark2 = schoolDiary.findMaxMark(
                List.of(
                        new Mark("Math", 10),
                        new Mark("Math", 5)
                )
        );


    }

}
