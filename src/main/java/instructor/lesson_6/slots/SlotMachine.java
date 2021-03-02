package instructor.lesson_6.slots;

import java.util.Random;

class SlotMachine {

    static final String[] IMAGES = {"🍎", "🍒", "🍇", "🍋", "🍉", "🥝", "🍍"};

    public String[] spin() {
        return new String[]{randomImage(), randomImage(), randomImage()};
    }

    public String randomImage() {
        Random random = new Random();
        return IMAGES[random.nextInt(IMAGES.length)];
    }
}
