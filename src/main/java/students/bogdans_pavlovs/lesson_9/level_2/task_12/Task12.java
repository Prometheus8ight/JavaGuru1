package students.bogdans_pavlovs.lesson_9.level_2.task_12;

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

//"Class A Constructor"
//"Class B Constructor"
//"Class C Constructor"

class MainClass { //убрал public, если разбить на отдельные класс файлы, результат будет тот же
    public static void main(String[] args) {
        C c = new C();
    }
}
