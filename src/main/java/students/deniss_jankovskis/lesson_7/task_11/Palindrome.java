package students.deniss_jankovskis.lesson_7.task_11;

import java.util.Arrays;
import java.util.Locale;

class Palindrome {

    boolean isPalindrome(String text) {
        return Arrays.equals(arr(text), reverseArr(text));
    }

    public String[] arr(String text) {

        String[] arr = stringArray(text);
        String[] newArr = new String[0];
        for (String a : arr) {
            if (!a.equals(" ")) {
                newArr = Arrays.copyOf(newArr, newArr.length + 1);
                newArr[newArr.length - 1] = a;
            }
        }
        return newArr;
    }

    private String[] reverseArr(String text) {

        String[] arr = stringArray(text);
        String[] reverseArray = new String[0];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals(" ")) {
                reverseArray = Arrays.copyOf(reverseArray, reverseArray.length + 1);
                reverseArray[reverseArray.length - 1] = arr[i];
            }
        }
        return reverseArray;
    }

    private String[] stringArray(String text) {

        return text.toLowerCase(Locale.ROOT).split("");
    }
}




