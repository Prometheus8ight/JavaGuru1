package students.julija_katukova.lesson_8.level_6.task_30;

class Task30 {
    public static void main(String[] args) {
       Task30 task30 = new Task30();
       task30.print("John", "Max", "Ann", "Jo", "Chris");
       task30.print("Vicky", "Julia", "Maya");
       task30.print("Kate", "Kotlin", "Veronika", "Arthur", "Ali", "Lola");
    }

    void print(String ... users) {
        for (String user : users) {
            System.out.println(user);
        }
    }
}
