package students.deniss_jankovskis.lesson_7.task_16;

import java.util.Arrays;
import java.util.UUID;

public class RepositoryDemo {

    public static void main(String[] args) {

        Repository repository = new Repository();
        UserEntity userEntity1 = new UserEntity(UUID.fromString("bc55cfe2-8c94-11eb-8dcd-0242ac130003"),
                "Sara", "Jacobs", "10442");
        UserEntity userEntity2 = new UserEntity(UUID.fromString("ecf0afd2-8c94-11eb-8dcd-0242ac130003"),
                "Michael", "Meadows", "32582");
        UserEntity userEntity3 = new UserEntity(UUID.fromString("cf761e8b-00e9-41a6-b6b2-3c6fd227e7f0"),
                "Michelle", "Smith", "58921");
        UserEntity userEntity4 = new UserEntity(UUID.fromString("cad38058-42a3-4633-8b6f-2cbc6ea1a971"),
                "John", "Doe", "65789");

        repository.saveUser(userEntity1);
        repository.saveUser(userEntity2);
        repository.saveUser(userEntity3);
        repository.saveUser(userEntity4);

        System.out.println("Find all users = " + Arrays.toString(repository.findAllUsers()));
        System.out.println("Find by ID " + repository.findById(UUID.fromString("bc55cfe2-8c94-11eb-8dcd-0242ac130003")));
        System.out.println("Find by name " + repository.findByName("Michael"));
        System.out.println("Find by surname " + repository.findBySurname("Smith"));
        System.out.println("Find by personal code " + repository.findByPersonalCode("65789"));

        repository.deleteUser("\"Sara\"");
        repository.deleteUser("\"Michelle\"");
        repository.editUser("bc55cfe2-8c94-11eb-8dcd-0242ac130003", "Sara", "Smith");

        System.out.println("Check repository users = " + Arrays.toString(repository.findAllUsers()));
    }
}
