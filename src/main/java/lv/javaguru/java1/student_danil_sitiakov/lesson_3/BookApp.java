package lv.javaguru.java1.student_danil_sitiakov.lesson_3;

public class BookApp {
    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Beggining", "A Long time ago....");
        Chapter chapter2 = new Chapter("Ending", "... in the galaxy,far,far away");
        lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_3.Book book1 = new lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_3.Book("Star Wars Adventure", "George Lucas", 2023, chapter1, chapter2);

        System.out.println("Book name is: " + book1.getName());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Released date: " + book1.getReleasedDate());
        System.out.println("Chapter 1 name: " + chapter1.getChapterName());
        System.out.println("Chapter 1 text: " + chapter1.getChapterText());
        System.out.println("Chapter 2 name: " + chapter2.getChapterName());
        System.out.println("Chapter 2 text: " + chapter2.getChapterText());

        Chapter chapter3 = new Chapter("Origin", "Friendly Neighboorhood");
        Chapter chapter4 = new Chapter("Bite", "The spider bites Piter Parker");
        lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_3.Book book2 = new lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_3.Book("Amazing Spider-Man", "Stan Lee", 2024, chapter1, chapter2);

        System.out.println("Book name is: " + book2.getName());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Released date: " + book2.getReleasedDate());
        System.out.println("Chapter 1 name: " + chapter3.getChapterName());
        System.out.println("Chapter 1 text: " + chapter3.getChapterText());
        System.out.println("Chapter 2 name: " + chapter4.getChapterName());
        System.out.println("Chapter 2 text: " + chapter4.getChapterText());

    }
}
