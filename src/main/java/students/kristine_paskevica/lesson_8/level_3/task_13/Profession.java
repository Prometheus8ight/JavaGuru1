package students.kristine_paskevica.lesson_8.level_3.task_13;

abstract class Profession {
    String nameOfProfession;
    int durationOfTraining;
    String educator;

    public Profession(String nameOfProfession, int durationOfTraining, String educator, int groupNumber){
        this.nameOfProfession = nameOfProfession;
        this.durationOfTraining = durationOfTraining;
        this.educator = educator;
    }
}
