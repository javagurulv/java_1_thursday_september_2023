package lv.javaguru.java1.student_valera_kovs.lesson8.lvl4;


import java.util.ArrayList;
import java.util.Random;

public class HugeList {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(1000000);
        for (int i = 0; i < 10000000; i++) {
            Random random = new Random();
            i = random.nextInt(2);

            System.out.println("list " + list.size());


            }
        }
    }

