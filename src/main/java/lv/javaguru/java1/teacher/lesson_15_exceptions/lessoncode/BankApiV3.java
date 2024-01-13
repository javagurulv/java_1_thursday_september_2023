package lv.javaguru.java1.teacher.lesson_15_exceptions.lessoncode;

import java.util.Optional;

public class BankApiV3 {

	public Optional<String> getClientFullName(String securityKey, Long clientId) {
		if (securityKey == null || !securityKey.equals("abcd")) {
			AccessDeniedUncheckedException exception = new AccessDeniedUncheckedException("Invalid sequrity key", securityKey);
			throw exception;
		}
		if (clientId == 1L) {
			return Optional.of("Petja");
		} else {
			return Optional.empty();  // return "";
		}
	}

	public static void main(String[] args) {
			BankApiV3 bankApi = new BankApiV3();
			Optional<String> result = bankApi.getClientFullName("sds", 1L);
			if (result.isEmpty()) {
				System.out.println("Client not found");
			} else {
				System.out.println("Client full name " + result.get());
			}
	}

}
