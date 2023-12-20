package lv.javaguru.java1.student_jelena_vavere.lesson_11_project_geometry_shape.geometry.shapes;

class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea()  {return Math.PI * (radius * radius);}
    public double calculatePerimeter() {return  2 * Math.PI * radius;}

    }


