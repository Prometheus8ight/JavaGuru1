package students.julija_katukova.lesson_3.level_7.task_28;

class ContactDemo {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Елена", "Лаврова", "24985167","lena123@gmail.com","ул. Горького 2-54");

        contact1.giveInfo();
        contact1.changePhoneNum("26475264");
        contact1.giveInfo();

    }
}
