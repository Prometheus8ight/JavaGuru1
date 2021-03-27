package students.bogdans_pavlovs.lesson_9.level_6;

class Trader {

    private String fullName;
    private String city;


    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString() {
        return "[Full Name = " + fullName + "], [City = " + city + "]";
    }
}

