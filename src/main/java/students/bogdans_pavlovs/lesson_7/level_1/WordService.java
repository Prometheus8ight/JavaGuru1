package students.bogdans_pavlovs.lesson_7.level_1;

class WordService {

    private String[] splitAndFormat(String text){

        return text.replaceAll("\\p{Punct}","").toLowerCase().split(" ");

    }

    public String findMostFrequentWord(String text) {

        String[] finalText = splitAndFormat(text);

        int oldMax = 0; // rip max
        int word = 0;

        for (int i = 0; i < finalText.length; i++) {

            int newMax = 0;

            for (int j = 0; j < finalText.length; j++) {

                if (finalText[i].equals(finalText[j])) {

                    newMax++;

                    if (newMax > oldMax) {
                        oldMax = newMax;
                        word = i;
                    }
                }
            }
        }

        return "Your word is: [ " + finalText[word] + " ]";

    }
}
