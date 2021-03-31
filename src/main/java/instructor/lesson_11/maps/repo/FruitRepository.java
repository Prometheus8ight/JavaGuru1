package instructor.lesson_11.maps.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

class FruitRepositoryApplication {

    public static void main(String[] args) {

        FruitRepository repository = new FruitRepository();

        UUID uuid1 = repository.save(new Fruit("Apple"));
        UUID uuid2 = repository.save(new Fruit("Banana"));
        UUID uuid3 = repository.save(new Fruit("Kiwi"));
        UUID uuid4 = repository.save(new Fruit("Papaya"));

        System.out.println("repository.findBy(uuid1).get() = " + repository.findBy(uuid1).get());
        System.out.println("repository.findBy(uuid2).get() = " + repository.findBy(uuid2).get());
        System.out.println("repository.findBy(uuid3).get() = " + repository.findBy(uuid3).get());
        System.out.println("repository.findBy(uuid4).get() = " + repository.findBy(uuid4).get());

    }
}

class FruitRepository {

    private final Map<UUID, Fruit> index = new HashMap<>();

    List<Fruit> find() {
        return new ArrayList<>(index.values());
    }

    Optional<Fruit> findBy(UUID id) {
        return Optional.ofNullable(index.get(id));
    }

    UUID save(Fruit fruit) {
        UUID id = UUID.randomUUID();
        index.put(id, fruit);
        return id;
    }
}

class Fruit {

    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
