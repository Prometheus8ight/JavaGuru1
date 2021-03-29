package students.rodion_afanasjev.lesson_9.level_3.task_16;

class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {
        super(); // call to super must be first statement in constructor
        System.out.println(1);
        System.out.println(2);
    }

}

class SuperClassConstructorInvokerDemo{

    public static void main(String[] args) {

        SuperClassConstructorInvoker superClassConstructorInvoker = new SuperClassConstructorInvoker();

    }

}
