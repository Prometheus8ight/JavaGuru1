package students.vitaly_porsev.lesson_9.level_7.task_35;

class VehicleDemo {

    public static void main(String[] args) {
    Vehicle vehicle = new Vehicle.VehicleBuilder("BMW", "Car")
            .fuelCapacity(1000)
            .passengersCount(5)
            .weight(1800)
            .wheelsCount(4)
            .build();

    Vehicle vehicle1 = new Vehicle.VehicleBuilder("Volvo", "Truck")
            .fuelCapacity(5000)
            .passengersCount(2)
            .weight(3000)
            .wheelsCount(4)
            .build();

        System.out.println(vehicle);
        System.out.println(vehicle1);
    }
}
