package instructor.lesson_9.repository;

import java.util.Arrays;
import java.util.UUID;

public class UserRepositoryDemo {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

        User user1 = new User(UUID.fromString("de1a4f3e-e56c-4c57-9b00-dedf059a06f7"), "john", "doe");
        User user2 = new User(UUID.fromString("f8e28ff9-2050-4af3-a93b-db212e5e179c"), "johnny", "dony");
        User user3 = new User(UUID.fromString("680a9b26-31f3-48ce-8414-0f29191bb01c"), "jane", "doe");
        User user4 = new User(UUID.fromString("c182e2e6-a746-4829-8400-556d39b6c745"), "janny", "danny");

        repository.save(user1);
        repository.save(user2);
        repository.save(user3);
        repository.save(user4);

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

        System.out.println("repository.findById(UUID.fromString(\"f8e28ff9-2050-4af3-a93b-db212e5e179c\")) = " + repository.findById(UUID.fromString("f8e28ff9-2050-4af3-a93b-db212e5e179c")));

        repository.delete(UUID.fromString("680a9b26-31f3-48ce-8414-0f29191bb01c"));

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

    }
}
