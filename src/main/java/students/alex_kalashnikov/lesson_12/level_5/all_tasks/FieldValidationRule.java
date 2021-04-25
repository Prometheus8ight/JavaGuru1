package students.alex_kalashnikov.lesson_12.level_5.all_tasks;

import java.util.List;

interface FieldValidationRule {

    void validate(Product product, List<ValidationException> arr) throws ValidationException;

}