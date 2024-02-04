package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson3;

public class MusicDynamic {

    private String model;
    private int volume;
    private boolean isON;

    public MusicDynamic(String model) {
        this.model = model;
        this.volume = 0;
        this.isON = false;
    }

    public void on() {
        this.isON = true;
    }

    public void off() {
        this.isON = false;

    }

    public void increasevolume() {
        if ((this.isON == true) && (this.volume <10)) {
            this.volume = this.volume + 1;
        }

    }
}



