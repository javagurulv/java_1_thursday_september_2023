package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.lessoncode;

import java.util.Scanner;
import static java.lang.Math.pow;
public class QuadraticEquation {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("ax^2+bx+c=0");
        System.out.print("Coefficient a=");
        double coefficientA = in.nextDouble();
        if (coefficientA==0){
            System.out.println("Coefficient a can`t be =0 in Quadratic Equation");
            //требуется строка для возвращения в начало выполнения метода
        }

        System.out.print("Coefficient b=");
        double coefficientB = in.nextDouble();
        System.out.print("Coefficient c=");
        double coefficientC = in.nextDouble();
        double discriminant = pow(coefficientB,2) - 4*coefficientA*coefficientC;

        if(0>discriminant){
            System.out.println();//пустая строка
            System.out.println("Discriminant less then Zero. No roots");
                }
        else if (0==discriminant){
            double root0 = -coefficientB/(2*coefficientA);
            System.out.println();
            System.out.print("Discriminant = 0, Root = " +root0);
        }
        else{
            double root1 = (-coefficientB + Math.sqrt(discriminant))/(2*coefficientA);
            double root2 = (-coefficientB - Math.sqrt(discriminant))/(2*coefficientA);
            System.out.println();
            System.out.println("Root 1 = " + root1);
            System.out.print("Root 2 = " + root2);
                }

        }
    }


