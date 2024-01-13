package lv.javaguru.java1.teacher.lesson_15_exceptions.lessoncode;

public class AccessDeniedException extends Exception {

	private String invalidSecurityKey;

	public AccessDeniedException(String message, String invalidSecurityKey) {
		super(message);
		this.invalidSecurityKey = invalidSecurityKey;
	}

	public String getInvalidSecurityKey() {
		return invalidSecurityKey;
	}
}
