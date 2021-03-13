package students.vitaly_porsev.lesson_8.level_6.task_30;

public class VarArgs {

    public int multAll(int... numbers) {
        int mult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            mult *= numbers[i];
            System.out.println("Multiplying " + numbers[i] + ": get " + mult);
        }
        return mult;
    }
}