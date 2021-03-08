package students.bogdans_pavlovs.lesson_7.level_1;

public class WordServiceDemo {

    public static void main(String[] args) {

        WordService wordService = new WordService();
        String formattedText = wordService.formatText("JeSuS? cHrIsT! tHiS@ tHiS #oNe $OnE %wAs^ WaS& wAs* ToUgH");
        String[] finalText = wordService.splitText(formattedText);
        String print = wordService.findMostFrequentWord(finalText);
        System.out.println(print);

    }

}
