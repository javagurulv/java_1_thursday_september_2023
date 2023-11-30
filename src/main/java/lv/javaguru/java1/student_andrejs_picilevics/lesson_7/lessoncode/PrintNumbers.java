package lv.javaguru.java1.student_andrejs_picilevics.lesson_7.lessoncode;

class PrintNumbers {

    public String printNumbers(int numberTo){
      //  System.out.println(1 + " " + 2 + " " + 3 + " ");

      //  System.out.print(1);
     //   System.out.print(" ");

      //  System.out.print(2);
      //  System.out.print(" ");

     //   System.out.print(3);
     //   System.out.print(" ");
        String str = "";

        for(int i = 1 ; i <= numberTo ; i ++){
            str = str + i;
            str = str + " ";
        }


        return str;
    }



}
