package students.vitaly_porsev.lesson_8.level_3.task_13;

abstract class Vehicle {

    int wheels;
    int fuelCapacity;
    int fuelConsumption;
    int numberOfPassengers;

    public Vehicle(int wheels, int fuelCapacity, int fuelConsumption, int numberOfPassengers) {
        this.wheels = wheels;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsumption = fuelConsumption;
        this.numberOfPassengers = numberOfPassengers;
    }

    abstract int averageFuelConsumption();

   abstract int howMuchTiresWillCost();

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}