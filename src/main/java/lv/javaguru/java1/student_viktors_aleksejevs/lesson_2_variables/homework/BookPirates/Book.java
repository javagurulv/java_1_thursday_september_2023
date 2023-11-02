package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.BookPirates;

public class Book {
    private String name;
    private String author;
    private int year;
    private String chapter1;
    private String chapter2;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

}







