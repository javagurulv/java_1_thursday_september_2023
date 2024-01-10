package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

abstract class Shape {

    protected String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    String getShapeTitle(){
        return title;
    }

    abstract String getShapeProperties();

    // Custom objects equals comparison
    public boolean equals(Object object) {
        if (object instanceof Shape) {
            String thisObjectString = this.title + this.getShapeProperties();
            Shape objectToCompare = (Shape) object;
            String objectToCompareString = objectToCompare.title + objectToCompare.getShapeProperties();
            if (thisObjectString.equals(objectToCompareString)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
