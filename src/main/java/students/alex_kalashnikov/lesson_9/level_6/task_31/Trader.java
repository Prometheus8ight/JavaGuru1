package students.alex_kalashnikov.lesson_9.level_6.task_31;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

}