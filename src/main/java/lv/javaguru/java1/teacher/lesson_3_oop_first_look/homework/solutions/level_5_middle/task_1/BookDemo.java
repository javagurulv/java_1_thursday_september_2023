package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_5_middle.task_1;

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
