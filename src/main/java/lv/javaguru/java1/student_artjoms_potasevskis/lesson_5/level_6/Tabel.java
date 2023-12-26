package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_6;

class Tabel {

    private int matematika;
    private int himija;
    private int english;
    private int fizika;
    private int muzika;

    public Tabel(int matematika, int himija, int english, int fizika, int muzika){

        this.matematika = matematika;
        this.himija = himija;
        this.english = english;
        this.fizika = fizika;
        this.muzika = muzika;
    }
     public int getMatematika(){
             System.out.println("Matematika:" + matematika);
             return matematika;
    }
    public int getHimija(){
        System.out.println("Himija:" + himija);
        return himija;
    }
    public int getEnglish(){
        System.out.println("English:" + english);
        return english;
    }
    public int getFizika(){
        System.out.println("Fizika:" + fizika);
        return fizika;
    }
    public int getMuzika(){
        System.out.println("Muzika:" + muzika);
        return muzika;
    }



}
