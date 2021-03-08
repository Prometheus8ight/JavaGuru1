package students.vitaly_porsev.lesson_7.level_1.task_3;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest method = new WordServiceTest();
        method.repeatingWordTest();
    }

    public void repeatingWordTest() {
        WordService method = new WordService();
        checkRepeatingWord("Cлово, которое в тексте встречается больше всего раз - слова.",
                method.repeatingWord("Слова ты говоришь не так важны…?\n" +
                        "…важнее есть – улыбка, добрый взгляд\n" +
                        "Добавь вниманье, и увидишь Дружбы жизнь\n" +
                        "Любовь рождает новые Слова."), "repeatingWordTest");
    }

    private void checkRepeatingWord(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}