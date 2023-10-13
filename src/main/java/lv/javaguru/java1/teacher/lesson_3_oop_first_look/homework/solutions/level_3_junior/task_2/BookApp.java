package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_3_junior.task_2;

class BookApp {

    public static void main(String[] args) {
        Chapter chapter1 = new Chapter("Introduction", "chapter text");
        Chapter chapter2 = new Chapter("The end", "chapter text");
        Book book1 = new Book("Java programming", "JavaGuru", 2023, chapter1, chapter2);

        chapter1 = new Chapter("Start", "chapter text");
        chapter2 = new Chapter("Finish", "chapter text");
        Book book2 = new Book("QA course", "QAGuru", 2023, chapter1, chapter2);
    }

}
