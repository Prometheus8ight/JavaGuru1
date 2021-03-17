package students.andrew_galashin.lesson_8.level_2.task_6;

class Child extends Father {
    public static void main(String[] args) {
        System.out.println(abc);
        System.out.println(cba);
    }
}
//Нельзя сделать наследование сразу 2 классов, но можно сделать цепочку Mother-Father-Child. Тем самым добавив в Child переменные из Father & Mother.