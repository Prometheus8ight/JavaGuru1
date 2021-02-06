package students.bogdans_pavlovs.lesson_3.level_7.task_28;

class Box {

    String material;
    String color;
    Double weight;


    void giveDetails(){

        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);

    }

    void paintBox(){

        color = "Gray";

    }

    void emptyBox(){

        weight--;

    }

    void fillBox(){

        weight++;

    }
}
