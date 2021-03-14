package students.deniss_jankovskis.lesson_8.level_3.task_12;

abstract class LoanSystem {

    abstract boolean canReceiveLoan(Human human);

}

class Human extends LoanSystem {

    @Override
    boolean canReceiveLoan(Human human) {
        return false;
    }
}
