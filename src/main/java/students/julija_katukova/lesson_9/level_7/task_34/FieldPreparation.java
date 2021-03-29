package students.julija_katukova.lesson_9.level_7.task_34;

import java.util.Arrays;

class FieldPreparation {

    char[][] createField(char[][] field) {
        for (char[] chars : field) {
            Arrays.fill(chars, '.');
        }
        return field;
    }
}
