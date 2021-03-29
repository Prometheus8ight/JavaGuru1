package students.deniss_jankovskis.lesson_7.task_1;

import java.util.Locale;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] arr = stringArrayWord(text);
        int max2 = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int max1 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].toLowerCase(Locale.ROOT).equals(arr[j].toLowerCase())) {
                    max1++;
                    if (max1 > max2) {
                        max2 = max1;
                        index = i;
                    }
                }
            }
        }
        return "The word that occurs most times in the text is: " + arr[index];
    }

    public String[] stringArrayWord(String text) {
        return text.split("[, . ']+");
    }
}


