package students.deniss_jankovskis.lesson_9.level_7;

class Computer {


    private String name;
    private String os;
    private String processor;
    private int ram;
    private int ssdSize;
    private double screenSize;


    public Computer(String name, String os, String processor, int ram, int sddSize, double screenSize) {
        this.name = name;
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.ssdSize = ssdSize;
        this.screenSize = screenSize;
    }


    @Override
    public String toString() {
        return "Name = " + name +
                ", os = " + os +
                ", processor = " + processor +
                ", ram = " + ram +
                ", ssdSize = " + ssdSize +
                ", screenSize = " + screenSize;
    }

}