package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.level_7;

class MusicSpeaker {

private String model;

private int volume;

private boolean isOn;

public MusicSpeaker(String model){

this.model = model;

this.volume = 0;

this.isOn = false;

}

public void on(){

    this.isOn = true;


}
    public void off(){


    this.isOn = false;
    this.volume = 0;
}

public void increasVolume(){
    if ((this.isOn == true)  && (this.volume < 10 )) {

        this.volume = this.volume + 1;
    }

}

    public boolean isOn() {
        return isOn;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }
}




