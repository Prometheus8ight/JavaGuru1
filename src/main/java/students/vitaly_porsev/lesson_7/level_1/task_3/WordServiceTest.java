package students.vitaly_porsev.lesson_7.level_1.task_3;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest method = new WordServiceTest();
        method.repeatingWordTest();
        method.makeStringArrayTest();
    }

    public void repeatingWordTest() {
        WordService method = new WordService();
        checkRepeatingWord("Cлово, которое в тексте встречается больше всего раз - Слова.",
                method.repeatingWord("Слова ты говоришь не так важны…?\n" +
                        "…важнее есть – улыбка, добрый взгляд\n" +
                        "Добавь вниманье, и увидишь Дружбы жизнь\n" +
                        "Любовь рождает новые Слова."), "repeatingWordTest");
    }

    public void makeStringArrayTest(){
        WordService method = new WordService();
        String[] array = {"Слова", "ты", "говоришь", "не", "так", "важны"};
        String text = "Слова ты говоришь не так важны…?";
        checkMakeStringArray(array, method.makeStringArray(text), "makeStringArrayTest");
    }

    private void checkRepeatingWord(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    private void checkMakeStringArray(String[] expectedResult, String[] realResult, String testName) {
        if (Arrays.equals(expectedResult, expectedResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}