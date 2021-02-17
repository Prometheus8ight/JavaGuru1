package students.deniss_jankovskis.lesson_3.lesson_3_level_7.lesson_3_level_7_task_28;

class CarDemo {

    public static void main(String[] args) {

        Car ford = new Car("Ford", 200);
        System.out.println();

        Car ford1 = new Car("Ford", 200);
        ford1.setColor();
        System.out.println();

        Car ford2 = new Car("Ford", 200);
        ford2.getYear();
        System.out.println();

        Car nissan = new Car("Nissan", 220);
        nissan.changeSpeed("200");
        System.out.println();

        Car nissan2 = new Car("Nissan", 220);
        nissan.setSignal("Bee-bee");
        System.out.println();
















    }

}
