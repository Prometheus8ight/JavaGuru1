package students.alex_kalashnikov.lesson_3.level_5.task_18;

class Dog {

    String name;

    Dog(String name) {
        this.name = name;

    }

    void voice() {

        int x = 0;
        while (x < 3) {

            System.out.println(name);

            x = x + 1;

        }

    }

}
