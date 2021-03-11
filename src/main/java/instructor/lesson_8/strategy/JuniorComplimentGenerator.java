package instructor.lesson_8.strategy;

import java.util.Random;

class JuniorComplimentGenerator extends AbstractComplimentGenerator {

    private final Random random = new Random();
    private final String[] compliments = {
            "I like your TikTok 🤩",
            "Can I follow you on Insta? 😏",
            "I like your JBL 💪"
    };

    @Override
    public String next() {
        return compliments[random.nextInt(compliments.length)];
    }
}
