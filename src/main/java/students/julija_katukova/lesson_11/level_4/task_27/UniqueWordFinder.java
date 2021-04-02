package students.julija_katukova.lesson_11.level_4.task_27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    public Set<String> find(String text) {
        return findUniqueWords(text);
    }

    private Set<String> findUniqueWords(String text) {
        String[] in = splitSentence(text);
        return new HashSet<>(Arrays.asList(in));
    }

    private String[] splitSentence(String text) {
        return text.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
    }
}
