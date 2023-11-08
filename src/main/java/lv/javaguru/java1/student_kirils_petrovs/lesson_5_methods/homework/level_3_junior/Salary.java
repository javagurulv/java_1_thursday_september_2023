package lv.javaguru.java1.student_kirils_petrovs.lesson_5_methods.homework.level_3_junior;

class Salary {

    public void Money (int inputUser ) {

        int money = 10000;
        int money2 = 50000;



        if (inputUser <= money ){
            System.out.println("30%");
        }



        if (money <= inputUser && inputUser <= money2){
            System.out.println("40%");
        }



        if (money2 <= inputUser ){
            System.out.println("50%");
        }


    }
}
