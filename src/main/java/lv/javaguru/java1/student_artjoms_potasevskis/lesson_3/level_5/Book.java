package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.level_5;

class Book {

    private String title;

    Book(String bookTitle) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}




