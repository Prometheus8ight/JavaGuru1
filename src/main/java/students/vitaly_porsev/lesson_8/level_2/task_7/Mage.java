package students.vitaly_porsev.lesson_8.level_2.task_7;

class Mage extends Hero {

    int magicAttack;

    public Mage(int hp, int physAttack, int magicAttack) {
        super(hp, physAttack);
        this.magicAttack = magicAttack;
    }
}