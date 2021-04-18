package students.alex_kalashnikov.lesson_12.level_2.all_tasks;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public List<BankClient> getClients() {
        return clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (!credentials.check()) {
            throw new AccessDeniedException();
        } else {
            for (int i = 0; i < clients.size(); i++) {
                if (clients.get(i).getUid().equals(uid)) {
                    return Optional.of(clients.get(i));
                }
            }
        }
        return Optional.empty();
    }

}