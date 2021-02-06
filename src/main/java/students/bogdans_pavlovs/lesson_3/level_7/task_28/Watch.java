package students.bogdans_pavlovs.lesson_3.level_7.task_28;

class Watch {

    String type;
    String state;
    Double price;

    void asses (){

        System.out.println("Type: " + type);
        System.out.println("State: " + state);
        System.out.println("Price: " + price);

    }

    void drop (){

        type = "Not any more";
        state = "Broken";
        price = price - 299.99;
    }

    void fix (){

        type = "Smart";
        state = "Refurbished";
        price = price + 109.99;

    }

}
