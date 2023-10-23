package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_7_senior;

class Dog {
    private String nameDog;
    private int ageDog;

    public Dog(String nameDog, int ageDog) {
        this.nameDog = nameDog;
        this.ageDog = ageDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void bark() {
        System.out.println("My nickname is " + getNameDog());
    }

    public void myAge() {
        System.out.println("I`m " + getAgeDog() + " years old");
    }

    public void birthDay() {
        System.out.println(("Today is my birth Day, now I`m " + (ageDog + 1) + " years old"));
    }

}
