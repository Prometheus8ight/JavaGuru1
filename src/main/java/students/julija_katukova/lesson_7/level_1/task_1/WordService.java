package students.julija_katukova.lesson_7.level_1.task_1;


import java.util.Arrays;

class WordService {
    public String findMostFrequentWord(String text) {
        String[] arrayText = convertTextToStringArray(text);
        return mostFrequentWord(arrayText);
    }

    private String[] convertTextToStringArray(String text) {
        return text.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
    }

    private String mostFrequentWord(String[] arrayText) {
        String mostFrequentWord = null;
        int max = 0;
        for (int i = 0; i < (arrayText.length); i++) {
            for (int j = i + 1; j < (arrayText.length); j++) {
                int count = 1;
                if (arrayText[i].equals(arrayText[j])) {
                    count++;

                    if (max < count) {
                        max = count;
                        mostFrequentWord = arrayText[j];
                    }
                }
            }
        }
        return mostFrequentWord;
    }
}
