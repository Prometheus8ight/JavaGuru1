package students.deniss_jankovskis.lesson_11.level_4.task_27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    public Set<String> find(String text) {
        String s[] = split(text);

        Set<String> hashSet = new HashSet<>(Arrays.asList(s).subList(1, s.length));
        for (String set : hashSet) {
            System.out.println(set);
        }
        return hashSet;
    }

    private String[] split(String text) {
        return text.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
    }
}
