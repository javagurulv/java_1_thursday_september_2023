package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.lessoncode;
class MaxNumber {

    int findMax (int number1, int number2, int number3){
        int max = number1 > number2 ? number1 : number2;
        max = max > number3 ? max : number3;
        return max;
    }
    int findMax (int number1, int number2){


        if(number1 > number2) {
            return number1;
        }else{
            return number2;
        }



    }


}
