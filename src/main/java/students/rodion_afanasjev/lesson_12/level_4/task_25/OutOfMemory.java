package students.rodion_afanasjev.lesson_12.level_4.task_25;

class OutOfMemory {

    public static void main(String[] args) throws InterruptedException {

        int size = 20;
        int x = 5;

        while (x > 0){
            int[] array = new int[size];
            size *= 5;
        }

    }
}