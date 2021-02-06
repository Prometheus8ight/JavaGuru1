package students.vitaly_porsev.lesson_3.level_7.task_28;

public class CarDemo {
    public static void main(String[] args) {
        Car reno = new Car("Reno", "красный", 1500, 50);
        reno.carInfo();
        reno.fillUp();
        reno.carInfo();
    }
}
