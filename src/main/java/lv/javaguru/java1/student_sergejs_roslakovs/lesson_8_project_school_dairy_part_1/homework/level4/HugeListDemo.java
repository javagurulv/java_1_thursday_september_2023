package lv.javaguru.java1.student_sergejs_roslakovs.lesson_8_project_school_dairy_part_1.homework.level4;

import java.util.ArrayList;
import java.util.List;


public class HugeListDemo {


    public static void main(String[] args) {

        long lNanoTimeBefore;
        long lNanoTimeAfter;
        long lNanoDifference1;
        long lNanoDifference2;

        System.out.println("Attempt to get fastest resolve by optimising List creation.");

        lNanoTimeBefore = System.nanoTime();
        List<Boolean> BooleanList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            BooleanList.add(false);
        }
        lNanoTimeAfter = System.nanoTime();
        lNanoDifference1 = lNanoTimeAfter - lNanoTimeBefore;
        System.out.println("Time spent on 1.000.000 List generation (milliseconds): " + String.valueOf(lNanoDifference1/1000000));

        lNanoTimeBefore = System.nanoTime();
        BooleanList = new ArrayList<>();
        for (int i = 0; i < 500000000; i++) {
            BooleanList.add(false);
        }
        lNanoTimeAfter = System.nanoTime();
        lNanoDifference2 = lNanoTimeAfter - lNanoTimeBefore;
        System.out.println("Time spent on 500.000.000 List generation (milliseconds): " + String.valueOf(lNanoDifference2/1000000));

        System.out.println("1 Billion fails with Heap size error :(");
    }
}
