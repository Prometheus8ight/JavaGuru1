package students.alex_kalashnikov.lesson_12.level_2.all_tasks;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}