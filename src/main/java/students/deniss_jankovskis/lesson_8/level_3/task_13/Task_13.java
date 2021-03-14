package students.deniss_jankovskis.lesson_8.level_3.task_13;

abstract class Computer {

    String name;
    int yearOfMade;

    public Computer(String name, int yearOfMade) {
        this.name = name;
        this.yearOfMade = yearOfMade;
    }
}

class Asus extends Computer {

    String windowsOS;

    public Asus(String name, int yearOfMade, String windowsOS) {
        super(name, yearOfMade);
        this.windowsOS = windowsOS;
    }
}
