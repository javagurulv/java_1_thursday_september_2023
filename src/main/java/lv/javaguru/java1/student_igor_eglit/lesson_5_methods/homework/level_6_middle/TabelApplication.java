package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_6_middle;

public class TabelApplication {
    public static void main(String[] args) {

        Tabel tabel = new Tabel(8,
                5,
                9,
                6,
                7,
                9,
                9,
                10);
        Tabel tabel1 = new Tabel(6,
                3,
                4,
                6,
                2,
                1,
                7,
                10);

        TabelAverageGrade tableAverage = new TabelAverageGrade();
        System.out.println("--------"+"\n"+"Average: " + tableAverage.calculator(tabel)+"\n");
        System.out.println("--------"+"\n"+"Average: " + tableAverage.calculator(tabel1)+"\n");
    }
}
