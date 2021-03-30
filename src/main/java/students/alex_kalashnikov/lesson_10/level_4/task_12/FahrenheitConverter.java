package students.alex_kalashnikov.lesson_10.level_4.task_12;

import java.util.Optional;

public class FahrenheitConverter implements TemperatureConverter {

    @Override
    public Optional convert(double celsiusTemperature) {
        Optional<Double> nonEmptyOptional = Optional.of(1.8 * celsiusTemperature + 32.0);
        Optional<String> emptyOptional = Optional.of("No temperature below absolute zero!");
        if (celsiusTemperature >= -273.15) {
            return nonEmptyOptional;
        } else {
            return emptyOptional;
        }
    }

}