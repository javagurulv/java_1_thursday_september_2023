package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level7;

import lv.javaguru.java1.student_daniels_demishins.lesson_2_variables.homework.lvl_4.SystemOutPrint;

import java.util.Scanner;

public class TemperatureConverterDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose your temperature scale: Press (1) for Celsius or (2) for Fahrenheit: ");
        int iScale = scanner.nextInt();
        System.out.print("Please enter temperature value:");
        double dTemperature = scanner.nextDouble();
        if (iScale == 1) {
            TemperatureConverter TempConv = new TemperatureConverter(dTemperature, true);
            System.out.print("Temp in Fahrenheit is: " + TempConv.getFahrenheit());
        } else if (iScale == 2) {
            TemperatureConverter TempConv = new TemperatureConverter(dTemperature, true);
            System.out.print("Temp in Celsius is: " + TempConv.getCelsius());
        } else {
            System.out.print("Could you please the right scale value, Nigga, PLEASE????");
        }






    }




}
