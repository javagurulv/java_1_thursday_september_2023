package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.lessoncode;

class Laptop {
    private String modelName;
    private int price;

    public Laptop (String modelName,int price){
        this.modelName = modelName;
        this.price = price;
    }
    public String getModelName(){
        return this.modelName;
    }
    public int getPrice(){
        return this.price;
    }
}
