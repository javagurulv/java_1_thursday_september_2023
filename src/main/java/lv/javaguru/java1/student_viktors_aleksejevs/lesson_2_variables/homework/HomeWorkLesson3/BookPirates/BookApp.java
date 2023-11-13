package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson3.BookPirates;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("Pirates", "ViForceIntertaiment", 2023);
        Book book2 = new Book("Sportcars", "SportIntertaiment", 2020);

        BookChapter1 bookChapter1 = new BookChapter1("Pirate Expedition", "Pirate crew investigation");
        BookChapter2 bookChapter2 = new BookChapter2("Pirate Adventure", "Pirate crew new challenges");

        Book2Chapter1 book2Chapter1 = new Book2Chapter1("Premium Cars", "Sport Premium Cars: BMW, AUDI");
        Book2Chapter2 book2Chapter2 = new Book2Chapter2("Deluxe Sport Cars", "Super sport cars: Lamborgini, Bugatti");

        System.out.println("Name = " + book1.getName());
        System.out.println("Author = " + book1.getAuthor());
        System.out.println("Year = " + book1.getYear());

        System.out.println("Name = " + book2.getName());
        System.out.println("Author = " + book2.getAuthor());
        System.out.println("Year = " + book2.getYear());


        System.out.println("Chapter1 = " + bookChapter1.getName());
        System.out.println("Chapter1 text  = " + bookChapter1.getText());

        System.out.println("Chapter1 = " + book2Chapter1.getName());
        System.out.println("Chapter1 text  = " + book2Chapter1.getText());

        System.out.println("Chapter2 = " + bookChapter2.getName());
        System.out.println("Chapter2 text = " + bookChapter2.getText());

        System.out.println("Chapter2 = " + book2Chapter2.getName());
        System.out.println("Chapter2 text = " + book2Chapter2.getText());
    }
}

