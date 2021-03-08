package students.vitaly_porsev.lesson_7.level_1.task_2;

import java.util.Locale;

class WordService {

    public String repeatingWord(String text) {
        String[] array = makeStringArray(text);
        int max2 = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int max1 = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].toLowerCase(Locale.ROOT).equals(array[j].toLowerCase())) {
                    max1++;
                    if (max1 > max2) {
                        max2 = max1;
                        index = i;
                    }
                }
            }
        }
        return "Cлово, которое в тексте встречается больше всего раз - " + array[index] + ".";
    }

    public String[] makeStringArray(String text) {
        return text.split("[, . '-]+");
    }
}
