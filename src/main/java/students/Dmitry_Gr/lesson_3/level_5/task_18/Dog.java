package students.Dmitry_Gr.lesson_3.level_5.task_18;

import java.util.Set;

public class Dog {

    String name;

    public  Dog(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void voice(){
        System.out.println("Name Dog:" + this.name + " " + this.name + " " + this.name);

    }

}