package students.deniss_jankovskis.lesson_9.level_2.task_11;

class Animal {

    public String name;
    public int age;
    public int weight;

    protected Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

}

class Cat extends Animal {

    protected Cat(String name, int age, int weight) {
        super(name, age, weight);
    }
}
