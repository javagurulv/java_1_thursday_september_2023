package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.BookPirates;

public class BookChapter2 {
    private String name;
    protected String text;

    public BookChapter2(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
