package students.pavels_steinbors._lesson_15._level_1._task_3;

class WordsService {

    public int countRepetitions(String[] words, String repeatingWord) {
        int nrOfRepetitions = 0;
        for (String word : words) {
            if (word.equals(repeatingWord)) {
                nrOfRepetitions++;
            }
        }
        return nrOfRepetitions;
    }
}
