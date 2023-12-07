package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class MusicSpeaker {



    private String model;
    private int volume;
    private boolean is0n;

    //is0n = true
    //is0n = false

    public MusicSpeaker(String model) {

        this.model = model;
        this.volume = 0;
        this.is0n = false;
    }

    public void on(){

        this.is0n = true;

    }
public void off(){

        this.is0n = false;
        this.volume = 0;

}





}
