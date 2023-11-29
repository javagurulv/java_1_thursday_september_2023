package lv.javaguru.java1.student_igor_eglit.lesson_8_project_school_dairy_part_1.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class ListDataTypes {
    public static void main(String[] args) {
        primitiveVar();
    }

    private static void primitiveVar() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(null);
        list.add("c");
        System.out.println(list);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(null);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        System.out.println(list1.get(0));
    }

    private static class Data {
        private String name;
        private int number;

        Data(String name, int number) {
            this.name = name;
            this.number = number;
        }

        private void listExample(String name, int number) {
            Data data1 = new Data("a", 1);
            Data data2 = new Data("b", 2);
            Data data3 = new Data("c", 3);
            List<Data> list = new ArrayList<>();
            list.add(data1);
            list.add(data2);
            list.add(data3);
            list.add(null);
        }
    }


}
