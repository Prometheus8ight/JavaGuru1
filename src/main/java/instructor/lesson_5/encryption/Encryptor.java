package instructor.lesson_5.encryption;

class Encryptor {

    int key;

    Encryptor(int key) {
        this.key = key;
    }

    String encrypt(String text) {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] += key;
        }

        return new String(chars);
    }

    String decrypt(String text) {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] -= key;
        }

        return new String(chars);
    }
}
