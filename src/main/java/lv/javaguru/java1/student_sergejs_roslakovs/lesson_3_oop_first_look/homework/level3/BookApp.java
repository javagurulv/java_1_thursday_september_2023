package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.homework.level3;

class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Author 1", 2020, "Chapter 1", "Chapter 1 text",
                "Chapter 2", "Chapter 2 text");

        Book book2 = new Book("Book2", "Author 2", 2018, "Chapter 1", "Chapter 1 text",
                "Chapter 2", "Chapter 2 text");
        System.out.println("book1 = " + book1.getName() + " " + book1.getAuthor() + " " + book1.getYearOfIssue() + " " + book1.getChapter1().getName() + " " + book1.getChapter1().getChapterText() + " " + book1.getChapter2().getName() + " " + book1.getChapter2().getChapterText());
        System.out.println("book2 = " + book2.getName() + " " + book2.getAuthor() + " " + book2.getYearOfIssue() + " " + book2.getChapter1().getName() + " " + book2.getChapter1().getChapterText() + " " + book2.getChapter2().getName() + " " + book2.getChapter2().getChapterText());
    }







    }
