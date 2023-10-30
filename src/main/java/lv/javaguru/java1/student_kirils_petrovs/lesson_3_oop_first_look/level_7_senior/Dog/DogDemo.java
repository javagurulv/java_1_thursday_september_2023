package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.Dog;

class DogDemo {
    public static void main(String[] args) {

        Dog Dog = new Dog("Bobik",5,1);


        String dogNameName = Dog.getDogName();
        int Age = Dog.getAge();
        int BD = Dog.getBD();

        int BD1 = BD+Age;





        System.out.println("My nickname is "+dogNameName);
        System.out.println("Age: "+Age);
        System.out.println("Today is my birth Day, now I`m "+BD1+" years old");

    }

}


