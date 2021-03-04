package students.vitaly_porsev.lesson_7.level_5.task_9;

class PowerCalculator {

    public int elevate(int num, int elevate){
        int power = num;
        for(int i = 1; i < elevate; i++){
            power *= num;
        }return power;
    }
}