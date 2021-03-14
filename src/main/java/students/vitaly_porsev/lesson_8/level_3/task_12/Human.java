package students.vitaly_porsev.lesson_8.level_3.task_12;

class Human extends LoanSystem {

    @Override
    boolean canReceiveLoan(Human human) {
        return false;
    }
}