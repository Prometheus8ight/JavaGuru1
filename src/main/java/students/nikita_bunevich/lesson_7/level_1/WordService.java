package students.nikita_bunevich.lesson_7.level_1;

class WordService {

        public String findMostFrequentWord(String text) {
            String[] arrText = convertTextToStringArray(text);
            return mostFrequentWord(arrText);
        }
        public String[] convertTextToStringArray(String text) {
            return text.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
        }
        public String mostFrequentWord(String[] arrText) {
            String mostFrequentWord = null;
            int max = 0;
            for (int i = 0; i < (arrText.length); i++) {
                for (int y = i + 1; y < (arrText.length); y++) {
                    int x = 1;

                    if (arrText[i].equals(arrText[y])) {
                        x++;
                        if (max < x) {
                            max = x;
                            mostFrequentWord = arrText[y];
                        }
                    }
                }
            }
            return mostFrequentWord;
        }
    }
