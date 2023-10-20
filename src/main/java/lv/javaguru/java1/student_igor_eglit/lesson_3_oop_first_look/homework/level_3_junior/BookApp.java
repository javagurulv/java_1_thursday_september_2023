package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_3_junior;

public class BookApp {
    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Chapter 1 Title", "Chapter 1 Text");
        Chapter chapter2 = new Chapter("Chapter 2 Title", "Chapter 2 Text");

        Book book1 = new Book("Poems", "Pushkin", 1978, chapter1, chapter2);

        String title = book1.getTitle();
        String author = book1.getAuthor();
        int year = book1.getYear();
        Chapter ch1 = book1.getChapter1();
        Chapter ch2 = book1.getChapter2();

        String title1 = ch1.getChapterTitle();
        String text1 = ch1.getChapterText();

        String title2 = ch2.getChapterTitle();
        String text2 = ch2.getChapterText();
    }
}
