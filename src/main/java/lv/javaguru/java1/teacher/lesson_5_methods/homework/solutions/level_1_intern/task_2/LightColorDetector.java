package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_1_intern.task_2;

public class LightColorDetector {

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