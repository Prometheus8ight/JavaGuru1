package students.alex_kalashnikov.lesson_11.level_4.task_27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        String cleanText = text.replaceAll("\\p{Punct}", "");
        String finalText = cleanText.toLowerCase();
        String[] arr = finalText.split(" ");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) {
                continue;
            } else {
                set.add(arr[i]);
            }
        }
        return set;
    }

}