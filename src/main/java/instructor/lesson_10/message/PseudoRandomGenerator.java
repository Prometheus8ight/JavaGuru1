package instructor.lesson_10.message;

import java.util.Random;

class PseudoRandomGenerator implements RandomGenerator {

    private final Random random = new Random();

    @Override
    public int next(int from, int to) {
        return random.nextInt(to - from) + from;
    }
}
