package students.julija_katukova.lesson_3.level_5.task_20;

class Dog {
    String name;
    int age;

    Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;

    }

    public void voice () {
        System.out.println(this.name + " " + this.age);
    }
    void happyBirthday() {
        this.age = this.age + 1;

    }

}
