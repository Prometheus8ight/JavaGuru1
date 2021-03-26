package students.vitaly_porsev.lesson_10.level_4.task_11;

class WeatherUtil {

    int turnCelsiusToFahrenheit(int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    int turnCelsiusToKelvin(int celsius) {
        return (int) (celsius + 273.15);
    }
}
