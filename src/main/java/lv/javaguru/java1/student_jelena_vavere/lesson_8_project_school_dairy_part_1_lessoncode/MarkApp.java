package lv.javaguru.java1.student_jelena_vavere.lesson_8_project_school_dairy_part_1_lessoncode;

import java.util.ArrayList;
import java.util.List;

public class MarkApp {

    //private List<Mark> marks = new ArrayList<>();


    public static void main(String[] args) {
        Mark mark1 = new Mark("Math", 4);
        Mark mark2= new Mark("Math", 8);
        Mark mark3 = new Mark("Math", 9);

        Mark mark4 = new Mark("Eng", 9);
        Mark mark5 = new Mark("Eng", 2);

        List<Mark> marks = new ArrayList<>();
        marks.add(mark1);
        marks.add(mark2);
        marks.add(mark3);
        marks.add(mark4);
        marks.add(mark5);

        //marks.size(); это метод чтобы узнать размер, длину. Сколько элементов на данный момент в списке

        Mark mark = marks.get(0);   //это мы подаем индекс. Он начинается с 0
    }
}
