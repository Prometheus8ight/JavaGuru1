package students.julija_katukova.lesson_3.level_4.task_16;

class Car {
    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;

    }

}

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }

}

