package lv.javaguru.java1.teacher.lesson_11_project_geometry_shape.step_16.geometry.shapes;

class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square square)) return false;
        if (!super.equals(o)) return false;

        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}