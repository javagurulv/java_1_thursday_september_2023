package lv.javaguru.java1.student_milans_micko.lesson_2_variables.homework.lesson3homework.lvl3;

class Book {

    private String bookName;
    private String bookAuthor;
    private int bookYear;
    private Chapter chapterOne;
    private Chapter chapterTwo;

    public Book(String bookName,
                String bookAuthor,
                int bookYear,
                Chapter chapterOne,
                Chapter chapterTwo) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.chapterOne = chapterOne;
        this.chapterTwo = chapterTwo;
    }

    public String getBookName() { return bookName; }
    public String getBookAuthor() { return bookAuthor; }
    public int getBookYear() { return bookYear; }
    public Chapter getChapterOne() { return chapterOne; }
    public Chapter getChapterTwo() { return chapterTwo; }


}
