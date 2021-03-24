package instructor.lesson_10.optionals;

import java.util.Optional;

class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> emptyOptional = Optional.empty();
        if (emptyOptional.isEmpty()) {
            System.out.println("Empty optional is empty!");
        } else {
            System.out.println("Empty optional is not empty!"); // never happens
        }

        Optional<String> nonEmptyOptional = Optional.of("Foobar");
        if (nonEmptyOptional.isPresent()) {
            System.out.println("Non empty optional is non empty!");
        } else {
            System.out.println("Non empty optional is empty!"); // never happens
        }
    }
}
