package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.MusicSpeaker;

public class MusicSpeakerApp {


    public static void main(String[] args) {

        MusicSpeaker Speaker = new MusicSpeaker("JBL");

        Speaker.increaseVolume();
        Speaker.increaseVolume();

        System.out.println("Volume = " + Speaker.getVolume());
        System.out.println("IsOn = " + Speaker.isOn());

        Speaker.on();

        Speaker.increaseVolume();
        Speaker.increaseVolume();
        Speaker.increaseVolume();
        Speaker.increaseVolume();
        Speaker.increaseVolume();
        Speaker.increaseVolume();

        System.out.println("Volume = " + Speaker.getVolume());
        System.out.println("IsOn = " + Speaker.isOn());

        Speaker.off();

        System.out.println("Volume = " + Speaker.getVolume());
        System.out.println("IsOn = " + Speaker.isOn());

        Speaker.on();

        System.out.println("Volume = " + Speaker.getVolume());
        System.out.println("IsOn = " + Speaker.isOn());

    }
}
