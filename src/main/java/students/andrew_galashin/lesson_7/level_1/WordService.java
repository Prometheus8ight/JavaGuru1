package students.andrew_galashin.lesson_7.level_1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] arr = convertText(text);
        return mostFrequentWord(arr);
    }

    private String[] convertText(String text) {
        return text.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");

    }

    private String mostFrequentWord(String[] arr) {
        String mostFrequentWord = null;
        int max = 0;
        for (int i = 0; i < (arr.length); i++) {
            for (int y = i + 1; y < (arr.length); y++) {
                int x = 1;
                if (arr[i].equals(arr[y])) {
                    x++;
                    if (max < x) {
                        max = x;
                        mostFrequentWord = arr[y];
                    }
                }
            }
        }
        return mostFrequentWord;
    }
}