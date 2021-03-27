package students.bogdans_pavlovs.lesson_9.level_6;

class Trader {

    private String fullName;
    private String country;
    private String city;


    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry(){
        return country;
    }


    @Override
    public String toString() {
        return "[Full Name = " + fullName + "], [Country = " + country + "], [City = " + city + "]";
    }
}

