package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

class ShapeUtilDemo {
    public static void main(String[] args) {
        circleCalculation();
        squareCalculation();
        rectangleCalculation();
    }

    private static void circleCalculation() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateSquare(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Площадь круга = " + circleArea + '\t' + "Периметр круга = " + circlePerimeter);
    }

    private static void squareCalculation() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateSquare(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Площадь квадрата = " + squareArea + '\t' + "Периметр квадрата = " + squarePerimeter);
    }
    private static void rectangleCalculation(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateSquare(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Площадь прямоугольника = " + rectangleArea + '\t' + "Периметр прямоугольника = " + rectanglePerimeter);
    }

}
