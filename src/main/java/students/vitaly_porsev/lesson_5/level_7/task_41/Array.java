package students.vitaly_porsev.lesson_5.level_7.task_41;

import java.util.Locale;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class Array {

    void userArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int[] array = makeArray(scanner.nextInt());
        System.out.println("Это ваш массив: " + Arrays.toString(array));
        keepWorking(array);
        scanner.close();
    }

    void keepWorking(int[] array) {
        userSortArray(array);
    }

    int[] makeArray(int arrayLength) {
        int[] array = new int[arrayLength];
        fillArray(array);
        return array;
    }

    void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

    }

    void userSortArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        Array method = new Array();
        System.out.println("Хотите отсортировать ваш массив по возрастанию? Введите \"да\" или \"нет\".");
        if (scanner.next().toLowerCase(Locale.ROOT).equals("да")) {
            method.sortArray(array);
            System.out.println("Теперь ваш массив выглядит так: " + Arrays.toString(array));
            userSearchIndex(array);
        } else {
            System.out.println("Всего хорошего!");
        }
        scanner.close();
    }

    void userSearchIndex(int[] array) {
        Scanner scanner = new Scanner(System.in);
        Array method = new Array();
        System.out.println("Желаете найти под каким индексом находится ваше число? Введите \"да\" или \"нет\".");
        if (scanner.next().toLowerCase(Locale.ROOT).equals("да")) {
            System.out.println("Введите ваше число: ");
            int index = method.searchIndex(array, scanner.nextInt());
            System.out.println("Число находится под индексом: " + index);
        } else {
            System.out.println("Всего хорошего!");
        }
        scanner.close();
    }

    void sortArray(int[] array) {
        int temp;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    int searchIndex(int[] array, int searchNumber) {
        int index = 0;
        for (int i : array) {
            if (i == searchNumber) {
                break;
            }
            index++;
        }
        return index;
    }

}
