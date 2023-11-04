package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_3.lessoncode;

class CountryApplication {

    public static void main(String[] args) {
        Country lv = new Country("Latvija", "LV", 1500000);
        Country ee = new Country("Estonia", "EE", 1000000);

        System.out.println("country 1 = " + lv.getFullName() + " " + lv.getShortCode());
        System.out.println("country 2 = " + ee.getFullName() + " " + ee.getShortCode());

    }

}
