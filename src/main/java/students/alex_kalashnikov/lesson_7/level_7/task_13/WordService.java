package students.alex_kalashnikov.lesson_7.level_7.task_13;

class WordService {

    private String[] createTextArray(String text) {
        return text.split(" ");
    }

    private int[] createWordCountArray(String[] textArray) {
        int[] wordCountArray;
        wordCountArray = new int[textArray.length];
        return wordCountArray;
    }

    private int[] countWords(String[] textArray, int[] wordCountArray) {
        int wordCounter = 0;
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
        return wordCountArray;
    }

    private String findMax(String[] textArray, int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return textArray[max];
    }

    public String findMostFrequentWord(String text) {
        String[] textArray = createTextArray(text);
        int[] wordCountArray = createWordCountArray(textArray);
        countWords(textArray, wordCountArray);
        return findMax(textArray, wordCountArray);
    }

}