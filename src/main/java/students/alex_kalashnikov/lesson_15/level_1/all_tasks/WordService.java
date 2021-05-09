package students.alex_kalashnikov.lesson_15.level_1.all_tasks;

class WordService {

    public int countRepetitions(String[] words, String targetWord) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(targetWord)) {
                repetitions++;
            }
        }
        return repetitions;
    }

}