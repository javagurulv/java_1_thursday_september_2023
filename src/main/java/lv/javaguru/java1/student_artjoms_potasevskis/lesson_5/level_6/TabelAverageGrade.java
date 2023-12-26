package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_6;

class TabelAverageGrade {

    public int calculator(Tabel tabel){

        return (tabel.getMatematika() + tabel.getEnglish() + tabel.getFizika() + tabel.getHimija() + tabel.getMuzika()) / 5;

    }
}
