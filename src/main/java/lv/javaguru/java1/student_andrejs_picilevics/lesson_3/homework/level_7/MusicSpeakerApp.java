package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_7;

class MusicSpeakerApp {

    public static void main(String[] args) {
        MusicSpeaker speaker1 = new MusicSpeaker("Yamaha");

        speaker1.increaseVolume();
        speaker1.increaseVolume();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("Is On = " + speaker1.isOn());

        speaker1.on();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("Is On = " + speaker1.isOn());

        speaker1.off();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("Is On = " + speaker1.isOn());

        speaker1.on();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("Is On = " + speaker1.isOn());




    }
}
