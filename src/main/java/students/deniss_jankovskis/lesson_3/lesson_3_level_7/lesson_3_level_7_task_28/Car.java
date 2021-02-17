package students.deniss_jankovskis.lesson_3.lesson_3_level_7.lesson_3_level_7_task_28;

class Car {

    String name;
    String color;
    String signal;
    int maxSpeed;
    int year;
    long price;

    Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + this.maxSpeed);
    }

    void setColor() {
        this.color = "Grey";
        System.out.println("Color: " + this.color);
    }

    void getYear(){
        this.color = "Grey";
        this.year = 2007;
        System.out.println("Color: " + this.color);
        System.out.println("Year of Issue: " + this.year);
    }

    void changeName(){
        this.name = "Nissan";
        System.out.println("Color: " + this.color);
        System.out.println();
    }

    void changeSpeed(String speed){
        this.maxSpeed = 200;
        this.price = 30000;

        System.out.println("Speed: " + this.maxSpeed);
        System.out.println("Price: " + this.price);
    }

    void setSignal(String signal) {
        this.signal = "Bee-bee";
        System.out.println("Speed: " + this.maxSpeed);
        System.out.println("Price: " + this.price);
        System.out.println("Signal: " + this.signal);
    }



}
