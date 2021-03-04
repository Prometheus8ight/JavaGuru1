package students.vitaly_porsev.lesson_7.level_1.task_2;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest method = new WordServiceTest();
        method.repeatingWordTest();
        method.makeStringArrayTest();
    }

   public void repeatingWordTest() {
        WordService method = new WordService();
        checkRepeatingWord("Cлово, которое в тексте встречается больше всего раз - Вы.",
                method.repeatingWord("Вы - я, ВЫ - Я, вы."), "repeatingWordTest");
    }

    public void makeStringArrayTest(){
        WordService method = new WordService();
        String[] array = {"Вы", "я", "ВЫ", "Я", "вы"};
        String text = "Вы - я, ВЫ - Я, вы.";
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
