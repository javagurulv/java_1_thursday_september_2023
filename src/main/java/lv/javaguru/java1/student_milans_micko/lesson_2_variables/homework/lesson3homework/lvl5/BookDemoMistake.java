package lv.javaguru.java1.student_milans_micko.lesson_2_variables.homework.lesson3homework.lvl5;

public class BookDemoMistake {

    public static void main(String[] args) {
        BookMistake myBook = new BookMistake("Principles");

        System.out.println("Book title = " + myBook.getTitle());

        String bookTitle = myBook.getTitle();
    }
}
