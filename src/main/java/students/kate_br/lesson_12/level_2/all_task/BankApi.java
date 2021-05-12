package students.kate_br.lesson_12.level_2.all_task;

import java.util.Optional;

interface BankApi {

     Optional<BankClient> findByUid(UserCredentials credentials, String uid)
         throws AccessDeniedException;
}
