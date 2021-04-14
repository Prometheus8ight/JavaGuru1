package instructor.lesson_13.message;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

class MessageSupplierTest {

    @Test
    void always_0_message() {
        RandomGenerator randomGenerator = mock(RandomGenerator.class); //new MockRandomGenerator(0);

        when(randomGenerator.next(anyInt(), anyInt())).thenReturn(0);

        MessageSupplier subject = new MessageSupplier(randomGenerator);

        Message expected = new Message("Кличко", "не каждый может смотреть в завтрашний день");
        Message actual = subject.getRandom();

        assertThat(actual).isEqualTo(expected);

        verify(randomGenerator).next(eq(0), eq(5));
    }

    @Test
    void always_1_message() {
        RandomGenerator randomGenerator = mock(RandomGenerator.class); //new MockRandomGenerator(1);

        when(randomGenerator.next(anyInt(), anyInt())).thenReturn(1);

        MessageSupplier subject = new MessageSupplier(randomGenerator);

        Message expected = new Message("Nike", "Just do it");
        Message actual = subject.getRandom();

        assertThat(actual).isEqualTo(expected);

        verify(randomGenerator).next(eq(0), eq(5));
    }
}
