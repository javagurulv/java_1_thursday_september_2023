package lv.javaguru.java1.teacher.lesson_15_exceptions.lessoncode.bankapi;


import java.util.List;
import java.util.Optional;

class BankSystemApp {

    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem(
                List.of(
                        new Client(1L, "Vasja", "123"),
                        new Client(2L, "Petja", "454")
                ),
                List.of("EEE-1", "WWW-1")
        );

        try {
            Optional<Client> clientOpt = bankSystem.getClientData("EEhxdE-1", 1L);
            Client client = clientOpt.get();
            System.out.println("Found client: " + client);

            clientOpt = bankSystem.getClientData("EEE-1", 77L);
            System.out.println("Client not found: " + clientOpt.isEmpty());

            clientOpt = bankSystem.getClientData("TTT-9", 1L);
            System.out.println("Client not found: " + clientOpt.isEmpty());
        } catch (AccessDeniedException exception) {
            System.out.println(exception.getErrorMessage());
            System.out.println(exception.getNotValidSecurityKey());
        }

        System.out.println("FINISH!");
    }

}
