package students.vitaly_porsev.lesson_7.level_1.task_1;

import java.util.Arrays;

class WorldServiceDemo {

    public static void main(String[] args) {
        WordService method = new WordService();
        String text = "- Я думаю, — сказал князь, улыбаясь, — что, ежели бы вас послали вместо нашего милого Винценгероде, " +
                "вы бы взяли приступом согласие прусского короля. Вы так красноречивы. Вы дадите мне чаю?";
        System.out.println(method.repeatingWord(text));
    }
}
