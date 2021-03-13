package students.kristine_paskevica.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest testi = new WordServiceTest();
        testi.atkartoTests();
        testi.veidoVirkniMasTests();
    }

    public void atkartoTests() {
        WordService method = new WordService();
        checkRepeatingWord("Vārds, kurš tekstā visbiežāk ir sastopams, tas ir: ir",
                method.repeatingWord("Ir, IR, ir."), "Vārdu atkārtošanās");
    }

    public void veidoVirkniMasTests() {
        WordService method = new WordService();
        String[] array = {"Ir", "IR", "ir"};
        String text = "Ir, IR, ir.";
        checkMakeStringArray(array, method.makeStringArray(text), "Veido virkni ");
    }

    private void checkRepeatingWord(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - ir patiess!");
        } else {
            System.out.println(testName + " - nav patiess!");
        }
    }

    private void checkMakeStringArray(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, expectedResult)) {
            System.out.println(testName + " - ir patiess!");
        } else {
            System.out.println(testName + " - nav patiess!");
        }
    }
}

