package lv.javaguru.java1.student_sergejs_roslakovs.lesson_8_project_school_dairy_part_1.homework.level2;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        String sListData = "";
        sListData = getStringValuesFromList(integerList);
        System.out.println("Initial List values: (" + sListData + ") & List size: " + integerList.size());

        integerList.add(0, 10);

        sListData = getStringValuesFromList(integerList);
        System.out.println("Values,after adding new value to the beginning of the List: (" + sListData + ") & List size: " + integerList.size());

        integerList.add(20);

        sListData = getStringValuesFromList(integerList);
        System.out.println("Values,after adding new value to the end of the List: (" + sListData + ") & List size: " + integerList.size());

        integerList.remove(0);

        sListData = getStringValuesFromList(integerList);
        System.out.println("Values, after removing value from the List (by Index [first element]): (" + sListData + ") & List size: " + integerList.size());

        integerList.remove(Integer.valueOf(5));

        sListData = getStringValuesFromList(integerList);
        System.out.println("Values, after removing value from the List (by Object value [value: 5]): (" + sListData + ") & List size: " + integerList.size());

        boolean isEmpty = integerList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        for (Integer element : integerList) {
            System.out.println(element);
        }
    }

    private static String getStringValuesFromList(List<Integer> List){
        String sListData = "";
        for (int i = 0; i < List.size(); i++) {
            sListData = sListData + String.valueOf(List.get(i)) + ",";
        }
        return sListData.substring(0,sListData.length()-1);
    }



}
