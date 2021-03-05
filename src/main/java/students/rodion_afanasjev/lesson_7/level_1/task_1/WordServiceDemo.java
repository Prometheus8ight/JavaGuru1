package students.rodion_afanasjev.lesson_7.level_1.task_1;

class WordServiceDemo {

    public static void main(String[] args) {

        WordService wordService = new WordService();
        String text = "Three black dogs, playing with two black toys, while other black dogs watching at them, dogs for test";
        String duplicate = wordService.findMostFrequentWord(text);
        System.out.println(wordService.print(duplicate));

    }

}
