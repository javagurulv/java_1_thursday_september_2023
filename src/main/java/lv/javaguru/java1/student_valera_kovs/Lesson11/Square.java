package lv.javaguru.java1.student_valera_kovs.Lesson11;

class Square extends Shape{

    private double side;

    public Square(String shapeName, double side) {
        super(shapeName);
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

}

