package students.bogdans_pavlovs.lesson_8.level_3.task_14;

class ElectricCar extends Car {

    private int batteryCharge = 99;

    @Override
    void accelerate() {
        System.out.println("wroom");

        batteryCharge = batteryCharge - 30;
    }
}
