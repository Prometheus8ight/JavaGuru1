package students.alex_kalashnikov.lesson_7.level_6.task_11;

import java.util.Arrays;
import java.util.Locale;

class Palindrome {

    boolean isPalindrome(String text) {
        String cleanText = cleanText(text);
        String[] arr = createLetterArray(cleanText);
        String[] revertArr = revert(arr);
        return Arrays.equals(arr, revertArr);
    }

    public String create(String text) {
        return text;
    }

    public String cleanText(String text) {
        String text1 = text.replaceAll("\\p{Punct}", "");
        String text2 = text1.replaceAll(" ", "");
        String textFinal = text2.toLowerCase(Locale.ROOT);
        return textFinal;
    }

    public String[] createLetterArray(String cleanText) {      // создаем массив из слов
        String[] words = cleanText.split("");
        return words;
    }

    String[] revert(String[] letterArray) {
        String[] revertArray = new String[letterArray.length];
        for (int i = 0; i < letterArray.length; i++) {
            revertArray[i] = letterArray[letterArray.length - i - 1];
        }
        return revertArray;
    }

}



