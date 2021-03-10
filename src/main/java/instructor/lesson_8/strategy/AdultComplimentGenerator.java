package instructor.lesson_8.strategy;

import java.util.Random;

class AdultComplimentGenerator extends AbstractComplimentGenerator {

    private final Random random = new Random();
    private final String[] compliments = {
            "I like that you don't have a JBL 💪",
            "You have a solid personality and zero problems",
            "I like how you cook that chicken 🍗"
    };

    @Override
    public String next() {
        return compliments[random.nextInt(compliments.length)];
    }
}
