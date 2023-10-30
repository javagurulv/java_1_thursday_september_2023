package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_5_middle.book;

public class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }
}