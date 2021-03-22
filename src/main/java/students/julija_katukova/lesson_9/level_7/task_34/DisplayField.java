package students.julija_katukova.lesson_9.level_7.task_34;

class DisplayField {

    void printFieldToConsole(char[][] field) {
        for (char[] chars : field) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }
}
