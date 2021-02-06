package students.bogdans_pavlovs.lesson_3.level_7.task_28;

class BoxDemo {

    public static void main(String[] args) {

    Box box1 = new Box();

    box1.material = "Wood";
    box1.color = "Brown";
    box1.weight = 7.26;

    box1.giveDetails();

    box1.emptyBox();
    box1.paintBox();

    box1.giveDetails();

    box1.fillBox();

    box1.giveDetails();
    
    }

}
