package students.darja_scavrovica.lesson_3.level_7.task_28;

class Winter2021 {
    String city;
    String snow;
    int temperature;


    Winter2021(String city,String snow,int temperature)
    {this.city = city;this.snow = snow;this.temperature= temperature;}


    public void voice() {
        System.out.println("city = "+ city);
        System.out.println("snow = "+ snow);
        System.out.println("temperature = "+ temperature);


    }

    String getCity() {return this.city;}
    String getSnow(){return this.snow; }
    int getTemperature(){return this.temperature;}
}
