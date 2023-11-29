package lv.javaguru.java1.student_valera_kovs.lesson8.lvl1;

import java.util.ArrayList;

class ListData {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(null);
        list.add(1, "Goodbye");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.addAll(list);
        System.out.println("Goodbye: " + secondList);
        secondList.addAll(1, list);
        System.out.println("Hello: " + secondList);


    }
}
