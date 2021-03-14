package students.kristine_paskevica.lesson_7.level_1;

import java.util.Locale;

class WordService2 {
    public String repeatingWord(String text) {
        String[] masivs = makeStringArray(text);
        int max2 = 0;
        int index = 0;
        for (int i = 0; i < masivs.length; i++) {
            int max1 = 0;
            for (int j = 0; j < masivs.length; j++) {
                if (masivs[i].toLowerCase(Locale.ROOT).equals(masivs[j].toLowerCase())) {
                    max1++;
                    if (max1 > max2) {
                        max2 = max1;
                        index = i;
                    }
                }
            }
        }
        return "Vārds, kurš tekstā visbiežāk ir sastopams, tas ir: " + masivs[index] + ".";
    }

    public String[] makeStringArray(String text) {
        return text.split("[, . '-]+");
    }
}
