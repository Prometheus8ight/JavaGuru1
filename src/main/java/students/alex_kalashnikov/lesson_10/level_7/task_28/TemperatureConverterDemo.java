package students.alex_kalashnikov.lesson_10.level_7.task_28;

class TemperatureConverterDemo {

    public static void main(String[] args) {

        Strategy newStrategy = new Strategy(new Celsius());
        System.out.println(newStrategy.executeConvertToCelsius(100));
        System.out.println(newStrategy.executeConvertToKelvin(100));
        System.out.println(newStrategy.executeConvertToFahrenheit(100));

        newStrategy = new Strategy(new Kelvin());
        System.out.println(newStrategy.executeConvertToCelsius(100));
        System.out.println(newStrategy.executeConvertToKelvin(100));
        System.out.println(newStrategy.executeConvertToFahrenheit(100));

        newStrategy = new Strategy(new Fahrenheit());
        System.out.println(newStrategy.executeConvertToCelsius(100));
        System.out.println(newStrategy.executeConvertToKelvin(100));
        System.out.println(newStrategy.executeConvertToFahrenheit(100));

    }

}