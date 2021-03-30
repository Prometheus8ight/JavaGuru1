package students.vitaly_porsev.lesson_10.level_7.task_25;

class Women implements IdealWeight {

    @Override
    public double calculateIdealWeight(double height) {
        return (height - 110) * 1.15;
    }
}
