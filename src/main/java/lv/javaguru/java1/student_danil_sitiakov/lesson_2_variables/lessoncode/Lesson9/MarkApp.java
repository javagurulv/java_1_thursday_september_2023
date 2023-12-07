package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode.Lesson9;

import java.util.ArrayList;
import java.util.List;

public class MarkApp {
    public static <List> void main(String [] args){
    Mark mark1 = new Mark("math", 4);
    Mark mark2 = new Mark("math", 8);
    Mark mark3 = new Mark("math", 9);

    Mark mark4 = new Mark("math", 9);
    Mark mark5 = new Mark("math", 2);

    List marks = (List) new ArrayList<>();
    }
}
