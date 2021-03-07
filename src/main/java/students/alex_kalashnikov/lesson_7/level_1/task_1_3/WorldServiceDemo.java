package students.alex_kalashnikov.lesson_7.level_1.task_1_3;

class WorldServiceDemo {

    public static void main(String[] args) {

        WordService newObject = new WordService();
        String text = newObject.generateText("bird! dog! cat? Bear. dog pig. cat, dog! bird mouse. Bear, cat!, bear Dog mouse bear?");
        String cleanText = newObject.cleanText(text);
        String[] words = newObject.createWordsArray(cleanText);
        String[] equalWords = newObject.createEqualWordsArray(words);
        String[] equalWordsWithoutNull = newObject.removeNullEqualWordsArray(equalWords);
        String[] equalWordsFinal = newObject.removeRepeatEqualWordsArray(equalWordsWithoutNull);
        int[] count = newObject.countEqualWordsArray(equalWordsFinal,words);
        int max = newObject.max(count);
        int index = newObject.findIndexMax(count,max);
        String mostFrequentWord = newObject.findMostFrequentWord(equalWordsFinal,index);

        System.out.println("Most frequent word is: " + mostFrequentWord);

    }

}