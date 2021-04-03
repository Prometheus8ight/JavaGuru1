package students.vitaly_porsev.lesson_10.level_7.task_25;

public class Person {

    private IdealWeight idealWeight;

    public Person(IdealWeight idealWeight) {
        this.idealWeight = idealWeight;
    }

    double findIdealWeight(double height){
       return idealWeight.calculateIdealWeight(height);
    }
}
