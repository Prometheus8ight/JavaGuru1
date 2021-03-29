package students.deniss_jankovskis.lesson_9.level_7;

class Shop {

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder().setName("Asus").setOs("Windows 10").setRam(8).
                setProcessor("AMD Ryzen 7").setSsdSize(512).setScreenSize(15.6).getComputer();

        System.out.println(computer);


    }
}
