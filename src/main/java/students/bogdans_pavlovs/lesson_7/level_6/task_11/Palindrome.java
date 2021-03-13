package students.bogdans_pavlovs.lesson_7.level_6.task_11;

import java.util.Arrays;
import java.util.Locale;

class Palindrome {


    private String[] toArray (String text){
        return text.toLowerCase(Locale.ROOT).replaceAll("\\s","").split("");
    }

    private String[] flipArray (String text){

        String[] flippedArray = toArray(text);

        for (int i = 0; i < flippedArray.length/2; i++){

            String temp = flippedArray[i];
            flippedArray[i] = flippedArray[flippedArray.length - i - 1];
            flippedArray[flippedArray.length - i - 1] = temp;

        }

        return flippedArray;
    }


    boolean isPalindrome(String text){

        String[] newArray = toArray(text);
        String[] flippedArray = flipArray(text);

        return Arrays.equals(newArray, flippedArray);

    }

}

