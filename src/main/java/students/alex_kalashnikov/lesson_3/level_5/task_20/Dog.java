package students.alex_kalashnikov.lesson_3.level_5.task_20;

class Dog {

    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void voice() {

        System.out.println(name + ", " + age + " года.");

            }

    void happyBirthday() {

        age = age + 1;
        System.out.println(name + " празднует День Рождения. Ему исполнилось " + age + " года.");
        System.out.println(name + ", " + age + " года.");

    }

}
