package lv.javaguru.java1.student_kirils_petrovs.lesson_2_variables.homework.Home_Work_LV_3_Task;


//mport java.util.Scanner;

import java.util.Scanner;

public class Home_Work_LV3_Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("(используйте запятую если хотите вычесть десятые)");
        System.out.println("ввидите 3 любых числа");


        System.out.println("Ваши число 1:");
        double number1= scanner.nextDouble();


        System.out.println("Ваши число 2: ");
        double number2= scanner.nextDouble();


        System.out.println("Ваши число 3: ");
        double nuber3= scanner.nextDouble();


        double number4= number1+number2+nuber3;


        System.out.println("number1="+number1 );
        System.out.println("number2="+number2 );
        System.out.println("nuber3="+nuber3 );

        System.out.println("number1"+"="+number1+ " " + "+" +" " + " " +"number2"+"="+" " +number2+ " "+"+"+" " +"nuber3"+"="+nuber3+" " +" " + "="+"  "+"number4"+"="+number4);


        System.out.println("Сумма сложения: number4"+"="+" "+number4);
        double number5=number4/3;

        System.out.println("number4"+" "+number4+" "+"/"+" "+"3"+" "+"="+" "+number5);
        System.out.println("Среднее арифметическое:"+number5);

     }
}







