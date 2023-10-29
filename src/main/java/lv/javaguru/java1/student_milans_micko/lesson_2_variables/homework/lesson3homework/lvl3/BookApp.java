package lv.javaguru.java1.student_milans_micko.lesson_2_variables.homework.lesson3homework.lvl3;

import lv.javaguru.java1.student_daniels_demishins.lesson_2_variables.homework.lvl_4.SystemOutPrint;

public class BookApp {

    public static void main(String[] args) {

         Chapter chapter1 = new Chapter("Beggining", "Chaos is stairs");
         Chapter chapter2 = new Chapter("Name two", "Text two");
         Book book1 = new Book("Game of Thrones", "Vanja", 2000, chapter1, chapter2);
         Book book2 = new Book("Lord of the Rings", "Misha", 2003, chapter1, chapter2);

        System.out.println("Book name is = " + book1.getBookName());
        System.out.println("Author name is = " + book1.getBookAuthor());
        System.out.println("Year is = " + book1.getBookYear());
        System.out.println("Book name is = " + book2.getBookName());
        System.out.println("Author name is = " + book2.getBookAuthor());
        System.out.println("Year is = " + book2.getBookYear());






    }

}
