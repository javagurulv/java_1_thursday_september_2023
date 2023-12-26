package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_6;

class TabelApp {
    public static void main(String[] args) {
        Tabel tabel = new Tabel(9,5,7,4,10);
        Tabel tabel1 = new Tabel(6,8,9,7,10);

        TabelAverageGrade tabelAverageGrade = new TabelAverageGrade();
        System.out.println("--------"+"\n"+"Average: " + tabelAverageGrade.calculator(tabel)+"\n");
        System.out.println("--------"+"\n"+"Average: " + tabelAverageGrade.calculator(tabel1)+"\n");
    }
}
