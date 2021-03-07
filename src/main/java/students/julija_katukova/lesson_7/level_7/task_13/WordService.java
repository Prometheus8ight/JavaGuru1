package students.julija_katukova.lesson_7.level_7.task_13;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray = text.split(" ");
        int[] wordCountArray = new int[textArray.length];
        int max = 0;

        for (int i = 0; i < textArray.length; i++) {
            int wordCounter = 0;
            for (String s : textArray) {
                if (textArray[i].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[i] = wordCounter;
            if (wordCountArray[wordCounter] > max) {
                max = wordCounter;
            }
        }
        return textArray[max];
    }
}
