package students.vitaly_porsev.lesson_10.level_7.task_25;

class StrategyDemo {
    public static void main(String[] args) {
        Person person1 = new Person(new Women());
        System.out.println(person1.findIdealWeight(170));

        Person person2 = new Person(new Man());
        System.out.println(person2.findIdealWeight(180));
    }
}
