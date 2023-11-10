package lv.javaguru.java1.student_jelena_vavere.lesson_3_oop_first_look.lessoncode;


    class CountryApplication {

        public static void main(String[] args) {
           Country lv = new Country("Latvija", "LV" , 1500000);
           Country ee = new Country("Estonia", "EE" , 200000);

            System.out.println("country 1 = " + lv.getFullName() + " " + lv.getShortCode());
            System.out.println("country 2 = " + ee.getFullName() + " " + ee.getShortCode());

        }

    }


