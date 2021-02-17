package instructor.lesson_5.encryption;

public class EncryptionDemo {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();
        String text = prompter.promptText();

        Encryptor encryptor = new Encryptor(3);

        String encryptedText = encryptor.encrypt(text);
        String decryptedText = encryptor.decrypt(encryptedText);

        System.out.println();
        System.out.println("encryptedText = " + encryptedText);
        System.out.println("decryptedText = " + decryptedText);

    }
}
