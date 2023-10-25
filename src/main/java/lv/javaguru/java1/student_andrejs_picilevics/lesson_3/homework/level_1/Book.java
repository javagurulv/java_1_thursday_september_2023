package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_1;
class Book {
    private String bookName;
    private String author;
    private int year;

    private Chapter chapter1;    //composition
    private Chapter chapter2;

    public Book(String bookName, String author, int year, Chapter chapter1, Chapter chapter2) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public void setChapter1(Chapter chapter1) {
        this.chapter1 = chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }

    public void setChapter2(Chapter chapter2) {
        this.chapter2 = chapter2;
    }
}
