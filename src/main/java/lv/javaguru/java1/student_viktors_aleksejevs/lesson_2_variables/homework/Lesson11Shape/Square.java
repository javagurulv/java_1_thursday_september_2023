package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.Lesson11Shape;

public class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return side * side;
}
    @Override
    public double calculatePerimeter(){
        return 4 * side;
    }

}
