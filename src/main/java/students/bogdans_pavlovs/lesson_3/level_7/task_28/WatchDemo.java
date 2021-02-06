package students.bogdans_pavlovs.lesson_3.level_7.task_28;

class WatchDemo {

    public static void main(String[] args) {

        Watch watch1 = new Watch();

        watch1.type = "Smart";
        watch1.state = "New";
        watch1.price = 399.99;

        watch1.asses();

        watch1.drop();

        watch1.asses();
        watch1.fix();

        watch1.asses();

    }

}
