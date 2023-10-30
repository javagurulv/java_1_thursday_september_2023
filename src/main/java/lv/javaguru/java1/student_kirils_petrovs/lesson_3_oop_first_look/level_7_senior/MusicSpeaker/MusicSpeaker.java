package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.MusicSpeaker;

class MusicSpeaker {



    private  String model;

    private int volume;

    boolean isOn;



    MusicSpeaker(String model){

            this.model = model;
            this.volume = 0;
            this.isOn = false;
    }

    public void on (){
        this.isOn =true;
    }


    public  void  increaseVolume() {
        if ((this.isOn == true) && (this.volume < 10)) {
            this.volume = this.volume + 1;
        }
    }




    public void  off (){
        this.isOn = false;
        this.volume = 0;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}
