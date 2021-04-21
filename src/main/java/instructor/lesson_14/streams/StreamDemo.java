package instructor.lesson_14.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamDemo {

    public static void main(String[] args) {

        List<Cat> cats = List.of(
                new Cat("Murka", "Red", 5, "Kostya"),
                new Cat("Tommi", "Black", 10, "Rodion"),
                new Cat("Tayson", "Orange", 20, "Kostya"),
                new Cat("Bars", "Gray", 4, "Kostya"),
                new Cat("Maestro", "White", 13, "Rodion"),
                new Cat("Stanislav", "Blue", 7, "Julja")
        );

        //.collect(groupingBy(cat -> cat.getOwner(), counting()));

        Map<String, Long> ownerToCatCountMap = cats.stream()
                .collect(groupingBy(Cat::getOwner, counting()));

        String ownerName = ownerToCatCountMap.entrySet().stream()
                .min(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElseThrow(IllegalStateException::new);

        System.out.println(ownerName);

//        ownerNameOptional.ifPresent(ownerName -> System.out.println(ownerName));

//        System.out.println("collect = " + ownerToCatCountMap);

//        cats.stream()
//                .filter(cat -> cat.getWeight() >= 10)
//                .map(cat -> cat.getName())
//                .forEach(cat -> System.out.println(cat));
//
//        List<Cat> collect = cats.stream()
//                .filter(cat -> cat.getWeight() >= 10)
//                .collect(toList());
//
//        Optional<Cat> optionalCat = cats.stream()
//                .filter(cat -> cat.getColor().equals("Black"))
//                .findAny();
//
//        optionalCat.ifPresent(cat -> System.out.println(cat));

    }
}

class Cat {

    private String name;
    private String color;
    private int weight;
    private String owner;

    public Cat(String name, String color, int weight, String owner) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && Objects.equals(name, cat.name) && Objects.equals(color, cat.color) && Objects.equals(owner, cat.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, weight, owner);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
