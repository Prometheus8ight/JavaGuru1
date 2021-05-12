package students.kate_br.lesson_12.level_2.all_task;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws AccessDeniedException {

        if (credentials.hasRole(Role.CAN_SEARCH_CLIENTS)){
            throw new AccessDeniedException();
        }

        for (BankClient client : clients){
            if (client.getUid().equals(uid)){
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
