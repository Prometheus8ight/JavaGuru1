package students.alex_kalashnikov.lesson_7.level_7.task_15;

class UserEntityDemo {

    public static void main(String[] args) {

        UserEntity newUser = new UserEntity(1234,"Vasya","Pupkin",12345678);

        long userPersonalCode = newUser.getPersonalCode();
        System.out.println(userPersonalCode);

        System.out.println("newUser = " + newUser);

    }
}
