package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_1;

class Light {
    public String detect(int wavelength) {
        String light = "";
        if (wavelength >= 380 && wavelength <= 449) {
            light = "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            light = "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            light = "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            light = "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            light = "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            light = "Red";
        } else {
            light = "Invisible Light";
        }
        return light;
    }

}
