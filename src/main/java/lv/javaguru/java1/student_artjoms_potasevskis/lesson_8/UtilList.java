package lv.javaguru.java1.student_artjoms_potasevskis.lesson_8;


import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.List;

public class UtilList {

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
            UtilList.Data data1 = new UtilList.Data("a", 1);
            UtilList.Data data2 = new UtilList.Data("b", 2);
            UtilList.Data data3 = new UtilList.Data("c", 3);
            List<UtilList.Data> list = new ArrayList<>();
            list.add(data1);
            list.add(data2);
            list.add(data3);
            list.add(null);
        }
    }

}
