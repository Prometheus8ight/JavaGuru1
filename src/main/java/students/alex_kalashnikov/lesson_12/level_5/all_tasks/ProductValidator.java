package students.alex_kalashnikov.lesson_12.level_5.all_tasks;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);

}