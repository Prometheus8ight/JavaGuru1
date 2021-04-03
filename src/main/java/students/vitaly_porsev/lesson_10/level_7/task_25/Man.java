package students.vitaly_porsev.lesson_10.level_7.task_25;

class Man implements IdealWeight {

    @Override
    public double calculateIdealWeight(double height) {
        return (height - 100) * 1.15;
    }
}