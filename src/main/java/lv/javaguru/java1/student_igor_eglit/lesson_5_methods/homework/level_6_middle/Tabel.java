package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_6_middle;


import java.util.Scanner;

class Tabel {
    private int matematika;
    private int fizika;
    private int himija;
    private int fizra;
    private int literatura;
    private int istorija;
    private int geografija;
    private int trud;

    public Tabel(int matematika, int fizika, int himija, int fizra, int literatura, int istorija, int geografija, int trud) {

        this.matematika = matematika;
        this.fizika = fizika;
        this.himija = himija;
        this.fizra = fizra;
        this.literatura = literatura;
        this.istorija = istorija;
        this.geografija = geografija;
        this.trud = trud;
    }

    public int getMatematika() {
        System.out.println("Matematika: " + matematika);
        return matematika;
    }

    public int getFizika() {
        System.out.println("Fizika: " + fizika);
        return fizika;
    }

    public int getHimija() {
        System.out.println("Himija: " + himija);
        return himija;
    }

    public int getFizra() {
        System.out.println("Fizra: " + fizra);
        return fizra;
    }

    public int getLiteratura() {
        System.out.println("Literatura: " + literatura);
        return literatura;
    }

    public int getIstorija() {
        System.out.println("Istorija: " + istorija);
        return istorija;
    }

    public int getGeografija() {
        System.out.println("Geografija: " + geografija);
        return geografija;
    }

    public int getTrud() {
        System.out.println("Trud: " + trud);
        return trud;
    }
}
