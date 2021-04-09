package students.vitaly_porsev.lesson_12.level_2.allTasks;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}