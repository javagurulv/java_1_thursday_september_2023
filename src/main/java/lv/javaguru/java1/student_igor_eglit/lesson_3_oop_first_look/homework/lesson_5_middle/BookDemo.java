package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.lesson_5_middle;

public class BookDemo {
    public static void main(String[] args) {
        Book5 myBook = new Book5("Principles");
        String title = myBook.getTitle();
        System.out.println("Book title = " + title);
    }
}
