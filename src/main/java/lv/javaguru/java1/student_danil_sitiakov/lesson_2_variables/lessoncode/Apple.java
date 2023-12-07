package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;
class Apple {

    private final int weight;
    private String type;
    private String color;


    public Apple(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;

    }


    public String getType() {
        return this.type;
    }


    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
