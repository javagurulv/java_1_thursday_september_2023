package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.Dog;

class Dog {

        private String dogName;
        private  int Age;

        private int BD;



        Dog (String dogName, int Age, int BD){
            this.dogName = dogName;
            this.Age = Age;
            this.BD = BD;


        }

    public int getBD() {
        return BD;
    }

    public String getDogName() {
        return dogName;
    }

    public int getAge() {
        return Age;
    }
}


