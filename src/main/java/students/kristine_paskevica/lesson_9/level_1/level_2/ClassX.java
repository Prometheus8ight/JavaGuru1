package students.kristine_paskevica.lesson_9.level_1.level_2;

class ClassX {

    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY(int i) {
        super(i);
        System.out.println(2);
    }
}
