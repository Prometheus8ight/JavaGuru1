package students.alex_kalashnikov.lesson_3.level_5.task_22;

class Dog {

    String name;
    String colour;

    Dog(String name, String colour) {
        this.name = name;
        this.colour = colour;

    }

    void voice() {

        System.out.println(name + ", " + colour + ".");

            }

    void changeColour() {

        colour = "зеленый";
        System.out.println(name + " меняет цвет на " + colour + ".");
        System.out.println(name + ", " + colour + ".");

    }

}
