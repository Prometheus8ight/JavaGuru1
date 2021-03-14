package students.rodion_afanasjev.lesson_8.level_3.task_13;

class Wagon extends Car {

    @Override
    public void start() {
        System.out.println("Wagon START");
    }

    @Override
    public void stop() {
        System.out.println("Wagon STOP");
    }

    public static void main(String[] args) {

        Wagon wagon1 = new Wagon();
        wagon1.setColor("Black");
        wagon1.setModel("Volvo");
        wagon1.setSerialNumber(26);
        wagon1.start();
        wagon1.stop();
        System.out.println("Car color: " + wagon1.getColor());
        System.out.println("Car model: " + wagon1.getModel());
        System.out.println("Car serial number: " + wagon1.getSerialNumber());

    }

}
