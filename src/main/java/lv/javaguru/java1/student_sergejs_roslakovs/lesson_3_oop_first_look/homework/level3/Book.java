package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.homework.level3;

class Book {
    private String name;
    private String author;
    private int yearOfIssue;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String name, String author, int yearOfIssue, String chapter1Name, String chapter1Text,
                String chapter2Name, String chapter2Text) {
        this.name = name;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
        this.chapter1 = new Chapter(chapter1Name, chapter1Text);
        this.chapter2 = new Chapter(chapter2Name, chapter2Text);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}

class Chapter {
    private String name;
    private String chapterText;

    public Chapter(String name, String chapterText) {
        this.name = name;
        this.chapterText = chapterText;
    }

    public String getName() {
        return name;
    }

    public String getChapterText() {
        return chapterText;
    }


}
