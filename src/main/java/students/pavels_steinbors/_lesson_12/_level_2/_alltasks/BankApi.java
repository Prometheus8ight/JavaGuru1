package students.pavels_steinbors._lesson_12._level_2._alltasks;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
