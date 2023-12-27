package lv.javaguru.java1.student_valera_kovs.Lesson11;

class Rectangle extends Shape{

   public int a;

   public int b;

   public Rectangle(String shapeName, int a, int b) {
        super(shapeName);
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}

