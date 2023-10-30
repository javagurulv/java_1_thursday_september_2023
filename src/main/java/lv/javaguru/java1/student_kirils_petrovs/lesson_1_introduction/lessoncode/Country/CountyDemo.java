package lv.javaguru.java1.student_kirils_petrovs.lesson_1_introduction.lessoncode.country;

public class CountyDemo {

        public static void main(String[] args) {

            Country country1 = new Country("Latvia", "LV-+371",10000000 );
            Country country2 = new Country("Est", "ETS",1000 );
            Country country3 = new Country("Litv", "Litv",18360 );




            System.out.println("Country Name :"+country1.getCountryName() +"  "+ "Code :"+country1.getCoudeCountr() +"  "+ "Popolation :" +"  "+ country1 .getPopulation() );
            System.out.println("Country Name :"+country2.getCountryName() +"  "+ "Code :"+country2.getCoudeCountr() +"  "+ "Popolation :" +"  "+ country2 .getPopulation() );
            System.out.println("Country Name :"+country3.getCountryName() +"  "+ "Code :"+country3.getCoudeCountr() +"  "+ "Popolation :" +"  "+ country3 .getPopulation() );


        }



    }

