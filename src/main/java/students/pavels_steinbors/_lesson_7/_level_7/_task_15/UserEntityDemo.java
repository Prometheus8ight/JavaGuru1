package students.pavels_steinbors._lesson_7._level_7._task_15;

public class UserEntityDemo {

    public static void main(String[] args) {

        UserEntity userEntity = new UserEntity();
        userEntity.setName("Andy");
        userEntity.setSurname("Heart");
        userEntity.setPersonalCode("230983-11578");
        userEntity.setId("LV45789094");

        System.out.println("Name: " + userEntity.getName());
        System.out.println("Surname: " + userEntity.getSurname());
        System.out.println("Personal Code: " + userEntity.getPersonalCode());
        System.out.println("Id Number: " + userEntity.getId());
    }
}
