package students.vitaly_porsev.lesson_3.level_5.task_19;


class Dog {
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    void voice(){
        System.out.println("Кличка: " + this.name + ". Возраст собаки: " + this.age + " лет.");
    }
}
