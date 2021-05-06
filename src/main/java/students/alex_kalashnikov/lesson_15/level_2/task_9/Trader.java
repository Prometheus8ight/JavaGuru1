package students.alex_kalashnikov.lesson_15.level_2.task_9;

class Trader {

    private String nickname;
    private String fullName;
    private String city;

    public Trader(String nickname, String fullName, String city) {
        this.nickname = nickname;
        this.fullName = fullName;
        this.city = city;
    }

    public String getNickname() {
        return nickname;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

}