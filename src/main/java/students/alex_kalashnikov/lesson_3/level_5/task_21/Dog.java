package students.alex_kalashnikov.lesson_3.level_5.task_21;

class Dog {

    String name;
    int age;
    String colour;

    Dog(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;

    }

    void voice() {

        System.out.println(name + ", " + age + ", " + colour);

    }

}
