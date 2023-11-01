package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.level7;

public class DogApp {
    public static void main(String[] args) {

        Dog myDog = new Dog("Rex", 3);

        System.out.println(myDog.bark());
        System.out.println("Initial age: " + myDog.getAge());

        myDog.celebrateBirthday();

        System.out.println("New age after celebrating birthday: " + myDog.getAge());
    }
}







