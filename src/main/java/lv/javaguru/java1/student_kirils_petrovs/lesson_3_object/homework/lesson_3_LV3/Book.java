package lv.javaguru.java1.student_kirils_petrovs.lesson_3_object.homework.lesson_3_LV3;

class Book {

    private String bookTitle;
    private String author;
    private String Date;



    public Book(String bookTitle, String author, String Date){
        this.bookTitle = bookTitle;
        this.author = author;
        this.Date = Date;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return Date;
    }
}

//day1