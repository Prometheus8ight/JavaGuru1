package instructor.lesson_4.pickup;

import java.util.Random;

public class PickUpLineGenerator {

    String generate(String gender, String name) {
        switch (gender.toLowerCase()) {     // Privesti pol v nizhnij registr i nachatj poisk
            case "male":                    // Esli "male" (muzhchina) to
                return getMaleLine(name);
            case "female":                  // Esli "female" (zhenschina) to
                return getFemaleLine(name);
            default:
                return getNeitherLine();    // Esli ne "male" i ne "female", to oschibka
        }
    }

    String getMaleLine(String name) {
        // Declare male pick up lines
        String line1 = "Oh wow.. You have a nice car, " + name + " 📍";
        String line2 = "Dayum.. What a body, " + name + " 💪😘";
        String line3 = name + ", you are so kind.. Are you single? 😍";

        // Ger random number
        int value = getRandomInt();

        // Select pick up line by random number we got
        if (value == 0) {
            return line1;
        } else if (value == 1) {
            return line2;
        } else {
            return line3;
        }
    }

    String getFemaleLine(String name) {
        // Declare male pick up lines
        String line1 = "You have very beautiful eyes and smile, " + name + " 😘";
        String line2 = "Hey, " + name + ", are you from rich family? 💰🤑";
        String line3 = "You're beautiful, " + name + "! You're beautiful, you're beautiful, it's true 💘";

        // Ger random number
        int value = getRandomInt();

        // Select pick up line by random number we got
        if (value == 0) {
            return line1;
        } else if (value == 1) {
            return line2;
        } else {
            return line3;
        }
    }

    String getNeitherLine() {
        // Just a fallback phrase
        return "Lookin' good today";
    }

    int getRandomInt() {
        // Create generator and generate random number from 0 to 2 (3 - exclusive)
        // In order to have different phrases
        Random random = new Random();
        return random.nextInt(3); // 0, 1, 2
    }
}
