package students.bogdans_pavlovs.lesson_3.level_5.task_22;

class Dog {

    String name;
    int age;
    String color;

    void voice(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " Years");
        System.out.println("Color: " + color);
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }


}
