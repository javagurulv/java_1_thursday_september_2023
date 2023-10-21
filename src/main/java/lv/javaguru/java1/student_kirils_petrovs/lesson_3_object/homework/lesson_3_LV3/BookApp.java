package lv.javaguru.java1.student_kirils_petrovs.lesson_3_object.homework.lesson_3_LV3;

class BookApp {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------");

        Book book = new Book("Metro 2035", "Dmitry Glukhovsky", "12.06.2015");


        System.out.println("Title:" + " " + book.getBookTitle());
        System.out.println("Author:" + " " + book.getAuthor());
        System.out.println("Date:" + " " + book.getDate());

        System.out.println("-------------------------------------------------");

        BookChapterAndNameChapter chapter = new BookChapterAndNameChapter("1", "Кто это там?", "2", "Черные...");


        System.out.println("Chapter;" + " " + chapter.getChapter1());
        System.out.println("Name Chapter:" + " " + chapter.getNameChapter1());
        System.out.println("Chapter:" + " " + chapter.getChapter2());
        System.out.println("Name Chapter:" + " " + chapter.getNameChapter2());

        System.out.println("-------------------------------------------------");




    }


}


//day1




