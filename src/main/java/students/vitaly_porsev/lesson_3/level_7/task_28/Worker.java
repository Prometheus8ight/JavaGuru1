package students.vitaly_porsev.lesson_3.level_7.task_28;

class Worker {
    String name;
    int salary;
    int bonus;

    public Worker(String name, int salary, int bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }


    void info() {
        System.out.println("Имя: " + this.name + ". Зарплата: " + this.salary + ". " + "Бонус: " + this.bonus
                + ".");
    }

    void bonus() {
        this.bonus += 100;
    }
}
