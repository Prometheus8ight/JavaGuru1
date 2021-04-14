package instructor.lesson_13;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StringsTest {

    @Test
    public void happy_path_names() {
        Strings subject = new Strings();

        assertThat(subject.names())
                .hasSize(5)
                .containsExactlyInAnyOrder("frodo", "sauron", "boromir", "sam", "foobar");
    }

    @Test
    public void happy_path_nasty() {
        Strings subject = new Strings();

        assertThatThrownBy(() -> subject.nasty())
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Becoz");
    }
}
