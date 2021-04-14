package instructor.lesson_13;

import java.util.List;

class Strings {

    List<String> names() {
        return List.of(
                "boromir",
                "foobar",
                "frodo",
                "sam",
                "sauron"
        );
    }

    void nasty() {
        throw new RuntimeException("Becoz");
    }
}
