package students.deniss_jankovskis.lesson_9.level_7;

class ComputerBuilder {

    private String name;
    private String os;
    private String processor;
    private int ram;
    private int ssdSize;
    private double screenSize;


    public ComputerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ComputerBuilder setOs(String os) {
        this.os = os;
        return this;

    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setSsdSize(int ssdSize) {
        this.ssdSize = ssdSize;
        return this;
    }

    public ComputerBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Computer getComputer() {
        return new Computer(name, os, processor, ram, ssdSize, screenSize);
    }
}
