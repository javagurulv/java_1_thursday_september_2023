package lv.javaguru.java1.student_valera_kovs.Lesson11;



class Circle extends Shape {

    private int radius;


    public Circle(String shapeName, int radius) {
        super(shapeName);
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }
    @Override
    public double calculateArea(){
        return 3.14 * (radius * radius);
    }

    }
