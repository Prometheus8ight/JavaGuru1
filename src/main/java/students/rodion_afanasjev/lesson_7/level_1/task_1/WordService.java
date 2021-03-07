package students.rodion_afanasjev.lesson_7.level_1.task_1;

class WordService {

    public String mostFrequentWord(String text){
        String[] words = stringArray(text);
        return findMostFrequentWord(words);
    }

    private String[] stringArray(String text){
        return text.toLowerCase().split(" ");
    }

    private String findMostFrequentWord(String[] text) {

        int value2 = 0;
        int index = 0;
        for (int i = 0; i < text.length; i++) {
            int value1 = 0;
            for (int j = i + 1; j < text.length; j++) {
                if (text[i].equals(text[j])) {
                    value1++;
                    if (value1 > value2) {
                        value2 = value1;
                        index = i;
                    }
                }
            }
        }
        return "Most frequent word is: " + text[index];
    }

}
