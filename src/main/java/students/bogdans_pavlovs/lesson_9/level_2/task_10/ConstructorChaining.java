package students.bogdans_pavlovs.lesson_9.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        new ConstructorChaining(constructorName);
        this.parameterCount = parameterCount;
    }
}


//Создайте в этом классе публичный конструктор с двумя параметрами.
//Внутри этого конструктора первой строкой вызовите приватный конструктор с одним параметром.