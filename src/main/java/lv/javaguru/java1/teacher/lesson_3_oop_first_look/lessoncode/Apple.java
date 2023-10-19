package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class Apple {

    private String type;
    private String color;
    private int weight;

    public Apple(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

}
