package lv.javaguru.java1.student_milans_micko.lesson_5_methods.homework.lvl1;

public class ColorsApp {
    public static void main(String[] args) {
        Colors colors = new Colors();
        System.out.println("380 = " +colors.detect(380));
        System.out.println("470 = " +colors.detect(470));
        System.out.println("500 = " +colors.detect(500));
        System.out.println("1000 = " +colors.detect(1000));
        System.out.println("580 = " +colors.detect(580));
        System.out.println("650 = " +colors.detect(650));
    }
}
