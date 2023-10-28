package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.level_7;

class MusicSpeakerApp {


    public static void main(String[] args) {

        MusicSpeaker speaker1 = new MusicSpeaker("Samsung");



        speaker1.increasVolume();
        speaker1.increasVolume();

        System.out.println("IsOn = " + speaker1.isOn());
        System.out.println("Volume = " + speaker1.getVolume());



        speaker1.on();
        speaker1.increasVolume();
        speaker1.increasVolume();
        speaker1.increasVolume();
        speaker1.increasVolume();
        speaker1.increasVolume();
        speaker1.increasVolume();
        speaker1.increasVolume();
        speaker1.increasVolume();
        speaker1.increasVolume();
        speaker1.increasVolume();

        System.out.println("IsOn = " + speaker1.isOn());
        System.out.println("Volume = " + speaker1.getVolume());



        speaker1.off();

        System.out.println("IsOn = " + speaker1.isOn());
        System.out.println("Volume = " + speaker1.getVolume());

        speaker1.on();

        System.out.println("IsOn = " + speaker1.isOn());
        System.out.println("Volume = " + speaker1.getVolume());




        speaker1.off();

        System.out.println("IsOn = " + speaker1.isOn());
        System.out.println("Volume = " + speaker1.getVolume());




    }



}
