package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_1;

public class BookApp {

    public static void main(String[] args) {

        Chapter chapter1 = new Chapter("One","First chapter");
        Chapter chapter2 = new Chapter("Two","Second chapter");
        Book book1 = new Book("Java Basics", "Andrejs",2023, chapter1, chapter2);

        Chapter chapterOne = new Chapter("First","chapter 1");
        Chapter chapterTwo = new Chapter("Second","chapter 2");
        Book book2 = new Book("Java Advanced", "Viktor", 1995,chapterOne,chapterTwo);

        System.out.println("\nBook 1 INFO: ");

        System.out.println(book1.getBookName() + " " + book1.getAuthor() + " " + book1.getYear() +
                " " + book1.getChapter1().getTitle() + " " + book1.getChapter1().getText() + " "
                + book1.getChapter2().getTitle() + " " + book1.getChapter2().getText());

        System.out.println("\nBook 2 INFO: ");

        System.out.println(book2.getBookName() + " " + book2.getAuthor() + " " + book2.getYear() +
                " " + book2.getChapter1().getTitle() + " " + book2.getChapter1().getText() + " "
                + book2.getChapter2().getTitle() + " " + book2.getChapter2().getText());

    }
}
