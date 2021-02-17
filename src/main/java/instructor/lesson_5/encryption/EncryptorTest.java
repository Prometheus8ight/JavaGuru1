package instructor.lesson_5.encryption;

public class EncryptorTest {

    public static void main(String[] args) {
        EncryptorTest testRunner = new EncryptorTest();
        testRunner.shouldEncryptWithNonZeroKey();
        testRunner.shouldEncryptWithZeroKey();
        testRunner.shouldEncryptWithLargeKey();
        testRunner.shouldEncryptWithNegativeKey();
    }

    void shouldEncryptWithNonZeroKey() {
        // Arrange
        Encryptor subject = new Encryptor(1);

        // Act
        String expected = "Ifmmp";
        String actual = subject.encrypt("Hello");

        // Assert
        assertThatEqual(expected, actual, "shouldEncryptWithNonZeroKey");
    }

    void shouldEncryptWithZeroKey() {
        // Arrange
        Encryptor subject = new Encryptor(0);

        // Act
        String expected = "Hello";
        String actual = subject.encrypt("Hello");

        // Assert
        assertThatEqual(expected, actual, "shouldEncryptWithZeroKey");
    }

    void shouldEncryptWithLargeKey() {
        // Arrange
        Encryptor subject = new Encryptor(50);

        // Act
        String expected = "zfmmp";
        String actual = subject.encrypt("Hello");

        // Assert
        assertThatEqual(expected, actual, "shouldEncryptWithLargeKey");
    }

    void shouldEncryptWithNegativeKey() {
        // Arrange
        Encryptor subject = new Encryptor(-1);

        // Act
        String expected = "Gdkkn";
        String actual = subject.encrypt("Hello");

        // Assert
        assertThatEqual(expected, actual, "shouldEncryptWithNegativeKey");
    }

    void assertThatEqual(String expected, String actual, String scenario) {
        if (expected.equals(actual)) {
            System.out.println("[ OK ]: " + scenario);
        } else {
            System.out.println("[FAIL]: " + scenario);
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
