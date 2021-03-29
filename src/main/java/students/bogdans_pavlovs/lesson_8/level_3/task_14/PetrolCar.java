package students.bogdans_pavlovs.lesson_8.level_3.task_14;

class PetrolCar extends Car {

    private double petrolTankCapacity = 100.00;

    @Override
    void accelerate() {
        System.out.println("WROOM WROOM WROOM");

        petrolTankCapacity = petrolTankCapacity - 100.00;
    }
}
