package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_6_middle;

class TabelAverageGrade {
    public int calculator(Tabel tabel) {

        return (tabel.getMatematika() +
                tabel.getTrud() +
                tabel.getLiteratura() +
                tabel.getIstorija() +
                tabel.getGeografija() +
                tabel.getFizra() +
                tabel.getFizika() +
                tabel.getHimija()) / 8;
    }

}
