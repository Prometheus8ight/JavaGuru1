package students.vitaly_porsev.lesson_7.level_6.task_11;

import java.util.Arrays;
import java.util.Locale;

class Palindrome {

    boolean isPalindrome(String text) {
        return Arrays.equals(array(text), reverseArray(text));
    }

    private String[] array(String text) {
        String[] array = makeStringArray(text);
        String[] newArray = new String[0];
        for (String s : array) {
            if (!s.equals(" ")) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = s;
            }
        }
        return newArray;
    }

    private String[] reverseArray(String text) {
        String[] array = makeStringArray(text);
        String[] reverseArray = new String[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (!array[i].equals(" ")) {
                reverseArray = Arrays.copyOf(reverseArray, reverseArray.length + 1);
                reverseArray[reverseArray.length - 1] = array[i];
            }
        }
        return reverseArray;
    }

    private String[] makeStringArray(String text) {
        return text.toLowerCase(Locale.ROOT).split("");
    }
}