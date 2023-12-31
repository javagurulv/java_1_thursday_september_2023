package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_3;

 class Book {

  private String name;
  private String author;
  private int releasedDate;
  private Chapter chapter1;
  private Chapter chapter2;


  public Book(String name, String author, int releasedDate, Chapter chapter1, Chapter chapter2){
   this.name = name;
   this.author = author;
   this.releasedDate = releasedDate;
   this.chapter1= chapter1;
   this.chapter2 = chapter2;
  }

  public String getName() {
   return name;
  }

  public String getAuthor() {
   return author;
  }

  public int getReleasedDate() {
   return releasedDate;
  }

  public Chapter getChapter1() {
   return chapter1;
  }

  public Chapter getChapter2() {
   return chapter2;
  }
 }
