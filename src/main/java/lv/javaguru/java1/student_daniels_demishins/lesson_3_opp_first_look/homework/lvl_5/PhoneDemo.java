package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_5;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
