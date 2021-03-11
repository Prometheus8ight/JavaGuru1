package students.rodion_afanasjev.lesson_8.level_3.task_13;

abstract class Car {

    private String model;
    private String color;
    private int serialNumber;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void start(){
    }

    public void stop(){
    }

}
