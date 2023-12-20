package lv.javaguru.java1.teacher.lesson_11_project_geometry_shape.step_16.geometry.shapes;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeUtilTest {

    private ShapeUtil shapeUtil = new ShapeUtil();

    @Test
    public void shouldFindEqualCircles() {
        List<Shape> shapes = List.of(
                new Circle("A", 1.0),
                new Circle("B", 1.0),
                new Circle("A", 1.0),
                new Rectangle("A", 1.0, 2.0),
                new Square("A", 1.0)
        );
        Shape circle = new Circle("A", 1.0);
        List<Shape> equalCircles = shapeUtil.findEquals(shapes, circle);
        assertEquals(equalCircles.size(), 2);
    }

    @Test
    public void shouldFindEqualSquares() {
        List<Shape> shapes = List.of(
                new Square("A", 1.0),
                new Square("B", 1.0),
                new Square("A", 1.0),
                new Rectangle("A", 1.0, 2.0),
                new Circle("A", 1.0)
        );
        Shape square = new Square("A", 1.0);
        List<Shape> equalSquares = shapeUtil.findEquals(shapes, square);
        assertEquals(equalSquares.size(), 2);
    }

    @Test
    public void shouldFindEqualRectangles() {
        List<Shape> shapes = List.of(
                new Rectangle("A", 1.0, 2.0),
                new Rectangle("B", 1.0, 2.0),
                new Rectangle("A", 3.0, 2.0),
                new Rectangle("A", 1.0, 3.0),
                new Rectangle("A", 1.0, 2.0),
                new Square("B", 1.0),
                new Circle("A", 1.0)
        );
        Shape rectangle = new Rectangle("A", 1.0, 2.0);
        List<Shape> equalRectangles = shapeUtil.findEquals(shapes, rectangle);
        assertEquals(equalRectangles.size(), 2);
    }

}