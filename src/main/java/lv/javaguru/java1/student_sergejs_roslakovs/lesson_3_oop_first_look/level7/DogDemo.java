package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.level7;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex", 3);

        System.out.println(myDog.getVoice());

        myDog.celebrateBirthday();

        System.out.println("I am " + myDog.sayAge() + " years old");
    }

}


