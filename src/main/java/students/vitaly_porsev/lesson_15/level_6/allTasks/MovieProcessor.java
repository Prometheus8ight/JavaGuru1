package students.vitaly_porsev.lesson_15.level_6.allTasks;

public interface MovieProcessor {

    boolean canProcess(Rental rental);

    String process(String customer, Rental rental);

}
