package lv.javaguru.java1.teacher.lesson_15_exceptions.lessoncode.bankapi;

import java.util.List;
import java.util.Optional;

class BankSystem {

    private List<Client> clients;
    private List<String> validSecurityKeys;

    public BankSystem(List<Client> clients,
                      List<String> validSecurityKeys) {
        this.clients = clients;
        this.validSecurityKeys = validSecurityKeys;
    }

    public Optional<Client> getClientData(String securityKey,
                                          Long clientId)
            throws AccessDeniedException {
        // security check
        if (!validSecurityKeys.contains(securityKey)) {
            // access denied
            AccessDeniedException exception = new AccessDeniedException(
                    securityKey, "This key is not Valid"
            );
            throw exception;
        }

        // client search
        for (Client client : clients) {
            Long id = client.getId();
            if (id.equals(clientId)) {
                return Optional.of(client);
            }
        }

        return Optional.empty();
    }

}
