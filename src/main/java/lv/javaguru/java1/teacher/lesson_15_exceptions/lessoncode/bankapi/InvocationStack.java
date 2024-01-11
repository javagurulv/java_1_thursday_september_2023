package lv.javaguru.java1.teacher.lesson_15_exceptions.lessoncode.bankapi;

public class InvocationStack {

    public static void main(String[] args) {
        m1();
        System.out.println("MAIN");
    }

    private static void m1() {
        m2();
        System.out.println("M1");
    }

    private static void m2() {
        m3();
        System.out.println("M2");
    }

    private static void m3() {
        System.out.println("M3");
    }

}
