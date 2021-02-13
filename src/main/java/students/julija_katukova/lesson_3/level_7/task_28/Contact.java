package students.julija_katukova.lesson_3.level_7.task_28;

class Contact {
    String name;
    String surname;
    String phoneNum;
    String email;
    String address;

    Contact(String contactName, String contactSurname, String contactPhoneNum, String contactEmail, String contactAddress){
        this.name = contactName;
        this.surname = contactSurname;
        this.phoneNum = contactPhoneNum;
        this.email = contactEmail;
        this.address = contactAddress;
    }

    public void giveInfo () {
        System.out.println("Предаставляю информацию по запрошенному конакту");
        System.out.println("Имя: " + this.name);
        System.out.println("Фамилия: " + this.surname);
        System.out.println("Номер телефона: " + this.phoneNum);
        System.out.println("Электронная почта: " + this.email);
        System.out.println("Адрес: " + this.address);
    }

    void changePhoneNum(String newPhoneNum) {
        this.phoneNum = newPhoneNum;}


}
