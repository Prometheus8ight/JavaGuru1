package students.bogdans_pavlovs.lesson_9.level_2.task_13;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}

class Demo {

    public static void main(String[] args) {
        ClassY a = new ClassY(1);
    }
}