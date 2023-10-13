package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_7_senior.task_4;

class MusicSpeaker {

    private String model;
    private int volume;
    private boolean switchedOn;

    public MusicSpeaker(String model) {
        this.model = model;
        this.volume = 0;
        this.switchedOn = false;
    }

    public void switchOn() {
        this.switchedOn = true;
    }

    public void increaseVolume() {
        if (this.switchedOn) {
            this.volume = this.volume + 1;
        }
    }

    public void switchOff() {
        this.volume = 0;
        this.switchedOn = false;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

}
