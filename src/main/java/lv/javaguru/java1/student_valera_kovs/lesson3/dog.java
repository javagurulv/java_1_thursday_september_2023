package lv.javaguru.java1.student_valera_kovs.lesson3;

public class dog {
    private String nameDog;
    private int ageDog;


    public dog(String cezar, int i) {
    }

    public String getNameDog() {
        return nameDog;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void myAge() {
        System.out.println("I`m " + getAgeDog() + " years old");
    }

    public void birthDay() {
        System.out.println(("Today is my birth Day, now I`m " + (ageDog + 1) + " years old"));
    }

}
