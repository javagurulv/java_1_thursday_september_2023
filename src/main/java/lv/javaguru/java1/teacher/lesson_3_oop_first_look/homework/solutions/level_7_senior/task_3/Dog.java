package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_7_senior.task_3;

class Dog {

    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
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
