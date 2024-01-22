package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_3_junior.task_3;

class BookApp {

    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Introduction", "Hello World");
        Chapter chapter2 = new Chapter("The end", "Good Bye");
        Book book1 = new Book("World", "Artjom", 2023, chapter1, chapter2);
        System.out.println("Book title = " + book1.getTitle());
        System.out.println("Book author = " + book1.getAuthor());
        System.out.println("Book release year = " + book1.getReleaseYear());
        System.out.println("Book chapter 1 title = " + book1.getChapter1().getTitle());
        System.out.println("Book chapter 1 text = " + book1.getChapter1().getText());
        System.out.println("Book chapter 2 title = " + book1.getChapter2().getTitle());
        System.out.println("Book chapter 2 text = " + book1.getChapter2().getText());

        chapter1 = new Chapter("War and Peace", "Tom 1");
        chapter2 = new Chapter("XXXIV", "Tom 34");
        Book book2 = new Book("History", "Lev Tolstoy", 1867, chapter1, chapter2);
        System.out.println("Book title = " + book2.getTitle());
        System.out.println("Book author = " + book2.getAuthor());
        System.out.println("Book release year = " + book2.getReleaseYear());
        System.out.println("Book chapter 1 title = " + book2.getChapter1().getTitle());
        System.out.println("Book chapter 1 text = " + book2.getChapter1().getText());
        System.out.println("Book chapter 2 title = " + book2.getChapter2().getTitle());
        System.out.println("Book chapter 2 text = " + book2.getChapter2().getText());
    }

}
