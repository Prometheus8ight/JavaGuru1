package students.bogdans_pavlovs.lesson_7.level_1;

class WordService {

    public String formatText(String text) {

        String formattedText = text.replaceAll("\\p{Punct}","");
        formattedText = formattedText.toLowerCase();

        return formattedText;

    }

    public String[] splitText(String newText){

        return newText.split(" ");

    }

    public String findMostFrequentWord(String[] text) {

        int oldMax = 0; // rip max
        int word = 0;

        for (int i = 0; i < text.length; i++) {

            int newMax = 0;

            for (int j = 0; j < text.length; j++) {

                if (text[i].equals(text[j])) {

                    newMax++;

                    if (newMax > oldMax) {
                        oldMax = newMax;
                        word = i;
                    }
                }
            }
        }

        return "Your word is: [ " + text[word] + " ]";

    }
}
