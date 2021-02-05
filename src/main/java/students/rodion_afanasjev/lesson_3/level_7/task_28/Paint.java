package students.rodion_afanasjev.lesson_3.level_7.task_28;

class Paint {

    String type;
    String color;

    public Paint(String type, String color){
        this.type = type;
        this.color = color;
    }

    void info(){
        System.out.println("In this painting i used " + color + " " + type + " paint.");
    }

}
