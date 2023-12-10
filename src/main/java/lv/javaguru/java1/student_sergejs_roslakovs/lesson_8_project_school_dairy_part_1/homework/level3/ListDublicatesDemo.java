package lv.javaguru.java1.student_sergejs_roslakovs.lesson_8_project_school_dairy_part_1.homework.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListDublicatesDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(999);
        integerList.add(999);
        integerList.add(999);
        integerList.add(999);
        integerList.add(999);

        String sListData = "";
        sListData = getStringValuesFromList(integerList);
        System.out.println("Initial List values: (" + sListData + ") & List size: " + integerList.size());

    }

    private static String getStringValuesFromList(List<Integer> List){
        String sListData = "";
        for (int i = 0; i < List.size(); i++) {
            sListData = sListData + String.valueOf(List.get(i)) + ",";
        }
        return sListData.substring(0,sListData.length()-1);
    }


}
