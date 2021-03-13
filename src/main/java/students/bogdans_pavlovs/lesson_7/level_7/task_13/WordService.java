package students.bogdans_pavlovs.lesson_7.level_7.task_13;

/*
Профессионально подоити к улучшению кода значит:
1. понять, что делает этот код;
2. перед изменением кода написать на него автоматические тесты;
3. придумать и реализовать улучшения;
4. убедиться, что после ваших улучшений тесты по прежнему проходят.
 */


class WordService {

    public String findMostFrequentWord(String text) {

        String[] textArray = text.split(" ");
        int[] wordCountArray = new int[textArray.length];

        int max = 0;

        for (int i = 0; i < textArray.length; i++) {
            int wordCounter = 0; // each iteration starts with 0
            for (String s : textArray) {
                if (textArray[i].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[i] = wordCounter;
            if (wordCountArray[wordCounter] > max) //textArray length == wordCountArray length
                max = wordCounter; // count == wordCounter
        }
        return textArray[max];
    }

}
