package students.kristine_paskevica.lesson_3.level_5.task_22;

class Dog {

    String name;
    String color;

    Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    void voice(){
        System.out.println("Manu suni sauc " + name + ". Viņas krāsa ir " + color);
    }

    void changeColor(String newColorDog) {
        System.out.println("Suns izvārtījās dubļos, kļuva " + newColorDog);
        System.out.println(name + " pārvērtās par " + newColorDog + " suni.");

    }}
