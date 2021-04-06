package students.alex_kalashnikov.lesson_10.level_7.task_25;

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

    @Override
    public String toString() {
        return "Trader{" +
                "Full name='" + fullName + '\'' +
                ", City='" + city + '\'' +
                ", Country='" + country + '\'' +
                '}';
    }

}