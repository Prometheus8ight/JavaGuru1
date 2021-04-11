package students.deniss_jankovskis.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.Collection;

class OutOfMemory {

    public static void main(String[] args) throws IllegalAccessException {

        Collection<byte[]> data = new ArrayList<>();
        for (;;) {
            data.add(new byte[1000]);
        }
    }
}
