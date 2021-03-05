package students.rodion_afanasjev.lesson_7.level_1.task_1;

class WordService {

    String findMostFrequentWord(String text) {
        text = lowerCase(text);
        String[] words = stringArray(text);

        int value2 = 0;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            int value1 = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    value1++;
                    if (value1 > value2) {
                        value2 = value1;
                        index = i;
                    }
                }
            }
        }
        return "Most frequent word is: " + words[index];
    }

    String print(String text) {
        return text;
    }

    String[] stringArray(String text) {
        return text.split(" ");
    }

    String lowerCase(String text) {
        return text.toLowerCase();
    }

}
