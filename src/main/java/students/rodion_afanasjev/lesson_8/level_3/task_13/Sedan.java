package students.rodion_afanasjev.lesson_8.level_3.task_13;

class Sedan extends Car {

    @Override
    public void start() {
        System.out.println("SEDAN START");
    }

    @Override
    public void stop() {
        System.out.println("SEDAN STOP");
    }



    public static void main(String[] args) {

        Sedan sedan1 = new Sedan();
        sedan1.setColor("Red");
        sedan1.setModel("Audi");
        sedan1.setSerialNumber(15);
        sedan1.start();
        sedan1.stop();
        System.out.println("Car color: " + sedan1.getColor());
        System.out.println("Car model: " + sedan1.getModel());
        System.out.println("Car serial number: " + sedan1.getSerialNumber());

    }

}
