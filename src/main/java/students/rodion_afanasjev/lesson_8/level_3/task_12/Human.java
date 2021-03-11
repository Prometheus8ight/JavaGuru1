package students.rodion_afanasjev.lesson_8.level_3.task_12;

public class Human extends LoanSystem {

    @Override
    boolean canReceiveLoan(Human human) {
        return false;
    }
}
