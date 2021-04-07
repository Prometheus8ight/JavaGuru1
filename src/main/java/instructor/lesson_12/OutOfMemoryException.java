package instructor.lesson_12;

import java.util.concurrent.TimeUnit;

class OutOfMemoryException {

    public static void main(String[] args) throws Exception {

        int size = 20;

        while (true) {
            System.out.println(Runtime.getRuntime().freeMemory());
            int[] array = new int[size];

            size *= 5;
            TimeUnit.MILLISECONDS.sleep(100);
        }

    }
}
