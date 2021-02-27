package students.alex_kalashnikov.lesson_6.level_1.task_1;

class WhileDefinition1 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {                    // пропущена круглая скобка
            System.out.println(i);
            i++;
        }
    }

}