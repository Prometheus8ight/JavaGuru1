package main.java.students.andrew_galashin.lesson_9.level_2.task_12;

class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}

class MainClass {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        A a = new A();
    }
}
//убрав public у mainclass мы сможем вызывать переменные из всех классов выше