package students.alex_kalashnikov.lesson_7.level_1.task_1_3;

class WorldServiceDemo {

    public static void main(String[] args) {

        WordService newObject = new WordService();
        String text = newObject.generateText("bird! dog! cat? Bear. dog pig. cat, dog! bird mouse. Bear, cat!, bear Dog mouse bear?");
        String mostFrequentWord = newObject.findMostFrequentWord(text);

        System.out.println("Most frequent word is: " + mostFrequentWord);

    }

}