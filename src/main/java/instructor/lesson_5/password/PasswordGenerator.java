package instructor.lesson_5.password;

import java.util.Random;

class PasswordGenerator {

    String generate(int length) {
        Random random = new Random();

        int lowerBound = 33;
        int upperBound = 127;

        char[] password = new char[length];

        for (int i = 0; i < password.length; i++) {
            password[i] = (char) (random.nextInt(upperBound - lowerBound) + lowerBound);
        }

        return new String(password);
    }
}
