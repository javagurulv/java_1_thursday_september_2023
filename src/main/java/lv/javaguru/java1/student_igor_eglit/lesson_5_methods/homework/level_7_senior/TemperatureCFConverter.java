package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_7_senior;

class TemperatureCFConverter {
    public double converterToF(double temperatureC){
        return (temperatureC*1.8)+32;
    }
    public double converterToC(double temperatureF){
        return (temperatureF-32)/1.8;
    }
}
