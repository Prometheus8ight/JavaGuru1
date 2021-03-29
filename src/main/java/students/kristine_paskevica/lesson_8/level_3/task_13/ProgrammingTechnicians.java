package students.kristine_paskevica.lesson_8.level_3.task_13;

class ProgrammingTechnicians extends Profession{

    int groupNumber;

    public ProgrammingTechnicians(String nameOfProfession, int durationOfTraining, String educator, int groupNumber){

        super(nameOfProfession, durationOfTraining, educator, groupNumber);
        this.groupNumber = groupNumber;

    }
}
