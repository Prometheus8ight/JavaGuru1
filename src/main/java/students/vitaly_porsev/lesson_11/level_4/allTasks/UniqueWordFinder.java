package students.vitaly_porsev.lesson_11.level_4.allTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    public Set<String> findUniqueWords(String text) {
        String[] splitText = text.toLowerCase().split("[, . ']+");
        Set<String> textArray = new HashSet<>(Arrays.asList(splitText));
        return textArray;
    }
}
