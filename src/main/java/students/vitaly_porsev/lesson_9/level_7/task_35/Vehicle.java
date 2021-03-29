package students.vitaly_porsev.lesson_9.level_7.task_35;

class Vehicle {

    private String model;
    private String type;
    private int weight;
    private int fuelCapacity;
    private int passengersCount;
    private int wheelsCount;

    public Vehicle(VehicleBuilder builder) {
        this.model = builder.model;
        this.type = builder.type;;
        this.weight = builder.weight;
        this.fuelCapacity = builder.fuelCapacity;
        this.passengersCount = builder.passengersCount;
        this.wheelsCount = builder.wheelsCount;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Model = " + model +
                ", type = " + type +
                ", weight = " + weight +
                ", fuelCapacity = " + fuelCapacity +
                ", passengersCount = " + passengersCount +
                ", wheelsCount = "  + wheelsCount;
    }

    public static class VehicleBuilder{

        private String model;
        private String type;
        private int weight;
        private int fuelCapacity;
        private int passengersCount;
        private int wheelsCount;

        public VehicleBuilder(String model, String type) {
            this.model = model;
            this.type = type;
        }

        public VehicleBuilder weight(int weight){
            this.weight = weight;
            return this;
        }

        public VehicleBuilder fuelCapacity(int fuelCapacity){
            this.fuelCapacity = fuelCapacity;
            return this;
        }

        public VehicleBuilder passengersCount(int passengersCount){
            this.passengersCount = passengersCount;
            return this;
        }

        public VehicleBuilder wheelsCount(int wheelsCount){
            this.wheelsCount = wheelsCount;
            return this;
        }

        public Vehicle build(){
            Vehicle vehicle = new Vehicle(this);
            validateVehicleObject(vehicle);
            return vehicle;
        }

        private void validateVehicleObject(Vehicle vehicle){

        }
    }
}
