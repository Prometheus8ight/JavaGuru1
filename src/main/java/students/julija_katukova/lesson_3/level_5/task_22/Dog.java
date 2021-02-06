package students.julija_katukova.lesson_3.level_5.task_22;

class Dog {
    String name;
    int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void voice () {
        System.out.println(this.name + " " + this.age + " " + this.color);
    }

    void changeColor(String newColor) {
        this.color = newColor;
        // напишите тут команду сохранения нового цвета в свойство класса
    }


}
