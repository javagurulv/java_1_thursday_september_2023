package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_5_middle;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String model = myPhone.getModel();
        System.out.println("Phone model = " + model);
    }
}
