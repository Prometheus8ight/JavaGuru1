package students.julija_katukova.lesson_7.level_6.task_11;

import java.util.Arrays;

class Palindrome {
    boolean isPalindrome(String text) {
        return check(text);
    }

    private boolean check(String text) {
        char[] arrayChar = convertTextToCharArray(text);
        char[] revertedArrayChar = createRevertCharArray(text);
        return Arrays.equals(arrayChar, revertedArrayChar);
    }

    private char[] createRevertCharArray(String text) {
        char[] arrayChar = convertTextToCharArray(text);
        revertArray(arrayChar);
        return arrayChar;
    }

    private char[] convertTextToCharArray(String text) {
        text = modifyText(text);
        return convertStringToCharArray(text);
    }

    private String modifyText(String text) {
        return text.replaceAll("\\p{Punct}", "").replaceAll("\\s+", "").toLowerCase();
    }

    private char[] convertStringToCharArray(String text) {
        return text.toCharArray();
    }

    private void revertArray(char[] arrayChar) {
        for (int i = 0; i < arrayChar.length / 2; i++) {
            char temp = arrayChar[i];
            arrayChar[i] = arrayChar[arrayChar.length - i - 1];
            arrayChar[arrayChar.length - i - 1] = temp;
        }
    }
}
