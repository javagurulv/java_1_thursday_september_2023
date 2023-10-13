package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_5_middle.task_2;

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
