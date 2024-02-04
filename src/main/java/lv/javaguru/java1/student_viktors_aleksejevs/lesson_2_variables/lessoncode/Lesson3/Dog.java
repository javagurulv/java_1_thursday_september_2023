package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson3;

public class Dog {

    private String nickname;
    private int age;

    public Dog(String nickname, int years) {
        this.nickname = nickname;
        this.age = age;
    }
    public String voice() {
        return "My nickname is " + this.nickname;
    }
    public void happyBirthday() {
        this.age = this.age + 1;
    }

    public int getAge() {
        return this.age;
    }
}
