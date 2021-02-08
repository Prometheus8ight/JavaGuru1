package students.arkadij.lesson_3.level_7.task_28;

class Laptop {

    String name;
    String model;
    String system;
    String video;
    int ram;

    public Laptop(String name, String model, String system, String video, int ram){
        this.name = name;
        this.model = model;
        this.system = system;
        this.video = video;
        this.ram = ram;
    }

    public String getName(){
        return name;
    }

    public void says (){
        System.out.println("Here is your chosen laptop: ");
        System.out.println("Brand: " + name + ", Model: " + model + ".");
        System.out.println("Right now there installed a " + system + " operation system.");
        System.out.println("It has a " + video + " video card, pretty quick thing.");
        System.out.println("Oh, and like you asked me before it has a " + ram + "GB RAM installed.");
    }


}
