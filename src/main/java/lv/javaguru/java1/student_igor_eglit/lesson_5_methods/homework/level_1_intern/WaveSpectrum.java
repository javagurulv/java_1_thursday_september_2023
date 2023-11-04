package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_1_intern;


class WaveSpectrum {
    public String result (int waveLenght) {
        if (violet(waveLenght)) {
            return "Violet";
        }
        if (blue(waveLenght)) {
            return "Blue";
        }
        if (green(waveLenght)) {
            return "Green";
        }
        if (yellow(waveLenght)) {
            return "Yellow";
        }
        if (orange(waveLenght)) {
            return "Orange";
        }
        if (red(waveLenght)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

    boolean violet(int waveLenght) {
        return waveLenght >= 380 && waveLenght < 449;
    }

    boolean blue(int waveLenght) {
        return waveLenght >= 450 && waveLenght < 494;
    }

    boolean green(int waveLenght) {
        return waveLenght >= 495 && waveLenght < 569;
    }

    boolean yellow(int waveLenght) {
        return waveLenght >= 570 && waveLenght < 589;
    }

    boolean orange(int waveLenght) {
        return waveLenght >= 590 && waveLenght < 619;
    }

    boolean red(int waveLenght) {
        return waveLenght >= 620 && waveLenght < 750;
    }

}
