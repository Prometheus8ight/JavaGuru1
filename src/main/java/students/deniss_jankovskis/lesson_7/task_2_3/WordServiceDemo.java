package students.deniss_jankovskis.lesson_7.task_2_3;


public class WordServiceDemo {

    public static void main(String[] args) {

        WordService service = new WordService();
        String text = "Every person had a star, every star had a friend, and for every person carrying a star there was " +
                "someone else who reflected it, and everyone carried this reflection like a secret confidante in the heart.";

        System.out.println(service.findMostFrequentWord(text));
    }
}
