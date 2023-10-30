package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.homework.level7;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getVoice() {
        return "My nickname is " + name;

        }


    public void celebrateBirthday() {
        age++;
    }

    public int sayAge() {
        return age;
    }
}








