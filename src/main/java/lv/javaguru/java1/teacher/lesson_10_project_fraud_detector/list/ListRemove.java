package lv.javaguru.java1.teacher.lesson_10_project_fraud_detector.list;

import java.util.ArrayList;
import java.util.List;

class ListRemove {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);

        List<Integer> listToRemove = new ArrayList<>();
/*
        for(int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            if (number.equals(5)) {
                listToRemove.add(number);
            }
        }
*/
        for(Integer number : numbers) {
            if (number.equals(5)) {
                listToRemove.add(number);
            }
        }

        numbers.removeAll(listToRemove);

        for(Integer number : numbers) {
            System.out.println(number);
        }


        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("Eng", 4));
        marks.add(new Mark("Eng", 5));
        marks.add(new Mark("Eng", 5));
        marks.add(new Mark("Eng", 8));
        marks.add(new Mark("Eng", 9));

        Mark markToRemove = new Mark("Eng", 5);

        marks.remove(markToRemove);

        List<Mark> marksToRemove = List.of(markToRemove);

        marks.removeAll(List.of(markToRemove));

        for (int i = 0; i < marks.size(); i++) {
            Mark m = marks.get(i);
            if (m.equals(markToRemove)) {
                marks.remove(i);
                break;
            }
        }


    }

}
