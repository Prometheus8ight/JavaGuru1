package students.vitaly_porsev.lesson_15.level_1.allTasks;

class WordsService {

    public int countRepetitions(String[] words, String repeatingWord) {
        int repetitions = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                repetitions++;
            }
        }
        return repetitions;
    }

}
