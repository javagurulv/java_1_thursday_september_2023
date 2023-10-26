package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.level_7_senior;

class MusicSpeakerApp {


    public static void main(String[] args) {
        MusicSpeaker speaker1 = new MusicSpeaker("Samsung");

        speaker1.increaseVolume();
        speaker1.increaseVolume();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("IsOn = " + speaker1.isOn());

        speaker1.on();

        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("IsOn = " + speaker1.isOn());

        speaker1.off();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("IsOn = " + speaker1.isOn());

        speaker1.on();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("IsOn = " + speaker1.isOn());

    }

}
